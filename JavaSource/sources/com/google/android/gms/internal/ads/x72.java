package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class x72 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f18644a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f18645b;

    private x72(w85 w85Var, w85 w85Var2) {
        this.f18644a = w85Var;
        this.f18645b = w85Var2;
    }

    public static x72 c(w85 w85Var, w85 w85Var2) {
        return new x72(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v72 b() {
        return new v72(((o72) this.f18644a).b(), ((ju0) this.f18645b).b());
    }
}
