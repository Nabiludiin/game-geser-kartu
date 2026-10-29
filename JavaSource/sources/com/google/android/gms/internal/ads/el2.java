package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;

/* compiled from: MyApplication */
public final class el2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    final Context f7678a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7679b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7680c;

    /* renamed from: d, reason: collision with root package name */
    private final long f7681d;

    /* renamed from: e, reason: collision with root package name */
    private final j61 f7682e;

    /* renamed from: f, reason: collision with root package name */
    private final f23 f7683f;

    /* renamed from: g, reason: collision with root package name */
    private final w03 f7684g;

    /* renamed from: h, reason: collision with root package name */
    private final v2.p1 f7685h = r2.t.l().q();

    /* renamed from: i, reason: collision with root package name */
    private final lx1 f7686i;

    /* renamed from: j, reason: collision with root package name */
    private final x61 f7687j;

    public el2(Context context, String str, String str2, j61 j61Var, f23 f23Var, w03 w03Var, lx1 lx1Var, x61 x61Var, long j7) {
        this.f7678a = context;
        this.f7679b = str;
        this.f7680c = str2;
        this.f7682e = j61Var;
        this.f7683f = f23Var;
        this.f7684g = w03Var;
        this.f7686i = lx1Var;
        this.f7687j = x61Var;
        this.f7681d = j7;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        Bundle bundle = new Bundle();
        lx1 lx1Var = this.f7686i;
        Map c8 = lx1Var.c();
        String str = this.f7679b;
        c8.put("seq_num", str);
        if (((Boolean) s2.b0.c().d(uy.f17224v2)).booleanValue()) {
            lx1Var.d("tsacc", String.valueOf(r2.t.o().a() - this.f7681d));
            r2.t.g();
            lx1Var.d("foreground", true != v2.f2.k(this.f7678a) ? "1" : "0");
        }
        j61 j61Var = this.f7682e;
        w03 w03Var = this.f7684g;
        j61Var.d(w03Var.f17958d);
        bundle.putAll(this.f7683f.b());
        return p64.a(new fl2(this.f7678a, bundle, str, this.f7680c, this.f7685h, w03Var.f17961g, this.f7687j));
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 12;
    }
}
