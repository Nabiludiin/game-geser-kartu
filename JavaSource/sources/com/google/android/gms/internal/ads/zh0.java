package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class zh0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        s2.b5 b5Var = null;
        String str = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 2) {
                b5Var = (s2.b5) q3.b.f(parcel, s7, s2.b5.CREATOR);
            } else if (m7 != 3) {
                q3.b.y(parcel, s7);
            } else {
                str = q3.b.g(parcel, s7);
            }
        }
        q3.b.l(parcel, z7);
        return new yh0(b5Var, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new yh0[i7];
    }
}
