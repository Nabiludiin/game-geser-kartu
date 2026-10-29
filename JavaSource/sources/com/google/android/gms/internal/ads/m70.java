package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class m70 extends xq implements IInterface {
    m70(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void D2(g70 g70Var, l70 l70Var) {
        Parcel a8 = a();
        zq.c(a8, g70Var);
        zq.e(a8, l70Var);
        C1(2, a8);
    }
}
