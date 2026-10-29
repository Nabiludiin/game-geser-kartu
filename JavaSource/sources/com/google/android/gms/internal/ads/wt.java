package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class wt extends xq implements IInterface {
    wt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final rt D2(ut utVar) {
        Parcel a8 = a();
        zq.c(a8, utVar);
        Parcel O = O(1, a8);
        rt rtVar = (rt) zq.b(O, rt.CREATOR);
        O.recycle();
        return rtVar;
    }

    public final rt H2(ut utVar) {
        Parcel a8 = a();
        zq.c(a8, utVar);
        Parcel O = O(2, a8);
        rt rtVar = (rt) zq.b(O, rt.CREATOR);
        O.recycle();
        return rtVar;
    }

    public final long v3(ut utVar) {
        Parcel a8 = a();
        zq.c(a8, utVar);
        Parcel O = O(3, a8);
        long readLong = O.readLong();
        O.recycle();
        return readLong;
    }
}
