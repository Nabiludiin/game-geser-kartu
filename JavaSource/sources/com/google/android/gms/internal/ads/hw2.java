package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class hw2 extends s2.u0 implements u2.c0, vs {
    protected b21 A;

    /* renamed from: q, reason: collision with root package name */
    private final gu0 f9737q;

    /* renamed from: r, reason: collision with root package name */
    private final Context f9738r;

    /* renamed from: t, reason: collision with root package name */
    private final String f9740t;

    /* renamed from: u, reason: collision with root package name */
    private final aw2 f9741u;

    /* renamed from: v, reason: collision with root package name */
    private final yv2 f9742v;

    /* renamed from: w, reason: collision with root package name */
    private final w2.a f9743w;

    /* renamed from: x, reason: collision with root package name */
    private final rx1 f9744x;

    /* renamed from: z, reason: collision with root package name */
    private n11 f9746z;

    /* renamed from: s, reason: collision with root package name */
    private AtomicBoolean f9739s = new AtomicBoolean();

    /* renamed from: y, reason: collision with root package name */
    private long f9745y = -1;

    public hw2(gu0 gu0Var, Context context, String str, aw2 aw2Var, yv2 yv2Var, w2.a aVar, rx1 rx1Var) {
        this.f9737q = gu0Var;
        this.f9738r = context;
        this.f9740t = str;
        this.f9741u = aw2Var;
        this.f9742v = yv2Var;
        this.f9743w = aVar;
        this.f9744x = rx1Var;
        yv2Var.d(this);
    }

    private final synchronized void m8(int i7) {
        try {
            if (this.f9739s.compareAndSet(false, true)) {
                this.f9742v.r();
                n11 n11Var = this.f9746z;
                if (n11Var != null) {
                    r2.t.k().c(n11Var);
                }
                if (this.A != null) {
                    long j7 = -1;
                    if (this.f9745y != -1) {
                        j7 = r2.t.o().b() - this.f9745y;
                    }
                    this.A.o(j7, i7);
                }
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // s2.v0
    public final synchronized void A6(s2.u4 u4Var) {
    }

    @Override // s2.v0
    public final synchronized boolean C() {
        return false;
    }

    @Override // s2.v0
    public final synchronized s2.b3 D() {
        return null;
    }

    @Override // s2.v0
    public final s2.i0 G() {
        return null;
    }

    @Override // s2.v0
    public final void I6(s2.m5 m5Var) {
        this.f9741u.d(m5Var);
    }

    @Override // s2.v0
    public final synchronized boolean J() {
        return this.f9741u.b();
    }

    @Override // s2.v0
    public final synchronized void N2(qz qzVar) {
    }

    final /* synthetic */ void O() {
        m8(5);
    }

    @Override // s2.v0
    public final synchronized boolean U0(s2.b5 b5Var) {
        boolean z7;
        try {
            if (!b5Var.b()) {
                if (((Boolean) u00.f16527d.e()).booleanValue()) {
                    if (((Boolean) s2.b0.c().d(uy.jc)).booleanValue()) {
                        z7 = true;
                        if (this.f9743w.f27053s >= ((Integer) s2.b0.c().d(uy.kc)).intValue() || !z7) {
                            p3.o.f("loadAd must be called on the main UI thread.");
                        }
                    }
                }
                z7 = false;
                if (this.f9743w.f27053s >= ((Integer) s2.b0.c().d(uy.kc)).intValue()) {
                }
                p3.o.f("loadAd must be called on the main UI thread.");
            }
            r2.t.g();
            if (v2.f2.l(this.f9738r) && b5Var.I == null) {
                int i7 = v2.n1.f26802b;
                w2.p.c("Failed to load the ad because app ID is missing.");
                this.f9742v.o(z13.d(4, null, null));
                return false;
            }
            if (J()) {
                return false;
            }
            this.f9739s = new AtomicBoolean();
            return this.f9741u.a(b5Var, this.f9740t, new cw2(this), new dw2(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // u2.c0
    public final void V5(int i7) {
        if (i7 == 0) {
            throw null;
        }
        int i8 = i7 - 1;
        if (i8 == 0) {
            m8(2);
            return;
        }
        if (i8 == 1) {
            m8(4);
        } else if (i8 != 2) {
            m8(6);
        } else {
            m8(3);
        }
    }

    @Override // s2.v0
    public final synchronized void X4(s2.g5 g5Var) {
        p3.o.f("setAdSize must be called on the main UI thread.");
    }

    @Override // s2.v0
    public final synchronized void Z5(s2.p1 p1Var) {
    }

    @Override // com.google.android.gms.internal.ads.vs
    public final void a() {
        m8(3);
    }

    @Override // s2.v0
    public final w3.a b() {
        return null;
    }

    @Override // s2.v0
    public final synchronized void d() {
        p3.o.f("destroy must be called on the main UI thread.");
        b21 b21Var = this.A;
        if (b21Var != null) {
            b21Var.a();
        }
    }

    @Override // s2.v0
    public final synchronized void e() {
        p3.o.f("pause must be called on the main UI thread.");
    }

    @Override // s2.v0
    public final synchronized void f() {
        p3.o.f("resume must be called on the main UI thread.");
    }

    @Override // u2.c0
    public final synchronized void g() {
        if (this.A != null) {
            this.f9745y = r2.t.o().b();
            int m7 = this.A.m();
            if (m7 > 0) {
                n11 n11Var = new n11(this.f9737q.k(), r2.t.o());
                this.f9746z = n11Var;
                n11Var.a(m7, new Runnable() { // from class: com.google.android.gms.internal.ads.fw2
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        hw2.this.j8();
                    }
                });
            }
        }
    }

    @Override // s2.v0
    public final boolean h() {
        return false;
    }

    @Override // s2.v0
    public final void j3(et etVar) {
        this.f9742v.b(etVar);
    }

    final /* synthetic */ void j8() {
        this.f9737q.j().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.gw2
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                hw2.this.O();
            }
        });
    }

    @Override // s2.v0
    public final synchronized void k() {
    }

    @Override // s2.v0
    public final long k0() {
        return 0L;
    }

    final /* synthetic */ yv2 k8() {
        return this.f9742v;
    }

    @Override // s2.v0
    public final Bundle l() {
        return new Bundle();
    }

    final /* synthetic */ rx1 l8() {
        return this.f9744x;
    }

    @Override // s2.v0
    public final synchronized void n() {
    }

    @Override // s2.v0
    public final synchronized s2.g5 o() {
        return null;
    }

    @Override // s2.v0
    public final synchronized String p() {
        return null;
    }

    @Override // s2.v0
    public final synchronized s2.y2 r() {
        return null;
    }

    @Override // s2.v0
    public final synchronized String t() {
        return this.f9740t;
    }

    @Override // u2.c0
    public final synchronized void t7() {
        b21 b21Var = this.A;
        if (b21Var != null) {
            b21Var.o(r2.t.o().b() - this.f9745y, 1);
        }
    }

    @Override // s2.v0
    public final synchronized String w() {
        return null;
    }

    @Override // s2.v0
    public final synchronized void x5(boolean z7) {
    }

    @Override // s2.v0
    public final s2.l1 z() {
        return null;
    }

    @Override // u2.c0
    public final void C7() {
    }

    @Override // u2.c0
    public final void H2() {
    }

    @Override // u2.c0
    public final void M5() {
    }

    @Override // u2.c0
    public final void P4() {
    }

    @Override // u2.c0
    public final void T5() {
    }

    @Override // u2.c0
    public final void Z4() {
    }

    @Override // u2.c0
    public final void a4() {
    }

    @Override // u2.c0
    public final void v3() {
    }

    @Override // s2.v0
    public final void L4(s2.i0 i0Var) {
    }

    @Override // s2.v0
    public final void N3(s2.q2 q2Var) {
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
    public final void a6(s2.a1 a1Var) {
    }

    @Override // s2.v0
    public final void g3(s2.f0 f0Var) {
    }

    @Override // s2.v0
    public final void m2(long j7) {
    }

    @Override // s2.v0
    public final void v2(s2.l1 l1Var) {
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
