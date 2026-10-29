package com.google.android.gms.internal.ads;

import android.os.Parcel;
import w3.a;

/* compiled from: MyApplication */
public abstract class t20 extends yq implements u20 {
    public t20() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            w3.a O = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
            zq.h(parcel);
            C0(O);
        } else if (i7 == 2) {
            d();
        } else {
            if (i7 != 3) {
                return false;
            }
            w3.a O2 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
            zq.h(parcel);
            d0(O2);
        }
        parcel2.writeNoException();
        return true;
    }
}
