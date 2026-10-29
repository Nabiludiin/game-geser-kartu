package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class g70 extends q3.a {
    public static final Parcelable.Creator<g70> CREATOR = new h70();

    /* renamed from: q, reason: collision with root package name */
    public final String f8686q;

    /* renamed from: r, reason: collision with root package name */
    public final String[] f8687r;

    /* renamed from: s, reason: collision with root package name */
    public final String[] f8688s;

    g70(String str, String[] strArr, String[] strArr2) {
        this.f8686q = str;
        this.f8687r = strArr;
        this.f8688s = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f8686q;
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 1, str, false);
        q3.c.s(parcel, 2, this.f8687r, false);
        q3.c.s(parcel, 3, this.f8688s, false);
        q3.c.b(parcel, a8);
    }
}
