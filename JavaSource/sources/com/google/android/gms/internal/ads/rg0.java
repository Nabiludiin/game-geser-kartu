package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class rg0 extends yq implements sg0 {
    public rg0() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        wg0 wg0Var = null;
        xg0 xg0Var = null;
        wg0 wg0Var2 = null;
        wg0 wg0Var3 = null;
        wg0 wg0Var4 = null;
        switch (i7) {
            case 1:
                zq.h(parcel);
                parcel2.writeNoException();
                zq.d(parcel2, null);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                }
                zq.h(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                eh0 eh0Var = (eh0) zq.b(parcel, eh0.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    wg0Var = queryLocalInterface instanceof wg0 ? (wg0) queryLocalInterface : new tg0(readStrongBinder2);
                }
                zq.h(parcel);
                a2(eh0Var, wg0Var);
                parcel2.writeNoException();
                return true;
            case 5:
                eh0 eh0Var2 = (eh0) zq.b(parcel, eh0.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    wg0Var4 = queryLocalInterface2 instanceof wg0 ? (wg0) queryLocalInterface2 : new tg0(readStrongBinder3);
                }
                zq.h(parcel);
                z4(eh0Var2, wg0Var4);
                parcel2.writeNoException();
                return true;
            case 6:
                eh0 eh0Var3 = (eh0) zq.b(parcel, eh0.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    wg0Var3 = queryLocalInterface3 instanceof wg0 ? (wg0) queryLocalInterface3 : new tg0(readStrongBinder4);
                }
                zq.h(parcel);
                y3(eh0Var3, wg0Var3);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    wg0Var2 = queryLocalInterface4 instanceof wg0 ? (wg0) queryLocalInterface4 : new tg0(readStrongBinder5);
                }
                zq.h(parcel);
                h4(readString, wg0Var2);
                parcel2.writeNoException();
                return true;
            case 8:
                og0 og0Var = (og0) zq.b(parcel, og0.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    xg0Var = queryLocalInterface5 instanceof xg0 ? (xg0) queryLocalInterface5 : new xg0(readStrongBinder6);
                }
                zq.h(parcel);
                i6(og0Var, xg0Var);
                parcel2.writeNoException();
                return true;
            case 9:
                String readString2 = parcel.readString();
                zq.h(parcel);
                c0(readString2);
                parcel2.writeNoException();
                return true;
        }
    }
}
