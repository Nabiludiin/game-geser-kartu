package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: MyApplication */
public final class mg0 extends q3.a {
    public static final Parcelable.Creator<mg0> CREATOR = new ng0();

    /* renamed from: q, reason: collision with root package name */
    public final boolean f12247q;

    /* renamed from: r, reason: collision with root package name */
    public final List f12248r;

    public mg0(boolean z7, List list) {
        this.f12247q = z7;
        this.f12248r = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        boolean z7 = this.f12247q;
        int a8 = q3.c.a(parcel);
        q3.c.c(parcel, 2, z7);
        q3.c.t(parcel, 3, this.f12248r, false);
        q3.c.b(parcel, a8);
    }
}
