package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: MyApplication */
public abstract class ru3 extends yq implements su3 {
    public static su3 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        return queryLocalInterface instanceof su3 ? (su3) queryLocalInterface : new qu3(iBinder);
    }
}
