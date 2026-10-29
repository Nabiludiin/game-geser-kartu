package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import w3.a;

/* compiled from: MyApplication */
public final class n20 extends xq implements p20 {
    n20(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void I1(i20 i20Var) {
        Parcel a8 = a();
        zq.e(a8, i20Var);
        r0(8, a8);
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void N0(w3.a aVar, int i7) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        a8.writeInt(i7);
        r0(5, a8);
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final w3.a W(String str) {
        Parcel a8 = a();
        a8.writeString(str);
        Parcel O = O(2, a8);
        w3.a O2 = a.AbstractBinderC0140a.O(O.readStrongBinder());
        O.recycle();
        return O2;
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void d0(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        r0(3, a8);
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void g8(String str, w3.a aVar) {
        Parcel a8 = a();
        a8.writeString(str);
        zq.e(a8, aVar);
        r0(1, a8);
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void n6(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        r0(7, a8);
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void q0(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        r0(6, a8);
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final void t5(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        r0(9, a8);
    }
}
