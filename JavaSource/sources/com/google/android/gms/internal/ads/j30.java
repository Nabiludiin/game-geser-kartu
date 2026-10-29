package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class j30 extends xq implements l30 {
    j30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.l30
    public final void A3(a30 a30Var) {
        Parcel a8 = a();
        zq.e(a8, a30Var);
        r0(1, a8);
    }
}
