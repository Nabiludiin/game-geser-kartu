package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class cr0 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f6582a = new AtomicBoolean(false);

    public cr0(String str) {
    }

    public final boolean a() {
        return this.f6582a.get();
    }

    public final void b() {
        this.f6582a.set(true);
    }

    public final void c() {
        this.f6582a.set(false);
    }

    public final void d() {
        this.f6582a.set(false);
    }
}
