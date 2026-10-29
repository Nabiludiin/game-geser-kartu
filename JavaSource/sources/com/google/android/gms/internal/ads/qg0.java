package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class qg0 extends xq implements sg0 {
    qg0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.sg0
    public final void a2(eh0 eh0Var, wg0 wg0Var) {
        Parcel a8 = a();
        zq.c(a8, eh0Var);
        zq.e(a8, wg0Var);
        r0(4, a8);
    }

    @Override // com.google.android.gms.internal.ads.sg0
    public final void c0(String str) {
        Parcel a8 = a();
        a8.writeString(str);
        r0(9, a8);
    }

    @Override // com.google.android.gms.internal.ads.sg0
    public final void h4(String str, wg0 wg0Var) {
        Parcel a8 = a();
        a8.writeString(str);
        zq.e(a8, wg0Var);
        r0(7, a8);
    }

    @Override // com.google.android.gms.internal.ads.sg0
    public final void y3(eh0 eh0Var, wg0 wg0Var) {
        Parcel a8 = a();
        zq.c(a8, eh0Var);
        zq.e(a8, wg0Var);
        r0(6, a8);
    }

    @Override // com.google.android.gms.internal.ads.sg0
    public final void z4(eh0 eh0Var, wg0 wg0Var) {
        Parcel a8 = a();
        zq.c(a8, eh0Var);
        zq.e(a8, wg0Var);
        r0(5, a8);
    }
}
