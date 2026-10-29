package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class d80 extends q3.a {
    public static final Parcelable.Creator<d80> CREATOR = new e80();

    /* renamed from: q, reason: collision with root package name */
    public final String f6967q;

    /* renamed from: r, reason: collision with root package name */
    public final Bundle f6968r;

    public d80(String str, Bundle bundle) {
        this.f6967q = str;
        this.f6968r = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f6967q;
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 1, str, false);
        q3.c.f(parcel, 2, this.f6968r, false);
        q3.c.b(parcel, a8);
    }
}
