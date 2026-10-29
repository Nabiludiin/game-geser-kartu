package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class bl0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        String str = null;
        String str2 = null;
        s2.g5 g5Var = null;
        s2.b5 b5Var = null;
        String str3 = null;
        int i7 = 0;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            switch (q3.b.m(s7)) {
                case 1:
                    str = q3.b.g(parcel, s7);
                    break;
                case 2:
                    str2 = q3.b.g(parcel, s7);
                    break;
                case 3:
                    g5Var = (s2.g5) q3.b.f(parcel, s7, s2.g5.CREATOR);
                    break;
                case 4:
                    b5Var = (s2.b5) q3.b.f(parcel, s7, s2.b5.CREATOR);
                    break;
                case 5:
                    i7 = q3.b.u(parcel, s7);
                    break;
                case 6:
                    str3 = q3.b.g(parcel, s7);
                    break;
                default:
                    q3.b.y(parcel, s7);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new al0(str, str2, g5Var, b5Var, i7, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new al0[i7];
    }
}
