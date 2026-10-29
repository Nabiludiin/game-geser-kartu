package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class v15 implements ob5 {

    /* renamed from: q, reason: collision with root package name */
    private final bd5 f17356q;

    /* renamed from: r, reason: collision with root package name */
    private final w05 f17357r;

    /* renamed from: s, reason: collision with root package name */
    private pc5 f17358s;

    /* renamed from: t, reason: collision with root package name */
    private ob5 f17359t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f17360u = true;

    /* renamed from: v, reason: collision with root package name */
    private boolean f17361v;

    public v15(w05 w05Var, pd1 pd1Var) {
        this.f17357r = w05Var;
        this.f17356q = new bd5(pd1Var);
    }

    public final void a() {
        this.f17361v = true;
        this.f17356q.a();
    }

    public final void b() {
        this.f17361v = false;
        this.f17356q.b();
    }

    public final void c(long j7) {
        this.f17356q.c(j7);
    }

    public final void d(pc5 pc5Var) {
        ob5 ob5Var;
        ob5 h8 = pc5Var.h();
        if (h8 == null || h8 == (ob5Var = this.f17359t)) {
            return;
        }
        if (ob5Var != null) {
            throw b45.c(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f17359t = h8;
        this.f17358s = pc5Var;
        h8.v(this.f17356q.i());
    }

    public final void e(pc5 pc5Var) {
        if (pc5Var == this.f17358s) {
            this.f17359t = null;
            this.f17358s = null;
            this.f17360u = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.ob5
    public final long f() {
        if (this.f17360u) {
            return this.f17356q.f();
        }
        ob5 ob5Var = this.f17359t;
        ob5Var.getClass();
        return ob5Var.f();
    }

    @Override // com.google.android.gms.internal.ads.ob5
    public final boolean g() {
        if (this.f17360u) {
            return false;
        }
        ob5 ob5Var = this.f17359t;
        ob5Var.getClass();
        return ob5Var.g();
    }

    public final long h(boolean z7) {
        pc5 pc5Var = this.f17358s;
        if (pc5Var == null || pc5Var.n0() || ((z7 && this.f17358s.c() != 2) || (!this.f17358s.m0() && (z7 || this.f17358s.C())))) {
            this.f17360u = true;
            if (this.f17361v) {
                this.f17356q.a();
            }
        } else {
            ob5 ob5Var = this.f17359t;
            ob5Var.getClass();
            long f8 = ob5Var.f();
            if (this.f17360u) {
                bd5 bd5Var = this.f17356q;
                if (f8 < bd5Var.f()) {
                    bd5Var.b();
                } else {
                    this.f17360u = false;
                    if (this.f17361v) {
                        bd5Var.a();
                    }
                }
            }
            bd5 bd5Var2 = this.f17356q;
            bd5Var2.c(f8);
            yk i7 = ob5Var.i();
            if (!i7.equals(bd5Var2.i())) {
                bd5Var2.v(i7);
                this.f17357r.d(i7);
            }
        }
        return f();
    }

    @Override // com.google.android.gms.internal.ads.ob5
    public final yk i() {
        ob5 ob5Var = this.f17359t;
        return ob5Var != null ? ob5Var.i() : this.f17356q.i();
    }

    @Override // com.google.android.gms.internal.ads.ob5
    public final void v(yk ykVar) {
        ob5 ob5Var = this.f17359t;
        if (ob5Var != null) {
            ob5Var.v(ykVar);
            ykVar = this.f17359t.i();
        }
        this.f17356q.v(ykVar);
    }
}
