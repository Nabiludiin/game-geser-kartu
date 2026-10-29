package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* compiled from: MyApplication */
public final class y70 extends xq implements a80 {
    y70(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void m6(List list) {
        Parcel a8 = a();
        a8.writeTypedList(list);
        r0(1, a8);
    }
}
