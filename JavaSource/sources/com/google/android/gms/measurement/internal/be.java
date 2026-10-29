package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: MyApplication */
public final class be implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        boolean z8 = false;
        int i7 = 0;
        boolean z9 = false;
        boolean z10 = false;
        int i8 = 0;
        int i9 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        String str = "";
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Boolean bool = null;
        ArrayList arrayList = null;
        String str11 = null;
        String str12 = null;
        int i10 = 100;
        boolean z11 = true;
        boolean z12 = true;
        long j14 = -2147483648L;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            switch (q3.b.m(s7)) {
                case 2:
                    str5 = q3.b.g(parcel, s7);
                    break;
                case 3:
                    str6 = q3.b.g(parcel, s7);
                    break;
                case 4:
                    str7 = q3.b.g(parcel, s7);
                    break;
                case 5:
                    str8 = q3.b.g(parcel, s7);
                    break;
                case 6:
                    j7 = q3.b.v(parcel, s7);
                    break;
                case 7:
                    j8 = q3.b.v(parcel, s7);
                    break;
                case 8:
                    str9 = q3.b.g(parcel, s7);
                    break;
                case 9:
                    z11 = q3.b.n(parcel, s7);
                    break;
                case 10:
                    z8 = q3.b.n(parcel, s7);
                    break;
                case 11:
                    j14 = q3.b.v(parcel, s7);
                    break;
                case 12:
                    str10 = q3.b.g(parcel, s7);
                    break;
                case 13:
                case 17:
                case 19:
                case 20:
                case 24:
                case 33:
                default:
                    q3.b.y(parcel, s7);
                    break;
                case 14:
                    j9 = q3.b.v(parcel, s7);
                    break;
                case 15:
                    i7 = q3.b.u(parcel, s7);
                    break;
                case 16:
                    z12 = q3.b.n(parcel, s7);
                    break;
                case 18:
                    z9 = q3.b.n(parcel, s7);
                    break;
                case 21:
                    bool = q3.b.o(parcel, s7);
                    break;
                case 22:
                    j10 = q3.b.v(parcel, s7);
                    break;
                case 23:
                    arrayList = q3.b.i(parcel, s7);
                    break;
                case 25:
                    str = q3.b.g(parcel, s7);
                    break;
                case 26:
                    str2 = q3.b.g(parcel, s7);
                    break;
                case 27:
                    str11 = q3.b.g(parcel, s7);
                    break;
                case 28:
                    z10 = q3.b.n(parcel, s7);
                    break;
                case 29:
                    j11 = q3.b.v(parcel, s7);
                    break;
                case 30:
                    i10 = q3.b.u(parcel, s7);
                    break;
                case 31:
                    str3 = q3.b.g(parcel, s7);
                    break;
                case 32:
                    i8 = q3.b.u(parcel, s7);
                    break;
                case 34:
                    j12 = q3.b.v(parcel, s7);
                    break;
                case 35:
                    str12 = q3.b.g(parcel, s7);
                    break;
                case androidx.constraintlayout.widget.h.f1530y1 /* 36 */:
                    str4 = q3.b.g(parcel, s7);
                    break;
                case 37:
                    j13 = q3.b.v(parcel, s7);
                    break;
                case androidx.constraintlayout.widget.h.f1478r5 /* 38 */:
                    i9 = q3.b.u(parcel, s7);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new ae(str5, str6, str7, str8, j7, j8, str9, z11, z8, j14, str10, j9, i7, z12, z9, bool, j10, arrayList, str, str2, str11, z10, j11, i10, str3, i8, j12, str12, str4, j13, i9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new ae[i7];
    }
}
