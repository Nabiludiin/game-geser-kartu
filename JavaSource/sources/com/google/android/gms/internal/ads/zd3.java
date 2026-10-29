package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class zd3 extends q3.a {
    public static final Parcelable.Creator<zd3> CREATOR = new ae3();

    /* renamed from: q, reason: collision with root package name */
    public final int f20145q;

    /* renamed from: r, reason: collision with root package name */
    public final int f20146r;

    /* renamed from: s, reason: collision with root package name */
    public final String f20147s;

    /* renamed from: t, reason: collision with root package name */
    public final String f20148t;

    /* renamed from: u, reason: collision with root package name */
    public final int f20149u;

    zd3(int i7, int i8, int i9, String str, String str2) {
        this.f20145q = i7;
        this.f20146r = i8;
        this.f20147s = str;
        this.f20148t = str2;
        this.f20149u = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f20145q;
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, i8);
        q3.c.l(parcel, 2, this.f20146r);
        q3.c.r(parcel, 3, this.f20147s, false);
        q3.c.r(parcel, 4, this.f20148t, false);
        q3.c.l(parcel, 5, this.f20149u);
        q3.c.b(parcel, a8);
    }

    public zd3(int i7, mq mqVar, String str, String str2) {
        this(1, 1, mqVar.a(), str, str2);
    }
}
