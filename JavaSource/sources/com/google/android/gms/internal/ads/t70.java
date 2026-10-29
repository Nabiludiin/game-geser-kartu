package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class t70 extends q3.a {
    public static final Parcelable.Creator<t70> CREATOR = new u70();

    /* renamed from: q, reason: collision with root package name */
    public final String f16007q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f16008r;

    /* renamed from: s, reason: collision with root package name */
    public final int f16009s;

    /* renamed from: t, reason: collision with root package name */
    public final String f16010t;

    public t70(String str, boolean z7, int i7, String str2) {
        this.f16007q = str;
        this.f16008r = z7;
        this.f16009s = i7;
        this.f16010t = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f16007q;
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 1, str, false);
        q3.c.c(parcel, 2, this.f16008r);
        q3.c.l(parcel, 3, this.f16009s);
        q3.c.r(parcel, 4, this.f16010t, false);
        q3.c.b(parcel, a8);
    }
}
