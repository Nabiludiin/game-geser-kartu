package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import w3.a;

/* compiled from: MyApplication */
public abstract class ue0 extends yq implements ve0 {
    public ue0() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static ve0 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof ve0 ? (ve0) queryLocalInterface : new se0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                Intent intent = (Intent) zq.b(parcel, Intent.CREATOR);
                zq.h(parcel);
                c1(intent);
                break;
            case 2:
                w3.a O = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zq.h(parcel);
                f3(O, readString, readString2);
                break;
            case 3:
                f();
                break;
            case 4:
                w3.a O2 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                L0(O2);
                break;
            case 5:
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                w3.a O3 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                c6(createStringArray, createIntArray, O3);
                break;
            case 6:
                w3.a O4 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                t2.a aVar = (t2.a) zq.b(parcel, t2.a.CREATOR);
                zq.h(parcel);
                O3(O4, aVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
