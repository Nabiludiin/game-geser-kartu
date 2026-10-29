package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: MyApplication */
public final class ns2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12882a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12883b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12884c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12885d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12886e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12887f;

    public ns2(String str, int i7, int i8, int i9, boolean z7, int i10) {
        this.f12882a = str;
        this.f12883b = i7;
        this.f12884c = i8;
        this.f12885d = i9;
        this.f12886e = z7;
        this.f12887f = i10;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Bundle bundle = ((x81) obj).f18664a;
        m13.b(bundle, "carrier", this.f12882a, !TextUtils.isEmpty(r0));
        int i7 = this.f12883b;
        m13.c(bundle, "cnt", i7, i7 != -2);
        bundle.putInt("gnt", this.f12884c);
        bundle.putInt("pt", this.f12885d);
        Bundle a8 = m13.a(bundle, "device");
        bundle.putBundle("device", a8);
        Bundle a9 = m13.a(a8, "network");
        a8.putBundle("network", a9);
        a9.putInt("active_network_state", this.f12887f);
        a9.putBoolean("active_network_metered", this.f12886e);
    }
}
