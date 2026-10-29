package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import w3.a;

/* compiled from: MyApplication */
public abstract class bi0 extends yq implements ci0 {
    public bi0() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static ci0 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof ci0 ? (ci0) queryLocalInterface : new ai0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                w3.a O = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                Y(O);
                break;
            case 2:
                w3.a O2 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zq.h(parcel);
                N0(O2, readInt);
                break;
            case 3:
                w3.a O3 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                q0(O3);
                break;
            case 4:
                w3.a O4 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                L0(O4);
                break;
            case 5:
                w3.a O5 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                Z0(O5);
                break;
            case 6:
                w3.a O6 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                t0(O6);
                break;
            case 7:
                w3.a O7 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                di0 di0Var = (di0) zq.b(parcel, di0.CREATOR);
                zq.h(parcel);
                U7(O7, di0Var);
                break;
            case 8:
                w3.a O8 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                J1(O8);
                break;
            case 9:
                w3.a O9 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zq.h(parcel);
                S5(O9, readInt2);
                break;
            case 10:
                w3.a O10 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                j0(O10);
                break;
            case 11:
                w3.a O11 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                v6(O11);
                break;
            case 12:
                zq.h(parcel);
                break;
            case 13:
                w3.a O12 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                M0(O12);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
