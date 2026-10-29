package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class tu3 extends yq implements uu3 {
    public tu3() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zq.b(parcel, Bundle.CREATOR);
        zq.h(parcel);
        P0(bundle);
        return true;
    }
}
