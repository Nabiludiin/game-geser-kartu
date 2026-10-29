package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: MyApplication */
public final class tj0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
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
                    z8 = q3.b.n(parcel, s7);
                    break;
                case 5:
                    z9 = q3.b.n(parcel, s7);
                    break;
                case 6:
                    arrayList = q3.b.i(parcel, s7);
                    break;
                case 7:
                    z10 = q3.b.n(parcel, s7);
                    break;
                case 8:
                    z11 = q3.b.n(parcel, s7);
                    break;
                case 9:
                    arrayList2 = q3.b.i(parcel, s7);
                    break;
                default:
                    q3.b.y(parcel, s7);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new sj0(str, str2, z8, z9, arrayList, z10, z11, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new sj0[i7];
    }
}
