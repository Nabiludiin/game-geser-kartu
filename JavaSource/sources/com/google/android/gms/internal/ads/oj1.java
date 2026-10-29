package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class oj1 implements u2.c0, s2.a {

    /* renamed from: q, reason: collision with root package name */
    private final wu1 f13342q;

    /* renamed from: r, reason: collision with root package name */
    private final f03 f13343r;

    /* renamed from: s, reason: collision with root package name */
    private final AtomicBoolean f13344s = new AtomicBoolean(false);

    oj1(wu1 wu1Var, f03 f03Var) {
        this.f13342q = wu1Var;
        this.f13343r = f03Var;
    }

    private final void a() {
        if (this.f13344s.getAndSet(true)) {
            return;
        }
        this.f13342q.d();
    }

    @Override // u2.c0
    public final void H2() {
        a();
    }

    @Override // u2.c0
    public final void V5(int i7) {
        a();
    }

    @Override // s2.a
    public final void c0() {
        this.f13342q.c();
    }

    @Override // u2.c0
    public final void g() {
        this.f13342q.b(this.f13343r.f7926b);
    }

    @Override // u2.c0
    public final void C7() {
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
    public final void t7() {
    }

    @Override // u2.c0
    public final void v3() {
    }
}
