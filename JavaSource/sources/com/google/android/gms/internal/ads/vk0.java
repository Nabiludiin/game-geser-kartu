package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import w3.a;

/* compiled from: MyApplication */
public abstract class vk0 extends yq implements wk0 {
    public vk0() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static wk0 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return queryLocalInterface instanceof wk0 ? (wk0) queryLocalInterface : new uk0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        tk0 tk0Var = null;
        switch (i7) {
            case 1:
                w3.a O = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                al0 al0Var = (al0) zq.b(parcel, al0.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    tk0Var = queryLocalInterface instanceof tk0 ? (tk0) queryLocalInterface : new rk0(readStrongBinder);
                }
                zq.h(parcel);
                X2(O, al0Var, tk0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                w3.a O2 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                zzf(O2);
                parcel2.writeNoException();
                return true;
            case 3:
                a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                parcel2.writeNoException();
                zq.e(parcel2, null);
                return true;
            case 4:
                a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                parcel2.writeNoException();
                zq.e(parcel2, null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                w3.a O3 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                rf0 j8 = qf0.j8(parcel.readStrongBinder());
                zq.h(parcel);
                K4(createTypedArrayList, O3, j8);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                w3.a O4 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                rf0 j82 = qf0.j8(parcel.readStrongBinder());
                zq.h(parcel);
                i7(createTypedArrayList2, O4, j82);
                parcel2.writeNoException();
                return true;
            case 7:
                vf0 vf0Var = (vf0) zq.b(parcel, vf0.CREATOR);
                zq.h(parcel);
                F6(vf0Var);
                parcel2.writeNoException();
                return true;
            case 8:
                w3.a O5 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                t0(O5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                w3.a O6 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                rf0 j83 = qf0.j8(parcel.readStrongBinder());
                zq.h(parcel);
                v1(createTypedArrayList3, O6, j83);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                w3.a O7 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                rf0 j84 = qf0.j8(parcel.readStrongBinder());
                zq.h(parcel);
                U3(createTypedArrayList4, O7, j84);
                parcel2.writeNoException();
                return true;
            case 11:
                w3.a O8 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                w3.a O9 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                String readString = parcel.readString();
                w3.a O10 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                w3.a g72 = g7(O8, O9, readString, O10);
                parcel2.writeNoException();
                zq.e(parcel2, g72);
                return true;
            default:
                return false;
        }
    }
}
