package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class h70 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 1) {
                str = q3.b.g(parcel, s7);
            } else if (m7 == 2) {
                strArr = q3.b.h(parcel, s7);
            } else if (m7 != 3) {
                q3.b.y(parcel, s7);
            } else {
                strArr2 = q3.b.h(parcel, s7);
            }
        }
        q3.b.l(parcel, z7);
        return new g70(str, strArr, strArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new g70[i7];
    }
}
