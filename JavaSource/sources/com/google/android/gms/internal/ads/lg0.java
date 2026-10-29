package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: MyApplication */
public final class lg0 implements Parcelable.Creator {
    public static final kg0 a(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        Bundle bundle = null;
        s2.b5 b5Var = null;
        s2.g5 g5Var = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        w2.a aVar = null;
        Bundle bundle2 = null;
        ArrayList arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList2 = null;
        String str7 = null;
        z10 z10Var = null;
        ArrayList arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        s2.f3 f3Var = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList arrayList4 = null;
        String str15 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        String str16 = null;
        f80 f80Var = null;
        String str17 = null;
        Bundle bundle6 = null;
        int i7 = 0;
        int i8 = 0;
        boolean z8 = false;
        int i9 = 0;
        int i10 = 0;
        boolean z9 = false;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i13 = 0;
        boolean z12 = false;
        boolean z13 = false;
        int i14 = 0;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        float f8 = 0.0f;
        float f9 = 0.0f;
        long j7 = 0;
        long j8 = 0;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            switch (q3.b.m(s7)) {
                case 1:
                    i7 = q3.b.u(parcel, s7);
                    break;
                case 2:
                    bundle = q3.b.b(parcel, s7);
                    break;
                case 3:
                    b5Var = (s2.b5) q3.b.f(parcel, s7, s2.b5.CREATOR);
                    break;
                case 4:
                    g5Var = (s2.g5) q3.b.f(parcel, s7, s2.g5.CREATOR);
                    break;
                case 5:
                    str = q3.b.g(parcel, s7);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) q3.b.f(parcel, s7, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) q3.b.f(parcel, s7, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = q3.b.g(parcel, s7);
                    break;
                case 9:
                    str3 = q3.b.g(parcel, s7);
                    break;
                case 10:
                    str4 = q3.b.g(parcel, s7);
                    break;
                case 11:
                    aVar = (w2.a) q3.b.f(parcel, s7, w2.a.CREATOR);
                    break;
                case 12:
                    bundle2 = q3.b.b(parcel, s7);
                    break;
                case 13:
                    i8 = q3.b.u(parcel, s7);
                    break;
                case 14:
                    arrayList = q3.b.i(parcel, s7);
                    break;
                case 15:
                    bundle3 = q3.b.b(parcel, s7);
                    break;
                case 16:
                    z8 = q3.b.n(parcel, s7);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                case androidx.constraintlayout.widget.h.f1478r5 /* 38 */:
                case 62:
                default:
                    q3.b.y(parcel, s7);
                    break;
                case 18:
                    i9 = q3.b.u(parcel, s7);
                    break;
                case 19:
                    i10 = q3.b.u(parcel, s7);
                    break;
                case 20:
                    f8 = q3.b.q(parcel, s7);
                    break;
                case 21:
                    str5 = q3.b.g(parcel, s7);
                    break;
                case 25:
                    j7 = q3.b.v(parcel, s7);
                    break;
                case 26:
                    str6 = q3.b.g(parcel, s7);
                    break;
                case 27:
                    arrayList2 = q3.b.i(parcel, s7);
                    break;
                case 28:
                    str7 = q3.b.g(parcel, s7);
                    break;
                case 29:
                    z10Var = (z10) q3.b.f(parcel, s7, z10.CREATOR);
                    break;
                case 30:
                    arrayList3 = q3.b.i(parcel, s7);
                    break;
                case 31:
                    j8 = q3.b.v(parcel, s7);
                    break;
                case 33:
                    str8 = q3.b.g(parcel, s7);
                    break;
                case 34:
                    f9 = q3.b.q(parcel, s7);
                    break;
                case 35:
                    i11 = q3.b.u(parcel, s7);
                    break;
                case androidx.constraintlayout.widget.h.f1530y1 /* 36 */:
                    i12 = q3.b.u(parcel, s7);
                    break;
                case 37:
                    z10 = q3.b.n(parcel, s7);
                    break;
                case androidx.constraintlayout.widget.h.f1486s5 /* 39 */:
                    str9 = q3.b.g(parcel, s7);
                    break;
                case androidx.constraintlayout.widget.h.f1494t5 /* 40 */:
                    z9 = q3.b.n(parcel, s7);
                    break;
                case androidx.constraintlayout.widget.h.f1502u5 /* 41 */:
                    str10 = q3.b.g(parcel, s7);
                    break;
                case androidx.constraintlayout.widget.h.f1510v5 /* 42 */:
                    z11 = q3.b.n(parcel, s7);
                    break;
                case androidx.constraintlayout.widget.h.f1518w5 /* 43 */:
                    i13 = q3.b.u(parcel, s7);
                    break;
                case androidx.constraintlayout.widget.h.f1526x5 /* 44 */:
                    bundle4 = q3.b.b(parcel, s7);
                    break;
                case androidx.constraintlayout.widget.h.f1534y5 /* 45 */:
                    str11 = q3.b.g(parcel, s7);
                    break;
                case androidx.constraintlayout.widget.h.f1542z5 /* 46 */:
                    f3Var = (s2.f3) q3.b.f(parcel, s7, s2.f3.CREATOR);
                    break;
                case androidx.constraintlayout.widget.h.A5 /* 47 */:
                    z12 = q3.b.n(parcel, s7);
                    break;
                case androidx.constraintlayout.widget.h.B5 /* 48 */:
                    bundle5 = q3.b.b(parcel, s7);
                    break;
                case androidx.constraintlayout.widget.h.C5 /* 49 */:
                    str12 = q3.b.g(parcel, s7);
                    break;
                case androidx.constraintlayout.widget.h.D5 /* 50 */:
                    str13 = q3.b.g(parcel, s7);
                    break;
                case androidx.constraintlayout.widget.h.E5 /* 51 */:
                    str14 = q3.b.g(parcel, s7);
                    break;
                case androidx.constraintlayout.widget.h.F5 /* 52 */:
                    z13 = q3.b.n(parcel, s7);
                    break;
                case androidx.constraintlayout.widget.h.G5 /* 53 */:
                    arrayList4 = q3.b.e(parcel, s7);
                    break;
                case 54:
                    str15 = q3.b.g(parcel, s7);
                    break;
                case 55:
                    arrayList5 = q3.b.i(parcel, s7);
                    break;
                case 56:
                    i14 = q3.b.u(parcel, s7);
                    break;
                case 57:
                    z14 = q3.b.n(parcel, s7);
                    break;
                case 58:
                    z15 = q3.b.n(parcel, s7);
                    break;
                case 59:
                    z16 = q3.b.n(parcel, s7);
                    break;
                case 60:
                    arrayList6 = q3.b.i(parcel, s7);
                    break;
                case 61:
                    str16 = q3.b.g(parcel, s7);
                    break;
                case 63:
                    f80Var = (f80) q3.b.f(parcel, s7, f80.CREATOR);
                    break;
                case 64:
                    str17 = q3.b.g(parcel, s7);
                    break;
                case 65:
                    bundle6 = q3.b.b(parcel, s7);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new kg0(i7, bundle, b5Var, g5Var, str, applicationInfo, packageInfo, str2, str3, str4, aVar, bundle2, i8, arrayList, bundle3, z8, i9, i10, f8, str5, j7, str6, arrayList2, str7, z10Var, arrayList3, j8, str8, f9, z9, i11, i12, z10, str9, str10, z11, i13, bundle4, str11, f3Var, z12, bundle5, str12, str13, str14, z13, arrayList4, str15, arrayList5, i14, z14, z15, z16, arrayList6, str16, f80Var, str17, bundle6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new kg0[i7];
    }
}
