package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class af0 extends xq implements cf0 {
    af0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void K2(int i7, String[] strArr, int[] iArr) {
        Parcel a8 = a();
        a8.writeInt(i7);
        a8.writeStringArray(strArr);
        a8.writeIntArray(iArr);
        r0(15, a8);
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void V2(int i7, int i8, Intent intent) {
        Parcel a8 = a();
        a8.writeInt(i7);
        a8.writeInt(i8);
        zq.c(a8, intent);
        r0(12, a8);
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void X(Bundle bundle) {
        Parcel a8 = a();
        zq.c(a8, bundle);
        Parcel O = O(6, a8);
        if (O.readInt() != 0) {
            bundle.readFromParcel(O);
        }
        O.recycle();
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void c() {
        r0(10, a());
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void e() {
        r0(14, a());
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final boolean f() {
        Parcel O = O(11, a());
        boolean a8 = zq.a(O);
        O.recycle();
        return a8;
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void i() {
        r0(3, a());
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void j() {
        r0(2, a());
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void j0(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        r0(13, a8);
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void k() {
        r0(5, a());
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void l() {
        r0(4, a());
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void m() {
        r0(8, a());
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void p() {
        r0(9, a());
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void s() {
        r0(7, a());
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void x7(Bundle bundle) {
        Parcel a8 = a();
        zq.c(a8, bundle);
        r0(1, a8);
    }
}
