package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class gi0 extends yq implements hi0 {
    public gi0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public static hi0 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        return queryLocalInterface instanceof hi0 ? (hi0) queryLocalInterface : new fi0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            String c8 = c();
            parcel2.writeNoException();
            parcel2.writeString(c8);
        } else {
            if (i7 != 2) {
                return false;
            }
            int e8 = e();
            parcel2.writeNoException();
            parcel2.writeInt(e8);
        }
        return true;
    }
}
