package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class xc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        byte[] bArr = null;
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        long j7 = 0;
        long j8 = 0;
        int i7 = 0;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            switch (q3.b.m(s7)) {
                case 1:
                    j7 = q3.b.v(parcel, s7);
                    break;
                case 2:
                    bArr = q3.b.c(parcel, s7);
                    break;
                case 3:
                    str = q3.b.g(parcel, s7);
                    break;
                case 4:
                    bundle = q3.b.b(parcel, s7);
                    break;
                case 5:
                    i7 = q3.b.u(parcel, s7);
                    break;
                case 6:
                    j8 = q3.b.v(parcel, s7);
                    break;
                case 7:
                    str2 = q3.b.g(parcel, s7);
                    break;
                default:
                    q3.b.y(parcel, s7);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new wc(j7, bArr, str, bundle, i7, j8, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new wc[i7];
    }
}
