package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: MyApplication */
public final class bz {
    public static final void a(zy zyVar, xy xyVar) {
        if (xyVar.b() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(xyVar.c())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zyVar.a(xyVar.b(), xyVar.c(), xyVar.a(), xyVar.d());
    }
}
