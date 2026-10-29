package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class vz0 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x73 f17925a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f17926b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w2.w f17927c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ d01 f17928d;

    vz0(d01 d01Var, x73 x73Var, String str, w2.w wVar) {
        this.f17925a = x73Var;
        this.f17926b = str;
        this.f17927c = wVar;
        Objects.requireNonNull(d01Var);
        this.f17928d = d01Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(final Throwable th) {
        final x73 x73Var = this.f17925a;
        final String str = this.f17926b;
        final w2.w wVar = this.f17927c;
        this.f17928d.j().H0(new Runnable() { // from class: com.google.android.gms.internal.ads.uz0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean booleanValue = ((Boolean) s2.b0.c().d(uy.qb)).booleanValue();
                Throwable th2 = th;
                vz0 vz0Var = vz0.this;
                if (booleanValue) {
                    d01 d01Var = vz0Var.f17928d;
                    cg0 e8 = ag0.e(d01Var.i());
                    d01Var.f6888i = e8;
                    e8.a(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    d01 d01Var2 = vz0Var.f17928d;
                    cg0 c8 = ag0.c(d01Var2.i());
                    d01Var2.f6887h = c8;
                    c8.a(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                w2.w wVar2 = wVar;
                x73Var.b(str, wVar2, null, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final x73 x73Var = this.f17925a;
        final String str = (String) obj;
        final w2.w wVar = this.f17927c;
        this.f17928d.j().H0(new Runnable() { // from class: com.google.android.gms.internal.ads.tz0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                x73.this.b(str, wVar, null, null);
            }
        });
    }
}
