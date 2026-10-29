package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class yh0 extends q3.a {
    public static final Parcelable.Creator<yh0> CREATOR = new zh0();

    /* renamed from: q, reason: collision with root package name */
    public final s2.b5 f19584q;

    /* renamed from: r, reason: collision with root package name */
    public final String f19585r;

    public yh0(s2.b5 b5Var, String str) {
        this.f19584q = b5Var;
        this.f19585r = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        s2.b5 b5Var = this.f19584q;
        int a8 = q3.c.a(parcel);
        q3.c.q(parcel, 2, b5Var, i7, false);
        q3.c.r(parcel, 3, this.f19585r, false);
        q3.c.b(parcel, a8);
    }
}
