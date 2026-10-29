package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class yq extends Binder implements IInterface {
    protected yq(String str) {
        attachInterface(this, str);
    }

    protected abstract boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8);

    @Override // android.os.Binder
    public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i7, parcel, parcel2, i8)) {
            return true;
        }
        return i8(i7, parcel, parcel2, i8);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
