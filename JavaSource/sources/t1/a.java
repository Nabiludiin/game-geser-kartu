package t1;

import android.app.Activity;
import android.app.backup.BackupManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import com.nabil.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import f.j;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;
import l3.k;
import z3.a;

/* compiled from: MyApplication */
public class a {
    private boolean A;
    private boolean A0;
    private boolean B;
    private boolean B0;
    private boolean C;
    private int C0;
    private int D;
    private int D0;
    private boolean E;
    private Activity E0;
    private boolean F;
    private i F0;
    private boolean G;
    private ArrayList G0;
    private boolean H;
    private g H0;
    private boolean I;
    private boolean J;
    private SharedPreferences J0;
    private boolean K;
    private SharedPreferences.Editor K0;
    private boolean L;
    private BackupManager L0;
    private boolean M;
    private ArrayList M0;
    private boolean N;
    private boolean N0;
    private boolean O;
    private boolean O0;
    private boolean P;
    private boolean P0;
    private boolean Q;
    private boolean Q0;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int X;
    private int Y;
    private boolean Z;

    /* renamed from: a, reason: collision with root package name */
    private l3.f f26290a;

    /* renamed from: a0, reason: collision with root package name */
    private int f26291a0;

    /* renamed from: b, reason: collision with root package name */
    MediaPlayer f26292b;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f26293b0;

    /* renamed from: c, reason: collision with root package name */
    h f26294c;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f26295c0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f26296d;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f26297d0;

    /* renamed from: e, reason: collision with root package name */
    private int f26298e;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f26299e0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f26300f;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f26301f0;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f26302g;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f26303g0;

    /* renamed from: h, reason: collision with root package name */
    private boolean f26304h;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f26305h0;

    /* renamed from: i, reason: collision with root package name */
    private int f26306i;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f26307i0;

    /* renamed from: j, reason: collision with root package name */
    private boolean f26308j;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f26309j0;

    /* renamed from: k, reason: collision with root package name */
    private ArrayList f26310k;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f26311k0;

    /* renamed from: l, reason: collision with root package name */
    private int f26312l;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f26313l0;

    /* renamed from: m, reason: collision with root package name */
    private int f26314m;

    /* renamed from: m0, reason: collision with root package name */
    private int f26315m0;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f26317n0;

    /* renamed from: o, reason: collision with root package name */
    private boolean f26318o;

    /* renamed from: o0, reason: collision with root package name */
    private boolean f26319o0;

    /* renamed from: p, reason: collision with root package name */
    private boolean f26320p;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f26321p0;

    /* renamed from: q, reason: collision with root package name */
    private boolean f26322q;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f26323q0;

    /* renamed from: r, reason: collision with root package name */
    private boolean f26324r;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f26325r0;

    /* renamed from: s, reason: collision with root package name */
    private boolean f26326s;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f26327s0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f26328t;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f26329t0;

    /* renamed from: u, reason: collision with root package name */
    private boolean f26330u;

    /* renamed from: u0, reason: collision with root package name */
    private boolean f26331u0;

    /* renamed from: v, reason: collision with root package name */
    private boolean f26332v;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f26333v0;

    /* renamed from: w, reason: collision with root package name */
    private boolean f26334w;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f26335w0;

    /* renamed from: x, reason: collision with root package name */
    private boolean f26336x;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f26337x0;

    /* renamed from: y, reason: collision with root package name */
    private int f26338y;

    /* renamed from: y0, reason: collision with root package name */
    private boolean f26339y0;

    /* renamed from: z, reason: collision with root package name */
    private boolean f26340z;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f26341z0;

    /* renamed from: n, reason: collision with root package name */
    private boolean[] f26316n = new boolean[26];
    private int[] I0 = {50, 50, 50, 50};

