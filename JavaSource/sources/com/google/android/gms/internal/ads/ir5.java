package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: MyApplication */
public final class ir5 extends wo5 implements vq5 {

    /* renamed from: h, reason: collision with root package name */
    private final wk3 f10155h;

    /* renamed from: i, reason: collision with root package name */
    private final rq5 f10156i;

    /* renamed from: j, reason: collision with root package name */
    private final jm5 f10157j;

    /* renamed from: k, reason: collision with root package name */
    private final int f10158k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f10159l = true;

    /* renamed from: m, reason: collision with root package name */
    private long f10160m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private boolean f10161n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f10162o;

    /* renamed from: p, reason: collision with root package name */
    private kb4 f10163p;

    /* renamed from: q, reason: collision with root package name */
    private j9 f10164q;

    /* renamed from: r, reason: collision with root package name */
    private final uu5 f10165r;

    /* synthetic */ ir5(j9 j9Var, wk3 wk3Var, rq5 rq5Var, jm5 jm5Var, uu5 uu5Var, int i7, int i8, eq5 eq5Var, jy3 jy3Var, byte[] bArr) {
        this.f10164q = j9Var;
        this.f10155h = wk3Var;
        this.f10156i = rq5Var;
        this.f10157j = jm5Var;
        this.f10165r = uu5Var;
        this.f10158k = i7;
    }

    private final void y() {
        long j7 = this.f10160m;
        boolean z7 = this.f10161n;
        boolean z8 = this.f10162o;
        j9 V = V();
        az ur5Var = new ur5(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j7, j7, 0L, 0L, z7, false, false, null, V, z8 ? V.f10400c : null);
        if (this.f10159l) {
            ur5Var = new er5(this, ur5Var);
        }
        q(ur5Var);
    }

    @Override // com.google.android.gms.internal.ads.aq5
    public final synchronized j9 V() {
        return this.f10164q;
    }

    @Override // com.google.android.gms.internal.ads.vq5
    public final void b(long j7, q3 q3Var, boolean z7) {
        if (j7 == -9223372036854775807L) {
            j7 = this.f10160m;
        }
        boolean b8 = q3Var.b();
        if (!this.f10159l && this.f10160m == j7 && this.f10161n == b8 && this.f10162o == z7) {
            return;
        }
        this.f10160m = j7;
        this.f10161n = b8;
        this.f10162o = z7;
        this.f10159l = false;
        y();
    }

    @Override // com.google.android.gms.internal.ads.aq5
    public final vp5 f(xp5 xp5Var, ku5 ku5Var, long j7) {
        yl3 a8 = this.f10155h.a();
        kb4 kb4Var = this.f10163p;
        if (kb4Var != null) {
            a8.a(kb4Var);
        }
        m5 m5Var = V().f10399b;
        m5Var.getClass();
        return new dr5(m5Var.f12071a, a8, this.f10156i.a(x()), this.f10157j, u(xp5Var), this.f10165r, s(xp5Var), this, ku5Var, null, this.f10158k, 0, null, hi2.N(-9223372036854775807L), null);
    }

    @Override // com.google.android.gms.internal.ads.aq5
    public final void h(vp5 vp5Var) {
        ((dr5) vp5Var).T();
    }

    @Override // com.google.android.gms.internal.ads.aq5
    public final synchronized void i(j9 j9Var) {
        this.f10164q = j9Var;
    }

    @Override // com.google.android.gms.internal.ads.wo5
    protected final void n(kb4 kb4Var) {
        this.f10163p = kb4Var;
        Looper.myLooper().getClass();
        x();
        y();
    }

    @Override // com.google.android.gms.internal.ads.wo5
    protected final void p() {
    }

    @Override // com.google.android.gms.internal.ads.aq5
    public final void r() {
    }
}
