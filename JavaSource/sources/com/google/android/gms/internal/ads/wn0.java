package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.Objects;

/* compiled from: MyApplication */
final class wn0 implements Runnable {
    wn0(yn0 yn0Var) {
        Objects.requireNonNull(yn0Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
