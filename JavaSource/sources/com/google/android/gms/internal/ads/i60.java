package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class i60 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Map f9847a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s2.a f9848b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f9849c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ m60 f9850d;

    i60(m60 m60Var, Map map, s2.a aVar, String str) {
        this.f9847a = map;
        this.f9848b = aVar;
        this.f9849c = str;
        Objects.requireNonNull(m60Var);
        this.f9850d = m60Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        r2.t.l().i(th, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = (String) obj;
        if (((Boolean) s2.b0.c().d(uy.db)).booleanValue()) {
            this.f9847a.put("u", str);
        }
        this.f9850d.f(str, this.f9848b, this.f9847a, this.f9849c);
    }
}
