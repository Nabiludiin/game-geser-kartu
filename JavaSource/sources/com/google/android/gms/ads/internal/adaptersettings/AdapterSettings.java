package com.google.android.gms.ads.internal.adaptersettings;

import com.google.android.gms.internal.ads.dy;
import s2.b0;

/* compiled from: MyApplication */
class AdapterSettings {
    private static volatile AdapterSettings instance;
    private final dy adapterSettingsInternal = b0.d();

    AdapterSettings() {
    }

    private boolean getBoolean(String str, boolean z7) {
        return this.adapterSettingsInternal.f(str, z7);
    }

    private float getFloat(String str, float f8) {
        return this.adapterSettingsInternal.e(str, f8);
    }

    public static AdapterSettings getInstance() {
        if (instance == null) {
            synchronized (AdapterSettings.class) {
                try {
                    if (instance == null) {
                        instance = new AdapterSettings();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    private int getInt(String str, int i7) {
        return this.adapterSettingsInternal.d(str, i7);
    }

    private long getLong(String str, long j7) {
        return this.adapterSettingsInternal.c(str, j7);
    }

    private String getString(String str, String str2) {
        return this.adapterSettingsInternal.b(str, str2);
    }
}
