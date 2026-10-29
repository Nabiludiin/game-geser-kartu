package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* compiled from: MyApplication */
public abstract class z70 extends yq implements a80 {
    public z70() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static a80 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return queryLocalInterface instanceof a80 ? (a80) queryLocalInterface : new y70(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(t70.CREATOR);
        zq.h(parcel);
        m6(createTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
