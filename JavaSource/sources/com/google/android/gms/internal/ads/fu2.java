package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class fu2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    final ScheduledExecutorService f8500a;

    public fu2(gf0 gf0Var, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.f8500a = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return p64.k(p64.i(p64.a(new Bundle()), ((Long) s2.b0.c().d(uy.M4)).longValue(), TimeUnit.MILLISECONDS, this.f8500a), eu2.f7825a, cm0.f6500a);
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 49;
    }
}
