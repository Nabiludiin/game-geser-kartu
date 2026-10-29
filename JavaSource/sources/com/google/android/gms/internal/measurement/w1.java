package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class w1 extends p0 implements y1 {
    w1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.y1
    public final void P0(Bundle bundle) {
        Parcel O = O();
        r0.c(O, bundle);
        r0(1, O);
    }
}
