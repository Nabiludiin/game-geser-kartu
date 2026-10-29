package com.google.android.gms.common.util;

import android.os.Looper;

/* compiled from: MyApplication */
public abstract class y {
    public static boolean a() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
