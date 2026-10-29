package com.google.android.gms.internal.ads;

import android.os.Build;

/* compiled from: MyApplication */
public abstract class mm5 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f12310a;

    static {
        boolean z7 = false;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z7 = true;
            }
        }
        f12310a = z7;
    }
}
