package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class ae3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        String str = null;
        String str2 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 1) {
                i7 = q3.b.u(parcel, s7);
            } else if (m7 == 2) {
                i8 = q3.b.u(parcel, s7);
            } else if (m7 == 3) {
                str = q3.b.g(parcel, s7);
            } else if (m7 == 4) {
                str2 = q3.b.g(parcel, s7);
            } else if (m7 != 5) {
                q3.b.y(parcel, s7);
            } else {
                i9 = q3.b.u(parcel, s7);
            }
        }
        q3.b.l(parcel, z7);
        return new zd3(i7, i8, i9, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zd3[i7];
    }
}
