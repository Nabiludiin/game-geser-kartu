package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class vt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        boolean z8 = false;
        int i7 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        String str5 = null;
        long j7 = 0;
        long j8 = 0;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            switch (q3.b.m(s7)) {
                case 2:
                    str = q3.b.g(parcel, s7);
                    break;
                case 3:
                    j7 = q3.b.v(parcel, s7);
                    break;
                case 4:
                    str2 = q3.b.g(parcel, s7);
                    break;
                case 5:
                    str3 = q3.b.g(parcel, s7);
                    break;
                case 6:
                    str4 = q3.b.g(parcel, s7);
                    break;
                case 7:
                    bundle = q3.b.b(parcel, s7);
                    break;
                case 8:
                    z8 = q3.b.n(parcel, s7);
                    break;
                case 9:
                    j8 = q3.b.v(parcel, s7);
                    break;
                case 10:
                    str5 = q3.b.g(parcel, s7);
                    break;
                case 11:
                    i7 = q3.b.u(parcel, s7);
                    break;
                default:
                    q3.b.y(parcel, s7);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new ut(str, j7, str2, str3, str4, bundle, z8, j8, str5, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new ut[i7];
    }
}
