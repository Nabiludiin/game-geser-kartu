package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class g32 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f8632a;

    private g32(w85 w85Var) {
        this.f8632a = w85Var;
    }

    public static g32 c(w85 w85Var) {
        return new g32(w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String b() {
        String packageName = ((ou0) this.f8632a).a().getPackageName();
        v85.b(packageName);
        return packageName;
    }
}
