package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class si4 implements xi4 {

    /* renamed from: a, reason: collision with root package name */
    private final hw4 f15643a;

    /* renamed from: b, reason: collision with root package name */
    private final bo4 f15644b;

    private si4(bo4 bo4Var, hw4 hw4Var) {
        this.f15644b = bo4Var;
        this.f15643a = hw4Var;
    }

    public static si4 a(bo4 bo4Var) {
        return new si4(bo4Var, ej4.a(bo4Var.d0()));
    }

    public static si4 b(bo4 bo4Var) {
        return new si4(bo4Var, ej4.b(bo4Var.d0()));
    }

    public final bo4 c() {
        return this.f15644b;
    }

    @Override // com.google.android.gms.internal.ads.xi4
    public final hw4 e() {
        return this.f15643a;
    }
}
