package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* compiled from: MyApplication */
final class n extends b0 {
    n() {
    }

    @Override // com.google.android.gms.internal.play_billing.b0
    public final long a() {
        return SystemClock.elapsedRealtime() * 1000000;
    }
}
