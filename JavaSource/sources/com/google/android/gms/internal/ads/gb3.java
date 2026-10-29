package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* compiled from: MyApplication */
public abstract class gb3 {

    /* renamed from: a, reason: collision with root package name */
    private static UiModeManager f8758a;

    public static void a(Context context) {
        if (context != null) {
            f8758a = (UiModeManager) context.getSystemService("uimode");
        }
    }

    public static t93 b() {
        UiModeManager uiModeManager = f8758a;
        if (uiModeManager == null) {
            return t93.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? t93.OTHER : t93.CTV : t93.MOBILE;
    }
}
