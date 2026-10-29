package s2;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: MyApplication */
public final class d5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i7 = 0;
        int i8 = 0;
        boolean z8 = false;
        int i9 = 0;
        boolean z9 = false;
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        Bundle bundle = null;
        ArrayList arrayList = null;
        String str = null;
        q4 q4Var = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        String str4 = null;
        y0 y0Var = null;
        String str5 = null;
        ArrayList arrayList3 = null;
        String str6 = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            switch (q3.b.m(s7)) {
                case 1:
                    i7 = q3.b.u(parcel, s7);
                    break;
                case 2:
                    j7 = q3.b.v(parcel, s7);
                    break;
                case 3:
                    bundle = q3.b.b(parcel, s7);
                    break;
                case 4:
                    i8 = q3.b.u(parcel, s7);
                    break;
                case 5:
                    arrayList = q3.b.i(parcel, s7);
                    break;
                case 6:
                    z8 = q3.b.n(parcel, s7);
                    break;
                case 7:
                    i9 = q3.b.u(parcel, s7);
                    break;
                case 8:
                    z9 = q3.b.n(parcel, s7);
                    break;
                case 9:
                    str = q3.b.g(parcel, s7);
                    break;
                case 10:
                    q4Var = (q4) q3.b.f(parcel, s7, q4.CREATOR);
                    break;
                case 11:
                    location = (Location) q3.b.f(parcel, s7, Location.CREATOR);
                    break;
                case 12:
                    str2 = q3.b.g(parcel, s7);
                    break;
                case 13:
                    bundle2 = q3.b.b(parcel, s7);
                    break;
                case 14:
                    bundle3 = q3.b.b(parcel, s7);
                    break;
                case 15:
                    arrayList2 = q3.b.i(parcel, s7);
                    break;
                case 16:
                    str3 = q3.b.g(parcel, s7);
                    break;
                case 17:
                    str4 = q3.b.g(parcel, s7);
                    break;
                case 18:
                    z10 = q3.b.n(parcel, s7);
                    break;
                case 19:
                    y0Var = (y0) q3.b.f(parcel, s7, y0.CREATOR);
                    break;
                case 20:
                    i10 = q3.b.u(parcel, s7);
                    break;
                case 21:
                    str5 = q3.b.g(parcel, s7);
                    break;
                case 22:
                    arrayList3 = q3.b.i(parcel, s7);
                    break;
                case 23:
                    i11 = q3.b.u(parcel, s7);
                    break;
                case 24:
                    str6 = q3.b.g(parcel, s7);
                    break;
                case 25:
                    i12 = q3.b.u(parcel, s7);
                    break;
                case 26:
                    j8 = q3.b.v(parcel, s7);
                    break;
                case 27:
                    j9 = q3.b.v(parcel, s7);
                    break;
                default:
                    q3.b.y(parcel, s7);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new b5(i7, j7, bundle, i8, arrayList, z8, i9, z9, str, q4Var, location, str2, bundle2, bundle3, arrayList2, str3, str4, z10, y0Var, i10, str5, arrayList3, i11, str6, i12, j8, j9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new b5[i7];
    }
}
