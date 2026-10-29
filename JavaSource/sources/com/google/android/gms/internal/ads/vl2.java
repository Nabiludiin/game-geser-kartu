package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class vl2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final double f17665a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f17666b;

    public vl2(double d8, boolean z7) {
        this.f17665a = d8;
        this.f17666b = z7;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Bundle bundle = ((x81) obj).f18664a;
        Bundle a8 = m13.a(bundle, "device");
        bundle.putBundle("device", a8);
        Bundle a9 = m13.a(a8, "battery");
        a8.putBundle("battery", a9);
        a9.putBoolean("is_charging", this.f17666b);
        a9.putDouble("battery_level", this.f17665a);
    }
}
