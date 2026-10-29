package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class j80 extends xq implements l80 {
    j80(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.l80
    public final void B(int i7) {
        Parcel a8 = a();
        a8.writeInt(i7);
        r0(2, a8);
    }

    @Override // com.google.android.gms.internal.ads.l80
    public final void c() {
        r0(1, a());
    }
}
