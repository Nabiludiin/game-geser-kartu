package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class g0 extends q3.a {
    public static final Parcelable.Creator<g0> CREATOR = new h0();

    /* renamed from: q, reason: collision with root package name */
    public final String f22160q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f22161r;

    /* renamed from: s, reason: collision with root package name */
    public final String f22162s;

    /* renamed from: t, reason: collision with root package name */
    public final long f22163t;

    g0(g0 g0Var, long j7) {
        p3.o.m(g0Var);
        this.f22160q = g0Var.f22160q;
        this.f22161r = g0Var.f22161r;
        this.f22162s = g0Var.f22162s;
        this.f22163t = j7;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f22161r);
        String str = this.f22162s;
        int length = String.valueOf(str).length();
        String str2 = this.f22160q;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + valueOf.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        h0.a(this, parcel, i7);
    }

    public g0(String str, e0 e0Var, String str2, long j7) {
        this.f22160q = str;
        this.f22161r = e0Var;
        this.f22162s = str2;
        this.f22163t = j7;
    }
}
