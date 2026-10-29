package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class ct extends xq implements et {
    ct(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.et
    public final void B6(bt btVar) {
        Parcel a8 = a();
        zq.e(a8, btVar);
        r0(1, a8);
    }

    @Override // com.google.android.gms.internal.ads.et
    public final void R(int i7) {
        Parcel a8 = a();
        a8.writeInt(i7);
        r0(2, a8);
    }

    @Override // com.google.android.gms.internal.ads.et
    public final void u0(s2.x2 x2Var) {
        Parcel a8 = a();
        zq.c(a8, x2Var);
        r0(3, a8);
    }
}
