package com.android.billingclient.api;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
final class r implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadFactory f4045a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f4046b;

    r(b bVar) {
        Objects.requireNonNull(bVar);
        this.f4045a = Executors.defaultThreadFactory();
        this.f4046b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f4046b;
        Thread newThread = this.f4045a.newThread(runnable);
        newThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return newThread;
    }
}
