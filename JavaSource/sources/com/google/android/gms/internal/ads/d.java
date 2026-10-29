package com.google.android.gms.internal.ads;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class d implements f1 {

    /* renamed from: a, reason: collision with root package name */
    private final g0 f6865a;

    /* renamed from: b, reason: collision with root package name */
    private final h0 f6866b;

    /* renamed from: c, reason: collision with root package name */
    private final n0 f6867c;

    /* renamed from: d, reason: collision with root package name */
    private final Queue f6868d;

    /* renamed from: e, reason: collision with root package name */
    private Surface f6869e;

    /* renamed from: f, reason: collision with root package name */
    private eq5 f6870f;

    /* renamed from: g, reason: collision with root package name */
    private long f6871g;

    /* renamed from: h, reason: collision with root package name */
    private c1 f6872h;

    /* renamed from: i, reason: collision with root package name */
    private Executor f6873i;

    /* renamed from: j, reason: collision with root package name */
    private c0 f6874j;

    public d(g0 g0Var, h0 h0Var, pd1 pd1Var) {
        this.f6865a = g0Var;
        this.f6866b = h0Var;
        g0Var.g(pd1Var);
        this.f6867c = new n0(new c(this, null), g0Var, h0Var);
        this.f6868d = new ArrayDeque();
        this.f6870f = new xn5().m();
        this.f6871g = -9223372036854775807L;
        this.f6872h = c1.f6206a;
        this.f6873i = nv5.f12938q;
        this.f6874j = lv5.f11834q;
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final boolean A0(long j7, d1 d1Var) {
        this.f6868d.add(d1Var);
        this.f6867c.e(j7);
        this.f6873i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.mv5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                d.this.k();
            }
        });
        return true;
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void B0(c1 c1Var, Executor executor) {
        this.f6872h = c1Var;
        this.f6873i = executor;
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void C0(long j7, long j8) {
        try {
            this.f6867c.b(j7, j8);
        } catch (b45 e8) {
            throw new e1(e8, this.f6870f);
        }
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void D0(c0 c0Var) {
        this.f6874j = c0Var;
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void E0(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void F0(int i7, eq5 eq5Var, long j7, int i8, List list) {
        rx3.h(list.isEmpty());
        int i9 = eq5Var.f7782v;
        eq5 eq5Var2 = this.f6870f;
        if (i9 != eq5Var2.f7782v || eq5Var.f7783w != eq5Var2.f7783w) {
            this.f6867c.c(i9, eq5Var.f7783w);
        }
        float f8 = eq5Var.f7786z;
        if (f8 != this.f6870f.f7786z) {
            this.f6865a.e(f8);
        }
        this.f6870f = eq5Var;
        if (j7 != this.f6871g) {
            this.f6867c.d(i8, j7);
            this.f6871g = j7;
        }
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void G0(Surface surface, z92 z92Var) {
        this.f6869e = surface;
        this.f6865a.d(surface);
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void H0(long j7) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void a() {
        this.f6866b.d();
        this.f6865a.b();
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void b() {
        this.f6866b.d();
        this.f6865a.c();
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final boolean c() {
        return true;
    }

    final /* synthetic */ Surface d() {
        return this.f6869e;
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void e() {
        throw new UnsupportedOperationException();
    }

    final /* synthetic */ c1 f() {
        return this.f6872h;
    }

    final /* synthetic */ Executor g() {
        return this.f6873i;
    }

    final /* synthetic */ c0 h() {
        return this.f6874j;
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final boolean i() {
        return this.f6867c.g();
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void j() {
        this.f6867c.f();
    }

    final /* synthetic */ void k() {
        this.f6872h.a();
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final Surface l() {
        Surface surface = this.f6869e;
        surface.getClass();
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void m() {
        this.f6869e = null;
        this.f6865a.d(null);
    }

    final /* synthetic */ Queue n() {
        return this.f6868d;
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final boolean o0(boolean z7) {
        return this.f6865a.i(z7);
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void r() {
        this.f6865a.h();
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void v0(boolean z7) {
        if (z7) {
            this.f6865a.l();
        }
        this.f6866b.d();
        this.f6867c.a();
        this.f6868d.clear();
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void w0(int i7) {
        this.f6865a.m(i7);
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void x0(boolean z7) {
        this.f6865a.j(z7);
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final boolean y0(eq5 eq5Var) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void z0(float f8) {
        this.f6865a.n(f8);
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void H() {
    }
}
