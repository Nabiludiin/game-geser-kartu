package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: MyApplication */
public final class ny {
    public static final SharedPreferences a(Context context) {
        try {
            return context.getSharedPreferences("google_adapter_flags", 0);
        } catch (IllegalStateException e8) {
            w2.p.g("", e8);
            return null;
        }
    }

    public static final SharedPreferences b(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e8) {
            w2.p.g("", e8);
            return null;
        }
    }
}
