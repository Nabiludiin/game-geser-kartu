package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/* compiled from: MyApplication */
public final class zz2 extends sh0 {

    /* renamed from: q, reason: collision with root package name */
    private final pz2 f20534q;

    /* renamed from: r, reason: collision with root package name */
    private final fz2 f20535r;

    /* renamed from: s, reason: collision with root package name */
    private final p03 f20536s;

    /* renamed from: t, reason: collision with root package name */
    private nt1 f20537t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f20538u = false;

    public zz2(pz2 pz2Var, fz2 fz2Var, p03 p03Var) {
        this.f20534q = pz2Var;
        this.f20535r = fz2Var;
        this.f20536s = p03Var;
    }

    private final synchronized boolean m8() {
        nt1 nt1Var = this.f20537t;
        if (nt1Var != null) {
            if (!nt1Var.o()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.th0
    public final synchronized void B0(w3.a aVar) {
        p3.o.f("destroy must be called on the main UI thread.");
        Context context = null;
        this.f20535r.s(null);
        if (this.f20537t != null) {
            if (aVar != null) {
                context = (Context) w3.b.r0(aVar);
            }
            this.f20537t.c().X0(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.th0
    public final void F1(xh0 xh0Var) {
        p3.o.f("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f20535r.x(xh0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (((java.lang.Boolean) s2.b0.c().d(com.google.android.gms.internal.ads.uy.f17079d6)).booleanValue() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (java.util.regex.Pattern.matches(r1, r0) != false) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.th0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void F2(com.google.android.gms.internal.ads.yh0 r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            p3.o.f(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r5.f19585r     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.ly r1 = com.google.android.gms.internal.ads.uy.f17061b6     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.sy r2 = s2.b0.c()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r2.d(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L2c
            if (r0 != 0) goto L19
            goto L2c
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.Throwable -> L20 java.lang.RuntimeException -> L22
            if (r0 == 0) goto L2c
            goto L44
        L20:
            r5 = move-exception
            goto L62
        L22:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.google.android.gms.internal.ads.ql0 r2 = r2.t.l()     // Catch: java.lang.Throwable -> L20
            r2.i(r0, r1)     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r0 = r4.m8()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.ly r0 = com.google.android.gms.internal.ads.uy.f17079d6     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.sy r1 = s2.b0.c()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.d(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L46
        L44:
            monitor-exit(r4)
            return
        L46:
            com.google.android.gms.internal.ads.iz2 r0 = new com.google.android.gms.internal.ads.iz2     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r4.f20537t = r1     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.pz2 r1 = r4.f20534q     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r1.j(r2)     // Catch: java.lang.Throwable -> L20
            s2.b5 r2 = r5.f19584q     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.f19585r     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.xz2 r3 = new com.google.android.gms.internal.ads.xz2     // Catch: java.lang.Throwable -> L20
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L20
            r1.a(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)
            return
        L62:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zz2.F2(com.google.android.gms.internal.ads.yh0):void");
    }

    @Override // com.google.android.gms.internal.ads.th0
    public final synchronized void M0(w3.a aVar) {
        try {
            p3.o.f("showAd must be called on the main UI thread.");
            if (this.f20537t != null) {
                Activity activity = null;
                if (aVar != null) {
                    Object r02 = w3.b.r0(aVar);
                    if (r02 instanceof Activity) {
                        activity = (Activity) r02;
                    }
                }
                this.f20537t.k(this.f20538u, activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.th0
    public final synchronized void R0(boolean z7) {
        p3.o.f("setImmersiveMode must be called on the main UI thread.");
        this.f20538u = z7;
    }

    @Override // com.google.android.gms.internal.ads.th0
    public final void R2(s2.a1 a1Var) {
        p3.o.f("setAdMetadataListener can only be called from the UI thread.");
        if (a1Var == null) {
            this.f20535r.s(null);
        } else {
            this.f20535r.s(new yz2(this, a1Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.th0
    public final synchronized void X0(String str) {
        p3.o.f("#008 Must be called on the main UI thread.: setCustomData");
        this.f20536s.f13620b = str;
    }

    @Override // com.google.android.gms.internal.ads.th0
    public final synchronized void Z0(w3.a aVar) {
        p3.o.f("pause must be called on the main UI thread.");
        if (this.f20537t != null) {
            this.f20537t.c().U0(aVar == null ? null : (Context) w3.b.r0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.th0
    public final boolean c() {
        p3.o.f("isLoaded must be called on the main UI thread.");
        return m8();
    }

    @Override // com.google.android.gms.internal.ads.th0
    public final synchronized void d() {
        M0(null);
    }

    @Override // com.google.android.gms.internal.ads.th0
    public final void e() {
        Z0(null);
    }

    @Override // com.google.android.gms.internal.ads.th0
    public final void f() {
        t0(null);
    }

    @Override // com.google.android.gms.internal.ads.th0
    public final void g() {
        B0(null);
    }

    final /* synthetic */ p03 j8() {
        return this.f20536s;
    }

    @Override // com.google.android.gms.internal.ads.th0
    public final synchronized String k() {
        nt1 nt1Var = this.f20537t;
        if (nt1Var == null || nt1Var.d() == null) {
            return null;
        }
        return nt1Var.d().c();
    }

    @Override // com.google.android.gms.internal.ads.th0
    public final void k2(rh0 rh0Var) {
        p3.o.f("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f20535r.B(rh0Var);
    }

    final /* synthetic */ nt1 k8() {
        return this.f20537t;
    }

    final /* synthetic */ void l8(nt1 nt1Var) {
        this.f20537t = nt1Var;
    }

    @Override // com.google.android.gms.internal.ads.th0
    public final synchronized void n0(String str) {
        p3.o.f("setUserId must be called on the main UI thread.");
        this.f20536s.f13619a = str;
    }

    @Override // com.google.android.gms.internal.ads.th0
    public final boolean p() {
        nt1 nt1Var = this.f20537t;
        return nt1Var != null && nt1Var.p();
    }

    @Override // com.google.android.gms.internal.ads.th0
    public final Bundle q() {
        p3.o.f("getAdMetadata can only be called from the UI thread.");
        nt1 nt1Var = this.f20537t;
        return nt1Var != null ? nt1Var.q() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.th0
    public final synchronized s2.y2 r() {
        nt1 nt1Var;
        if (((Boolean) s2.b0.c().d(uy.m7)).booleanValue() && (nt1Var = this.f20537t) != null) {
            return nt1Var.d();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.th0
    public final synchronized void t0(w3.a aVar) {
        p3.o.f("resume must be called on the main UI thread.");
        if (this.f20537t != null) {
            this.f20537t.c().W0(aVar == null ? null : (Context) w3.b.r0(aVar));
        }
    }
}
