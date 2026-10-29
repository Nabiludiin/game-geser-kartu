package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public interface a74 extends ScheduledExecutorService, z64 {
    y64 d0(Callable callable, long j7, TimeUnit timeUnit);
}
