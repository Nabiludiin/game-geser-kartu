package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: MyApplication */
public abstract class qf0 extends yq implements rf0 {
    public static rf0 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return queryLocalInterface instanceof rf0 ? (rf0) queryLocalInterface : new pf0(iBinder);
    }
}
