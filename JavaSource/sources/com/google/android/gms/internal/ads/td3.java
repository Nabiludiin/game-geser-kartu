package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class td3 extends xq implements IInterface {
    td3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final rd3 D2(pd3 pd3Var) {
        Parcel a8 = a();
        zq.c(a8, pd3Var);
        Parcel O = O(1, a8);
        rd3 rd3Var = (rd3) zq.b(O, rd3.CREATOR);
        O.recycle();
        return rd3Var;
    }

    public final void H2(md3 md3Var) {
        Parcel a8 = a();
        zq.c(a8, md3Var);
        r0(2, a8);
    }

    public final be3 v3(zd3 zd3Var) {
        Parcel a8 = a();
        zq.c(a8, zd3Var);
        Parcel O = O(3, a8);
        be3 be3Var = (be3) zq.b(O, be3.CREATOR);
        O.recycle();
        return be3Var;
    }
}
