package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class k53 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f10892a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f10893b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f10894c;

    private k53(j53 j53Var, w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f10892a = w85Var;
        this.f10893b = w85Var2;
        this.f10894c = w85Var3;
    }

    public static k53 a(j53 j53Var, w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new k53(j53Var, w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        pa0 b8 = new ga0().b(((ou0) this.f10892a).a(), ((ev0) this.f10893b).a(), (e63) this.f10894c.b());
        v85.b(b8);
        return b8;
    }
}
