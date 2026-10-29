package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class pd3 extends q3.a {
    public static final Parcelable.Creator<pd3> CREATOR = new qd3();

    /* renamed from: q, reason: collision with root package name */
    public final int f13834q;

    /* renamed from: r, reason: collision with root package name */
    public final String f13835r;

    /* renamed from: s, reason: collision with root package name */
    public final String f13836s;

    pd3(int i7, String str, String str2) {
        this.f13834q = i7;
        this.f13835r = str;
        this.f13836s = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f13834q;
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, i8);
        q3.c.r(parcel, 2, this.f13835r, false);
        q3.c.r(parcel, 3, this.f13836s, false);
        q3.c.b(parcel, a8);
    }

    public pd3(String str, String str2) {
        this(1, str, str2);
    }
}
