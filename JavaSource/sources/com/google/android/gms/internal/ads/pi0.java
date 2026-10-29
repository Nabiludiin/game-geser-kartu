package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class pi0 extends xq implements ri0 {
    pi0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.ri0
    public final void A(s2.x2 x2Var) {
        Parcel a8 = a();
        zq.c(a8, x2Var);
        r0(3, a8);
    }

    @Override // com.google.android.gms.internal.ads.ri0
    public final void B(int i7) {
        Parcel a8 = a();
        a8.writeInt(i7);
        r0(2, a8);
    }

    @Override // com.google.android.gms.internal.ads.ri0
    public final void c() {
        r0(1, a());
    }
}
