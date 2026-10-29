package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class cs5 extends fp5 {

    /* renamed from: k, reason: collision with root package name */
    protected final aq5 f6609k;

    protected cs5(aq5 aq5Var) {
        this.f6609k = aq5Var;
    }

    @Override // com.google.android.gms.internal.ads.fp5
    protected final /* bridge */ /* synthetic */ int A(Object obj, int i7) {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.fp5
    protected final /* synthetic */ xp5 B(Object obj, xp5 xp5Var) {
        return F(xp5Var);
    }

    @Override // com.google.android.gms.internal.ads.fp5
    protected final /* synthetic */ long C(Object obj, long j7, xp5 xp5Var) {
        return j7;
    }

    protected abstract void D();

    protected abstract void E(az azVar);

    protected abstract xp5 F(xp5 xp5Var);

    @Override // com.google.android.gms.internal.ads.wo5, com.google.android.gms.internal.ads.aq5
    public final az M() {
        this.f6609k.M();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wo5, com.google.android.gms.internal.ads.aq5
    public final boolean U() {
        this.f6609k.U();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.aq5
    public final j9 V() {
        return this.f6609k.V();
    }

    @Override // com.google.android.gms.internal.ads.aq5
    public abstract void h(vp5 vp5Var);

    @Override // com.google.android.gms.internal.ads.fp5, com.google.android.gms.internal.ads.wo5
    protected final void n(kb4 kb4Var) {
        super.n(kb4Var);
        D();
    }

    @Override // com.google.android.gms.internal.ads.fp5
    protected final /* synthetic */ void y(Object obj, aq5 aq5Var, az azVar) {
        E(azVar);
    }
}
