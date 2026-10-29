package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class fj0 extends q3.a {
    public static final Parcelable.Creator<fj0> CREATOR = new gj0();

    /* renamed from: q, reason: collision with root package name */
    public final String f8280q;

    /* renamed from: r, reason: collision with root package name */
    public final String f8281r;

    public fj0(String str, String str2) {
        this.f8280q = str;
        this.f8281r = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f8280q;
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 1, str, false);
        q3.c.r(parcel, 2, this.f8281r, false);
        q3.c.b(parcel, a8);
    }
}
