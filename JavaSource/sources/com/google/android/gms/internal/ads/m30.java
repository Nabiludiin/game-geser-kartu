package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class m30 extends xq implements o30 {
    m30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.o30
    public final void t1(e30 e30Var, String str) {
        Parcel a8 = a();
        zq.e(a8, e30Var);
        a8.writeString(str);
        r0(1, a8);
    }
}
