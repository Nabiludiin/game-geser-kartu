package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import w3.a;

/* compiled from: MyApplication */
public final class c40 extends xq implements e40 {
    c40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final s2.y2 M() {
        Parcel O = O(31, a());
        s2.y2 j8 = s2.w2.j8(O.readStrongBinder());
        O.recycle();
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final String c() {
        Parcel O = O(2, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final List e() {
        Parcel O = O(3, a());
        ArrayList f8 = zq.f(O);
        O.recycle();
        return f8;
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final String f() {
        Parcel O = O(4, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final void f5(Bundle bundle) {
        Parcel a8 = a();
        zq.c(a8, bundle);
        r0(33, a8);
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final l20 g() {
        l20 j20Var;
        Parcel O = O(5, a());
        IBinder readStrongBinder = O.readStrongBinder();
        if (readStrongBinder == null) {
            j20Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            j20Var = queryLocalInterface instanceof l20 ? (l20) queryLocalInterface : new j20(readStrongBinder);
        }
        O.recycle();
        return j20Var;
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final String i() {
        Parcel O = O(7, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final String j() {
        Parcel O = O(6, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final String k() {
        Parcel O = O(9, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final double l() {
        Parcel O = O(8, a());
        double readDouble = O.readDouble();
        O.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final e20 m() {
        e20 b20Var;
        Parcel O = O(14, a());
        IBinder readStrongBinder = O.readStrongBinder();
        if (readStrongBinder == null) {
            b20Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            b20Var = queryLocalInterface instanceof e20 ? (e20) queryLocalInterface : new b20(readStrongBinder);
        }
        O.recycle();
        return b20Var;
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final String n() {
        Parcel O = O(10, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final s2.b3 o() {
        Parcel O = O(11, a());
        s2.b3 j8 = s2.a3.j8(O.readStrongBinder());
        O.recycle();
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final w3.a t() {
        Parcel O = O(18, a());
        w3.a O2 = a.AbstractBinderC0140a.O(O.readStrongBinder());
        O.recycle();
        return O2;
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final List x() {
        Parcel O = O(23, a());
        ArrayList f8 = zq.f(O);
        O.recycle();
        return f8;
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final w3.a z() {
        Parcel O = O(19, a());
        w3.a O2 = a.AbstractBinderC0140a.O(O.readStrongBinder());
        O.recycle();
        return O2;
    }
}
