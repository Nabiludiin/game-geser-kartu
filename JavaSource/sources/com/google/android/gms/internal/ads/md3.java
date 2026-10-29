package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class md3 extends q3.a {
    public static final Parcelable.Creator<md3> CREATOR = new nd3();

    /* renamed from: q, reason: collision with root package name */
    public final int f12233q;

    /* renamed from: r, reason: collision with root package name */
    public final byte[] f12234r;

    md3(int i7, byte[] bArr) {
        this.f12233q = i7;
        this.f12234r = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f12233q;
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, i8);
        q3.c.g(parcel, 2, this.f12234r, false);
        q3.c.b(parcel, a8);
    }

    public md3(byte[] bArr) {
        this(1, bArr);
    }
}
