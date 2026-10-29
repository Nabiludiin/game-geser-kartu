package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class mu0 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final iu0 f12427a;

    private mu0(iu0 iu0Var) {
        this.f12427a = iu0Var;
    }

    public static mu0 c(iu0 iu0Var) {
        return new mu0(iu0Var);
    }

    public static Context d(iu0 iu0Var) {
        Context b8 = iu0Var.b();
        v85.b(b8);
        return b8;
    }

    public final Context a() {
        return d(this.f12427a);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* synthetic */ Object b() {
        return d(this.f12427a);
    }
}
