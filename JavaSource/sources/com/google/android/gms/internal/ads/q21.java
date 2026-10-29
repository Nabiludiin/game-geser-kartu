package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: MyApplication */
public final class q21 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final o21 f14212a;

    private q21(o21 o21Var) {
        this.f14212a = o21Var;
    }

    public static q21 c(o21 o21Var) {
        return new q21(o21Var);
    }

    public static View d(o21 o21Var) {
        View b8 = o21Var.b();
        v85.b(b8);
        return b8;
    }

    public final View a() {
        return d(this.f14212a);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* synthetic */ Object b() {
        return d(this.f14212a);
    }
}
