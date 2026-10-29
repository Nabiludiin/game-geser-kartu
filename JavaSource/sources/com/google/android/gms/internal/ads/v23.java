package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class v23 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        String str = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            switch (q3.b.m(s7)) {
                case 1:
                    i7 = q3.b.u(parcel, s7);
                    break;
                case 2:
                    i8 = q3.b.u(parcel, s7);
                    break;
                case 3:
                    i9 = q3.b.u(parcel, s7);
                    break;
                case 4:
                    i10 = q3.b.u(parcel, s7);
                    break;
                case 5:
                    str = q3.b.g(parcel, s7);
                    break;
                case 6:
                    i11 = q3.b.u(parcel, s7);
                    break;
                case 7:
                    i12 = q3.b.u(parcel, s7);
                    break;
                default:
                    q3.b.y(parcel, s7);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new u23(i7, i8, i9, i10, str, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new u23[i7];
    }
}
