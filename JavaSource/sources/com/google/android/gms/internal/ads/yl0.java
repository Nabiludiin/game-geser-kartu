package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* compiled from: MyApplication */
final class yl0 extends ScheduledThreadPoolExecutor implements AutoCloseable {
    yl0(int i7, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        xl0.a(this);
    }
}
