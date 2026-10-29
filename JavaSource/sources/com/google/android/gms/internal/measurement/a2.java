package com.google.android.gms.internal.measurement;

import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class a2 extends q0 implements b2 {
    public a2() {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.q0
    protected final boolean a(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 2) {
            return false;
        }
        c();
        return true;
    }
}
