package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        String str = null;
        String str2 = null;
        ud udVar = null;
        String str3 = null;
        g0 g0Var = null;
        g0 g0Var2 = null;
        g0 g0Var3 = null;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        boolean z8 = false;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            switch (q3.b.m(s7)) {
                case 2:
                    str = q3.b.g(parcel, s7);
                    break;
                case 3:
                    str2 = q3.b.g(parcel, s7);
                    break;
                case 4:
                    udVar = (ud) q3.b.f(parcel, s7, ud.CREATOR);
                    break;
                case 5:
                    j7 = q3.b.v(parcel, s7);
                    break;
                case 6:
                    z8 = q3.b.n(parcel, s7);
                    break;
                case 7:
                    str3 = q3.b.g(parcel, s7);
                    break;
                case 8:
                    g0Var = (g0) q3.b.f(parcel, s7, g0.CREATOR);
                    break;
                case 9:
                    j8 = q3.b.v(parcel, s7);
                    break;
                case 10:
                    g0Var2 = (g0) q3.b.f(parcel, s7, g0.CREATOR);
                    break;
                case 11:
                    j9 = q3.b.v(parcel, s7);
                    break;
                case 12:
                    g0Var3 = (g0) q3.b.f(parcel, s7, g0.CREATOR);
                    break;
                default:
                    q3.b.y(parcel, s7);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new i(str, str2, udVar, j7, z8, str3, g0Var, j8, g0Var2, j9, g0Var3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new i[i7];
    }
}
