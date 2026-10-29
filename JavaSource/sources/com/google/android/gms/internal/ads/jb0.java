package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class jb0 extends yq implements kb0 {
    public jb0() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static kb0 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof kb0 ? (kb0) queryLocalInterface : new ib0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            String readString = parcel.readString();
            zq.h(parcel);
            nb0 v7 = v(readString);
            parcel2.writeNoException();
            zq.e(parcel2, v7);
        } else if (i7 == 2) {
            String readString2 = parcel.readString();
            zq.h(parcel);
            boolean W = W(readString2);
            parcel2.writeNoException();
            parcel2.writeInt(W ? 1 : 0);
        } else if (i7 == 3) {
            String readString3 = parcel.readString();
            zq.h(parcel);
            id0 y7 = y(readString3);
            parcel2.writeNoException();
            zq.e(parcel2, y7);
        } else {
            if (i7 != 4) {
                return false;
            }
            String readString4 = parcel.readString();
            zq.h(parcel);
            boolean l02 = l0(readString4);
            parcel2.writeNoException();
            parcel2.writeInt(l02 ? 1 : 0);
        }
        return true;
    }
}
