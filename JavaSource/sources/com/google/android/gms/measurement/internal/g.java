package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class g extends q3.a {
    public static final Parcelable.Creator<g> CREATOR = new h();

    /* renamed from: q, reason: collision with root package name */
    public final long f22157q;

    /* renamed from: r, reason: collision with root package name */
    public final int f22158r;

    /* renamed from: s, reason: collision with root package name */
    public final long f22159s;

    g(long j7, int i7, long j8) {
        this.f22157q = j7;
        this.f22158r = i7;
        this.f22159s = j8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        long j7 = this.f22157q;
        int a8 = q3.c.a(parcel);
        q3.c.o(parcel, 1, j7);
        q3.c.l(parcel, 2, this.f22158r);
        q3.c.o(parcel, 3, this.f22159s);
        q3.c.b(parcel, a8);
    }
}
