package com.google.android.gms.internal.ads;

import android.os.Parcel;
import w3.a;

/* compiled from: MyApplication */
public abstract class mz extends yq implements nz {
    public mz() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            String b8 = b();
            parcel2.writeNoException();
            parcel2.writeString(b8);
        } else if (i7 == 2) {
            String d8 = d();
            parcel2.writeNoException();
            parcel2.writeString(d8);
        } else if (i7 == 3) {
            w3.a O = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
            zq.h(parcel);
            d0(O);
            parcel2.writeNoException();
        } else if (i7 == 4) {
            c();
            parcel2.writeNoException();
        } else {
            if (i7 != 5) {
                return false;
            }
            e();
            parcel2.writeNoException();
        }
        return true;
    }
}
