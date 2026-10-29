package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class j70 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        long j7 = 0;
        boolean z8 = false;
        int i7 = 0;
        boolean z9 = false;
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            switch (q3.b.m(s7)) {
                case 1:
                    z8 = q3.b.n(parcel, s7);
                    break;
                case 2:
                    str = q3.b.g(parcel, s7);
                    break;
                case 3:
                    i7 = q3.b.u(parcel, s7);
                    break;
                case 4:
                    bArr = q3.b.c(parcel, s7);
                    break;
                case 5:
                    strArr = q3.b.h(parcel, s7);
                    break;
                case 6:
                    strArr2 = q3.b.h(parcel, s7);
                    break;
                case 7:
                    z9 = q3.b.n(parcel, s7);
                    break;
                case 8:
                    j7 = q3.b.v(parcel, s7);
                    break;
                default:
                    q3.b.y(parcel, s7);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new i70(z8, str, i7, bArr, strArr, strArr2, z9, j7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new i70[i7];
    }
}
