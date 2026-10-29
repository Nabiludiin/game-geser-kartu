package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class se0 extends xq implements ve0 {
    se0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.ve0
    public final void L0(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        r0(4, a8);
    }

    @Override // com.google.android.gms.internal.ads.ve0
    public final void O3(w3.a aVar, t2.a aVar2) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.c(a8, aVar2);
        r0(6, a8);
    }

    @Override // com.google.android.gms.internal.ads.ve0
    public final void c1(Intent intent) {
        Parcel a8 = a();
        zq.c(a8, intent);
        r0(1, a8);
    }

    @Override // com.google.android.gms.internal.ads.ve0
    public final void c6(String[] strArr, int[] iArr, w3.a aVar) {
        Parcel a8 = a();
        a8.writeStringArray(strArr);
        a8.writeIntArray(iArr);
        zq.e(a8, aVar);
        r0(5, a8);
    }

    @Override // com.google.android.gms.internal.ads.ve0
    public final void f() {
        r0(3, a());
    }
}
