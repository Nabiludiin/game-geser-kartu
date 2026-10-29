package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class l22 implements jd1, cj1, qb1 {

    /* renamed from: q, reason: collision with root package name */
    private final Context f11365q;

    /* renamed from: r, reason: collision with root package name */
    private final rx1 f11366r;

    l22(Context context, rx1 rx1Var) {
        this.f11365q = context;
        this.f11366r = rx1Var;
    }

    private final void c(final Context context) {
        if (((Boolean) s2.b0.c().d(uy.f17123i5)).booleanValue()) {
            cm0.f6500a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.k22
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    l22.this.b(context);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final void J(eh0 eh0Var) {
        if (((Boolean) s2.b0.c().d(uy.f17139k5)).booleanValue()) {
            c(this.f11365q);
        }
    }

    @Override // com.google.android.gms.internal.ads.cj1
    public final void a(b3.m0 m0Var) {
        if (((Boolean) s2.b0.c().d(uy.f17147l5)).booleanValue()) {
            c(this.f11365q);
        }
    }

    final /* synthetic */ void b(Context context) {
        r2.t.r().c(context, this.f11366r);
    }

    @Override // com.google.android.gms.internal.ads.qb1
    public final void f() {
        if (((Boolean) s2.b0.c().d(uy.f17155m5)).booleanValue()) {
            c(this.f11365q);
        }
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final void x(o03 o03Var) {
    }

    @Override // com.google.android.gms.internal.ads.cj1
    public final void y(String str) {
    }
}
