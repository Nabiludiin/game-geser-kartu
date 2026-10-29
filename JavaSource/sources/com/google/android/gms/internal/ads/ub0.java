package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import w3.a;

/* compiled from: MyApplication */
public final class ub0 extends xq implements IInterface {
    ub0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final double D2() {
        Parcel O = O(7, a());
        double readDouble = O.readDouble();
        O.recycle();
        return readDouble;
    }

    public final String H2() {
        Parcel O = O(8, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    public final void M5(w3.a aVar, w3.a aVar2, w3.a aVar3) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.e(a8, aVar2);
        zq.e(a8, aVar3);
        r0(22, a8);
    }

    public final e20 P4() {
        Parcel O = O(19, a());
        e20 j8 = d20.j8(O.readStrongBinder());
        O.recycle();
        return j8;
    }

    public final w3.a Z4() {
        Parcel O = O(20, a());
        w3.a O2 = a.AbstractBinderC0140a.O(O.readStrongBinder());
        O.recycle();
        return O2;
    }

    public final void a4(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        r0(16, a8);
    }

    public final String c() {
        Parcel O = O(2, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    public final List e() {
        Parcel O = O(3, a());
        ArrayList f8 = zq.f(O);
        O.recycle();
        return f8;
    }

    public final String f() {
        Parcel O = O(4, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    public final l20 g() {
        Parcel O = O(5, a());
        l20 j8 = k20.j8(O.readStrongBinder());
        O.recycle();
        return j8;
    }

    public final String j() {
        Parcel O = O(6, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    public final void j0(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        r0(11, a8);
    }

    public final String k() {
        Parcel O = O(9, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    public final boolean m() {
        Parcel O = O(14, a());
        boolean a8 = zq.a(O);
        O.recycle();
        return a8;
    }

    public final void n() {
        r0(10, a());
    }

    public final w3.a q5() {
        Parcel O = O(21, a());
        w3.a O2 = a.AbstractBinderC0140a.O(O.readStrongBinder());
        O.recycle();
        return O2;
    }

    public final boolean s() {
        Parcel O = O(13, a());
        boolean a8 = zq.a(O);
        O.recycle();
        return a8;
    }

    public final w3.a t() {
        Parcel O = O(18, a());
        w3.a O2 = a.AbstractBinderC0140a.O(O.readStrongBinder());
        O.recycle();
        return O2;
    }

    public final s2.b3 u4() {
        Parcel O = O(17, a());
        s2.b3 j8 = s2.a3.j8(O.readStrongBinder());
        O.recycle();
        return j8;
    }

    public final Bundle v3() {
        Parcel O = O(15, a());
        Bundle bundle = (Bundle) zq.b(O, Bundle.CREATOR);
        O.recycle();
        return bundle;
    }

    public final void v6(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        r0(12, a8);
    }
}
