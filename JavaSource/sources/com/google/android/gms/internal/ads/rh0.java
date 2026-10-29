package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class rh0 extends xq implements IInterface {
    rh0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void D2(qh0 qh0Var, String str, String str2) {
        Parcel a8 = a();
        zq.e(a8, qh0Var);
        a8.writeString(str);
        a8.writeString(str2);
        r0(2, a8);
    }
}
