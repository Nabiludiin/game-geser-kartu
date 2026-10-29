package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class qi0 extends yq implements ri0 {
    public qi0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            c();
        } else if (i7 == 2) {
            int readInt = parcel.readInt();
            zq.h(parcel);
            B(readInt);
        } else {
            if (i7 != 3) {
                return false;
            }
            s2.x2 x2Var = (s2.x2) zq.b(parcel, s2.x2.CREATOR);
            zq.h(parcel);
            A(x2Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
