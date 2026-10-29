package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class a21 {

    /* renamed from: c, reason: collision with root package name */
    private static final String f4694c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f4695d;

    /* renamed from: a, reason: collision with root package name */
    public final String f4696a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4697b;

    static {
        String str = hi2.f9535a;
        f4694c = Integer.toString(0, 36);
        f4695d = Integer.toString(1, 36);
    }

    public a21(String str, int i7) {
        this.f4696a = str;
        this.f4697b = i7;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(f4694c, this.f4696a);
        bundle.putInt(f4695d, this.f4697b);
        return bundle;
    }
}
