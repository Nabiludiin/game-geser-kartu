package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class n0 {

    /* renamed from: a, reason: collision with root package name */
    private final g0 f12500a;

    /* renamed from: f, reason: collision with root package name */
    private final h0 f12505f;

    /* renamed from: k, reason: collision with root package name */
    private long f12510k;

    /* renamed from: l, reason: collision with root package name */
    private final c f12511l;

    /* renamed from: b, reason: collision with root package name */
    private final d0 f12501b = new d0();

    /* renamed from: c, reason: collision with root package name */
    private final de2 f12502c = new de2(10);

    /* renamed from: d, reason: collision with root package name */
    private final de2 f12503d = new de2(10);

    /* renamed from: e, reason: collision with root package name */
    private final ix1 f12504e = new ix1(16);

    /* renamed from: g, reason: collision with root package name */
    private long f12506g = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    private te0 f12509j = te0.f16148d;

    /* renamed from: h, reason: collision with root package name */
    private long f12507h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    private long f12508i = -9223372036854775807L;

    public n0(c cVar, g0 g0Var, h0 h0Var) {
        this.f12511l = cVar;
        this.f12500a = g0Var;
        this.f12505f = h0Var;
    }

    private static Object h(de2 de2Var) {
        rx3.a(de2Var.c() > 0);
        while (de2Var.c() > 1) {
            de2Var.d();
        }
        Object d8 = de2Var.d();
        d8.getClass();
        return d8;
    }

    public final void a() {
        this.f12504e.e();
        this.f12506g = -9223372036854775807L;
        this.f12507h = -9223372036854775807L;
        this.f12508i = -9223372036854775807L;
        de2 de2Var = this.f12503d;
        if (de2Var.c() > 0) {
            this.f12510k = ((Long) h(de2Var)).longValue();
        }
        de2 de2Var2 = this.f12502c;
        if (de2Var2.c() > 0) {
            de2Var2.a(0L, (te0) h(de2Var2));
        }
    }

    public final void b(long j7, long j8) {
        while (true) {
            ix1 ix1Var = this.f12504e;
            if (ix1Var.d()) {
                return;
            }
            de2 de2Var = this.f12503d;
            long c8 = ix1Var.c();
            Long l7 = (Long) de2Var.e(c8);
            if (l7 != null && l7.longValue() != this.f12510k) {
                this.f12510k = l7.longValue();
                this.f12500a.a(2);
            }
            g0 g0Var = this.f12500a;
            long j9 = this.f12510k;
            d0 d0Var = this.f12501b;
            int k7 = g0Var.k(c8, j7, j8, j9, false, false, d0Var);
            if (k7 != 5 && k7 != 4) {
                this.f12505f.a(c8, d0Var.a());
            }
            if (k7 == 0 || k7 == 1) {
                this.f12507h = c8;
                long b8 = ix1Var.b();
                te0 te0Var = (te0) this.f12502c.e(b8);
                if (te0Var != null && !te0Var.equals(te0.f16148d) && !te0Var.equals(this.f12509j)) {
                    this.f12509j = te0Var;
                    this.f12511l.a(te0Var);
                }
                this.f12511l.b(k7 == 0 ? System.nanoTime() : d0Var.b(), b8, g0Var.f());
            } else if (k7 == 2 || k7 == 3) {
                this.f12507h = c8;
                ix1Var.b();
                final c cVar = this.f12511l;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.pv5
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        c.this.f6138b.f().d();
                    }
                };
                d dVar = cVar.f6138b;
                dVar.g().execute(runnable);
                ((d1) dVar.n().remove()).b();
            } else if (k7 != 4) {
                return;
            } else {
                this.f12507h = c8;
            }
        }
    }

    public final void c(int i7, int i8) {
        long j7 = this.f12506g;
        this.f12502c.a(j7 == -9223372036854775807L ? 0L : j7 + 1, new te0(i7, i8, 1.0f));
    }

    public final void d(int i7, long j7) {
        if (this.f12504e.d()) {
            this.f12500a.a(i7);
            this.f12510k = j7;
        } else {
            de2 de2Var = this.f12503d;
            long j8 = this.f12506g;
            de2Var.a(j8 == -9223372036854775807L ? -4611686018427387904L : j8 + 1, Long.valueOf(j7));
        }
    }

    public final void e(long j7) {
        this.f12504e.a(j7);
        this.f12506g = j7;
        this.f12508i = -9223372036854775807L;
    }

    public final void f() {
        long j7 = this.f12506g;
        if (j7 == -9223372036854775807L) {
            j7 = Long.MIN_VALUE;
            this.f12506g = Long.MIN_VALUE;
            this.f12507h = Long.MIN_VALUE;
        }
        this.f12508i = j7;
    }

    public final boolean g() {
        long j7 = this.f12508i;
        return j7 != -9223372036854775807L && this.f12507h == j7;
    }
}
