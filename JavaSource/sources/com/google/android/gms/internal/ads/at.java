package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import w3.a;

/* compiled from: MyApplication */
public abstract class at extends yq implements bt {
    public at() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        ht ftVar;
        switch (i7) {
            case 2:
                s2.v0 c8 = c();
                parcel2.writeNoException();
                zq.e(parcel2, c8);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                }
                zq.h(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                w3.a O = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    ftVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    ftVar = queryLocalInterface instanceof ht ? (ht) queryLocalInterface : new ft(readStrongBinder2);
                }
                zq.h(parcel);
                n7(O, ftVar);
                parcel2.writeNoException();
                return true;
            case 5:
                s2.y2 f8 = f();
                parcel2.writeNoException();
                zq.e(parcel2, f8);
                return true;
            case 6:
                boolean a8 = zq.a(parcel);
                zq.h(parcel);
                o0(a8);
                parcel2.writeNoException();
                return true;
            case 7:
                s2.q2 j8 = s2.p2.j8(parcel.readStrongBinder());
                zq.h(parcel);
                A1(j8);
                parcel2.writeNoException();
                return true;
            case 8:
                String i9 = i();
                parcel2.writeNoException();
                parcel2.writeString(i9);
                return true;
            case 9:
                long l7 = l();
                parcel2.writeNoException();
                parcel2.writeLong(l7);
                return true;
            case 10:
                long readLong = parcel.readLong();
                zq.h(parcel);
                J0(readLong);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
