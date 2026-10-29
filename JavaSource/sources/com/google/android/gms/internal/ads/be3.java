package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: MyApplication */
public final class be3 extends q3.a {
    public static final Parcelable.Creator<be3> CREATOR = new ce3();

    /* renamed from: q, reason: collision with root package name */
    public final int f5734q;

    /* renamed from: r, reason: collision with root package name */
    public final byte[] f5735r;

    /* renamed from: s, reason: collision with root package name */
    public final int f5736s;

    be3(int i7, byte[] bArr, int i8) {
        this.f5734q = i7;
        this.f5735r = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f5736s = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f5734q;
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, i8);
        q3.c.g(parcel, 2, this.f5735r, false);
        q3.c.l(parcel, 3, this.f5736s);
        q3.c.b(parcel, a8);
    }

    public be3(byte[] bArr, int i7) {
        this(1, null, 1);
    }
}
