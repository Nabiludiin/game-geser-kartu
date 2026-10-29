package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import w3.a;

/* compiled from: MyApplication */
public final class lb0 extends xq implements nb0 {
    lb0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void D5(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        r0(30, a8);
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void E0(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        r0(21, a8);
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void G3(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        r0(37, a8);
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final boolean H() {
        Parcel O = O(22, a());
        boolean a8 = zq.a(O);
        O.recycle();
        return a8;
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final s2.b3 J() {
        Parcel O = O(26, a());
        s2.b3 j8 = s2.a3.j8(O.readStrongBinder());
        O.recycle();
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final wd0 M() {
        Parcel O = O(33, a());
        wd0 wd0Var = (wd0) zq.b(O, wd0.CREATOR);
        O.recycle();
        return wd0Var;
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final tb0 S() {
        tb0 rb0Var;
        Parcel O = O(36, a());
        IBinder readStrongBinder = O.readStrongBinder();
        if (readStrongBinder == null) {
            rb0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            rb0Var = queryLocalInterface instanceof tb0 ? (tb0) queryLocalInterface : new rb0(readStrongBinder);
        }
        O.recycle();
        return rb0Var;
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final yb0 T() {
        yb0 wb0Var;
        Parcel O = O(27, a());
        IBinder readStrongBinder = O.readStrongBinder();
        if (readStrongBinder == null) {
            wb0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            wb0Var = queryLocalInterface instanceof yb0 ? (yb0) queryLocalInterface : new wb0(readStrongBinder);
        }
        O.recycle();
        return wb0Var;
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void T3(s2.b5 b5Var, String str) {
        Parcel a8 = a();
        zq.c(a8, b5Var);
        a8.writeString(str);
        r0(11, a8);
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final wd0 U() {
        Parcel O = O(34, a());
        wd0 wd0Var = (wd0) zq.b(O, wd0.CREATOR);
        O.recycle();
        return wd0Var;
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void X5(w3.a aVar, s2.b5 b5Var, String str, qb0 qb0Var) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.c(a8, b5Var);
        a8.writeString(str);
        zq.e(a8, qb0Var);
        r0(32, a8);
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void c4(boolean z7) {
        Parcel a8 = a();
        int i7 = zq.f20279b;
        a8.writeInt(z7 ? 1 : 0);
        r0(25, a8);
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void d5(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        r0(39, a8);
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final w3.a e() {
        Parcel O = O(2, a());
        w3.a O2 = a.AbstractBinderC0140a.O(O.readStrongBinder());
        O.recycle();
        return O2;
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void e3(w3.a aVar, s2.b5 b5Var, String str, qb0 qb0Var) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.c(a8, b5Var);
        a8.writeString(str);
        zq.e(a8, qb0Var);
        r0(38, a8);
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void e5(w3.a aVar, s2.g5 g5Var, s2.b5 b5Var, String str, String str2, qb0 qb0Var) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.c(a8, g5Var);
        zq.c(a8, b5Var);
        a8.writeString(str);
        a8.writeString(str2);
        zq.e(a8, qb0Var);
        r0(35, a8);
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final ub0 f0() {
        ub0 ub0Var;
        Parcel O = O(15, a());
        IBinder readStrongBinder = O.readStrongBinder();
        if (readStrongBinder == null) {
            ub0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            ub0Var = queryLocalInterface instanceof ub0 ? (ub0) queryLocalInterface : new ub0(readStrongBinder);
        }
        O.recycle();
        return ub0Var;
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void g() {
        r0(4, a());
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void g2(w3.a aVar, s2.b5 b5Var, String str, String str2, qb0 qb0Var, z10 z10Var, List list) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.c(a8, b5Var);
        a8.writeString(str);
        a8.writeString(str2);
        zq.e(a8, qb0Var);
        zq.c(a8, z10Var);
        a8.writeStringList(list);
        r0(14, a8);
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void i3(w3.a aVar, s2.b5 b5Var, String str, qb0 qb0Var) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.c(a8, b5Var);
        a8.writeString(str);
        zq.e(a8, qb0Var);
        r0(28, a8);
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void j() {
        r0(5, a());
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void k() {
        r0(8, a());
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final boolean m() {
        Parcel O = O(13, a());
        boolean a8 = zq.a(O);
        O.recycle();
        return a8;
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void n() {
        r0(9, a());
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void p1(w3.a aVar, s2.b5 b5Var, String str, String str2, qb0 qb0Var) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.c(a8, b5Var);
        a8.writeString(str);
        a8.writeString(str2);
        zq.e(a8, qb0Var);
        r0(7, a8);
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void p7(w3.a aVar, x70 x70Var, List list) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.e(a8, x70Var);
        a8.writeTypedList(list);
        r0(31, a8);
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void s() {
        r0(12, a());
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final vb0 s0() {
        vb0 vb0Var;
        Parcel O = O(16, a());
        IBinder readStrongBinder = O.readStrongBinder();
        if (readStrongBinder == null) {
            vb0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            vb0Var = queryLocalInterface instanceof vb0 ? (vb0) queryLocalInterface : new vb0(readStrongBinder);
        }
        O.recycle();
        return vb0Var;
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void t6(w3.a aVar, s2.b5 b5Var, String str, ci0 ci0Var, String str2) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.c(a8, b5Var);
        a8.writeString(null);
        zq.e(a8, ci0Var);
        a8.writeString(str2);
        r0(10, a8);
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void w3(w3.a aVar, s2.g5 g5Var, s2.b5 b5Var, String str, String str2, qb0 qb0Var) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.c(a8, g5Var);
        zq.c(a8, b5Var);
        a8.writeString(str);
        a8.writeString(str2);
        zq.e(a8, qb0Var);
        r0(6, a8);
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void z6(w3.a aVar, ci0 ci0Var, List list) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.e(a8, ci0Var);
        a8.writeStringList(list);
        r0(23, a8);
    }
}
