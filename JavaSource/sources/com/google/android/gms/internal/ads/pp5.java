package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class pp5 implements vp5, up5 {

    /* renamed from: q, reason: collision with root package name */
    public final xp5 f14004q;

    /* renamed from: r, reason: collision with root package name */
    private final long f14005r;

    /* renamed from: s, reason: collision with root package name */
    private final ku5 f14006s;

    /* renamed from: t, reason: collision with root package name */
    private aq5 f14007t;

    /* renamed from: u, reason: collision with root package name */
    private vp5 f14008u;

    /* renamed from: v, reason: collision with root package name */
    private up5 f14009v;

    /* renamed from: w, reason: collision with root package name */
    private long f14010w = -9223372036854775807L;

    public pp5(xp5 xp5Var, ku5 ku5Var, long j7) {
        this.f14004q = xp5Var;
        this.f14006s = ku5Var;
        this.f14005r = j7;
    }

    private final long v(long j7) {
        long j8 = this.f14010w;
        return j8 != -9223372036854775807L ? j8 : j7;
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final boolean a(mb5 mb5Var) {
        vp5 vp5Var = this.f14008u;
        return vp5Var != null && vp5Var.a(mb5Var);
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final void b(long j7) {
        vp5 vp5Var = this.f14008u;
        String str = hi2.f9535a;
        vp5Var.b(j7);
    }

    @Override // com.google.android.gms.internal.ads.rr5
    public final /* bridge */ /* synthetic */ void c(sr5 sr5Var) {
        up5 up5Var = this.f14009v;
        String str = hi2.f9535a;
        up5Var.c(this);
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final void d() {
        vp5 vp5Var = this.f14008u;
        if (vp5Var != null) {
            vp5Var.d();
            return;
        }
        aq5 aq5Var = this.f14007t;
        if (aq5Var != null) {
            aq5Var.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.up5
    public final void e(vp5 vp5Var) {
        up5 up5Var = this.f14009v;
        String str = hi2.f9535a;
        up5Var.e(this);
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final void f(long j7, boolean z7) {
        vp5 vp5Var = this.f14008u;
        String str = hi2.f9535a;
        vp5Var.f(j7, false);
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final long g() {
        vp5 vp5Var = this.f14008u;
        String str = hi2.f9535a;
        return vp5Var.g();
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final as5 h() {
        vp5 vp5Var = this.f14008u;
        String str = hi2.f9535a;
        return vp5Var.h();
    }

    public final long i() {
        return this.f14005r;
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final long j() {
        vp5 vp5Var = this.f14008u;
        String str = hi2.f9535a;
        return vp5Var.j();
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final long k() {
        vp5 vp5Var = this.f14008u;
        String str = hi2.f9535a;
        return vp5Var.k();
    }

    public final void l(long j7) {
        this.f14010w = j7;
    }

    public final long m() {
        return this.f14010w;
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final long n(long j7) {
        vp5 vp5Var = this.f14008u;
        String str = hi2.f9535a;
        return vp5Var.n(j7);
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final boolean o() {
        vp5 vp5Var = this.f14008u;
        return vp5Var != null && vp5Var.o();
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final long p(zt5[] zt5VarArr, boolean[] zArr, qr5[] qr5VarArr, boolean[] zArr2, long j7) {
        long j8 = this.f14010w;
        long j9 = (j8 == -9223372036854775807L || j7 != this.f14005r) ? j7 : j8;
        this.f14010w = -9223372036854775807L;
        vp5 vp5Var = this.f14008u;
        String str = hi2.f9535a;
        return vp5Var.p(zt5VarArr, zArr, qr5VarArr, zArr2, j9);
    }

    public final void q(aq5 aq5Var) {
        rx3.h(this.f14007t == null);
        this.f14007t = aq5Var;
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final long r(long j7, yc5 yc5Var) {
        vp5 vp5Var = this.f14008u;
        String str = hi2.f9535a;
        return vp5Var.r(j7, yc5Var);
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final void s(up5 up5Var, long j7) {
        this.f14009v = up5Var;
        vp5 vp5Var = this.f14008u;
        if (vp5Var != null) {
            vp5Var.s(this, v(this.f14005r));
        }
    }

    public final void t(xp5 xp5Var) {
        long v7 = v(this.f14005r);
        aq5 aq5Var = this.f14007t;
        aq5Var.getClass();
        vp5 f8 = aq5Var.f(xp5Var, this.f14006s, v7);
        this.f14008u = f8;
        if (this.f14009v != null) {
            f8.s(this, v7);
        }
    }

    public final void u() {
        vp5 vp5Var = this.f14008u;
        if (vp5Var != null) {
            aq5 aq5Var = this.f14007t;
            aq5Var.getClass();
            aq5Var.h(vp5Var);
        }
    }
}
