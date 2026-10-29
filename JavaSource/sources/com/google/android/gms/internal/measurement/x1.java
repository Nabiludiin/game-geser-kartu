package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class x1 extends q0 implements y1 {
    public x1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.q0
    protected final boolean a(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) r0.b(parcel, Bundle.CREATOR);
        r0.f(parcel);
        P0(bundle);
        parcel2.writeNoException();
        return true;
    }
}
