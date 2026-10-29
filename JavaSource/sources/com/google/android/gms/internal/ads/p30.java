package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class p30 extends xq implements r30 {
    p30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void Z2(e30 e30Var) {
        Parcel a8 = a();
        zq.e(a8, e30Var);
        r0(1, a8);
    }
}
