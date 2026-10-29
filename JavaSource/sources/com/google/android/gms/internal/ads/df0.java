package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class df0 extends xq implements ff0 {
    df0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    @Override // com.google.android.gms.internal.ads.ff0
    public final IBinder Y(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        Parcel O = O(1, a8);
        IBinder readStrongBinder = O.readStrongBinder();
        O.recycle();
        return readStrongBinder;
    }
}
