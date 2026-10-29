package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class w70 extends yq implements x70 {
    public w70() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static x70 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return queryLocalInterface instanceof x70 ? (x70) queryLocalInterface : new v70(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 2) {
            c();
        } else {
            if (i7 != 3) {
                return false;
            }
            String readString = parcel.readString();
            zq.h(parcel);
            u(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
