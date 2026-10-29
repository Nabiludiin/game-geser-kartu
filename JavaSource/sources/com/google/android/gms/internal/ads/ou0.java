package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class ou0 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final iu0 f13498a;

    private ou0(iu0 iu0Var) {
        this.f13498a = iu0Var;
    }

    public static ou0 c(iu0 iu0Var) {
        return new ou0(iu0Var);
    }

    public static Context d(iu0 iu0Var) {
        Context a8 = iu0Var.a();
        v85.b(a8);
        return a8;
    }

    public final Context a() {
        return d(this.f13498a);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* synthetic */ Object b() {
        return d(this.f13498a);
    }
}
