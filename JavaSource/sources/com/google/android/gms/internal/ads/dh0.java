package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class dh0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            if (q3.b.m(s7) != 2) {
                q3.b.y(parcel, s7);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) q3.b.f(parcel, s7, ParcelFileDescriptor.CREATOR);
            }
        }
        q3.b.l(parcel, z7);
        return new ch0(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new ch0[i7];
    }
}
