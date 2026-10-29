package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i7 = 0;
        int i8 = 0;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 1) {
                strArr = q3.b.h(parcel, s7);
            } else if (m7 == 2) {
                cursorWindowArr = (CursorWindow[]) q3.b.j(parcel, s7, CursorWindow.CREATOR);
            } else if (m7 == 3) {
                i8 = q3.b.u(parcel, s7);
            } else if (m7 == 4) {
                bundle = q3.b.b(parcel, s7);
            } else if (m7 != 1000) {
                q3.b.y(parcel, s7);
            } else {
                i7 = q3.b.u(parcel, s7);
            }
        }
        q3.b.l(parcel, z7);
        DataHolder dataHolder = new DataHolder(i7, strArr, cursorWindowArr, i8, bundle);
        dataHolder.T0();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new DataHolder[i7];
    }
}
