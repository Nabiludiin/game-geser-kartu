package com.google.android.gms.common.util;

import android.os.SystemClock;

/* compiled from: MyApplication */
public class h implements e {

    /* renamed from: a, reason: collision with root package name */
    private static final h f4556a = new h();

    private h() {
    }

    public static e d() {
        return f4556a;
    }

    @Override // com.google.android.gms.common.util.e
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.e
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.e
    public final long c() {
        return System.nanoTime();
    }
}
