package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class og0 extends q3.a {
    public static final Parcelable.Creator<og0> CREATOR = new pg0();

    /* renamed from: q, reason: collision with root package name */
    public final String f13317q;

    public og0(String str) {
        this.f13317q = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f13317q;
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 1, str, false);
        q3.c.b(parcel, a8);
    }
}
