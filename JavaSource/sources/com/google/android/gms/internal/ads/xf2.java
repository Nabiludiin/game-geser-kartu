package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class xf2 implements r2.g {

    /* renamed from: a, reason: collision with root package name */
    private final u91 f18796a;

    /* renamed from: b, reason: collision with root package name */
    private final pa1 f18797b;

    /* renamed from: c, reason: collision with root package name */
    private final ri1 f18798c;

    /* renamed from: d, reason: collision with root package name */
    private final ji1 f18799d;

    /* renamed from: e, reason: collision with root package name */
    private final b11 f18800e;

    /* renamed from: f, reason: collision with root package name */
    final AtomicBoolean f18801f = new AtomicBoolean(false);

    xf2(u91 u91Var, pa1 pa1Var, ri1 ri1Var, ji1 ji1Var, b11 b11Var) {
        this.f18796a = u91Var;
        this.f18797b = pa1Var;
        this.f18798c = ri1Var;
        this.f18799d = ji1Var;
        this.f18800e = b11Var;
    }

    @Override // r2.g
    public final synchronized void a(View view) {
        if (this.f18801f.compareAndSet(false, true)) {
            this.f18800e.E();
            this.f18799d.U0(view);
        }
    }

    @Override // r2.g
    public final void b() {
        if (this.f18801f.get()) {
            this.f18796a.c0();
        }
    }

    @Override // r2.g
    public final void d() {
        if (this.f18801f.get()) {
            this.f18797b.a();
            this.f18798c.a();
        }
    }
}
