## Tentang game

| | |
| :--- | :--- |
| Nama | Geser |
| Author | Nabil |
| Package | `com.nabil` |
| Versi | 2.2.3 |
| Jenis | Aplikasi Android native (Java/Kotlin). **Bukan Unity.** Hanya ada satu `classes.dex`, tanpa library native |
| Genre | Game cerita berbasis kartu geser (swipe kiri/kanan) |

### Alur game (disimpulkan dari kode dan teks)
- Pemain menggeser kartu ke kiri atau kanan untuk memilih jawaban. `StoryActivity` memanggil `h0(0)` untuk
  geser kanan dan `h0(1)` untuk geser kiri.
- Dari teks cerita, pemain berperan sebagai **Presiden** (contoh: "Mr. President, a package arrived for you.
  The sender is a... Nabil."). Ada penasihat dan tokoh lain yang membawa kartu (47 karakter, antara
  lain Vice President Prabowo, Rose, General TeddyBear, Researcher Kumiyo, Papa Laetonius).
- Ada empat indikator/stat (`circle_0` sampai `circle_3`) berskala 0 sampai 100. Setiap kartu membawa dua
  larik dampak `int[2][4]` (satu per arah geser, satu angka per stat), misalnya `{0, 15, 0, -10}` dan
  `{0, -10, 0, 0}` pada kartu 22. Dampak itu dijumlahkan ke stat (`t1/a.java`, method `V`).
- **Kalah:** kalau satu stat melewati 100 atau turun ke 0 atau kurang, pemain mati (`E0`). Kode kematian
  membawa nomor stat penyebabnya, dan arahnya (terlalu tinggi atau terlalu rendah) dibedakan.
- **Item (efek id 1 sampai 11):** item yang dimiliki menyelamatkan pemain dari kematian tertentu. Saat stat
  menembus batas, `V` memeriksa efek yang dimiliki. Kalau cocok, kematian diganti kartu penyelamat
  (`undeath_*`, method `x()`) berisi pilihan ya/tidak yang memberi +30 (atau -25) ke stat bermasalah.
  Efek yang terbaca di kode:

  | Efek | Menyelamatkan dari | Kartu |
  | :--- | :--- | :--- |
  | 7 (fox) | stat 1 tinggi, stat 2 rendah, stat 3 tinggi, stat 4 tinggi | `undeath_1`, `_3`, `_5`, `_9` |
  | 2 (antiradiation) | stat 1 rendah | `undeath_2` |
  | 4 | stat 2 rendah | `undeath_4` |
  | 6 (church) | stat 2 rendah | `undeath_7` |
  | 1 (radar) | stat 3 rendah | `undeath_6` |
  | 5 (euro) | stat 4 rendah | `undeath_8` |

  Efek 8, 9, dan 11 (virus, cobra, war) justru merugikan: mengurangi 5 poin per geseran pada stat 1, 2,
  dan 3. Efek 8 (virus) juga membuat kematian stat 1 yang rendah menjadi kode 5 (wabah). Efek 10 (oracle)
  membuat indikator merah/hijau menunjukkan arah dampak. Efek 3 (time) dipasang oleh kartu tahun khusus
  (lihat bawah).
- **Arti keempat stat** (disimpulkan dari teks kematian `pre_death_*`/`death_*`; game tidak menyebut namanya
  di kode yang saya baca):

  | Stat | Terlalu rendah (kode `-n`) | Terlalu tinggi (kode `n`) |
  | :--- | :--- | :--- |
  | 1 — kesehatan / radiasi | Radioaktivitas melonjak, rakyat dan Presiden bermutasi lalu mati | Negara bersih, tapi Menteri Kesehatan mengklaim jasa dan Presiden dicopot lalu mati karena penyakit tak dikenal |
  | 2 — kepuasan rakyat | Pemberontakan, Presiden ditangkap dan dieksekusi | Rakyat memuja Presiden, tetapi ia mati karena penyakit tak dikenal |
  | 3 — militer | Negara tetangga menyerang, pemerintah jatuh | Jenderal terlalu kuat dan melakukan kudeta, Presiden dipenjara |
  | 4 — ekonomi | Negara miskin dan terlilit utang luar negeri | Bank terlalu berkuasa dan memimpin pemberontakan, Presiden diasingkan |

  Kematian lain: `death_5` (wabah virus), `death_43` (wabah dari uji senjata biologis), `death_184`
  (kediaman dikepung pemberontak), `death_212` (sakit parah), dan `death_254` (layar menggelap). Empat
  yang terakhir kemungkinan dipicu kartu cerita tertentu, bukan oleh stat (belum saya telusuri pemicunya).
- **Menjabat:** layar menampilkan lama menjabat dalam hari. Pencapaian dibuka di 730, 1.095, dan 1.460 hari
  (kira-kira 2, 3, dan 4 tahun, `W()`). Jumlah kematian disimpan di `TOTAL_DEATH`.
- Kartu bertanda khusus (`sp_quest_*`, `m(true)`) muncul pada kondisi tertentu dan dipakai untuk adegan cerita.
  Kondisi pemicunya belum saya telusuri.
- Ada mode "geser" dengan warna latar dan musik berbeda (`evil_chanting_bgm`, `geser_sound`).
- Ada item bergambar: radar, antiradiation, time, lover, euro, church, fox, virus, cobra, oracle, war.
  Kartu item dibeli lewat in-app purchase (`item_1x1` sampai `item_3x3`) dan "ads_free_version".
- Ada event bernomor (mis. event 1 "Message from the future", event 10 "Special guests") dan goal/pencapaian
  (72 string `goal_*`, contoh "Queen of the South").
- Layanan: AdMob (iklan hadiah), Google Play Billing, Google Play Games (papan skor dan pencapaian),
  Firebase.

