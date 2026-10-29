package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: MyApplication */
public final class fh0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        boolean z8 = false;
        boolean z9 = false;
        int i7 = 0;
        Bundle bundle = null;
        w2.a aVar = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        u23 u23Var = null;
        String str4 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            switch (q3.b.m(s7)) {
                case 1:
                    bundle = q3.b.b(parcel, s7);
                    break;
                case 2:
                    aVar = (w2.a) q3.b.f(parcel, s7, w2.a.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) q3.b.f(parcel, s7, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = q3.b.g(parcel, s7);
                    break;
                case 5:
                    arrayList = q3.b.i(parcel, s7);
                    break;
                case 6:
                    packageInfo = (PackageInfo) q3.b.f(parcel, s7, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = q3.b.g(parcel, s7);
                    break;
                case 8:
                default:
                    q3.b.y(parcel, s7);
                    break;
                case 9:
                    str3 = q3.b.g(parcel, s7);
                    break;
                case 10:
                    u23Var = (u23) q3.b.f(parcel, s7, u23.CREATOR);
                    break;
                case 11:
                    str4 = q3.b.g(parcel, s7);
                    break;
                case 12:
                    z8 = q3.b.n(parcel, s7);
                    break;
                case 13:
                    z9 = q3.b.n(parcel, s7);
                    break;
                case 14:
                    bundle2 = q3.b.b(parcel, s7);
                    break;
                case 15:
                    bundle3 = q3.b.b(parcel, s7);
                    break;
                case 16:
                    i7 = q3.b.u(parcel, s7);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new eh0(bundle, aVar, applicationInfo, str, arrayList, packageInfo, str2, str3, u23Var, str4, z8, z9, bundle2, bundle3, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new eh0[i7];
    }
}
