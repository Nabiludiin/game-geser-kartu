package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class l85 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private w85 f11458a;

    public static void a(w85 w85Var, w85 w85Var2) {
        l85 l85Var = (l85) w85Var;
        if (l85Var.f11458a != null) {
            throw new IllegalStateException();
        }
        l85Var.f11458a = w85Var2;
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final Object b() {
        w85 w85Var = this.f11458a;
        if (w85Var != null) {
            return w85Var.b();
        }
        throw new IllegalStateException();
    }
}
