package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: MyApplication */
public abstract class oh0 extends ContextWrapper {
    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
