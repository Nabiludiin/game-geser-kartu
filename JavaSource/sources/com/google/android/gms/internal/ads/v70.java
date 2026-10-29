package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class v70 extends xq implements x70 {
    v70(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.x70
    public final void c() {
        r0(2, a());
    }

    @Override // com.google.android.gms.internal.ads.x70
    public final void u(String str) {
        Parcel a8 = a();
        a8.writeString(str);
        r0(3, a8);
    }
}
