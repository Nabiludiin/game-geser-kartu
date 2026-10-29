package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class ob0 extends xq implements qb0 {
    ob0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.qb0
    public final void N(int i7) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.qb0
    public final void N6(String str, String str2) {
        Parcel a8 = a();
        a8.writeString(str);
        a8.writeString(str2);
        r0(9, a8);
    }

    @Override // com.google.android.gms.internal.ads.qb0
    public final void U2(e30 e30Var, String str) {
        Parcel a8 = a();
        zq.e(a8, e30Var);
        a8.writeString(str);
        r0(10, a8);
    }

    @Override // com.google.android.gms.internal.ads.qb0
    public final void X3(s2.x2 x2Var) {
        Parcel a8 = a();
        zq.c(a8, x2Var);
        r0(24, a8);
    }

    @Override // com.google.android.gms.internal.ads.qb0
    public final void a8(int i7, String str) {
        Parcel a8 = a();
        a8.writeInt(i7);
        a8.writeString(str);
        r0(22, a8);
    }

    @Override // com.google.android.gms.internal.ads.qb0
    public final void b0(int i7) {
        Parcel a8 = a();
        a8.writeInt(i7);
        r0(3, a8);
    }

    @Override // com.google.android.gms.internal.ads.qb0
    public final void c() {
        r0(1, a());
    }

    @Override // com.google.android.gms.internal.ads.qb0
    public final void e() {
        r0(2, a());
    }

    @Override // com.google.android.gms.internal.ads.qb0
    public final void g() {
        r0(4, a());
    }

    @Override // com.google.android.gms.internal.ads.qb0
    public final void h8(di0 di0Var) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.qb0
    public final void i() {
        r0(6, a());
    }

    @Override // com.google.android.gms.internal.ads.qb0
    public final void i0(String str) {
        Parcel a8 = a();
        a8.writeString(str);
        r0(21, a8);
    }

    @Override // com.google.android.gms.internal.ads.qb0
    public final void i1(s2.x2 x2Var) {
        Parcel a8 = a();
        zq.c(a8, x2Var);
        r0(23, a8);
    }

    @Override // com.google.android.gms.internal.ads.qb0
    public final void i2(hi0 hi0Var) {
        Parcel a8 = a();
        zq.e(a8, hi0Var);
        r0(16, a8);
    }

    @Override // com.google.android.gms.internal.ads.qb0
    public final void j() {
        r0(5, a());
    }

    @Override // com.google.android.gms.internal.ads.qb0
    public final void l() {
        r0(8, a());
    }

    @Override // com.google.android.gms.internal.ads.qb0
    public final void m() {
        r0(15, a());
    }

    @Override // com.google.android.gms.internal.ads.qb0
    public final void o() {
        r0(11, a());
    }

    @Override // com.google.android.gms.internal.ads.qb0
    public final void q() {
        r0(13, a());
    }

    @Override // com.google.android.gms.internal.ads.qb0
    public final void r() {
        r0(18, a());
    }

    @Override // com.google.android.gms.internal.ads.qb0
    public final void t() {
        r0(20, a());
    }

    @Override // com.google.android.gms.internal.ads.qb0
    public final void x() {
        r0(25, a());
    }
}
