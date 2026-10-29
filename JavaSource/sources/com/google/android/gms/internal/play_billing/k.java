package com.google.android.gms.internal.play_billing;

import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class k extends f implements l {
    public k() {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.f
    protected final boolean a(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        g.b(parcel);
        L(readInt);
        return true;
    }
}
