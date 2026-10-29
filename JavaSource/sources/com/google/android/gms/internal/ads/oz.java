package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class oz extends xq implements qz {
    oz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final void N5(nz nzVar) {
        Parcel a8 = a();
        zq.e(a8, nzVar);
        r0(1, a8);
    }
}
