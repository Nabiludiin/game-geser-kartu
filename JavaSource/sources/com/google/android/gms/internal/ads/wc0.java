package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class wc0 extends xq implements yc0 {
    wc0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.yc0
    public final void A(s2.x2 x2Var) {
        Parcel a8 = a();
        zq.c(a8, x2Var);
        r0(4, a8);
    }
}
