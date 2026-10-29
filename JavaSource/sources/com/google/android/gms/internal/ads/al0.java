package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class al0 extends q3.a {
    public static final Parcelable.Creator<al0> CREATOR = new bl0();

    /* renamed from: q, reason: collision with root package name */
    public final String f5025q;

    /* renamed from: r, reason: collision with root package name */
    public final String f5026r;

    /* renamed from: s, reason: collision with root package name */
    public final s2.g5 f5027s;

    /* renamed from: t, reason: collision with root package name */
    public final s2.b5 f5028t;

    /* renamed from: u, reason: collision with root package name */
    public final int f5029u;

    /* renamed from: v, reason: collision with root package name */
    public final String f5030v;

    public al0(String str, String str2, s2.g5 g5Var, s2.b5 b5Var, int i7, String str3) {
        this.f5025q = str;
        this.f5026r = str2;
        this.f5027s = g5Var;
        this.f5028t = b5Var;
        this.f5029u = i7;
        this.f5030v = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f5025q;
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 1, str, false);
        q3.c.r(parcel, 2, this.f5026r, false);
        q3.c.q(parcel, 3, this.f5027s, i7, false);
        q3.c.q(parcel, 4, this.f5028t, i7, false);
        q3.c.l(parcel, 5, this.f5029u);
        q3.c.r(parcel, 6, this.f5030v, false);
        q3.c.b(parcel, a8);
    }
}
