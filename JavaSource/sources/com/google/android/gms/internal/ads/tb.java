package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class tb implements zb {

    /* renamed from: a, reason: collision with root package name */
    private final w72 f16102a;

    /* renamed from: b, reason: collision with root package name */
    private final y82 f16103b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16104c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16105d;

    /* renamed from: e, reason: collision with root package name */
    private final String f16106e;

    /* renamed from: f, reason: collision with root package name */
    private String f16107f;

    /* renamed from: g, reason: collision with root package name */
    private a4 f16108g;

    /* renamed from: h, reason: collision with root package name */
    private int f16109h;

    /* renamed from: i, reason: collision with root package name */
    private int f16110i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f16111j;

    /* renamed from: k, reason: collision with root package name */
    private long f16112k;

    /* renamed from: l, reason: collision with root package name */
    private eq5 f16113l;

    /* renamed from: m, reason: collision with root package name */
    private int f16114m;

    /* renamed from: n, reason: collision with root package name */
    private long f16115n;

    public tb(String str, int i7, String str2) {
        w72 w72Var = new w72(new byte[16], 16);
        this.f16102a = w72Var;
        this.f16103b = new y82(w72Var.f18098a);
        this.f16109h = 0;
        this.f16110i = 0;
        this.f16111j = false;
        this.f16115n = -9223372036854775807L;
        this.f16104c = str;
        this.f16105d = i7;
        this.f16106e = str2;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void B0(y82 y82Var) {
        this.f16108g.getClass();
        while (y82Var.C() > 0) {
            int i7 = this.f16109h;
            if (i7 == 0) {
                while (y82Var.C() > 0) {
                    if (this.f16111j) {
                        int R = y82Var.R();
                        this.f16111j = R == 172;
                        if (R != 64) {
                            if (R == 65) {
                                R = 65;
                            }
                        }
                        this.f16109h = 1;
                        y82 y82Var2 = this.f16103b;
                        y82Var2.H()[0] = -84;
                        y82Var2.H()[1] = R == 65 ? (byte) 65 : (byte) 64;
                        this.f16110i = 2;
                    } else {
                        this.f16111j = y82Var.R() == 172;
                    }
                }
            } else if (i7 != 1) {
                int min = Math.min(y82Var.C(), this.f16114m - this.f16110i);
                this.f16108g.e(y82Var, min);
                int i8 = this.f16110i + min;
                this.f16110i = i8;
                if (i8 == this.f16114m) {
                    rx3.h(this.f16115n != -9223372036854775807L);
                    this.f16108g.a(this.f16115n, 1, this.f16114m, 0, null);
                    this.f16115n += this.f16112k;
                    this.f16109h = 0;
                }
            } else {
                y82 y82Var3 = this.f16103b;
                byte[] H = y82Var3.H();
                int min2 = Math.min(y82Var.C(), 16 - this.f16110i);
                y82Var.L(H, this.f16110i, min2);
                int i9 = this.f16110i + min2;
                this.f16110i = i9;
                if (i9 == 16) {
                    w72 w72Var = this.f16102a;
                    w72Var.f(0);
                    m1 b8 = n1.b(w72Var);
                    eq5 eq5Var = this.f16113l;
                    if (eq5Var == null || eq5Var.G != 2 || b8.f12009a != eq5Var.H || !"audio/ac4".equals(eq5Var.f7775o)) {
                        xn5 xn5Var = new xn5();
                        xn5Var.A(this.f16107f);
                        xn5Var.k0(this.f16106e);
                        xn5Var.l0("audio/ac4");
                        xn5Var.e(2);
                        xn5Var.f(b8.f12009a);
                        xn5Var.d0(this.f16104c);
                        xn5Var.f0(this.f16105d);
                        eq5 m7 = xn5Var.m();
                        this.f16113l = m7;
                        this.f16108g.c(m7);
                    }
                    this.f16114m = b8.f12010b;
                    this.f16112k = (b8.f12011c * 1000000) / this.f16113l.H;
                    y82Var3.G(0);
                    this.f16108g.e(y82Var3, 16);
                    this.f16109h = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void C0(p2 p2Var, qd qdVar) {
        qdVar.a();
        this.f16107f = qdVar.c();
        this.f16108g = p2Var.A(qdVar.b(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void D0(long j7, int i7) {
        this.f16115n = j7;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void a() {
        this.f16109h = 0;
        this.f16110i = 0;
        this.f16111j = false;
        this.f16115n = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void A0(boolean z7) {
    }
}
