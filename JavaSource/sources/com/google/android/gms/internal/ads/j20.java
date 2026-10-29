package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;
import w3.a;

/* compiled from: MyApplication */
public final class j20 extends xq implements l20 {
    j20(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.l20
    public final w3.a b() {
        Parcel O = O(1, a());
        w3.a O2 = a.AbstractBinderC0140a.O(O.readStrongBinder());
        O.recycle();
        return O2;
    }

    @Override // com.google.android.gms.internal.ads.l20
    public final int c() {
        Parcel O = O(4, a());
        int readInt = O.readInt();
        O.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.l20
    public final Uri d() {
        Parcel O = O(2, a());
        Uri uri = (Uri) zq.b(O, Uri.CREATOR);
        O.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.l20
    public final int e() {
        Parcel O = O(5, a());
        int readInt = O.readInt();
        O.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.l20
    public final Map f() {
        Parcel O = O(6, a());
        HashMap g8 = zq.g(O);
        O.recycle();
        return g8;
    }

    @Override // com.google.android.gms.internal.ads.l20
    public final double h() {
        Parcel O = O(3, a());
        double readDouble = O.readDouble();
        O.recycle();
        return readDouble;
    }
}
