package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class ft extends xq implements ht {
    ft(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.ht
    public final void T0(s2.x2 x2Var) {
        Parcel a8 = a();
        zq.c(a8, x2Var);
        r0(3, a8);
    }

    @Override // com.google.android.gms.internal.ads.ht
    public final void d() {
        r0(1, a());
    }

    @Override // com.google.android.gms.internal.ads.ht
    public final void e() {
        r0(4, a());
    }

    @Override // com.google.android.gms.internal.ads.ht
    public final void f() {
        r0(5, a());
    }

    @Override // com.google.android.gms.internal.ads.ht
    public final void h() {
        r0(2, a());
    }
}
