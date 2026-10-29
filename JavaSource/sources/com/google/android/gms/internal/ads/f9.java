package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
abstract class f9 {

    /* renamed from: b, reason: collision with root package name */
    private a4 f8073b;

    /* renamed from: c, reason: collision with root package name */
    private p2 f8074c;

    /* renamed from: d, reason: collision with root package name */
    private b9 f8075d;

    /* renamed from: e, reason: collision with root package name */
    private long f8076e;

    /* renamed from: f, reason: collision with root package name */
    private long f8077f;

    /* renamed from: g, reason: collision with root package name */
    private long f8078g;

    /* renamed from: h, reason: collision with root package name */
    private int f8079h;

    /* renamed from: i, reason: collision with root package name */
    private int f8080i;

    /* renamed from: k, reason: collision with root package name */
    private long f8082k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f8083l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f8084m;

    /* renamed from: a, reason: collision with root package name */
    private final z8 f8072a = new z8();

    /* renamed from: j, reason: collision with root package name */
    private d9 f8081j = new d9();

    protected void a(boolean z7) {
        int i7;
        if (z7) {
            this.f8081j = new d9();
            this.f8077f = 0L;
            i7 = 0;
        } else {
            i7 = 1;
        }
        this.f8079h = i7;
        this.f8076e = -1L;
        this.f8078g = 0L;
    }

    protected abstract long b(y82 y82Var);

    protected abstract boolean c(y82 y82Var, long j7, d9 d9Var);

    final void d(p2 p2Var, a4 a4Var) {
        this.f8074c = p2Var;
        this.f8073b = a4Var;
        a(true);
    }

    final void e(long j7, long j8) {
        this.f8072a.a();
        if (j7 == 0) {
            a(!this.f8083l);
            return;
        }
        if (this.f8079h != 0) {
            long h8 = h(j8);
            this.f8076e = h8;
            b9 b9Var = this.f8075d;
            String str = hi2.f9535a;
            b9Var.b(h8);
            this.f8079h = 2;
        }
    }

    final int f(n2 n2Var, n3 n3Var) {
        this.f8073b.getClass();
        String str = hi2.f9535a;
        int i7 = this.f8079h;
        if (i7 != 0) {
            if (i7 == 1) {
                n2Var.B((int) this.f8077f);
                this.f8079h = 2;
                return 0;
            }
            if (i7 != 2) {
                return -1;
            }
            long j7 = this.f8075d.j(n2Var);
            if (j7 >= 0) {
                n3Var.f12555a = j7;
                return 1;
            }
            if (j7 < -1) {
                i(-(j7 + 2));
            }
            if (!this.f8083l) {
                q3 d8 = this.f8075d.d();
                d8.getClass();
                this.f8074c.B(d8);
                d8.a();
                this.f8083l = true;
            }
            if (this.f8082k <= 0 && !this.f8072a.b(n2Var)) {
                this.f8079h = 3;
                return -1;
            }
            this.f8082k = 0L;
            y82 d9 = this.f8072a.d();
            long b8 = b(d9);
            if (b8 >= 0) {
                long j8 = this.f8078g;
                if (j8 + b8 >= this.f8076e) {
                    long g8 = g(j8);
                    this.f8073b.e(d9, d9.D());
                    this.f8073b.a(g8, 1, d9.D(), 0, null);
                    this.f8076e = -1L;
                }
            }
            this.f8078g += b8;
            return 0;
        }
        while (true) {
            z8 z8Var = this.f8072a;
            if (!z8Var.b(n2Var)) {
                this.f8079h = 3;
                return -1;
            }
            long o7 = n2Var.o();
            long j9 = this.f8077f;
            this.f8082k = o7 - j9;
            if (!c(z8Var.d(), j9, this.f8081j)) {
                eq5 eq5Var = this.f8081j.f6985a;
                this.f8080i = eq5Var.H;
                if (!this.f8084m) {
                    this.f8073b.c(eq5Var);
                    this.f8084m = true;
                }
                b9 b9Var = this.f8081j.f6986b;
                if (b9Var != null) {
                    this.f8075d = b9Var;
                } else if (n2Var.q() == -1) {
                    this.f8075d = new e9(null);
                } else {
                    a9 c8 = z8Var.c();
                    this.f8075d = new v8(this, this.f8077f, n2Var.q(), c8.f4810d + c8.f4811e, c8.f4808b, (c8.f4807a & 4) != 0);
                }
                this.f8079h = 2;
                z8Var.e();
                return 0;
            }
            this.f8077f = n2Var.o();
        }
    }

    protected final long g(long j7) {
        return (j7 * 1000000) / this.f8080i;
    }

    protected final long h(long j7) {
        return (this.f8080i * j7) / 1000000;
    }

    protected void i(long j7) {
        this.f8078g = j7;
    }
}
