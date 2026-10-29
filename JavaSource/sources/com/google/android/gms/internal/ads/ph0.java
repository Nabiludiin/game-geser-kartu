package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class ph0 extends yq implements qh0 {
    public ph0() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            String b8 = b();
            parcel2.writeNoException();
            parcel2.writeString(b8);
        } else {
            if (i7 != 2) {
                return false;
            }
            int d8 = d();
            parcel2.writeNoException();
            parcel2.writeInt(d8);
        }
        return true;
    }
}
