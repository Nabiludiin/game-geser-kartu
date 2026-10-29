package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class hk2 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f9559a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private gk2 f9560b;

    public final void a(boolean z7) {
        this.f9559a.set(true);
    }

    public final boolean b() {
        return this.f9559a.get();
    }

    final void c(gk2 gk2Var) {
        this.f9560b = gk2Var;
    }

    final gk2 d() {
        return this.f9560b;
    }
}
