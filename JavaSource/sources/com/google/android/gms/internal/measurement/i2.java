package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class i2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        Bundle bundle = null;
        String str = null;
        boolean z8 = false;
        long j7 = 0;
        long j8 = 0;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 1) {
                j7 = q3.b.v(parcel, s7);
            } else if (m7 == 2) {
                j8 = q3.b.v(parcel, s7);
            } else if (m7 == 3) {
                z8 = q3.b.n(parcel, s7);
            } else if (m7 == 7) {
                bundle = q3.b.b(parcel, s7);
            } else if (m7 != 8) {
                q3.b.y(parcel, s7);
            } else {
                str = q3.b.g(parcel, s7);
            }
        }
        q3.b.l(parcel, z7);
        return new h2(j7, j8, z8, bundle, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new h2[i7];
    }
}
