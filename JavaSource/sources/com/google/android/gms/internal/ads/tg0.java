package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* compiled from: MyApplication */
public final class tg0 extends xq implements wg0 {
    tg0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.wg0
    public final void K5(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel a8 = a();
        zq.c(a8, parcelFileDescriptor);
        r0(1, a8);
    }

    @Override // com.google.android.gms.internal.ads.wg0
    public final void Q2(ParcelFileDescriptor parcelFileDescriptor, eh0 eh0Var) {
        Parcel a8 = a();
        zq.c(a8, parcelFileDescriptor);
        zq.c(a8, eh0Var);
        r0(3, a8);
    }

    @Override // com.google.android.gms.internal.ads.wg0
    public final void R6(v2.c0 c0Var) {
        Parcel a8 = a();
        zq.c(a8, c0Var);
        r0(2, a8);
    }
}
