package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class ii0 extends xq implements ki0 {
    ii0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final void B1(ni0 ni0Var) {
        Parcel a8 = a();
        zq.e(a8, ni0Var);
        r0(2, a8);
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final void C0(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        r0(5, a8);
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final void I7(s2.b5 b5Var, ri0 ri0Var) {
        Parcel a8 = a();
        zq.c(a8, b5Var);
        zq.e(a8, ri0Var);
        r0(1, a8);
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final void L7(s2.b5 b5Var, ri0 ri0Var) {
        Parcel a8 = a();
        zq.c(a8, b5Var);
        zq.e(a8, ri0Var);
        r0(14, a8);
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final s2.y2 n() {
        Parcel O = O(12, a());
        s2.y2 j8 = s2.w2.j8(O.readStrongBinder());
        O.recycle();
        return j8;
    }
}