    /* compiled from: MyApplication */
    /* renamed from: t1.a$a, reason: collision with other inner class name */
    class C0134a implements MediaPlayer.OnCompletionListener {
        C0134a() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.stop();
            mediaPlayer.reset();
            mediaPlayer.release();
        }
    }

    /* compiled from: MyApplication */
    class b implements k {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26343a;

        b(String str) {
            this.f26343a = str;
        }

        @Override // l3.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(a.InterfaceC0159a interfaceC0159a) {
            if (interfaceC0159a.x0().N0() == 0) {
                System.out.println("UnlockAchievement");
                a aVar = a.this;
                aVar.K0 = aVar.J0.edit();
                a.this.K0.putBoolean(this.f26343a, true);
                a.this.K0.apply();
            }
        }
    }

    public a(Activity activity) {
        this.E0 = activity;
        this.J0 = activity.getSharedPreferences("SharedPref", 0);
        this.F0 = new i(activity);
        this.L0 = new BackupManager(activity);
        this.f26296d = this.J0.getBoolean("FIRST_INTRO_FINISHED", false) || this.J0.getBoolean("SECOND_INTRO_FINISHED", false);
        this.f26298e = this.J0.getInt("TOTAL_DEATH", 0);
        this.M0 = this.F0.c("MyEffects", f.class);
        this.G0 = new ArrayList();
        this.Q0 = this.J0.getBoolean("COMMODORE_ASSEMBLE", false);
        if (this.M0.contains(new f(3, -1))) {
            P(2, new f(3, -1));
        }
        this.f26294c = new h(activity);
        this.f26310k = this.F0.c("MyGoals", c.class);
        U();
        this.f26304h = false;
        this.f26306i = 0;
        this.B0 = false;
        this.C0 = 0;
        this.H0 = null;
        this.f26308j = false;
        this.D0 = 0;
        this.f26300f = false;
        this.N0 = false;
        this.O0 = false;
        this.P0 = false;
        r();
        C();
        B();
    }

    private String O(int i7, int i8) {
        String str;
        int i9 = i7 / 365;
        int i10 = i7 - (i9 * 365);
        if (i7 == 0) {
            return this.E0.getString(R.string.no_record);
        }
        if (i9 == 0) {
            str = "";
        } else if (i9 == 1) {
            str = i9 + " " + this.E0.getString(R.string.year) + " ";
        } else {
            str = i9 + " " + this.E0.getString(R.string.years) + " ";
        }
        return this.E0.getString(R.string.in_power) + "\n" + str + i10 + " " + this.E0.getString(R.string.days) + " (" + this.E0.getString(R.string.year_big) + " " + i8 + ")";
    }

    private void Q() {
        this.E0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("ini punya nabiludin, masih placeholdeer, jika butuh di perbaiki kasih tau saya butuh dimasukin apa")));
    }

    private void d() {
        g gVar = new g(700, R.string.creator, R.string.sp_quest_book_01, R.drawable.creator, R.string.yes, R.string.no, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        gVar.m(true);
        this.G0.add(gVar);
        this.G0.add(gVar);
        this.G0.add(gVar);
    }

    public void A() {
        this.f26310k.add(new c(1, this.E0.getResources().getString(R.string.goal_1), this.E0.getResources().getString(R.string.goal_1_sub), this.E0.getResources().getString(R.string.goal_1_tip)));
        h0(1);
        this.f26310k.add(new c(10, this.E0.getResources().getString(R.string.goal_10), this.E0.getResources().getString(R.string.goal_10_sub), this.E0.getResources().getString(R.string.goal_10_tip)));
        h0(10);
        this.f26310k.add(new c(190, this.E0.getResources().getString(R.string.goal_190), this.E0.getResources().getString(R.string.goal_190_sub), this.E0.getResources().getString(R.string.goal_190_tip)));
        this.f26310k.add(new c(18, this.E0.getResources().getString(R.string.goal_18), this.E0.getResources().getString(R.string.goal_18_sub), this.E0.getResources().getString(R.string.goal_18_tip)));
        this.f26310k.add(new c(32, this.E0.getResources().getString(R.string.goal_32), this.E0.getResources().getString(R.string.goal_32_sub), this.E0.getResources().getString(R.string.goal_32_tip)));
        this.f26310k.add(new c(36, this.E0.getResources().getString(R.string.goal_36), this.E0.getResources().getString(R.string.goal_36_sub), this.E0.getResources().getString(R.string.goal_36_tip)));
        this.f26310k.add(new c(277, this.E0.getResources().getString(R.string.goal_277), this.E0.getResources().getString(R.string.goal_277_sub), this.E0.getResources().getString(R.string.goal_277_tip)));
        this.f26310k.add(new c(323, this.E0.getResources().getString(R.string.goal_323), this.E0.getResources().getString(R.string.goal_323_sub), this.E0.getResources().getString(R.string.goal_323_tip)));
        h0(323);
        this.f26310k.add(new c(336, this.E0.getResources().getString(R.string.goal_336), this.E0.getResources().getString(R.string.goal_336_sub), this.E0.getResources().getString(R.string.goal_336_tip)));
        this.f26310k.add(new c(361, this.E0.getResources().getString(R.string.goal_361), this.E0.getResources().getString(R.string.goal_361_sub), this.E0.getResources().getString(R.string.goal_361_tip)));
        this.f26310k.add(new c(214, this.E0.getResources().getString(R.string.goal_214), this.E0.getResources().getString(R.string.goal_214_sub), this.E0.getResources().getString(R.string.empty_string)));
        this.f26310k.add(new c(235, this.E0.getResources().getString(R.string.goal_235), this.E0.getResources().getString(R.string.goal_235_sub), this.E0.getResources().getString(R.string.empty_string)));
        this.f26310k.add(new c(146, this.E0.getResources().getString(R.string.goal_146), this.E0.getResources().getString(R.string.goal_146_sub), this.E0.getResources().getString(R.string.goal_146_tip)));
        this.f26310k.add(new c(192, this.E0.getResources().getString(R.string.goal_192), this.E0.getResources().getString(R.string.goal_192_sub), this.E0.getResources().getString(R.string.goal_192_tip)));
        this.f26310k.add(new c(240, this.E0.getResources().getString(R.string.goal_240), this.E0.getResources().getString(R.string.goal_240_sub), this.E0.getResources().getString(R.string.empty_string)));
        this.f26310k.add(new c(264, this.E0.getResources().getString(R.string.goal_264), this.E0.getResources().getString(R.string.goal_264_sub), this.E0.getResources().getString(R.string.goal_264_tip)));
        this.f26310k.add(new c(270, this.E0.getResources().getString(R.string.goal_270), this.E0.getResources().getString(R.string.goal_270_sub), this.E0.getResources().getString(R.string.goal_270_tip)));
        this.f26310k.add(new c(78, this.E0.getResources().getString(R.string.goal_78), this.E0.getResources().getString(R.string.goal_78_sub), this.E0.getResources().getString(R.string.goal_78_tip)));
        this.f26310k.add(new c(91, this.E0.getResources().getString(R.string.goal_91), this.E0.getResources().getString(R.string.goal_91_sub), this.E0.getResources().getString(R.string.goal_91_tip)));
        this.f26310k.add(new c(93, this.E0.getResources().getString(R.string.goal_93), this.E0.getResources().getString(R.string.goal_93_sub), this.E0.getResources().getString(R.string.goal_93_tip)));
        this.f26310k.add(new c(119, this.E0.getResources().getString(R.string.goal_119), this.E0.getResources().getString(R.string.goal_119_sub), this.E0.getResources().getString(R.string.goal_119_tip)));
        this.f26310k.add(new c(136, this.E0.getResources().getString(R.string.goal_136), this.E0.getResources().getString(R.string.goal_136_sub), this.E0.getResources().getString(R.string.goal_136_tip)));
        this.f26310k.add(new c(142, this.E0.getResources().getString(R.string.goal_142), this.E0.getResources().getString(R.string.goal_142_sub), this.E0.getResources().getString(R.string.goal_142_tip)));
        this.f26310k.add(new c(168, this.E0.getResources().getString(R.string.goal_168), this.E0.getResources().getString(R.string.goal_168_sub), this.E0.getResources().getString(R.string.empty_string)));
        this.f26310k.add(new c(177, this.E0.getResources().getString(R.string.goal_177), this.E0.getResources().getString(R.string.goal_177_sub), this.E0.getResources().getString(R.string.empty_string)));
        this.f26310k.add(new c(183, this.E0.getResources().getString(R.string.goal_183), this.E0.getResources().getString(R.string.goal_183_sub), this.E0.getResources().getString(R.string.empty_string)));
        this.F0.e("MyGoals", this.f26310k);
    }
    
        if (((r26.X > 0) ^ r26.f26293b0) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0133, code lost:
    
        f(406);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013c, code lost:
    
        if (r26.f26298e <= 30) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x013e, code lost:
    
        f(406);
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0131, code lost:
    
        if (r26.f26313l0 == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B() {
        /*
            Method dump skipped, instructions count: 2534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.a.B():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v267 */
    /* JADX WARN: Type inference failed for: r3v268, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v271 */
    public void C() {
        ?? r32;
        this.G0.clear();
        this.G0.add(new g(180, R.string.character_7, R.string.quest_180, R.drawable.character_07, R.string.quest_180_l, R.string.quest_180_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}));
        this.G0.add(new g(179, R.string.character_24, R.string.quest_179, R.drawable.character_24, R.string.quest_179_l, R.string.quest_179_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}));
        this.G0.add(new g(178, R.string.character_24, R.string.quest_178, R.drawable.character_24, R.string.quest_178_l, R.string.quest_178_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}));
        this.G0.add(new g(175, R.string.character_24, R.string.quest_175, R.drawable.character_24, R.string.quest_175_l, R.string.quest_175_r, new int[][]{new int[]{10, 10, 0, -10}, new int[]{0, -5, 0, 0}}));
        this.G0.add(new g(172, R.string.character_24, R.string.quest_172, R.drawable.character_24, R.string.quest_172_l, R.string.quest_172_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}));
        this.G0.add(new g(193, R.string.character_5, R.string.quest_193, R.drawable.character_05, R.string.quest_193_l, R.string.quest_193_r, new int[][]{new int[]{15, 15, 0, -15}, new int[]{-10, -20, 0, 5}}));
        this.G0.add(new g(191, R.string.character_2, R.string.quest_191, R.drawable.character_02, R.string.quest_191_l, R.string.quest_191_r, new int[][]{new int[]{0, 15, -15, 0}, new int[]{0, -20, 0, 0}}));
        this.G0.add(new g(190, R.string.character_5, R.string.quest_190, R.drawable.character_05, R.string.quest_190_l, R.string.quest_190_r, new int[][]{new int[]{15, 10, 0, -15}, new int[]{-15, -15, 0, 0}}));
        this.G0.add(new g(189, R.string.character_6, R.string.quest_189, R.drawable.character_06, R.string.quest_189_l, R.string.quest_189_r, new int[][]{new int[]{0, -20, 0, -10}, new int[]{0, 0, 0, -20}}));
        this.G0.add(new g(188, R.string.character_3, R.string.quest_188, R.drawable.character_03, R.string.quest_188_l, R.string.quest_188_r, new int[][]{new int[]{0, -20, -10, 0}, new int[]{0, 0, -10, -20}}));
        this.G0.add(new g(187, R.string.character_3, R.string.quest_187, R.drawable.character_03, R.string.quest_187_l, R.string.quest_187_r, new int[][]{new int[]{0, 15, 0, -10}, new int[]{-5, -15, 0, 5}}));
        this.G0.add(new g(186, R.string.character_6, R.string.quest_186, R.drawable.character_06, R.string.quest_186_l, R.string.quest_186_r, new int[][]{new int[]{0, 0, 0, -5}, new int[]{0, -5, 0, 0}}));
        this.G0.add(new g(166, R.string.character_3, R.string.quest_166, R.drawable.character_03, R.string.quest_166_l, R.string.quest_166_r, new int[][]{new int[]{-10, -10, -10, 0}, new int[]{0, -20, 0, 0}}));
        this.G0.add(new g(165, R.string.character_3, R.string.quest_165, R.drawable.character_03, R.string.quest_165_l, R.string.quest_165_r, new int[][]{new int[]{0, 15, -15, -10}, new int[]{0, -20, 15, 0}}));
        this.G0.add(new g(164, R.string.character_22, R.string.quest_164, R.drawable.character_22, R.string.quest_164_l, R.string.quest_164_r, new int[][]{new int[]{-10, 0, 0, 10}, new int[]{10, 0, 0, -15}}));
        this.G0.add(new g(163, R.string.character_3, R.string.quest_163, R.drawable.character_03, R.string.quest_163_l, R.string.quest_163_r, new int[][]{new int[]{0, 10, 15, -10}, new int[]{0, 0, -15, 5}}));
        this.G0.add(new g(162, R.string.character_1, R.string.quest_162, R.drawable.character_01, R.string.quest_162_l, R.string.quest_162_r, new int[][]{new int[]{-15, 0, 0, 15}, new int[]{10, 10, 0, -10}}));
        this.G0.add(new g(161, R.string.character_5, R.string.quest_161, R.drawable.character_05, R.string.quest_161_l, R.string.quest_161_r, new int[][]{new int[]{15, 15, -10, -15}, new int[]{-20, -15, 0, 15}}));
        this.G0.add(new g(160, R.string.character_5, R.string.quest_160, R.drawable.character_05, R.string.quest_160_l, R.string.quest_160_r, new int[][]{new int[]{15, 0, -10, -10}, new int[]{-15, 10, 0, 0}}));
        this.G0.add(new g(159, R.string.character_5, R.string.quest_159, R.drawable.character_05, R.string.quest_159_l, R.string.quest_159_r, new int[][]{new int[]{15, 0, 0, -15}, new int[]{-15, 0, 0, 15}}));
        this.G0.add(new g(158, R.string.character_9, R.string.quest_158, R.drawable.character_09, R.string.quest_158_l, R.string.quest_158_r, new int[][]{new int[]{0, 15, -15, 0}, new int[]{0, -15, 10, -10}}));
        this.G0.add(new g(150, R.string.character_22, R.string.quest_150, R.drawable.character_22, R.string.quest_150_l, R.string.quest_150_r, new int[][]{new int[]{0, 5, 0, 0}, new int[]{0, -5, 0, 0}}));
        this.G0.add(new g(149, R.string.character_22, R.string.quest_149, R.drawable.character_22, R.string.quest_149_l, R.string.quest_149_r, new int[][]{new int[]{0, 5, 0, 0}, new int[]{0, 0, 5, 0}}));
        this.G0.add(new g(148, R.string.character_22, R.string.quest_148, R.drawable.character_22, R.string.quest_148_l, R.string.quest_148_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 5, 0}}));
        this.G0.add(new g(147, R.string.character_22, R.string.quest_147, R.drawable.character_22, R.string.quest_147_l, R.string.quest_147_r, new int[][]{new int[]{0, 0, 5, -5}, new int[]{0, 0, 0, 0}}));
        this.G0.add(new g(146, R.string.character_22, R.string.quest_146, R.drawable.character_22, R.string.quest_146_l, R.string.quest_146_r, new int[][]{new int[]{0, 5, 0, -5}, new int[]{0, -5, 0, 5}}));
        this.G0.add(new g(145, R.string.character_22, R.string.quest_145, R.drawable.character_22, R.string.quest_145_l, R.string.quest_145_r, new int[][]{new int[]{0, 5, 0, -5}, new int[]{0, 0, 0, 0}}));
        this.G0.add(new g(144, R.string.character_22, R.string.quest_144, R.drawable.character_22, R.string.quest_144_l, R.string.quest_144_r, new int[][]{new int[]{0, 5, 0, 0}, new int[]{0, 0, 5, 0}}));
        this.G0.add(new g(1, R.string.character_6, R.string.quest_1, R.drawable.character_06, R.string.quest_1_l, R.string.quest_1_r, new int[][]{new int[]{-20, -10, 0, 20}, new int[]{0, 10, 0, -15}}));
        this.G0.add(new g(2, R.string.character_1, R.string.quest_2, R.drawable.character_01, R.string.quest_2_l, R.string.quest_2_r, new int[][]{new int[]{0, -15, 0, 15}, new int[]{0, 10, 0, -10}}));
        this.G0.add(new g(3, R.string.character_2, R.string.quest_3, R.drawable.character_02, R.string.quest_3_l, R.string.quest_3_r, new int[][]{new int[]{0, 0, 15, -20}, new int[]{0, 0, -20, 15}}));
        this.G0.add(new g(4, R.string.character_6, R.string.quest_4, R.drawable.character_06, R.string.quest_4_l, R.string.quest_4_r, new int[][]{new int[]{-15, -31, 0, 20}, new int[]{0, 15, 0, -15}}));
        this.G0.add(new g(5, R.string.character_2, R.string.quest_5, R.drawable.character_02, R.string.quest_5_l, R.string.quest_5_r, new int[][]{new int[]{0, -15, -20, 0}, new int[]{0, 15, -15, 0}}));
        this.G0.add(new g(6, R.string.character_2, R.string.quest_6, R.drawable.character_02, R.string.quest_6_l, R.string.quest_6_r, new int[][]{new int[]{0, 0, 15, -15}, new int[]{0, 15, -15, 0}}));
        this.G0.add(new g(7, R.string.character_6, R.string.quest_7, R.drawable.character_06, R.string.quest_7_l, R.string.quest_7_r, new int[][]{new int[]{-31, -15, 0, 20}, new int[]{15, 10, 0, -15}}));
        this.G0.add(new g(8, R.string.character_10, R.string.quest_8, R.drawable.character_10, R.string.quest_8_l, R.string.quest_8_r, new int[][]{new int[]{0, 0, 15, -20}, new int[]{0, 0, -20, 10}}));
        this.G0.add(new g(9, R.string.character_10, R.string.quest_9, R.drawable.character_10, R.string.quest_9_l, R.string.quest_9_r, new int[][]{new int[]{0, 15, 0, -20}, new int[]{0, -15, -15, 10}}));
        this.G0.add(new g(10, R.string.character_2, R.string.quest_10, R.drawable.character_02, R.string.quest_10_l, R.string.quest_10_r, new int[][]{new int[]{-31, -15, 31, -15}, new int[]{0, 15, -15, 0}}));
        this.G0.add(new g(11, R.string.character_4, R.string.quest_11, R.drawable.character_04, R.string.quest_11_l, R.string.quest_11_r, new int[][]{new int[]{0, 0, 0, 10}, new int[]{0, -15, 0, 20}}));
        this.G0.add(new g(13, R.string.character_5, R.string.quest_13, R.drawable.character_05, R.string.quest_13_l, R.string.quest_13_r, new int[][]{new int[]{-10, 0, 0, -15}, new int[]{-15, -20, 0, 0}}));
        this.G0.add(new g(14, R.string.character_5, R.string.quest_14, R.drawable.character_05, R.string.quest_14_l, R.string.quest_14_r, new int[][]{new int[]{0, 15, -15, -20}, new int[]{-20, -20, 0, 0}}));
        this.G0.add(new g(15, R.string.character_10, R.string.quest_15, R.drawable.character_10, R.string.quest_15_l, R.string.quest_15_r, new int[][]{new int[]{-10, 15, -10, -15}, new int[]{0, -20, 0, 0}}));
        this.G0.add(new g(16, R.string.character_9, R.string.quest_16, R.drawable.character_09, R.string.quest_16_l, R.string.quest_16_r, new int[][]{new int[]{0, 0, -15, -15}, new int[]{0, 0, 0, 0}}));
        this.G0.add(new g(17, R.string.character_4, R.string.quest_17, R.drawable.character_04, R.string.quest_17_l, R.string.quest_17_r, new int[][]{new int[]{0, -10, -15, 0}, new int[]{0, 0, 0, -20}}));
        this.G0.add(new g(18, R.string.character_2, R.string.quest_18, R.drawable.character_02, R.string.quest_18_l, R.string.quest_18_r, new int[][]{new int[]{0, 0, 15, -20}, new int[]{0, 0, -15, 10}}));
        this.G0.add(new g(19, R.string.character_5, R.string.quest_19, R.drawable.character_05, R.string.quest_19_l, R.string.quest_19_r, new int[][]{new int[]{20, 15, -15, -15}, new int[]{-15, -31, 0, 0}}));
        this.G0.add(new g(20, R.string.character_6, R.string.quest_20, R.drawable.character_06, R.string.quest_20_l, R.string.quest_20_r, new int[][]{new int[]{10, 0, 10, -15}, new int[]{0, 0, 0, 10}}));
        this.G0.add(new g(21, R.string.character_6, R.string.quest_21, R.drawable.character_06, R.string.quest_21_l, R.string.quest_21_r, new int[][]{new int[]{20, 15, 0, -20}, new int[]{-10, -10, 0, 10}}));
        this.G0.add(new g(23, R.string.character_9, R.string.quest_23, R.drawable.character_09, R.string.quest_23_l, R.string.quest_23_r, new int[][]{new int[]{0, 0, 15, -15}, new int[]{0, 0, -10, 0}}));
        this.G0.add(new g(24, R.string.character_10, R.string.quest_24, R.drawable.character_10, R.string.quest_24_l, R.string.quest_24_r, new int[][]{new int[]{0, 15, -15, -15}, new int[]{0, -10, 0, 10}}));
        this.G0.add(new g(25, R.string.character_5, R.string.quest_25, R.drawable.character_05, R.string.quest_25_l, R.string.quest_25_r, new int[][]{new int[]{0, 15, -10, -15}, new int[]{-10, -15, 0, 0}}));
        this.G0.add(new g(31, R.string.character_3, R.string.quest_31, R.drawable.character_03, R.string.quest_31_l, R.string.quest_31_r, new int[][]{new int[]{0, 15, 0, -20}, new int[]{0, -31, 0, 0}}));
        this.G0.add(new g(32, R.string.character_3, R.string.quest_32, R.drawable.character_03, R.string.quest_32_l, R.string.quest_32_r, new int[][]{new int[]{0, 15, 0, -15}, new int[]{0, -20, 0, 10}}));
        this.G0.add(new g(33, R.string.character_3, R.string.quest_33, R.drawable.character_03, R.string.quest_33_l, R.string.quest_33_r, new int[][]{new int[]{0, 15, 0, -15}, new int[]{0, -20, 0, 10}}));
        this.G0.add(new g(34, R.string.character_3, R.string.quest_34, R.drawable.character_03, R.string.quest_34_l, R.string.quest_34_r, new int[][]{new int[]{0, 15, -15, -10}, new int[]{0, -15, 0, 0}}));
        this.G0.add(new g(35, R.string.character_3, R.string.quest_35, R.drawable.character_03, R.string.quest_35_l, R.string.quest_35_r, new int[][]{new int[]{0, 0, -10, -31}, new int[]{0, -31, -10, 0}}));
        this.G0.add(new g(36, R.string.character_3, R.string.quest_36, R.drawable.character_03, R.string.quest_36_l, R.string.quest_36_r, new int[][]{new int[]{0, 15, 15, -15}, new int[]{0, -15, 0, 0}}));
        this.G0.add(new g(37, R.string.character_3, R.string.quest_37, R.drawable.character_03, R.string.quest_37_l, R.string.quest_37_r, new int[][]{new int[]{15, 0, 0, -20}, new int[]{-31, -15, 0, 0}}));
        this.G0.add(new g(47, R.string.character_1, R.string.quest_47, R.drawable.character_01, R.string.quest_47_l, R.string.quest_47_r, new int[][]{new int[]{10, 10, 10, 10}, new int[]{0, 0, 0, 20}}));
        this.G0.add(new g(48, R.string.character_2, R.string.quest_48, R.drawable.character_02, R.string.quest_48_l, R.string.quest_48_r, new int[][]{new int[]{0, 10, -15, 0}, new int[]{0, -15, 10, 0}}));
        this.G0.add(new g(50, R.string.character_6, R.string.quest_50, R.drawable.character_06, R.string.quest_50_l, R.string.quest_50_r, new int[][]{new int[]{20, 0, 0, -15}, new int[]{0, 0, 0, 10}}));
        this.G0.add(new g(51, R.string.character_7, R.string.quest_51, R.drawable.character_07, R.string.quest_51_l, R.string.quest_51_r, new int[][]{new int[]{15, 15, 15, -15}, new int[]{0, -10, 0, 10}}));
        this.G0.add(new g(52, R.string.character_7, R.string.quest_52, R.drawable.character_07, R.string.quest_52_l, R.string.quest_52_r, new int[][]{new int[]{0, 15, 15, -15}, new int[]{0, -15, 0, 10}}));
        this.G0.add(new g(53, R.string.character_7, R.string.quest_53, R.drawable.character_07, R.string.quest_53_l, R.string.quest_53_r, new int[][]{new int[]{0, 10, 0, 10}, new int[]{0, -10, 10, 0}}));
        this.G0.add(new g(54, R.string.character_3, R.string.quest_54, R.drawable.character_03, R.string.quest_54_l, R.string.quest_54_r, new int[][]{new int[]{0, 15, 0, -15}, new int[]{0, -15, 0, 10}}));
        this.G0.add(new g(55, R.string.character_4, R.string.quest_55, R.drawable.character_04, R.string.quest_55_l, R.string.quest_55_r, new int[][]{new int[]{0, -15, 0, 20}, new int[]{0, 10, 0, -15}}));
        this.G0.add(new g(56, R.string.character_2, R.string.quest_56, R.drawable.character_02, R.string.quest_56_l, R.string.quest_56_r, new int[][]{new int[]{10, 10, 10, 0}, new int[]{-10, -15, -15, 0}}));
        this.G0.add(new g(89, R.string.character_5, R.string.quest_89, R.drawable.character_05, R.string.quest_89_l, R.string.quest_89_r, new int[][]{new int[]{-15, -31, 0, 0}, new int[]{0, -10, 0, -20}}));
        this.G0.add(new g(90, R.string.character_2, R.string.quest_90, R.drawable.character_02, R.string.quest_90_l, R.string.quest_90_r, new int[][]{new int[]{0, 15, -15, 0}, new int[]{0, -15, 15, 0}}));
        this.G0.add(new g(91, R.string.character_4, R.string.quest_91, R.drawable.character_04, R.string.quest_91_l, R.string.quest_91_r, new int[][]{new int[]{0, 0, -15, 20}, new int[]{0, 10, 0, -10}}));
        this.G0.add(new g(92, R.string.character_1, R.string.quest_92, R.drawable.character_01, R.string.quest_92_l, R.string.quest_92_r, new int[][]{new int[]{-31, -15, 0, 20}, new int[]{15, 0, 0, -10}}));
        this.G0.add(new g(93, R.string.character_6, R.string.quest_93, R.drawable.character_06, R.string.quest_93_l, R.string.quest_93_r, new int[][]{new int[]{15, 0, 0, -15}, new int[]{0, 10, 0, 0}}));
        this.G0.add(new g(94, R.string.character_9, R.string.quest_94, R.drawable.character_09, R.string.quest_94_l, R.string.quest_94_r, new int[][]{new int[]{0, 15, -15, -20}, new int[]{0, -31, 0, 10}}));
        this.G0.add(new g(95, R.string.character_9, R.string.quest_95, R.drawable.character_09, R.string.quest_95_l, R.string.quest_95_r, new int[][]{new int[]{0, 15, -15, -15}, new int[]{-15, -20, 0, 0}}));
        this.G0.add(new g(96, R.string.character_10, R.string.quest_96, R.drawable.character_10, R.string.quest_96_l, R.string.quest_96_r, new int[][]{new int[]{0, 0, -20, 15}, new int[]{0, -15, 15, 0}}));
        this.G0.add(new g(97, R.string.character_5, R.string.quest_97, R.drawable.character_05, R.string.quest_97_l, R.string.quest_97_r, new int[][]{new int[]{-31, 0, -15, -15}, new int[]{0, -31, -15, -15}}));
        this.G0.add(new g(98, R.string.character_6, R.string.quest_98, R.drawable.character_06, R.string.quest_98_l, R.string.quest_98_r, new int[][]{new int[]{15, 15, 0, 0}, new int[]{0, -15, 0, 20}}));
        this.G0.add(new g(99, R.string.character_1, R.string.quest_99, R.drawable.character_01, R.string.quest_99_l, R.string.quest_99_r, new int[][]{new int[]{-15, -15, 0, 20}, new int[]{15, 0, 0, -15}}));
        this.G0.add(new g(100, R.string.character_4, R.string.quest_100, R.drawable.character_04, R.string.quest_100_l, R.string.quest_100_r, new int[][]{new int[]{0, 0, -15, 15}, new int[]{0, 0, 10, -10}}));
        this.G0.add(new g(103, R.string.character_2, R.string.quest_103, R.drawable.character_02, R.string.quest_103_l, R.string.quest_103_r, new int[][]{new int[]{0, -31, 20, 0}, new int[]{0, 15, -15, 0}}));
        this.G0.add(new g(104, R.string.character_5, R.string.quest_104, R.drawable.character_05, R.string.quest_104_l, R.string.quest_104_r, new int[][]{new int[]{20, 15, 0, -20}, new int[]{-15, -15, 0, 0}}));
        this.G0.add(new g(105, R.string.character_6, R.string.quest_105, R.drawable.character_06, R.string.quest_105_l, R.string.quest_105_r, new int[][]{new int[]{0, 15, 15, -20}, new int[]{0, 0, -15, 10}}));
        this.G0.add(new g(106, R.string.character_2, R.string.quest_106, R.drawable.character_02, R.string.quest_106_l, R.string.quest_106_r, new int[][]{new int[]{0, 15, 15, -15}, new int[]{0, -20, -15, 10}}));
        this.G0.add(new g(107, R.string.character_3, R.string.quest_107, R.drawable.character_03, R.string.quest_107_l, R.string.quest_107_r, new int[][]{new int[]{0, 15, 0, -15}, new int[]{0, -20, 0, 10}}));
        this.G0.add(new g(108, R.string.character_2, R.string.quest_108, R.drawable.character_02, R.string.quest_108_l, R.string.quest_108_r, new int[][]{new int[]{0, 15, -15, -15}, new int[]{0, -10, 10, 0}}));
        this.G0.add(new g(109, R.string.character_3, R.string.quest_109, R.drawable.character_03, R.string.quest_109_l, R.string.quest_109_r, new int[][]{new int[]{0, 15, -10, -15}, new int[]{0, -15, 0, 15}}));
        this.G0.add(new g(androidx.constraintlayout.widget.h.C2, R.string.character_3, R.string.quest_110, R.drawable.character_03, R.string.quest_110_l, R.string.quest_110_r, new int[][]{new int[]{0, 15, -15, 0}, new int[]{0, 0, 15, -20}}));
        this.G0.add(new g(111, R.string.character_3, R.string.quest_111, R.drawable.character_03, R.string.quest_111_l, R.string.quest_111_r, new int[][]{new int[]{0, -15, -15, 0}, new int[]{0, 15, 15, -20}}));
        this.G0.add(new g(112, R.string.character_10, R.string.quest_112, R.drawable.character_10, R.string.quest_112_l, R.string.quest_112_r, new int[][]{new int[]{15, 15, 0, -15}, new int[]{0, -20, 0, 10}}));
        this.G0.add(new g(113, R.string.character_10, R.string.quest_113, R.drawable.character_10, R.string.quest_113_l, R.string.quest_113_r, new int[][]{new int[]{0, 0, 0, 20}, new int[]{10, 10, 10, 0}}));
        this.G0.add(new g(114, R.string.character_6, R.string.quest_114, R.drawable.character_06, R.string.quest_114_l, R.string.quest_114_r, new int[][]{new int[]{10, 10, 10, 0}, new int[]{0, 0, 0, 20}}));
        this.G0.add(new g(115, R.string.character_6, R.string.quest_115, R.drawable.character_06, R.string.quest_115_l, R.string.quest_115_r, new int[][]{new int[]{15, 0, -15, 15}, new int[]{0, 0, 15, -20}}));
        int i7 = this.f26298e;
        if (i7 % 2 == 0 || i7 > 15) {
            g gVar = new g(377, R.string.character_24, R.string.sp_quest_377, R.drawable.character_24, R.string.sp_quest_377_l, R.string.sp_quest_377_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
            gVar.m(true);
            this.G0.add(gVar);
        }
        int i8 = this.f26298e;
        if (i8 % 2 != 0 || i8 > 15) {
            r32 = 1;
            g gVar2 = new g(365, R.string.character_24, R.string.sp_quest_365, R.drawable.character_24, R.string.sp_quest_365_l, R.string.sp_quest_365_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
            gVar2.m(true);
            this.G0.add(gVar2);
        } else {
            r32 = 1;
        }
        if (this.f26298e > r32) {
            int[][] iArr = new int[2][];
            iArr[0] = new int[]{0, 0, 0, 0};
            iArr[r32] = new int[]{0, 0, 0, 0};
            g gVar3 = new g(376, R.string.character_24, R.string.sp_quest_376, R.drawable.character_24, R.string.sp_quest_376_l, R.string.sp_quest_376_r, iArr);
            gVar3.m(r32);
            this.G0.add(gVar3);
            if (this.f26298e > 5) {
                this.G0.add(gVar3);
            }
            if (this.f26298e > 15) {
                this.G0.add(gVar3);
            }
        }
        g gVar4 = new g(382, R.string.character_6, R.string.sp_quest_382, R.drawable.character_06, R.string.sp_quest_382_l, R.string.sp_quest_382_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, -15, 0, 0}});
        gVar4.m(true);
        this.G0.add(gVar4);
        g gVar5 = new g(385, R.string.character_3, R.string.sp_quest_385, R.drawable.character_03, R.string.sp_quest_385_l, R.string.sp_quest_385_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, -15, 0, 10}});
        gVar5.m(true);
        this.G0.add(gVar5);
    }

    public boolean D() {
        return this.O0;
    }

    public boolean E() {
        return this.N0;
    }

    public boolean F(int i7) {
        return this.M0.contains(new f(i7, -1));
    }

    public boolean G() {
        return this.f26308j;
    }

    public boolean H() {
        return this.f26296d;
    }

    public boolean I(int i7) {
        ArrayList arrayList = this.f26310k;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            c cVar = (c) obj;
            if (cVar.a() == i7 && cVar.b() == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean J() {
        return this.f26300f;
    }

    public boolean K() {
        return this.B0;
    }

    public boolean L() {
        int b8 = this.f26294c.b();
        if (!this.f26302g.contains(new Integer(b8))) {
            return false;
        }
        System.out.println("Assembler, isSpecialYear(): year" + b8 + " is inside");
        return true;
    }

    public boolean M() {
        return this.f26304h;
    }

    public int N() {
        return this.f26306i;
    }

    public void P(int i7, f fVar) {
        if (i7 == 1) {
            if (!this.M0.contains(fVar)) {
                if (this.M0.size() == 4) {
                    this.M0.remove(0);
                    System.out.println("Too much effects; effect removed");
                }
                this.M0.add(fVar);
                System.out.println("Effect added");
            }
            switch (fVar.b()) {
                case 1:
                    S(R.raw.radar_sound);
                    break;
                case 2:
                    S(R.raw.antiradiation_sound);
                    break;
                case 4:
                    S(R.raw.lover_sound);
                    break;
                case 5:
                    S(R.raw.euro_sound);
                    break;
                case 6:
                    S(R.raw.church_sound);
                    break;
                case 7:
                    S(R.raw.fox_sound);
                    break;
                case 8:
                    S(R.raw.virus_sound);
                    break;
                case 9:
                    S(R.raw.cobra_sound);
                    break;
                case 10:
                    S(R.raw.oracle_sound);
                    break;
                case 11:
                    S(R.raw.war_sound);
                    break;
            }
        } else if (i7 == 2 && this.M0.contains(fVar)) {
            this.M0.remove(fVar);
            System.out.println("Effect removed");
        }
        this.F0.e("MyEffects", this.M0);
    }

    public void R() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.E0.getPackageName()));
        intent.addFlags(1208483840);
        try {
            this.E0.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            this.E0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + this.E0.getPackageName())));
        }
    }

    public void S(int i7) {
        if (this.J0.getBoolean("EFFECTS", true)) {
            MediaPlayer create = MediaPlayer.create(this.E0.getApplicationContext(), i7);
            this.f26292b = create;
            create.setOnCompletionListener(new C0134a());
            this.f26292b.start();
        }
    }

    public void T() {
        this.K0 = this.J0.edit();
        switch (this.H0.a()) {
            case R.string.character_1 /* 2131689557 */:
                boolean[] zArr = this.f26316n;
                if (!zArr[1]) {
                    zArr[1] = true;
                    this.f26314m++;
                }
                this.K0.putBoolean("CHAR_1", true);
                break;
            case R.string.character_10 /* 2131689558 */:
                boolean[] zArr2 = this.f26316n;
                if (!zArr2[10]) {
                    zArr2[10] = true;
                    this.f26314m++;
                }
                this.K0.putBoolean("CHAR_10", true);
                break;
            case R.string.character_11 /* 2131689560 */:
                boolean[] zArr3 = this.f26316n;
                if (!zArr3[11]) {
                    zArr3[11] = true;
                    this.f26314m++;
                }
                this.K0.putBoolean("CHAR_11", true);
                break;
            case R.string.character_12 /* 2131689562 */:
                boolean[] zArr4 = this.f26316n;
                if (!zArr4[12]) {
                    zArr4[12] = true;
                    this.f26314m++;
                }
                this.K0.putBoolean("CHAR_12", true);
                break;
            case R.string.character_13 /* 2131689564 */:
                boolean[] zArr5 = this.f26316n;
                if (!zArr5[13]) {
                    zArr5[13] = true;
                    this.f26314m++;
                }
                this.K0.putBoolean("CHAR_13", true);
                break;
            case R.string.character_14 /* 2131689566 */:
                boolean[] zArr6 = this.f26316n;
                if (!zArr6[14]) {
                    zArr6[14] = true;
                    this.f26314m++;
                }
                this.K0.putBoolean("CHAR_14", true);
                break;
            case R.string.character_15 /* 2131689568 */:
                boolean[] zArr7 = this.f26316n;
                if (!zArr7[15]) {
                    zArr7[15] = true;
                    this.f26314m++;
                }
                this.K0.putBoolean("CHAR_15", true);
                break;
            case R.string.character_16 /* 2131689570 */:
                boolean[] zArr8 = this.f26316n;
                if (!zArr8[16]) {
                    zArr8[16] = true;
                    this.f26314m++;
                }
                this.K0.putBoolean("CHAR_16", true);
                break;
            case R.string.character_17 /* 2131689572 */:
                boolean[] zArr9 = this.f26316n;
                if (!zArr9[17]) {
                    zArr9[17] = true;
                    this.f26314m++;
                }
                this.K0.putBoolean("CHAR_17", true);
                break;
            case R.string.character_18 /* 2131689574 */:
                boolean[] zArr10 = this.f26316n;
                if (!zArr10[18]) {
                    zArr10[18] = true;
                    this.f26314m++;
                }
                this.K0.putBoolean("CHAR_18", true);
                break;
            case R.string.character_19 /* 2131689576 */:
                boolean[] zArr11 = this.f26316n;
                if (!zArr11[19]) {
                    zArr11[19] = true;
                    this.f26314m++;
                }
                this.K0.putBoolean("CHAR_19", true);
                break;
            case R.string.character_2 /* 2131689579 */:
                boolean[] zArr12 = this.f26316n;
                if (!zArr12[2]) {
                    zArr12[2] = true;
                    this.f26314m++;
                }
                this.K0.putBoolean("CHAR_2", true);
                break;
            case R.string.character_21 /* 2131689582 */:
                boolean[] zArr13 = this.f26316n;
                if (!zArr13[21]) {
                    zArr13[21] = true;
                    this.f26314m++;
                }
                this.K0.putBoolean("CHAR_21", true);
                break;
            case R.string.character_22 /* 2131689584 */:
                boolean[] zArr14 = this.f26316n;
                if (!zArr14[22]) {
                    zArr14[22] = true;
                    this.f26314m++;
                }
                this.K0.putBoolean("CHAR_22", true);
                break;
            case R.string.character_24 /* 2131689587 */:
                boolean[] zArr15 = this.f26316n;
                if (!zArr15[24]) {
                    zArr15[24] = true;
                    this.f26314m++;
                }
                this.K0.putBoolean("CHAR_24", true);
                break;
            case R.string.character_25 /* 2131689589 */:
                boolean[] zArr16 = this.f26316n;
                if (!zArr16[25]) {
                    zArr16[25] = true;
                    this.f26314m++;
                }
                this.K0.putBoolean("CHAR_25", true);
                break;
            case R.string.character_3 /* 2131689592 */:
                boolean[] zArr17 = this.f26316n;
                if (!zArr17[3]) {
                    zArr17[3] = true;
                    this.f26314m++;
                }
                this.K0.putBoolean("CHAR_3", true);
                break;
            case R.string.character_4 /* 2131689594 */:
                boolean[] zArr18 = this.f26316n;
                if (!zArr18[4]) {
                    zArr18[4] = true;
                    this.f26314m++;
                }
                this.K0.putBoolean("CHAR_4", true);
                break;
            case R.string.character_5 /* 2131689596 */:
                boolean[] zArr19 = this.f26316n;
                if (!zArr19[5]) {
                    zArr19[5] = true;
                    this.f26314m++;
                }
                this.K0.putBoolean("CHAR_5", true);
                break;
            case R.string.character_6 /* 2131689598 */:
                boolean[] zArr20 = this.f26316n;
                if (!zArr20[6]) {
                    zArr20[6] = true;
                    this.f26314m++;
                }
                this.K0.putBoolean("CHAR_6", true);
                break;
            case R.string.character_7 /* 2131689600 */:
                boolean[] zArr21 = this.f26316n;
                if (!zArr21[7]) {
                    zArr21[7] = true;
                    this.f26314m++;
                }
                this.K0.putBoolean("CHAR_7", true);
                break;
            case R.string.character_9 /* 2131689602 */:
                boolean[] zArr22 = this.f26316n;
                if (!zArr22[9]) {
                    zArr22[9] = true;
                    this.f26314m++;
                }
                this.K0.putBoolean("CHAR_9", true);
                break;
            case R.string.creator /* 2131689628 */:
                boolean[] zArr23 = this.f26316n;
                if (!zArr23[0]) {
                    zArr23[0] = true;
                    this.f26314m++;
                }
                this.K0.putBoolean("CHAR_00", true);
                break;
        }
        this.K0.putInt("CHAR_NUM", this.f26314m);
        this.K0.apply();
    }

    public void U() {
        ArrayList c8 = this.F0.c("MyGoals", c.class);
        this.f26310k.clear();
        A();
        for (int i7 = 0; i7 < this.f26310k.size(); i7++) {
            for (int i8 = 0; i8 < c8.size(); i8++) {
                if (((c) this.f26310k.get(i7)).a() == ((c) c8.get(i8)).a()) {
                    ((c) this.f26310k.get(i7)).f(((c) c8.get(i8)).b());
                }
            }
        }
        this.F0.e("MyGoals", this.f26310k);
    }

    public int V(int[] iArr) {
        int[] iArr2;
        int i7;
        char c8;
        char c9;
        T();
        int i8 = 0;
        int[] iArr3 = {0, 0, 0, 0};
        if (!this.B0) {
            if (this.M0.contains(new f(8, -1))) {
                iArr3[0] = -5;
            }
            if (this.M0.contains(new f(9, -1))) {
                iArr3[1] = -5;
            }
            if (this.M0.contains(new f(11, -1))) {
                iArr3[2] = -5;
            }
        }
        int i9 = 0;
        int i10 = 0;
        while (true) {
            iArr2 = this.I0;
            if (i9 >= iArr2.length) {
                break;
            }
            int i11 = iArr2[i9];
            int i12 = iArr[i9];
            int i13 = iArr3[i9];
            int i14 = i8;
            if (i11 + i12 + i13 > 100) {
                if (!this.B0 && !this.f26300f && i9 == 2 && this.M0.contains(new f(7, -1))) {
                    this.f26306i = 5;
                } else if (!this.B0 && !this.f26300f && i9 == 0 && this.M0.contains(new f(7, -1))) {
                    this.f26306i = 1;
                } else if (!this.B0 && !this.f26300f && i9 == 3 && this.M0.contains(new f(7, -1))) {
                    this.f26306i = 9;
                }
                this.I0[i9] = 100;
                i10 = i9 + 1;
                c8 = 4;
            } else if (i11 + i12 + i13 <= 0) {
                if (!this.B0 && !this.f26300f && i9 == 2 && this.M0.contains(new f(1, -1))) {
                    this.f26306i = 6;
                } else if (this.B0 || this.f26300f || i9 != 0 || !this.M0.contains(new f(2, -1))) {
                    if (this.B0 || this.f26300f || i9 != 1) {
                        c9 = 4;
                    } else {
                        c9 = 4;
                        if (this.M0.contains(new f(4, -1))) {
                            this.f26306i = 4;
                            this.I0[i9] = i14;
                            i10 = -(i9 + 1);
                            c8 = c9;
                        }
                    }
                    if (!this.B0 && !this.f26300f && i9 == 1 && this.M0.contains(new f(6, -1))) {
                        this.f26306i = 7;
                    } else if (!this.B0 && !this.f26300f && i9 == 3 && this.M0.contains(new f(5, -1))) {
                        this.f26306i = 8;
                    } else if (!this.B0 && !this.f26300f && i9 == 1 && this.M0.contains(new f(7, -1))) {
                        this.f26306i = 3;
                    }
                    this.I0[i9] = i14;
                    i10 = -(i9 + 1);
                    c8 = c9;
                } else {
                    this.f26306i = 2;
                }
                c9 = 4;
                this.I0[i9] = i14;
                i10 = -(i9 + 1);
                c8 = c9;
            } else {
                c8 = 4;
                iArr2[i9] = i11 + i12 + i13;
            }
            i9++;
            i8 = i14;
        }
        int i15 = i8;
        if (i10 == 2 && iArr2[i15] >= 40) {
            i10 = i15;
        }
        if (i10 != 1 || iArr2[1] < 40) {
            i7 = i10;
        } else {
            this.f26306i = i15;
            i7 = i15;
        }
        if (i7 == -1 && this.M0.contains(new f(8, -1))) {
            return 5;
        }
        return i7;
    }

    public void W() {
        this.f26294c.c();
        if (this.f26294c.a() >= 1460) {
            o0("CgkIkMOR47gLEAIQBw");
        } else if (this.f26294c.a() >= 1095) {
            o0("CgkIkMOR47gLEAIQBg");
        } else if (this.f26294c.a() >= 730) {
            o0("CgkIkMOR47gLEAIQBQ");
        }
    }

    public void X() {
        this.G0.remove(new g(22, R.string.character_19, R.string.quest_22, R.drawable.character_19, R.string.quest_22_l, R.string.quest_22_r, new int[][]{new int[]{0, 15, 0, -10}, new int[]{0, -10, 0, 0}}));
        this.G0.remove(new g(26, R.string.character_19, R.string.quest_26, R.drawable.character_19, R.string.quest_26_l, R.string.quest_26_r, new int[][]{new int[]{10, 10, 10, 10}, new int[]{-10, -10, -10, -10}}));
        this.G0.remove(new g(27, R.string.character_19, R.string.quest_27, R.drawable.character_19, R.string.quest_27_l, R.string.quest_27_r, new int[][]{new int[]{0, 15, -15, 0}, new int[]{0, -15, 15, 0}}));
        this.G0.remove(new g(28, R.string.character_19, R.string.quest_28, R.drawable.character_19, R.string.quest_28_l, R.string.quest_28_r, new int[][]{new int[]{0, -15, 0, 15}, new int[]{0, 15, 0, -15}}));
        this.G0.remove(new g(29, R.string.character_19, R.string.quest_29, R.drawable.character_19, R.string.quest_29_l, R.string.quest_29_r, new int[][]{new int[]{10, 10, 10, 10}, new int[]{-10, -10, -10, -10}}));
        this.G0.remove(new g(30, R.string.character_19, R.string.quest_30, R.drawable.character_19, R.string.quest_30_l, R.string.quest_30_r, new int[][]{new int[]{20, -10, 0, 0}, new int[]{0, 0, -10, 20}}));
    }

    public void Y() {
        this.G0.remove(new g(31, R.string.character_3, R.string.quest_31, R.drawable.character_03, R.string.quest_31_l, R.string.quest_31_r, new int[][]{new int[]{0, 15, 0, -20}, new int[]{0, -31, 0, 0}}));
        this.G0.remove(new g(32, R.string.character_3, R.string.quest_32, R.drawable.character_03, R.string.quest_32_l, R.string.quest_32_r, new int[][]{new int[]{0, 15, 0, -15}, new int[]{0, -20, 0, 10}}));
        this.G0.remove(new g(33, R.string.character_3, R.string.quest_33, R.drawable.character_03, R.string.quest_33_l, R.string.quest_33_r, new int[][]{new int[]{0, 15, 0, -15}, new int[]{0, -20, 0, 10}}));
        this.G0.remove(new g(34, R.string.character_3, R.string.quest_34, R.drawable.character_03, R.string.quest_34_l, R.string.quest_34_r, new int[][]{new int[]{0, 15, -15, -10}, new int[]{0, -15, 0, 0}}));
        this.G0.remove(new g(35, R.string.character_3, R.string.quest_35, R.drawable.character_03, R.string.quest_35_l, R.string.quest_35_r, new int[][]{new int[]{0, 0, -10, -31}, new int[]{0, -31, -10, 0}}));
        this.G0.remove(new g(36, R.string.character_3, R.string.quest_36, R.drawable.character_03, R.string.quest_36_l, R.string.quest_36_r, new int[][]{new int[]{0, 15, 15, -15}, new int[]{0, -15, 0, 0}}));
        this.G0.remove(new g(37, R.string.character_3, R.string.quest_37, R.drawable.character_03, R.string.quest_37_l, R.string.quest_37_r, new int[][]{new int[]{15, 0, 0, -20}, new int[]{-31, -15, 0, 0}}));
        this.G0.remove(new g(49, R.string.character_3, R.string.quest_49, R.drawable.character_03, R.string.quest_49_l, R.string.quest_49_r, new int[][]{new int[]{0, -15, 0, 15}, new int[]{0, 0, 0, -10}}));
        this.G0.remove(new g(54, R.string.character_3, R.string.quest_54, R.drawable.character_03, R.string.quest_54_l, R.string.quest_54_r, new int[][]{new int[]{0, 15, 0, -15}, new int[]{0, -15, 0, 10}}));
        this.G0.remove(new g(107, R.string.character_3, R.string.quest_107, R.drawable.character_03, R.string.quest_107_l, R.string.quest_107_r, new int[][]{new int[]{0, 15, 0, -15}, new int[]{0, -20, 0, 10}}));
        this.G0.remove(new g(109, R.string.character_3, R.string.quest_109, R.drawable.character_03, R.string.quest_109_l, R.string.quest_109_r, new int[][]{new int[]{0, 15, -10, -15}, new int[]{0, -15, 0, 15}}));
        this.G0.remove(new g(androidx.constraintlayout.widget.h.C2, R.string.character_3, R.string.quest_110, R.drawable.character_03, R.string.quest_110_l, R.string.quest_110_r, new int[][]{new int[]{0, 15, -15, 0}, new int[]{0, 0, 15, -20}}));
        this.G0.remove(new g(111, R.string.character_3, R.string.quest_111, R.drawable.character_03, R.string.quest_111_l, R.string.quest_111_r, new int[][]{new int[]{0, -15, -15, 0}, new int[]{0, 15, 15, -20}}));
    }

    public void Z() {
        g gVar = new g(281, R.string.character_5, R.string.sp_quest_281, R.drawable.character_05, R.string.sp_quest_281_l, R.string.sp_quest_281_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        gVar.m(true);
        this.G0.remove(gVar);
        g gVar2 = new g(282, R.string.character_1, R.string.sp_quest_282, R.drawable.character_01, R.string.sp_quest_282_l, R.string.sp_quest_282_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        gVar2.m(true);
        this.G0.remove(gVar2);
        g gVar3 = new g(283, R.string.character_3, R.string.sp_quest_283, R.drawable.character_03, R.string.sp_quest_283_l, R.string.sp_quest_283_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        gVar3.m(true);
        this.G0.remove(gVar3);
        this.G0.add(new g(128, R.string.character_21, R.string.quest_128, R.drawable.character_21, R.string.quest_128_l, R.string.quest_128_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}));
        this.G0.remove(new g(129, R.string.character_21, R.string.quest_129, R.drawable.character_21, R.string.quest_129_l, R.string.quest_129_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}));
        this.G0.remove(new g(130, R.string.character_21, R.string.quest_130, R.drawable.character_21, R.string.quest_130_l, R.string.quest_130_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}));
        this.G0.remove(new g(131, R.string.character_7, R.string.quest_131, R.drawable.character_07, R.string.quest_131_l, R.string.quest_131_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}));
        this.G0.remove(new g(132, R.string.character_7, R.string.quest_132, R.drawable.character_07, R.string.quest_132_l, R.string.quest_132_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}));
        this.G0.remove(new g(133, R.string.character_7, R.string.quest_133, R.drawable.character_07, R.string.quest_133_l, R.string.quest_133_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}));
        this.G0.remove(new g(157, R.string.character_21, R.string.quest_157, R.drawable.character_21, R.string.quest_157_l, R.string.quest_157_r, new int[][]{new int[]{10, 0, 0, -10}, new int[]{-10, 0, 0, 0}}));
        this.G0.remove(new g(ModuleDescriptor.MODULE_VERSION, R.string.character_21, R.string.quest_155, R.drawable.character_21, R.string.quest_155_l, R.string.quest_155_r, new int[][]{new int[]{0, 10, 0, -10}, new int[]{0, 0, 0, 0}}));
        this.G0.remove(new g(154, R.string.character_21, R.string.quest_154, R.drawable.character_21, R.string.quest_154_l, R.string.quest_154_r, new int[][]{new int[]{15, 10, 0, -15}, new int[]{0, -10, 0, 0}}));
        this.G0.remove(new g(153, R.string.character_21, R.string.quest_153, R.drawable.character_21, R.string.quest_153_l, R.string.quest_153_r, new int[][]{new int[]{15, 0, 0, -15}, new int[]{-15, 0, 0, 15}}));
        this.G0.remove(new g(152, R.string.character_21, R.string.quest_152, R.drawable.character_21, R.string.quest_152_l, R.string.quest_152_r, new int[][]{new int[]{-10, 0, 0, 10}, new int[]{10, 0, 0, 0}}));
        g gVar4 = new g(223, R.string.character_9, R.string.sp_quest_223, R.drawable.character_09, R.string.sp_quest_223_l, R.string.sp_quest_223_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        gVar4.m(true);
        this.G0.remove(gVar4);
    }

    public void a0() {
        this.G0.remove(new g(171, R.string.character_25, R.string.quest_171, R.drawable.character_25, R.string.quest_171_l, R.string.quest_171_r, new int[][]{new int[]{0, -15, 0, 15}, new int[]{0, 0, -5, 0}}));
        this.G0.remove(new g(181, R.string.character_25, R.string.quest_181, R.drawable.character_25, R.string.quest_181_l, R.string.quest_181_r, new int[][]{new int[]{0, 0, -10, 15}, new int[]{10, 0, 0, 0}}));
        this.G0.remove(new g(182, R.string.character_25, R.string.quest_182, R.drawable.character_25, R.string.quest_182_l, R.string.quest_182_r, new int[][]{new int[]{15, 5, 0, -15}, new int[]{-5, -5, 0, 5}}));
        this.G0.remove(new g(183, R.string.character_25, R.string.quest_183, R.drawable.character_25, R.string.quest_183_l, R.string.quest_183_r, new int[][]{new int[]{0, 15, -10, 0}, new int[]{0, -15, 0, 0}}));
        this.G0.remove(new g(184, R.string.character_25, R.string.quest_184, R.drawable.character_25, R.string.quest_184_l, R.string.quest_184_r, new int[][]{new int[]{-15, 0, 15, 0}, new int[]{0, 0, -10, 0}}));
    }

    public void b0() {
        this.G0.remove(new g(167, R.string.character_2, R.string.quest_167, R.drawable.character_02, R.string.quest_167_l, R.string.quest_167_r, new int[][]{new int[]{0, 0, 15, -15}, new int[]{0, 0, -20, 0}}));
        this.G0.remove(new g(168, R.string.character_2, R.string.quest_168, R.drawable.character_02, R.string.quest_168_l, R.string.quest_168_r, new int[][]{new int[]{0, 0, 15, -15}, new int[]{0, 0, -20, 0}}));
        this.G0.remove(new g(169, R.string.character_2, R.string.quest_169, R.drawable.character_02, R.string.quest_169_l, R.string.quest_169_r, new int[][]{new int[]{-15, 0, 15, 0}, new int[]{0, 0, -15, 0}}));
        g gVar = new g(399, R.string.character_2, R.string.sp_quest_399, R.drawable.character_02, R.string.sp_quest_399_l, R.string.sp_quest_399_r, new int[][]{new int[]{0, -10, 31, 0}, new int[]{0, 0, -15, 0}});
        gVar.m(true);
        this.G0.remove(gVar);
    }

    public void c0() {
        int i7 = this.J0.getInt("RECORD_1", 0);
        int i8 = this.J0.getInt("RECORD_2", 0);
        int i9 = this.J0.getInt("RECORD_3", 0);
        int i10 = this.J0.getInt("RECORDYEAR_1", 0);
        int i11 = this.J0.getInt("RECORDYEAR_2", 0);
        int i12 = this.J0.getInt("RECORDYEAR_3", 0);
        int a8 = this.f26294c.a();
        int b8 = this.f26294c.b();
        if (a8 > i7) {
            i9 = i8;
            i12 = i11;
            i8 = i7;
            i11 = i10;
            i7 = a8;
            i10 = b8;
        } else if (a8 > i8) {
            i9 = i8;
            i12 = i11;
            i8 = a8;
            i11 = b8;
        } else if (a8 > i9) {
            i9 = a8;
            i12 = b8;
        }
        SharedPreferences.Editor edit = this.J0.edit();
        this.K0 = edit;
        edit.putInt("RECORD_1", i7);
        this.K0.putInt("RECORD_2", i8);
        this.K0.putInt("RECORD_3", i9);
        this.K0.putInt("RECORDYEAR_1", i10);
        this.K0.putInt("RECORDYEAR_2", i11);
        this.K0.putInt("RECORDYEAR_3", i12);
        this.K0.putString("RECORD_1_TEXT", O(i7, i10));
        this.K0.putString("RECORD_2_TEXT", O(i8, i11));
        this.K0.putString("RECORD_3_TEXT", O(i9, i12));
        this.K0.apply();
    }

    public void d0() {
        this.f26294c.d();
    }

    public void e() {
        g gVar = new g(209, R.string.creator, R.string.sp_quest_209, R.drawable.creator, R.string.yes, R.string.no, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        gVar.m(true);
        this.G0.add(gVar);
        this.G0.add(gVar);
        this.G0.add(gVar);
    }

    public g e0() {
        g gVar = new g(0, R.string.creator, R.string.second_chance_request, R.drawable.creator, R.string.yes, R.string.no, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        this.H0 = gVar;
        return gVar;
    }

    public void f(int i7) {
        switch (i7) {
            case 1:
                g gVar = new g(4, R.string.character_2, R.string.sp_quest_4, R.drawable.character_02, R.string.sp_quest_4_l, R.string.sp_quest_4_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, -10, 0}});
                gVar.m(true);
                this.G0.add(gVar);
                break;
            case 4:
                this.G0.add(new g(5, R.string.character_2, R.string.sp_quest_5, R.drawable.character_02, R.string.sp_quest_5_l, R.string.sp_quest_5_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}));
                this.G0.add(new g(6, R.string.character_1, R.string.sp_quest_6, R.drawable.character_01, R.string.sp_quest_6_l, R.string.sp_quest_6_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}));
                g gVar2 = new g(7, R.string.character_7, R.string.sp_quest_7, R.drawable.character_07, R.string.sp_quest_7_l, R.string.sp_quest_7_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar2.m(true);
                this.G0.add(gVar2);
                break;
            case 8:
                if (this.f26338y <= new Random().nextInt(3)) {
                    g gVar3 = new g(16, R.string.character_5, R.string.sp_quest_16, R.drawable.character_05, R.string.sp_quest_16_l, R.string.sp_quest_16_r, new int[][]{new int[]{0, 0, 0, 10}, new int[]{0, 0, 0, -10}});
                    gVar3.m(true);
                    this.G0.add(gVar3);
                    break;
                } else {
                    g gVar4 = new g(9, R.string.character_9, R.string.sp_quest_9, R.drawable.character_09, R.string.sp_quest_9_l, R.string.sp_quest_9_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, -10, 0}});
                    gVar4.m(true);
                    this.G0.add(gVar4);
                    break;
                }
            case 9:
                g gVar5 = new g(17, R.string.character_9, R.string.sp_quest_17, R.drawable.character_09, R.string.sp_quest_17_l, R.string.sp_quest_17_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, -10, 0}});
                gVar5.m(true);
                this.G0.add(gVar5);
                break;
            case 18:
                this.G0.add(new g(22, R.string.character_19, R.string.quest_22, R.drawable.character_19, R.string.quest_22_l, R.string.quest_22_r, new int[][]{new int[]{0, 20, 0, -15}, new int[]{0, -10, 0, 0}}));
                this.G0.add(new g(26, R.string.character_19, R.string.quest_26, R.drawable.character_19, R.string.quest_26_l, R.string.quest_26_r, new int[][]{new int[]{10, 10, 10, 10}, new int[]{-10, -10, -10, -10}}));
                this.G0.add(new g(27, R.string.character_19, R.string.quest_27, R.drawable.character_19, R.string.quest_27_l, R.string.quest_27_r, new int[][]{new int[]{0, 15, -15, 0}, new int[]{0, -15, 15, 0}}));
                this.G0.add(new g(28, R.string.character_19, R.string.quest_28, R.drawable.character_19, R.string.quest_28_l, R.string.quest_28_r, new int[][]{new int[]{0, -15, 0, 15}, new int[]{0, 15, 0, -15}}));
                this.G0.add(new g(29, R.string.character_19, R.string.quest_29, R.drawable.character_19, R.string.quest_29_l, R.string.quest_29_r, new int[][]{new int[]{10, 10, 10, 10}, new int[]{-10, -10, -10, -10}}));
                this.G0.add(new g(30, R.string.character_19, R.string.quest_30, R.drawable.character_19, R.string.quest_30_l, R.string.quest_30_r, new int[][]{new int[]{20, -10, 0, 0}, new int[]{0, 0, -10, 20}}));
                break;
            case androidx.constraintlayout.widget.h.f1530y1 /* 36 */:
                g gVar6 = new g(39, R.string.character_13, R.string.sp_quest_39, R.drawable.character_13, R.string.sp_quest_39_l, R.string.sp_quest_39_r, new int[][]{new int[]{0, 0, -10, 0}, new int[]{0, -10, 0, 0}});
                gVar6.m(true);
                this.G0.add(gVar6);
                g gVar7 = new g(40, R.string.character_13, R.string.sp_quest_40, R.drawable.character_13, R.string.sp_quest_40_l, R.string.sp_quest_40_r, new int[][]{new int[]{0, 0, -10, 0}, new int[]{0, -10, 0, 0}});
                gVar7.m(true);
                this.G0.add(gVar7);
                g gVar8 = new g(41, R.string.character_2, R.string.sp_quest_41, R.drawable.character_02, R.string.sp_quest_41_l, R.string.sp_quest_41_r, new int[][]{new int[]{0, 0, 15, 0}, new int[]{0, 0, -10, 0}});
                gVar8.m(true);
                this.G0.add(gVar8);
                g gVar9 = new g(42, R.string.character_7, R.string.sp_quest_42, R.drawable.character_07, R.string.sp_quest_42_l, R.string.sp_quest_42_r, new int[][]{new int[]{0, 10, 0, 0}, new int[]{0, 0, 0, 10}});
                gVar9.m(true);
                this.G0.add(gVar9);
                g gVar10 = new g(397, R.string.character_13, R.string.sp_quest_397, R.drawable.character_13, R.string.sp_quest_397_l, R.string.sp_quest_397_r, new int[][]{new int[]{0, 10, 0, 0}, new int[]{0, 10, 0, 0}});
                gVar10.m(true);
                this.G0.add(gVar10);
                this.G0.add(new g(39, R.string.character_13, R.string.quest_39, R.drawable.character_13, R.string.quest_39_l, R.string.quest_39_r, new int[][]{new int[]{0, 10, -10, 0}, new int[]{0, -10, 0, 0}}));
                this.G0.add(new g(117, R.string.character_13, R.string.quest_117, R.drawable.character_13, R.string.quest_117_l, R.string.quest_117_r, new int[][]{new int[]{15, 15, 0, -15}, new int[]{0, -15, 0, 0}}));
                break;
            case androidx.constraintlayout.widget.h.f1534y5 /* 45 */:
                g gVar11 = new g(45, R.string.unknown_character, R.string.sp_quest_45, R.drawable.phone_matrix_card, R.string.sp_quest_45_l, R.string.sp_quest_45_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar11.m(true);
                this.G0.add(gVar11);
                break;
            case androidx.constraintlayout.widget.h.A5 /* 47 */:
                g gVar12 = new g(47, R.string.unknown_character, R.string.sp_quest_47, R.drawable.phone_matrix_card, R.string.sp_quest_47_l, R.string.sp_quest_47_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar12.m(true);
                this.G0.add(gVar12);
                break;
            case 64:
                g gVar13 = new g(64, R.string.character_13, R.string.sp_quest_64, R.drawable.character_13, R.string.sp_quest_64_l, R.string.sp_quest_64_r, new int[][]{new int[]{0, 10, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar13.m(true);
                this.G0.add(gVar13);
                break;
            case 77:
                g gVar14 = new g(77, R.string.character_9, R.string.sp_quest_77, R.drawable.character_09, R.string.sp_quest_77_l, R.string.sp_quest_77_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar14.m(true);
                this.G0.add(gVar14);
                this.G0.add(gVar14);
                break;
            case 78:
                g gVar15 = new g(78, R.string.character_9, R.string.sp_quest_78, R.drawable.character_09, R.string.sp_quest_78_l, R.string.sp_quest_78_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar15.m(true);
                this.G0.add(gVar15);
                this.G0.add(gVar15);
                break;
            case 82:
                g gVar16 = new g(82, R.string.character_13, R.string.sp_quest_82, R.drawable.character_13, R.string.sp_quest_82_l, R.string.sp_quest_82_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, -10, 0, 0}});
                gVar16.m(true);
                this.G0.add(gVar16);
                this.G0.add(gVar16);
                break;
            case 118:
                this.G0.add(new g(118, R.string.character_13, R.string.quest_118, R.drawable.character_13, R.string.quest_118_l, R.string.quest_118_r, new int[][]{new int[]{0, 10, -10, 0}, new int[]{-10, -10, 0, 0}}));
                break;
            case 119:
                this.G0.add(new g(119, R.string.character_16, R.string.quest_119, R.drawable.character_16, R.string.quest_119_l, R.string.quest_119_r, new int[][]{new int[]{0, -15, 0, 10}, new int[]{0, 15, 0, -10}}));
                break;
            case 120:
                g gVar17 = new g(120, R.string.character_3, R.string.sp_quest_120, R.drawable.character_03, R.string.sp_quest_120_l, R.string.sp_quest_120_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar17.m(true);
                this.G0.add(gVar17);
                break;
            case 121:
                this.G0.add(new g(121, R.string.character_16, R.string.quest_121, R.drawable.character_16, R.string.quest_121_l, R.string.quest_121_r, new int[][]{new int[]{0, -15, 0, 10}, new int[]{0, 15, 0, -15}}));
                break;
            case j.M0 /* 126 */:
                g gVar18 = new g(j.M0, R.string.alien_name, R.string.sp_quest_126, R.drawable.character_19, R.string.sp_quest_126_l, R.string.sp_quest_126_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar18.m(true);
                this.G0.add(gVar18);
                this.G0.add(gVar18);
                this.G0.add(gVar18);
                break;
            case 136:
                this.G0.add(new g(22, R.string.alien_name, R.string.quest_22, R.drawable.character_19, R.string.quest_22_l, R.string.quest_22_r, new int[][]{new int[]{0, 20, 0, -15}, new int[]{0, -10, 0, 0}}));
                this.G0.add(new g(26, R.string.alien_name, R.string.quest_26, R.drawable.character_19, R.string.quest_26_l, R.string.quest_26_r, new int[][]{new int[]{10, 10, 10, 10}, new int[]{-10, -10, -10, -10}}));
                this.G0.add(new g(27, R.string.alien_name, R.string.quest_27, R.drawable.character_19, R.string.quest_27_l, R.string.quest_27_r, new int[][]{new int[]{0, 15, -15, 0}, new int[]{0, -15, 15, 0}}));
                this.G0.add(new g(28, R.string.alien_name, R.string.quest_28, R.drawable.character_19, R.string.quest_28_l, R.string.quest_28_r, new int[][]{new int[]{0, -15, 0, 15}, new int[]{0, 15, 0, -15}}));
                this.G0.add(new g(29, R.string.alien_name, R.string.quest_29, R.drawable.character_19, R.string.quest_29_l, R.string.quest_29_r, new int[][]{new int[]{10, 10, 10, 10}, new int[]{-10, -10, -10, -10}}));
                this.G0.add(new g(30, R.string.alien_name, R.string.quest_30, R.drawable.character_19, R.string.quest_30_l, R.string.quest_30_r, new int[][]{new int[]{20, -10, 0, 0}, new int[]{0, 0, -10, 20}}));
                break;
            case 137:
                g gVar19 = new g(137, R.string.character_1, R.string.sp_quest_137, R.drawable.character_01, R.string.sp_quest_137_l, R.string.sp_quest_137_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, -15, 0, 0}});
                gVar19.m(true);
                this.G0.add(gVar19);
                break;
            case 144:
                g gVar20 = new g(144, R.string.character_9, R.string.sp_quest_144, R.drawable.character_09, R.string.sp_quest_144_l, R.string.sp_quest_144_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar20.m(true);
                this.G0.add(gVar20);
                break;
            case 146:
                this.G0.add(new g(40, R.string.character_18, R.string.quest_40, R.drawable.character_18, R.string.quest_40_l, R.string.quest_40_r, new int[][]{new int[]{0, 15, -10, -20}, new int[]{0, -31, 0, 0}}));
                this.G0.add(new g(41, R.string.character_18, R.string.quest_41, R.drawable.character_18, R.string.quest_41_l, R.string.quest_41_r, new int[][]{new int[]{15, 15, 0, -20}, new int[]{-20, -20, 0, 0}}));
                this.G0.add(new g(42, R.string.character_18, R.string.quest_42, R.drawable.character_18, R.string.quest_42_l, R.string.quest_42_r, new int[][]{new int[]{0, 15, 0, -15}, new int[]{0, -20, 0, 10}}));
                this.G0.add(new g(43, R.string.character_18, R.string.quest_43, R.drawable.character_18, R.string.quest_43_l, R.string.quest_43_r, new int[][]{new int[]{0, 15, -20, 0}, new int[]{0, -15, 0, 0}}));
                this.G0.add(new g(44, R.string.character_18, R.string.quest_44, R.drawable.character_18, R.string.quest_44_l, R.string.quest_44_r, new int[][]{new int[]{0, 20, 0, -15}, new int[]{0, -15, 0, 10}}));
                this.G0.add(new g(45, R.string.character_18, R.string.quest_45, R.drawable.character_18, R.string.quest_45_l, R.string.quest_45_r, new int[][]{new int[]{0, 10, 10, 0}, new int[]{0, -10, -10, 0}}));
                this.G0.add(new g(46, R.string.character_18, R.string.quest_46, R.drawable.character_18, R.string.quest_46_l, R.string.quest_46_r, new int[][]{new int[]{0, 15, -10, 0}, new int[]{0, -15, 10, 0}}));
                this.G0.add(new g(101, R.string.character_18, R.string.quest_101, R.drawable.character_18, R.string.quest_101_l, R.string.quest_101_r, new int[][]{new int[]{0, 15, -20, 0}, new int[]{0, -20, 15, 0}}));
                this.G0.add(new g(102, R.string.character_18, R.string.quest_102, R.drawable.character_18, R.string.quest_102_l, R.string.quest_102_r, new int[][]{new int[]{15, 15, 0, -31}, new int[]{-31, 0, 0, 15}}));
                break;
            case 152:
                this.G0.add(new g(157, R.string.character_21, R.string.quest_157, R.drawable.character_21, R.string.quest_157_l, R.string.quest_157_r, new int[][]{new int[]{10, 0, 0, -10}, new int[]{-10, 0, 0, 0}}));
                this.G0.add(new g(ModuleDescriptor.MODULE_VERSION, R.string.character_21, R.string.quest_155, R.drawable.character_21, R.string.quest_155_l, R.string.quest_155_r, new int[][]{new int[]{0, 10, 0, -10}, new int[]{0, 0, 0, 0}}));
                this.G0.add(new g(154, R.string.character_21, R.string.quest_154, R.drawable.character_21, R.string.quest_154_l, R.string.quest_154_r, new int[][]{new int[]{15, 10, 0, -15}, new int[]{0, -10, 0, 0}}));
                this.G0.add(new g(153, R.string.character_21, R.string.quest_153, R.drawable.character_21, R.string.quest_153_l, R.string.quest_153_r, new int[][]{new int[]{15, 0, 0, -15}, new int[]{-15, 0, 0, 15}}));
                this.G0.add(new g(152, R.string.character_21, R.string.quest_152, R.drawable.character_21, R.string.quest_152_l, R.string.quest_152_r, new int[][]{new int[]{-10, 0, 0, 10}, new int[]{10, 0, 0, 0}}));
                break;
            case 153:
                g gVar21 = new g(153, R.string.character_13, R.string.sp_quest_153, R.drawable.character_13, R.string.sp_quest_153_l, R.string.sp_quest_153_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar21.m(true);
                this.G0.add(gVar21);
                break;
            case 171:
                this.G0.add(new g(171, R.string.character_25, R.string.quest_171, R.drawable.character_25, R.string.quest_171_l, R.string.quest_171_r, new int[][]{new int[]{0, -15, 0, 20}, new int[]{0, 0, -5, 0}}));
                this.G0.add(new g(181, R.string.character_25, R.string.quest_181, R.drawable.character_25, R.string.quest_181_l, R.string.quest_181_r, new int[][]{new int[]{0, 0, -10, 15}, new int[]{10, 0, 0, 0}}));
                this.G0.add(new g(182, R.string.character_25, R.string.quest_182, R.drawable.character_25, R.string.quest_182_l, R.string.quest_182_r, new int[][]{new int[]{20, 5, 0, -15}, new int[]{-5, -5, 0, 5}}));
                this.G0.add(new g(183, R.string.character_25, R.string.quest_183, R.drawable.character_25, R.string.quest_183_l, R.string.quest_183_r, new int[][]{new int[]{0, 15, -10, 0}, new int[]{0, -15, 0, 0}}));
                this.G0.add(new g(184, R.string.character_25, R.string.quest_184, R.drawable.character_25, R.string.quest_184_l, R.string.quest_184_r, new int[][]{new int[]{-15, 0, 20, 0}, new int[]{10, 0, -10, 0}}));
                break;
            case 190:
                this.G0.add(new g(192, R.string.character_16, R.string.quest_192, R.drawable.character_16, R.string.quest_192_l, R.string.quest_192_r, new int[][]{new int[]{0, 10, 0, -10}, new int[]{0, -10, 0, 10}}));
                if (!this.M0.contains(new f(6, -1))) {
                    g gVar22 = new g(203, R.string.character_16, R.string.sp_quest_203, R.drawable.character_16, R.string.sp_quest_203_l, R.string.sp_quest_203_r, new int[][]{new int[]{0, 15, 0, -20}, new int[]{0, -10, 0, 0}});
                    gVar22.m(true);
                    this.G0.add(gVar22);
                }
                this.G0.add(new g(57, R.string.character_16, R.string.quest_57, R.drawable.character_16, R.string.quest_57_l, R.string.quest_57_r, new int[][]{new int[]{0, -20, 15, 10}, new int[]{0, -10, 0, 0}}));
                this.G0.add(new g(58, R.string.character_16, R.string.quest_58, R.drawable.character_16, R.string.quest_58_l, R.string.quest_58_r, new int[][]{new int[]{0, -10, 0, 15}, new int[]{15, -10, 0, 0}}));
                this.G0.add(new g(59, R.string.character_16, R.string.quest_59, R.drawable.character_16, R.string.quest_59_l, R.string.quest_59_r, new int[][]{new int[]{0, 15, -20, 0}, new int[]{0, -20, 0, 0}}));
                this.G0.add(new g(60, R.string.character_16, R.string.quest_60, R.drawable.character_16, R.string.quest_60_l, R.string.quest_60_r, new int[][]{new int[]{0, 15, -15, -20}, new int[]{0, -15, 0, 0}}));
                this.G0.add(new g(61, R.string.character_2, R.string.quest_61, R.drawable.character_02, R.string.quest_61_l, R.string.quest_61_r, new int[][]{new int[]{0, -15, 20, 0}, new int[]{0, 10, -15, 0}}));
                this.G0.add(new g(62, R.string.character_2, R.string.quest_62, R.drawable.character_02, R.string.quest_62_l, R.string.quest_62_r, new int[][]{new int[]{0, -15, 15, 0}, new int[]{0, 15, -20, -15}}));
                this.G0.add(new g(63, R.string.character_16, R.string.quest_63, R.drawable.character_16, R.string.quest_63_l, R.string.quest_63_r, new int[][]{new int[]{0, 15, 10, -20}, new int[]{0, -15, 0, 0}}));
                this.G0.add(new g(64, R.string.character_16, R.string.quest_64, R.drawable.character_16, R.string.quest_64_l, R.string.quest_64_r, new int[][]{new int[]{20, 0, 0, -15}, new int[]{0, -20, 0, 0}}));
                this.G0.add(new g(65, R.string.character_16, R.string.quest_65, R.drawable.character_16, R.string.quest_65_l, R.string.quest_65_r, new int[][]{new int[]{0, 15, -20, 0}, new int[]{0, -20, 15, 0}}));
                this.G0.add(new g(66, R.string.character_16, R.string.quest_66, R.drawable.character_16, R.string.quest_66_l, R.string.quest_66_r, new int[][]{new int[]{0, 15, 0, -20}, new int[]{0, -10, 0, 0}}));
                this.G0.add(new g(67, R.string.character_16, R.string.quest_67, R.drawable.character_16, R.string.quest_67_l, R.string.quest_67_r, new int[][]{new int[]{0, 20, 0, -15}, new int[]{0, -15, 0, 0}}));
                this.G0.add(new g(68, R.string.character_16, R.string.quest_68, R.drawable.character_16, R.string.quest_68_l, R.string.quest_68_r, new int[][]{new int[]{-15, 15, 0, -20}, new int[]{15, -20, 0, 0}}));
                this.G0.add(new g(69, R.string.character_16, R.string.quest_69, R.drawable.character_16, R.string.quest_69_l, R.string.quest_69_r, new int[][]{new int[]{0, 15, 0, 10}, new int[]{0, -10, -15, 0}}));
                this.G0.add(new g(70, R.string.character_5, R.string.quest_70, R.drawable.character_05, R.string.quest_70_l, R.string.quest_70_r, new int[][]{new int[]{15, -15, 0, 0}, new int[]{-20, 10, 0, 10}}));
                this.G0.add(new g(71, R.string.character_16, R.string.quest_71, R.drawable.character_16, R.string.quest_71_l, R.string.quest_71_r, new int[][]{new int[]{0, 15, -15, -20}, new int[]{0, -20, 10, 0}}));
                this.G0.add(new g(72, R.string.character_16, R.string.quest_72, R.drawable.character_16, R.string.quest_72_l, R.string.quest_72_r, new int[][]{new int[]{0, 15, -15, -20}, new int[]{0, -31, 0, 10}}));
                this.G0.add(new g(73, R.string.character_16, R.string.quest_73, R.drawable.character_16, R.string.quest_73_l, R.string.quest_73_r, new int[][]{new int[]{0, 0, 0, -15}, new int[]{0, -20, 0, 0}}));
                break;
            case 200:
                this.G0.add(new g(185, R.string.character_17, R.string.quest_185, R.drawable.character_17, R.string.quest_185_l, R.string.quest_185_r, new int[][]{new int[]{0, 0, 0, 5}, new int[]{0, 0, 5, 0}}));
                this.G0.add(new g(74, R.string.character_17, R.string.quest_74, R.drawable.character_17, R.string.quest_74_l, R.string.quest_74_r, new int[][]{new int[]{15, 15, 0, -15}, new int[]{-15, -15, 0, 0}}));
                this.G0.add(new g(75, R.string.character_17, R.string.quest_75, R.drawable.character_17, R.string.quest_75_l, R.string.quest_75_r, new int[][]{new int[]{0, 15, 0, -15}, new int[]{0, -15, 0, 10}}));
                this.G0.add(new g(76, R.string.character_17, R.string.quest_76, R.drawable.character_17, R.string.quest_76_l, R.string.quest_76_r, new int[][]{new int[]{0, 0, 0, 15}, new int[]{0, 10, 0, 0}}));
                this.G0.add(new g(77, R.string.character_17, R.string.quest_77, R.drawable.character_17, R.string.quest_77_l, R.string.quest_77_r, new int[][]{new int[]{0, 0, 15, -15}, new int[]{0, 0, -10, 10}}));
                this.G0.add(new g(78, R.string.character_17, R.string.quest_78, R.drawable.character_17, R.string.quest_78_l, R.string.quest_78_r, new int[][]{new int[]{15, 15, -15, -15}, new int[]{-15, -15, 0, 15}}));
                this.G0.add(new g(79, R.string.character_17, R.string.quest_79, R.drawable.character_17, R.string.quest_79_l, R.string.quest_79_r, new int[][]{new int[]{0, 20, -15, -20}, new int[]{0, -20, 15, 15}}));
                this.G0.add(new g(80, R.string.character_17, R.string.quest_80, R.drawable.character_17, R.string.quest_80_l, R.string.quest_80_r, new int[][]{new int[]{0, 10, -10, 0}, new int[]{0, -10, 10, 0}}));
                this.G0.add(new g(81, R.string.character_1, R.string.quest_81, R.drawable.character_01, R.string.quest_81_l, R.string.quest_81_r, new int[][]{new int[]{0, -10, 10, 0}, new int[]{0, 10, -10, 0}}));
                this.G0.add(new g(82, R.string.character_1, R.string.quest_82, R.drawable.character_01, R.string.quest_82_l, R.string.quest_82_r, new int[][]{new int[]{0, -10, 10, 0}, new int[]{0, 10, -10, 0}}));
                this.G0.add(new g(83, R.string.character_17, R.string.quest_83, R.drawable.character_17, R.string.quest_83_l, R.string.quest_83_r, new int[][]{new int[]{0, 15, -10, 0}, new int[]{0, -10, 10, 0}}));
                this.G0.add(new g(84, R.string.character_17, R.string.quest_84, R.drawable.character_17, R.string.quest_84_l, R.string.quest_84_r, new int[][]{new int[]{0, 15, -10, 0}, new int[]{0, -10, 10, 0}}));
                this.G0.add(new g(85, R.string.character_17, R.string.quest_85, R.drawable.character_17, R.string.quest_85_l, R.string.quest_85_r, new int[][]{new int[]{0, 15, -10, 0}, new int[]{0, -10, 10, 0}}));
                this.G0.add(new g(86, R.string.character_17, R.string.quest_86, R.drawable.character_17, R.string.quest_86_l, R.string.quest_86_r, new int[][]{new int[]{0, 15, -10, 0}, new int[]{0, -10, 10, 0}}));
                this.G0.add(new g(87, R.string.character_17, R.string.quest_87, R.drawable.character_17, R.string.quest_87_l, R.string.quest_87_r, new int[][]{new int[]{0, 15, -10, 0}, new int[]{0, 0, 0, 0}}));
                this.G0.add(new g(116, R.string.character_17, R.string.quest_116, R.drawable.character_17, R.string.quest_116_l, R.string.quest_116_r, new int[][]{new int[]{0, 20, 0, -15}, new int[]{0, -15, 0, 10}}));
                this.G0.add(new g(120, R.string.character_17, R.string.quest_120, R.drawable.character_17, R.string.quest_120_l, R.string.quest_120_r, new int[][]{new int[]{0, 15, -15, 0}, new int[]{0, -15, 10, 0}}));
                this.G0.add(new g(151, R.string.character_22, R.string.quest_151, R.drawable.character_22, R.string.quest_151_l, R.string.quest_151_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}));
                break;
            case 201:
                g gVar23 = new g(202, R.string.character_9, R.string.sp_quest_202, R.drawable.character_09, R.string.sp_quest_202_l, R.string.sp_quest_202_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar23.m(true);
                this.G0.add(gVar23);
                this.G0.add(gVar23);
                break;
            case 204:
                g gVar24 = new g(205, R.string.character_16, R.string.sp_quest_205, R.drawable.character_16, R.string.sp_quest_205_l, R.string.sp_quest_205_r, new int[][]{new int[]{0, 0, 0, 20}, new int[]{15, 15, 0, 0}});
                gVar24.m(true);
                this.G0.add(gVar24);
                break;
            case 211:
                g gVar25 = new g(211, R.string.character_22, R.string.sp_quest_211, R.drawable.character_22, R.string.sp_quest_211_l, R.string.sp_quest_211_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar25.m(true);
                this.G0.add(gVar25);
                this.G0.add(gVar25);
                break;
            case 213:
                g gVar26 = new g(213, R.string.character_1, R.string.sp_quest_213, R.drawable.character_01, R.string.sp_quest_213_l, R.string.sp_quest_213_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar26.m(true);
                this.G0.add(gVar26);
                this.G0.add(gVar26);
                this.G0.add(gVar26);
                this.G0.add(gVar26);
                this.G0.add(gVar26);
                this.G0.add(gVar26);
                break;
            case 223:
                g gVar27 = new g(223, R.string.character_9, R.string.sp_quest_223, R.drawable.character_09, R.string.sp_quest_223_l, R.string.sp_quest_223_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar27.m(true);
                this.G0.add(gVar27);
                this.G0.add(gVar27);
                break;
            case 237:
                g gVar28 = new g(237, R.string.character_5, R.string.sp_quest_237, R.drawable.character_05, R.string.sp_quest_237_l, R.string.sp_quest_237_r, new int[][]{new int[]{0, 15, 0, -15}, new int[]{15, 0, 0, -15}});
                gVar28.m(true);
                this.G0.add(gVar28);
                break;
            case 238:
                g gVar29 = new g(238, R.string.character_6, R.string.sp_quest_238, R.drawable.character_06, R.string.sp_quest_238_l, R.string.sp_quest_238_r, new int[][]{new int[]{0, 15, 0, -15}, new int[]{-15, -20, 0, 0}});
                gVar29.m(true);
                this.G0.add(gVar29);
                this.G0.add(gVar29);
                this.G0.add(gVar29);
                break;
            case 239:
                g gVar30 = new g(239, R.string.character_6, R.string.sp_quest_239, R.drawable.character_06, R.string.sp_quest_239_l, R.string.sp_quest_239_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar30.m(true);
                this.G0.add(gVar30);
                this.G0.add(gVar30);
                this.G0.add(gVar30);
                break;
            case 245:
                g gVar31 = new g(245, R.string.character_5, R.string.sp_quest_245, R.drawable.character_05, R.string.sp_quest_245_l, R.string.sp_quest_245_r, new int[][]{new int[]{-10, 10, 0, -10}, new int[]{10, -10, -10, 0}});
                gVar31.m(true);
                this.G0.add(gVar31);
                this.G0.add(gVar31);
                this.G0.add(gVar31);
                break;
            case 246:
                g gVar32 = new g(246, R.string.character_1, R.string.sp_quest_246, R.drawable.character_01, R.string.sp_quest_246_l, R.string.sp_quest_246_r, new int[][]{new int[]{10, -15, 0, 0}, new int[]{-15, 10, 0, 0}});
                gVar32.m(true);
                this.G0.add(gVar32);
                this.G0.add(gVar32);
                this.G0.add(gVar32);
                break;
            case 247:
                g gVar33 = new g(247, R.string.character_1, R.string.sp_quest_247, R.drawable.character_01, R.string.sp_quest_247_l, R.string.sp_quest_247_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar33.m(true);
                this.G0.add(gVar33);
                this.G0.add(gVar33);
                this.G0.add(gVar33);
                break;
            case 248:
                g gVar34 = new g(248, R.string.character_1, R.string.sp_quest_248, R.drawable.character_01, R.string.sp_quest_248_l, R.string.sp_quest_248_r, new int[][]{new int[]{-15, -15, 0, 0}, new int[]{0, 0, -15, 0}});
                gVar34.m(true);
                this.G0.add(gVar34);
                this.G0.add(gVar34);
                this.G0.add(gVar34);
                break;
            case 249:
                g gVar35 = new g(249, R.string.character_2, R.string.sp_quest_249, R.drawable.character_02, R.string.sp_quest_249_l, R.string.sp_quest_249_r, new int[][]{new int[]{10, -10, 0, 0}, new int[]{0, 10, 0, -10}});
                gVar35.m(true);
                this.G0.add(gVar35);
                this.G0.add(gVar35);
                this.G0.add(gVar35);
                break;
            case 250:
                g gVar36 = new g(250, R.string.character_10, R.string.sp_quest_250, R.drawable.character_10, R.string.sp_quest_250_l, R.string.sp_quest_250_r, new int[][]{new int[]{0, -15, 0, 0}, new int[]{-15, 0, 0, 0}});
                gVar36.m(true);
                this.G0.add(gVar36);
                this.G0.add(gVar36);
                this.G0.add(gVar36);
                break;
            case 251:
                g gVar37 = new g(251, R.string.character_2, R.string.sp_quest_251, R.drawable.character_02, R.string.sp_quest_251_l, R.string.sp_quest_251_r, new int[][]{new int[]{-10, -10, 0, 0}, new int[]{10, -20, 0, 0}});
                gVar37.m(true);
                this.G0.add(gVar37);
                this.G0.add(gVar37);
                this.G0.add(gVar37);
                break;
            case 252:
                g gVar38 = new g(252, R.string.character_11, R.string.sp_quest_252, R.drawable.character_11, R.string.sp_quest_252_l, R.string.sp_quest_252_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar38.m(true);
                this.G0.add(gVar38);
                break;
            case 258:
                g gVar39 = new g(258, R.string.character_6, R.string.sp_quest_258, R.drawable.character_06, R.string.sp_quest_258_l, R.string.sp_quest_258_r, new int[][]{new int[]{10, 0, -10, 0}, new int[]{0, 0, 0, 0}});
                gVar39.m(true);
                this.G0.add(gVar39);
                g gVar40 = new g(259, R.string.character_6, R.string.sp_quest_259, R.drawable.character_06, R.string.sp_quest_259_l, R.string.sp_quest_259_r, new int[][]{new int[]{10, -10, 0, 0}, new int[]{-10, 0, 0, 0}});
                gVar40.m(true);
                this.G0.add(gVar40);
                g gVar41 = new g(260, R.string.character_6, R.string.sp_quest_260, R.drawable.character_06, R.string.sp_quest_260_l, R.string.sp_quest_260_r, new int[][]{new int[]{10, 0, 0, -10}, new int[]{-10, -10, 0, 0}});
                gVar41.m(true);
                this.G0.add(gVar41);
                break;
            case 261:
                g gVar42 = new g(261, R.string.character_1, R.string.sp_quest_261, R.drawable.character_01, R.string.sp_quest_261_l, R.string.sp_quest_261_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar42.m(true);
                this.G0.add(gVar42);
                break;
            case 263:
                g gVar43 = new g(263, R.string.character_18, R.string.sp_quest_263, R.drawable.character_18, R.string.sp_quest_263_l, R.string.sp_quest_263_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar43.m(true);
                this.G0.add(gVar43);
                break;
            case 265:
                g gVar44 = new g(265, R.string.character_6, R.string.sp_quest_265, R.drawable.character_06, R.string.sp_quest_265_l, R.string.sp_quest_265_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar44.m(true);
                this.G0.add(gVar44);
                break;
            case 270:
                g gVar45 = new g(270, R.string.character_1, R.string.sp_quest_270, R.drawable.character_01, R.string.sp_quest_270_l, R.string.sp_quest_270_r, new int[][]{new int[]{0, 20, 0, -10}, new int[]{0, -15, 0, 20}});
                gVar45.m(true);
                this.G0.add(gVar45);
                break;
            case 271:
                g gVar46 = new g(271, R.string.character_6, R.string.sp_quest_271, R.drawable.character_06, R.string.sp_quest_271_l, R.string.sp_quest_271_r, new int[][]{new int[]{10, 10, 10, 10}, new int[]{10, 10, 10, 10}});
                gVar46.m(true);
                this.G0.add(gVar46);
                break;
            case 272:
                g gVar47 = new g(272, R.string.character_1, R.string.sp_quest_272, R.drawable.character_01, R.string.sp_quest_272_l, R.string.sp_quest_272_r, new int[][]{new int[]{0, 20, 0, -10}, new int[]{0, -15, 0, 0}});
                gVar47.m(true);
                this.G0.add(gVar47);
                break;
            case 275:
                g gVar48 = new g(281, R.string.character_5, R.string.sp_quest_281, R.drawable.character_05, R.string.sp_quest_281_l, R.string.sp_quest_281_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar48.m(true);
                this.G0.add(gVar48);
                g gVar49 = new g(282, R.string.character_1, R.string.sp_quest_282, R.drawable.character_01, R.string.sp_quest_282_l, R.string.sp_quest_282_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar49.m(true);
                this.G0.add(gVar49);
                g gVar50 = new g(283, R.string.character_3, R.string.sp_quest_283, R.drawable.character_03, R.string.sp_quest_283_l, R.string.sp_quest_283_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar50.m(true);
                this.G0.add(gVar50);
                this.G0.add(new g(128, R.string.character_21, R.string.quest_128, R.drawable.character_21, R.string.quest_128_l, R.string.quest_128_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}));
                this.G0.add(new g(129, R.string.character_21, R.string.quest_129, R.drawable.character_21, R.string.quest_129_l, R.string.quest_129_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}));
                this.G0.add(new g(130, R.string.character_21, R.string.quest_130, R.drawable.character_21, R.string.quest_130_l, R.string.quest_130_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}));
                this.G0.add(new g(131, R.string.character_7, R.string.quest_131, R.drawable.character_07, R.string.quest_131_l, R.string.quest_131_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}));
                this.G0.add(new g(132, R.string.character_7, R.string.quest_132, R.drawable.character_07, R.string.quest_132_l, R.string.quest_132_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}));
                this.G0.add(new g(133, R.string.character_7, R.string.quest_133, R.drawable.character_07, R.string.quest_133_l, R.string.quest_133_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}));
                break;
            case 276:
                g gVar51 = new g(276, R.string.character_9, R.string.sp_quest_276, R.drawable.character_09, R.string.sp_quest_276_l, R.string.sp_quest_276_r, new int[][]{new int[]{0, 0, 0, -10}, new int[]{0, 0, 0, 0}});
                gVar51.m(true);
                this.G0.add(gVar51);
                break;
            case 278:
                this.G0.add(new g(194, R.string.character_12, R.string.quest_194, R.drawable.character_12, R.string.quest_194_l, R.string.quest_194_r, new int[][]{new int[]{0, 5, 0, -5}, new int[]{0, 0, 0, 0}}));
                this.G0.add(new g(134, R.string.character_12, R.string.quest_134, R.drawable.character_12, R.string.quest_134_l, R.string.quest_134_r, new int[][]{new int[]{0, 0, 10, -5}, new int[]{0, 0, 0, 0}}));
                this.G0.add(new g(135, R.string.character_12, R.string.quest_135, R.drawable.character_12, R.string.quest_135_l, R.string.quest_135_r, new int[][]{new int[]{0, -10, 10, 0}, new int[]{0, 0, 0, 0}}));
                this.G0.add(new g(136, R.string.character_12, R.string.quest_136, R.drawable.character_12, R.string.quest_136_l, R.string.quest_136_r, new int[][]{new int[]{0, -5, 5, 0}, new int[]{0, 0, 0, 0}}));
                this.G0.add(new g(137, R.string.character_12, R.string.quest_137, R.drawable.character_12, R.string.quest_137_l, R.string.quest_137_r, new int[][]{new int[]{0, -5, 5, 0}, new int[]{0, 0, 0, 0}}));
                this.G0.add(new g(138, R.string.character_12, R.string.quest_138, R.drawable.character_12, R.string.quest_138_l, R.string.quest_138_r, new int[][]{new int[]{0, 0, 0, -5}, new int[]{0, 0, 0, 0}}));
                this.G0.add(new g(139, R.string.character_12, R.string.quest_139, R.drawable.character_12, R.string.quest_139_l, R.string.quest_139_r, new int[][]{new int[]{0, -10, 10, 0}, new int[]{0, 0, 0, 0}}));
                this.G0.add(new g(140, R.string.character_12, R.string.quest_140, R.drawable.character_12, R.string.quest_140_l, R.string.quest_140_r, new int[][]{new int[]{0, 5, 0, -5}, new int[]{0, 0, 0, 0}}));
                this.G0.add(new g(141, R.string.character_12, R.string.quest_141, R.drawable.character_12, R.string.quest_141_l, R.string.quest_141_r, new int[][]{new int[]{0, 0, -5, 0}, new int[]{0, 0, 0, 0}}));
                this.G0.add(new g(142, R.string.character_12, R.string.quest_142, R.drawable.character_12, R.string.quest_142_l, R.string.quest_142_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}));
                break;
            case 279:
                this.G0.add(new g(127, R.string.character_23, R.string.quest_127, R.drawable.character_23, R.string.quest_127_l, R.string.quest_127_r, new int[][]{new int[]{10, 0, 0, -10}, new int[]{-10, 0, 0, 0}}));
                this.G0.add(new g(j.L0, R.string.character_23, R.string.quest_125, R.drawable.character_23, R.string.quest_125_l, R.string.quest_125_r, new int[][]{new int[]{0, 10, 0, -10}, new int[]{0, 0, 0, 0}}));
                this.G0.add(new g(j.K0, R.string.character_23, R.string.quest_124, R.drawable.character_23, R.string.quest_124_l, R.string.quest_124_r, new int[][]{new int[]{15, 10, 0, -15}, new int[]{0, -10, 0, 0}}));
                this.G0.add(new g(123, R.string.character_23, R.string.quest_123, R.drawable.character_23, R.string.quest_123_l, R.string.quest_123_r, new int[][]{new int[]{15, 0, 0, -15}, new int[]{-15, 0, 0, 15}}));
                this.G0.add(new g(122, R.string.character_23, R.string.quest_122, R.drawable.character_23, R.string.quest_122_l, R.string.quest_122_r, new int[][]{new int[]{-10, 0, 0, 10}, new int[]{10, 0, 0, 0}}));
                break;
            case 284:
                g gVar52 = new g(284, R.string.character_7, R.string.sp_quest_284, R.drawable.character_07, R.string.sp_quest_284_l, R.string.sp_quest_284_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar52.m(true);
                this.G0.add(gVar52);
                this.G0.add(gVar52);
                break;
            case 299:
                g gVar53 = new g(299, R.string.character_13, R.string.sp_quest_299, R.drawable.character_13, R.string.sp_quest_299_l, R.string.sp_quest_299_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar53.m(true);
                this.G0.add(gVar53);
                break;
            case 319:
                g gVar54 = new g(319, R.string.character_10, R.string.sp_quest_319, R.drawable.character_10, R.string.sp_quest_319_l, R.string.sp_quest_319_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar54.m(true);
                this.G0.add(gVar54);
                break;
            case 323:
                g gVar55 = new g(323, R.string.character_25, R.string.sp_quest_323, R.drawable.character_25, R.string.sp_quest_323_l, R.string.sp_quest_323_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar55.m(true);
                this.G0.add(gVar55);
                g gVar56 = new g(325, R.string.character_2, R.string.sp_quest_325, R.drawable.character_02, R.string.sp_quest_325_l, R.string.sp_quest_325_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar56.m(true);
                this.G0.add(gVar56);
                g gVar57 = new g(326, R.string.character_24, R.string.sp_quest_326, R.drawable.character_24, R.string.sp_quest_326_l, R.string.sp_quest_326_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar57.m(true);
                this.G0.add(gVar57);
                break;
            case 333:
                g gVar58 = new g(333, R.string.character_9, R.string.sp_quest_333, R.drawable.character_09, R.string.sp_quest_333_l, R.string.sp_quest_333_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar58.m(true);
                this.G0.add(gVar58);
                break;
            case 335:
                g gVar59 = new g(335, R.string.character_1, R.string.sp_quest_335, R.drawable.character_01, R.string.sp_quest_335_l, R.string.sp_quest_335_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, -5, 0, 0}});
                gVar59.m(true);
                this.G0.add(gVar59);
                this.G0.add(gVar59);
                this.G0.add(gVar59);
                this.G0.add(gVar59);
                break;
            case 336:
                g gVar60 = new g(336, R.string.character_1, R.string.sp_quest_336, R.drawable.character_01, R.string.sp_quest_336_l, R.string.sp_quest_336_r, new int[][]{new int[]{0, 5, 0, 0}, new int[]{0, 0, 10, 0}});
                gVar60.m(true);
                this.G0.add(gVar60);
                this.G0.add(gVar60);
                this.G0.add(gVar60);
                break;
            case 340:
                g gVar61 = new g(340, R.string.character_3, R.string.sp_quest_340, R.drawable.character_03, R.string.sp_quest_340_l, R.string.sp_quest_340_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar61.m(true);
                this.G0.add(gVar61);
                break;
            case 341:
                g gVar62 = new g(341, R.string.character_2, R.string.sp_quest_341, R.drawable.character_02, R.string.sp_quest_341_l, R.string.sp_quest_341_r, new int[][]{new int[]{0, 0, 5, 0}, new int[]{0, -5, 0, 0}});
                gVar62.m(true);
                this.G0.add(gVar62);
                this.G0.add(gVar62);
                this.G0.add(new g(167, R.string.character_2, R.string.quest_167, R.drawable.character_02, R.string.quest_167_l, R.string.quest_167_r, new int[][]{new int[]{0, 0, 15, -15}, new int[]{0, 0, -20, 0}}));
                this.G0.add(new g(168, R.string.character_2, R.string.quest_168, R.drawable.character_02, R.string.quest_168_l, R.string.quest_168_r, new int[][]{new int[]{0, 0, 15, -15}, new int[]{0, 0, -20, 0}}));
                this.G0.add(new g(169, R.string.character_2, R.string.quest_169, R.drawable.character_02, R.string.quest_169_l, R.string.quest_169_r, new int[][]{new int[]{-15, 0, 15, 0}, new int[]{0, 0, -15, 0}}));
                g gVar63 = new g(399, R.string.character_2, R.string.sp_quest_399, R.drawable.character_02, R.string.sp_quest_399_l, R.string.sp_quest_399_r, new int[][]{new int[]{0, -10, 20, 0}, new int[]{0, 0, -15, 0}});
                gVar63.m(true);
                this.G0.add(gVar63);
                break;
            case 342:
                g gVar64 = new g(342, R.string.character_2, R.string.sp_quest_342, R.drawable.character_02, R.string.sp_quest_342_l, R.string.sp_quest_342_r, new int[][]{new int[]{0, 0, 15, -15}, new int[]{0, 0, -5, 0}});
                gVar64.m(true);
                this.G0.add(gVar64);
                break;
            case 343:
                g gVar65 = new g(343, R.string.character_1, R.string.sp_quest_343, R.drawable.character_01, R.string.sp_quest_343_l, R.string.sp_quest_343_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, -5, 0, 0}});
                gVar65.m(true);
                this.G0.add(gVar65);
                this.G0.add(gVar65);
                break;
            case 344:
                g gVar66 = new g(344, R.string.character_1, R.string.sp_quest_344, R.drawable.character_01, R.string.sp_quest_344_l, R.string.sp_quest_344_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar66.m(true);
                this.G0.add(gVar66);
                this.G0.add(gVar66);
                break;
            case 361:
                g gVar67 = new g(361, R.string.character_25, R.string.sp_quest_361, R.drawable.character_25, R.string.sp_quest_361_l, R.string.sp_quest_361_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar67.m(true);
                this.G0.add(gVar67);
                break;
            case 387:
                g gVar68 = new g(387, R.string.character_13, R.string.sp_quest_387, R.drawable.character_13, R.string.sp_quest_387_l, R.string.sp_quest_387_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar68.m(true);
                this.G0.add(gVar68);
                break;
            case 406:
                g gVar69 = new g(406, R.string.character_10, R.string.sp_quest_406, R.drawable.character_10, R.string.sp_quest_406_l, R.string.sp_quest_406_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar69.m(true);
                this.G0.add(gVar69);
                break;
        }
    }

    public void f0(g gVar) {
        this.H0 = gVar;
    }

    public void g() {
        this.L0.dataChanged();
    }

    public void g0(int i7) {
        ArrayList arrayList = this.f26310k;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            c cVar = (c) obj;
            if (cVar.a() == i7) {
                if (cVar.b() != 2) {
                    z();
                }
                cVar.f(2);
                this.F0.e("MyGoals", this.f26310k);
            }
        }
    }

    public boolean h() {
        boolean z7 = false;
        for (int i7 = 0; i7 < this.M0.size(); i7++) {
            ((f) this.M0.get(i7)).c(((f) this.M0.get(i7)).a() - 1);
            if (((f) this.M0.get(i7)).a() <= 0) {
                System.out.println("Going to remove effect: " + this.M0.get(i7));
                P(2, (f) this.M0.get(i7));
                z7 = true;
            }
        }
        this.F0.e("MyEffects", this.M0);
        return z7;
    }

    public void h0(int i7) {
        ArrayList arrayList = this.f26310k;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            c cVar = (c) obj;
            if (cVar.a() == i7 && cVar.b() == 0) {
                if (cVar.b() != 2) {
                    cVar.f(1);
                }
                this.F0.e("MyGoals", this.f26310k);
            }
        }
    }

    public g i() {
        return this.H0;
    }

    public void i0(l3.f fVar) {
        this.f26290a = fVar;
    }

    public int j() {
        return this.f26294c.a();
    }

    public void j0(boolean z7) {
        this.B0 = z7;
    }

    public g k(int i7) {
        g gVar;
        g gVar2;
        this.C0 = 0;
        if (this.f26298e >= 100) {
            o0("CgkIkMOR47gLEAIQBA");
        }
        System.out.println("TDeath: " + this.f26298e);
        if (i7 == -4) {
            gVar = new g(i7, R.string.empty_string, R.string.death_4n, R.drawable.death_4n, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        } else if (i7 == -3) {
            gVar = new g(i7, R.string.empty_string, R.string.death_3n, R.drawable.death_3n, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        } else if (i7 == -2) {
            gVar = new g(i7, R.string.empty_string, R.string.death_2n, R.drawable.death_2n, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        } else if (i7 == -1) {
            gVar = new g(i7, R.string.empty_string, R.string.death_1n, R.drawable.death_1n, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        } else if (i7 == 1) {
            gVar = new g(i7, R.string.empty_string, R.string.death_1, R.drawable.death_1, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        } else if (i7 == 2) {
            gVar = new g(i7, R.string.empty_string, R.string.death_2, R.drawable.death_2, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        } else if (i7 == 3) {
            gVar = new g(i7, R.string.empty_string, R.string.death_3, R.drawable.death_3, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        } else if (i7 == 4) {
            gVar = new g(i7, R.string.empty_string, R.string.death_4, R.drawable.death_4, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        } else if (i7 == 5) {
            gVar = new g(i7, R.string.empty_string, R.string.death_5, R.drawable.death_5, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        } else if (i7 == 43) {
            gVar = new g(i7, R.string.empty_string, R.string.death_43, R.drawable.death_43, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        } else if (i7 == 184) {
            gVar = new g(i7, R.string.empty_string, R.string.death_184, R.drawable.death_184, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        } else {
            if (i7 != 212) {
                gVar2 = i7 != 254 ? null : new g(i7, R.string.empty_string, R.string.death_254, R.drawable.death_254, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                this.H0 = gVar2;
                return gVar2;
            }
            gVar = new g(i7, R.string.empty_string, R.string.death_212, R.drawable.death_212, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        }
        gVar2 = gVar;
        this.H0 = gVar2;
        return gVar2;
    }

    public void k0(int i7) {
        this.D0 = i7;
    }

    public int[] l() {
        int[] iArr = new int[4];
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        for (int i7 = 0; i7 < this.M0.size(); i7++) {
            if (i7 < 4) {
                iArr[i7] = ((f) this.M0.get(i7)).b();
            }
        }
        return iArr;
    }

    public void l0(int[] iArr) {
        this.I0 = iArr;
    }

    public int m() {
        return this.C0;
    }

    public void m0(int i7) {
        this.f26298e = i7;
        SharedPreferences.Editor edit = this.J0.edit();
        this.K0 = edit;
        edit.putInt("TOTAL_DEATH", i7);
        this.K0.apply();
    }

    public int n() {
        return this.f26294c.b();
    }

    public g n0(int i7) {
        if (i7 == 2078) {
            g gVar = new g(1, R.string.unknown_character, R.string.sp_quest_1, R.drawable.phone_matrix_card, R.string.sp_quest_1_l, R.string.sp_quest_1_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
            gVar.m(true);
            this.B0 = true;
            this.H0 = gVar;
            return gVar;
        }
        if (i7 == 2079) {
            g gVar2 = new g(1, R.string.unknown_character, R.string.sp_quest_1, R.drawable.phone_matrix_card, R.string.sp_quest_1_l, R.string.sp_quest_1_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
            gVar2.m(true);
            this.B0 = true;
            this.H0 = gVar2;
            return gVar2;
        }
        if (i7 == 2082) {
            g gVar3 = new g(23, R.string.character_1, R.string.sp_quest_23, R.drawable.character_01, R.string.sp_quest_23_l, R.string.sp_quest_23_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
            gVar3.m(true);
            this.B0 = true;
            this.H0 = gVar3;
            this.C0 = 0;
            P(1, new f(3, 1));
            this.f26308j = true;
            this.f26300f = true;
            return gVar3;
        }
        if (i7 == 2083) {
            if (this.J0.getBoolean("PREMIUM_VERSION", false) || this.f26328t) {
                g p7 = p();
                this.f26302g.remove((Object) 2083);
                this.F0.e("MySpecialYears", this.f26302g);
                return p7;
            }
            g gVar4 = new g(108, R.string.creator, R.string.sp_quest_108, R.drawable.creator, R.string.sp_quest_108_l, R.string.sp_quest_108_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
            gVar4.m(true);
            this.B0 = true;
            this.H0 = gVar4;
            return gVar4;
        }
        if (i7 == 2085) {
            g gVar5 = new g(104, R.string.creator, R.string.sp_quest_104, R.drawable.creator, R.string.yes, R.string.no, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
            gVar5.m(true);
            this.B0 = true;
            this.H0 = gVar5;
            return gVar5;
        }
        if (i7 == 2119) {
            g gVar6 = new g(112, R.string.character_6, R.string.sp_quest_112, R.drawable.character_06, R.string.sp_quest_112_l, R.string.sp_quest_112_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
            gVar6.m(true);
            this.B0 = true;
            this.H0 = gVar6;
            this.C0 = 0;
            P(1, new f(3, 1));
            this.f26308j = true;
            this.f26300f = true;
            return gVar6;
        }
        if (i7 != 2150) {
            return p();
        }
        g gVar7 = new g(178, R.string.character_1, R.string.sp_quest_178, R.drawable.character_01, R.string.sp_quest_178_l, R.string.sp_quest_178_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        gVar7.m(true);
        this.B0 = true;
        this.H0 = gVar7;
        this.C0 = 0;
        P(1, new f(3, 1));
        this.f26308j = true;
        this.f26300f = true;
        return gVar7;
    }

    public g o(int i7) {
        g gVar;
        g gVar2;
        this.C0 = 0;
        switch (i7) {
            case -4:
                gVar = new g(i7, R.string.character_10, R.string.pre_death_4n, R.drawable.character_10, R.string.what, R.string.what, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar2 = gVar;
                break;
            case -3:
                gVar = new g(i7, R.string.character_2, R.string.pre_death_3n, R.drawable.character_02, R.string.what, R.string.what, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar2 = gVar;
                break;
            case -2:
                gVar = new g(i7, R.string.character_10, R.string.pre_death_2n, R.drawable.character_10, R.string.what, R.string.what, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar2 = gVar;
                break;
            case -1:
                gVar = new g(i7, R.string.character_6, R.string.pre_death_1n, R.drawable.character_06, R.string.what, R.string.what, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar2 = gVar;
                break;
            case 0:
            default:
                gVar2 = null;
                break;
            case 1:
                gVar = new g(i7, R.string.character_6, R.string.pre_death_1, R.drawable.character_06, R.string.what, R.string.what, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar2 = gVar;
                break;
            case 2:
                gVar = new g(i7, R.string.character_10, R.string.pre_death_2, R.drawable.character_10, R.string.what, R.string.what, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar2 = gVar;
                break;
            case 3:
                gVar = new g(i7, R.string.character_2, R.string.pre_death_3, R.drawable.character_02, R.string.what, R.string.what, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar2 = gVar;
                break;
            case 4:
                gVar = new g(i7, R.string.character_10, R.string.pre_death_4, R.drawable.character_10, R.string.what, R.string.what, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                gVar2 = gVar;
                break;
            case 5:
                gVar2 = new g(i7, R.string.character_5, R.string.pre_death_5, R.drawable.character_05, R.string.what, R.string.what, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                break;
        }
        this.H0 = gVar2;
        return gVar2;
    }

    public void o0(String str) {
        try {
            l3.f fVar = this.f26290a;
            if (fVar == null || !fVar.l() || this.J0.getBoolean(str, false)) {
                return;
            }
            y3.b.f27670k.a(this.f26290a, str).d(new b(str));
        } catch (Exception unused) {
        }
    }

    public g p() {
        if (this.G0.isEmpty()) {
            C();
        }
        g gVar = (g) this.G0.get(new Random().nextInt(this.G0.size()));
        this.H0 = gVar;
        this.C0 = 0;
        this.f26308j = false;
        if (gVar.l()) {
            this.B0 = true;
        } else {
            this.B0 = false;
        }
        this.G0.remove(gVar);
        return this.H0;
    }

    public int[] q(int i7) {
        return this.H0.h(i7);
    }

    public void r() {
        this.f26318o = this.J0.getBoolean("HELPER_101", false);
        this.f26320p = this.J0.getBoolean("HELPER_102", false);
        this.f26322q = this.J0.getBoolean("HELPER_103", false);
        this.f26324r = this.J0.getBoolean("HELPER_280", false);
        this.f26326s = this.J0.getBoolean("BOOK_HELLO", false);
        this.f26328t = this.J0.getBoolean("ADS_WARNING", false);
        this.f26330u = this.J0.getBoolean("SP_QUEST_1", false);
        this.f26332v = this.J0.getBoolean("MESSAGES_ERASED", true);
        this.f26334w = this.J0.getBoolean("MESSAGES_SEEN", false);
        this.f26336x = this.J0.getBoolean("ALIEN_RESEARCH", false);
        this.f26340z = this.J0.getBoolean("ALIEN_FOUND", false);
        this.A = this.J0.getBoolean("PHONE_LOST", false);
        this.f26338y = this.J0.getInt("ALIEN_RESEARCH_LEVEL", 0);
        this.B = this.J0.getBoolean("ALIEN_TIPS", false);
        this.C = this.J0.getBoolean("TIME_TRAVEL_RESEARCH", false);
        this.D = this.J0.getInt("TIME_RESEARCH_LEVEL", 0);
        this.E = this.J0.getBoolean("GOVERNOR_SEEN", false);
        this.F = this.J0.getBoolean("GOVERNOR_UNMASKED", false);
        this.G = this.J0.getBoolean("PROJECT_STOLEN", false);
        this.H = this.J0.getBoolean("HOME_MOVING", false);
        this.I = this.J0.getBoolean("PROJECT_FOUND", false);
        this.J = this.J0.getBoolean("PRESIDENT_REVEALED", false);
        this.K = this.J0.getBoolean("KENNY_ROSWELL", false);
        this.L = this.J0.getBoolean("KENNY_TIPS", false);
        this.M = this.J0.getBoolean("CLERIC_TIPS", false);
        this.N = this.J0.getBoolean("FOOL_TIPS", false);
        this.O = this.J0.getBoolean("FOOL_JAIL", false);
        this.P = this.J0.getBoolean("CHURCH_REFOUND", false);
        this.Q = this.J0.getBoolean("IS_LOVER_ONCE", false);
        this.R = this.J0.getBoolean("KILLED_BY_CAKE", false);
        this.S = this.J0.getBoolean("TAIL_CHIEF", false);
        this.T = this.J0.getBoolean("GARDENER_CAN_BE_SEEN", false);
        this.U = this.J0.getBoolean("GARDENER_EVIDENCE", false);
        this.V = this.J0.getBoolean("CAKE_DONE", false);
        this.W = this.J0.getBoolean("VIRUS_ANALYSIS", false);
        this.X = this.J0.getInt("VIRUS_STAGE", 0);
        this.Y = this.J0.getInt("VIRUS_RESEARCH", 0);
        this.Z = this.J0.getBoolean("SECURITY_ON", false);
        this.f26291a0 = this.J0.getInt("VIRUS_LAB", 0);
        this.f26293b0 = this.J0.getBoolean("VIRUS_DONE", false);
        this.f26295c0 = this.J0.getBoolean("HACKER_TIPS", false);
        this.f26297d0 = this.J0.getBoolean("COMBINED_TIME_RESEARCH", false);
        this.f26299e0 = this.J0.getBoolean("SECOND_MESSAGE", false);
        this.f26301f0 = this.J0.getBoolean("THIRD_MESSAGE", false);
        this.f26303g0 = this.J0.getBoolean("WIFE_DONE", false);
        this.f26305h0 = this.J0.getBoolean("GAME_REVIEWED", false);
        this.f26307i0 = this.J0.getBoolean("ORACLE_TRIED", false);
        this.f26309j0 = this.J0.getBoolean("LEADER_DONE", false);
        this.f26311k0 = this.J0.getBoolean("LEADER_FRIEND", false);
        this.f26313l0 = this.J0.getBoolean("LEADER_FOE", false);
        this.f26315m0 = this.J0.getInt("CAN_BLACKOUT", 0);
        this.f26317n0 = this.J0.getBoolean("BLACKOUT", false);
        this.f26319o0 = this.J0.getBoolean("LEADER_VANISH", false);
        this.f26321p0 = this.J0.getBoolean("CAN_WAR", false);
        this.f26323q0 = this.J0.getBoolean("FIRST_WAR", false);
        this.f26325r0 = this.J0.getBoolean("LEADER_SEARCHING", false);
        this.f26327s0 = this.J0.getBoolean("LEADER_PRESENCE", false);
        this.P0 = this.J0.getBoolean("CREATOR_TEA_FIRST", false);
        this.f26329t0 = this.J0.getBoolean("TEA_1", false);
        this.f26331u0 = this.J0.getBoolean("TEA_2", false);
        this.f26333v0 = this.J0.getBoolean("TEA_3", false);
        this.f26335w0 = this.J0.getBoolean("TEA_4", false);
        this.f26337x0 = this.J0.getBoolean("TEA_5", false);
        this.f26339y0 = this.J0.getBoolean("TEA_ALL", false);
        this.f26341z0 = this.J0.getBoolean("CAN_SEND_MESSAGES", false);
        this.A0 = this.J0.getBoolean("MY_NUMBER", false);
        ArrayList c8 = this.F0.c("MySpecialYears", Integer.class);
        this.f26302g = c8;
        if (c8.isEmpty()) {
            System.out.print("New YearsList");
            this.f26302g.add(2078);
            this.f26302g.add(2082);
            if (!this.J0.getBoolean("PREMIUM_VERSION", false)) {
                this.f26302g.add(2083);
            }
            if (!this.f26305h0) {
                this.f26302g.add(2085);
            }
            this.f26302g.add(2119);
            this.f26302g.add(2150);
            this.f26302g.add(3000);
            this.F0.e("MySpecialYears", this.f26302g);
        }
        this.f26312l = this.J0.getInt("STORY_PROGRESS", 0);
        this.f26314m = this.J0.getInt("CHAR_NUM", 1);
        this.f26316n[1] = this.J0.getBoolean("CHAR_1", false);
        this.f26316n[2] = this.J0.getBoolean("CHAR_2", false);
        this.f26316n[3] = this.J0.getBoolean("CHAR_3", false);
        this.f26316n[4] = this.J0.getBoolean("CHAR_4", false);
        this.f26316n[5] = this.J0.getBoolean("CHAR_5", false);
        this.f26316n[6] = this.J0.getBoolean("CHAR_6", false);
        this.f26316n[7] = this.J0.getBoolean("CHAR_7", false);
        this.f26316n[8] = this.J0.getBoolean("CHAR_8", false);
        this.f26316n[9] = this.J0.getBoolean("CHAR_9", false);
        this.f26316n[10] = this.J0.getBoolean("CHAR_10", false);
        this.f26316n[11] = this.J0.getBoolean("CHAR_11", false);
        this.f26316n[12] = this.J0.getBoolean("CHAR_12", false);
        this.f26316n[13] = this.J0.getBoolean("CHAR_13", false);
        this.f26316n[14] = this.J0.getBoolean("CHAR_14", false);
        this.f26316n[15] = this.J0.getBoolean("CHAR_15", false);
        this.f26316n[16] = this.J0.getBoolean("CHAR_16", false);
        this.f26316n[17] = this.J0.getBoolean("CHAR_17", false);
        this.f26316n[18] = this.J0.getBoolean("CHAR_18", false);
        this.f26316n[19] = this.J0.getBoolean("CHAR_19", false);
        boolean[] zArr = this.f26316n;
        zArr[20] = true;
        zArr[21] = this.J0.getBoolean("CHAR_21", false);
        this.f26316n[22] = this.J0.getBoolean("CHAR_22", false);
        this.f26316n[24] = this.J0.getBoolean("CHAR_24", false);
        this.f26316n[25] = this.J0.getBoolean("CHAR_25", false);
        this.f26316n[0] = this.J0.getBoolean("CHAR_00", false);
    }

    public int s() {
        return this.D0;
    }

    public g t(int i7) {
        g gVar;
        g gVar2;
        g gVar3;
        g p7;
        g gVar4;
        g gVar5;
        g gVar6;
        g gVar7;
        g gVar8;
        g gVar9;
        g gVar10;
        g gVar11;
        g gVar12;
        g gVar13;
        g gVar14;
        this.C0 = 0;
        this.f26308j = false;
        int j7 = this.H0.j();
        if (j7 != 1) {
            if (j7 != 2) {
                if (j7 != 3) {
                    if (j7 != 4) {
                        switch (j7) {
                            case 7:
                                p7 = p();
                                SharedPreferences.Editor edit = this.J0.edit();
                                this.K0 = edit;
                                this.A = false;
                                edit.putBoolean("PHONE_LOST", false);
                                this.K0.apply();
                                this.G0.remove(new g(5, R.string.character_2, R.string.sp_quest_5, R.drawable.character_02, R.string.sp_quest_5_l, R.string.sp_quest_5_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}));
                                this.G0.remove(new g(6, R.string.character_1, R.string.sp_quest_6, R.drawable.character_01, R.string.sp_quest_6_l, R.string.sp_quest_6_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}));
                                break;
                            case 8:
                                if (i7 == 0) {
                                    p7 = p();
                                    if (!this.f26340z) {
                                        SharedPreferences.Editor edit2 = this.J0.edit();
                                        this.K0 = edit2;
                                        this.f26336x = true;
                                        this.f26338y++;
                                        edit2.putBoolean("ALIEN_RESEARCH", true);
                                        this.K0.putInt("ALIEN_RESEARCH_LEVEL", this.f26338y);
                                        this.K0.apply();
                                        f(8);
                                        break;
                                    }
                                } else {
                                    gVar2 = p();
                                    break;
                                }
                                break;
                            case 9:
                                if (i7 != 0) {
                                    gVar4 = new g(14, R.string.character_9, R.string.sp_quest_14, R.drawable.character_09, R.string.sp_quest_14_l, R.string.sp_quest_14_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, -15, 0}});
                                } else {
                                    gVar4 = new g(10, R.string.empty_string, R.string.sp_quest_9, R.drawable.event_text_card, R.string.card_alien_1, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                    this.C0 = 10;
                                    g0(10);
                                    h0(18);
                                }
                                SharedPreferences.Editor edit3 = this.J0.edit();
                                this.K0 = edit3;
                                this.f26336x = false;
                                this.f26340z = true;
                                edit3.putBoolean("ALIEN_RESEARCH", false);
                                this.K0.putBoolean("ALIEN_FOUND", this.f26340z);
                                this.K0.apply();
                                f(9);
                                gVar2 = gVar4;
                                break;
                            case 10:
                                gVar5 = new g(11, R.string.character_19, R.string.sp_quest_11, R.drawable.character_19, R.string.sp_quest_11_l, R.string.sp_quest_11_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                gVar2 = gVar5;
                                break;
                            case 11:
                                if (i7 == 0) {
                                    gVar6 = new g(12, R.string.character_19, R.string.sp_quest_12, R.drawable.character_19, R.string.sp_quest_12_l, R.string.sp_quest_12_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                    gVar2 = gVar6;
                                    break;
                                } else {
                                    gVar7 = new g(13, R.string.character_19, R.string.sp_quest_13, R.drawable.character_19, R.string.sp_quest_13_l, R.string.sp_quest_13_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, -10, 0}});
                                    gVar2 = gVar7;
                                    break;
                                }
                            case 12:
                                p7 = new g(13, R.string.character_19, R.string.sp_quest_13, R.drawable.character_19, R.string.sp_quest_13_l, R.string.sp_quest_13_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, -10, 0}});
                                break;
                            case 13:
                                if (i7 == 0) {
                                    gVar2 = p();
                                    break;
                                } else {
                                    gVar2 = p();
                                    break;
                                }
                            case 14:
                                if (i7 == 0) {
                                    gVar2 = new g(10, R.string.empty_string, R.string.sp_quest_14, R.drawable.event_text_card, R.string.card_alien_1, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                    this.C0 = 10;
                                    g0(10);
                                    h0(18);
                                    break;
                                } else {
                                    gVar4 = new g(15, R.string.empty_string, R.string.sp_quest_14, R.drawable.event_text_card, R.string.card_alien_2, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                    g0(10);
                                    h0(18);
                                    gVar2 = gVar4;
                                    break;
                                }
                            case 15:
                                gVar2 = p();
                                break;
                            case 16:
                                if (i7 == 0) {
                                    p7 = p();
                                    SharedPreferences.Editor edit4 = this.J0.edit();
                                    this.K0 = edit4;
                                    int i8 = this.f26338y + 1;
                                    this.f26338y = i8;
                                    edit4.putInt("ALIEN_RESEARCH_LEVEL", i8);
                                    this.K0.apply();
                                    break;
                                } else {
                                    gVar2 = p();
                                    break;
                                }
                            case 17:
                                if (i7 == 0) {
                                    p7 = new g(18, R.string.character_19, R.string.sp_quest_18, R.drawable.character_19, R.string.sp_quest_18_l, R.string.sp_quest_18_r, new int[][]{new int[]{0, 0, -10, 0}, new int[]{0, -10, 0, 0}});
                                    break;
                                } else {
                                    gVar2 = p();
                                    break;
                                }
                            case 18:
                                if (i7 == 0) {
                                    p7 = p();
                                    SharedPreferences.Editor edit5 = this.J0.edit();
                                    this.K0 = edit5;
                                    this.B = true;
                                    edit5.putBoolean("ALIEN_TIPS", true);
                                    this.K0.apply();
                                    f(18);
                                    this.C0 = 18;
                                    g0(18);
                                    h0(93);
                                    h0(136);
                                    break;
                                } else {
                                    gVar2 = p();
                                    break;
                                }
                            case 19:
                                if (i7 == 0) {
                                    p7 = new g(20, R.string.empty_string, R.string.continuous_effect, R.drawable.event_text_card, R.drawable.radar, R.string.title_radar, R.string.details_radar);
                                    P(1, new f(1, 8));
                                    this.f26308j = true;
                                    break;
                                } else {
                                    gVar2 = p();
                                    break;
                                }
                            default:
                                switch (j7) {
                                    case 21:
                                        if (i7 == 0) {
                                            gVar6 = new g(22, R.string.empty_string, R.string.continuous_effect, R.drawable.event_text_card, R.drawable.antiradiation, R.string.title_antiradiation, R.string.details_antiradiation);
                                            P(1, new f(2, 8));
                                            this.f26308j = true;
                                            gVar2 = gVar6;
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case androidx.constraintlayout.widget.h.f1534y5 /* 45 */:
                                        gVar6 = new g(46, R.string.unknown_character, R.string.sp_quest_46, R.drawable.phone_matrix_card, R.string.sp_quest_46_l, R.string.sp_quest_46_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        this.f26299e0 = true;
                                        SharedPreferences.Editor edit6 = this.J0.edit();
                                        this.K0 = edit6;
                                        edit6.putBoolean("SECOND_MESSAGE", this.f26299e0);
                                        this.K0.apply();
                                        gVar2 = gVar6;
                                        break;
                                    case androidx.constraintlayout.widget.h.A5 /* 47 */:
                                        gVar7 = new g(48, R.string.unknown_character, R.string.sp_quest_48, R.drawable.phone_matrix_card, R.string.sp_quest_48_l, R.string.sp_quest_48_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        this.f26301f0 = true;
                                        SharedPreferences.Editor edit7 = this.J0.edit();
                                        this.K0 = edit7;
                                        edit7.putBoolean("THIRD_MESSAGE", this.f26301f0);
                                        this.K0.apply();
                                        gVar2 = gVar7;
                                        break;
                                    case androidx.constraintlayout.widget.h.C5 /* 49 */:
                                        p7 = i7 != 0 ? p() : new g(50, R.string.character_3, R.string.sp_quest_50, R.drawable.character_03, R.string.sp_quest_50_l, R.string.sp_quest_50_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        this.E = true;
                                        SharedPreferences.Editor edit8 = this.J0.edit();
                                        this.K0 = edit8;
                                        edit8.putBoolean("GOVERNOR_SEEN", this.E);
                                        this.K0.apply();
                                        break;
                                    case 55:
                                        gVar6 = new g(56, R.string.empty_string, R.string.sp_quest_55, R.drawable.event_text_card, R.string.card_governor_unmasked_1, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar6;
                                        break;
                                    case 56:
                                        gVar7 = new g(57, R.string.character_14, R.string.sp_quest_57, R.drawable.character_14, R.string.sp_quest_57_l, R.string.sp_quest_57_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar7;
                                        break;
                                    case 57:
                                        if (i7 == 0) {
                                            p7 = new g(58, R.string.character_14, R.string.sp_quest_58, R.drawable.character_14, R.string.sp_quest_58_l, R.string.sp_quest_58_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar2 = new g(62, R.string.character_14, R.string.sp_quest_62, R.drawable.character_14, R.string.sp_quest_62_l, R.string.sp_quest_62_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        }
                                    case 58:
                                        gVar8 = new g(59, R.string.character_14, R.string.sp_quest_59, R.drawable.character_14, R.string.sp_quest_59_l, R.string.sp_quest_59_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar8;
                                        break;
                                    case 59:
                                        if (i7 == 0) {
                                            gVar9 = new g(60, R.string.character_14, R.string.sp_quest_60, R.drawable.character_14, R.string.sp_quest_60_l, R.string.sp_quest_60_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar9;
                                            break;
                                        } else {
                                            gVar = new g(61, R.string.character_14, R.string.sp_quest_61, R.drawable.character_14, R.string.sp_quest_61_l, R.string.sp_quest_61_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        }
                                    case 60:
                                        gVar3 = new g(63, R.string.character_14, R.string.sp_quest_63, R.drawable.character_14, R.string.sp_quest_63_l, R.string.sp_quest_63_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 61:
                                        gVar5 = new g(93, R.string.empty_string, R.string.sp_quest_63, R.drawable.event_text_card, R.string.card_governor_unmasked_2, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        this.C0 = 93;
                                        g0(93);
                                        this.F = true;
                                        SharedPreferences.Editor edit9 = this.J0.edit();
                                        this.K0 = edit9;
                                        edit9.putBoolean("GOVERNOR_UNMASKED", this.F);
                                        this.K0.apply();
                                        gVar2 = gVar5;
                                        break;
                                    case 62:
                                        gVar6 = new g(63, R.string.character_14, R.string.sp_quest_63, R.drawable.character_14, R.string.sp_quest_63_l, R.string.sp_quest_63_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar6;
                                        break;
                                    case 63:
                                        gVar7 = new g(93, R.string.empty_string, R.string.sp_quest_63, R.drawable.event_text_card, R.string.card_governor_unmasked_2, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        this.C0 = 93;
                                        g0(93);
                                        this.F = true;
                                        SharedPreferences.Editor edit10 = this.J0.edit();
                                        this.K0 = edit10;
                                        edit10.putBoolean("GOVERNOR_UNMASKED", this.F);
                                        this.K0.apply();
                                        gVar2 = gVar7;
                                        break;
                                    case 64:
                                        if (i7 == 0) {
                                            p7 = new g(65, R.string.character_13, R.string.sp_quest_65, R.drawable.character_13, R.string.sp_quest_65_l, R.string.sp_quest_65_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, -10, 0, 0}});
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 65:
                                        if (i7 == 0) {
                                            p7 = new g(66, R.string.empty_string, R.string.sp_quest_65, R.drawable.event_text_card, R.string.card_lover_1, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 66:
                                        gVar5 = new g(67, R.string.character_13, R.string.sp_quest_67, R.drawable.character_13, R.string.sp_quest_67_l, R.string.sp_quest_67_r, new int[][]{new int[]{0, 5, 0, 0}, new int[]{0, -10, 0, 0}});
                                        gVar2 = gVar5;
                                        break;
                                    case 67:
                                        if (i7 == 0) {
                                            gVar6 = new g(68, R.string.empty_string, R.string.sp_quest_67, R.drawable.event_text_card, R.string.card_lover_2, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar6;
                                            break;
                                        } else {
                                            gVar7 = new g(69, R.string.empty_string, R.string.sp_quest_67, R.drawable.event_text_card, R.string.card_lover_2, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar7;
                                            break;
                                        }
                                    case 68:
                                        p7 = new g(70, R.string.empty_string, R.string.continuous_effect, R.drawable.event_text_card, R.drawable.lover, R.string.title_lover, R.string.details_lover);
                                        P(1, new f(4, 4));
                                        this.f26308j = true;
                                        this.Q = true;
                                        SharedPreferences.Editor edit11 = this.J0.edit();
                                        this.K0 = edit11;
                                        edit11.putBoolean("IS_LOVER_ONCE", this.Q);
                                        this.K0.apply();
                                        break;
                                    case 75:
                                        if (i7 == 0) {
                                            gVar2 = p();
                                            break;
                                        } else {
                                            gVar3 = new g(76, R.string.empty_string, R.string.sp_quest_75, R.drawable.event_text_card, R.string.card_governor_angry, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        }
                                    case 94:
                                        if (i7 != 0) {
                                            p7 = p();
                                        } else {
                                            if (this.C) {
                                                if (!this.N) {
                                                    gVar11 = new g(193, R.string.character_17, R.string.sp_quest_193, R.drawable.character_17, R.string.sp_quest_193_l, R.string.sp_quest_193_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                    SharedPreferences.Editor edit12 = this.J0.edit();
                                                    this.K0 = edit12;
                                                    this.N = true;
                                                    edit12.putBoolean("FOOL_TIPS", true);
                                                    this.K0.apply();
                                                    this.C0 = 192;
                                                    g0(192);
                                                    g gVar15 = new g(192, R.string.character_1, R.string.sp_quest_192, R.drawable.character_01, R.string.sp_quest_192_l, R.string.sp_quest_192_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, -15, 0, -15}});
                                                    gVar15.m(true);
                                                    this.G0.remove(gVar15);
                                                } else if (!this.f26295c0) {
                                                    gVar10 = new g(144, R.string.character_9, R.string.sp_quest_144, R.drawable.character_09, R.string.sp_quest_144_l, R.string.sp_quest_144_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                    gVar10.m(true);
                                                    this.G0.remove(gVar10);
                                                } else if (!this.M) {
                                                    g gVar16 = new g(188, R.string.character_1, R.string.sp_quest_188, R.drawable.character_01, R.string.sp_quest_188_l, R.string.sp_quest_188_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, -15, 0, -15}});
                                                    gVar16.m(true);
                                                    this.G0.remove(gVar16);
                                                    gVar10 = gVar16;
                                                } else if (!this.Z) {
                                                    g gVar17 = new g(277, R.string.character_12, R.string.sp_quest_277, R.drawable.character_12, R.string.sp_quest_277_l, R.string.sp_quest_277_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                    SharedPreferences.Editor edit13 = this.J0.edit();
                                                    this.K0 = edit13;
                                                    this.Z = true;
                                                    edit13.putBoolean("SECURITY_ON", true);
                                                    this.K0.apply();
                                                    this.C0 = 277;
                                                    g0(277);
                                                    g gVar18 = new g(276, R.string.character_9, R.string.sp_quest_276, R.drawable.character_09, R.string.sp_quest_276_l, R.string.sp_quest_276_r, new int[][]{new int[]{0, 0, 0, -10}, new int[]{0, 0, 0, 0}});
                                                    gVar18.m(true);
                                                    this.G0.remove(gVar18);
                                                    gVar10 = gVar17;
                                                } else if (this.f26311k0 || this.f26313l0) {
                                                    gVar10 = new g(206, R.string.creator, R.string.sp_quest_206, R.drawable.creator, R.string.sp_quest_206_l, R.string.sp_quest_206_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                    gVar10.m(true);
                                                } else {
                                                    gVar11 = new g(308, R.string.character_25, R.string.sp_quest_308, R.drawable.character_25, R.string.sp_quest_308_l, R.string.sp_quest_308_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                    g gVar19 = new g(406, R.string.character_10, R.string.sp_quest_406, R.drawable.character_10, R.string.sp_quest_406_l, R.string.sp_quest_406_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                    gVar19.m(true);
                                                    this.G0.remove(gVar19);
                                                    this.G0.remove(gVar19);
                                                }
                                                gVar10 = gVar11;
                                            } else {
                                                g gVar20 = new g(33, R.string.character_6, R.string.sp_quest_33, R.drawable.character_06, R.string.sp_quest_33_l, R.string.sp_quest_33_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                gVar20.m(true);
                                                this.G0.remove(gVar20);
                                                gVar10 = gVar20;
                                            }
                                            SharedPreferences.Editor edit14 = this.J0.edit();
                                            this.K0 = edit14;
                                            edit14.putInt("AMOUNT_ITEM_2", this.J0.getInt("AMOUNT_ITEM_2", 0) - 1);
                                            this.K0.apply();
                                            p7 = gVar10;
                                        }
                                        g gVar21 = new g(94, R.string.creator, R.string.sp_quest_94, R.drawable.creator, R.string.sp_quest_94_l, R.string.sp_quest_94_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar21.m(true);
                                        this.G0.remove(gVar21);
                                        this.G0.remove(gVar21);
                                        this.G0.remove(gVar21);
                                        this.G0.remove(gVar21);
                                        break;
                                    case 95:
                                        gVar2 = p();
                                        SharedPreferences.Editor edit15 = this.J0.edit();
                                        this.K0 = edit15;
                                        edit15.putInt("AMOUNT_ITEM_3", this.J0.getInt("AMOUNT_ITEM_3", 0) + 3);
                                        this.K0.apply();
                                        break;
                                    case 96:
                                        if (i7 == 0) {
                                            p7 = new g(95, R.string.creator, R.string.sp_quest_95, R.drawable.creator, R.string.sp_quest_95_l, R.string.sp_quest_95_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar2 = new g(97, R.string.creator, R.string.sp_quest_97, R.drawable.creator, R.string.sp_quest_97_l, R.string.sp_quest_97_r, new int[][]{new int[]{0, 20, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        }
                                    case 97:
                                        if (i7 == 0) {
                                            gVar8 = new g(95, R.string.creator, R.string.sp_quest_95, R.drawable.creator, R.string.sp_quest_95_l, R.string.sp_quest_95_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar8;
                                            break;
                                        } else {
                                            gVar9 = new g(98, R.string.creator, R.string.sp_quest_98, R.drawable.creator, R.string.sp_quest_98_l, R.string.sp_quest_98_r, new int[][]{new int[]{0, 0, 20, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar9;
                                            break;
                                        }
                                    case 98:
                                        if (i7 == 0) {
                                            gVar = new g(95, R.string.creator, R.string.sp_quest_95, R.drawable.creator, R.string.sp_quest_95_l, R.string.sp_quest_95_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar3 = new g(99, R.string.creator, R.string.sp_quest_99, R.drawable.creator, R.string.sp_quest_99_l, R.string.sp_quest_99_r, new int[][]{new int[]{20, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        }
                                    case 99:
                                        if (i7 == 0) {
                                            gVar5 = new g(95, R.string.creator, R.string.sp_quest_95, R.drawable.creator, R.string.sp_quest_95_l, R.string.sp_quest_95_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar5;
                                            break;
                                        } else {
                                            gVar6 = new g(100, R.string.creator, R.string.sp_quest_100, R.drawable.creator, R.string.sp_quest_100_l, R.string.sp_quest_100_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar6;
                                            break;
                                        }
                                    case 100:
                                        gVar7 = new g(95, R.string.creator, R.string.sp_quest_95, R.drawable.creator, R.string.sp_quest_95_l, R.string.sp_quest_95_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar7;
                                        break;
                                    case 101:
                                        p7 = p();
                                        g gVar22 = new g(101, R.string.creator, R.string.sp_quest_101, R.drawable.creator, R.string.yes, R.string.no, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar22.m(true);
                                        this.G0.remove(gVar22);
                                        this.f26318o = true;
                                        SharedPreferences.Editor edit16 = this.J0.edit();
                                        this.K0 = edit16;
                                        edit16.putBoolean("HELPER_101", this.f26318o);
                                        this.K0.apply();
                                        break;
                                    case 102:
                                        p7 = p();
                                        g gVar23 = new g(102, R.string.creator, R.string.sp_quest_102, R.drawable.creator, R.string.yes, R.string.no, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar23.m(true);
                                        this.G0.remove(gVar23);
                                        this.f26320p = true;
                                        SharedPreferences.Editor edit17 = this.J0.edit();
                                        this.K0 = edit17;
                                        edit17.putBoolean("HELPER_102", this.f26320p);
                                        this.K0.apply();
                                        break;
                                    case 103:
                                        p7 = p();
                                        g gVar24 = new g(103, R.string.creator, R.string.sp_quest_103, R.drawable.creator, R.string.yes, R.string.no, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar24.m(true);
                                        this.G0.remove(gVar24);
                                        this.f26322q = true;
                                        SharedPreferences.Editor edit18 = this.J0.edit();
                                        this.K0 = edit18;
                                        edit18.putBoolean("HELPER_103", this.f26322q);
                                        this.K0.apply();
                                        break;
                                    case 104:
                                        if (i7 == 0) {
                                            gVar9 = new g(106, R.string.creator, R.string.sp_quest_106, R.drawable.creator, R.string.sp_quest_106_l, R.string.sp_quest_106_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar9;
                                            break;
                                        } else {
                                            gVar = new g(105, R.string.creator, R.string.sp_quest_105, R.drawable.creator, R.string.sp_quest_105_l, R.string.sp_quest_105_r, new int[][]{new int[]{15, 15, 15, 15}, new int[]{-15, -15, -15, -15}});
                                            this.f26302g.remove((Object) 2085);
                                            this.F0.e("MySpecialYears", this.f26302g);
                                            break;
                                        }
                                    case 106:
                                        if (i7 == 0) {
                                            gVar3 = new g(107, R.string.creator, R.string.sp_quest_107, R.drawable.creator, R.string.sp_quest_107_l, R.string.sp_quest_107_r, new int[][]{new int[]{15, 15, 15, 15}, new int[]{-15, -15, -15, -15}});
                                            R();
                                            this.f26302g.remove((Object) 2085);
                                            this.F0.e("MySpecialYears", this.f26302g);
                                            this.f26305h0 = true;
                                            this.K0.putBoolean("GAME_REVIEWED", true);
                                            this.K0.apply();
                                            break;
                                        } else {
                                            gVar2 = p();
                                            this.f26302g.remove((Object) 2085);
                                            this.F0.e("MySpecialYears", this.f26302g);
                                            break;
                                        }
                                    case 108:
                                        gVar6 = new g(109, R.string.creator, R.string.sp_quest_109, R.drawable.creator, R.string.sp_quest_109_l, R.string.sp_quest_109_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar6;
                                        break;
                                    case 109:
                                        gVar7 = new g(androidx.constraintlayout.widget.h.C2, R.string.creator, R.string.sp_quest_110, R.drawable.creator, R.string.sp_quest_110_l, R.string.sp_quest_110_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        this.N0 = true;
                                        gVar2 = gVar7;
                                        break;
                                    case androidx.constraintlayout.widget.h.C2 /* 110 */:
                                        this.K0 = this.J0.edit();
                                        p7 = i7 != 0 ? p() : new g(111, R.string.creator, R.string.sp_quest_111, R.drawable.creator, R.string.yes, R.string.no, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        this.f26302g.remove((Object) 2083);
                                        this.F0.e("MySpecialYears", this.f26302g);
                                        this.N0 = false;
                                        this.f26328t = true;
                                        this.K0.putBoolean("ADS_WARNING", true);
                                        this.K0.apply();
                                        break;
                                    case 112:
                                        gVar5 = new g(113, R.string.empty_string, R.string.continuous_effect, R.drawable.white_card, R.drawable.time_symbol, R.string.title_time, R.string.details_time);
                                        gVar2 = gVar5;
                                        break;
                                    case 113:
                                        gVar6 = new g(114, R.string.unknown_character, R.string.sp_quest_114, R.drawable.character_20, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar6;
                                        break;
                                    case 114:
                                        gVar7 = new g(115, R.string.unknown_character, R.string.sp_quest_115, R.drawable.character_20, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar7;
                                        break;
                                    case 115:
                                        p7 = new g(116, R.string.unknown_character, R.string.sp_quest_116, R.drawable.character_20, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 116:
                                        gVar2 = new g(117, R.string.unknown_character, R.string.sp_quest_117, R.drawable.character_20, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{-10, -10, -10, -10}, new int[]{-10, -10, -10, -10}});
                                        break;
                                    case 117:
                                        gVar12 = new g(118, R.string.unknown_character, R.string.sp_quest_118, R.drawable.character_20, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{10, 10, 10, 10}, new int[]{10, 10, 10, 10}});
                                        gVar2 = gVar12;
                                        break;
                                    case 118:
                                        gVar13 = new g(119, R.string.empty_string, R.string.empty_string, R.drawable.event_text_card, R.string.card_time_2, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        this.C0 = 119;
                                        g0(119);
                                        this.f26302g.remove((Object) 2119);
                                        this.F0.e("MySpecialYears", this.f26302g);
                                        P(2, new f(3, -1));
                                        this.f26308j = true;
                                        this.f26300f = false;
                                        gVar2 = gVar13;
                                        break;
                                    case 120:
                                        gVar5 = new g(121, R.string.character_3, R.string.sp_quest_121, R.drawable.character_03, R.string.sp_quest_121_l, R.string.sp_quest_121_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar5;
                                        break;
                                    case 121:
                                        gVar6 = new g(122, R.string.character_3, R.string.sp_quest_122, R.drawable.character_03, R.string.sp_quest_122_l, R.string.sp_quest_122_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar6;
                                        break;
                                    case 122:
                                        gVar7 = new g(123, R.string.character_3, R.string.sp_quest_123, R.drawable.character_03, R.string.sp_quest_123_l, R.string.sp_quest_123_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar7;
                                        break;
                                    case 123:
                                        p7 = new g(j.K0, R.string.character_3, R.string.sp_quest_124, R.drawable.character_03, R.string.sp_quest_124_l, R.string.sp_quest_124_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case j.K0 /* 124 */:
                                        gVar14 = new g(j.L0, R.string.character_3, R.string.sp_quest_125, R.drawable.character_03, R.string.sp_quest_125_l, R.string.sp_quest_125_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        f(j.M0);
                                        X();
                                        this.K = true;
                                        SharedPreferences.Editor edit19 = this.J0.edit();
                                        this.K0 = edit19;
                                        edit19.putBoolean("KENNY_ROSWELL", this.K);
                                        this.K0.apply();
                                        gVar2 = gVar14;
                                        break;
                                    case j.M0 /* 126 */:
                                        gVar13 = i7 != 0 ? new g(127, R.string.alien_name, R.string.sp_quest_127, R.drawable.character_19, R.string.sp_quest_127_l, R.string.sp_quest_127_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}) : new g(128, R.string.alien_name, R.string.sp_quest_128, R.drawable.character_19, R.string.sp_quest_128_l, R.string.sp_quest_128_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        g gVar25 = new g(j.M0, R.string.alien_name, R.string.sp_quest_126, R.drawable.character_19, R.string.sp_quest_126_l, R.string.sp_quest_126_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar25.m(true);
                                        this.G0.remove(gVar25);
                                        this.G0.remove(gVar25);
                                        gVar2 = gVar13;
                                        break;
                                    case 128:
                                        gVar8 = new g(129, R.string.alien_name, R.string.sp_quest_129, R.drawable.character_19, R.string.sp_quest_129_l, R.string.sp_quest_129_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar8;
                                        break;
                                    case 129:
                                        gVar9 = new g(130, R.string.alien_name, R.string.sp_quest_130, R.drawable.character_19, R.string.sp_quest_130_l, R.string.sp_quest_130_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar9;
                                        break;
                                    case 130:
                                        gVar = new g(131, R.string.alien_name, R.string.sp_quest_131, R.drawable.character_19, R.string.sp_quest_131_l, R.string.sp_quest_131_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 131:
                                        gVar3 = new g(132, R.string.alien_name, R.string.sp_quest_132, R.drawable.character_19, R.string.sp_quest_132_l, R.string.sp_quest_132_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 132:
                                        gVar5 = new g(133, R.string.alien_name, R.string.sp_quest_133, R.drawable.character_19, R.string.sp_quest_133_l, R.string.sp_quest_133_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar5;
                                        break;
                                    case 133:
                                        gVar6 = new g(134, R.string.alien_name, R.string.sp_quest_134, R.drawable.character_19, R.string.sp_quest_134_l, R.string.sp_quest_134_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar6;
                                        break;
                                    case 134:
                                        gVar7 = new g(135, R.string.alien_name, R.string.sp_quest_135, R.drawable.character_19, R.string.sp_quest_135_l, R.string.sp_quest_135_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar7;
                                        break;
                                    case 135:
                                        gVar2 = p();
                                        f(136);
                                        this.C0 = 136;
                                        g0(136);
                                        this.L = true;
                                        SharedPreferences.Editor edit20 = this.J0.edit();
                                        this.K0 = edit20;
                                        edit20.putBoolean("KENNY_TIPS", this.L);
                                        this.K0.apply();
                                        break;
                                    case 137:
                                        if (i7 == 0) {
                                            p7 = new g(138, R.string.empty_string, R.string.sp_quest_137, R.drawable.event_text_card, R.string.card_hacker_1, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 138:
                                        gVar6 = new g(139, R.string.character_18, R.string.sp_quest_139, R.drawable.character_18, R.string.sp_quest_139_l, R.string.sp_quest_139_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar6;
                                        break;
                                    case 139:
                                        if (i7 == 0) {
                                            gVar7 = new g(140, R.string.character_18, R.string.sp_quest_140, R.drawable.character_18, R.string.sp_quest_140_l, R.string.sp_quest_140_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar7;
                                            break;
                                        } else {
                                            p7 = new g(141, R.string.character_18, R.string.sp_quest_141, R.drawable.character_18, R.string.sp_quest_141_l, R.string.sp_quest_141_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        }
                                    case 140:
                                        if (i7 == 0) {
                                            g gVar26 = new g(142, R.string.character_18, R.string.sp_quest_142, R.drawable.character_18, R.string.sp_quest_142_l, R.string.sp_quest_142_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            f(142);
                                            this.C0 = 142;
                                            g0(142);
                                            this.f26297d0 = true;
                                            SharedPreferences.Editor edit21 = this.J0.edit();
                                            this.K0 = edit21;
                                            edit21.putBoolean("COMBINED_TIME_RESEARCH", this.f26297d0);
                                            this.K0.apply();
                                            gVar2 = gVar26;
                                            break;
                                        } else {
                                            gVar3 = new g(143, R.string.character_18, R.string.sp_quest_143, R.drawable.character_18, R.string.sp_quest_143_l, R.string.sp_quest_143_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        }
                                    case 141:
                                        if (i7 == 0) {
                                            gVar5 = new g(142, R.string.character_18, R.string.sp_quest_142, R.drawable.character_18, R.string.sp_quest_142_l, R.string.sp_quest_142_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            f(142);
                                            this.C0 = 142;
                                            g0(142);
                                            this.f26297d0 = true;
                                            SharedPreferences.Editor edit22 = this.J0.edit();
                                            this.K0 = edit22;
                                            edit22.putBoolean("COMBINED_TIME_RESEARCH", this.f26297d0);
                                            this.K0.apply();
                                            gVar2 = gVar5;
                                            break;
                                        } else {
                                            gVar6 = new g(143, R.string.character_18, R.string.sp_quest_143, R.drawable.character_18, R.string.sp_quest_143_l, R.string.sp_quest_143_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar6;
                                            break;
                                        }
                                    case 144:
                                        gVar7 = new g(145, R.string.character_9, R.string.sp_quest_145, R.drawable.character_09, R.string.sp_quest_145_l, R.string.sp_quest_145_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, -31, -15, -15}});
                                        gVar2 = gVar7;
                                        break;
                                    case 145:
                                        if (i7 == 0) {
                                            p7 = new g(146, R.string.empty_string, R.string.sp_quest_145, R.drawable.event_text_card, R.string.card_hacker_1, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 146:
                                        gVar13 = new g(147, R.string.character_18, R.string.sp_quest_147, R.drawable.character_18, R.string.sp_quest_147_l, R.string.sp_quest_147_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        f(146);
                                        this.C0 = 146;
                                        g0(146);
                                        this.f26295c0 = true;
                                        SharedPreferences.Editor edit23 = this.J0.edit();
                                        this.K0 = edit23;
                                        edit23.putBoolean("HACKER_TIPS", this.f26295c0);
                                        this.K0.apply();
                                        gVar2 = gVar13;
                                        break;
                                    case 147:
                                        if (i7 == 0) {
                                            gVar8 = new g(148, R.string.character_18, R.string.sp_quest_148, R.drawable.character_18, R.string.sp_quest_148_l, R.string.sp_quest_148_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar8;
                                            break;
                                        } else {
                                            gVar9 = new g(149, R.string.character_18, R.string.sp_quest_149, R.drawable.character_18, R.string.sp_quest_149_l, R.string.sp_quest_149_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar9;
                                            break;
                                        }
                                    case 148:
                                        if (i7 == 0) {
                                            gVar = new g(150, R.string.character_18, R.string.sp_quest_150, R.drawable.character_18, R.string.sp_quest_150_l, R.string.sp_quest_150_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar3 = new g(149, R.string.character_18, R.string.sp_quest_149, R.drawable.character_18, R.string.sp_quest_149_l, R.string.sp_quest_149_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        }
                                    case 149:
                                        gVar5 = new g(150, R.string.character_18, R.string.sp_quest_150, R.drawable.character_18, R.string.sp_quest_150_l, R.string.sp_quest_150_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar5;
                                        break;
                                    case 150:
                                        gVar6 = new g(151, R.string.character_18, R.string.sp_quest_151, R.drawable.character_18, R.string.sp_quest_151_l, R.string.sp_quest_151_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar6;
                                        break;
                                    case 151:
                                        gVar7 = new g(152, R.string.empty_string, R.string.sp_quest_151, R.drawable.event_text_card, R.string.card_hacker_2, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar7;
                                        break;
                                    case 153:
                                        if (i7 == 0) {
                                            p7 = new g(154, R.string.empty_string, R.string.sp_quest_153, R.drawable.event_text_card, R.string.card_clou_3, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 154:
                                        gVar7 = new g(ModuleDescriptor.MODULE_VERSION, R.string.character_13, R.string.sp_quest_155, R.drawable.character_13, R.string.sp_quest_155_l, R.string.sp_quest_155_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar7;
                                        break;
                                    case ModuleDescriptor.MODULE_VERSION /* 155 */:
                                        p7 = new g(156, R.string.character_13, R.string.sp_quest_156, R.drawable.character_13, R.string.sp_quest_156_l, R.string.sp_quest_156_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 156:
                                        gVar2 = new g(157, R.string.character_13, R.string.sp_quest_157, R.drawable.character_13, R.string.sp_quest_157_l, R.string.sp_quest_157_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 157:
                                        gVar8 = new g(158, R.string.character_13, R.string.sp_quest_158, R.drawable.character_13, R.string.sp_quest_158_l, R.string.sp_quest_158_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar8;
                                        break;
                                    case 158:
                                        gVar9 = new g(159, R.string.empty_string, R.string.sp_quest_158, R.drawable.event_text_card, R.string.card_clou_4, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar9;
                                        break;
                                    case 159:
                                        gVar = new g(160, R.string.character_13, R.string.sp_quest_160, R.drawable.character_13, R.string.sp_quest_160_l, R.string.sp_quest_160_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 160:
                                        gVar3 = new g(161, R.string.character_15, R.string.sp_quest_161, R.drawable.character_15, R.string.sp_quest_161_l, R.string.sp_quest_161_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 161:
                                        gVar5 = new g(162, R.string.character_15, R.string.sp_quest_162, R.drawable.character_15, R.string.sp_quest_162_l, R.string.sp_quest_162_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar5;
                                        break;
                                    case 162:
                                        gVar6 = new g(163, R.string.character_15, R.string.sp_quest_163, R.drawable.character_15, R.string.sp_quest_163_l, R.string.sp_quest_163_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar6;
                                        break;
                                    case 163:
                                        gVar7 = new g(164, R.string.character_15, R.string.sp_quest_164, R.drawable.character_15, R.string.sp_quest_164_l, R.string.sp_quest_164_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar7;
                                        break;
                                    case 164:
                                        p7 = new g(165, R.string.character_15, R.string.sp_quest_165, R.drawable.character_15, R.string.sp_quest_165_l, R.string.sp_quest_165_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 165:
                                        gVar2 = new g(166, R.string.character_15, R.string.sp_quest_166, R.drawable.character_15, R.string.sp_quest_166_l, R.string.sp_quest_166_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 166:
                                        if (i7 == 0) {
                                            gVar13 = new g(169, R.string.character_15, R.string.sp_quest_169, R.drawable.character_15, R.string.sp_quest_169_l, R.string.sp_quest_169_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar13;
                                            break;
                                        } else {
                                            gVar8 = new g(167, R.string.character_15, R.string.sp_quest_167, R.drawable.character_15, R.string.sp_quest_167_l, R.string.sp_quest_167_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            this.f26304h = true;
                                            gVar2 = gVar8;
                                            break;
                                        }
                                    case 167:
                                        gVar9 = new g(168, R.string.empty_string, R.string.end_1, R.drawable.end_card_1, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        g0(168);
                                        o0("CgkIkMOR47gLEAIQAQ");
                                        gVar2 = gVar9;
                                        break;
                                    case 169:
                                        gVar = new g(170, R.string.empty_string, R.string.continuous_effect, R.drawable.white_card, R.drawable.time_symbol, R.string.title_time, R.string.details_time);
                                        this.f26300f = true;
                                        P(1, new f(3, 1));
                                        this.f26308j = true;
                                        break;
                                    case 170:
                                        gVar6 = new g(171, R.string.character_20, R.string.sp_quest_171, R.drawable.character_20, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar6;
                                        break;
                                    case 171:
                                        gVar7 = new g(172, R.string.character_15, R.string.sp_quest_172, R.drawable.character_15, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar7;
                                        break;
                                    case 172:
                                        p7 = new g(173, R.string.character_20, R.string.sp_quest_173, R.drawable.character_20, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 173:
                                        gVar2 = new g(174, R.string.character_15, R.string.sp_quest_174, R.drawable.character_15, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 174:
                                        gVar12 = new g(175, R.string.character_20, R.string.sp_quest_175, R.drawable.character_20, R.string.yes, R.string.no, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar12;
                                        break;
                                    case 175:
                                        gVar13 = new g(176, R.string.character_20, R.string.sp_quest_176, R.drawable.character_20, R.string.yes, R.string.no, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        this.f26304h = true;
                                        gVar2 = gVar13;
                                        break;
                                    case 176:
                                        gVar8 = new g(177, R.string.empty_string, R.string.end_2, R.drawable.end_card_2, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        g0(177);
                                        o0("CgkIkMOR47gLEAIQAg");
                                        gVar2 = gVar8;
                                        break;
                                    case 178:
                                        gVar9 = new g(179, R.string.empty_string, R.string.continuous_effect, R.drawable.white_card, R.drawable.time_symbol, R.string.title_time, R.string.details_time);
                                        this.f26300f = true;
                                        P(1, new f(3, 1));
                                        this.f26308j = true;
                                        gVar2 = gVar9;
                                        break;
                                    case 179:
                                        gVar = new g(180, R.string.character_20, R.string.sp_quest_180, R.drawable.character_20, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 180:
                                        gVar3 = new g(181, R.string.character_20, R.string.sp_quest_181, R.drawable.character_20, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 181:
                                        gVar5 = new g(182, R.string.character_20, R.string.sp_quest_182, R.drawable.character_20, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        this.f26304h = true;
                                        gVar2 = gVar5;
                                        break;
                                    case 182:
                                        p7 = new g(183, R.string.empty_string, R.string.end_3, R.drawable.end_card_3, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        g0(183);
                                        o0("CgkIkMOR47gLEAIQAw");
                                        break;
                                    case 184:
                                        if (i7 == 0) {
                                            gVar2 = p();
                                            break;
                                        } else {
                                            gVar3 = new g(185, R.string.empty_string, R.string.sp_quest_184, R.drawable.event_text_card, R.string.card_brioches_failure, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            this.D0 = 184;
                                            break;
                                        }
                                    case 186:
                                        if (i7 == 0) {
                                            gVar5 = new g(187, R.string.empty_string, R.string.continuous_effect, R.drawable.event_text_card, R.drawable.euro, R.string.title_euro, R.string.details_euro);
                                            P(1, new f(5, 8));
                                            this.f26308j = true;
                                            gVar2 = gVar5;
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 188:
                                        if (i7 == 0) {
                                            p7 = new g(189, R.string.character_16, R.string.sp_quest_189, R.drawable.character_16, R.string.sp_quest_189_l, R.string.sp_quest_189_r, new int[][]{new int[]{0, 10, -10, 0}, new int[]{0, -10, 10, 0}});
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 189:
                                        if (i7 == 0) {
                                            gVar6 = new g(190, R.string.character_16, R.string.sp_quest_190, R.drawable.character_16, R.string.sp_quest_190_l, R.string.sp_quest_190_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar6;
                                            break;
                                        } else {
                                            gVar7 = new g(191, R.string.character_16, R.string.sp_quest_191, R.drawable.character_16, R.string.sp_quest_191_l, R.string.sp_quest_191_r, new int[][]{new int[]{0, 10, -10, 0}, new int[]{0, -10, 10, 0}});
                                            gVar2 = gVar7;
                                            break;
                                        }
                                    case 190:
                                        if (i7 == 0) {
                                            gVar2 = p();
                                            SharedPreferences.Editor edit24 = this.J0.edit();
                                            this.K0 = edit24;
                                            this.M = true;
                                            edit24.putBoolean("CLERIC_TIPS", true);
                                            this.K0.apply();
                                            f(190);
                                            this.C0 = 190;
                                            g0(190);
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 191:
                                        gVar6 = new g(190, R.string.character_16, R.string.sp_quest_190, R.drawable.character_16, R.string.sp_quest_190_l, R.string.sp_quest_190_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar6;
                                        break;
                                    case 192:
                                        if (i7 == 0) {
                                            gVar7 = new g(193, R.string.character_17, R.string.sp_quest_193, R.drawable.character_17, R.string.sp_quest_193_l, R.string.sp_quest_193_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            SharedPreferences.Editor edit25 = this.J0.edit();
                                            this.K0 = edit25;
                                            this.N = true;
                                            edit25.putBoolean("FOOL_TIPS", true);
                                            this.K0.apply();
                                            this.C0 = 192;
                                            g0(192);
                                            gVar2 = gVar7;
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 193:
                                        if (i7 == 0) {
                                            gVar8 = new g(194, R.string.character_17, R.string.sp_quest_194, R.drawable.character_17, R.string.sp_quest_194_l, R.string.sp_quest_194_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar8;
                                            break;
                                        } else {
                                            gVar9 = new g(195, R.string.character_17, R.string.sp_quest_195, R.drawable.character_17, R.string.sp_quest_195_l, R.string.sp_quest_195_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar9;
                                            break;
                                        }
                                    case 194:
                                        if (i7 == 0) {
                                            gVar = new g(196, R.string.character_17, R.string.sp_quest_196, R.drawable.character_17, R.string.sp_quest_196_l, R.string.sp_quest_196_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar3 = new g(197, R.string.character_17, R.string.sp_quest_197, R.drawable.character_17, R.string.sp_quest_197_l, R.string.sp_quest_197_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        }
                                    case 195:
                                        if (i7 == 0) {
                                            gVar5 = new g(196, R.string.character_17, R.string.sp_quest_196, R.drawable.character_17, R.string.sp_quest_196_l, R.string.sp_quest_196_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar5;
                                            break;
                                        } else {
                                            gVar6 = new g(197, R.string.character_17, R.string.sp_quest_197, R.drawable.character_17, R.string.sp_quest_197_l, R.string.sp_quest_197_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar6;
                                            break;
                                        }
                                    case 196:
                                        if (i7 == 0) {
                                            gVar7 = new g(199, R.string.character_17, R.string.sp_quest_199, R.drawable.character_17, R.string.sp_quest_199_l, R.string.sp_quest_199_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar7;
                                            break;
                                        } else {
                                            p7 = new g(198, R.string.character_17, R.string.sp_quest_198, R.drawable.character_17, R.string.sp_quest_198_l, R.string.sp_quest_198_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        }
                                    case 197:
                                        if (i7 == 0) {
                                            gVar2 = new g(199, R.string.character_17, R.string.sp_quest_199, R.drawable.character_17, R.string.sp_quest_199_l, R.string.sp_quest_199_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar8 = new g(198, R.string.character_17, R.string.sp_quest_198, R.drawable.character_17, R.string.sp_quest_198_l, R.string.sp_quest_198_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar8;
                                            break;
                                        }
                                    case 198:
                                        if (i7 == 0) {
                                            gVar9 = new g(200, R.string.empty_string, R.string.sp_quest_198, R.drawable.event_text_card, R.string.card_fool_1, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            f(200);
                                            gVar2 = gVar9;
                                            break;
                                        } else {
                                            gVar = new g(201, R.string.empty_string, R.string.sp_quest_198, R.drawable.event_text_card, R.string.card_fool_2, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            f(201);
                                            SharedPreferences.Editor edit26 = this.J0.edit();
                                            this.K0 = edit26;
                                            this.O = true;
                                            edit26.putBoolean("FOOL_JAIL", true);
                                            this.K0.apply();
                                            break;
                                        }
                                    case 199:
                                        if (i7 == 0) {
                                            gVar3 = new g(200, R.string.empty_string, R.string.sp_quest_199, R.drawable.event_text_card, R.string.card_fool_1, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            f(200);
                                            break;
                                        } else {
                                            gVar5 = new g(201, R.string.empty_string, R.string.sp_quest_199, R.drawable.event_text_card, R.string.card_fool_1, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            f(201);
                                            SharedPreferences.Editor edit27 = this.J0.edit();
                                            this.K0 = edit27;
                                            this.O = true;
                                            edit27.putBoolean("FOOL_JAIL", true);
                                            this.K0.apply();
                                            gVar2 = gVar5;
                                            break;
                                        }
                                    case 202:
                                        gVar6 = p();
                                        SharedPreferences.Editor edit28 = this.J0.edit();
                                        this.K0 = edit28;
                                        this.O = false;
                                        edit28.putBoolean("FOOL_JAIL", false);
                                        this.K0.apply();
                                        g gVar27 = new g(202, R.string.character_9, R.string.sp_quest_202, R.drawable.character_09, R.string.sp_quest_202_l, R.string.sp_quest_202_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar27.m(true);
                                        this.G0.remove(gVar27);
                                        f(200);
                                        gVar2 = gVar6;
                                        break;
                                    case 203:
                                        if (i7 == 0) {
                                            gVar7 = new g(204, R.string.empty_string, R.string.continuous_effect, R.drawable.event_text_card, R.drawable.church, R.string.title_church, R.string.details_church);
                                            f(204);
                                            this.P = true;
                                            this.K0.putBoolean("CHURCH_REFOUND", true);
                                            this.K0.apply();
                                            P(1, new f(6, 8));
                                            this.f26308j = true;
                                            gVar2 = gVar7;
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 205:
                                        if (i7 == 0) {
                                            p7 = p();
                                            this.P = false;
                                            this.K0.putBoolean("CHURCH_REFOUND", false);
                                            this.K0.apply();
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 206:
                                        gVar3 = new g(96, R.string.creator, R.string.sp_quest_96, R.drawable.creator, R.string.sp_quest_96_l, R.string.sp_quest_96_r, new int[][]{new int[]{0, 0, 0, 20}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 207:
                                        if (i7 == 0) {
                                            gVar7 = new g(208, R.string.empty_string, R.string.continuous_effect, R.drawable.event_text_card, R.drawable.fox, R.string.title_fox, R.string.details_fox);
                                            P(1, new f(7, 8));
                                            this.f26308j = true;
                                            gVar2 = gVar7;
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 209:
                                        if (i7 == 0) {
                                            gVar6 = new g(210, R.string.creator, R.string.sp_quest_210, R.drawable.creator_commodore, R.string.sp_quest_210_l, R.string.sp_quest_210_r, new int[][]{new int[]{10, 10, 10, 10}, new int[]{-10, -10, -10, -10}});
                                            this.Q0 = false;
                                            SharedPreferences.Editor edit29 = this.J0.edit();
                                            this.K0 = edit29;
                                            edit29.putBoolean("COMMODORE_ASSEMBLE", this.Q0);
                                            this.K0.apply();
                                            g gVar28 = new g(209, R.string.creator, R.string.sp_quest_209, R.drawable.creator, R.string.yes, R.string.no, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar28.m(true);
                                            this.G0.remove(gVar28);
                                            this.G0.remove(gVar28);
                                            gVar2 = gVar6;
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 211:
                                        if (i7 == 0) {
                                            gVar5 = new g(212, R.string.empty_string, R.string.sp_quest_211, R.drawable.event_text_card, R.string.card_cake_1, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            SharedPreferences.Editor edit30 = this.J0.edit();
                                            this.K0 = edit30;
                                            this.R = true;
                                            edit30.putBoolean("KILLED_BY_CAKE", true);
                                            this.K0.apply();
                                            this.D0 = 212;
                                            gVar2 = gVar5;
                                            break;
                                        } else {
                                            gVar6 = p();
                                            g gVar29 = new g(211, R.string.character_22, R.string.sp_quest_211, R.drawable.character_22, R.string.sp_quest_211_l, R.string.sp_quest_211_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar29.m(true);
                                            this.G0.remove(gVar29);
                                            f(213);
                                            gVar2 = gVar6;
                                            break;
                                        }
                                    case 213:
                                        gVar6 = new g(214, R.string.character_1, R.string.sp_quest_214, R.drawable.character_01, R.string.sp_quest_214_l, R.string.sp_quest_214_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        SharedPreferences.Editor edit31 = this.J0.edit();
                                        this.K0 = edit31;
                                        this.S = true;
                                        edit31.putBoolean("TAIL_CHIEF", true);
                                        this.T = true;
                                        this.K0.putBoolean("GARDENER_CAN_BE_SEEN", true);
                                        this.K0.apply();
                                        f(223);
                                        g gVar30 = new g(213, R.string.character_1, R.string.sp_quest_213, R.drawable.character_01, R.string.sp_quest_213_l, R.string.sp_quest_213_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar30.m(true);
                                        this.G0.remove(gVar30);
                                        this.G0.remove(gVar30);
                                        this.G0.remove(gVar30);
                                        this.G0.remove(gVar30);
                                        this.G0.remove(gVar30);
                                        gVar2 = gVar6;
                                        break;
                                    case 214:
                                        boolean z7 = this.R;
                                        gVar2 = (z7 && !this.U) ? new g(216, R.string.character_1, R.string.sp_quest_216, R.drawable.character_01, R.string.sp_quest_216_l, R.string.sp_quest_216_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}) : (z7 && this.U) ? new g(229, R.string.character_1, R.string.sp_quest_229, R.drawable.character_01, R.string.sp_quest_229_l, R.string.sp_quest_229_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}) : new g(215, R.string.character_1, R.string.sp_quest_215, R.drawable.character_01, R.string.sp_quest_215_l, R.string.sp_quest_215_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        this.C0 = 214;
                                        g0(214);
                                        break;
                                    case 215:
                                        if (i7 == 0) {
                                            gVar2 = p();
                                            break;
                                        } else {
                                            gVar = new g(217, R.string.character_1, R.string.sp_quest_217, R.drawable.character_01, R.string.sp_quest_217_l, R.string.sp_quest_217_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        }
                                    case 216:
                                        if (i7 == 0) {
                                            gVar3 = new g(218, R.string.character_22, R.string.sp_quest_218, R.drawable.character_22, R.string.sp_quest_218_l, R.string.sp_quest_218_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar5 = new g(217, R.string.character_1, R.string.sp_quest_217, R.drawable.character_01, R.string.sp_quest_217_l, R.string.sp_quest_217_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar5;
                                            break;
                                        }
                                    case 217:
                                        if (i7 == 0) {
                                            gVar6 = new g(218, R.string.character_22, R.string.sp_quest_218, R.drawable.character_22, R.string.sp_quest_218_l, R.string.sp_quest_218_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar6;
                                            break;
                                        } else {
                                            gVar7 = new g(220, R.string.character_6, R.string.sp_quest_220, R.drawable.character_06, R.string.sp_quest_220_l, R.string.sp_quest_220_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar7;
                                            break;
                                        }
                                    case 218:
                                        if (i7 == 0) {
                                            p7 = new g(219, R.string.character_9, R.string.sp_quest_219, R.drawable.character_09, R.string.sp_quest_219_l, R.string.sp_quest_219_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 220:
                                        if (i7 == 0) {
                                            gVar6 = new g(218, R.string.character_22, R.string.sp_quest_218, R.drawable.character_22, R.string.sp_quest_218_l, R.string.sp_quest_218_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar6;
                                            break;
                                        } else {
                                            gVar7 = new g(221, R.string.character_6, R.string.sp_quest_221, R.drawable.character_06, R.string.sp_quest_221_l, R.string.sp_quest_221_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar7;
                                            break;
                                        }
                                    case 221:
                                        p7 = new g(222, R.string.character_6, R.string.sp_quest_222, R.drawable.character_06, R.string.sp_quest_222_l, R.string.sp_quest_222_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 222:
                                        if (i7 == 0) {
                                            gVar2 = p();
                                            break;
                                        } else {
                                            gVar12 = new g(218, R.string.character_22, R.string.sp_quest_218, R.drawable.character_22, R.string.sp_quest_218_l, R.string.sp_quest_218_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar12;
                                            break;
                                        }
                                    case 223:
                                        gVar8 = new g(224, R.string.character_9, R.string.sp_quest_224, R.drawable.character_09, R.string.sp_quest_224_l, R.string.sp_quest_224_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        SharedPreferences.Editor edit32 = this.J0.edit();
                                        this.K0 = edit32;
                                        this.S = false;
                                        edit32.putBoolean("TAIL_CHIEF", false);
                                        this.T = true;
                                        this.K0.putBoolean("GARDENER_CAN_BE_SEEN", true);
                                        this.K0.apply();
                                        g gVar31 = new g(223, R.string.character_9, R.string.sp_quest_223, R.drawable.character_09, R.string.sp_quest_223_l, R.string.sp_quest_223_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar31.m(true);
                                        this.G0.remove(gVar31);
                                        gVar2 = gVar8;
                                        break;
                                    case 224:
                                        gVar9 = new g(225, R.string.character_9, R.string.sp_quest_225, R.drawable.character_09, R.string.sp_quest_225_l, R.string.sp_quest_225_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar9;
                                        break;
                                    case 225:
                                        gVar = new g(226, R.string.character_9, R.string.sp_quest_226, R.drawable.character_09, R.string.sp_quest_226_l, R.string.sp_quest_226_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 226:
                                        if (!this.U) {
                                            gVar5 = new g(227, R.string.character_9, R.string.sp_quest_227, R.drawable.character_09, R.string.sp_quest_227_l, R.string.sp_quest_227_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar5;
                                            break;
                                        } else {
                                            gVar3 = new g(228, R.string.character_9, R.string.sp_quest_228, R.drawable.character_09, R.string.sp_quest_228_l, R.string.sp_quest_228_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        }
                                    case 228:
                                        if (i7 == 0) {
                                            gVar2 = p();
                                            break;
                                        } else {
                                            p7 = new g(230, R.string.character_9, R.string.sp_quest_230, R.drawable.character_09, R.string.sp_quest_230_l, R.string.sp_quest_230_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        }
                                    case 229:
                                        if (i7 == 0) {
                                            gVar2 = new g(218, R.string.character_22, R.string.sp_quest_218, R.drawable.character_22, R.string.sp_quest_218_l, R.string.sp_quest_218_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar8 = new g(230, R.string.character_9, R.string.sp_quest_230, R.drawable.character_09, R.string.sp_quest_230_l, R.string.sp_quest_230_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar8;
                                            break;
                                        }
                                    case 230:
                                        gVar9 = new g(231, R.string.character_21, R.string.sp_quest_231, R.drawable.character_21, R.string.sp_quest_231_l, R.string.sp_quest_231_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar9;
                                        break;
                                    case 231:
                                        gVar = new g(232, R.string.character_9, R.string.sp_quest_232, R.drawable.character_09, R.string.sp_quest_232_l, R.string.sp_quest_232_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 232:
                                        gVar3 = new g(233, R.string.character_21, R.string.sp_quest_233, R.drawable.character_21, R.string.sp_quest_233_l, R.string.sp_quest_233_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 233:
                                        gVar5 = new g(234, R.string.character_21, R.string.sp_quest_234, R.drawable.character_21, R.string.sp_quest_234_l, R.string.sp_quest_234_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar5;
                                        break;
                                    case 234:
                                        gVar6 = new g(235, R.string.character_21, R.string.sp_quest_235, R.drawable.character_21, R.string.sp_quest_235_l, R.string.sp_quest_235_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar6;
                                        break;
                                    case 235:
                                        gVar7 = new g(236, R.string.character_9, R.string.sp_quest_236, R.drawable.character_09, R.string.sp_quest_236_l, R.string.sp_quest_236_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        SharedPreferences.Editor edit33 = this.J0.edit();
                                        this.K0 = edit33;
                                        this.V = true;
                                        edit33.putBoolean("CAKE_DONE", true);
                                        this.K0.apply();
                                        Z();
                                        this.C0 = 235;
                                        g0(235);
                                        gVar2 = gVar7;
                                        break;
                                    case 237:
                                        if (i7 != 0) {
                                            f(239);
                                            SharedPreferences.Editor edit34 = this.J0.edit();
                                            this.K0 = edit34;
                                            this.W = true;
                                            edit34.putBoolean("VIRUS_ANALYSIS", true);
                                            this.K0.apply();
                                        } else {
                                            f(238);
                                        }
                                        gVar2 = p();
                                        break;
                                    case 238:
                                        f(239);
                                        g gVar32 = new g(238, R.string.character_6, R.string.sp_quest_238, R.drawable.character_06, R.string.sp_quest_238_l, R.string.sp_quest_238_r, new int[][]{new int[]{0, 15, 0, -15}, new int[]{-15, -20, 0, 0}});
                                        gVar32.m(true);
                                        this.G0.remove(gVar32);
                                        this.G0.remove(gVar32);
                                        SharedPreferences.Editor edit35 = this.J0.edit();
                                        this.K0 = edit35;
                                        this.W = true;
                                        edit35.putBoolean("VIRUS_ANALYSIS", true);
                                        this.K0.apply();
                                        gVar2 = p();
                                        break;
                                    case 239:
                                        if (i7 != 0) {
                                            f(245);
                                            gVar2 = p();
                                            SharedPreferences.Editor edit36 = this.J0.edit();
                                            this.K0 = edit36;
                                            this.X = 245;
                                            edit36.putInt("VIRUS_STAGE", 245);
                                            this.K0.apply();
                                            if (!I(240)) {
                                                this.C0 = 240;
                                            }
                                            g0(240);
                                            h0(264);
                                        } else {
                                            g gVar33 = new g(240, R.string.character_6, R.string.sp_quest_240, R.drawable.character_06, R.string.sp_quest_240_l, R.string.sp_quest_240_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            g gVar34 = new g(239, R.string.character_6, R.string.sp_quest_239, R.drawable.character_06, R.string.sp_quest_239_l, R.string.sp_quest_239_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar34.m(true);
                                            this.G0.remove(gVar34);
                                            this.G0.remove(gVar34);
                                            gVar2 = gVar33;
                                        }
                                        SharedPreferences.Editor edit37 = this.J0.edit();
                                        this.K0 = edit37;
                                        this.Y = 1;
                                        edit37.putInt("VIRUS_RESEARCH", 1);
                                        this.K0.apply();
                                        break;
                                    case 240:
                                        if (i7 == 0) {
                                            gVar3 = new g(241, R.string.character_6, R.string.sp_quest_241, R.drawable.character_06, R.string.sp_quest_241_l, R.string.sp_quest_241_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar2 = p();
                                            this.K0 = this.J0.edit();
                                            this.X = 245;
                                            f(245);
                                            this.K0.putInt("VIRUS_STAGE", this.X);
                                            this.K0.apply();
                                            if (!I(240)) {
                                                this.C0 = 240;
                                            }
                                            g0(240);
                                            h0(264);
                                            break;
                                        }
                                    case 241:
                                        gVar5 = new g(242, R.string.character_6, R.string.sp_quest_242, R.drawable.character_06, R.string.sp_quest_242_l, R.string.sp_quest_242_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar5;
                                        break;
                                    case 242:
                                        gVar6 = new g(243, R.string.character_6, R.string.sp_quest_243, R.drawable.character_06, R.string.sp_quest_243_l, R.string.sp_quest_243_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar6;
                                        break;
                                    case 243:
                                        gVar7 = new g(244, R.string.character_6, R.string.sp_quest_244, R.drawable.character_06, R.string.sp_quest_244_l, R.string.sp_quest_244_r, new int[][]{new int[]{0, 10, 0, -10}, new int[]{10, 0, 0, -10}});
                                        gVar2 = gVar7;
                                        break;
                                    case 244:
                                        gVar2 = p();
                                        if (!I(240)) {
                                            this.C0 = 240;
                                        }
                                        g0(240);
                                        h0(264);
                                        this.K0 = this.J0.edit();
                                        if (i7 != 0) {
                                            this.X = 246;
                                            f(246);
                                        } else {
                                            this.X = 245;
                                            f(245);
                                        }
                                        this.K0.putInt("VIRUS_STAGE", this.X);
                                        this.Y = 1;
                                        this.K0.putInt("VIRUS_RESEARCH", 1);
                                        this.K0.apply();
                                        break;
                                    case 245:
                                        gVar6 = p();
                                        this.K0 = this.J0.edit();
                                        if (i7 != 0) {
                                            this.X = 246;
                                            f(246);
                                        } else {
                                            this.X = 248;
                                            f(248);
                                        }
                                        this.K0.putInt("VIRUS_STAGE", this.X);
                                        this.K0.apply();
                                        if (!I(240)) {
                                            this.C0 = 240;
                                        }
                                        g0(240);
                                        h0(264);
                                        g gVar35 = new g(245, R.string.character_5, R.string.sp_quest_245, R.drawable.character_05, R.string.sp_quest_245_l, R.string.sp_quest_245_r, new int[][]{new int[]{-10, 10, 0, -10}, new int[]{10, -10, -10, 0}});
                                        gVar35.m(true);
                                        this.G0.remove(gVar35);
                                        this.G0.remove(gVar35);
                                        gVar2 = gVar6;
                                        break;
                                    case 246:
                                        gVar6 = p();
                                        this.K0 = this.J0.edit();
                                        if (i7 != 0) {
                                            this.X = 249;
                                            f(249);
                                        } else {
                                            this.X = 247;
                                            f(247);
                                        }
                                        this.K0.putInt("VIRUS_STAGE", this.X);
                                        this.K0.apply();
                                        g gVar36 = new g(246, R.string.character_1, R.string.sp_quest_246, R.drawable.character_01, R.string.sp_quest_246_l, R.string.sp_quest_246_r, new int[][]{new int[]{10, -15, 0, 0}, new int[]{-15, 10, 0, 0}});
                                        gVar36.m(true);
                                        this.G0.remove(gVar36);
                                        this.G0.remove(gVar36);
                                        gVar2 = gVar6;
                                        break;
                                    case 247:
                                        gVar = new g(248, R.string.character_1, R.string.sp_quest_248, R.drawable.character_01, R.string.sp_quest_248_l, R.string.sp_quest_248_r, new int[][]{new int[]{-15, -15, 0, 0}, new int[]{0, 0, -15, 0}});
                                        g gVar37 = new g(247, R.string.character_1, R.string.sp_quest_247, R.drawable.character_01, R.string.sp_quest_247_l, R.string.sp_quest_247_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar37.m(true);
                                        this.G0.remove(gVar37);
                                        this.G0.remove(gVar37);
                                        break;
                                    case 248:
                                        gVar6 = p();
                                        this.K0 = this.J0.edit();
                                        if (i7 != 0) {
                                            this.X = 251;
                                            f(251);
                                        } else {
                                            this.X = 250;
                                            f(250);
                                        }
                                        this.K0.putInt("VIRUS_STAGE", this.X);
                                        this.K0.apply();
                                        g gVar38 = new g(248, R.string.character_1, R.string.sp_quest_248, R.drawable.character_01, R.string.sp_quest_248_l, R.string.sp_quest_248_r, new int[][]{new int[]{-15, -15, 0, 0}, new int[]{0, 0, -15, 0}});
                                        gVar38.m(true);
                                        this.G0.remove(gVar38);
                                        this.G0.remove(gVar38);
                                        gVar2 = gVar6;
                                        break;
                                    case 249:
                                        gVar6 = p();
                                        f(250);
                                        SharedPreferences.Editor edit38 = this.J0.edit();
                                        this.K0 = edit38;
                                        this.X = 250;
                                        edit38.putInt("VIRUS_STAGE", 250);
                                        this.K0.apply();
                                        g gVar39 = new g(249, R.string.character_2, R.string.sp_quest_249, R.drawable.character_02, R.string.sp_quest_249_l, R.string.sp_quest_249_r, new int[][]{new int[]{10, -10, 0, 0}, new int[]{0, 10, 0, -10}});
                                        gVar39.m(true);
                                        this.G0.remove(gVar39);
                                        this.G0.remove(gVar39);
                                        gVar2 = gVar6;
                                        break;
                                    case 250:
                                        g gVar40 = new g(273, R.string.empty_string, R.string.turn_effect, R.drawable.event_text_card, R.drawable.virus, R.string.title_virus, R.string.details_virus);
                                        P(1, new f(8, 3));
                                        this.f26308j = true;
                                        SharedPreferences.Editor edit39 = this.J0.edit();
                                        this.K0 = edit39;
                                        this.X = 252;
                                        edit39.putInt("VIRUS_STAGE", 252);
                                        this.K0.apply();
                                        g gVar41 = new g(250, R.string.character_10, R.string.sp_quest_250, R.drawable.character_10, R.string.sp_quest_250_l, R.string.sp_quest_250_r, new int[][]{new int[]{0, -15, 0, 0}, new int[]{-15, 0, 0, 0}});
                                        gVar41.m(true);
                                        this.G0.remove(gVar41);
                                        this.G0.remove(gVar41);
                                        gVar2 = gVar40;
                                        break;
                                    case 251:
                                        if (i7 == 0) {
                                            gVar6 = p();
                                            f(249);
                                            SharedPreferences.Editor edit40 = this.J0.edit();
                                            this.K0 = edit40;
                                            this.X = 249;
                                            edit40.putInt("VIRUS_STAGE", 249);
                                            this.K0.apply();
                                        } else {
                                            g gVar42 = new g(274, R.string.empty_string, R.string.turn_effect, R.drawable.event_text_card, R.drawable.cobra, R.string.title_cobra, R.string.details_cobra);
                                            P(1, new f(9, 3));
                                            this.f26308j = true;
                                            SharedPreferences.Editor edit41 = this.J0.edit();
                                            this.K0 = edit41;
                                            this.X = 252;
                                            edit41.putInt("VIRUS_STAGE", 252);
                                            this.K0.apply();
                                            gVar6 = gVar42;
                                        }
                                        g gVar43 = new g(251, R.string.character_2, R.string.sp_quest_251, R.drawable.character_02, R.string.sp_quest_251_l, R.string.sp_quest_251_r, new int[][]{new int[]{-10, -10, 0, 0}, new int[]{10, -20, 0, 0}});
                                        gVar43.m(true);
                                        this.G0.remove(gVar43);
                                        this.G0.remove(gVar43);
                                        gVar2 = gVar6;
                                        break;
                                    case 252:
                                        gVar = new g(253, R.string.character_11, R.string.sp_quest_253, R.drawable.character_11, R.string.sp_quest_253_l, R.string.sp_quest_253_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 253:
                                        if (i7 == 0 || !this.Z) {
                                            gVar5 = new g(254, R.string.empty_string, R.string.sp_quest_253, R.drawable.event_text_card, R.string.card_virus_amb_1, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            this.D0 = 254;
                                            gVar2 = gVar5;
                                            break;
                                        } else {
                                            gVar3 = new g(255, R.string.empty_string, R.string.sp_quest_253, R.drawable.event_text_card, R.string.card_virus_amb_2, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            Y();
                                            break;
                                        }
                                    case 255:
                                        gVar6 = new g(256, R.string.character_12, R.string.sp_quest_256, R.drawable.character_12, R.string.sp_quest_256_l, R.string.sp_quest_256_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        Y();
                                        gVar2 = gVar6;
                                        break;
                                    case 256:
                                        gVar7 = new g(257, R.string.empty_string, R.string.sp_quest_256, R.drawable.event_text_card, R.string.card_virus_amb_3, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar7;
                                        break;
                                    case 258:
                                        gVar2 = p();
                                        if (i7 == 0) {
                                            SharedPreferences.Editor edit42 = this.J0.edit();
                                            this.K0 = edit42;
                                            int i9 = this.Y + 1;
                                            this.Y = i9;
                                            edit42.putInt("VIRUS_RESEARCH", i9);
                                            this.K0.apply();
                                            break;
                                        }
                                        break;
                                    case 259:
                                        gVar2 = p();
                                        if (i7 == 0) {
                                            SharedPreferences.Editor edit43 = this.J0.edit();
                                            this.K0 = edit43;
                                            int i10 = this.Y + 1;
                                            this.Y = i10;
                                            edit43.putInt("VIRUS_RESEARCH", i10);
                                            this.K0.apply();
                                            break;
                                        }
                                        break;
                                    case 260:
                                        gVar2 = p();
                                        if (i7 == 0) {
                                            SharedPreferences.Editor edit44 = this.J0.edit();
                                            this.K0 = edit44;
                                            int i11 = this.Y + 1;
                                            this.Y = i11;
                                            edit44.putInt("VIRUS_RESEARCH", i11);
                                            this.K0.apply();
                                            break;
                                        }
                                        break;
                                    case 261:
                                        if (i7 == 0) {
                                            gVar2 = p();
                                            break;
                                        } else {
                                            gVar6 = new g(262, R.string.character_1, R.string.sp_quest_262, R.drawable.character_01, R.string.sp_quest_262_l, R.string.sp_quest_262_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar6;
                                            break;
                                        }
                                    case 263:
                                        gVar7 = new g(264, R.string.character_18, R.string.sp_quest_264, R.drawable.character_18, R.string.sp_quest_264_l, R.string.sp_quest_264_r, new int[][]{new int[]{0, 10, -10, 0}, new int[]{0, -10, 0, 0}});
                                        gVar2 = gVar7;
                                        break;
                                    case 264:
                                        gVar2 = p();
                                        if (i7 == 0) {
                                            SharedPreferences.Editor edit45 = this.J0.edit();
                                            this.K0 = edit45;
                                            this.f26291a0 = 1;
                                            edit45.putInt("VIRUS_LAB", 1);
                                            this.K0.apply();
                                            f(265);
                                            this.C0 = 264;
                                            g0(264);
                                            h0(270);
                                            break;
                                        }
                                        break;
                                    case 265:
                                        gVar3 = new g(266, R.string.character_6, R.string.sp_quest_266, R.drawable.character_06, R.string.sp_quest_266_l, R.string.sp_quest_266_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 266:
                                        gVar5 = new g(267, R.string.character_6, R.string.sp_quest_267, R.drawable.character_06, R.string.sp_quest_267_l, R.string.sp_quest_267_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar5;
                                        break;
                                    case 267:
                                        gVar6 = new g(268, R.string.character_6, R.string.sp_quest_268, R.drawable.character_06, R.string.sp_quest_268_l, R.string.sp_quest_268_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar6;
                                        break;
                                    case 268:
                                        gVar7 = new g(269, R.string.character_6, R.string.sp_quest_269, R.drawable.character_06, R.string.sp_quest_269_l, R.string.sp_quest_269_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar7;
                                        break;
                                    case 269:
                                        gVar2 = p();
                                        f(270);
                                        SharedPreferences.Editor edit46 = this.J0.edit();
                                        this.K0 = edit46;
                                        this.f26291a0 = 2;
                                        edit46.putInt("VIRUS_LAB", 2);
                                        this.K0.apply();
                                        break;
                                    case 270:
                                        gVar2 = p();
                                        this.K0 = this.J0.edit();
                                        if (i7 != 0) {
                                            this.f26291a0 = 3;
                                            f(272);
                                        } else {
                                            this.f26291a0 = 4;
                                            f(271);
                                        }
                                        this.C0 = 270;
                                        g0(270);
                                        this.K0.putInt("VIRUS_LAB", this.f26291a0);
                                        this.f26293b0 = true;
                                        this.K0.putBoolean("VIRUS_DONE", true);
                                        this.K0.apply();
                                        break;
                                    case 271:
                                        gVar13 = new g(284, R.string.empty_string, R.string.sp_quest_271, R.drawable.event_text_card, R.string.card_virus_finish, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        P(2, new f(8, -1));
                                        P(2, new f(9, -1));
                                        this.f26308j = true;
                                        SharedPreferences.Editor edit47 = this.J0.edit();
                                        this.K0 = edit47;
                                        this.f26291a0 = 5;
                                        edit47.putInt("VIRUS_LAB", 5);
                                        this.K0.apply();
                                        gVar2 = gVar13;
                                        break;
                                    case 272:
                                        gVar2 = p();
                                        if (i7 == 0) {
                                            SharedPreferences.Editor edit48 = this.J0.edit();
                                            this.K0 = edit48;
                                            this.f26291a0 = 4;
                                            edit48.putInt("VIRUS_LAB", 4);
                                            this.K0.apply();
                                            f(271);
                                            break;
                                        }
                                        break;
                                    case 276:
                                        if (i7 == 0) {
                                            gVar7 = new g(277, R.string.character_12, R.string.sp_quest_277, R.drawable.character_12, R.string.sp_quest_277_l, R.string.sp_quest_277_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            SharedPreferences.Editor edit49 = this.J0.edit();
                                            this.K0 = edit49;
                                            this.Z = true;
                                            edit49.putBoolean("SECURITY_ON", true);
                                            this.K0.apply();
                                            this.C0 = 277;
                                            g0(277);
                                            f(278);
                                            gVar2 = gVar7;
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 280:
                                        gVar6 = p();
                                        g gVar44 = new g(280, R.string.creator, R.string.sp_quest_280, R.drawable.creator, R.string.yes, R.string.no, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar44.m(true);
                                        this.G0.remove(gVar44);
                                        this.G0.remove(gVar44);
                                        this.G0.remove(gVar44);
                                        if (i7 == 0) {
                                            this.f26324r = true;
                                            SharedPreferences.Editor edit50 = this.J0.edit();
                                            this.K0 = edit50;
                                            edit50.putBoolean("HELPER_280", this.f26324r);
                                            this.K0.apply();
                                        }
                                        gVar2 = gVar6;
                                        break;
                                    case 281:
                                        gVar2 = p();
                                        SharedPreferences.Editor edit51 = this.J0.edit();
                                        this.K0 = edit51;
                                        this.U = true;
                                        edit51.putBoolean("GARDENER_EVIDENCE", true);
                                        this.K0.apply();
                                        break;
                                    case 282:
                                        gVar2 = p();
                                        SharedPreferences.Editor edit52 = this.J0.edit();
                                        this.K0 = edit52;
                                        this.U = true;
                                        edit52.putBoolean("GARDENER_EVIDENCE", true);
                                        this.K0.apply();
                                        break;
                                    case 283:
                                        gVar2 = p();
                                        SharedPreferences.Editor edit53 = this.J0.edit();
                                        this.K0 = edit53;
                                        this.U = true;
                                        edit53.putBoolean("GARDENER_EVIDENCE", true);
                                        this.K0.apply();
                                        break;
                                    case 284:
                                        gVar5 = i7 != 0 ? new g(286, R.string.character_7, R.string.sp_quest_286, R.drawable.character_07, R.string.sp_quest_286_l, R.string.sp_quest_286_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}) : new g(285, R.string.character_7, R.string.sp_quest_285, R.drawable.character_07, R.string.sp_quest_285_l, R.string.sp_quest_285_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        g gVar45 = new g(284, R.string.character_7, R.string.sp_quest_284, R.drawable.character_07, R.string.sp_quest_284_l, R.string.sp_quest_284_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar45.m(true);
                                        this.G0.remove(gVar45);
                                        gVar2 = gVar5;
                                        break;
                                    case 285:
                                        gVar6 = new g(289, R.string.character_7, R.string.sp_quest_289, R.drawable.character_07, R.string.sp_quest_289_l, R.string.sp_quest_289_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar6;
                                        break;
                                    case 286:
                                        gVar7 = new g(289, R.string.character_7, R.string.sp_quest_289, R.drawable.character_07, R.string.sp_quest_289_l, R.string.sp_quest_289_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar7;
                                        break;
                                    case 289:
                                        gVar2 = i7 != 0 ? new g(291, R.string.empty_string, R.string.sp_quest_289, R.drawable.event_text_card, R.string.card_ex_machina_2, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}) : new g(290, R.string.empty_string, R.string.sp_quest_289, R.drawable.event_text_card, R.string.card_ex_machina_1, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        SharedPreferences.Editor edit54 = this.J0.edit();
                                        this.K0 = edit54;
                                        this.f26303g0 = true;
                                        edit54.putBoolean("WIFE_DONE", true);
                                        this.K0.apply();
                                        break;
                                    case 290:
                                        gVar7 = new g(292, R.string.character_7, R.string.sp_quest_292, R.drawable.character_07, R.string.sp_quest_292_l, R.string.sp_quest_292_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar7;
                                        break;
                                    case 292:
                                        if (i7 == 0) {
                                            p7 = new g(294, R.string.character_7, R.string.sp_quest_294, R.drawable.character_07, R.string.sp_quest_294_l, R.string.sp_quest_294_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar2 = new g(293, R.string.character_7, R.string.sp_quest_293, R.drawable.character_07, R.string.sp_quest_293_l, R.string.sp_quest_293_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        }
                                    case 293:
                                        gVar8 = new g(294, R.string.character_7, R.string.sp_quest_294, R.drawable.character_07, R.string.sp_quest_294_l, R.string.sp_quest_294_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar8;
                                        break;
                                    case 294:
                                        gVar9 = new g(295, R.string.character_7, R.string.sp_quest_295, R.drawable.character_07, R.string.sp_quest_295_l, R.string.sp_quest_295_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar9;
                                        break;
                                    case 295:
                                        gVar = new g(296, R.string.character_7, R.string.sp_quest_296, R.drawable.character_07, R.string.sp_quest_296_l, R.string.sp_quest_296_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 296:
                                        gVar3 = new g(297, R.string.character_15, R.string.sp_quest_297, R.drawable.character_15, R.string.sp_quest_297_l, R.string.sp_quest_297_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 297:
                                        gVar5 = new g(298, R.string.empty_string, R.string.sp_quest_297, R.drawable.event_text_card, R.string.card_ex_machina_3, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        this.f26304h = true;
                                        gVar2 = gVar5;
                                        break;
                                    case 298:
                                        p7 = new g(168, R.string.empty_string, R.string.end_1, R.drawable.end_card_1, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        g0(168);
                                        o0("CgkIkMOR47gLEAIQAQ");
                                        break;
                                    case 299:
                                        if (i7 == 0) {
                                            gVar2 = p();
                                            break;
                                        } else {
                                            gVar9 = new g(300, R.string.character_13, R.string.sp_quest_300, R.drawable.character_13, R.string.sp_quest_300_l, R.string.sp_quest_300_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar9;
                                            break;
                                        }
                                    case 300:
                                        if (i7 == 0) {
                                            gVar = new g(302, R.string.character_13, R.string.sp_quest_302, R.drawable.character_13, R.string.sp_quest_302_l, R.string.sp_quest_302_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar3 = new g(301, R.string.character_13, R.string.sp_quest_301, R.drawable.character_13, R.string.sp_quest_301_l, R.string.sp_quest_301_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        }
                                    case 303:
                                        if (i7 == 0) {
                                            gVar5 = new g(304, R.string.empty_string, R.string.turn_effect, R.drawable.event_text_card, R.drawable.oracle, R.string.title_oracle, R.string.details_oracle);
                                            P(1, new f(10, 1));
                                            this.f26308j = true;
                                            SharedPreferences.Editor edit55 = this.J0.edit();
                                            this.K0 = edit55;
                                            edit55.putInt("AMOUNT_ITEM_3", this.J0.getInt("AMOUNT_ITEM_3", 0) - 1);
                                            this.K0.apply();
                                            gVar2 = gVar5;
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 305:
                                        if (i7 == 0) {
                                            p7 = new g(306, R.string.character_1, R.string.sp_quest_306, R.drawable.character_01, R.string.sp_quest_306_l, R.string.sp_quest_306_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 306:
                                        if (i7 == 0) {
                                            gVar7 = new g(307, R.string.empty_string, R.string.turn_effect, R.drawable.event_text_card, R.drawable.oracle, R.string.title_oracle, R.string.details_oracle);
                                            P(1, new f(10, 1));
                                            this.f26308j = true;
                                            SharedPreferences.Editor edit56 = this.J0.edit();
                                            this.K0 = edit56;
                                            this.f26307i0 = true;
                                            edit56.putBoolean("ORACLE_TRIED", true);
                                            this.K0.apply();
                                            gVar2 = gVar7;
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 308:
                                        if (i7 == 0) {
                                            gVar9 = new g(311, R.string.character_25, R.string.sp_quest_311, R.drawable.character_25, R.string.sp_quest_311_l, R.string.sp_quest_311_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar9;
                                            break;
                                        } else {
                                            gVar = new g(309, R.string.character_25, R.string.sp_quest_309, R.drawable.character_25, R.string.sp_quest_309_l, R.string.sp_quest_309_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        }
                                    case 309:
                                        if (i7 == 0) {
                                            gVar3 = new g(311, R.string.character_25, R.string.sp_quest_311, R.drawable.character_25, R.string.sp_quest_311_l, R.string.sp_quest_311_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar5 = new g(310, R.string.character_25, R.string.sp_quest_310, R.drawable.character_25, R.string.sp_quest_310_l, R.string.sp_quest_310_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar5;
                                            break;
                                        }
                                    case 311:
                                        gVar6 = new g(312, R.string.character_25, R.string.sp_quest_312, R.drawable.character_25, R.string.sp_quest_312_l, R.string.sp_quest_312_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar6;
                                        break;
                                    case 312:
                                        gVar7 = new g(313, R.string.character_25, R.string.sp_quest_313, R.drawable.character_25, R.string.sp_quest_313_l, R.string.sp_quest_313_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar7;
                                        break;
                                    case 313:
                                        p7 = new g(314, R.string.character_25, R.string.sp_quest_314, R.drawable.character_25, R.string.sp_quest_314_l, R.string.sp_quest_314_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 314:
                                        if (i7 == 0) {
                                            gVar2 = new g(316, R.string.character_25, R.string.sp_quest_316, R.drawable.character_25, R.string.sp_quest_316_l, R.string.sp_quest_316_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar8 = new g(315, R.string.character_25, R.string.sp_quest_315, R.drawable.character_25, R.string.sp_quest_315_l, R.string.sp_quest_315_r, new int[][]{new int[]{0, -10, -10, 0}, new int[]{0, 5, 0, 0}});
                                            gVar2 = gVar8;
                                            break;
                                        }
                                    case 315:
                                        if (i7 == 0) {
                                            gVar9 = new g(318, R.string.character_25, R.string.sp_quest_318, R.drawable.character_25, R.string.sp_quest_318_l, R.string.sp_quest_318_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            f(319);
                                            SharedPreferences.Editor edit57 = this.J0.edit();
                                            this.K0 = edit57;
                                            this.f26313l0 = true;
                                            edit57.putBoolean("LEADER_FOE", true);
                                            this.K0.apply();
                                            gVar2 = gVar9;
                                            break;
                                        } else {
                                            gVar = new g(316, R.string.character_25, R.string.sp_quest_316, R.drawable.character_25, R.string.sp_quest_316_l, R.string.sp_quest_316_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        }
                                    case 316:
                                        gVar3 = new g(317, R.string.character_25, R.string.sp_quest_317, R.drawable.character_25, R.string.sp_quest_317_l, R.string.sp_quest_317_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        f(323);
                                        this.C0 = 323;
                                        g0(323);
                                        SharedPreferences.Editor edit58 = this.J0.edit();
                                        this.K0 = edit58;
                                        this.f26311k0 = true;
                                        edit58.putBoolean("LEADER_FRIEND", true);
                                        this.K0.apply();
                                        break;
                                    case 319:
                                        gVar5 = new g(320, R.string.character_10, R.string.sp_quest_320, R.drawable.character_10, R.string.sp_quest_320_l, R.string.sp_quest_320_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar5;
                                        break;
                                    case 320:
                                        if (i7 == 0) {
                                            gVar6 = new g(322, R.string.character_10, R.string.sp_quest_322, R.drawable.character_10, R.string.sp_quest_322_l, R.string.sp_quest_322_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            f(406);
                                            SharedPreferences.Editor edit59 = this.J0.edit();
                                            this.K0 = edit59;
                                            this.f26313l0 = false;
                                            edit59.putBoolean("LEADER_FOE", false);
                                            this.K0.apply();
                                            gVar2 = gVar6;
                                            break;
                                        } else {
                                            gVar7 = new g(321, R.string.character_10, R.string.sp_quest_321, R.drawable.character_10, R.string.sp_quest_321_l, R.string.sp_quest_321_r, new int[][]{new int[]{0, 5, 0, 0}, new int[]{0, -10, -10, 0}});
                                            gVar2 = gVar7;
                                            break;
                                        }
                                    case 321:
                                        if (i7 == 0) {
                                            p7 = new g(322, R.string.character_10, R.string.sp_quest_322, R.drawable.character_10, R.string.sp_quest_322_l, R.string.sp_quest_322_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            f(406);
                                            SharedPreferences.Editor edit60 = this.J0.edit();
                                            this.K0 = edit60;
                                            this.f26313l0 = false;
                                            edit60.putBoolean("LEADER_FOE", false);
                                            this.K0.apply();
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 323:
                                        gVar2 = p();
                                        SharedPreferences.Editor edit61 = this.J0.edit();
                                        this.K0 = edit61;
                                        int i12 = this.f26315m0 + 1;
                                        this.f26315m0 = i12;
                                        edit61.putInt("CAN_BLACKOUT", i12);
                                        this.K0.apply();
                                        if (this.f26315m0 > 2) {
                                            f(333);
                                            break;
                                        }
                                        break;
                                    case 325:
                                        gVar2 = p();
                                        SharedPreferences.Editor edit62 = this.J0.edit();
                                        this.K0 = edit62;
                                        int i13 = this.f26315m0 + 1;
                                        this.f26315m0 = i13;
                                        edit62.putInt("CAN_BLACKOUT", i13);
                                        this.K0.apply();
                                        if (this.f26315m0 > 2) {
                                            f(333);
                                            break;
                                        }
                                        break;
                                    case 326:
                                        if (i7 == 0) {
                                            gVar5 = new g(327, R.string.character_24, R.string.sp_quest_327, R.drawable.character_24, R.string.sp_quest_327_l, R.string.sp_quest_327_r, new int[][]{new int[]{0, 0, 0, -5}, new int[]{0, 0, 0, 0}});
                                            SharedPreferences.Editor edit63 = this.J0.edit();
                                            this.K0 = edit63;
                                            int i14 = this.f26315m0 + 1;
                                            this.f26315m0 = i14;
                                            edit63.putInt("CAN_BLACKOUT", i14);
                                            this.K0.apply();
                                            if (this.f26315m0 > 2) {
                                                f(333);
                                            }
                                            gVar2 = gVar5;
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 327:
                                        if (i7 == 0) {
                                            p7 = new g(328, R.string.character_24, R.string.sp_quest_328, R.drawable.character_24, R.string.sp_quest_328_l, R.string.sp_quest_328_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 328:
                                        if (i7 == 0) {
                                            gVar6 = new g(329, R.string.character_24, R.string.sp_quest_329, R.drawable.character_24, R.string.sp_quest_329_l, R.string.sp_quest_329_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar6;
                                            break;
                                        } else {
                                            gVar7 = new g(330, R.string.character_24, R.string.sp_quest_330, R.drawable.character_24, R.string.sp_quest_330_l, R.string.sp_quest_330_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar7;
                                            break;
                                        }
                                    case 329:
                                        if (i7 == 0) {
                                            p7 = new g(330, R.string.character_24, R.string.sp_quest_330, R.drawable.character_24, R.string.sp_quest_330_l, R.string.sp_quest_330_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 330:
                                        if (i7 == 0) {
                                            p7 = new g(331, R.string.character_24, R.string.sp_quest_331, R.drawable.character_24, R.string.sp_quest_331_l, R.string.sp_quest_331_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 331:
                                        if (i7 == 0) {
                                            p7 = new g(332, R.string.character_24, R.string.sp_quest_332, R.drawable.character_24, R.string.sp_quest_332_l, R.string.sp_quest_332_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 333:
                                        gVar2 = i7 != 0 ? p() : new g(334, R.string.character_9, R.string.sp_quest_334, R.drawable.character_09, R.string.sp_quest_334_l, R.string.sp_quest_334_r, new int[][]{new int[]{0, -20, 10, 0}, new int[]{0, 10, -20, 0}});
                                        a0();
                                        f(335);
                                        SharedPreferences.Editor edit64 = this.J0.edit();
                                        this.K0 = edit64;
                                        this.f26317n0 = true;
                                        edit64.putBoolean("BLACKOUT", true);
                                        this.K0.apply();
                                        break;
                                    case 335:
                                        p7 = p();
                                        f(336);
                                        if (!I(336)) {
                                            this.C0 = 336;
                                        }
                                        g0(336);
                                        h0(361);
                                        SharedPreferences.Editor edit65 = this.J0.edit();
                                        this.K0 = edit65;
                                        this.f26319o0 = true;
                                        edit65.putBoolean("LEADER_VANISH", true);
                                        this.K0.apply();
                                        g gVar46 = new g(335, R.string.character_1, R.string.sp_quest_335, R.drawable.character_01, R.string.sp_quest_335_l, R.string.sp_quest_335_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, -5, 0, 0}});
                                        gVar46.m(true);
                                        this.G0.remove(gVar46);
                                        this.G0.remove(gVar46);
                                        this.G0.remove(gVar46);
                                        break;
                                    case 336:
                                        p7 = i7 != 0 ? p() : new g(337, R.string.character_1, R.string.sp_quest_337, R.drawable.character_01, R.string.sp_quest_337_l, R.string.sp_quest_337_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        g gVar47 = new g(336, R.string.character_1, R.string.sp_quest_336, R.drawable.character_01, R.string.sp_quest_336_l, R.string.sp_quest_336_r, new int[][]{new int[]{0, 5, 0, 0}, new int[]{0, 0, 10, 0}});
                                        gVar47.m(true);
                                        this.G0.remove(gVar47);
                                        this.G0.remove(gVar47);
                                        f(340);
                                        SharedPreferences.Editor edit66 = this.J0.edit();
                                        this.K0 = edit66;
                                        this.f26321p0 = true;
                                        edit66.putBoolean("CAN_WAR", true);
                                        this.K0.apply();
                                        break;
                                    case 337:
                                        if (i7 == 0) {
                                            gVar2 = p();
                                            break;
                                        } else {
                                            gVar7 = new g(339, R.string.character_1, R.string.sp_quest_339, R.drawable.character_01, R.string.sp_quest_339_l, R.string.sp_quest_339_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar7;
                                            break;
                                        }
                                    case 339:
                                        if (i7 == 0) {
                                            gVar2 = p();
                                            if (this.f26323q0) {
                                                f(344);
                                            }
                                            SharedPreferences.Editor edit67 = this.J0.edit();
                                            this.K0 = edit67;
                                            this.f26325r0 = true;
                                            edit67.putBoolean("LEADER_SEARCHING", true);
                                            this.K0.apply();
                                            break;
                                        } else {
                                            p7 = new g(338, R.string.character_1, R.string.sp_quest_338, R.drawable.character_01, R.string.sp_quest_338_l, R.string.sp_quest_338_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        }
                                    case 340:
                                        gVar14 = new g(398, R.string.empty_string, R.string.continuous_effect, R.drawable.event_text_card, R.drawable.war, R.string.title_war, R.string.details_war);
                                        f(341);
                                        P(1, new f(11, 2));
                                        this.f26308j = true;
                                        SharedPreferences.Editor edit68 = this.J0.edit();
                                        this.K0 = edit68;
                                        this.f26323q0 = true;
                                        edit68.putBoolean("FIRST_WAR", true);
                                        this.K0.apply();
                                        gVar2 = gVar14;
                                        break;
                                    case 341:
                                        if (i7 == 0) {
                                            gVar13 = new g(414, R.string.empty_string, R.string.sp_quest_341, R.drawable.event_text_card, R.string.card_temporary_peace, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            P(2, new f(11, -1));
                                            P(2, new f(9, -1));
                                            this.f26308j = true;
                                            b0();
                                            g gVar48 = new g(341, R.string.character_2, R.string.sp_quest_341, R.drawable.character_02, R.string.sp_quest_341_l, R.string.sp_quest_341_r, new int[][]{new int[]{0, 0, 5, 0}, new int[]{0, -5, 0, 0}});
                                            gVar48.m(true);
                                            this.G0.remove(gVar48);
                                            gVar2 = gVar13;
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 342:
                                        gVar5 = new g(398, R.string.empty_string, R.string.continuous_effect, R.drawable.event_text_card, R.drawable.war, R.string.title_war, R.string.details_war);
                                        f(341);
                                        P(1, new f(11, 2));
                                        this.f26308j = true;
                                        gVar2 = gVar5;
                                        break;
                                    case 343:
                                        if (i7 == 0) {
                                            p7 = new g(337, R.string.character_1, R.string.sp_quest_337, R.drawable.character_01, R.string.sp_quest_337_l, R.string.sp_quest_337_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 344:
                                        gVar = new g(345, R.string.character_1, R.string.sp_quest_345, R.drawable.character_01, R.string.sp_quest_345_l, R.string.sp_quest_345_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        g gVar49 = new g(344, R.string.character_1, R.string.sp_quest_344, R.drawable.character_01, R.string.sp_quest_344_l, R.string.sp_quest_344_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar49.m(true);
                                        this.G0.remove(gVar49);
                                        break;
                                    case 345:
                                        gVar3 = new g(346, R.string.character_25, R.string.sp_quest_346, R.drawable.character_25, R.string.sp_quest_346_l, R.string.sp_quest_346_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 346:
                                        if (i7 == 0) {
                                            gVar5 = new g(348, R.string.character_25, R.string.sp_quest_348, R.drawable.character_25, R.string.sp_quest_348_l, R.string.sp_quest_348_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar5;
                                            break;
                                        } else {
                                            gVar6 = new g(347, R.string.character_25, R.string.sp_quest_347, R.drawable.character_25, R.string.sp_quest_347_l, R.string.sp_quest_347_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar6;
                                            break;
                                        }
                                    case 347:
                                        gVar7 = new g(348, R.string.character_25, R.string.sp_quest_348, R.drawable.character_25, R.string.sp_quest_348_l, R.string.sp_quest_348_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar7;
                                        break;
                                    case 348:
                                        if (i7 == 0) {
                                            p7 = new g(349, R.string.character_25, R.string.sp_quest_349, R.drawable.character_25, R.string.sp_quest_349_l, R.string.sp_quest_349_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar2 = new g(350, R.string.character_25, R.string.sp_quest_350, R.drawable.character_25, R.string.sp_quest_350_l, R.string.sp_quest_350_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        }
                                    case 349:
                                        gVar8 = new g(351, R.string.character_25, R.string.sp_quest_351, R.drawable.character_25, R.string.sp_quest_351_l, R.string.sp_quest_351_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar8;
                                        break;
                                    case 350:
                                        gVar9 = new g(351, R.string.character_25, R.string.sp_quest_351, R.drawable.character_25, R.string.sp_quest_351_l, R.string.sp_quest_351_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar9;
                                        break;
                                    case 351:
                                        if (i7 == 0) {
                                            gVar = new g(352, R.string.character_25, R.string.sp_quest_352, R.drawable.character_25, R.string.sp_quest_352_l, R.string.sp_quest_352_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar3 = new g(353, R.string.character_25, R.string.sp_quest_353, R.drawable.character_25, R.string.sp_quest_353_l, R.string.sp_quest_353_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        }
                                    case 352:
                                        gVar5 = new g(353, R.string.character_25, R.string.sp_quest_353, R.drawable.character_25, R.string.sp_quest_353_l, R.string.sp_quest_353_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar5;
                                        break;
                                    case 353:
                                        gVar6 = new g(354, R.string.character_25, R.string.sp_quest_354, R.drawable.character_25, R.string.sp_quest_354_l, R.string.sp_quest_354_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar6;
                                        break;
                                    case 354:
                                        gVar7 = new g(355, R.string.character_25, R.string.sp_quest_355, R.drawable.character_25, R.string.sp_quest_355_l, R.string.sp_quest_355_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar7;
                                        break;
                                    case 355:
                                        p7 = new g(356, R.string.character_25, R.string.sp_quest_356, R.drawable.character_25, R.string.sp_quest_356_l, R.string.sp_quest_356_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 356:
                                        if (i7 == 0) {
                                            gVar2 = new g(358, R.string.character_25, R.string.sp_quest_358, R.drawable.character_25, R.string.sp_quest_358_l, R.string.sp_quest_358_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar8 = new g(357, R.string.character_25, R.string.sp_quest_357, R.drawable.character_25, R.string.sp_quest_357_l, R.string.sp_quest_357_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar8;
                                            break;
                                        }
                                    case 357:
                                        gVar9 = new g(359, R.string.character_25, R.string.sp_quest_359, R.drawable.character_25, R.string.sp_quest_359_l, R.string.sp_quest_359_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar9;
                                        break;
                                    case 358:
                                        gVar = new g(360, R.string.character_25, R.string.sp_quest_360, R.drawable.character_25, R.string.sp_quest_360_l, R.string.sp_quest_360_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 359:
                                        gVar3 = new g(360, R.string.character_25, R.string.sp_quest_360, R.drawable.character_25, R.string.sp_quest_360_l, R.string.sp_quest_360_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 360:
                                        gVar5 = new g(400, R.string.empty_string, R.string.sp_quest_360, R.drawable.event_text_card, R.string.card_peace, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        this.C0 = 361;
                                        f(361);
                                        g0(361);
                                        SharedPreferences.Editor edit69 = this.J0.edit();
                                        this.K0 = edit69;
                                        this.f26309j0 = true;
                                        edit69.putBoolean("LEADER_DONE", true);
                                        this.K0.apply();
                                        gVar2 = gVar5;
                                        break;
                                    case 361:
                                        if (i7 == 0) {
                                            gVar6 = new g(362, R.string.character_25, R.string.sp_quest_362, R.drawable.character_25, R.string.sp_quest_362_l, R.string.sp_quest_362_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            g gVar50 = new g(361, R.string.character_25, R.string.sp_quest_361, R.drawable.character_25, R.string.sp_quest_361_l, R.string.sp_quest_361_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar50.m(true);
                                            this.G0.remove(gVar50);
                                            this.G0.remove(gVar50);
                                            this.G0.remove(gVar50);
                                            SharedPreferences.Editor edit70 = this.J0.edit();
                                            this.K0 = edit70;
                                            this.f26327s0 = true;
                                            edit70.putBoolean("LEADER_PRESENCE", true);
                                            this.K0.apply();
                                            gVar2 = gVar6;
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 362:
                                        gVar5 = new g(363, R.string.character_25, R.string.sp_quest_363, R.drawable.character_25, R.string.sp_quest_363_l, R.string.sp_quest_363_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar5;
                                        break;
                                    case 363:
                                        gVar6 = new g(364, R.string.character_25, R.string.sp_quest_364, R.drawable.character_25, R.string.sp_quest_364_l, R.string.sp_quest_364_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar6;
                                        break;
                                    case 365:
                                        if (i7 == 0) {
                                            gVar7 = new g(367, R.string.character_24, R.string.sp_quest_367, R.drawable.character_24, R.string.sp_quest_367_l, R.string.sp_quest_367_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar7;
                                            break;
                                        } else {
                                            p7 = new g(366, R.string.character_24, R.string.sp_quest_366, R.drawable.character_24, R.string.sp_quest_366_l, R.string.sp_quest_366_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        }
                                    case 376:
                                        if (i7 == 0) {
                                            boolean z8 = new Random().nextInt(2) + 1 == 1;
                                            int i15 = this.J0.getInt("LAST_DAY", 0);
                                            int i16 = Calendar.getInstance(TimeZone.getDefault()).get(6);
                                            if (this.f26298e < 3 || this.M0.contains(new f(10, -1))) {
                                                z8 = false;
                                            } else if (i15 != i16) {
                                                SharedPreferences.Editor edit71 = this.J0.edit();
                                                this.K0 = edit71;
                                                edit71.putInt("LAST_DAY", i16);
                                                this.K0.apply();
                                                z8 = true;
                                            }
                                            if (!z8) {
                                                gVar2 = v(false);
                                                break;
                                            } else {
                                                gVar5 = new g(407, R.string.character_24, R.string.sp_quest_407, R.drawable.character_24, R.string.sp_quest_407_l, R.string.sp_quest_407_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                g gVar51 = new g(376, R.string.character_24, R.string.sp_quest_376, R.drawable.character_24, R.string.sp_quest_376_l, R.string.sp_quest_376_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                gVar51.m(true);
                                                this.G0.remove(gVar51);
                                                this.G0.remove(gVar51);
                                                gVar2 = gVar5;
                                                break;
                                            }
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                        break;
                                    case 377:
                                        gVar7 = new g(378, R.string.character_24, R.string.sp_quest_378, R.drawable.character_24, R.string.sp_quest_378_l, R.string.sp_quest_378_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar7;
                                        break;
                                    case 378:
                                        if (i7 == 0) {
                                            p7 = new g(379, R.string.character_24, R.string.sp_quest_379, R.drawable.character_24, R.string.sp_quest_379_l, R.string.sp_quest_379_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 380:
                                        if (i7 == 0) {
                                            p7 = new g(381, R.string.character_24, R.string.sp_quest_381, R.drawable.character_24, R.string.sp_quest_381_l, R.string.sp_quest_381_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 382:
                                        if (i7 == 0) {
                                            p7 = new g(384, R.string.character_6, R.string.sp_quest_384, R.drawable.character_06, R.string.sp_quest_384_l, R.string.sp_quest_384_r, new int[][]{new int[]{0, 15, -15, 0}, new int[]{0, 15, 0, -15}});
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 385:
                                        if (i7 == 0) {
                                            p7 = new g(386, R.string.character_3, R.string.sp_quest_386, R.drawable.character_03, R.string.sp_quest_386_l, R.string.sp_quest_386_r, new int[][]{new int[]{0, 15, -15, 0}, new int[]{0, 15, 0, -15}});
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 387:
                                        if (i7 == 0) {
                                            p7 = new g(388, R.string.character_13, R.string.sp_quest_388, R.drawable.character_13, R.string.sp_quest_388_l, R.string.sp_quest_388_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 388:
                                        gVar6 = new g(389, R.string.smartphone, R.string.sp_quest_389, R.drawable.phone_card, R.string.sp_quest_389_l, R.string.sp_quest_389_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar6;
                                        break;
                                    case 389:
                                        gVar7 = new g(390, R.string.smartphone, R.string.sp_quest_390, R.drawable.phone_card, R.string.sp_quest_390_l, R.string.sp_quest_390_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar7;
                                        break;
                                    case 390:
                                        p7 = new g(391, R.string.character_13, R.string.sp_quest_391, R.drawable.character_13, R.string.sp_quest_391_l, R.string.sp_quest_391_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 391:
                                        gVar2 = new g(392, R.string.character_13, R.string.sp_quest_392, R.drawable.character_13, R.string.sp_quest_392_l, R.string.sp_quest_392_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 392:
                                        gVar8 = new g(393, R.string.character_13, R.string.sp_quest_393, R.drawable.character_13, R.string.sp_quest_393_l, R.string.sp_quest_393_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        gVar2 = gVar8;
                                        break;
                                    case 393:
                                        if (i7 == 0) {
                                            gVar9 = new g(394, R.string.character_13, R.string.sp_quest_394, R.drawable.character_13, R.string.sp_quest_394_l, R.string.sp_quest_394_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar9;
                                            break;
                                        } else {
                                            gVar = new g(395, R.string.character_13, R.string.sp_quest_395, R.drawable.character_13, R.string.sp_quest_395_l, R.string.sp_quest_395_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        }
                                    case 394:
                                        gVar3 = new g(396, R.string.character_13, R.string.sp_quest_396, R.drawable.character_13, R.string.sp_quest_396_l, R.string.sp_quest_396_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        SharedPreferences.Editor edit72 = this.J0.edit();
                                        this.K0 = edit72;
                                        this.A0 = true;
                                        edit72.putBoolean("MY_NUMBER", true);
                                        this.K0.apply();
                                        break;
                                    case 395:
                                        gVar5 = new g(396, R.string.character_13, R.string.sp_quest_396, R.drawable.character_13, R.string.sp_quest_396_l, R.string.sp_quest_396_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        SharedPreferences.Editor edit73 = this.J0.edit();
                                        this.K0 = edit73;
                                        this.A0 = true;
                                        edit73.putBoolean("MY_NUMBER", true);
                                        this.K0.apply();
                                        gVar2 = gVar5;
                                        break;
                                    case 397:
                                        gVar2 = p();
                                        SharedPreferences.Editor edit74 = this.J0.edit();
                                        this.K0 = edit74;
                                        this.f26341z0 = true;
                                        edit74.putBoolean("CAN_SEND_MESSAGES", true);
                                        this.K0.apply();
                                        break;
                                    case 399:
                                        gVar14 = new g(274, R.string.empty_string, R.string.turn_effect, R.drawable.event_text_card, R.drawable.cobra, R.string.title_cobra, R.string.details_cobra);
                                        P(1, new f(9, 1));
                                        this.f26308j = true;
                                        gVar2 = gVar14;
                                        break;
                                    case 400:
                                        p7 = p();
                                        P(2, new f(11, -1));
                                        P(2, new f(9, -1));
                                        this.f26308j = true;
                                        g gVar52 = new g(342, R.string.character_2, R.string.sp_quest_342, R.drawable.character_02, R.string.sp_quest_342_l, R.string.sp_quest_342_r, new int[][]{new int[]{0, 0, 15, -15}, new int[]{0, 0, -5, 0}});
                                        gVar52.m(true);
                                        this.G0.remove(gVar52);
                                        g gVar53 = new g(343, R.string.character_1, R.string.sp_quest_343, R.drawable.character_01, R.string.sp_quest_343_l, R.string.sp_quest_343_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, -5, 0, 0}});
                                        gVar53.m(true);
                                        this.G0.remove(gVar53);
                                        this.G0.remove(gVar53);
                                        this.G0.remove(gVar53);
                                        b0();
                                        break;
                                    case 406:
                                        if (i7 == 0) {
                                            gVar5 = new g(308, R.string.character_25, R.string.sp_quest_308, R.drawable.character_25, R.string.sp_quest_308_l, R.string.sp_quest_308_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            g gVar54 = new g(406, R.string.character_10, R.string.sp_quest_406, R.drawable.character_10, R.string.sp_quest_406_l, R.string.sp_quest_406_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar54.m(true);
                                            this.G0.remove(gVar54);
                                            gVar2 = gVar5;
                                            break;
                                        } else {
                                            gVar2 = p();
                                            break;
                                        }
                                    case 407:
                                        if (i7 == 0) {
                                            if (this.P0) {
                                                g gVar55 = new g(411, R.string.creator, R.string.sp_quest_411, R.drawable.creator, R.string.sp_quest_411_l, R.string.sp_quest_411_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                this.O0 = true;
                                                gVar5 = gVar55;
                                            } else {
                                                gVar5 = new g(408, R.string.creator, R.string.sp_quest_408, R.drawable.creator, R.string.sp_quest_408_l, R.string.sp_quest_408_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                SharedPreferences.Editor edit75 = this.J0.edit();
                                                this.K0 = edit75;
                                                this.P0 = true;
                                                edit75.putBoolean("CREATOR_TEA_FIRST", true);
                                                this.K0.apply();
                                            }
                                            g gVar56 = new g(305, R.string.character_1, R.string.sp_quest_305, R.drawable.character_01, R.string.sp_quest_305_l, R.string.sp_quest_305_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar56.m(true);
                                            this.G0.remove(gVar56);
                                            gVar2 = gVar5;
                                            break;
                                        } else {
                                            gVar2 = v(false);
                                            break;
                                        }
                                    case 408:
                                        gVar5 = new g(409, R.string.creator, R.string.sp_quest_409, R.drawable.creator, R.string.sp_quest_409_l, R.string.sp_quest_409_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        this.O0 = true;
                                        gVar2 = gVar5;
                                        break;
                                    case 409:
                                        p7 = i7 != 0 ? v(false) : v(true);
                                        this.O0 = false;
                                        break;
                                    case 410:
                                        gVar5 = new g(412, R.string.empty_string, R.string.turn_effect, R.drawable.event_text_card, R.drawable.oracle, R.string.title_oracle, R.string.details_oracle);
                                        P(1, new f(10, 1));
                                        this.f26308j = true;
                                        gVar2 = gVar5;
                                        break;
                                    case 411:
                                        p7 = i7 != 0 ? v(false) : v(true);
                                        this.O0 = false;
                                        break;
                                    case 413:
                                        gVar = new g(410, R.string.creator, R.string.sp_quest_410, R.drawable.creator, R.string.sp_quest_410_l, R.string.sp_quest_410_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 700:
                                        gVar5 = i7 != 0 ? new g(701, R.string.creator, R.string.sp_quest_book_02, R.drawable.creator, R.string.sp_quest_book_03_l, R.string.sp_quest_book_03_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}) : new g(701, R.string.creator, R.string.sp_quest_book_03, R.drawable.creator, R.string.sp_quest_book_03_l, R.string.sp_quest_book_03_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        this.f26326s = true;
                                        this.K0.putBoolean("BOOK_HELLO", true);
                                        this.K0.apply();
                                        g gVar57 = new g(700, R.string.creator, R.string.sp_quest_book_01, R.drawable.creator, R.string.yes, R.string.no, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        this.G0.remove(gVar57);
                                        this.G0.remove(gVar57);
                                        gVar2 = gVar5;
                                        break;
                                    case 701:
                                        p7 = new g(704, R.string.creator, R.string.sp_quest_book_04, R.drawable.creator, R.string.yes, R.string.no, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        break;
                                    case 704:
                                        if (i7 == 0) {
                                            gVar2 = new g(705, R.string.creator, R.string.sp_quest_book_05, R.drawable.creator, R.string.sp_quest_book_05_l, R.string.sp_quest_book_05_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            break;
                                        } else {
                                            gVar8 = new g(707, R.string.creator, R.string.sp_quest_book_07, R.drawable.creator, R.string.sp_quest_book_06_l, R.string.sp_quest_book_06_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                            gVar2 = gVar8;
                                            break;
                                        }
                                    case 705:
                                        gVar9 = new g(706, R.string.creator, R.string.sp_quest_book_06, R.drawable.creator, R.string.sp_quest_book_06_l, R.string.sp_quest_book_06_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                        Q();
                                        gVar2 = gVar9;
                                        break;
                                    default:
                                        switch (j7) {
                                            case 23:
                                                gVar = new g(24, R.string.empty_string, R.string.continuous_effect, R.drawable.white_card, R.drawable.time_symbol, R.string.title_time, R.string.details_time);
                                                break;
                                            case 24:
                                                gVar3 = new g(25, R.string.unknown_character, R.string.sp_quest_25, R.drawable.character_20, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                break;
                                            case 25:
                                                gVar5 = new g(26, R.string.unknown_character, R.string.sp_quest_26, R.drawable.character_20, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                gVar2 = gVar5;
                                                break;
                                            case 26:
                                                gVar6 = new g(27, R.string.unknown_character, R.string.sp_quest_27, R.drawable.character_20, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                gVar2 = gVar6;
                                                break;
                                            case 27:
                                                gVar7 = new g(28, R.string.unknown_character, R.string.sp_quest_28, R.drawable.character_20, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{10, 10, 10, 10}, new int[]{10, 10, 10, 10}});
                                                gVar2 = gVar7;
                                                break;
                                            case 28:
                                                p7 = new g(29, R.string.unknown_character, R.string.sp_quest_29, R.drawable.character_20, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{-100, -100, -100, -100}, new int[]{-100, -100, -100, -100}});
                                                break;
                                            case 29:
                                                gVar2 = new g(30, R.string.unknown_character, R.string.sp_quest_30, R.drawable.character_20, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                break;
                                            case 30:
                                                gVar12 = new g(31, R.string.unknown_character, R.string.sp_quest_31, R.drawable.character_20, R.string.empty_string, R.string.empty_string, new int[][]{new int[]{50, 50, 50, 50}, new int[]{50, 50, 50, 50}});
                                                gVar2 = gVar12;
                                                break;
                                            case 31:
                                                gVar13 = new g(32, R.string.empty_string, R.string.empty_string, R.drawable.event_text_card, R.string.card_time_2, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                this.C0 = 32;
                                                g0(32);
                                                this.f26302g.remove((Object) 2082);
                                                this.F0.e("MySpecialYears", this.f26302g);
                                                h0(119);
                                                h0(146);
                                                P(2, new f(3, -1));
                                                this.f26308j = true;
                                                this.f26300f = false;
                                                gVar2 = gVar13;
                                                break;
                                            default:
                                                switch (j7) {
                                                    case 33:
                                                        if (i7 == 0) {
                                                            p7 = new g(34, R.string.character_13, R.string.sp_quest_34, R.drawable.character_13, R.string.sp_quest_34_l, R.string.sp_quest_34_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                            break;
                                                        } else {
                                                            gVar2 = p();
                                                            break;
                                                        }
                                                    case 34:
                                                        gVar = new g(35, R.string.character_13, R.string.sp_quest_35, R.drawable.character_13, R.string.sp_quest_35_l, R.string.sp_quest_35_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                        break;
                                                    case 35:
                                                        gVar3 = new g(36, R.string.character_13, R.string.sp_quest_36, R.drawable.character_13, R.string.sp_quest_36_l, R.string.sp_quest_36_r, new int[][]{new int[]{0, 0, 0, -10}, new int[]{0, 0, 0, 0}});
                                                        break;
                                                    case androidx.constraintlayout.widget.h.f1530y1 /* 36 */:
                                                        if (i7 == 0) {
                                                            gVar5 = new g(37, R.string.character_13, R.string.sp_quest_36, R.drawable.event_text_card, R.string.card_research_started, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                            SharedPreferences.Editor edit76 = this.J0.edit();
                                                            this.K0 = edit76;
                                                            this.C = true;
                                                            edit76.putBoolean("TIME_TRAVEL_RESEARCH", true);
                                                            this.K0.apply();
                                                            f(36);
                                                            this.C0 = 36;
                                                            g0(36);
                                                            h0(142);
                                                            gVar2 = gVar5;
                                                            break;
                                                        } else {
                                                            gVar7 = new g(38, R.string.character_13, R.string.sp_quest_36, R.drawable.event_text_card, R.string.card_research_locked, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                            gVar2 = gVar7;
                                                            break;
                                                        }
                                                    default:
                                                        switch (j7) {
                                                            case androidx.constraintlayout.widget.h.f1486s5 /* 39 */:
                                                                if (i7 == 0) {
                                                                    gVar2 = p();
                                                                    SharedPreferences.Editor edit77 = this.J0.edit();
                                                                    this.K0 = edit77;
                                                                    int i17 = this.D + 1;
                                                                    this.D = i17;
                                                                    edit77.putInt("TIME_RESEARCH_LEVEL", i17);
                                                                    this.K0.apply();
                                                                    break;
                                                                } else {
                                                                    gVar2 = p();
                                                                    break;
                                                                }
                                                            case androidx.constraintlayout.widget.h.f1494t5 /* 40 */:
                                                                if (i7 == 0) {
                                                                    gVar2 = p();
                                                                    SharedPreferences.Editor edit78 = this.J0.edit();
                                                                    this.K0 = edit78;
                                                                    int i18 = this.D + 1;
                                                                    this.D = i18;
                                                                    edit78.putInt("TIME_RESEARCH_LEVEL", i18);
                                                                    this.K0.apply();
                                                                    break;
                                                                } else {
                                                                    gVar2 = p();
                                                                    break;
                                                                }
                                                            case androidx.constraintlayout.widget.h.f1502u5 /* 41 */:
                                                                if (i7 == 0) {
                                                                    gVar2 = p();
                                                                    break;
                                                                } else {
                                                                    gVar2 = p();
                                                                    SharedPreferences.Editor edit79 = this.J0.edit();
                                                                    this.K0 = edit79;
                                                                    int i19 = this.D + 1;
                                                                    this.D = i19;
                                                                    edit79.putInt("TIME_RESEARCH_LEVEL", i19);
                                                                    this.K0.apply();
                                                                    break;
                                                                }
                                                            case androidx.constraintlayout.widget.h.f1510v5 /* 42 */:
                                                                if (i7 == 0) {
                                                                    gVar2 = p();
                                                                    break;
                                                                } else {
                                                                    gVar2 = p();
                                                                    SharedPreferences.Editor edit80 = this.J0.edit();
                                                                    this.K0 = edit80;
                                                                    int i20 = this.D + 1;
                                                                    this.D = i20;
                                                                    edit80.putInt("TIME_RESEARCH_LEVEL", i20);
                                                                    this.K0.apply();
                                                                    break;
                                                                }
                                                            case androidx.constraintlayout.widget.h.f1518w5 /* 43 */:
                                                                if (i7 == 0) {
                                                                    p7 = new g(44, R.string.empty_string, R.string.sp_quest_43, R.drawable.event_text_card, R.string.card_army_failure, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                                    this.D0 = 43;
                                                                    break;
                                                                } else {
                                                                    gVar2 = p();
                                                                    break;
                                                                }
                                                            default:
                                                                switch (j7) {
                                                                    case androidx.constraintlayout.widget.h.E5 /* 51 */:
                                                                        if (i7 == 0) {
                                                                            p7 = new g(52, R.string.character_3, R.string.sp_quest_52, R.drawable.character_03, R.string.sp_quest_52_l, R.string.sp_quest_52_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                                            break;
                                                                        } else {
                                                                            gVar2 = p();
                                                                            break;
                                                                        }
                                                                    case androidx.constraintlayout.widget.h.F5 /* 52 */:
                                                                        if (i7 == 0) {
                                                                            gVar2 = p();
                                                                            break;
                                                                        } else {
                                                                            gVar5 = new g(53, R.string.character_3, R.string.sp_quest_53, R.drawable.character_03, R.string.sp_quest_53_l, R.string.sp_quest_53_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                                            gVar2 = gVar5;
                                                                            break;
                                                                        }
                                                                    case androidx.constraintlayout.widget.h.G5 /* 53 */:
                                                                        if (i7 == 0) {
                                                                            gVar6 = new g(54, R.string.character_2, R.string.sp_quest_54, R.drawable.character_02, R.string.sp_quest_54_l, R.string.sp_quest_54_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, -10, 0}});
                                                                            gVar2 = gVar6;
                                                                            break;
                                                                        } else {
                                                                            gVar7 = new g(55, R.string.character_3, R.string.sp_quest_55, R.drawable.character_03, R.string.sp_quest_55_l, R.string.sp_quest_55_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                                            gVar2 = gVar7;
                                                                            break;
                                                                        }
                                                                    default:
                                                                        switch (j7) {
                                                                            case 71:
                                                                                gVar2 = i7 != 0 ? p() : new g(73, R.string.character_2, R.string.sp_quest_73, R.drawable.character_02, R.string.sp_quest_73_l, R.string.sp_quest_73_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, -10, 0}});
                                                                                h0(78);
                                                                                this.G = true;
                                                                                SharedPreferences.Editor edit81 = this.J0.edit();
                                                                                this.K0 = edit81;
                                                                                edit81.putBoolean("PROJECT_STOLEN", this.G);
                                                                                this.K0.apply();
                                                                                break;
                                                                            case 72:
                                                                                gVar2 = i7 != 0 ? new g(75, R.string.character_3, R.string.sp_quest_75, R.drawable.character_03, R.string.sp_quest_75_l, R.string.sp_quest_75_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, -10, 0, 0}}) : new g(73, R.string.character_2, R.string.sp_quest_73, R.drawable.character_02, R.string.sp_quest_73_l, R.string.sp_quest_73_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, -10, 0}});
                                                                                this.G = true;
                                                                                SharedPreferences.Editor edit82 = this.J0.edit();
                                                                                this.K0 = edit82;
                                                                                edit82.putBoolean("PROJECT_STOLEN", this.G);
                                                                                this.K0.apply();
                                                                                break;
                                                                            case 73:
                                                                                if (i7 == 0) {
                                                                                    gVar2 = p();
                                                                                    break;
                                                                                } else {
                                                                                    gVar3 = new g(74, R.string.empty_string, R.string.sp_quest_73, R.drawable.event_text_card, R.string.card_general_angry, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                switch (j7) {
                                                                                    case 77:
                                                                                        if (i7 != 0) {
                                                                                            gVar6 = p();
                                                                                        } else {
                                                                                            gVar6 = p();
                                                                                            f(78);
                                                                                            this.H = true;
                                                                                            SharedPreferences.Editor edit83 = this.J0.edit();
                                                                                            this.K0 = edit83;
                                                                                            edit83.putBoolean("HOME_MOVING", this.H);
                                                                                            this.K0.apply();
                                                                                        }
                                                                                        g gVar58 = new g(77, R.string.character_9, R.string.sp_quest_77, R.drawable.character_09, R.string.sp_quest_77_l, R.string.sp_quest_77_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                                                        gVar58.m(true);
                                                                                        this.G0.remove(gVar58);
                                                                                        gVar2 = gVar6;
                                                                                        break;
                                                                                    case 78:
                                                                                        gVar = new g(79, R.string.empty_string, R.string.sp_quest_78, R.drawable.event_text_card, R.string.card_box_1, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                                                        this.C0 = 78;
                                                                                        g0(78);
                                                                                        h0(91);
                                                                                        g gVar59 = new g(78, R.string.character_9, R.string.sp_quest_78, R.drawable.character_09, R.string.sp_quest_78_l, R.string.sp_quest_78_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                                                        gVar59.m(true);
                                                                                        this.G0.remove(gVar59);
                                                                                        break;
                                                                                    case 79:
                                                                                        gVar6 = new g(80, R.string.character_9, R.string.sp_quest_80, R.drawable.character_09, R.string.sp_quest_80_l, R.string.sp_quest_80_r, new int[][]{new int[]{0, 10, 0, 0}, new int[]{0, 0, 0, 0}});
                                                                                        f(82);
                                                                                        this.I = true;
                                                                                        SharedPreferences.Editor edit84 = this.J0.edit();
                                                                                        this.K0 = edit84;
                                                                                        edit84.putBoolean("PROJECT_FOUND", this.I);
                                                                                        this.K0.apply();
                                                                                        g gVar60 = new g(71, R.string.character_13, R.string.sp_quest_71, R.drawable.character_13, R.string.sp_quest_71_l, R.string.sp_quest_71_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 10, 0, 0}});
                                                                                        gVar60.m(true);
                                                                                        this.G0.remove(gVar60);
                                                                                        g gVar61 = new g(72, R.string.character_13, R.string.sp_quest_72, R.drawable.character_13, R.string.sp_quest_72_l, R.string.sp_quest_72_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                                                        gVar61.m(true);
                                                                                        this.G0.remove(gVar61);
                                                                                        gVar2 = gVar6;
                                                                                        break;
                                                                                    case 80:
                                                                                        if (i7 == 0) {
                                                                                            gVar2 = p();
                                                                                            break;
                                                                                        } else {
                                                                                            gVar14 = new g(81, R.string.character_9, R.string.sp_quest_81, R.drawable.character_09, R.string.sp_quest_81_l, R.string.sp_quest_81_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, -10, 0}});
                                                                                            gVar2 = gVar14;
                                                                                            break;
                                                                                        }
                                                                                    default:
                                                                                        switch (j7) {
                                                                                            case 82:
                                                                                                gVar6 = i7 != 0 ? p() : new g(83, R.string.empty_string, R.string.sp_quest_82, R.drawable.event_text_card, R.string.card_clou_1, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                                                                g gVar62 = new g(82, R.string.character_13, R.string.sp_quest_82, R.drawable.character_13, R.string.sp_quest_82_l, R.string.sp_quest_82_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, -10, 0, 0}});
                                                                                                gVar62.m(true);
                                                                                                this.G0.remove(gVar62);
                                                                                                gVar2 = gVar6;
                                                                                                break;
                                                                                            case 83:
                                                                                                gVar6 = new g(84, R.string.character_13, R.string.sp_quest_84, R.drawable.character_13, R.string.sp_quest_84_l, R.string.sp_quest_84_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                                                                gVar2 = gVar6;
                                                                                                break;
                                                                                            case 84:
                                                                                                gVar7 = new g(85, R.string.character_13, R.string.sp_quest_85, R.drawable.character_13, R.string.sp_quest_85_l, R.string.sp_quest_85_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                                                                gVar2 = gVar7;
                                                                                                break;
                                                                                            case 85:
                                                                                                p7 = new g(86, R.string.character_13, R.string.sp_quest_86, R.drawable.character_13, R.string.sp_quest_86_l, R.string.sp_quest_86_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                                                                break;
                                                                                            case 86:
                                                                                                gVar2 = new g(87, R.string.character_13, R.string.sp_quest_87, R.drawable.character_13, R.string.sp_quest_87_l, R.string.sp_quest_87_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                                                                break;
                                                                                            case 87:
                                                                                                gVar8 = new g(88, R.string.character_13, R.string.sp_quest_88, R.drawable.character_13, R.string.sp_quest_88_l, R.string.sp_quest_88_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                                                                gVar2 = gVar8;
                                                                                                break;
                                                                                            case 88:
                                                                                                gVar9 = new g(89, R.string.character_13, R.string.sp_quest_89, R.drawable.character_13, R.string.sp_quest_89_l, R.string.sp_quest_89_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                                                                gVar2 = gVar9;
                                                                                                break;
                                                                                            case 89:
                                                                                                gVar = new g(90, R.string.character_13, R.string.sp_quest_90, R.drawable.character_13, R.string.sp_quest_90_l, R.string.sp_quest_90_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                                                                break;
                                                                                            case 90:
                                                                                                gVar3 = new g(91, R.string.character_13, R.string.sp_quest_91, R.drawable.character_13, R.string.sp_quest_91_l, R.string.sp_quest_91_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                                                                break;
                                                                                            case 91:
                                                                                                gVar5 = new g(92, R.string.empty_string, R.string.sp_quest_91, R.drawable.event_text_card, R.string.card_clou_2, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                                                                                                f(91);
                                                                                                this.C0 = 91;
                                                                                                g0(91);
                                                                                                this.J = true;
                                                                                                SharedPreferences.Editor edit85 = this.J0.edit();
                                                                                                this.K0 = edit85;
                                                                                                edit85.putBoolean("PRESIDENT_REVEALED", this.J);
                                                                                                this.K0.apply();
                                                                                                gVar2 = gVar5;
                                                                                                break;
                                                                                            default:
                                                                                                gVar2 = p();
                                                                                                break;
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                    } else if (i7 != 0) {
                        gVar2 = p();
                    } else {
                        p7 = p();
                        SharedPreferences.Editor edit86 = this.J0.edit();
                        this.K0 = edit86;
                        if (!this.f26332v) {
                            this.f26334w = true;
                            edit86.putBoolean("MESSAGES_SEEN", true);
                        }
                        this.A = true;
                        this.K0.putBoolean("PHONE_LOST", true);
                        this.K0.apply();
                        f(4);
                        this.G0.remove(new g(47, R.string.unknown_character, R.string.sp_quest_47, R.drawable.phone_matrix_card, R.string.sp_quest_47_l, R.string.sp_quest_47_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}));
                        this.G0.remove(new g(45, R.string.unknown_character, R.string.sp_quest_45, R.drawable.phone_matrix_card, R.string.sp_quest_45_l, R.string.sp_quest_45_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}));
                    }
                    this.H0 = gVar2;
                    this.G0.remove(gVar2);
                    return gVar2;
                }
                this.K0 = this.J0.edit();
                if (i7 != 0) {
                    p7 = p();
                    this.f26332v = false;
                    this.K0.putBoolean("MESSAGES_ERASED", false);
                    this.C0 = 1;
                    g0(1);
                    f(1);
                } else {
                    p7 = p();
                    this.f26332v = true;
                    this.K0.putBoolean("MESSAGES_ERASED", true);
                    this.C0 = 1;
                    g0(1);
                    h0(32);
                    f(1);
                }
                this.f26330u = true;
                this.K0.putBoolean("SP_QUEST_1", true);
                this.K0.apply();
                this.f26302g.remove((Object) 2078);
                this.f26302g.remove((Object) 2079);
                this.F0.e("MySpecialYears", this.f26302g);
                gVar2 = p7;
                this.H0 = gVar2;
                this.G0.remove(gVar2);
                return gVar2;
            }
            gVar3 = new g(3, R.string.smartphone, R.string.sp_quest_3, R.drawable.phone_card, R.string.sp_quest_3_l, R.string.sp_quest_3_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
            gVar2 = gVar3;
            this.H0 = gVar2;
            this.G0.remove(gVar2);
            return gVar2;
        }
        gVar = new g(2, R.string.unknown_character, R.string.sp_quest_2, R.drawable.phone_matrix_card, R.string.sp_quest_2_l, R.string.sp_quest_2_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        gVar2 = gVar;
        this.H0 = gVar2;
        this.G0.remove(gVar2);
        return gVar2;
    }

    public int[] u() {
        return this.I0;
    }

    public g v(boolean z7) {
        int nextInt = new Random().nextInt(5) + 1;
        if (z7) {
            if (nextInt == 1) {
                g gVar = new g(413, R.string.empty_string, R.string.tea_time, R.drawable.event_tea_card, R.string.card_tea_1, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                SharedPreferences.Editor edit = this.J0.edit();
                this.K0 = edit;
                this.f26329t0 = true;
                edit.putBoolean("TEA_1", true);
                if (this.f26329t0 && this.f26331u0 && this.f26333v0 && this.f26335w0 && this.f26337x0 && !this.f26339y0) {
                    this.f26339y0 = true;
                    this.K0.putBoolean("TEA_ALL", true);
                    o0("CgkIkMOR47gLEAIQCg");
                }
                this.K0.apply();
                return gVar;
            }
            if (nextInt == 2) {
                g gVar2 = new g(413, R.string.empty_string, R.string.tea_time, R.drawable.event_tea_card, R.string.card_tea_2, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                SharedPreferences.Editor edit2 = this.J0.edit();
                this.K0 = edit2;
                this.f26331u0 = true;
                edit2.putBoolean("TEA_2", true);
                if (this.f26329t0 && this.f26331u0 && this.f26333v0 && this.f26335w0 && this.f26337x0 && !this.f26339y0) {
                    this.f26339y0 = true;
                    this.K0.putBoolean("TEA_ALL", true);
                    o0("CgkIkMOR47gLEAIQCg");
                }
                this.K0.apply();
                return gVar2;
            }
            if (nextInt == 3) {
                g gVar3 = new g(413, R.string.empty_string, R.string.tea_time, R.drawable.event_tea_card, R.string.card_tea_3, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                SharedPreferences.Editor edit3 = this.J0.edit();
                this.K0 = edit3;
                this.f26333v0 = true;
                edit3.putBoolean("TEA_3", true);
                if (this.f26329t0 && this.f26331u0 && this.f26333v0 && this.f26335w0 && this.f26337x0 && !this.f26339y0) {
                    this.f26339y0 = true;
                    this.K0.putBoolean("TEA_ALL", true);
                    o0("CgkIkMOR47gLEAIQCg");
                }
                this.K0.apply();
                return gVar3;
            }
            if (nextInt == 4) {
                g gVar4 = new g(413, R.string.empty_string, R.string.tea_time, R.drawable.event_tea_card, R.string.card_tea_4, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
                SharedPreferences.Editor edit4 = this.J0.edit();
                this.K0 = edit4;
                this.f26335w0 = true;
                edit4.putBoolean("TEA_4", true);
                if (this.f26329t0 && this.f26331u0 && this.f26333v0 && this.f26335w0 && this.f26337x0 && !this.f26339y0) {
                    this.f26339y0 = true;
                    this.K0.putBoolean("TEA_ALL", true);
                    o0("CgkIkMOR47gLEAIQCg");
                }
                this.K0.apply();
                return gVar4;
            }
            if (nextInt != 5) {
                return new g(413, R.string.empty_string, R.string.tea_time, R.drawable.event_tea_card, R.string.card_tea_1, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
            }
            g gVar5 = new g(413, R.string.empty_string, R.string.tea_time, R.drawable.event_tea_card, R.string.card_tea_5, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
            SharedPreferences.Editor edit5 = this.J0.edit();
            this.K0 = edit5;
            this.f26337x0 = true;
            edit5.putBoolean("TEA_5", true);
            if (this.f26329t0 && this.f26331u0 && this.f26333v0 && this.f26335w0 && this.f26337x0 && !this.f26339y0) {
                this.f26339y0 = true;
                this.K0.putBoolean("TEA_ALL", true);
                o0("CgkIkMOR47gLEAIQCg");
            }
            this.K0.apply();
            return gVar5;
        }
        if (nextInt == 1) {
            g gVar6 = new g(401, R.string.empty_string, R.string.tea_time, R.drawable.event_tea_card, R.string.card_tea_1, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
            SharedPreferences.Editor edit6 = this.J0.edit();
            this.K0 = edit6;
            this.f26329t0 = true;
            edit6.putBoolean("TEA_1", true);
            if (this.f26329t0 && this.f26331u0 && this.f26333v0 && this.f26335w0 && this.f26337x0 && !this.f26339y0) {
                this.f26339y0 = true;
                this.K0.putBoolean("TEA_ALL", true);
                o0("CgkIkMOR47gLEAIQCg");
            }
            this.K0.apply();
            return gVar6;
        }
        if (nextInt == 2) {
            g gVar7 = new g(402, R.string.empty_string, R.string.tea_time, R.drawable.event_tea_card, R.string.card_tea_2, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
            SharedPreferences.Editor edit7 = this.J0.edit();
            this.K0 = edit7;
            this.f26331u0 = true;
            edit7.putBoolean("TEA_2", true);
            if (this.f26329t0 && this.f26331u0 && this.f26333v0 && this.f26335w0 && this.f26337x0 && !this.f26339y0) {
                this.f26339y0 = true;
                this.K0.putBoolean("TEA_ALL", true);
                o0("CgkIkMOR47gLEAIQCg");
            }
            this.K0.apply();
            return gVar7;
        }
        if (nextInt == 3) {
            g gVar8 = new g(403, R.string.empty_string, R.string.tea_time, R.drawable.event_tea_card, R.string.card_tea_3, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
            SharedPreferences.Editor edit8 = this.J0.edit();
            this.K0 = edit8;
            this.f26333v0 = true;
            edit8.putBoolean("TEA_3", true);
            if (this.f26329t0 && this.f26331u0 && this.f26333v0 && this.f26335w0 && this.f26337x0 && !this.f26339y0) {
                this.f26339y0 = true;
                this.K0.putBoolean("TEA_ALL", true);
                o0("CgkIkMOR47gLEAIQCg");
            }
            this.K0.apply();
            return gVar8;
        }
        if (nextInt == 4) {
            g gVar9 = new g(404, R.string.empty_string, R.string.tea_time, R.drawable.event_tea_card, R.string.card_tea_4, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
            SharedPreferences.Editor edit9 = this.J0.edit();
            this.K0 = edit9;
            this.f26335w0 = true;
            edit9.putBoolean("TEA_4", true);
            if (this.f26329t0 && this.f26331u0 && this.f26333v0 && this.f26335w0 && this.f26337x0 && !this.f26339y0) {
                this.f26339y0 = true;
                this.K0.putBoolean("TEA_ALL", true);
                o0("CgkIkMOR47gLEAIQCg");
            }
            this.K0.apply();
            return gVar9;
        }
        if (nextInt != 5) {
            return new g(401, R.string.empty_string, R.string.tea_time, R.drawable.event_tea_card, R.string.card_tea_1, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        }
        g gVar10 = new g(405, R.string.empty_string, R.string.tea_time, R.drawable.event_tea_card, R.string.card_tea_5, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        SharedPreferences.Editor edit10 = this.J0.edit();
        this.K0 = edit10;
        this.f26337x0 = true;
        edit10.putBoolean("TEA_5", true);
        if (this.f26329t0 && this.f26331u0 && this.f26333v0 && this.f26335w0 && this.f26337x0 && !this.f26339y0) {
            this.f26339y0 = true;
            this.K0.putBoolean("TEA_ALL", true);
            o0("CgkIkMOR47gLEAIQCg");
        }
        this.K0.apply();
        return gVar10;
    }

    public int w() {
        return this.f26298e;
    }

    public g x() {
        g gVar;
        switch (this.f26306i) {
            case 1:
                g gVar2 = new g(1001, R.string.character_6, R.string.undeath_1, R.drawable.character_06, R.string.yes, R.string.no, new int[][]{new int[]{-20, 25, 0, 0}, new int[]{-20, 25, 0, 0}});
                P(2, new f(7, -1));
                this.f26308j = true;
                gVar = gVar2;
                break;
            case 2:
                g gVar3 = new g(1002, R.string.character_6, R.string.undeath_2, R.drawable.character_06, R.string.yes, R.string.no, new int[][]{new int[]{30, 0, 0, 0}, new int[]{30, 0, 0, 0}});
                P(2, new f(2, -1));
                this.f26308j = true;
                gVar = gVar3;
                break;
            case 3:
                g gVar4 = new g(1003, R.string.character_9, R.string.undeath_3, R.drawable.character_09, R.string.yes, R.string.no, new int[][]{new int[]{0, 30, 0, 0}, new int[]{0, 30, 0, 0}});
                P(2, new f(7, -1));
                this.f26308j = true;
                gVar = gVar4;
                break;
            case 4:
                g gVar5 = new g(1004, R.string.character_10, R.string.undeath_4, R.drawable.character_10, R.string.yes, R.string.no, new int[][]{new int[]{0, 30, 0, 0}, new int[]{0, 30, 0, 0}});
                P(2, new f(4, -1));
                this.f26308j = true;
                gVar = gVar5;
                break;
            case 5:
                g gVar6 = new g(1005, R.string.character_9, R.string.undeath_5, R.drawable.character_09, R.string.yes, R.string.no, new int[][]{new int[]{0, 0, -25, 0}, new int[]{0, 0, -25, 0}});
                P(2, new f(7, -1));
                this.f26308j = true;
                gVar = gVar6;
                break;
            case 6:
                g gVar7 = new g(1006, R.string.character_2, R.string.undeath_6, R.drawable.character_02, R.string.yes, R.string.no, new int[][]{new int[]{0, 0, 30, 0}, new int[]{0, 0, 30, 0}});
                P(2, new f(1, -1));
                this.f26308j = true;
                gVar = gVar7;
                break;
            case 7:
                g gVar8 = new g(1007, R.string.character_10, R.string.undeath_7, R.drawable.character_10, R.string.yes, R.string.no, new int[][]{new int[]{0, 30, 0, 0}, new int[]{0, 30, 0, 0}});
                P(2, new f(6, -1));
                this.f26308j = true;
                gVar = gVar8;
                break;
            case 8:
                g gVar9 = new g(1008, R.string.character_4, R.string.undeath_8, R.drawable.character_04, R.string.yes, R.string.no, new int[][]{new int[]{0, 0, 0, 30}, new int[]{0, 0, 0, 30}});
                P(2, new f(5, -1));
                this.f26308j = true;
                gVar = gVar9;
                break;
            case 9:
                g gVar10 = new g(1009, R.string.character_9, R.string.undeath_9, R.drawable.character_09, R.string.yes, R.string.no, new int[][]{new int[]{0, 0, 0, -25}, new int[]{0, 0, 0, -25}});
                P(2, new f(7, -1));
                this.f26308j = true;
                gVar = gVar10;
                break;
            default:
                gVar = null;
                break;
        }
        this.f26306i = 0;
        this.H0 = gVar;
        return gVar;
    }

    public g y(boolean z7) {
        g gVar = z7 ? new g(410, R.string.creator, R.string.sp_quest_410, R.drawable.creator, R.string.sp_quest_410_l, R.string.sp_quest_410_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}) : new g(415, R.string.creator, R.string.sp_quest_415, R.drawable.creator, R.string.sp_quest_415_l, R.string.sp_quest_415_r, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}});
        gVar.m(true);
        this.H0 = gVar;
        return gVar;
    }

    public void z() {
        this.f26312l++;
        SharedPreferences.Editor edit = this.J0.edit();
        this.K0 = edit;
        edit.putInt("STORY_PROGRESS", this.f26312l);
        this.K0.apply();
    }
}
