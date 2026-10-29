package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class i70 extends q3.a {
    public static final Parcelable.Creator<i70> CREATOR = new j70();

    /* renamed from: q, reason: collision with root package name */
    public final boolean f9861q;

    /* renamed from: r, reason: collision with root package name */
    public final String f9862r;

    /* renamed from: s, reason: collision with root package name */
    public final int f9863s;

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f9864t;

    /* renamed from: u, reason: collision with root package name */
    public final String[] f9865u;

    /* renamed from: v, reason: collision with root package name */
    public final String[] f9866v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f9867w;

    /* renamed from: x, reason: collision with root package name */
    public final long f9868x;

    i70(boolean z7, String str, int i7, byte[] bArr, String[] strArr, String[] strArr2, boolean z8, long j7) {
        this.f9861q = z7;
        this.f9862r = str;
        this.f9863s = i7;
        this.f9864t = bArr;
        this.f9865u = strArr;
        this.f9866v = strArr2;
        this.f9867w = z8;
        this.f9868x = j7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        boolean z7 = this.f9861q;
        int a8 = q3.c.a(parcel);
        q3.c.c(parcel, 1, z7);
        q3.c.r(parcel, 2, this.f9862r, false);
        q3.c.l(parcel, 3, this.f9863s);
        q3.c.g(parcel, 4, this.f9864t, false);
        q3.c.s(parcel, 5, this.f9865u, false);
        q3.c.s(parcel, 6, this.f9866v, false);
        q3.c.c(parcel, 7, this.f9867w);
        q3.c.o(parcel, 8, this.f9868x);
        q3.c.b(parcel, a8);
    }
}
