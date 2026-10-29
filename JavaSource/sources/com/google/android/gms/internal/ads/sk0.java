package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class sk0 extends yq implements tk0 {
    public sk0() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            parcel.readString();
            parcel.readString();
            zq.h(parcel);
        } else if (i7 == 2) {
            String readString = parcel.readString();
            zq.h(parcel);
            v(readString);
        } else {
            if (i7 != 3) {
                return false;
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Bundle bundle = (Bundle) zq.b(parcel, Bundle.CREATOR);
            zq.h(parcel);
            L2(readString2, readString3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}
