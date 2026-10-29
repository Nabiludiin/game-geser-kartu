package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class mq1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f12368a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f12369b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f12370c;

    private mq1(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f12368a = w85Var2;
        this.f12369b = w85Var3;
        this.f12370c = w85Var4;
    }

    public static mq1 c(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new mq1(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lq1 b() {
        return new lq1(z33.c(), ((br1) this.f12368a).b(), ((hr1) this.f12369b).b(), (lx1) this.f12370c.b());
    }
}
