package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import w3.a;

/* compiled from: MyApplication */
public abstract class h20 extends yq implements i20 {
    public h20() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        s30 s30Var;
        switch (i7) {
            case 2:
                float c8 = c();
                parcel2.writeNoException();
                parcel2.writeFloat(c8);
                return true;
            case 3:
                w3.a O = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                zzf(O);
                parcel2.writeNoException();
                return true;
            case 4:
                w3.a f8 = f();
                parcel2.writeNoException();
                zq.e(parcel2, f8);
                return true;
            case 5:
                float g8 = g();
                parcel2.writeNoException();
                parcel2.writeFloat(g8);
                return true;
            case 6:
                float j7 = j();
                parcel2.writeNoException();
                parcel2.writeFloat(j7);
                return true;
            case 7:
                s2.b3 i9 = i();
                parcel2.writeNoException();
                zq.e(parcel2, i9);
                return true;
            case 8:
                boolean l7 = l();
                parcel2.writeNoException();
                int i10 = zq.f20279b;
                parcel2.writeInt(l7 ? 1 : 0);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    s30Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    s30Var = queryLocalInterface instanceof s30 ? (s30) queryLocalInterface : new s30(readStrongBinder);
                }
                zq.h(parcel);
                T6(s30Var);
                parcel2.writeNoException();
                return true;
            case 10:
                boolean k7 = k();
                parcel2.writeNoException();
                int i11 = zq.f20279b;
                parcel2.writeInt(k7 ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
