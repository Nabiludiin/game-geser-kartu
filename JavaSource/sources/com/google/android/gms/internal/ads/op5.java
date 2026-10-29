package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: MyApplication */
public final class op5 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicLong f13439a = new AtomicLong();

    public op5(long j7, cq3 cq3Var, Uri uri, Map map, long j8, long j9, long j10) {
    }

    public static long a() {
        return f13439a.getAndIncrement();
    }

    public op5(long j7, cq3 cq3Var, long j8) {
        Uri uri = cq3Var.f6571a;
    }
}
