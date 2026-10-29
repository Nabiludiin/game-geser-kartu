package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public final class b20 extends xq implements e20 {
    b20(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final String b() {
        Parcel O = O(2, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final List d() {
        Parcel O = O(3, a());
        ArrayList f8 = zq.f(O);
        O.recycle();
        return f8;
    }
}
