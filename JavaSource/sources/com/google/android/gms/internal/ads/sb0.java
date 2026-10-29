package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: MyApplication */
public abstract class sb0 extends yq implements tb0 {
    public static tb0 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return queryLocalInterface instanceof tb0 ? (tb0) queryLocalInterface : new rb0(iBinder);
    }
}
