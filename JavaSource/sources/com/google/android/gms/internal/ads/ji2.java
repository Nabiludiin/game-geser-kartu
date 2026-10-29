package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: MyApplication */
public final class ji2 extends s2.u0 {
    private boolean A = ((Boolean) s2.b0.c().d(uy.V0)).booleanValue();

    /* renamed from: q, reason: collision with root package name */
    private final s2.g5 f10558q;

    /* renamed from: r, reason: collision with root package name */
    private final Context f10559r;

    /* renamed from: s, reason: collision with root package name */
    private final ey2 f10560s;

    /* renamed from: t, reason: collision with root package name */
    private final String f10561t;

    /* renamed from: u, reason: collision with root package name */
    private final w2.a f10562u;

    /* renamed from: v, reason: collision with root package name */
    private final ai2 f10563v;

    /* renamed from: w, reason: collision with root package name */
    private final fz2 f10564w;

    /* renamed from: x, reason: collision with root package name */
    private final fn f10565x;

    /* renamed from: y, reason: collision with root package name */
    private final rx1 f10566y;

    /* renamed from: z, reason: collision with root package name */
    private rj1 f10567z;

    public ji2(Context context, s2.g5 g5Var, String str, ey2 ey2Var, ai2 ai2Var, fz2 fz2Var, w2.a aVar, fn fnVar, rx1 rx1Var) {
        this.f10558q = g5Var;
        this.f10561t = str;
        this.f10559r = context;
        this.f10560s = ey2Var;
        this.f10563v = ai2Var;
        this.f10564w = fz2Var;
        this.f10562u = aVar;
        this.f10565x = fnVar;
        this.f10566y = rx1Var;
    }

    private final synchronized boolean l8() {
        rj1 rj1Var = this.f10567z;
        if (rj1Var != null) {
            if (!rj1Var.l()) {
                return true;
            }
        }
        return false;
    }

    @Override // s2.v0
    public final synchronized boolean C() {
        return false;
    }

    @Override // s2.v0
    public final s2.b3 D() {
        return null;
    }

    @Override // s2.v0
    public final s2.i0 G() {
        return this.f10563v.d();
    }

    @Override // s2.v0
    public final synchronized boolean J() {
        return this.f10560s.b();
    }

    @Override // s2.v0
    public final void L4(s2.i0 i0Var) {
        p3.o.f("setAdListener must be called on the main UI thread.");
        this.f10563v.k(i0Var);
    }

    @Override // s2.v0
    public final synchronized void N2(qz qzVar) {
        p3.o.f("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f10560s.c(qzVar);
    }

    @Override // s2.v0
    public final void N3(s2.q2 q2Var) {
        p3.o.f("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!q2Var.e()) {
                this.f10566y.b();
            }
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.b("Error in making CSI ping for reporting paid event callback", e8);
        }
        this.f10563v.t(q2Var);
    }

    @Override // s2.v0
    public final void O1(s2.s1 s1Var) {
        this.f10563v.B(s1Var);
    }

    @Override // s2.v0
    public final void Q7(xh0 xh0Var) {
        this.f10564w.x(xh0Var);
    }

