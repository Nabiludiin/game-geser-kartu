package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
final class d74 extends k64 implements y64 {

    /* renamed from: r, reason: collision with root package name */
    private final ScheduledFuture f6963r;

    d74(a5.d dVar, ScheduledFuture scheduledFuture) {
        super(dVar);
        this.f6963r = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        boolean cancel = k().cancel(z7);
        if (cancel) {
            this.f6963r.cancel(z7);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f6963r.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f6963r.getDelay(timeUnit);
    }
}
