package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import y3.i;
import y3.m;

/* compiled from: MyApplication */
public abstract class a implements Parcelable.Creator {
    public PlayerEntity a(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        Uri uri2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        d4.a aVar = null;
        i iVar = null;
        String str6 = null;
        String str7 = null;
        Uri uri3 = null;
        String str8 = null;
        Uri uri4 = null;
        String str9 = null;
        m mVar = null;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i7 = 0;
        boolean z8 = false;
        boolean z9 = false;
        int i8 = 0;
        boolean z10 = false;
        long j10 = -1;
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
                    uri = (Uri) q3.b.f(parcel, s7, Uri.CREATOR);
                    break;
                case 4:
                    uri2 = (Uri) q3.b.f(parcel, s7, Uri.CREATOR);
                    break;
                case 5:
                    j7 = q3.b.v(parcel, s7);
                    break;
                case 6:
                    i7 = q3.b.u(parcel, s7);
                    break;
                case 7:
                    j8 = q3.b.v(parcel, s7);
                    break;
                case 8:
                    str3 = q3.b.g(parcel, s7);
                    break;
                case 9:
                    str4 = q3.b.g(parcel, s7);
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 17:
                case 30:
                case 31:
                case 32:
                default:
                    q3.b.y(parcel, s7);
                    break;
                case 14:
                    str5 = q3.b.g(parcel, s7);
                    break;
                case 15:
                    aVar = (d4.a) q3.b.f(parcel, s7, d4.a.CREATOR);
                    break;
                case 16:
                    iVar = (i) q3.b.f(parcel, s7, i.CREATOR);
                    break;
                case 18:
                    z8 = q3.b.n(parcel, s7);
                    break;
                case 19:
                    z9 = q3.b.n(parcel, s7);
                    break;
                case 20:
                    str6 = q3.b.g(parcel, s7);
                    break;
                case 21:
                    str7 = q3.b.g(parcel, s7);
                    break;
                case 22:
                    uri3 = (Uri) q3.b.f(parcel, s7, Uri.CREATOR);
                    break;
                case 23:
                    str8 = q3.b.g(parcel, s7);
                    break;
                case 24:
                    uri4 = (Uri) q3.b.f(parcel, s7, Uri.CREATOR);
                    break;
                case 25:
                    str9 = q3.b.g(parcel, s7);
                    break;
                case 26:
                    i8 = q3.b.u(parcel, s7);
                    break;
                case 27:
                    j9 = q3.b.v(parcel, s7);
                    break;
                case 28:
                    z10 = q3.b.n(parcel, s7);
                    break;
                case 29:
                    j10 = q3.b.v(parcel, s7);
                    break;
                case 33:
                    mVar = (m) q3.b.f(parcel, s7, m.CREATOR);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new PlayerEntity(str, str2, uri, uri2, j7, i7, j8, str3, str4, str5, aVar, iVar, z8, z9, str6, str7, uri3, str8, uri4, str9, i8, j9, z10, j10, mVar);
    }

    @Override // android.os.Parcelable.Creator
    public /* synthetic */ Object[] newArray(int i7) {
        return new PlayerEntity[i7];
    }
}
