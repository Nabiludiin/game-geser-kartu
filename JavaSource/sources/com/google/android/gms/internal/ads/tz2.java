package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: MyApplication */
public final class tz2 extends ji0 {

    /* renamed from: q, reason: collision with root package name */
    private final pz2 f16505q;

    /* renamed from: r, reason: collision with root package name */
    private final fz2 f16506r;

    /* renamed from: s, reason: collision with root package name */
    private final String f16507s;

    /* renamed from: t, reason: collision with root package name */
    private final p03 f16508t;

    /* renamed from: u, reason: collision with root package name */
    private final Context f16509u;

    /* renamed from: v, reason: collision with root package name */
    private final w2.a f16510v;

    /* renamed from: w, reason: collision with root package name */
    private final fn f16511w;

    /* renamed from: x, reason: collision with root package name */
    private final rx1 f16512x;

    /* renamed from: y, reason: collision with root package name */
    private nt1 f16513y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f16514z = ((Boolean) s2.b0.c().d(uy.V0)).booleanValue();

    public tz2(String str, pz2 pz2Var, Context context, fz2 fz2Var, p03 p03Var, w2.a aVar, fn fnVar, rx1 rx1Var) {
        this.f16507s = str;
        this.f16505q = pz2Var;
        this.f16506r = fz2Var;
        this.f16508t = p03Var;
        this.f16509u = context;
        this.f16510v = aVar;
        this.f16511w = fnVar;
        this.f16512x = rx1Var;
    }

    private final synchronized void n8(s2.b5 b5Var, ri0 ri0Var, int i7) {
        try {
            if (!b5Var.b()) {
                boolean z7 = false;
                if (((Boolean) u00.f16534k.e()).booleanValue()) {
                    if (((Boolean) s2.b0.c().d(uy.jc)).booleanValue()) {
                        z7 = true;
                    }
                }
                if (this.f16510v.f27053s < ((Integer) s2.b0.c().d(uy.kc)).intValue() || !z7) {
                    p3.o.f("#008 Must be called on the main UI thread.");
                }
            }
            fz2 fz2Var = this.f16506r;
            fz2Var.k(ri0Var);
            r2.t.g();
            if (v2.f2.l(this.f16509u) && b5Var.I == null) {
                int i8 = v2.n1.f26802b;
                w2.p.c("Failed to load the ad because app ID is missing.");
                fz2Var.o(z13.d(4, null, null));
                return;
            }
            if (this.f16513y != null) {
                return;
            }
            iz2 iz2Var = new iz2(null);
            pz2 pz2Var = this.f16505q;
            pz2Var.j(i7);
            pz2Var.a(b5Var, this.f16507s, iz2Var, new sz2(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final void B1(ni0 ni0Var) {
        p3.o.f("#008 Must be called on the main UI thread.");
        this.f16506r.n(ni0Var);
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final synchronized void C0(w3.a aVar) {
        O7(aVar, this.f16514z);
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final void G6(s2.q2 q2Var) {
        p3.o.f("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!q2Var.e()) {
                this.f16512x.b();
            }
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.b("Error in making CSI ping for reporting paid event callback", e8);
        }
        this.f16506r.t(q2Var);
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final synchronized void I7(s2.b5 b5Var, ri0 ri0Var) {
        n8(b5Var, ri0Var, 2);
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final synchronized void L7(s2.b5 b5Var, ri0 ri0Var) {
        n8(b5Var, ri0Var, 3);
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final void O5(s2.n2 n2Var) {
        if (n2Var == null) {
            this.f16506r.s(null);
        } else {
            this.f16506r.s(new rz2(this, n2Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final synchronized void O7(w3.a aVar, boolean z7) {
        p3.o.f("#008 Must be called on the main UI thread.");
        if (this.f16513y == null) {
            int i7 = v2.n1.f26802b;
            w2.p.f("Rewarded can not be shown before loaded");
            this.f16506r.q(z13.d(9, null, null));
        } else {
            if (((Boolean) s2.b0.c().d(uy.f17137k3)).booleanValue()) {
                this.f16511w.b().i(new Throwable().getStackTrace());
            }
            this.f16513y.k(z7, (Activity) w3.b.r0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final void b7(si0 si0Var) {
        p3.o.f("#008 Must be called on the main UI thread.");
        this.f16506r.y(si0Var);
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final synchronized void c7(fj0 fj0Var) {
        p3.o.f("#008 Must be called on the main UI thread.");
        p03 p03Var = this.f16508t;
        p03Var.f13619a = fj0Var.f8280q;
        p03Var.f13620b = fj0Var.f8281r;
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final synchronized void d8(boolean z7) {
        p3.o.f("setImmersiveMode must be called on the main UI thread.");
        this.f16514z = z7;
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final Bundle f() {
        p3.o.f("#008 Must be called on the main UI thread.");
        nt1 nt1Var = this.f16513y;
        return nt1Var != null ? nt1Var.q() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final synchronized String i() {
        nt1 nt1Var = this.f16513y;
        if (nt1Var == null || nt1Var.d() == null) {
            return null;
        }
        return nt1Var.d().c();
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final boolean j() {
        p3.o.f("#008 Must be called on the main UI thread.");
        nt1 nt1Var = this.f16513y;
        return (nt1Var == null || nt1Var.l()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final hi0 k() {
        p3.o.f("#008 Must be called on the main UI thread.");
        nt1 nt1Var = this.f16513y;
        if (nt1Var != null) {
            return nt1Var.m();
        }
        return null;
    }

    final /* synthetic */ p03 k8() {
        return this.f16508t;
    }

    final /* synthetic */ nt1 l8() {
        return this.f16513y;
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final synchronized long m() {
        nt1 nt1Var = this.f16513y;
        if (nt1Var == null || nt1Var.e() == null) {
            return 0L;
        }
        return nt1Var.e().a();
    }

    final /* synthetic */ void m8(nt1 nt1Var) {
        this.f16513y = nt1Var;
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final s2.y2 n() {
        nt1 nt1Var;
        if (((Boolean) s2.b0.c().d(uy.m7)).booleanValue() && (nt1Var = this.f16513y) != null) {
            return nt1Var.d();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final String o() {
        return this.f16507s;
    }

    @Override // com.google.android.gms.internal.ads.ki0
    public final synchronized void y5(long j7) {
        nt1 nt1Var = this.f16513y;
        if (nt1Var == null || nt1Var.e() == null) {
            return;
        }
        nt1Var.e().b(j7);
    }
}
