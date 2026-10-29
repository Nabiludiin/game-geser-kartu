package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class g30 extends xq implements i30 {
    g30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.i30
    public final void h5(y20 y20Var) {
        Parcel a8 = a();
        zq.e(a8, y20Var);
        r0(1, a8);
    }
}
