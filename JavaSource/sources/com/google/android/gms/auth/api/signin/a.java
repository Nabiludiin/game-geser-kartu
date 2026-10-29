package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import q3.b;

/* compiled from: MyApplication */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = b.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j7 = 0;
        int i7 = 0;
        while (parcel.dataPosition() < z7) {
            int s7 = b.s(parcel);
            switch (b.m(s7)) {
                case 1:
                    i7 = b.u(parcel, s7);
                    break;
                case 2:
                    str = b.g(parcel, s7);
                    break;
                case 3:
                    str2 = b.g(parcel, s7);
                    break;
                case 4:
                    str3 = b.g(parcel, s7);
                    break;
                case 5:
                    str4 = b.g(parcel, s7);
                    break;
                case 6:
                    uri = (Uri) b.f(parcel, s7, Uri.CREATOR);
                    break;
                case 7:
                    str5 = b.g(parcel, s7);
                    break;
                case 8:
                    j7 = b.v(parcel, s7);
                    break;
                case 9:
                    str6 = b.g(parcel, s7);
                    break;
                case 10:
                    arrayList = b.k(parcel, s7, Scope.CREATOR);
                    break;
                case 11:
                    str7 = b.g(parcel, s7);
                    break;
                case 12:
                    str8 = b.g(parcel, s7);
                    break;
                default:
                    b.y(parcel, s7);
                    break;
            }
        }
        b.l(parcel, z7);
        return new GoogleSignInAccount(i7, str, str2, str3, str4, uri, str5, j7, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new GoogleSignInAccount[i7];
    }
}
