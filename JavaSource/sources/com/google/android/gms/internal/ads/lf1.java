package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class lf1 implements jd1 {

    /* renamed from: q, reason: collision with root package name */
    private int f11598q = ((Integer) s2.b0.c().d(uy.f17247y1)).intValue();

    /* renamed from: r, reason: collision with root package name */
    private int f11599r = ((Integer) s2.b0.c().d(uy.Ud)).intValue();

    public final synchronized int a() {
        return this.f11598q;
    }

    public final synchronized int b() {
        return this.f11599r;
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final synchronized void x(o03 o03Var) {
        if (((Boolean) s2.b0.c().d(uy.f17255z1)).booleanValue()) {
            try {
                f03 f03Var = o03Var.f13137b.f12530b;
                this.f11598q = f03Var.f7927c;
                this.f11599r = f03Var.f7928d;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final void J(eh0 eh0Var) {
    }
}
