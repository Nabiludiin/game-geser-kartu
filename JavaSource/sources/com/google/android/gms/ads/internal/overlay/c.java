package com.google.android.gms.ads.internal.overlay;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import r2.t;

/* compiled from: MyApplication */
final class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final long f4360a;

    c(long j7) {
        this.f4360a = j7;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ConcurrentHashMap concurrentHashMap;
        long j7 = this.f4360a;
        concurrentHashMap = AdOverlayInfoParcel.P;
        if (concurrentHashMap.remove(Long.valueOf(j7)) == null) {
            return null;
        }
        t.l().i(new Exception("Key was non-null in AdOverlayObjectsCleanupTask"), "AdOverlayObjectsCleanupTask");
        return null;
    }
}