    @Override // s2.v0
    public final synchronized boolean U0(s2.b5 b5Var) {
        boolean z7;
        try {
            if (!b5Var.b()) {
                if (((Boolean) u00.f16532i.e()).booleanValue()) {
                    if (((Boolean) s2.b0.c().d(uy.jc)).booleanValue()) {
                        z7 = true;
                        if (this.f10562u.f27053s >= ((Integer) s2.b0.c().d(uy.kc)).intValue() || !z7) {
                            p3.o.f("loadAd must be called on the main UI thread.");
                        }
                    }
                }
                z7 = false;
                if (this.f10562u.f27053s >= ((Integer) s2.b0.c().d(uy.kc)).intValue()) {
                }
                p3.o.f("loadAd must be called on the main UI thread.");
            }
            r2.t.g();
            Context context = this.f10559r;
            if (v2.f2.l(context) && b5Var.I == null) {
                int i7 = v2.n1.f26802b;
                w2.p.c("Failed to load the ad because app ID is missing.");
                ai2 ai2Var = this.f10563v;
                if (ai2Var != null) {
                    ai2Var.o(z13.d(4, null, null));
                }
            } else if (!l8()) {
                u13.b(context, b5Var.f26061v);
                this.f10567z = null;
                return this.f10560s.a(b5Var, this.f10561t, new xx2(this.f10558q), new ii2(this));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // s2.v0
    public final synchronized void W1(w3.a aVar) {
        if (this.f10567z == null) {
            int i7 = v2.n1.f26802b;
            w2.p.f("Interstitial can not be shown before loaded.");
            this.f10563v.q(z13.d(9, null, null));
        } else {
            if (((Boolean) s2.b0.c().d(uy.f17137k3)).booleanValue()) {
                this.f10565x.b().i(new Throwable().getStackTrace());
            }
            this.f10567z.k(this.A, (Activity) w3.b.r0(aVar));
        }
    }

    @Override // s2.v0
    public final void a6(s2.a1 a1Var) {
        p3.o.f("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // s2.v0
    public final w3.a b() {
        return null;
    }

    @Override // s2.v0
    public final synchronized void d() {
        p3.o.f("destroy must be called on the main UI thread.");
        rj1 rj1Var = this.f10567z;
        if (rj1Var != null) {
            rj1Var.c().X0(null);
        }
    }

    @Override // s2.v0
    public final synchronized void e() {
        p3.o.f("pause must be called on the main UI thread.");
        rj1 rj1Var = this.f10567z;
        if (rj1Var != null) {
            rj1Var.c().U0(null);
        }
    }

    @Override // s2.v0
    public final synchronized void f() {
        p3.o.f("resume must be called on the main UI thread.");
        rj1 rj1Var = this.f10567z;
        if (rj1Var != null) {
            rj1Var.c().W0(null);
        }
    }

    @Override // s2.v0
    public final synchronized boolean h() {
        p3.o.f("isLoaded must be called on the main UI thread.");
        return l8();
    }

    final /* synthetic */ rj1 j8() {
        return this.f10567z;
    }

    @Override // s2.v0
    public final synchronized void k() {
        p3.o.f("showInterstitial must be called on the main UI thread.");
        if (this.f10567z == null) {
            int i7 = v2.n1.f26802b;
            w2.p.f("Interstitial can not be shown before loaded.");
            this.f10563v.q(z13.d(9, null, null));
        } else {
            if (((Boolean) s2.b0.c().d(uy.f17137k3)).booleanValue()) {
                this.f10565x.b().i(new Throwable().getStackTrace());
            }
            this.f10567z.k(this.A, null);
        }
    }

    @Override // s2.v0
    public final synchronized long k0() {
        rj1 rj1Var = this.f10567z;
        if (rj1Var == null || rj1Var.e() == null) {
            return 0L;
        }
        return rj1Var.e().a();
    }

    final /* synthetic */ void k8(rj1 rj1Var) {
        this.f10567z = rj1Var;
    }

    @Override // s2.v0
    public final Bundle l() {
        p3.o.f("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // s2.v0
    public final synchronized void m2(long j7) {
        rj1 rj1Var = this.f10567z;
        if (rj1Var == null || rj1Var.e() == null) {
            return;
        }
        rj1Var.e().b(j7);
    }

    @Override // s2.v0
    public final s2.g5 o() {
        return null;
    }

    @Override // s2.v0
    public final synchronized String p() {
        rj1 rj1Var = this.f10567z;
        if (rj1Var == null || rj1Var.d() == null) {
            return null;
        }
        return rj1Var.d().c();
    }

    @Override // s2.v0
    public final void p3(s2.b5 b5Var, s2.l0 l0Var) {
        this.f10563v.y(l0Var);
        U0(b5Var);
    }

    @Override // s2.v0
    public final synchronized s2.y2 r() {
        rj1 rj1Var;
        if (((Boolean) s2.b0.c().d(uy.m7)).booleanValue() && (rj1Var = this.f10567z) != null) {
            return rj1Var.d();
        }
        return null;
    }

    @Override // s2.v0
    public final synchronized String t() {
        return this.f10561t;
    }

    @Override // s2.v0
    public final void v2(s2.l1 l1Var) {
        p3.o.f("setAppEventListener must be called on the main UI thread.");
        this.f10563v.s(l1Var);
    }

    @Override // s2.v0
    public final synchronized String w() {
        rj1 rj1Var = this.f10567z;
        if (rj1Var == null || rj1Var.d() == null) {
            return null;
        }
        return rj1Var.d().c();
    }

    @Override // s2.v0
    public final s2.l1 z() {
        return this.f10563v.j();
    }

    @Override // s2.v0
    public final synchronized void z0(boolean z7) {
        p3.o.f("setImmersiveMode must be called on the main UI thread.");
        this.A = z7;
    }

    @Override // s2.v0
    public final void n() {
    }

    @Override // s2.v0
    public final void A6(s2.u4 u4Var) {
    }

    @Override // s2.v0
    public final void I6(s2.m5 m5Var) {
    }

    @Override // s2.v0
    public final void R5(String str) {
    }

    @Override // s2.v0
    public final void U4(String str) {
    }

    @Override // s2.v0
    public final void X4(s2.g5 g5Var) {
    }

    @Override // s2.v0
    public final void Y5(lf0 lf0Var) {
    }

    @Override // s2.v0
    public final void Z5(s2.p1 p1Var) {
    }

    @Override // s2.v0
    public final void g3(s2.f0 f0Var) {
    }

    @Override // s2.v0
    public final void j3(et etVar) {
    }

    @Override // s2.v0
    public final void x5(boolean z7) {
    }

    @Override // s2.v0
    public final void x6(s2.f3 f3Var) {
    }

    @Override // s2.v0
    public final void v4(of0 of0Var, String str) {
    }
}
