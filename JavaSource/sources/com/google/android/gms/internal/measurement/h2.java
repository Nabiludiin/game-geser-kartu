package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class h2 extends q3.a {
    public static final Parcelable.Creator<h2> CREATOR = new i2();

    /* renamed from: q, reason: collision with root package name */
    public final long f20993q;

    /* renamed from: r, reason: collision with root package name */
    public final long f20994r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f20995s;

    /* renamed from: t, reason: collision with root package name */
    public final Bundle f20996t;

    /* renamed from: u, reason: collision with root package name */
    public final String f20997u;

    public h2(long j7, long j8, boolean z7, Bundle bundle, String str) {
        this.f20993q = j7;
        this.f20994r = j8;
        this.f20995s = z7;
        this.f20996t = bundle;
        this.f20997u = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        long j7 = this.f20993q;
        int a8 = q3.c.a(parcel);
        q3.c.o(parcel, 1, j7);
        q3.c.o(parcel, 2, this.f20994r);
        q3.c.c(parcel, 3, this.f20995s);
        q3.c.f(parcel, 7, this.f20996t, false);
        q3.c.r(parcel, 8, this.f20997u, false);
        q3.c.b(parcel, a8);
    }
}
