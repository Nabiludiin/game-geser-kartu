package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class q30 extends yq implements r30 {
    public q30() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public static r30 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        return queryLocalInterface instanceof r30 ? (r30) queryLocalInterface : new p30(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        e30 c30Var;
        if (i7 != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            c30Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            c30Var = queryLocalInterface instanceof e30 ? (e30) queryLocalInterface : new c30(readStrongBinder);
        }
        zq.h(parcel);
        Z2(c30Var);
        parcel2.writeNoException();
        return true;
    }
}
