package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* compiled from: MyApplication */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private static final b0 f21694a;

    static {
        b0 nVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            nVar = new m();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            nVar = new n();
        }
        f21694a = nVar;
    }

    public static b0 a() {
        return f21694a;
    }
}
