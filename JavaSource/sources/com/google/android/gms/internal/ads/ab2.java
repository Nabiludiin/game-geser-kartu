package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: MyApplication */
public final class ab2 implements pd1 {
    protected ab2() {
    }

    @Override // com.google.android.gms.internal.ads.pd1
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.internal.ads.pd1
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.pd1
    public final zn1 c(Looper looper, Handler.Callback callback) {
        return new cd2(new Handler(looper, callback));
    }

    @Override // com.google.android.gms.internal.ads.pd1
    public final long d() {
        return System.nanoTime();
    }
}
