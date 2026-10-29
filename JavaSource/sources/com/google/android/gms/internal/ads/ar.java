package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class ar extends xq implements cr {
    ar(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void H5(byte[] bArr) {
        Parcel a8 = a();
        a8.writeByteArray(bArr);
        r0(5, a8);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void I(int i7) {
        Parcel a8 = a();
        a8.writeInt(0);
        r0(6, a8);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void O4(int[] iArr) {
        Parcel a8 = a();
        a8.writeIntArray(null);
        r0(4, a8);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void S0(int i7) {
        Parcel a8 = a();
        a8.writeInt(i7);
        r0(7, a8);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void S4(w3.a aVar, String str) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        a8.writeString("GMA_SDK");
        r0(2, a8);
    }

    @Override // com.google.android.gms.internal.ads.cr
    public final void e() {
        r0(3, a());
    }
}
