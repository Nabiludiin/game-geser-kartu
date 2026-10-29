package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import w3.a;

/* compiled from: MyApplication */
public abstract class h80 extends yq implements i80 {
    public h80() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        l80 j80Var;
        if (i7 == 3) {
            s2.b3 b8 = b();
            parcel2.writeNoException();
            zq.e(parcel2, b8);
            return true;
        }
        if (i7 == 4) {
            d();
            parcel2.writeNoException();
            return true;
        }
        if (i7 == 5) {
            w3.a O = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                j80Var = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                j80Var = queryLocalInterface instanceof l80 ? (l80) queryLocalInterface : new j80(readStrongBinder);
            }
            zq.h(parcel);
            l5(O, j80Var);
            parcel2.writeNoException();
            return true;
        }
        if (i7 == 6) {
            w3.a O2 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
            zq.h(parcel);
            Y(O2);
            parcel2.writeNoException();
            return true;
        }
        if (i7 != 7) {
            return false;
        }
        i20 e8 = e();
        parcel2.writeNoException();
        zq.e(parcel2, e8);
        return true;
    }
}
