package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import w3.a;

/* compiled from: MyApplication */
public final class wb0 extends xq implements yb0 {
    wb0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final float C() {
        Parcel O = O(24, a());
        float readFloat = O.readFloat();
        O.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final void D3(w3.a aVar, w3.a aVar2, w3.a aVar3) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.e(a8, aVar2);
        zq.e(a8, aVar3);
        r0(21, a8);
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final void E0(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        r0(20, a8);
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final float J() {
        Parcel O = O(25, a());
        float readFloat = O.readFloat();
        O.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final void R4(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        r0(22, a8);
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final void T() {
        r0(26, a());
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final String c() {
        Parcel O = O(2, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final List e() {
        Parcel O = O(3, a());
        ArrayList f8 = zq.f(O);
        O.recycle();
        return f8;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final String f() {
        Parcel O = O(4, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final l20 g() {
        Parcel O = O(5, a());
        l20 j8 = k20.j8(O.readStrongBinder());
        O.recycle();
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final String i() {
        Parcel O = O(7, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final String j() {
        Parcel O = O(6, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final String k() {
        Parcel O = O(9, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final double l() {
        Parcel O = O(8, a());
        double readDouble = O.readDouble();
        O.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final w3.a m() {
        Parcel O = O(14, a());
        w3.a O2 = a.AbstractBinderC0140a.O(O.readStrongBinder());
        O.recycle();
        return O2;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final String n() {
        Parcel O = O(10, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final s2.b3 o() {
        Parcel O = O(11, a());
        s2.b3 j8 = s2.a3.j8(O.readStrongBinder());
        O.recycle();
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final Bundle p() {
        Parcel O = O(16, a());
        Bundle bundle = (Bundle) zq.b(O, Bundle.CREATOR);
        O.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final e20 q() {
        Parcel O = O(12, a());
        e20 j8 = d20.j8(O.readStrongBinder());
        O.recycle();
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final boolean r() {
        Parcel O = O(17, a());
        boolean a8 = zq.a(O);
        O.recycle();
        return a8;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final w3.a s() {
        Parcel O = O(13, a());
        w3.a O2 = a.AbstractBinderC0140a.O(O.readStrongBinder());
        O.recycle();
        return O2;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final boolean t() {
        Parcel O = O(18, a());
        boolean a8 = zq.a(O);
        O.recycle();
        return a8;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final w3.a w() {
        Parcel O = O(15, a());
        w3.a O2 = a.AbstractBinderC0140a.O(O.readStrongBinder());
        O.recycle();
        return O2;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final float x() {
        Parcel O = O(23, a());
        float readFloat = O.readFloat();
        O.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final void z() {
        r0(19, a());
    }
}
