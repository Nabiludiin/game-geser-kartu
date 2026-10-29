package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: MyApplication */
public final class pu0 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final iu0 f14109a;

    private pu0(iu0 iu0Var) {
        this.f14109a = iu0Var;
    }

    public static pu0 c(iu0 iu0Var) {
        return new pu0(iu0Var);
    }

    public static WeakReference d(iu0 iu0Var) {
        WeakReference c8 = iu0Var.c();
        v85.b(c8);
        return c8;
    }

    public final WeakReference a() {
        return d(this.f14109a);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* synthetic */ Object b() {
        return d(this.f14109a);
    }
}
