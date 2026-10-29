package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class gd0 extends xq implements id0 {
    gd0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final boolean B0(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        Parcel O = O(15, a8);
        boolean a9 = zq.a(O);
        O.recycle();
        return a9;
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void D1(String str, String str2, s2.b5 b5Var, w3.a aVar, sc0 sc0Var, qb0 qb0Var) {
        Parcel a8 = a();
        a8.writeString(str);
        a8.writeString(str2);
        zq.c(a8, b5Var);
        zq.e(a8, aVar);
        zq.e(a8, sc0Var);
        zq.e(a8, qb0Var);
        r0(23, a8);
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void E1(String str, String str2, s2.b5 b5Var, w3.a aVar, fd0 fd0Var, qb0 qb0Var) {
        Parcel a8 = a();
        a8.writeString(str);
        a8.writeString(str2);
        zq.c(a8, b5Var);
        zq.e(a8, aVar);
        zq.e(a8, fd0Var);
        zq.e(a8, qb0Var);
        r0(16, a8);
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void F4(String str, String str2, s2.b5 b5Var, w3.a aVar, vc0 vc0Var, qb0 qb0Var, s2.g5 g5Var) {
        Parcel a8 = a();
        a8.writeString(str);
        a8.writeString(str2);
        zq.c(a8, b5Var);
        zq.e(a8, aVar);
        zq.e(a8, vc0Var);
        zq.e(a8, qb0Var);
        zq.c(a8, g5Var);
        r0(13, a8);
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void G7(w3.a aVar, String str, Bundle bundle, Bundle bundle2, s2.g5 g5Var, ld0 ld0Var) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        a8.writeString(str);
        zq.c(a8, bundle);
        zq.c(a8, bundle2);
        zq.c(a8, g5Var);
        zq.e(a8, ld0Var);
        r0(1, a8);
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void I5(String str, String str2, s2.b5 b5Var, w3.a aVar, cd0 cd0Var, qb0 qb0Var) {
        Parcel a8 = a();
        a8.writeString(str);
        a8.writeString(str2);
        zq.c(a8, b5Var);
        zq.e(a8, aVar);
        zq.e(a8, cd0Var);
        zq.e(a8, qb0Var);
        r0(18, a8);
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void O0(String str) {
        Parcel a8 = a();
        a8.writeString(str);
        r0(19, a8);
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void Q4(String str, String str2, s2.b5 b5Var, w3.a aVar, fd0 fd0Var, qb0 qb0Var) {
        Parcel a8 = a();
        a8.writeString(str);
        a8.writeString(str2);
        zq.c(a8, b5Var);
        zq.e(a8, aVar);
        zq.e(a8, fd0Var);
        zq.e(a8, qb0Var);
        r0(20, a8);
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void S6(String str, String str2, s2.b5 b5Var, w3.a aVar, yc0 yc0Var, qb0 qb0Var) {
        Parcel a8 = a();
        a8.writeString(str);
        a8.writeString(str2);
        zq.c(a8, b5Var);
        zq.e(a8, aVar);
        zq.e(a8, yc0Var);
        zq.e(a8, qb0Var);
        r0(14, a8);
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final wd0 e() {
        Parcel O = O(2, a());
        wd0 wd0Var = (wd0) zq.b(O, wd0.CREATOR);
        O.recycle();
        return wd0Var;
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final wd0 f() {
        Parcel O = O(3, a());
        wd0 wd0Var = (wd0) zq.b(O, wd0.CREATOR);
        O.recycle();
        return wd0Var;
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final s2.b3 g() {
        Parcel O = O(5, a());
        s2.b3 j8 = s2.a3.j8(O.readStrongBinder());
        O.recycle();
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final boolean g4(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        Parcel O = O(17, a8);
        boolean a9 = zq.a(O);
        O.recycle();
        return a9;
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void g5(String str, String str2, s2.b5 b5Var, w3.a aVar, vc0 vc0Var, qb0 qb0Var, s2.g5 g5Var) {
        Parcel a8 = a();
        a8.writeString(str);
        a8.writeString(str2);
        zq.c(a8, b5Var);
        zq.e(a8, aVar);
        zq.e(a8, vc0Var);
        zq.e(a8, qb0Var);
        zq.c(a8, g5Var);
        r0(21, a8);
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void t3(String str, String str2, s2.b5 b5Var, w3.a aVar, cd0 cd0Var, qb0 qb0Var, z10 z10Var) {
        Parcel a8 = a();
        a8.writeString(str);
        a8.writeString(str2);
        zq.c(a8, b5Var);
        zq.e(a8, aVar);
        zq.e(a8, cd0Var);
        zq.e(a8, qb0Var);
        zq.c(a8, z10Var);
        r0(22, a8);
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final boolean y0(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        Parcel O = O(24, a8);
        boolean a9 = zq.a(O);
        O.recycle();
        return a9;
    }
}
