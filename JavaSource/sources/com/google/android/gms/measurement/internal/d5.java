package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public final class d5 extends com.google.android.gms.internal.measurement.p0 implements t4.d {
    d5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // t4.d
    public final void B2(long j7, String str, String str2, String str3) {
        Parcel O = O();
        O.writeLong(j7);
        O.writeString(str);
        O.writeString(str2);
        O.writeString(str3);
        r0(10, O);
    }

    @Override // t4.d
    public final void C2(ae aeVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.r0.c(O, aeVar);
        r0(18, O);
    }

    @Override // t4.d
    public final void G4(ae aeVar, g gVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.r0.c(O, aeVar);
        com.google.android.gms.internal.measurement.r0.c(O, gVar);
        r0(30, O);
    }

    @Override // t4.d
    public final byte[] I4(g0 g0Var, String str) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.r0.c(O, g0Var);
        O.writeString(str);
        Parcel a8 = a(9, O);
        byte[] createByteArray = a8.createByteArray();
        a8.recycle();
        return createByteArray;
    }

    @Override // t4.d
    public final void J6(ae aeVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.r0.c(O, aeVar);
        r0(27, O);
    }

    @Override // t4.d
    public final void M3(ae aeVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.r0.c(O, aeVar);
        r0(25, O);
    }

    @Override // t4.d
    public final List V6(String str, String str2, boolean z7, ae aeVar) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        int i7 = com.google.android.gms.internal.measurement.r0.f21323b;
        O.writeInt(z7 ? 1 : 0);
        com.google.android.gms.internal.measurement.r0.c(O, aeVar);
        Parcel a8 = a(14, O);
        ArrayList createTypedArrayList = a8.createTypedArrayList(ud.CREATOR);
        a8.recycle();
        return createTypedArrayList;
    }

    @Override // t4.d
    public final void V7(ae aeVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.r0.c(O, aeVar);
        r0(20, O);
    }

    @Override // t4.d
    public final List h3(String str, String str2, String str3) {
        Parcel O = O();
        O.writeString(null);
        O.writeString(str2);
        O.writeString(str3);
        Parcel a8 = a(17, O);
        ArrayList createTypedArrayList = a8.createTypedArrayList(i.CREATOR);
        a8.recycle();
        return createTypedArrayList;
    }

    @Override // t4.d
    public final void i5(ud udVar, ae aeVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.r0.c(O, udVar);
        com.google.android.gms.internal.measurement.r0.c(O, aeVar);
        r0(2, O);
    }

    @Override // t4.d
    public final void l6(ae aeVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.r0.c(O, aeVar);
        r0(4, O);
    }

    @Override // t4.d
    public final List m1(String str, String str2, String str3, boolean z7) {
        Parcel O = O();
        O.writeString(null);
        O.writeString(str2);
        O.writeString(str3);
        int i7 = com.google.android.gms.internal.measurement.r0.f21323b;
        O.writeInt(z7 ? 1 : 0);
        Parcel a8 = a(15, O);
        ArrayList createTypedArrayList = a8.createTypedArrayList(ud.CREATOR);
        a8.recycle();
        return createTypedArrayList;
    }

    @Override // t4.d
    public final t4.a n5(ae aeVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.r0.c(O, aeVar);
        Parcel a8 = a(21, O);
        t4.a aVar = (t4.a) com.google.android.gms.internal.measurement.r0.b(a8, t4.a.CREATOR);
        a8.recycle();
        return aVar;
    }

    @Override // t4.d
    public final String o7(ae aeVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.r0.c(O, aeVar);
        Parcel a8 = a(11, O);
        String readString = a8.readString();
        a8.recycle();
        return readString;
    }

    @Override // t4.d
    public final void q4(g0 g0Var, ae aeVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.r0.c(O, g0Var);
        com.google.android.gms.internal.measurement.r0.c(O, aeVar);
        r0(1, O);
    }

    @Override // t4.d
    public final List q7(String str, String str2, ae aeVar) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        com.google.android.gms.internal.measurement.r0.c(O, aeVar);
        Parcel a8 = a(16, O);
        ArrayList createTypedArrayList = a8.createTypedArrayList(i.CREATOR);
        a8.recycle();
        return createTypedArrayList;
    }

    @Override // t4.d
    public final void r1(i iVar, ae aeVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.r0.c(O, iVar);
        com.google.android.gms.internal.measurement.r0.c(O, aeVar);
        r0(12, O);
    }

    @Override // t4.d
    public final void s4(ae aeVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.r0.c(O, aeVar);
        r0(6, O);
    }

    @Override // t4.d
    public final void u5(Bundle bundle, ae aeVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.r0.c(O, bundle);
        com.google.android.gms.internal.measurement.r0.c(O, aeVar);
        r0(19, O);
    }

    @Override // t4.d
    public final void w1(ae aeVar, Bundle bundle, t4.g gVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.r0.c(O, aeVar);
        com.google.android.gms.internal.measurement.r0.c(O, bundle);
        com.google.android.gms.internal.measurement.r0.d(O, gVar);
        r0(31, O);
    }

    @Override // t4.d
    public final void x4(ae aeVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.r0.c(O, aeVar);
        r0(26, O);
    }

    @Override // t4.d
    public final void y7(ae aeVar, t4.n0 n0Var, t4.j jVar) {
        Parcel O = O();
        com.google.android.gms.internal.measurement.r0.c(O, aeVar);
        com.google.android.gms.internal.measurement.r0.c(O, n0Var);
        com.google.android.gms.internal.measurement.r0.d(O, jVar);
        r0(29, O);
    }
}
