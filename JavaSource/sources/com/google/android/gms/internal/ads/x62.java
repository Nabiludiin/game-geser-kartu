package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* compiled from: MyApplication */
public final class x62 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f18630a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f18631b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f18632c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f18633d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f18634e;

    private x62(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7, w85 w85Var8) {
        this.f18630a = w85Var;
        this.f18631b = w85Var4;
        this.f18632c = w85Var5;
        this.f18633d = w85Var6;
        this.f18634e = w85Var8;
    }

    public static x62 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5, w85 w85Var6, w85 w85Var7, w85 w85Var8) {
        return new x62(w85Var, w85Var2, w85Var3, w85Var4, w85Var5, w85Var6, w85Var7, w85Var8);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new w62(((ou0) this.f18630a).a(), z33.c(), ov0.a(), ((bv0) this.f18631b).b(), ((f72) this.f18632c).b(), (ArrayDeque) this.f18633d.b(), lv0.a(), (e63) this.f18634e.b());
    }
}
