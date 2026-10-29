package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class q31 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f14226a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f14227b;

    private q31(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f14226a = w85Var2;
        this.f14227b = w85Var3;
    }

    public static q31 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new q31(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* synthetic */ Object b() {
        return true == Boolean.valueOf(o31.a()).booleanValue() ? ((rd2) this.f14226a).b() : ((sf2) this.f14227b).b();
    }
}
