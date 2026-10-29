package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import w3.a;

/* compiled from: MyApplication */
public final class g20 extends xq implements i20 {
    g20(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.i20
    public final w3.a f() {
        Parcel O = O(4, a());
        w3.a O2 = a.AbstractBinderC0140a.O(O.readStrongBinder());
        O.recycle();
        return O2;
    }
}
