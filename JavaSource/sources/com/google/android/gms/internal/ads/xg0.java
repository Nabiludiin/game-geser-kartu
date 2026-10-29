package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class xg0 extends xq implements IInterface {
    xg0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void D2(String str, og0 og0Var) {
        Parcel a8 = a();
        a8.writeString(str);
        zq.c(a8, og0Var);
        r0(1, a8);
    }

    public final void R6(v2.c0 c0Var) {
        Parcel a8 = a();
        zq.c(a8, c0Var);
        r0(2, a8);
    }
}
