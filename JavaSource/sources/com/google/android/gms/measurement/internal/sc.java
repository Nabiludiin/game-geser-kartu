package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class sc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        int i7 = 0;
        long j7 = 0;
        String str = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 1) {
                str = q3.b.g(parcel, s7);
            } else if (m7 == 2) {
                j7 = q3.b.v(parcel, s7);
            } else if (m7 != 3) {
                q3.b.y(parcel, s7);
            } else {
                i7 = q3.b.u(parcel, s7);
            }
        }
        q3.b.l(parcel, z7);
        return new rc(str, j7, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new rc[i7];
    }
}
