package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import w3.a;

/* compiled from: MyApplication */
public abstract class o20 extends yq implements p20 {
    public o20() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static p20 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof p20 ? (p20) queryLocalInterface : new n20(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        i20 g20Var;
        switch (i7) {
            case 1:
                String readString = parcel.readString();
                w3.a O = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                g8(readString, O);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString2 = parcel.readString();
                zq.h(parcel);
                w3.a W = W(readString2);
                parcel2.writeNoException();
                zq.e(parcel2, W);
                return true;
            case 3:
                w3.a O2 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                d0(O2);
                parcel2.writeNoException();
                return true;
            case 4:
                c();
                parcel2.writeNoException();
                return true;
            case 5:
                a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                parcel.readInt();
                zq.h(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                w3.a O3 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                q0(O3);
                parcel2.writeNoException();
                return true;
            case 7:
                w3.a O4 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                n6(O4);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    g20Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    g20Var = queryLocalInterface instanceof i20 ? (i20) queryLocalInterface : new g20(readStrongBinder);
                }
                zq.h(parcel);
                I1(g20Var);
                parcel2.writeNoException();
                return true;
            case 9:
                w3.a O5 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                t5(O5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
