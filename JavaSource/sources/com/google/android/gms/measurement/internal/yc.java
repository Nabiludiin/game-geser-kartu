package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: MyApplication */
public final class yc extends q3.a {
    public static final Parcelable.Creator<yc> CREATOR = new zc();

    /* renamed from: q, reason: collision with root package name */
    public final List f22904q;

    yc(List list) {
        this.f22904q = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        List list = this.f22904q;
        int a8 = q3.c.a(parcel);
        q3.c.v(parcel, 1, list, false);
        q3.c.b(parcel, a8);
    }
}
