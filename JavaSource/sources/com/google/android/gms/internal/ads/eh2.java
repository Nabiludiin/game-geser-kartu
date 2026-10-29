package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;

/* compiled from: MyApplication */
public final class eh2 extends s2.u0 implements zc1 {

    /* renamed from: q, reason: collision with root package name */
    private final Context f7634q;

    /* renamed from: r, reason: collision with root package name */
    private final nw2 f7635r;

    /* renamed from: s, reason: collision with root package name */
    private final String f7636s;

    /* renamed from: t, reason: collision with root package name */
    private final ai2 f7637t;

    /* renamed from: u, reason: collision with root package name */
    private s2.g5 f7638u;

    /* renamed from: v, reason: collision with root package name */
    private final v03 f7639v;

    /* renamed from: w, reason: collision with root package name */
    private final w2.a f7640w;

    /* renamed from: x, reason: collision with root package name */
    private final rx1 f7641x;

    /* renamed from: y, reason: collision with root package name */
    private h21 f7642y;

    public eh2(Context context, s2.g5 g5Var, String str, nw2 nw2Var, ai2 ai2Var, w2.a aVar, rx1 rx1Var) {
        this.f7634q = context;
        this.f7635r = nw2Var;
        this.f7638u = g5Var;
        this.f7636s = str;
        this.f7637t = ai2Var;
        this.f7639v = nw2Var.g();
        this.f7640w = aVar;
        this.f7641x = rx1Var;
        nw2Var.i(this);
    }

    private final synchronized void l8(s2.g5 g5Var) {
        v03 v03Var = this.f7639v;
        v03Var.B(g5Var);
        v03Var.D(this.f7638u.D);
    }

