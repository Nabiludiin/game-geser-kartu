package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class q5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f22525a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22526b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22527c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f22528d;

    public q5(String str, String str2, Bundle bundle, long j7) {
        this.f22525a = str;
        this.f22526b = str2;
        this.f22528d = bundle;
        this.f22527c = j7;
    }

    public static q5 a(g0 g0Var) {
        return new q5(g0Var.f22160q, g0Var.f22162s, g0Var.f22161r.R0(), g0Var.f22163t);
    }

    public final g0 b() {
        return new g0(this.f22525a, new e0(new Bundle(this.f22528d)), this.f22526b, this.f22527c);
    }

    public final String toString() {
        String str = this.f22526b;
        String obj = this.f22528d.toString();
        int length = String.valueOf(str).length();
        String str2 = this.f22525a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + obj.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(obj);
        return sb.toString();
    }
}
