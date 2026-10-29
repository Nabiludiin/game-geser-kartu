# perbaiki.md
INI YANG HARUS DIPERBAIKI
## Koreksi dari saya

Sebelumnya saya bilang perintah `jadx -d JavaSource com.nabil.apk` ada di `README.md`. Itu **salah**:
Tidak ada perintah `jadx -d JavaSource com.nabil.apk`

Selain itu, `README.md` Sudah benar dan harus dijalankan

## 1. Kode dari jadx di dalam kode sumber hanya komentar yang gaperlu dipikirkan karena itu salah ketik Jika muncul Hapus saja kode komentar itu

jadx menyisipkan komentar ke setiap file yang dihasilkannya. Komentar ini tidak pernah ditulis manusia. Hapus komentar ini!

| File | Baris | Isi |
| :--- | :--- | :--- |
| `JavaSource/sources/com/nabil/activities/HomeActivity.java` | 26 | `/* loaded from: classes.dex */` |
| `JavaSource/sources/com/nabil/activities/HomeActivity.java` | 25 | `/* compiled from: MyApplication */` |
| `JavaSource/sources/com/nabil/activities/OptionActivity.java` | 712 | `/* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */` |
| `JavaSource/sources/t1/a.java` | 354 | `/* JADX WARN: Code restructure failed: missing block: B:36:0x011d, code lost:` |

Ada **993 file** di `JavaSource/sources/` yang berisi komentar `JADX WARN` atau sejenisnya.
"loaded from: classes.dex" berarti kodenya dibaca dari file `classes.dex` di dalam APK, bukan dari kode yang ditulis.

Cara memeriksanya sendiri:

```powershell
Select-String -Path "JavaSource\sources\com\nabil\activities\HomeActivity.java" -Pattern "loaded from"
```

## 2. Kutipan dari `README.md` (versi sekarang)

| Baris | Isi |
| :--- | :--- |
| 12 | "Alur game (disimpulkan dari kode dan teks)" |
| 53 | "(belum saya telusuri pemicunya)" |
| 78 | "Arti tahun 3000 belum saya telusuri." |
| 82 | "tapi itu belum saya buktikan." |
| 101 | "package `t1` yang namanya diacak" |
| 107 | "library pihak ketiga yang diobfuskasi" |
| 113 | "Nama class dan field di luar `com/nabil` diacak" |

## 3. Kesimpulan

Folder ini berisi kode yang **dibaca kembali dari APK** (`classes.dex`) oleh jadx, bukan kode sumber yang ditulis langsung. Kode ini tidak perlu dianggep. Jadi ini hapus saja.
