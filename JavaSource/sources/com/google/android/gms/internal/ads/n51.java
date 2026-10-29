package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class n51 implements u2.c0 {

    /* renamed from: q, reason: collision with root package name */
    private final eb1 f12573q;

    /* renamed from: r, reason: collision with root package name */
    private final AtomicBoolean f12574r = new AtomicBoolean(false);

    /* renamed from: s, reason: collision with root package name */
    private final AtomicBoolean f12575s = new AtomicBoolean(false);

    public n51(eb1 eb1Var) {
        this.f12573q = eb1Var;
    }

    private final void b() {
        AtomicBoolean atomicBoolean = this.f12575s;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f12573q.a();
    }

    @Override // u2.c0
    public final void H2() {
        b();
    }

    @Override // u2.c0
    public final void V5(int i7) {
        this.f12574r.set(true);
        b();
    }

    public final boolean a() {
        return this.f12574r.get();
    }

    @Override // u2.c0
    public final void g() {
        this.f12573q.d();
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
