package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class c70 extends yq implements e70 {
    public c70() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            String readString = parcel.readString();
            zq.h(parcel);
            y(readString);
        } else {
            if (i7 != 2) {
                return false;
            }
            e();
        }
        parcel2.writeNoException();
        return true;
    }
}
