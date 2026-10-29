package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class qu3 extends xq implements su3 {
    qu3(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.su3
    public final void J3(Bundle bundle, uu3 uu3Var) {
        Parcel a8 = a();
        zq.c(a8, bundle);
        zq.e(a8, uu3Var);
        C1(3, a8);
    }

    @Override // com.google.android.gms.internal.ads.su3
    public final void Y6(String str, Bundle bundle, uu3 uu3Var) {
        Parcel a8 = a();
        a8.writeString(str);
        zq.c(a8, bundle);
        zq.e(a8, uu3Var);
        C1(1, a8);
    }

    @Override // com.google.android.gms.internal.ads.su3
    public final void d3(Bundle bundle, uu3 uu3Var) {
        Parcel a8 = a();
        zq.c(a8, bundle);
        zq.e(a8, uu3Var);
        C1(2, a8);
    }
}
