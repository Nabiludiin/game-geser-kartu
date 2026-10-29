package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: MyApplication */
final class xd2 {

    /* renamed from: a, reason: collision with root package name */
    final String f18767a;

    /* renamed from: b, reason: collision with root package name */
    final String f18768b;

    /* renamed from: c, reason: collision with root package name */
    int f18769c;

    /* renamed from: d, reason: collision with root package name */
    long f18770d;

    /* renamed from: e, reason: collision with root package name */
    final Integer f18771e;

    xd2(String str, String str2, int i7, long j7, Integer num) {
        this.f18767a = str;
        this.f18768b = str2;
        this.f18769c = i7;
        this.f18770d = j7;
        this.f18771e = num;
    }

    public final String toString() {
        Integer num;
        String str = this.f18767a;
        int i7 = this.f18769c;
        long j7 = this.f18770d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(i7).length() + 1 + String.valueOf(j7).length());
        sb.append(str);
        sb.append(".");
        sb.append(i7);
        sb.append(".");
        sb.append(j7);
        String sb2 = sb.toString();
        String str2 = this.f18768b;
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb3 = new StringBuilder(sb2.length() + 1 + String.valueOf(str2).length());
            sb3.append(sb2);
            sb3.append(".");
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        if (!((Boolean) s2.b0.c().d(uy.T1)).booleanValue() || (num = this.f18771e) == null || TextUtils.isEmpty(str2)) {
            return sb2;
        }
        StringBuilder sb4 = new StringBuilder(sb2.length() + 1 + num.toString().length());
        sb4.append(sb2);
        sb4.append(".");
        sb4.append(num);
        return sb4.toString();
    }
}
