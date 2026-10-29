package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import w3.a;

/* compiled from: MyApplication */
public final class rb0 extends xq implements tb0 {
    rb0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.tb0
    public final w3.a c() {
        Parcel O = O(1, a());
        w3.a O2 = a.AbstractBinderC0140a.O(O.readStrongBinder());
        O.recycle();
        return O2;
    }

    @Override // com.google.android.gms.internal.ads.tb0
    public final boolean e() {
        Parcel O = O(2, a());
        boolean a8 = zq.a(O);
        O.recycle();
        return a8;
    }
}
