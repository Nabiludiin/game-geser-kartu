package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* compiled from: MyApplication */
public final class pf0 extends xq implements rf0 {
    pf0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.rf0
    public final void W0(List list) {
        Parcel a8 = a();
        a8.writeTypedList(list);
        r0(1, a8);
    }

    @Override // com.google.android.gms.internal.ads.rf0
    public final void u(String str) {
        Parcel a8 = a();
        a8.writeString(str);
        r0(2, a8);
    }
}
