package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class rc extends q3.a {
    public static final Parcelable.Creator<rc> CREATOR = new sc();

    /* renamed from: q, reason: collision with root package name */
    public final String f22580q;

    /* renamed from: r, reason: collision with root package name */
    public final long f22581r;

    /* renamed from: s, reason: collision with root package name */
    public final int f22582s;

    rc(String str, long j7, int i7) {
        this.f22580q = str;
        this.f22581r = j7;
        this.f22582s = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f22580q;
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 1, str, false);
        q3.c.o(parcel, 2, this.f22581r);
        q3.c.l(parcel, 3, this.f22582s);
        q3.c.b(parcel, a8);
    }
}
