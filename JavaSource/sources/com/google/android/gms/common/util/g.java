package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;

/* compiled from: MyApplication */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f4555a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th) {
        try {
            p3.o.m(context);
            p3.o.m(th);
            return false;
        } catch (Exception e8) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e8);
            return false;
        }
    }
}
