package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class pb5 {

    /* renamed from: a, reason: collision with root package name */
    public final vp5 f13794a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13795b;

    /* renamed from: c, reason: collision with root package name */
    public final qr5[] f13796c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13797d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13798e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13799f;

    /* renamed from: g, reason: collision with root package name */
    public qb5 f13800g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13801h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean[] f13802i;

    /* renamed from: j, reason: collision with root package name */
    private final sc5[] f13803j;

    /* renamed from: k, reason: collision with root package name */
    private final gu5 f13804k;

    /* renamed from: l, reason: collision with root package name */
    private final fc5 f13805l;

    /* renamed from: m, reason: collision with root package name */
    private pb5 f13806m;

    /* renamed from: n, reason: collision with root package name */
    private as5 f13807n;

    /* renamed from: o, reason: collision with root package name */
    private hu5 f13808o;

    /* renamed from: p, reason: collision with root package name */
    private long f13809p;

    public pb5(sc5[] sc5VarArr, long j7, gu5 gu5Var, ku5 ku5Var, fc5 fc5Var, qb5 qb5Var, hu5 hu5Var, long j8) {
        this.f13803j = sc5VarArr;
        this.f13809p = j7;
        this.f13804k = gu5Var;
        this.f13805l = fc5Var;
        xp5 xp5Var = qb5Var.f14361a;
        this.f13795b = xp5Var.f18924a;
        this.f13800g = qb5Var;
        this.f13807n = as5.f5277d;
        this.f13808o = hu5Var;
        this.f13796c = new qr5[2];
        this.f13802i = new boolean[2];
        long j9 = qb5Var.f14362b;
        long j10 = qb5Var.f14364d;
        vp5 e8 = fc5Var.e(xp5Var, ku5Var, j9);
        this.f13794a = j10 != -9223372036854775807L ? new ap5(e8, true, 0L, j10) : e8;
    }

    private final void u() {
        if (!w()) {
            return;
        }
        int i7 = 0;
        while (true) {
            hu5 hu5Var = this.f13808o;
            if (i7 >= hu5Var.f9702a) {
                return;
            }
            hu5Var.a(i7);
            zt5 zt5Var = this.f13808o.f9704c[i7];
            i7++;
        }
    }

    private final void v() {
        if (!w()) {
            return;
        }
        int i7 = 0;
        while (true) {
            hu5 hu5Var = this.f13808o;
            if (i7 >= hu5Var.f9702a) {
                return;
            }
            hu5Var.a(i7);
            zt5 zt5Var = this.f13808o.f9704c[i7];
            i7++;
        }
    }

    private final boolean w() {
        return this.f13806m == null;
    }

    public final long a() {
        return this.f13809p;
    }

    public final void b(long j7) {
        this.f13809p = j7;
    }

    public final long c() {
        return this.f13800g.f14362b + this.f13809p;
    }

    public final boolean d() {
        if (this.f13798e) {
            return !this.f13799f || this.f13794a.j() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean e() {
        if (this.f13798e) {
            return d() || f() - this.f13800g.f14362b >= -9223372036854775807L;
        }
        return false;
    }

    public final long f() {
        if (!this.f13798e) {
            return this.f13800g.f14362b;
        }
        long j7 = this.f13799f ? this.f13794a.j() : Long.MIN_VALUE;
        return j7 == Long.MIN_VALUE ? this.f13800g.f14365e : j7;
    }

    public final long g() {
        if (this.f13798e) {
            return this.f13794a.k();
        }
        return 0L;
    }

    public final void h(float f8, az azVar, boolean z7) {
        this.f13798e = true;
        this.f13807n = this.f13794a.h();
        hu5 k7 = k(f8, azVar, z7);
        qb5 qb5Var = this.f13800g;
        long j7 = qb5Var.f14362b;
        long j8 = qb5Var.f14365e;
        if (j8 != -9223372036854775807L && j7 >= j8) {
            j7 = Math.max(0L, j8 - 1);
        }
        long l7 = l(k7, j7, false);
        long j9 = this.f13809p;
        qb5 qb5Var2 = this.f13800g;
        this.f13809p = j9 + (qb5Var2.f14362b - l7);
        this.f13800g = qb5Var2.a(l7);
    }

    public final void i(long j7) {
        rx3.h(w());
        if (this.f13798e) {
            this.f13794a.b(j7 - this.f13809p);
        }
    }

    public final void j(mb5 mb5Var) {
        rx3.h(w());
        this.f13794a.a(mb5Var);
    }

    public final hu5 k(float f8, az azVar, boolean z7) {
        as5 as5Var = this.f13807n;
        xp5 xp5Var = this.f13800g.f14361a;
        gu5 gu5Var = this.f13804k;
        sc5[] sc5VarArr = this.f13803j;
        hu5 g8 = gu5Var.g(sc5VarArr, as5Var, xp5Var, azVar);
        for (int i7 = 0; i7 < g8.f9702a; i7++) {
            if (g8.a(i7)) {
                if (g8.f9704c[i7] == null) {
                    sc5VarArr[i7].a();
                    r2 = false;
                }
                rx3.h(r2);
            } else {
                rx3.h(g8.f9704c[i7] == null);
            }
        }
        for (zt5 zt5Var : g8.f9704c) {
        }
        return g8;
    }

    public final long l(hu5 hu5Var, long j7, boolean z7) {
        return m(hu5Var, j7, false, new boolean[2]);
    }

    public final long m(hu5 hu5Var, long j7, boolean z7, boolean[] zArr) {
        sc5[] sc5VarArr;
        int i7 = 0;
        while (true) {
            boolean z8 = true;
            if (i7 >= hu5Var.f9702a) {
                break;
            }
            boolean[] zArr2 = this.f13802i;
            if (z7 || !hu5Var.b(this.f13808o, i7)) {
                z8 = false;
            }
            zArr2[i7] = z8;
            i7++;
        }
        int i8 = 0;
        while (true) {
            sc5VarArr = this.f13803j;
            if (i8 >= 2) {
                break;
            }
            sc5VarArr[i8].a();
            i8++;
        }
        v();
        this.f13808o = hu5Var;
        u();
        vp5 vp5Var = this.f13794a;
        zt5[] zt5VarArr = hu5Var.f9704c;
        boolean[] zArr3 = this.f13802i;
        qr5[] qr5VarArr = this.f13796c;
        long p7 = vp5Var.p(zt5VarArr, zArr3, qr5VarArr, zArr, j7);
        for (int i9 = 0; i9 < 2; i9++) {
            sc5VarArr[i9].a();
        }
        this.f13799f = false;
        for (int i10 = 0; i10 < 2; i10++) {
            if (qr5VarArr[i10] != null) {
                rx3.h(hu5Var.a(i10));
                sc5VarArr[i10].a();
                this.f13799f = true;
            } else {
                rx3.h(zt5VarArr[i10] == null);
            }
        }
        return p7;
    }

    public final void n() {
        v();
        vp5 vp5Var = this.f13794a;
        try {
            boolean z7 = vp5Var instanceof ap5;
            fc5 fc5Var = this.f13805l;
            if (z7) {
                fc5Var.f(((ap5) vp5Var).f5198q);
            } else {
                fc5Var.f(vp5Var);
            }
        } catch (RuntimeException e8) {
            gv1.f("MediaPeriodHolder", "Period release failed.", e8);
        }
    }

    public final void o(pb5 pb5Var) {
        if (pb5Var == this.f13806m) {
            return;
        }
        v();
        this.f13806m = pb5Var;
        u();
    }

    public final pb5 p() {
        return this.f13806m;
    }

    public final as5 q() {
        return this.f13807n;
    }

    public final hu5 r() {
        return this.f13808o;
    }

    public final void s() {
        vp5 vp5Var = this.f13794a;
        if (vp5Var instanceof ap5) {
            long j7 = this.f13800g.f14364d;
            if (j7 == -9223372036854775807L) {
                j7 = Long.MIN_VALUE;
            }
            ((ap5) vp5Var).i(0L, j7);
        }
    }

    public final void t(up5 up5Var, long j7) {
        this.f13797d = true;
        this.f13794a.s(up5Var, j7);
    }
}
