package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class s81 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f15494a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f15495b;

    private s81(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f15494a = w85Var;
        this.f15495b = w85Var2;
    }

    public static s81 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new s81(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new r81((Context) this.f15494a.b(), ((j51) this.f15495b).a(), new hf0());
    }
}
