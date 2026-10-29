package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class pa3 {

    /* renamed from: b, reason: collision with root package name */
    private static final pa3 f13767b = new pa3();

    /* renamed from: a, reason: collision with root package name */
    private Context f13768a;

    private pa3() {
    }

    public static pa3 a() {
        return f13767b;
    }

    public final Context b() {
        return this.f13768a;
    }

    public final void c(Context context) {
        this.f13768a = context != null ? context.getApplicationContext() : null;
    }
}
