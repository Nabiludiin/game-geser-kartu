package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class zs extends xq implements bt {
    zs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.bt
    public final s2.y2 f() {
        Parcel O = O(5, a());
        s2.y2 j8 = s2.w2.j8(O.readStrongBinder());
        O.recycle();
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.bt
    public final void n7(w3.a aVar, ht htVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.e(a8, htVar);
        r0(4, a8);
    }
}
