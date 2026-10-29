package com.google.android.gms.internal.ads;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class wu1 {

    /* renamed from: a, reason: collision with root package name */
    private final xf3 f18430a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f18431b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f18432c = new AtomicBoolean(false);

    wu1(xf3 xf3Var) {
        this.f18430a = xf3Var;
    }

    public final void a(cs csVar) {
        this.f18432c.set(true);
        csVar.g(this);
        this.f18430a.a();
    }

    public final void b(String str) {
        if (iy3.c(str) || !this.f18432c.get() || this.f18431b.getAndSet(true)) {
            return;
        }
        this.f18430a.v(str);
    }

    public final void c() {
        if (this.f18431b.get()) {
            this.f18430a.f();
        }
    }

    public final void d() {
        if (this.f18431b.getAndSet(false)) {
            this.f18430a.c();
        }
    }

    public final void e(Activity activity) {
        if (this.f18431b.get()) {
            this.f18430a.h();
        }
    }

    public final void f(Activity activity) {
        if (this.f18431b.get()) {
            this.f18430a.d();
        }
    }

    public final boolean g(Activity activity) {
        if (!this.f18431b.getAndSet(false)) {
            return false;
        }
        this.f18430a.e();
        return false;
    }
}
