package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: MyApplication */
final class jd implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f22283q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f22284r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ Bundle f22285s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ kd f22286t;

    jd(kd kdVar, String str, String str2, Bundle bundle) {
        this.f22283q = str;
        this.f22284r = str2;
        this.f22285s = bundle;
        Objects.requireNonNull(kdVar);
        this.f22286t = kdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pd pdVar = this.f22286t.f22308a;
        yd N0 = pdVar.N0();
        long a8 = pdVar.f().a();
        String str = this.f22283q;
        pdVar.i((g0) p3.o.m(N0.R(str, this.f22284r, this.f22285s, "auto", a8, false, true)), str);
    }
}
