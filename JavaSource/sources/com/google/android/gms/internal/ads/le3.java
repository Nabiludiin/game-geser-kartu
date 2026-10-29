package com.google.android.gms.internal.ads;

import android.os.Parcel;
import w3.a;

/* compiled from: MyApplication */
public abstract class le3 extends yq implements me3 {
    public le3() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 2:
                a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                parcel.readString();
                zq.h(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zq.h(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zq.h(parcel);
                break;
            case 6:
                parcel.readInt();
                zq.h(parcel);
                break;
            case 7:
                parcel.readInt();
                zq.h(parcel);
                break;
            case 8:
                a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zq.h(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
