package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: MyApplication */
public final class p81 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f13712a;

    p81(o03 o03Var) {
        AtomicLong atomicLong = new AtomicLong();
        this.f13712a = atomicLong;
        atomicLong.set(o03Var.f13136a.f11326a.f17975u.get());
    }

    public final long a() {
        return this.f13712a.get();
    }

    public final void b(long j7) {
        this.f13712a.set(j7);
    }
}
