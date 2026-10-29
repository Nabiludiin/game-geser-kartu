package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class a20 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        int i7 = 0;
        boolean z8 = false;
        int i8 = 0;
        boolean z9 = false;
        int i9 = 0;
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        s2.u4 u4Var = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            switch (q3.b.m(s7)) {
                case 1:
                    i7 = q3.b.u(parcel, s7);
                    break;
                case 2:
                    z8 = q3.b.n(parcel, s7);
                    break;
                case 3:
                    i8 = q3.b.u(parcel, s7);
                    break;
                case 4:
                    z9 = q3.b.n(parcel, s7);
                    break;
                case 5:
                    i9 = q3.b.u(parcel, s7);
                    break;
                case 6:
                    u4Var = (s2.u4) q3.b.f(parcel, s7, s2.u4.CREATOR);
                    break;
                case 7:
                    z10 = q3.b.n(parcel, s7);
                    break;
                case 8:
                    i10 = q3.b.u(parcel, s7);
                    break;
                case 9:
                    i11 = q3.b.u(parcel, s7);
                    break;
                case 10:
                    z11 = q3.b.n(parcel, s7);
                    break;
                case 11:
                    i12 = q3.b.u(parcel, s7);
                    break;
                default:
                    q3.b.y(parcel, s7);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new z10(i7, z8, i8, z9, i9, u4Var, z10, i10, i11, z11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new z10[i7];
    }
}
