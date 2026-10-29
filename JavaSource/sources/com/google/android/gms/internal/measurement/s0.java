package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class s0 extends p0 implements u0 {
    s0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.u0
    public final Bundle F0(Bundle bundle) {
        Parcel O = O();
        r0.c(O, bundle);
        Parcel a8 = a(1, O);
        Bundle bundle2 = (Bundle) r0.b(a8, Bundle.CREATOR);
        a8.recycle();
        return bundle2;
    }
}
