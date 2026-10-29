package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: MyApplication */
final class ta5 extends bu2 implements k95 {
    public static final /* synthetic */ int Z = 0;
    private final oc1 A;
    private final id5 B;
    private int C;
    private int D;
    private boolean E;
    private xc5 F;
    private yc5 G;
    private j95 H;
    private en I;
    private jc J;
    private Object K;
    private Surface L;
    private int M;
    private z92 N;
    private mb1 O;
    private float P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private int T;
    private jc U;
    private gc5 V;
    private int W;
    private long X;
    private tr5 Y;

    /* renamed from: b, reason: collision with root package name */
    final hu5 f16077b;

    /* renamed from: c, reason: collision with root package name */
    final en f16078c;

    /* renamed from: d, reason: collision with root package name */
    private final sg1 f16079d = new sg1(pd1.f13828a);

    /* renamed from: e, reason: collision with root package name */
    private final Context f16080e;

    /* renamed from: f, reason: collision with root package name */
    private final mr f16081f;

    /* renamed from: g, reason: collision with root package name */
    private final pc5[] f16082g;

    /* renamed from: h, reason: collision with root package name */
    private final pc5[] f16083h;

    /* renamed from: i, reason: collision with root package name */
    private final gu5 f16084i;

    /* renamed from: j, reason: collision with root package name */
    private final zn1 f16085j;

    /* renamed from: k, reason: collision with root package name */
    private final db5 f16086k;

    /* renamed from: l, reason: collision with root package name */
    private final fb5 f16087l;

    /* renamed from: m, reason: collision with root package name */
    private final fu1 f16088m;

    /* renamed from: n, reason: collision with root package name */
    private final CopyOnWriteArraySet f16089n;

    /* renamed from: o, reason: collision with root package name */
    private final ot f16090o;

    /* renamed from: p, reason: collision with root package name */
    private final List f16091p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f16092q;

    /* renamed from: r, reason: collision with root package name */
    private final md5 f16093r;

    /* renamed from: s, reason: collision with root package name */
    private final Looper f16094s;

    /* renamed from: t, reason: collision with root package name */
    private final qu5 f16095t;

    /* renamed from: u, reason: collision with root package name */
    private final pd1 f16096u;

    /* renamed from: v, reason: collision with root package name */
    private final r95 f16097v;

    /* renamed from: w, reason: collision with root package name */
    private final ra5 f16098w;

    /* renamed from: x, reason: collision with root package name */
    private final kd5 f16099x;

    /* renamed from: y, reason: collision with root package name */
    private final ld5 f16100y;

    /* renamed from: z, reason: collision with root package name */
    private final long f16101z;

    static {
        ka.b("media3.exoplayer");
    }

