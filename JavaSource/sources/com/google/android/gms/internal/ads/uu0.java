package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class uu0 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f16988a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f16989b;

    private uu0(iu0 iu0Var, w85 w85Var, w85 w85Var2) {
        this.f16988a = w85Var;
        this.f16989b = w85Var2;
    }

    public static uu0 a(iu0 iu0Var, w85 w85Var, w85 w85Var2) {
        return new uu0(iu0Var, w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return ((Boolean) s2.b0.c().d(uy.f17153m3)).booleanValue() ? new fn((zm) this.f16989b.b()) : new fn((zm) this.f16988a.b());
    }
}
