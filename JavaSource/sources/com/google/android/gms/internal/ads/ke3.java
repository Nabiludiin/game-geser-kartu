package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class ke3 extends xq implements me3 {
    ke3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.me3
    public final void A7(int[] iArr) {
        Parcel a8 = a();
        a8.writeIntArray(null);
        r0(4, a8);
    }

    @Override // com.google.android.gms.internal.ads.me3
    public final void E4(byte[] bArr) {
        Parcel a8 = a();
        a8.writeByteArray(bArr);
        r0(5, a8);
    }

    @Override // com.google.android.gms.internal.ads.me3
    public final void F(int i7) {
        Parcel a8 = a();
        a8.writeInt(i7);
        r0(6, a8);
    }

    @Override // com.google.android.gms.internal.ads.me3
    public final void I(int i7) {
        Parcel a8 = a();
        a8.writeInt(i7);
        r0(7, a8);
    }

    @Override // com.google.android.gms.internal.ads.me3
    public final void c() {
        r0(3, a());
    }

    @Override // com.google.android.gms.internal.ads.me3
    public final void f7(w3.a aVar, String str, String str2) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        a8.writeString(str);
        a8.writeString(null);
        r0(8, a8);
    }
}
