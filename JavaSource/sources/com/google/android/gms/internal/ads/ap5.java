package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class ap5 implements vp5, up5 {

    /* renamed from: q, reason: collision with root package name */
    public final vp5 f5198q;

    /* renamed from: r, reason: collision with root package name */
    private up5 f5199r;

    /* renamed from: s, reason: collision with root package name */
    private zo5[] f5200s = new zo5[0];

    /* renamed from: t, reason: collision with root package name */
    private long f5201t = 0;

    /* renamed from: u, reason: collision with root package name */
    long f5202u;

    public ap5(vp5 vp5Var, boolean z7, long j7, long j8) {
        this.f5198q = vp5Var;
        this.f5202u = j8;
    }

    private static long m(long j7, long j8, long j9) {
        long max = Math.max(j7, j8);
        return j9 != Long.MIN_VALUE ? Math.min(max, j9) : max;
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final boolean a(mb5 mb5Var) {
        return this.f5198q.a(mb5Var);
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final void b(long j7) {
        this.f5198q.b(j7);
    }

    @Override // com.google.android.gms.internal.ads.rr5
    public final /* bridge */ /* synthetic */ void c(sr5 sr5Var) {
        up5 up5Var = this.f5199r;
        up5Var.getClass();
        up5Var.c(this);
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final void d() {
        this.f5198q.d();
    }

    @Override // com.google.android.gms.internal.ads.up5
    public final void e(vp5 vp5Var) {
        up5 up5Var = this.f5199r;
        up5Var.getClass();
        up5Var.e(this);
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final void f(long j7, boolean z7) {
        this.f5198q.f(j7, false);
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final long g() {
        if (l()) {
            long j7 = this.f5201t;
            this.f5201t = -9223372036854775807L;
            long g8 = g();
            return g8 != -9223372036854775807L ? g8 : j7;
        }
        long g9 = this.f5198q.g();
        if (g9 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return m(g9, 0L, this.f5202u);
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final as5 h() {
        return this.f5198q.h();
    }

    public final void i(long j7, long j8) {
        this.f5202u = j8;
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final long j() {
        long j7 = this.f5198q.j();
        if (j7 != Long.MIN_VALUE) {
            long j8 = this.f5202u;
            if (j8 == Long.MIN_VALUE || j7 < j8) {
                return j7;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final long k() {
        long k7 = this.f5198q.k();
        if (k7 != Long.MIN_VALUE) {
            long j7 = this.f5202u;
            if (j7 == Long.MIN_VALUE || k7 < j7) {
                return k7;
            }
        }
        return Long.MIN_VALUE;
    }

    final boolean l() {
        return this.f5201t != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final long n(long j7) {
        this.f5201t = -9223372036854775807L;
        for (zo5 zo5Var : this.f5200s) {
            if (zo5Var != null) {
                zo5Var.c();
            }
        }
        return m(this.f5198q.n(j7), 0L, this.f5202u);
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final boolean o() {
        return this.f5198q.o();
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final long p(zt5[] zt5VarArr, boolean[] zArr, qr5[] qr5VarArr, boolean[] zArr2, long j7) {
        int length = qr5VarArr.length;
        this.f5200s = new zo5[length];
        qr5[] qr5VarArr2 = new qr5[length];
        int i7 = 0;
        while (true) {
            qr5 qr5Var = null;
            if (i7 >= qr5VarArr.length) {
                break;
            }
            zo5[] zo5VarArr = this.f5200s;
            zo5 zo5Var = (zo5) qr5VarArr[i7];
            zo5VarArr[i7] = zo5Var;
            if (zo5Var != null) {
                qr5Var = zo5Var.f20260a;
            }
            qr5VarArr2[i7] = qr5Var;
            i7++;
        }
        long p7 = this.f5198q.p(zt5VarArr, zArr, qr5VarArr2, zArr2, j7);
        long m7 = m(p7, j7, this.f5202u);
        long j8 = -9223372036854775807L;
        if (l()) {
            if (p7 >= j7) {
                if (p7 != 0) {
                    for (zt5 zt5Var : zt5VarArr) {
                        if (zt5Var != null) {
                            eq5 d8 = zt5Var.d();
                            if (!th.d(d8.f7775o, d8.f7771k)) {
                            }
                        }
                    }
                }
            }
            j8 = m7;
            break;
        }
        this.f5201t = j8;
        for (int i8 = 0; i8 < qr5VarArr.length; i8++) {
            qr5 qr5Var2 = qr5VarArr2[i8];
            if (qr5Var2 == null) {
                this.f5200s[i8] = null;
            } else {
                zo5[] zo5VarArr2 = this.f5200s;
                zo5 zo5Var2 = zo5VarArr2[i8];
                if (zo5Var2 == null || zo5Var2.f20260a != qr5Var2) {
                    zo5VarArr2[i8] = new zo5(this, qr5Var2);
                }
            }
            qr5VarArr[i8] = this.f5200s[i8];
        }
        return m7;
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final long r(long j7, yc5 yc5Var) {
        if (j7 == 0) {
            return 0L;
        }
        long j8 = yc5Var.f19505a;
        String str = hi2.f9535a;
        long max = Math.max(0L, Math.min(j8, j7));
        long j9 = yc5Var.f19506b;
        long j10 = this.f5202u;
        long max2 = Math.max(0L, Math.min(j9, j10 == Long.MIN_VALUE ? Long.MAX_VALUE : j10 - j7));
        if (max != j8 || max2 != j9) {
            yc5Var = new yc5(max, max2);
        }
        return this.f5198q.r(j7, yc5Var);
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final void s(up5 up5Var, long j7) {
        this.f5199r = up5Var;
        this.f5198q.s(this, j7);
    }
}
