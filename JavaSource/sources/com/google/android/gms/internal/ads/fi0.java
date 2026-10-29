package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class fi0 extends xq implements hi0 {
    fi0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.hi0
    public final String c() {
        Parcel O = O(1, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.hi0
    public final int e() {
        Parcel O = O(2, a());
        int readInt = O.readInt();
        O.recycle();
        return readInt;
    }
}
