package com.google.android.gms.internal.measurement;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: MyApplication */
final class c3 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadFactory f20851a;

    c3(p3 p3Var) {
        Objects.requireNonNull(p3Var);
        this.f20851a = Executors.defaultThreadFactory();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f20851a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
