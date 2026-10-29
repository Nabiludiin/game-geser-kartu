package com.google.android.gms.common.util;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: MyApplication */
public abstract class r {
    public static void a(Context context, SharedPreferences.Editor editor, String str) {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}
