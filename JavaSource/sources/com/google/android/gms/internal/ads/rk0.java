package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class rk0 extends xq implements tk0 {
    rk0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.tk0
    public final void L2(String str, String str2, Bundle bundle) {
        Parcel a8 = a();
        a8.writeString(str);
        a8.writeString(str2);
        zq.c(a8, bundle);
        r0(3, a8);
    }

    @Override // com.google.android.gms.internal.ads.tk0
    public final void v(String str) {
        Parcel a8 = a();
        a8.writeString(str);
        r0(2, a8);
    }
}