    private final synchronized boolean m8(s2.b5 b5Var) {
        try {
            if (n8()) {
                p3.o.f("loadAd must be called on the main UI thread.");
            }
            r2.t.g();
            Context context = this.f7634q;
            if (!v2.f2.l(context) || b5Var.I != null) {
                u13.b(context, b5Var.f26061v);
                return this.f7635r.a(b5Var, this.f7636s, null, new dh2(this));
            }
            int i7 = v2.n1.f26802b;
            w2.p.c("Failed to load the ad because app ID is missing.");
            ai2 ai2Var = this.f7637t;
            if (ai2Var != null) {
                ai2Var.o(z13.d(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean n8() {
        boolean z7;
        if (((Boolean) u00.f16529f.e()).booleanValue()) {
            if (((Boolean) s2.b0.c().d(uy.jc)).booleanValue()) {
                z7 = true;
                return this.f7640w.f27053s >= ((Integer) s2.b0.c().d(uy.kc)).intValue() || !z7;
            }
        }
        z7 = false;
        if (this.f7640w.f27053s >= ((Integer) s2.b0.c().d(uy.kc)).intValue()) {
        }
    }

    @Override // s2.v0
    public final synchronized void A6(s2.u4 u4Var) {
        try {
            if (n8()) {
                p3.o.f("setVideoOptions must be called on the main UI thread.");
            }
            this.f7639v.H(u4Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // s2.v0
    public final synchronized boolean C() {
        h21 h21Var = this.f7642y;
        if (h21Var != null) {
            if (h21Var.i()) {
                return true;
            }
        }
        return false;
    }

    @Override // s2.v0
    public final synchronized s2.b3 D() {
        p3.o.f("getVideoController must be called from the main thread.");
        h21 h21Var = this.f7642y;
        if (h21Var == null) {
            return null;
        }
        return h21Var.m();
    }

    @Override // s2.v0
    public final s2.i0 G() {
        return this.f7637t.d();
    }

    @Override // s2.v0
    public final synchronized boolean J() {
        return this.f7635r.b();
    }

    @Override // s2.v0
    public final void L4(s2.i0 i0Var) {
        if (n8()) {
            p3.o.f("setAdListener must be called on the main UI thread.");
        }
        this.f7637t.k(i0Var);
    }

    @Override // s2.v0
    public final synchronized void N2(qz qzVar) {
        p3.o.f("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f7635r.e(qzVar);
    }

    @Override // s2.v0
    public final void N3(s2.q2 q2Var) {
        if (n8()) {
            p3.o.f("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!q2Var.e()) {
                this.f7641x.b();
            }
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.b("Error in making CSI ping for reporting paid event callback", e8);
        }
        this.f7637t.t(q2Var);
    }

    @Override // com.google.android.gms.internal.ads.zc1
    public final synchronized void O() {
        nw2 nw2Var = this.f7635r;
        if (nw2Var.h()) {
            nw2Var.c();
        } else {
            nw2Var.k();
        }
    }

    @Override // s2.v0
    public final synchronized boolean U0(s2.b5 b5Var) {
        l8(this.f7638u);
        return m8(b5Var);
    }

    @Override // s2.v0
    public final synchronized void X4(s2.g5 g5Var) {
        p3.o.f("setAdSize must be called on the main UI thread.");
        this.f7639v.B(g5Var);
        this.f7638u = g5Var;
        h21 h21Var = this.f7642y;
        if (h21Var != null) {
            h21Var.l(this.f7635r.d(), g5Var);
        }
    }

    @Override // s2.v0
    public final synchronized void Z5(s2.p1 p1Var) {
        p3.o.f("setCorrelationIdProvider must be called on the main UI thread");
        this.f7639v.x(p1Var);
    }

    @Override // com.google.android.gms.internal.ads.zc1
    public final synchronized void a() {
        try {
            if (!this.f7635r.h()) {
                this.f7635r.j();
                return;
            }
            v03 v03Var = this.f7639v;
            s2.g5 E = v03Var.E();
            if (this.f7642y != null && v03Var.b()) {
                E = c13.a(this.f7634q, Collections.singletonList(this.f7642y.p()));
            }
            l8(E);
            v03Var.C(true);
            try {
                m8(v03Var.A());
            } catch (RemoteException unused) {
                int i7 = v2.n1.f26802b;
                w2.p.f("Failed to refresh the banner ad.");
            }
            this.f7639v.C(false);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // s2.v0
    public final void a6(s2.a1 a1Var) {
        p3.o.f("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // s2.v0
    public final w3.a b() {
        if (n8()) {
            p3.o.f("getAdFrame must be called on the main UI thread.");
        }
        return w3.b.C1(this.f7635r.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003f, B:12:0x0043, B:19:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[DONT_GENERATE] */
    @Override // s2.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.g00 r0 = com.google.android.gms.internal.ads.u00.f16528e     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.ly r0 = com.google.android.gms.internal.ads.uy.gc     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.sy r1 = s2.b0.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.d(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            w2.a r0 = r3.f7640w     // Catch: java.lang.Throwable -> L38
            int r0 = r0.f27053s     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.ly r1 = com.google.android.gms.internal.ads.uy.lc     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.sy r2 = s2.b0.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.d(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4a
        L3a:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            p3.o.f(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.h21 r0 = r3.f7642y     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L48
            r0.a()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L48:
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eh2.d():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003f, B:12:0x0043, B:19:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[DONT_GENERATE] */
    @Override // s2.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.g00 r0 = com.google.android.gms.internal.ads.u00.f16530g     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.ly r0 = com.google.android.gms.internal.ads.uy.hc     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.sy r1 = s2.b0.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.d(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            w2.a r0 = r3.f7640w     // Catch: java.lang.Throwable -> L38
            int r0 = r0.f27053s     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.ly r1 = com.google.android.gms.internal.ads.uy.lc     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.sy r2 = s2.b0.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.d(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4f
        L3a:
            java.lang.String r0 = "pause must be called on the main UI thread."
            p3.o.f(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.h21 r0 = r3.f7642y     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.wa1 r0 = r0.c()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            r0.U0(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L4d:
            monitor-exit(r3)
            return
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eh2.e():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003f, B:12:0x0043, B:19:0x003a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[DONT_GENERATE] */
    @Override // s2.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void f() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.g00 r0 = com.google.android.gms.internal.ads.u00.f16531h     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.ly r0 = com.google.android.gms.internal.ads.uy.fc     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.sy r1 = s2.b0.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r1.d(r0)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L3a
            w2.a r0 = r3.f7640w     // Catch: java.lang.Throwable -> L38
            int r0 = r0.f27053s     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.ly r1 = com.google.android.gms.internal.ads.uy.lc     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.sy r2 = s2.b0.c()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.d(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L38
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L38
            if (r0 >= r1) goto L3f
            goto L3a
        L38:
            r0 = move-exception
            goto L4f
        L3a:
            java.lang.String r0 = "resume must be called on the main UI thread."
            p3.o.f(r0)     // Catch: java.lang.Throwable -> L38
        L3f:
            com.google.android.gms.internal.ads.h21 r0 = r3.f7642y     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.wa1 r0 = r0.c()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            r0.W0(r1)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
            return
        L4d:
            monitor-exit(r3)
            return
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L38
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eh2.f():void");
    }

    @Override // s2.v0
    public final void g3(s2.f0 f0Var) {
        if (n8()) {
            p3.o.f("setAdListener must be called on the main UI thread.");
        }
        this.f7635r.f(f0Var);
    }

    @Override // s2.v0
    public final boolean h() {
        return false;
    }

    final /* synthetic */ h21 j8() {
        return this.f7642y;
    }

    @Override // s2.v0
    public final synchronized long k0() {
        h21 h21Var = this.f7642y;
        if (h21Var == null || h21Var.e() == null) {
            return this.f7639v.V();
        }
        return h21Var.e().a();
    }

    final /* synthetic */ void k8(h21 h21Var) {
        this.f7642y = h21Var;
    }

    @Override // s2.v0
    public final Bundle l() {
        p3.o.f("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // s2.v0
    public final synchronized void m2(long j7) {
        this.f7639v.W(j7);
        h21 h21Var = this.f7642y;
        if (h21Var == null || h21Var.e() == null) {
            return;
        }
        h21Var.e().b(j7);
    }

    @Override // s2.v0
    public final synchronized void n() {
        p3.o.f("recordManualImpression must be called on the main UI thread.");
        h21 h21Var = this.f7642y;
        if (h21Var != null) {
            h21Var.s();
        }
    }

    @Override // s2.v0
    public final synchronized s2.g5 o() {
        p3.o.f("getAdSize must be called on the main UI thread.");
        h21 h21Var = this.f7642y;
        if (h21Var != null) {
            return c13.a(this.f7634q, Collections.singletonList(h21Var.o()));
        }
        return this.f7639v.E();
    }

    @Override // s2.v0
    public final synchronized String p() {
        h21 h21Var = this.f7642y;
        if (h21Var == null || h21Var.d() == null) {
            return null;
        }
        return h21Var.d().c();
    }

    @Override // s2.v0
    public final synchronized s2.y2 r() {
        h21 h21Var;
        if (((Boolean) s2.b0.c().d(uy.m7)).booleanValue() && (h21Var = this.f7642y) != null) {
            return h21Var.d();
        }
        return null;
    }

    @Override // s2.v0
    public final synchronized String t() {
        return this.f7636s;
    }

    @Override // s2.v0
    public final void v2(s2.l1 l1Var) {
        if (n8()) {
            p3.o.f("setAppEventListener must be called on the main UI thread.");
        }
        this.f7637t.s(l1Var);
    }

    @Override // s2.v0
    public final synchronized String w() {
        h21 h21Var = this.f7642y;
        if (h21Var == null || h21Var.d() == null) {
            return null;
        }
        return h21Var.d().c();
    }

    @Override // s2.v0
    public final synchronized void x5(boolean z7) {
        try {
            if (n8()) {
                p3.o.f("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f7639v.J(z7);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // s2.v0
    public final s2.l1 z() {
        return this.f7637t.j();
    }

    @Override // s2.v0
    public final void k() {
    }

    @Override // s2.v0
    public final void I6(s2.m5 m5Var) {
    }

    @Override // s2.v0
    public final void O1(s2.s1 s1Var) {
    }

    @Override // s2.v0
    public final void Q7(xh0 xh0Var) {
    }

    @Override // s2.v0
    public final void R5(String str) {
    }

    @Override // s2.v0
    public final void U4(String str) {
    }

    @Override // s2.v0
    public final void W1(w3.a aVar) {
    }

    @Override // s2.v0
    public final void Y5(lf0 lf0Var) {
    }

    @Override // s2.v0
    public final void j3(et etVar) {
    }

    @Override // s2.v0
    public final void x6(s2.f3 f3Var) {
    }

    @Override // s2.v0
    public final void z0(boolean z7) {
    }

    @Override // s2.v0
    public final void p3(s2.b5 b5Var, s2.l0 l0Var) {
    }

    @Override // s2.v0
    public final void v4(of0 of0Var, String str) {
    }
}
