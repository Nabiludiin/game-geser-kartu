package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class wc extends q3.a {
    public static final Parcelable.Creator<wc> CREATOR = new xc();

    /* renamed from: q, reason: collision with root package name */
    public final long f22823q;

    /* renamed from: r, reason: collision with root package name */
    public byte[] f22824r;

    /* renamed from: s, reason: collision with root package name */
    public final String f22825s;

    /* renamed from: t, reason: collision with root package name */
    public final Bundle f22826t;

    /* renamed from: u, reason: collision with root package name */
    public final int f22827u;

    /* renamed from: v, reason: collision with root package name */
    public final long f22828v;

    /* renamed from: w, reason: collision with root package name */
    public String f22829w;

    wc(long j7, byte[] bArr, String str, Bundle bundle, int i7, long j8, String str2) {
        this.f22823q = j7;
        this.f22824r = bArr;
        this.f22825s = str;
        this.f22826t = bundle;
        this.f22827u = i7;
        this.f22828v = j8;
        this.f22829w = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        long j7 = this.f22823q;
        int a8 = q3.c.a(parcel);
        q3.c.o(parcel, 1, j7);
        q3.c.g(parcel, 2, this.f22824r, false);
        q3.c.r(parcel, 3, this.f22825s, false);
        q3.c.f(parcel, 4, this.f22826t, false);
        q3.c.l(parcel, 5, this.f22827u);
        q3.c.o(parcel, 6, this.f22828v);
        q3.c.r(parcel, 7, this.f22829w, false);
        q3.c.b(parcel, a8);
    }
}
