package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import w3.a;

/* compiled from: MyApplication */
public final class n extends o4.a implements IInterface {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final w3.a C1(w3.a aVar, String str, int i7, w3.a aVar2) {
        Parcel O = O();
        o4.e.d(O, aVar);
        O.writeString(str);
        O.writeInt(i7);
        o4.e.d(O, aVar2);
        Parcel a8 = a(3, O);
        w3.a O2 = a.AbstractBinderC0140a.O(a8.readStrongBinder());
        a8.recycle();
        return O2;
    }

    public final w3.a r0(w3.a aVar, String str, int i7, w3.a aVar2) {
        Parcel O = O();
        o4.e.d(O, aVar);
        O.writeString(str);
        O.writeInt(i7);
        o4.e.d(O, aVar2);
        Parcel a8 = a(2, O);
        w3.a O2 = a.AbstractBinderC0140a.O(a8.readStrongBinder());
        a8.recycle();
        return O2;
    }
}
