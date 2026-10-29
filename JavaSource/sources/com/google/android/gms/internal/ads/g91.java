package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class g91 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final e91 f8720a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f8721b;

    private g91(e91 e91Var, w85 w85Var) {
        this.f8720a = e91Var;
        this.f8721b = w85Var;
    }

    public static g91 a(e91 e91Var, w85 w85Var) {
        return new g91(e91Var, w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        Context f8 = this.f8720a.f(((ou0) this.f8721b).a());
        v85.b(f8);
        return f8;
    }
}
