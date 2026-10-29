package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class ms2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f12400a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f12401b;

    private ms2(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f12400a = w85Var2;
        this.f12401b = w85Var3;
    }

    public static ms2 c(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new ms2(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ls2 b() {
        return new ls2(z33.c(), ((ou0) this.f12400a).a(), (h22) this.f12401b.b());
    }
}
