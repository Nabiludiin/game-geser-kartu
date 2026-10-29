package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: MyApplication */
public final class mr2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12385a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12386b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12387c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12388d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12389e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12390f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12391g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12392h;

    mr2(boolean z7, boolean z8, String str, boolean z9, int i7, int i8, int i9, String str2) {
        this.f12385a = z7;
        this.f12386b = z8;
        this.f12387c = str;
        this.f12388d = z9;
        this.f12389e = i7;
        this.f12390f = i8;
        this.f12391g = i9;
        this.f12392h = str2;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = ((x81) obj).f18665b;
        bundle.putString("js", this.f12387c);
        bundle.putInt("target_api", this.f12389e);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Bundle bundle = ((x81) obj).f18664a;
        bundle.putString("js", this.f12387c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) s2.b0.c().d(uy.f17154m4));
        bundle.putInt("target_api", this.f12389e);
        bundle.putInt("dv", this.f12390f);
        bundle.putInt("lv", this.f12391g);
        if (((Boolean) s2.b0.c().d(uy.f17252y6)).booleanValue()) {
            String str = this.f12392h;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("ev", str);
            }
        }
        Bundle a8 = m13.a(bundle, "sdk_env");
        a8.putBoolean("mf", ((Boolean) w00.f17938e.e()).booleanValue());
        a8.putBoolean("instant_app", this.f12385a);
        a8.putBoolean("lite", this.f12386b);
        a8.putBoolean("is_privileged_process", this.f12388d);
        bundle.putBundle("sdk_env", a8);
        Bundle a9 = m13.a(a8, "build_meta");
        a9.putString("cl", "811902923");
        a9.putString("rapid_rc", "dev");
        a9.putString("rapid_rollup", "HEAD");
        a8.putBundle("build_meta", a9);
    }
}
