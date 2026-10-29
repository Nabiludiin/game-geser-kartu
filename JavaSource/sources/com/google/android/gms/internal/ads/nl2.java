package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class nl2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f12788a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12789b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12790c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12791d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12792e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12793f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12794g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12795h;

    /* renamed from: i, reason: collision with root package name */
    public final float f12796i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f12797j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f12798k;

    public nl2(int i7, boolean z7, boolean z8, int i8, int i9, int i10, int i11, int i12, float f8, boolean z9, boolean z10) {
        this.f12788a = i7;
        this.f12789b = z7;
        this.f12790c = z8;
        this.f12791d = i8;
        this.f12792e = i9;
        this.f12793f = i10;
        this.f12794g = i11;
        this.f12795h = i12;
        this.f12796i = f8;
        this.f12797j = z9;
        this.f12798k = z10;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Bundle bundle = ((x81) obj).f18664a;
        if (((Boolean) s2.b0.c().d(uy.Zb)).booleanValue()) {
            bundle.putInt("muv_min", this.f12792e);
            bundle.putInt("muv_max", this.f12793f);
        }
        bundle.putFloat("android_app_volume", this.f12796i);
        bundle.putBoolean("android_app_muted", this.f12797j);
        if (this.f12798k) {
            return;
        }
        bundle.putInt("am", this.f12788a);
        bundle.putBoolean("ma", this.f12789b);
        bundle.putBoolean("sp", this.f12790c);
        bundle.putInt("muv", this.f12791d);
        bundle.putInt("rm", this.f12794g);
        bundle.putInt("riv", this.f12795h);
    }
}
