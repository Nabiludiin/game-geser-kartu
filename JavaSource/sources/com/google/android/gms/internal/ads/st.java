package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class st implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        long j7 = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) q3.b.f(parcel, s7, ParcelFileDescriptor.CREATOR);
            } else if (m7 == 3) {
                z8 = q3.b.n(parcel, s7);
            } else if (m7 == 4) {
                z9 = q3.b.n(parcel, s7);
            } else if (m7 == 5) {
                j7 = q3.b.v(parcel, s7);
            } else if (m7 != 6) {
                q3.b.y(parcel, s7);
            } else {
                z10 = q3.b.n(parcel, s7);
            }
        }
        q3.b.l(parcel, z7);
        return new rt(parcelFileDescriptor, z8, z9, j7, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new rt[i7];
    }
}
