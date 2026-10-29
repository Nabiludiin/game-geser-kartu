package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class z71 implements jd1, cj1 {

    /* renamed from: q, reason: collision with root package name */
    private final Context f20032q;

    /* renamed from: r, reason: collision with root package name */
    private final w03 f20033r;

    /* renamed from: s, reason: collision with root package name */
    private final w2.a f20034s;

    /* renamed from: t, reason: collision with root package name */
    private final v2.p1 f20035t;

    /* renamed from: u, reason: collision with root package name */
    private final f02 f20036u;

    /* renamed from: v, reason: collision with root package name */
    private final e63 f20037v;

    /* renamed from: w, reason: collision with root package name */
    private final b12 f20038w;

    public z71(Context context, w03 w03Var, w2.a aVar, v2.p1 p1Var, f02 f02Var, e63 e63Var, b12 b12Var) {
        this.f20032q = context;
        this.f20033r = w03Var;
        this.f20034s = aVar;
        this.f20035t = p1Var;
        this.f20036u = f02Var;
        this.f20037v = e63Var;
        this.f20038w = b12Var;
    }

    private final void b() {
        if (((Boolean) s2.b0.c().d(uy.B4)).booleanValue()) {
            v2.p1 p1Var = this.f20035t;
            Context context = this.f20032q;
            w2.a aVar = this.f20034s;
            w03 w03Var = this.f20033r;
            e63 e63Var = this.f20037v;
            b12 b12Var = this.f20038w;
            r2.t.p().b(context, aVar, w03Var.f17961g, p1Var.j(), e63Var, b12Var.t());
        }
        this.f20036u.c();
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final void J(eh0 eh0Var) {
        b();
    }

    @Override // com.google.android.gms.internal.ads.cj1
    public final void a(b3.m0 m0Var) {
        if (((Boolean) s2.b0.c().d(uy.C4)).booleanValue()) {
            b();
        }
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final void x(o03 o03Var) {
    }

    @Override // com.google.android.gms.internal.ads.cj1
    public final void y(String str) {
    }
}
