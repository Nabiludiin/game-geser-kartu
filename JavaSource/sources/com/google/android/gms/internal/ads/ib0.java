package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class ib0 extends xq implements kb0 {
    ib0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final boolean W(String str) {
        Parcel a8 = a();
        a8.writeString(str);
        Parcel O = O(2, a8);
        boolean a9 = zq.a(O);
        O.recycle();
        return a9;
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final boolean l0(String str) {
        Parcel a8 = a();
        a8.writeString(str);
        Parcel O = O(4, a8);
        boolean a9 = zq.a(O);
        O.recycle();
        return a9;
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final nb0 v(String str) {
        nb0 lb0Var;
        Parcel a8 = a();
        a8.writeString(str);
        Parcel O = O(1, a8);
        IBinder readStrongBinder = O.readStrongBinder();
        if (readStrongBinder == null) {
            lb0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            lb0Var = queryLocalInterface instanceof nb0 ? (nb0) queryLocalInterface : new lb0(readStrongBinder);
        }
        O.recycle();
        return lb0Var;
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final id0 y(String str) {
        Parcel a8 = a();
        a8.writeString(str);
        Parcel O = O(3, a8);
        id0 j8 = hd0.j8(O.readStrongBinder());
        O.recycle();
        return j8;
    }
}
