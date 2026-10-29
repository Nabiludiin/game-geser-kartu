package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class uh0 extends xq implements xh0 {
    uh0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final void P(int i7) {
        Parcel a8 = a();
        a8.writeInt(i7);
        r0(7, a8);
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final void Q5(qh0 qh0Var) {
        Parcel a8 = a();
        zq.e(a8, qh0Var);
        r0(5, a8);
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final void c() {
        r0(1, a());
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final void e() {
        r0(2, a());
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final void f() {
        r0(3, a());
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final void g() {
        r0(4, a());
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final void i() {
        r0(6, a());
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final void k() {
        r0(8, a());
    }
}
