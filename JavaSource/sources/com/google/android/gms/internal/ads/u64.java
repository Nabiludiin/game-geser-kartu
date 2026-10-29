package com.google.android.gms.internal.ads;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: MyApplication */
final class u64 extends AbstractOwnableSynchronizer implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    private final w64 f16609q;

    final /* synthetic */ void a(Thread thread) {
        super.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f16609q.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
