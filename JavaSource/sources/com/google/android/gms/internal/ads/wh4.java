package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public final class wh4 {

    /* renamed from: b, reason: collision with root package name */
    private static final wh4 f18253b = (wh4) dj4.a(vh4.f17616a);

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f18254a = new AtomicReference(new bj4(new yi4(), null));

    public static wh4 a() {
        return f18253b;
    }

    public final synchronized void b(wg4 wg4Var) {
        AtomicReference atomicReference = this.f18254a;
        yi4 yi4Var = new yi4((bj4) atomicReference.get());
        yi4Var.a(wg4Var);
        atomicReference.set(new bj4(yi4Var, null));
    }

    public final synchronized void c(sg4 sg4Var) {
        AtomicReference atomicReference = this.f18254a;
        yi4 yi4Var = new yi4((bj4) atomicReference.get());
        yi4Var.b(sg4Var);
        atomicReference.set(new bj4(yi4Var, null));
    }

    public final synchronized void d(di4 di4Var) {
        AtomicReference atomicReference = this.f18254a;
        yi4 yi4Var = new yi4((bj4) atomicReference.get());
        yi4Var.c(di4Var);
        atomicReference.set(new bj4(yi4Var, null));
    }

    public final synchronized void e(ai4 ai4Var) {
        AtomicReference atomicReference = this.f18254a;
        yi4 yi4Var = new yi4((bj4) atomicReference.get());
        yi4Var.d(ai4Var);
        atomicReference.set(new bj4(yi4Var, null));
    }

    public final boolean f(xi4 xi4Var) {
        return ((bj4) this.f18254a.get()).a(xi4Var);
    }

    public final b84 g(xi4 xi4Var, w84 w84Var) {
        return ((bj4) this.f18254a.get()).b(xi4Var, w84Var);
    }

    public final xi4 h(b84 b84Var, Class cls, w84 w84Var) {
        return ((bj4) this.f18254a.get()).c(b84Var, cls, w84Var);
    }

    public final boolean i(xi4 xi4Var) {
        return ((bj4) this.f18254a.get()).d(xi4Var);
    }

    public final s84 j(xi4 xi4Var) {
        return ((bj4) this.f18254a.get()).e(xi4Var);
    }

    public final xi4 k(s84 s84Var, Class cls) {
        return ((bj4) this.f18254a.get()).f(s84Var, cls);
    }
}