    public ta5(i95 i95Var, mr mrVar) {
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = hi2.f9535a;
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length() + 1);
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [AndroidXMedia3/1.8.0] [");
            sb.append(str);
            sb.append("]");
            gv1.b("ExoPlayerImpl", sb.toString());
            this.f16080e = i95Var.f9903a.getApplicationContext();
            this.f16093r = (md5) i95Var.f9910h.apply(i95Var.f9904b);
            this.T = i95Var.f9912j;
            this.O = i95Var.f9913k;
            this.M = i95Var.f9914l;
            this.Q = false;
            this.f16101z = i95Var.f9919q;
            r95 r95Var = new r95(this, null);
            this.f16097v = r95Var;
            this.f16098w = new ra5(null);
            pc5[] a8 = ((vc5) i95Var.f9905c.a()).a(new Handler(i95Var.f9911i), r95Var, r95Var, r95Var, r95Var);
            this.f16082g = a8;
            int length = a8.length;
            this.f16083h = new pc5[2];
            int i7 = 0;
            while (true) {
                pc5[] pc5VarArr = this.f16083h;
                int length2 = pc5VarArr.length;
                if (i7 >= 2) {
                    break;
                }
                pc5 pc5Var = this.f16082g[i7];
                pc5VarArr[i7] = null;
                i7++;
            }
            gu5 gu5Var = (gu5) i95Var.f9907e.a();
            this.f16084i = gu5Var;
            qu5 qu5Var = (qu5) i95Var.f9909g.a();
            this.f16095t = qu5Var;
            this.f16092q = i95Var.f9915m;
            this.G = i95Var.f9916n;
            this.F = i95Var.f9917o;
            Looper looper = i95Var.f9911i;
            this.f16094s = looper;
            pd1 pd1Var = i95Var.f9904b;
            this.f16096u = pd1Var;
            this.f16081f = mrVar;
            this.f16088m = new fu1(looper, pd1Var, new bq1() { // from class: com.google.android.gms.internal.ads.qa5
                @Override // com.google.android.gms.internal.ads.bq1
                public final /* synthetic */ void a(Object obj, km5 km5Var) {
                    ta5.this.v((jp) obj, km5Var);
                }
            });
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f16089n = copyOnWriteArraySet;
            this.f16091p = new ArrayList();
            this.Y = new tr5(0);
            this.H = j95.f10415b;
            int length3 = this.f16082g.length;
            hu5 hu5Var = new hu5(new tc5[2], new zt5[2], d70.f6956b, null);
            this.f16077b = hu5Var;
            this.f16090o = new ot();
            dm dmVar = new dm();
            dmVar.c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            gu5Var.c();
            dmVar.b(29, true);
            dmVar.b(23, false);
            dmVar.b(25, false);
            dmVar.b(33, false);
            dmVar.b(26, false);
            dmVar.b(34, false);
            en e8 = dmVar.e();
            this.f16078c = e8;
            dm dmVar2 = new dm();
            dmVar2.d(e8);
            dmVar2.a(4);
            dmVar2.a(10);
            this.I = dmVar2.e();
            this.f16085j = pd1Var.c(looper, null);
            db5 db5Var = new db5() { // from class: com.google.android.gms.internal.ads.s95
                @Override // com.google.android.gms.internal.ads.db5
                public final /* synthetic */ void a(cb5 cb5Var) {
                    ta5.this.y(cb5Var);
                }
            };
            this.f16086k = db5Var;
            this.V = gc5.a(hu5Var);
            this.f16093r.u(mrVar, looper);
            final ni5 ni5Var = new ni5(i95Var.f9926x);
            fb5 fb5Var = new fb5(this.f16080e, this.f16082g, this.f16083h, gu5Var, hu5Var, (kb5) i95Var.f9908f.a(), qu5Var, 0, false, this.f16093r, this.G, i95Var.f9927y, i95Var.f9918p, false, false, looper, pd1Var, db5Var, ni5Var, null, this.H, this.f16098w);
            this.f16087l = fb5Var;
            Looper y02 = fb5Var.y0();
            this.P = 1.0f;
            jc jcVar = jc.B;
            this.J = jcVar;
            this.U = jcVar;
            this.W = -1;
            int i8 = xy0.f19303b;
            this.R = true;
            L(this.f16093r);
            qu5Var.a(new Handler(looper), this.f16093r);
            copyOnWriteArraySet.add(this.f16097v);
            if (Build.VERSION.SDK_INT >= 31) {
                final Context context = this.f16080e;
                final boolean z7 = i95Var.f9924v;
                pd1Var.c(fb5Var.y0(), null).j(new Runnable() { // from class: com.google.android.gms.internal.ads.l95
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        gi5 t7 = gi5.t(context);
                        if (t7 == null) {
                            gv1.c("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z7) {
                            this.d(t7);
                        }
                        ni5Var.b(t7.u());
                    }
                });
            }
            oc1 oc1Var = new oc1(0, y02, looper, pd1Var, new nb1() { // from class: com.google.android.gms.internal.ads.ea5
                @Override // com.google.android.gms.internal.ads.nb1
                public final /* synthetic */ void a(Object obj, Object obj2) {
                    int intValue = ((Integer) obj2).intValue();
                    ta5.this.A(((Integer) obj).intValue(), intValue);
                }
            });
            this.A = oc1Var;
            oc1Var.c(new Runnable() { // from class: com.google.android.gms.internal.ads.ja5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    ta5.this.B();
                }
            });
            new bp4(i95Var.f9903a, y02, i95Var.f9911i, this.f16097v, pd1Var);
            this.f16099x = new kd5(i95Var.f9903a, y02, pd1Var);
            this.f16100y = new ld5(i95Var.f9903a, y02, pd1Var);
            int i9 = dd5.f7067a;
            te0 te0Var = te0.f16148d;
            this.N = z92.f20075c;
            this.B = new id5(this, this.f16097v, pd1Var, i95Var.f9920r, i95Var.f9921s, i95Var.f9922t, i95Var.f9923u);
            fb5Var.s0(this.F);
            fb5Var.u0(this.O, false);
            o0(1, 3, this.O);
            o0(2, 4, Integer.valueOf(this.M));
            o0(2, 5, 0);
            o0(1, 9, Boolean.valueOf(this.Q));
            o0(6, 8, this.f16098w);
            o0(-1, 16, Integer.valueOf(this.T));
            this.f16079d.a();
        } catch (Throwable th) {
            this.f16079d.a();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final void P(b45 b45Var) {
        gc5 gc5Var = this.V;
        gc5 h8 = gc5Var.h(gc5Var.f8794b);
        h8.f8809q = h8.f8811s;
        h8.f8810r = 0L;
        gc5 g02 = g0(h8, 1);
        if (b45Var != null) {
            g02 = g02.f(b45Var);
        }
        this.C++;
        this.f16087l.t0();
        d0(g02, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private final int a0(gc5 gc5Var) {
        az azVar = gc5Var.f8793a;
        return azVar.g() ? this.W : azVar.o(gc5Var.f8794b.f18924a, this.f16090o).f13477c;
    }

    private final long b0(gc5 gc5Var) {
        xp5 xp5Var = gc5Var.f8794b;
        if (!xp5Var.b()) {
            return hi2.M(c0(gc5Var));
        }
        az azVar = gc5Var.f8793a;
        azVar.o(xp5Var.f18924a, this.f16090o);
        long j7 = gc5Var.f8795c;
        if (j7 != -9223372036854775807L) {
            return hi2.M(0L) + hi2.M(j7);
        }
        long j8 = azVar.b(a0(gc5Var), this.f6007a, 0L).f19906k;
        return hi2.M(0L);
    }

    private final long c0(gc5 gc5Var) {
        az azVar = gc5Var.f8793a;
        if (azVar.g()) {
            return hi2.N(this.X);
        }
        long j7 = gc5Var.f8811s;
        xp5 xp5Var = gc5Var.f8794b;
        if (xp5Var.b()) {
            return j7;
        }
        i0(azVar, xp5Var, j7);
        return j7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0470 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x047a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0484 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0497 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e7  */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d0(final com.google.android.gms.internal.ads.gc5 r33, final int r34, boolean r35, int r36, long r37, int r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 1263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ta5.d0(com.google.android.gms.internal.ads.gc5, int, boolean, int, long, int, boolean):void");
    }

    private static long e0(gc5 gc5Var) {
        yx yxVar = new yx();
        ot otVar = new ot();
        az azVar = gc5Var.f8793a;
        azVar.o(gc5Var.f8794b.f18924a, otVar);
        long j7 = gc5Var.f8795c;
        if (j7 != -9223372036854775807L) {
            return j7;
        }
        long j8 = azVar.b(otVar.f13477c, yxVar, 0L).f19906k;
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.ads.gc5 f0(com.google.android.gms.internal.ads.gc5 r23, com.google.android.gms.internal.ads.az r24, android.util.Pair r25) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ta5.f0(com.google.android.gms.internal.ads.gc5, com.google.android.gms.internal.ads.az, android.util.Pair):com.google.android.gms.internal.ads.gc5");
    }

    private static gc5 g0(gc5 gc5Var, int i7) {
        gc5 e8 = gc5Var.e(i7);
        return (i7 == 1 || i7 == 4) ? e8.g(false) : e8;
    }

    private final Pair h0(az azVar, int i7, long j7) {
        if (azVar.g()) {
            this.W = i7;
            if (j7 == -9223372036854775807L) {
                j7 = 0;
            }
            this.X = j7;
            return null;
        }
        if (i7 == -1 || i7 >= azVar.a()) {
            i7 = azVar.k(false);
            long j8 = azVar.b(i7, this.f6007a, 0L).f19906k;
            j7 = hi2.M(0L);
        }
        return azVar.m(this.f6007a, this.f16090o, i7, hi2.N(j7));
    }

    private final long i0(az azVar, xp5 xp5Var, long j7) {
        azVar.o(xp5Var.f18924a, this.f16090o);
        return j7;
    }

    private final kc5 j0(jc5 jc5Var) {
        int a02 = a0(this.V);
        az azVar = this.V.f8793a;
        if (a02 == -1) {
            a02 = 0;
        }
        pd1 pd1Var = this.f16096u;
        fb5 fb5Var = this.f16087l;
        return new kc5(fb5Var, jc5Var, azVar, a02, pd1Var, fb5Var.y0());
    }

    private final void k0(Object obj) {
        Object obj2 = this.K;
        boolean z7 = false;
        if (obj2 != null && obj2 != obj) {
            z7 = true;
        }
        boolean w02 = this.f16087l.w0(obj, z7 ? this.f16101z : -9223372036854775807L);
        if (z7) {
            Object obj3 = this.K;
            Surface surface = this.L;
            if (obj3 == surface) {
                surface.release();
                this.L = null;
            }
        }
        this.K = obj;
        if (w02) {
            return;
        }
        P(b45.c(new gb5(3), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final void S(final int i7, final int i8) {
        if (i7 == this.N.a() && i8 == this.N.b()) {
            return;
        }
        this.N = new z92(i7, i8);
        fu1 fu1Var = this.f16088m;
        fu1Var.d(24, new ap1() { // from class: com.google.android.gms.internal.ads.ga5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
                int i9 = ta5.Z;
                ((jp) obj).A(i7, i8);
            }
        });
        fu1Var.e();
        o0(2, 14, new z92(i7, i8));
    }

    private final void m0() {
        int g8 = g();
        if (g8 != 2 && g8 != 3) {
            this.f16099x.a(false);
            this.f16100y.a(false);
        } else {
            n0();
            boolean z7 = this.V.f8808p;
            this.f16099x.a(l());
            this.f16100y.a(l());
        }
    }

    private final void n0() {
        this.f16079d.d();
        Looper looper = this.f16094s;
        if (Thread.currentThread() != looper.getThread()) {
            Object[] objArr = {Thread.currentThread().getName(), looper.getThread().getName()};
            String str = hi2.f9535a;
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", objArr);
            if (this.R) {
                throw new IllegalStateException(format);
            }
            gv1.d("ExoPlayerImpl", format, this.S ? null : new IllegalStateException());
            this.S = true;
        }
    }

    private final void o0(int i7, int i8, Object obj) {
        pc5[] pc5VarArr = this.f16082g;
        int length = pc5VarArr.length;
        for (int i9 = 0; i9 < 2; i9++) {
            pc5 pc5Var = pc5VarArr[i9];
            if (i7 == -1 || pc5Var.a() == i7) {
                kc5 j02 = j0(pc5Var);
                j02.b(i8);
                j02.d(obj);
                j02.g();
            }
        }
        pc5[] pc5VarArr2 = this.f16083h;
        int length2 = pc5VarArr2.length;
        for (int i10 = 0; i10 < 2; i10++) {
            pc5 pc5Var2 = pc5VarArr2[i10];
            if (pc5Var2 != null && (i7 == -1 || pc5Var2.a() == i7)) {
                kc5 j03 = j0(pc5Var2);
                j03.b(i8);
                j03.d(obj);
                j03.g();
            }
        }
    }

    final /* synthetic */ void A(int i7, final int i8) {
        n0();
        Integer valueOf = Integer.valueOf(i8);
        o0(1, 10, valueOf);
        o0(2, 10, valueOf);
        ap1 ap1Var = new ap1() { // from class: com.google.android.gms.internal.ads.ha5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
                int i9 = ta5.Z;
                ((jp) obj).v(i8);
            }
        };
        fu1 fu1Var = this.f16088m;
        fu1Var.d(21, ap1Var);
        fu1Var.e();
    }

    final /* synthetic */ void B() {
        String str = hi2.f9535a;
        int generateAudioSessionId = gl0.a(this.f16080e).generateAudioSessionId();
        if (generateAudioSessionId == -1) {
            generateAudioSessionId = 0;
        }
        this.A.b(Integer.valueOf(generateAudioSessionId));
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final long C() {
        n0();
        return b0(this.V);
    }

    @Override // com.google.android.gms.internal.ads.k95
    public final int D() {
        n0();
        int length = this.f16082g.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final int E() {
        n0();
        if (H()) {
            return this.V.f8794b.f18925b;
        }
        return -1;
    }

    final /* synthetic */ void F(jp jpVar) {
        jpVar.q(this.I);
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final long G() {
        n0();
        return hi2.M(this.V.f8810r);
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final boolean H() {
        n0();
        return this.V.f8794b.b();
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final void I(float f8) {
        n0();
        String str = hi2.f9535a;
        final float max = Math.max(0.0f, Math.min(f8, 1.0f));
        if (this.P == max) {
            return;
        }
        this.P = max;
        this.f16087l.v0(max);
        fu1 fu1Var = this.f16088m;
        fu1Var.d(22, new ap1() { // from class: com.google.android.gms.internal.ads.la5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
                int i7 = ta5.Z;
                ((jp) obj).H(max);
            }
        });
        fu1Var.e();
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final void J(boolean z7) {
        n0();
        gc5 gc5Var = this.V;
        int i7 = gc5Var.f8806n;
        int i8 = 0;
        if (i7 == 1) {
            if (z7) {
                i7 = 1;
            } else {
                i7 = 1;
                i8 = 1;
            }
        }
        if (gc5Var.f8804l == z7 && i7 == i8 && gc5Var.f8805m == 1) {
            return;
        }
        this.C++;
        gc5 i9 = gc5Var.i(z7, 1, i8);
        this.f16087l.q0(z7, 1, i8);
        d0(i9, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final void K(jp jpVar) {
        n0();
        this.f16088m.c(jpVar);
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final void L(jp jpVar) {
        jpVar.getClass();
        this.f16088m.b(jpVar);
    }

    @Override // com.google.android.gms.internal.ads.k95
    public final void M() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = hi2.f9535a;
        String a8 = ka.a();
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(str).length() + 3 + String.valueOf(a8).length() + 1);
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [AndroidXMedia3/1.8.0] [");
        sb.append(str);
        sb.append("] [");
        sb.append(a8);
        sb.append("]");
        gv1.b("ExoPlayerImpl", sb.toString());
        n0();
        this.f16099x.a(false);
        this.f16100y.a(false);
        this.B.j();
        if (!this.f16087l.x0()) {
            fu1 fu1Var = this.f16088m;
            fu1Var.d(10, ka5.f10947a);
            fu1Var.e();
        }
        this.f16088m.f();
        this.f16085j.i(null);
        qu5 qu5Var = this.f16095t;
        md5 md5Var = this.f16093r;
        qu5Var.b(md5Var);
        gc5 gc5Var = this.V;
        boolean z7 = gc5Var.f8808p;
        gc5 g02 = g0(gc5Var, 1);
        this.V = g02;
        gc5 h8 = g02.h(g02.f8794b);
        this.V = h8;
        h8.f8809q = h8.f8811s;
        this.V.f8810r = 0L;
        md5Var.E();
        Surface surface = this.L;
        if (surface != null) {
            surface.release();
            this.L = null;
        }
        int i7 = xy0.f19303b;
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final void N(Surface surface) {
        n0();
        k0(surface);
        int i7 = surface == null ? 0 : -1;
        S(i7, i7);
    }

    final /* synthetic */ void O(cb5 cb5Var) {
        boolean z7;
        int i7 = this.C - cb5Var.f6353c;
        this.C = i7;
        boolean z8 = true;
        if (cb5Var.f6354d) {
            this.D = cb5Var.f6355e;
            this.E = true;
        }
        if (i7 == 0) {
            az azVar = cb5Var.f6352b.f8793a;
            if (!this.V.f8793a.g() && azVar.g()) {
                this.W = -1;
                this.X = 0L;
            }
            if (!azVar.g()) {
                List y7 = ((mc5) azVar).y();
                int size = y7.size();
                List list = this.f16091p;
                rx3.h(size == list.size());
                for (int i8 = 0; i8 < y7.size(); i8++) {
                    ((sa5) list.get(i8)).c((az) y7.get(i8));
                }
            }
            long j7 = -9223372036854775807L;
            if (this.E) {
                if (cb5Var.f6352b.f8794b.equals(this.V.f8794b) && cb5Var.f6352b.f8796d == this.V.f8811s) {
                    z8 = false;
                }
                if (z8) {
                    if (azVar.g() || cb5Var.f6352b.f8794b.b()) {
                        j7 = cb5Var.f6352b.f8796d;
                    } else {
                        gc5 gc5Var = cb5Var.f6352b;
                        xp5 xp5Var = gc5Var.f8794b;
                        long j8 = gc5Var.f8796d;
                        i0(azVar, xp5Var, j8);
                        j7 = j8;
                    }
                }
                z7 = z8;
            } else {
                z7 = false;
            }
            this.E = false;
            d0(cb5Var.f6352b, 1, z7, this.D, j7, -1, false);
        }
    }

    final /* synthetic */ void Q(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        k0(surface);
        this.L = surface;
    }

    final /* synthetic */ void R(Object obj) {
        k0(null);
    }

    final /* synthetic */ fu1 T() {
        return this.f16088m;
    }

    final /* synthetic */ md5 U() {
        return this.f16093r;
    }

    final /* synthetic */ oc1 V() {
        return this.A;
    }

    final /* synthetic */ Object W() {
        return this.K;
    }

    final /* synthetic */ boolean X() {
        return this.Q;
    }

    final /* synthetic */ void Y(boolean z7) {
        this.Q = z7;
    }

    @Override // com.google.android.gms.internal.ads.k95
    public final void c(aq5 aq5Var) {
        n0();
        List singletonList = Collections.singletonList(aq5Var);
        n0();
        n0();
        a0(this.V);
        t();
        this.C++;
        List list = this.f16091p;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i7 = size - 1; i7 >= 0; i7--) {
                list.remove(i7);
            }
            this.Y = this.Y.g(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < singletonList.size(); i8++) {
            cc5 cc5Var = new cc5((aq5) singletonList.get(i8), this.f16092q);
            arrayList.add(cc5Var);
            list.add(i8, new sa5(cc5Var.f6371b, cc5Var.f6370a));
        }
        this.Y = this.Y.f(0, arrayList.size());
        mc5 mc5Var = new mc5(list, this.Y);
        if (!mc5Var.g() && mc5Var.a() < 0) {
            throw new fr5(mc5Var, -1, -9223372036854775807L);
        }
        int k7 = mc5Var.k(false);
        gc5 f02 = f0(this.V, mc5Var, h0(mc5Var, k7, -9223372036854775807L));
        int i9 = f02.f8797e;
        if (i9 == 1) {
            i9 = 1;
        } else {
            if (!mc5Var.g()) {
                if (k7 != -1) {
                    if (k7 < mc5Var.a()) {
                        i9 = 2;
                    }
                }
            }
            i9 = 4;
        }
        gc5 g02 = g0(f02, i9);
        this.f16087l.F0(arrayList, k7, hi2.N(-9223372036854775807L), this.Y);
        d0(g02, 0, (this.V.f8794b.f18924a.equals(g02.f8794b.f18924a) || this.V.f8793a.g()) ? false : true, 4, c0(g02), -1, false);
    }

    @Override // com.google.android.gms.internal.ads.k95
    public final void d(qd5 qd5Var) {
        this.f16093r.f(qd5Var);
    }

    @Override // com.google.android.gms.internal.ads.k95
    public final void e(qd5 qd5Var) {
        n0();
        this.f16093r.r(qd5Var);
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final void f() {
        n0();
        gc5 gc5Var = this.V;
        if (gc5Var.f8797e != 1) {
            return;
        }
        gc5 f8 = gc5Var.f(null);
        gc5 g02 = g0(f8, true != f8.f8793a.g() ? 2 : 4);
        this.C++;
        this.f16087l.p0();
        d0(g02, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final int g() {
        n0();
        return this.V.f8797e;
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final Looper h() {
        return this.f16094s;
    }

    @Override // com.google.android.gms.internal.ads.bu2
    protected final void i(int i7, long j7, int i8, boolean z7) {
        n0();
        if (i7 == -1) {
            return;
        }
        rx3.a(i7 >= 0);
        az azVar = this.V.f8793a;
        if (azVar.g() || i7 < azVar.a()) {
            this.f16093r.C();
            this.C++;
            if (H()) {
                gv1.c("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                cb5 cb5Var = new cb5(this.V);
                cb5Var.a(1);
                this.f16086k.a(cb5Var);
                return;
            }
            gc5 gc5Var = this.V;
            int i9 = gc5Var.f8797e;
            if (i9 == 3 || (i9 == 4 && !azVar.g())) {
                gc5Var = g0(this.V, 2);
            }
            int p7 = p();
            gc5 f02 = f0(gc5Var, azVar, h0(azVar, i7, j7));
            this.f16087l.r0(azVar, i7, hi2.N(j7));
            d0(f02, 0, true, 1, c0(f02), p7, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final int j() {
        n0();
        return this.V.f8806n;
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final int k() {
        n0();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final boolean l() {
        n0();
        return this.V.f8804l;
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final az m() {
        n0();
        return this.V.f8793a;
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final boolean n() {
        n0();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final yk o() {
        n0();
        return this.V.f8807o;
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final int p() {
        n0();
        int a02 = a0(this.V);
        if (a02 == -1) {
            return 0;
        }
        return a02;
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final void q() {
        n0();
        P(null);
        new xy0(w04.m(), this.V.f8811s);
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final long r() {
        n0();
        if (!H()) {
            az m7 = m();
            if (m7.g()) {
                return -9223372036854775807L;
            }
            return hi2.M(m7.b(p(), this.f6007a, 0L).f19907l);
        }
        gc5 gc5Var = this.V;
        xp5 xp5Var = gc5Var.f8794b;
        az azVar = gc5Var.f8793a;
        Object obj = xp5Var.f18924a;
        ot otVar = this.f16090o;
        azVar.o(obj, otVar);
        return hi2.M(otVar.h(xp5Var.f18925b, xp5Var.f18926c));
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final d70 s() {
        n0();
        return this.V.f8801i.f9705d;
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final long t() {
        n0();
        return hi2.M(c0(this.V));
    }

    public final b45 u() {
        n0();
        return this.V.f8798f;
    }

    final /* synthetic */ void v(jp jpVar, km5 km5Var) {
        jpVar.n(this.f16081f, new go(km5Var));
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final int w() {
        n0();
        if (this.V.f8793a.g()) {
            return 0;
        }
        gc5 gc5Var = this.V;
        return gc5Var.f8793a.e(gc5Var.f8794b.f18924a);
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final int x() {
        n0();
        if (H()) {
            return this.V.f8794b.f18926c;
        }
        return -1;
    }

    final /* synthetic */ void y(final cb5 cb5Var) {
        this.f16085j.j(new Runnable() { // from class: com.google.android.gms.internal.ads.ia5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                ta5.this.O(cb5Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final long z() {
        n0();
        if (H()) {
            gc5 gc5Var = this.V;
            return gc5Var.f8803k.equals(gc5Var.f8794b) ? hi2.M(this.V.f8809q) : r();
        }
        n0();
        if (this.V.f8793a.g()) {
            return this.X;
        }
        gc5 gc5Var2 = this.V;
        long j7 = 0;
        if (gc5Var2.f8803k.f18927d != gc5Var2.f8794b.f18927d) {
            return hi2.M(gc5Var2.f8793a.b(p(), this.f6007a, 0L).f19907l);
        }
        long j8 = gc5Var2.f8809q;
        if (this.V.f8803k.b()) {
            gc5 gc5Var3 = this.V;
            gc5Var3.f8793a.o(gc5Var3.f8803k.f18924a, this.f16090o).c(this.V.f8803k.f18925b);
        } else {
            j7 = j8;
        }
        gc5 gc5Var4 = this.V;
        i0(gc5Var4.f8793a, gc5Var4.f8803k, j7);
        return hi2.M(j7);
    }
}