### Cara game memilih kartu (`t1/a.java`)
- **Kumpulan kartu (`C()`):** sekitar 100 kartu biasa dimasukkan ke daftar. `p()` mengambil satu secara
  acak lalu menghapusnya dari daftar. Kalau daftar habis, `C()` mengisinya lagi. Jadi dalam satu putaran
  tidak ada kartu yang berulang.
- **Bergantung jumlah kematian (`TOTAL_DEATH`):** kartu 377 masuk kalau jumlah kematian genap atau lebih dari
  15, kartu 365 kalau ganjil atau lebih dari 15, dan kartu 376 masuk 1 kali kalau kematian lebih dari 1, 2
  kali kalau lebih dari 5, dan 3 kali kalau lebih dari 15. Ketiganya kartu karakter 24 bertanda khusus. Di
  `StoryActivity`, kartu 376 membuat game memuat iklan hadiah (rewarded ad).
- **Tahun khusus:** game memakai kalender tahun dalam cerita. Daftar `MySpecialYears` berisi 2078, 2082,
  2083, 2085, 2119, 2150, dan 3000. Saat tahun berjalan masuk daftar, `n0(tahun)` menyisipkan kartu cerita
  khusus (2078 dan 2079: kartu pembuka "phone matrix"; 2082, 2119, dan 2150: adegan yang mengaktifkan mode
  "geser" dan efek time; 2083: kartu "Nabil" tentang versi tanpa iklan, hanya untuk pemain non-premium;
  2085: kartu "Nabil" yang meminta ulasan game). Arti tahun 3000 belum saya telusuri.
- **Mode geser:** diaktifkan oleh kartu tahun khusus (flag `f26300f` dan `f26308j`). Di `StoryActivity`,
  mode ini mengganti warna latar dan musik (`evil_chanting_bgm`, `geser_sound`). Dugaan saya mode ini
  adalah potongan perjalanan waktu, karena ada kartu "Message from the future" dan karakter "The Time",
  tapi itu belum saya buktikan.
- **Bendera cerita (`r()`):** puluhan flag di `SharedPref` melacak cabang cerita, antara lain `ALIEN_RESEARCH`,
  `TIME_TRAVEL_RESEARCH`, `VIRUS_STAGE`, `GOVERNOR_UNMASKED`, `PRESIDENT_REVEALED`, `LEADER_*`, `PROJECT_FOUND`,
  `KILLED_BY_CAKE`, dan `STORY_PROGRESS`. Karakter yang sudah ditemui disimpan di `CHAR_1` sampai `CHAR_25`.
- **Kartu teh:** kartu 413 muncul dengan lima varian acak (`TEA_1` sampai `TEA_5`). Mengumpulkan kelima-limanya
  membuka satu pencapaian.
- **Pencapaian:** ada ID Google Play Games untuk bertahan 730, 1.095, dan 1.460 hari, kematian ke-100, kematian
  pertama, kelima kartu teh, dan lainnya.

## Isi folder

| Folder | Isi |
| :--- | :--- |
| `JavaSource/sources/` | 9.740 file Java |
| `JavaSource/resources/` | `AndroidManifest.xml`, `res/` (layout, string, drawable), `res/raw/` (28 file audio), `assets/` (font) |

### Peta kode
- **Kode game sendiri** (14 file) ada di `com/nabil/`: `activities/` (`HomeActivity`,
  `StartActivity`, `StoryActivity`, `OptionActivity`), `swipedeck/SwipeDeck`, `utilities/` (`MusicService`, dll).
- **Mesin cerita** ada di package `t1` yang namanya diacak. `t1/a.java` (sekitar 380 KB) adalah yang terbesar dan
  dipakai `StoryActivity` sebagai status permainan (`t1.a`): daftar kartu dibuat langsung di kode
  (`new g(id, karakter, teks, gambar, pilihan_kiri, pilihan_kanan, dampak)`), plus penyimpanan di
  `SharedPref` (`TOTAL_DEATH`, `MyEffects`, `MyGoals`). `t1/g.java` adalah model satu kartu itu.
- **Teks cerita** ada di `JavaSource/resources/res/values/strings.xml`: 2.054 string, termasuk sekitar 1.000
  string `sp_quest_*` (isi kartu dan pilihan kiri/kanan `_l`/`_r`), 47 `character_*`, 72 `goal_*`, 20 `event_*`.
- **Package acak lain** (`a`, `b3`, `c2`, dan seterusnya) hampir pasti library pihak ketiga yang diobfuskasi.


## Catatan
- Hanya APK utama yang. File `config.*.apk` (bahasa dan resolusi) hanya berisi resource, jadi
  terjemahan bahasa selain bawaan tidak termasuk di sini.
- Nama class dan field di luar `com/nabil` diacak, jadi `t1/a.java` perlu dibaca dengan melihat pemakaiannya.
- Penjelasan mekanik di atas berasal dari membaca `StoryActivity` dan bagian `t1/a.java` berikut: konstruktor,
  `C()`, `V`, `W`, `k`, `n0`, `o`, `p`, `r`, `v`, `x`, dan `y`. Method `t(int)` (baris sekitar 2.004 sampai
  4.830, hampir separuh file). Method itu kemungkinan besar berisi cabang cerita khusus
  berdasarkan flag, jadi syarat tiap ending cerita, isi mode "geser", dan arti tahun 3000 masih belum tercakup.
- Belum diuji dijalankan atau dimodifikasi.
- Buatkan file build.gradle, settings.gradle beserta isinya
- dan Buatkan folder app/src/main

## Cara mencari
Jangan baca file besar langsung. Gunakan:

```powershell
python tools/unity_re_hub.py search-source "Game_Geser_Alur_Cerita" "kata kunci" --scope java --limit 30
```