package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;

/* compiled from: MyApplication */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    private final e0 f8558a;

    /* renamed from: b, reason: collision with root package name */
    private final m0 f8559b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8560c;

    /* renamed from: f, reason: collision with root package name */
    private long f8563f;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8566i;

    /* renamed from: l, reason: collision with root package name */
    private boolean f8569l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f8570m;

    /* renamed from: d, reason: collision with root package name */
    private int f8561d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f8562e = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f8564g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f8565h = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    private float f8567j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    private pd1 f8568k = pd1.f13828a;

    public g0(Context context, e0 e0Var, long j7) {
        this.f8558a = e0Var;
        this.f8559b = new m0(context);
    }

    private final void o(int i7) {
        this.f8561d = Math.min(this.f8561d, i7);
    }

    public final void a(int i7) {
        if (i7 == 0) {
            this.f8561d = 1;
        } else if (i7 != 1) {
            o(2);
        } else {
            this.f8561d = 0;
        }
    }

    public final void b() {
        this.f8560c = true;
        this.f8563f = hi2.N(this.f8568k.b());
        this.f8559b.b();
    }

    public final void c() {
        this.f8560c = false;
        this.f8565h = -9223372036854775807L;
        this.f8559b.h();
    }

    public final void d(Surface surface) {
        this.f8569l = surface != null;
        this.f8570m = false;
        this.f8559b.c(surface);
        o(1);
    }

    public final void e(float f8) {
        this.f8559b.f(f8);
    }

    public final boolean f() {
        int i7 = this.f8561d;
        this.f8561d = 3;
        this.f8563f = hi2.N(this.f8568k.b());
        return i7 != 3;
    }

    public final void g(pd1 pd1Var) {
        this.f8568k = pd1Var;
    }

    public final void h() {
        if (this.f8561d == 0) {
            this.f8561d = 1;
        }
    }

    public final boolean i(boolean z7) {
        if (z7 && (this.f8561d == 3 || (!this.f8569l && this.f8570m))) {
            this.f8565h = -9223372036854775807L;
            return true;
        }
        if (this.f8565h == -9223372036854775807L) {
            return false;
        }
        if (this.f8568k.b() < this.f8565h) {
            return true;
        }
        this.f8565h = -9223372036854775807L;
        return false;
    }

    public final void j(boolean z7) {
        this.f8566i = z7;
        this.f8565h = -9223372036854775807L;
    }

    public final int k(long j7, long j8, long j9, long j10, boolean z7, boolean z8, d0 d0Var) {
        boolean z9;
        d0Var.c();
        if (this.f8560c && this.f8562e == -9223372036854775807L) {
            this.f8562e = j8;
        }
        if (this.f8564g != j7) {
            this.f8559b.g(j7);
            this.f8564g = j7;
        }
        long j11 = (long) ((j7 - j8) / this.f8567j);
        if (this.f8560c) {
            j11 -= hi2.N(this.f8568k.b()) - j9;
        }
        d0Var.e(j11);
        if (z7 && !z8) {
            return 3;
        }
        if (!this.f8569l) {
            this.f8570m = true;
            if (this.f8558a.F(d0Var.d(), j8, j9, z8, true)) {
                return 4;
            }
            return (!this.f8560c || d0Var.d() >= 30000) ? 5 : 3;
        }
        long d8 = d0Var.d();
        if (this.f8565h == -9223372036854775807L || this.f8566i) {
            int i7 = this.f8561d;
            if (i7 == 0) {
                z9 = false;
                if (this.f8560c) {
                    return 0;
                }
            } else {
                if (i7 == 1) {
                    return 0;
                }
                if (i7 == 2) {
                    z9 = false;
                    if (j8 >= j10) {
                        return 0;
                    }
                } else {
                    if (i7 != 3) {
                        throw new IllegalStateException();
                    }
                    z9 = false;
                    long N = hi2.N(this.f8568k.b()) - this.f8563f;
                    if (this.f8560c) {
                        long j12 = this.f8562e;
                        if (j12 != -9223372036854775807L && j12 != j8 && d8 < -30000 && N > 100000) {
                            return 0;
                        }
                    }
                }
            }
        } else {
            z9 = false;
        }
        if (!this.f8560c || j8 == this.f8562e) {
            return 5;
        }
        long d9 = this.f8568k.d();
        d0Var.g(this.f8559b.i((d0Var.d() * 1000) + d9));
        d0Var.e((d0Var.f() - d9) / 1000);
        boolean z10 = (this.f8565h == -9223372036854775807L || this.f8566i) ? z9 : true;
        if (this.f8558a.F(d0Var.d(), j8, j9, z8, z10)) {
            return 4;
        }
        return (d0Var.d() >= -30000 || z8) ? d0Var.d() > 50000 ? 5 : 1 : z10 ? 3 : 2;
    }

    public final void l() {
        this.f8559b.d();
        this.f8564g = -9223372036854775807L;
        this.f8562e = -9223372036854775807L;
        o(1);
        this.f8565h = -9223372036854775807L;
    }

    public final void m(int i7) {
        this.f8559b.a(i7);
    }

    public final void n(float f8) {
        rx3.a(f8 > 0.0f);
        if (f8 == this.f8567j) {
            return;
        }
        this.f8567j = f8;
        this.f8559b.e(f8);
    }
}
