package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import w3.a;

/* compiled from: MyApplication */
public final class c30 extends xq implements e30 {
    c30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final String g() {
        Parcel O = O(4, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final boolean j0(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        Parcel O = O(10, a8);
        boolean a9 = zq.a(O);
        O.recycle();
        return a9;
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final w3.a n() {
        Parcel O = O(9, a());
        w3.a O2 = a.AbstractBinderC0140a.O(O.readStrongBinder());
        O.recycle();
        return O2;
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final boolean y0(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        Parcel O = O(17, a8);
        boolean a9 = zq.a(O);
        O.recycle();
        return a9;
    }
}
