package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import w3.a;

/* compiled from: MyApplication */
public abstract class bf0 extends yq implements cf0 {
    public bf0() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static cf0 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof cf0 ? (cf0) queryLocalInterface : new af0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                Bundle bundle = (Bundle) zq.b(parcel, Bundle.CREATOR);
                zq.h(parcel);
                x7(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                j();
                parcel2.writeNoException();
                return true;
            case 3:
                i();
                parcel2.writeNoException();
                return true;
            case 4:
                l();
                parcel2.writeNoException();
                return true;
            case 5:
                k();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) zq.b(parcel, Bundle.CREATOR);
                zq.h(parcel);
                X(bundle2);
                parcel2.writeNoException();
                zq.d(parcel2, bundle2);
                return true;
            case 7:
                s();
                parcel2.writeNoException();
                return true;
            case 8:
                m();
                parcel2.writeNoException();
                return true;
            case 9:
                p();
                parcel2.writeNoException();
                return true;
            case 10:
                c();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean f8 = f();
                parcel2.writeNoException();
                int i9 = zq.f20279b;
                parcel2.writeInt(f8 ? 1 : 0);
                return true;
            case 12:
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                Intent intent = (Intent) zq.b(parcel, Intent.CREATOR);
                zq.h(parcel);
                V2(readInt, readInt2, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                w3.a O = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                j0(O);
                parcel2.writeNoException();
                return true;
            case 14:
                e();
                parcel2.writeNoException();
                return true;
            case 15:
                int readInt3 = parcel.readInt();
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                zq.h(parcel);
                K2(readInt3, createStringArray, createIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
