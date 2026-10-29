package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import w3.a;

/* compiled from: MyApplication */
public final class m extends o4.a implements IInterface {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int C1(w3.a aVar, String str, boolean z7) {
        Parcel O = O();
        o4.e.d(O, aVar);
        O.writeString(str);
        O.writeInt(z7 ? 1 : 0);
        Parcel a8 = a(5, O);
        int readInt = a8.readInt();
        a8.recycle();
        return readInt;
    }

    public final w3.a D2(w3.a aVar, String str, int i7) {
        Parcel O = O();
        o4.e.d(O, aVar);
        O.writeString(str);
        O.writeInt(i7);
        Parcel a8 = a(2, O);
        w3.a O2 = a.AbstractBinderC0140a.O(a8.readStrongBinder());
        a8.recycle();
        return O2;
    }

    public final w3.a H2(w3.a aVar, String str, int i7, w3.a aVar2) {
        Parcel O = O();
        o4.e.d(O, aVar);
        O.writeString(str);
        O.writeInt(i7);
        o4.e.d(O, aVar2);
        Parcel a8 = a(8, O);
        w3.a O2 = a.AbstractBinderC0140a.O(a8.readStrongBinder());
        a8.recycle();
        return O2;
    }

    public final w3.a a4(w3.a aVar, String str, boolean z7, long j7) {
        Parcel O = O();
        o4.e.d(O, aVar);
        O.writeString(str);
        O.writeInt(z7 ? 1 : 0);
        O.writeLong(j7);
        Parcel a8 = a(7, O);
        w3.a O2 = a.AbstractBinderC0140a.O(a8.readStrongBinder());
        a8.recycle();
        return O2;
    }

    public final int c() {
        Parcel a8 = a(6, O());
        int readInt = a8.readInt();
        a8.recycle();
        return readInt;
    }

    public final int r0(w3.a aVar, String str, boolean z7) {
        Parcel O = O();
        o4.e.d(O, aVar);
        O.writeString(str);
        O.writeInt(z7 ? 1 : 0);
        Parcel a8 = a(3, O);
        int readInt = a8.readInt();
        a8.recycle();
        return readInt;
    }

    public final w3.a v3(w3.a aVar, String str, int i7) {
        Parcel O = O();
        o4.e.d(O, aVar);
        O.writeString(str);
        O.writeInt(i7);
        Parcel a8 = a(4, O);
        w3.a O2 = a.AbstractBinderC0140a.O(a8.readStrongBinder());
        a8.recycle();
        return O2;
    }
}
