package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class si0 extends xq implements IInterface {
    si0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void D2(hi0 hi0Var, String str, String str2) {
        Parcel a8 = a();
        zq.e(a8, hi0Var);
        a8.writeString(str);
        a8.writeString(str2);
        r0(2, a8);
    }
}
