package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class f80 extends q3.a {
    public static final Parcelable.Creator<f80> CREATOR = new g80();

    /* renamed from: q, reason: collision with root package name */
    public final int f8056q;

    /* renamed from: r, reason: collision with root package name */
    public final int f8057r;

    /* renamed from: s, reason: collision with root package name */
    public final String f8058s;

    /* renamed from: t, reason: collision with root package name */
    public final int f8059t;

    public f80(int i7, int i8, String str, int i9) {
        this.f8056q = i7;
        this.f8057r = i8;
        this.f8058s = str;
        this.f8059t = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f8057r;
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, i8);
        q3.c.r(parcel, 2, this.f8058s, false);
        q3.c.l(parcel, 3, this.f8059t);
        q3.c.l(parcel, 1000, this.f8056q);
        q3.c.b(parcel, a8);
    }
}
