package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* compiled from: MyApplication */
public abstract class wy {
    public static Object a(jy3 jy3Var) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return jy3Var.a();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
