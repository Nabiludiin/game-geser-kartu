package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class uk0 extends xq implements wk0 {
    uk0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.wk0
    public final void X2(w3.a aVar, al0 al0Var, tk0 tk0Var) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.c(a8, al0Var);
        zq.e(a8, tk0Var);
        r0(1, a8);
    }
}
