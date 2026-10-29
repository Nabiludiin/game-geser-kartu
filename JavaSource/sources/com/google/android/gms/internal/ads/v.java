package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class v implements f1 {

    /* renamed from: a, reason: collision with root package name */
    private w04 f17291a;

    /* renamed from: b, reason: collision with root package name */
    private eq5 f17292b;

    /* renamed from: c, reason: collision with root package name */
    private long f17293c;

    /* renamed from: d, reason: collision with root package name */
    private long f17294d;

    /* renamed from: e, reason: collision with root package name */
    private int f17295e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ b0 f17296f;

    public v(b0 b0Var, Context context, int i7) {
        Objects.requireNonNull(b0Var);
        this.f17296f = b0Var;
        hi2.s(context);
        this.f17291a = w04.m();
        this.f17294d = -9223372036854775807L;
        c1 c1Var = c1.f6206a;
    }

    private static final void d(eq5 eq5Var) {
        w25 c8;
        xn5 a8 = eq5Var.a();
        c8 = b0.c(eq5Var.E);
        a8.c(c8);
        a8.m();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final boolean A0(long j7, d1 d1Var) {
        int i7;
        rx3.h(false);
        long j8 = j7 + this.f17293c;
        b0 b0Var = this.f17296f;
        long b8 = b0Var.y().b(j8);
        if (b8 == -9223372036854775807L || b0Var.x() == -9223372036854775807L || b8 >= b0Var.x() || (i7 = this.f17295e) >= 2) {
            if (b0Var.v()) {
                throw null;
            }
            return false;
        }
        this.f17295e = i7 + 1;
        d1Var.b();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void C0(long j7, long j8) {
        this.f17296f.o(j7 + this.f17293c, j8);
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void D0(c0 c0Var) {
        this.f17296f.s(c0Var);
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void E0(List list) {
        if (this.f17291a.equals(list)) {
            return;
        }
        this.f17291a = w04.u(list);
        eq5 eq5Var = this.f17292b;
        if (eq5Var != null) {
            d(eq5Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void F0(int i7, eq5 eq5Var, long j7, int i8, List list) {
        rx3.h(false);
        this.f17291a = w04.u(list);
        this.f17292b = eq5Var;
        b0 b0Var = this.f17296f;
        b0Var.a(-9223372036854775807L);
        d(eq5Var);
        long j8 = this.f17294d;
        long j9 = -4611686018427387904L;
        if (b0Var.w()) {
            if (j8 != -9223372036854775807L) {
                j9 = j8 + 1;
            }
        } else if (j8 != -9223372036854775807L) {
            return;
        }
        long j10 = j9;
        b0Var.z().a(j10, new a0(j7 + this.f17293c, i8, j10));
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void G0(Surface surface, z92 z92Var) {
        this.f17296f.f(surface, z92Var);
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void H() {
        this.f17296f.j();
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void H0(long j7) {
        this.f17293c = j7;
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void a() {
        b0 b0Var = this.f17296f;
        if (b0Var.w()) {
            b0Var.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void b() {
        b0 b0Var = this.f17296f;
        if (b0Var.w()) {
            b0Var.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final boolean c() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final boolean i() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void j() {
        b0 b0Var = this.f17296f;
        b0Var.a(this.f17294d);
        if (b0Var.B() >= b0Var.C()) {
            b0Var.n();
        }
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final Surface l() {
        rx3.h(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void m() {
        this.f17296f.g();
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final boolean o0(boolean z7) {
        return this.f17296f.m(false);
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void r() {
        b0 b0Var = this.f17296f;
        if (b0Var.z().c() == 0) {
            b0Var.r();
            return;
        }
        de2 de2Var = new de2(10);
        boolean z7 = true;
        while (b0Var.z().c() > 0) {
            a0 a0Var = (a0) b0Var.z().d();
            a0Var.getClass();
            if (z7) {
                int i7 = a0Var.f4625b;
                if (i7 == 0 || i7 == 1) {
                    a0Var = new a0(a0Var.f4624a, 0, a0Var.f4626c);
                } else {
                    b0Var.r();
                }
            }
            de2Var.a(a0Var.f4626c, a0Var);
            z7 = false;
        }
        b0Var.A(de2Var);
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void v0(boolean z7) {
        this.f17294d = -9223372036854775807L;
        this.f17296f.p(z7);
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void w0(int i7) {
        this.f17296f.u(i7);
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void x0(boolean z7) {
        b0 b0Var = this.f17296f;
        if (b0Var.w()) {
            b0Var.q(z7);
        }
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final boolean y0(eq5 eq5Var) {
        return this.f17296f.l(eq5Var, 0);
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void z0(float f8) {
        this.f17296f.t(f8);
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void B0(c1 c1Var, Executor executor) {
    }
}
