package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public abstract class b implements Parcelable.Creator {
    public GameEntity a(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        boolean z8 = false;
        boolean z9 = false;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
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
                    str3 = q3.b.g(parcel, s7);
                    break;
                case 4:
                    str4 = q3.b.g(parcel, s7);
                    break;
                case 5:
                    str5 = q3.b.g(parcel, s7);
                    break;
                case 6:
                    str6 = q3.b.g(parcel, s7);
                    break;
                case 7:
                    uri = (Uri) q3.b.f(parcel, s7, Uri.CREATOR);
                    break;
                case 8:
                    uri2 = (Uri) q3.b.f(parcel, s7, Uri.CREATOR);
                    break;
                case 9:
                    uri3 = (Uri) q3.b.f(parcel, s7, Uri.CREATOR);
                    break;
                case 10:
                    z8 = q3.b.n(parcel, s7);
                    break;
                case 11:
                    z9 = q3.b.n(parcel, s7);
                    break;
                case 12:
                    str7 = q3.b.g(parcel, s7);
                    break;
                case 13:
                    i7 = q3.b.u(parcel, s7);
                    break;
                case 14:
                    i8 = q3.b.u(parcel, s7);
                    break;
                case 15:
                    i9 = q3.b.u(parcel, s7);
                    break;
                case 16:
                    z10 = q3.b.n(parcel, s7);
                    break;
                case 17:
                    z11 = q3.b.n(parcel, s7);
                    break;
                case 18:
                    str8 = q3.b.g(parcel, s7);
                    break;
                case 19:
                    str9 = q3.b.g(parcel, s7);
                    break;
                case 20:
                    str10 = q3.b.g(parcel, s7);
                    break;
                case 21:
                    z12 = q3.b.n(parcel, s7);
                    break;
                case 22:
                    z13 = q3.b.n(parcel, s7);
                    break;
                case 23:
                    z14 = q3.b.n(parcel, s7);
                    break;
                case 24:
                    str11 = q3.b.g(parcel, s7);
                    break;
                case 25:
                    z15 = q3.b.n(parcel, s7);
                    break;
                default:
                    q3.b.y(parcel, s7);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new GameEntity(str, str2, str3, str4, str5, str6, uri, uri2, uri3, z8, z9, str7, i7, i8, i9, z10, z11, str8, str9, str10, z12, z13, z14, str11, z15);
    }

    @Override // android.os.Parcelable.Creator
    public /* synthetic */ Object[] newArray(int i7) {
        return new GameEntity[i7];
    }
}
