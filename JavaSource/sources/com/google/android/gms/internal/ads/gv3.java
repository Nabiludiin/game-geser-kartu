package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public abstract class gv3 {
    public static fv3 a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new hv3(new yv3(context));
    }
}
