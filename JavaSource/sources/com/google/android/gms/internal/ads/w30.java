package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class w30 extends xq implements y30 {
    w30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.y30
    public final void G5(e40 e40Var) {
        Parcel a8 = a();
        zq.e(a8, e40Var);
        r0(1, a8);
    }
}
