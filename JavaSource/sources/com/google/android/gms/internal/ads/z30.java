package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class z30 extends xq implements a40 {
    z30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.a40
    public final void e() {
        r0(2, a());
    }

    @Override // com.google.android.gms.internal.ads.a40
    public final void y(String str) {
        Parcel a8 = a();
        a8.writeString(str);
        r0(1, a8);
    }
}
