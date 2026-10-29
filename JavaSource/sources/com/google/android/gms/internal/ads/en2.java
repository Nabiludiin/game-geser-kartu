package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
public final class en2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f7723a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f7724b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f7725c;

    private en2(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f7723a = w85Var;
        this.f7724b = w85Var2;
        this.f7725c = w85Var3;
    }

    public static en2 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new en2(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        Object b8 = ((bj2) this.f7723a).b();
        Object obj = (dm2) this.f7724b.b();
        if (true == ((List) this.f7725c.b()).contains("2")) {
            b8 = obj;
        }
        v85.b(b8);
        return b8;
    }
}
