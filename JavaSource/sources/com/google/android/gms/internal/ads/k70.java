package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* compiled from: MyApplication */
public abstract class k70 extends yq implements l70 {
    public k70() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zq.b(parcel, ParcelFileDescriptor.CREATOR);
        zq.h(parcel);
        l1(parcelFileDescriptor);
        return true;
    }
}
