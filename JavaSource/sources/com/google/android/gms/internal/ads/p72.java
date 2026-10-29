package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class p72 implements qb1, z91 {

    /* renamed from: s, reason: collision with root package name */
    private static final Object f13686s = new Object();

    /* renamed from: t, reason: collision with root package name */
    private static int f13687t;

    /* renamed from: q, reason: collision with root package name */
    private final v2.p1 f13688q;

    /* renamed from: r, reason: collision with root package name */
    private final a82 f13689r;

    public p72(a82 a82Var, v2.p1 p1Var) {
        this.f13689r = a82Var;
        this.f13688q = p1Var;
    }

    private final void a(boolean z7) {
        int i7;
        int intValue;
        if (((Boolean) s2.b0.c().d(uy.L6)).booleanValue() && !this.f13688q.H()) {
            Object obj = f13686s;
            synchronized (obj) {
                i7 = f13687t;
                intValue = ((Integer) s2.b0.c().d(uy.M6)).intValue();
            }
            if (i7 < intValue) {
                this.f13689r.b(z7);
                synchronized (obj) {
                    f13687t++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qb1
    public final void f() {
        a(true);
    }

    @Override // com.google.android.gms.internal.ads.z91
    public final void o(s2.x2 x2Var) {
        a(false);
    }
}
