package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            if (q3.b.m(s7) != 2) {
                q3.b.y(parcel, s7);
            } else {
                bundle = q3.b.b(parcel, s7);
            }
        }
        q3.b.l(parcel, z7);
        return new e0(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new e0[i7];
    }
}
