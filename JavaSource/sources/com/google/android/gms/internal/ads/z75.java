package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: MyApplication */
public final class z75 extends e85 {

    /* renamed from: a, reason: collision with root package name */
    final String f20042a;

    public z75(String str) {
        this.f20042a = str;
    }

    @Override // com.google.android.gms.internal.ads.e85
    public final void a(String str) {
        String str2 = this.f20042a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
