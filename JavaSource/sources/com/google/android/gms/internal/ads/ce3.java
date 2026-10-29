package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class ce3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        int i7 = 0;
        byte[] bArr = null;
        int i8 = 0;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 1) {
                i7 = q3.b.u(parcel, s7);
            } else if (m7 == 2) {
                bArr = q3.b.c(parcel, s7);
            } else if (m7 != 3) {
                q3.b.y(parcel, s7);
            } else {
                i8 = q3.b.u(parcel, s7);
            }
        }
        q3.b.l(parcel, z7);
        return new be3(i7, bArr, i8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new be3[i7];
    }
}
