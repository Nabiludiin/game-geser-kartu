package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class n30 extends yq implements o30 {
    public n30() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static o30 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return queryLocalInterface instanceof o30 ? (o30) queryLocalInterface : new m30(iBinder);
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
        String readString = parcel.readString();
        zq.h(parcel);
        t1(c30Var, readString);
        parcel2.writeNoException();
        return true;
    }
}
