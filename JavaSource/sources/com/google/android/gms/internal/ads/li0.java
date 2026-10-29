package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class li0 extends xq implements ni0 {
    li0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.ni0
    public final void F(int i7) {
        Parcel a8 = a();
        a8.writeInt(i7);
        r0(4, a8);
    }

    @Override // com.google.android.gms.internal.ads.ni0
    public final void V3(hi0 hi0Var) {
        Parcel a8 = a();
        zq.e(a8, hi0Var);
        r0(3, a8);
    }

    @Override // com.google.android.gms.internal.ads.ni0
    public final void c() {
        r0(1, a());
    }

    @Override // com.google.android.gms.internal.ads.ni0
    public final void e() {
        r0(2, a());
    }

    @Override // com.google.android.gms.internal.ads.ni0
    public final void i() {
        r0(6, a());
    }

    @Override // com.google.android.gms.internal.ads.ni0
    public final void l() {
        r0(7, a());
    }

    @Override // com.google.android.gms.internal.ads.ni0
    public final void q3(s2.x2 x2Var) {
        Parcel a8 = a();
        zq.c(a8, x2Var);
        r0(5, a8);
    }
}
