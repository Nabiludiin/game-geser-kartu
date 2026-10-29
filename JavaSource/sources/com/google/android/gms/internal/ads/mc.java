package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class mc implements zb {

    /* renamed from: a, reason: collision with root package name */
    private final y82 f12178a;

    /* renamed from: b, reason: collision with root package name */
    private final i3 f12179b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12180c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12181d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12182e;

    /* renamed from: f, reason: collision with root package name */
    private a4 f12183f;

    /* renamed from: g, reason: collision with root package name */
    private String f12184g;

    /* renamed from: h, reason: collision with root package name */
    private int f12185h = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f12186i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12187j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f12188k;

    /* renamed from: l, reason: collision with root package name */
    private long f12189l;

    /* renamed from: m, reason: collision with root package name */
    private int f12190m;

    /* renamed from: n, reason: collision with root package name */
    private long f12191n;

    public mc(String str, int i7, String str2) {
        y82 y82Var = new y82(4);
        this.f12178a = y82Var;
        y82Var.H()[0] = -1;
        this.f12179b = new i3();
        this.f12191n = -9223372036854775807L;
        this.f12180c = str;
        this.f12181d = i7;
        this.f12182e = str2;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void B0(y82 y82Var) {
        this.f12183f.getClass();
        while (y82Var.C() > 0) {
            int i7 = this.f12185h;
            if (i7 == 0) {
                byte[] H = y82Var.H();
                int F = y82Var.F();
                int D = y82Var.D();
                while (true) {
                    if (F >= D) {
                        y82Var.G(D);
                        break;
                    }
                    int i8 = F + 1;
                    byte b8 = H[F];
                    boolean z7 = (b8 & 255) == 255;
                    boolean z8 = this.f12188k && (b8 & 224) == 224;
                    this.f12188k = z7;
                    if (z8) {
                        y82Var.G(i8);
                        this.f12188k = false;
                        this.f12178a.H()[1] = H[F];
                        this.f12186i = 2;
                        this.f12185h = 1;
                        break;
                    }
                    F = i8;
                }
            } else if (i7 != 1) {
                int min = Math.min(y82Var.C(), this.f12190m - this.f12186i);
                this.f12183f.e(y82Var, min);
                int i9 = this.f12186i + min;
                this.f12186i = i9;
                if (i9 >= this.f12190m) {
                    rx3.h(this.f12191n != -9223372036854775807L);
                    this.f12183f.a(this.f12191n, 1, this.f12190m, 0, null);
                    this.f12191n += this.f12189l;
                    this.f12186i = 0;
                    this.f12185h = 0;
                }
            } else {
                int min2 = Math.min(y82Var.C(), 4 - this.f12186i);
                y82 y82Var2 = this.f12178a;
                y82Var.L(y82Var2.H(), this.f12186i, min2);
                int i10 = this.f12186i + min2;
                this.f12186i = i10;
                if (i10 >= 4) {
                    y82Var2.G(0);
                    i3 i3Var = this.f12179b;
                    if (i3Var.a(y82Var2.b())) {
                        this.f12190m = i3Var.f9817c;
                        if (!this.f12187j) {
                            this.f12189l = (i3Var.f9821g * 1000000) / i3Var.f9818d;
                            xn5 xn5Var = new xn5();
                            xn5Var.A(this.f12184g);
                            xn5Var.k0(this.f12182e);
                            xn5Var.l0(i3Var.f9816b);
                            xn5Var.m0(4096);
                            xn5Var.e(i3Var.f9819e);
                            xn5Var.f(i3Var.f9818d);
                            xn5Var.d0(this.f12180c);
                            xn5Var.f0(this.f12181d);
                            this.f12183f.c(xn5Var.m());
                            this.f12187j = true;
                        }
                        y82Var2.G(0);
                        this.f12183f.e(y82Var2, 4);
                        this.f12185h = 2;
                    } else {
                        this.f12186i = 0;
                        this.f12185h = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void C0(p2 p2Var, qd qdVar) {
        qdVar.a();
        this.f12184g = qdVar.c();
        this.f12183f = p2Var.A(qdVar.b(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void D0(long j7, int i7) {
        this.f12191n = j7;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void a() {
        this.f12185h = 0;
        this.f12186i = 0;
        this.f12188k = false;
        this.f12191n = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void A0(boolean z7) {
    }
}
