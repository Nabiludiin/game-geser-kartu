package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class nc implements zb {

    /* renamed from: f, reason: collision with root package name */
    private String f12673f;

    /* renamed from: g, reason: collision with root package name */
    private a4 f12674g;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12677j;

    /* renamed from: l, reason: collision with root package name */
    private int f12679l;

    /* renamed from: m, reason: collision with root package name */
    private int f12680m;

    /* renamed from: o, reason: collision with root package name */
    private int f12682o;

    /* renamed from: p, reason: collision with root package name */
    private int f12683p;

    /* renamed from: t, reason: collision with root package name */
    private int f12687t;

    /* renamed from: v, reason: collision with root package name */
    private boolean f12689v;

    /* renamed from: a, reason: collision with root package name */
    private final String f12668a = "video/mp2t";

    /* renamed from: e, reason: collision with root package name */
    private int f12672e = 0;

    /* renamed from: b, reason: collision with root package name */
    private final y82 f12669b = new y82(new byte[15], 2);

    /* renamed from: c, reason: collision with root package name */
    private final w72 f12670c = new w72();

    /* renamed from: d, reason: collision with root package name */
    private final y82 f12671d = new y82();

    /* renamed from: q, reason: collision with root package name */
    private final oc f12684q = new oc();

    /* renamed from: r, reason: collision with root package name */
    private int f12685r = -2147483647;

    /* renamed from: s, reason: collision with root package name */
    private int f12686s = -1;

    /* renamed from: u, reason: collision with root package name */
    private long f12688u = -1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f12678k = true;

    /* renamed from: n, reason: collision with root package name */
    private boolean f12681n = true;

    /* renamed from: h, reason: collision with root package name */
    private double f12675h = -9.223372036854776E18d;

    /* renamed from: i, reason: collision with root package name */
    private double f12676i = -9.223372036854776E18d;

    public nc(String str) {
    }

    private static final void b(y82 y82Var, y82 y82Var2, boolean z7) {
        int F = y82Var.F();
        int min = Math.min(y82Var.C(), y82Var2.C());
        y82Var.L(y82Var2.H(), y82Var2.F(), min);
        y82Var2.J(min);
        if (z7) {
            y82Var.G(F);
        }
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void B0(y82 y82Var) {
        int i7;
        this.f12674g.getClass();
        while (y82Var.C() > 0) {
            int i8 = this.f12672e;
            int i9 = 0;
            if (i8 == 0) {
                int i10 = this.f12679l;
                if ((i10 & 2) != 0) {
                    if ((i10 & 4) == 0) {
                        while (y82Var.C() > 0) {
                            int i11 = this.f12680m << 8;
                            this.f12680m = i11;
                            int R = i11 | y82Var.R();
                            this.f12680m = R;
                            if ((R & 16777215) == 12583333) {
                                y82Var.G(y82Var.F() - 3);
                                this.f12680m = 0;
                            }
                        }
                    }
                    this.f12672e = 1;
                    break;
                }
                y82Var.G(y82Var.D());
            } else if (i8 != 1) {
                oc ocVar = this.f12684q;
                int i12 = ocVar.f13269a;
                if (i12 == 1 || i12 == 17) {
                    b(y82Var, this.f12671d, true);
                }
                int min = Math.min(y82Var.C(), ocVar.f13271c - this.f12682o);
                this.f12674g.e(y82Var, min);
                int i13 = this.f12682o + min;
                this.f12682o = i13;
                if (i13 == ocVar.f13271c) {
                    int i14 = ocVar.f13269a;
                    if (i14 == 1) {
                        byte[] H = this.f12671d.H();
                        pc b8 = sc.b(new w72(H, H.length));
                        this.f12685r = b8.f13811b;
                        this.f12686s = b8.f13812c;
                        long j7 = this.f12688u;
                        long j8 = ocVar.f13270b;
                        if (j7 != j8) {
                            this.f12688u = j8;
                            int i15 = b8.f13810a;
                            String concat = i15 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i15))) : "mhm1";
                            byte[] bArr = b8.f13813d;
                            w04 w04Var = null;
                            if (bArr != null && bArr.length > 0) {
                                w04Var = w04.o(hi2.f9536b, bArr);
                            }
                            xn5 xn5Var = new xn5();
                            xn5Var.A(this.f12673f);
                            xn5Var.k0(this.f12668a);
                            xn5Var.l0("audio/mhm1");
                            xn5Var.f(this.f12685r);
                            xn5Var.i0(concat);
                            xn5Var.o0(w04Var);
                            this.f12674g.c(xn5Var.m());
                        }
                        this.f12689v = true;
                    } else if (i14 == 17) {
                        byte[] H2 = this.f12671d.H();
                        w72 w72Var = new w72(H2, H2.length);
                        if (w72Var.i()) {
                            w72Var.h(2);
                            i9 = w72Var.j(13);
                        }
                        this.f12687t = i9;
                    } else if (i14 == 2) {
                        if (this.f12689v) {
                            this.f12678k = false;
                            i7 = 1;
                        } else {
                            i7 = 0;
                        }
                        int i16 = this.f12686s - this.f12687t;
                        double d8 = this.f12685r;
                        long round = Math.round(this.f12675h);
                        if (this.f12677j) {
                            this.f12677j = false;
                            this.f12675h = this.f12676i;
                        } else {
                            this.f12675h += (i16 * 1000000.0d) / d8;
                        }
                        this.f12674g.a(round, i7, this.f12683p, 0, null);
                        this.f12689v = false;
                        this.f12687t = 0;
                        this.f12683p = 0;
                    }
                    this.f12672e = 1;
                }
            } else {
                y82 y82Var2 = this.f12669b;
                b(y82Var, y82Var2, false);
                if (y82Var2.C() == 0) {
                    w72 w72Var2 = this.f12670c;
                    int D = y82Var2.D();
                    w72Var2.b(y82Var2.H(), D);
                    oc ocVar2 = this.f12684q;
                    if (sc.a(w72Var2, ocVar2)) {
                        this.f12682o = 0;
                        this.f12683p += ocVar2.f13271c + D;
                        y82Var2.G(0);
                        this.f12674g.e(y82Var2, y82Var2.D());
                        y82Var2.z(2);
                        this.f12671d.z(ocVar2.f13271c);
                        this.f12681n = true;
                        this.f12672e = 2;
                    } else if (y82Var2.D() < 15) {
                        y82Var2.E(y82Var2.D() + 1);
                    }
                }
                this.f12681n = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void C0(p2 p2Var, qd qdVar) {
        qdVar.a();
        this.f12673f = qdVar.c();
        this.f12674g = p2Var.A(qdVar.b(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void D0(long j7, int i7) {
        this.f12679l = i7;
        if (!this.f12678k && (this.f12683p != 0 || !this.f12681n)) {
            this.f12677j = true;
        }
        if (j7 != -9223372036854775807L) {
            double d8 = j7;
            if (this.f12677j) {
                this.f12676i = d8;
            } else {
                this.f12675h = d8;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void a() {
        this.f12672e = 0;
        this.f12680m = 0;
        this.f12669b.z(2);
        this.f12682o = 0;
        this.f12683p = 0;
        this.f12685r = -2147483647;
        this.f12686s = -1;
        this.f12687t = 0;
        this.f12688u = -1L;
        this.f12689v = false;
        this.f12677j = false;
        this.f12681n = true;
        this.f12678k = true;
        this.f12675h = -9.223372036854776E18d;
        this.f12676i = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void A0(boolean z7) {
    }
}
