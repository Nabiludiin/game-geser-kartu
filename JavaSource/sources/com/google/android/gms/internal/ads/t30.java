package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class t30 extends xq implements v30 {
    t30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.v30
    public final void E6(s2.v0 v0Var, w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, v0Var);
        zq.e(a8, aVar);
        r0(1, a8);
    }
}
