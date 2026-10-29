package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* compiled from: MyApplication */
public abstract class vg0 extends yq implements wg0 {
    public vg0() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zq.b(parcel, ParcelFileDescriptor.CREATOR);
            zq.h(parcel);
            K5(parcelFileDescriptor);
        } else if (i7 == 2) {
            v2.c0 c0Var = (v2.c0) zq.b(parcel, v2.c0.CREATOR);
            zq.h(parcel);
            R6(c0Var);
        } else {
            if (i7 != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) zq.b(parcel, ParcelFileDescriptor.CREATOR);
            eh0 eh0Var = (eh0) zq.b(parcel, eh0.CREATOR);
            zq.h(parcel);
            Q2(parcelFileDescriptor2, eh0Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
