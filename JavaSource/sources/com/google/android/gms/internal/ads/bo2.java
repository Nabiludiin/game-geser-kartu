package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
public final class bo2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f5873a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f5874b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f5875c;

    private bo2(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f5873a = w85Var;
        this.f5874b = w85Var2;
        this.f5875c = w85Var3;
    }

    public static bo2 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new bo2(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        Object b8 = ((lq2) this.f5873a).b();
        Object obj = (dm2) this.f5874b.b();
        if (true == ((List) this.f5875c.b()).contains("29")) {
            b8 = obj;
        }
        v85.b(b8);
        return b8;
    }
}
