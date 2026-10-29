package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class z60 extends xq implements b70 {
    z60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // com.google.android.gms.internal.ads.b70
    public final void v(String str) {
        Parcel a8 = a();
        a8.writeString(str);
        r0(1, a8);
    }
}
