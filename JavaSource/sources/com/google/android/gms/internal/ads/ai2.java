package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public final class ai2 implements l2.d, jd1, qb1, z91, ra1, s2.a, w91, uc1, na1, pi1 {

    /* renamed from: y, reason: collision with root package name */
    final rx1 f4986y;

    /* renamed from: q, reason: collision with root package name */
    private final AtomicReference f4978q = new AtomicReference();

    /* renamed from: r, reason: collision with root package name */
    private final AtomicReference f4979r = new AtomicReference();

    /* renamed from: s, reason: collision with root package name */
    private final AtomicReference f4980s = new AtomicReference();

    /* renamed from: t, reason: collision with root package name */
    private final AtomicReference f4981t = new AtomicReference();

    /* renamed from: u, reason: collision with root package name */
    private final AtomicReference f4982u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    private final AtomicBoolean f4983v = new AtomicBoolean(true);

    /* renamed from: w, reason: collision with root package name */
    private final AtomicBoolean f4984w = new AtomicBoolean(false);

    /* renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f4985x = new AtomicBoolean(false);

    /* renamed from: z, reason: collision with root package name */
    final BlockingQueue f4987z = new ArrayBlockingQueue(((Integer) s2.b0.c().d(uy.R9)).intValue());

    public ai2(rx1 rx1Var) {
        this.f4986y = rx1Var;
    }

    private final void w() {
        if (this.f4984w.get() && this.f4985x.get()) {
            BlockingQueue<Pair> blockingQueue = this.f4987z;
            for (final Pair pair : blockingQueue) {
                hx2.a(this.f4979r, new gx2() { // from class: com.google.android.gms.internal.ads.lh2
                    @Override // com.google.android.gms.internal.ads.gx2
                    public final /* synthetic */ void d(Object obj) {
                        Pair pair2 = pair;
                        ((s2.l1) obj).Y0((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            blockingQueue.clear();
            this.f4983v.set(false);
        }
    }

    public final void B(s2.s1 s1Var) {
        this.f4982u.set(s1Var);
    }

    @Override // com.google.android.gms.internal.ads.ra1
    public final void E() {
        hx2.a(this.f4978q, th2.f16195a);
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final void M() {
        hx2.a(this.f4978q, rh2.f14905a);
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void a() {
        hx2.a(this.f4978q, nh2.f12734a);
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void b() {
        hx2.a(this.f4978q, ph2.f13886a);
        AtomicReference atomicReference = this.f4982u;
        hx2.a(atomicReference, wh2.f18251a);
        hx2.a(atomicReference, xh2.f18841a);
    }

    @Override // s2.a
    public final void c0() {
        if (((Boolean) s2.b0.c().d(uy.Nb)).booleanValue()) {
            return;
        }
        hx2.a(this.f4978q, qh2.f14440a);
    }

    public final synchronized s2.i0 d() {
        return (s2.i0) this.f4978q.get();
    }

    @Override // com.google.android.gms.internal.ads.qb1
    public final synchronized void f() {
        hx2.a(this.f4978q, oh2.f13329a);
        hx2.a(this.f4981t, vh2.f17614a);
        this.f4985x.set(true);
        w();
    }

    @Override // com.google.android.gms.internal.ads.uc1
    public final void h(final s2.i5 i5Var) {
        hx2.a(this.f4980s, new gx2() { // from class: com.google.android.gms.internal.ads.ih2
            @Override // com.google.android.gms.internal.ads.gx2
            public final /* synthetic */ void d(Object obj) {
                ((s2.q2) obj).f8(s2.i5.this);
            }
        });
    }

    public final synchronized s2.l1 j() {
        return (s2.l1) this.f4979r.get();
    }

    public final void k(s2.i0 i0Var) {
        this.f4978q.set(i0Var);
    }

    @Override // l2.d
    public final synchronized void n(final String str, final String str2) {
        if (!this.f4983v.get()) {
            hx2.a(this.f4979r, new gx2() { // from class: com.google.android.gms.internal.ads.jh2
                @Override // com.google.android.gms.internal.ads.gx2
                public final /* synthetic */ void d(Object obj) {
                    ((s2.l1) obj).Y0(str, str2);
                }
            });
            return;
        }
        if (!this.f4987z.offer(new Pair(str, str2))) {
            int i7 = v2.n1.f26802b;
            w2.p.a("The queue for app events is full, dropping the new event.");
            rx1 rx1Var = this.f4986y;
            if (rx1Var != null) {
                qx1 a8 = rx1Var.a();
                a8.c("action", "dae_action");
                a8.c("dae_name", str);
                a8.c("dae_data", str2);
                a8.d();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.z91
    public final void o(final s2.x2 x2Var) {
        gx2 gx2Var = new gx2() { // from class: com.google.android.gms.internal.ads.mh2
            @Override // com.google.android.gms.internal.ads.gx2
            public final /* synthetic */ void d(Object obj) {
                ((s2.i0) obj).u0(s2.x2.this);
            }
        };
        AtomicReference atomicReference = this.f4978q;
        hx2.a(atomicReference, gx2Var);
        hx2.a(atomicReference, new gx2() { // from class: com.google.android.gms.internal.ads.fh2
            @Override // com.google.android.gms.internal.ads.gx2
            public final /* synthetic */ void d(Object obj) {
                ((s2.i0) obj).R(s2.x2.this.f26259q);
            }
        });
        hx2.a(this.f4981t, new gx2() { // from class: com.google.android.gms.internal.ads.hh2
            @Override // com.google.android.gms.internal.ads.gx2
            public final /* synthetic */ void d(Object obj) {
                ((s2.l0) obj).b1(s2.x2.this);
            }
        });
        this.f4983v.set(false);
        this.f4987z.clear();
    }

    @Override // com.google.android.gms.internal.ads.na1
    public final void q(final s2.x2 x2Var) {
        hx2.a(this.f4982u, new gx2() { // from class: com.google.android.gms.internal.ads.kh2
            @Override // com.google.android.gms.internal.ads.gx2
            public final /* synthetic */ void d(Object obj) {
                ((s2.s1) obj).p5(s2.x2.this);
            }
        });
    }

    public final void s(s2.l1 l1Var) {
        this.f4979r.set(l1Var);
        this.f4984w.set(true);
        w();
    }

    public final void t(s2.q2 q2Var) {
        this.f4980s.set(q2Var);
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void v() {
        hx2.a(this.f4978q, uh2.f16781a);
        hx2.a(this.f4982u, zh2.f20182a);
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final void x(o03 o03Var) {
        this.f4983v.set(true);
        this.f4985x.set(false);
    }

    public final void y(s2.l0 l0Var) {
        this.f4981t.set(l0Var);
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final void z() {
        if (((Boolean) s2.b0.c().d(uy.Nb)).booleanValue()) {
            hx2.a(this.f4978q, sh2.f15630a);
        }
        hx2.a(this.f4982u, yh2.f19586a);
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final void J(eh0 eh0Var) {
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void u(qh0 qh0Var, String str, String str2) {
    }
}
