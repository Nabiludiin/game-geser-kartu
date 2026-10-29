package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* compiled from: MyApplication */
abstract class f3 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final long f20938q;

    /* renamed from: r, reason: collision with root package name */
    final long f20939r;

    /* renamed from: s, reason: collision with root package name */
    final boolean f20940s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ p3 f20941t;

    f3(p3 p3Var, boolean z7) {
        Objects.requireNonNull(p3Var);
        this.f20941t = p3Var;
        this.f20938q = p3Var.f21224b.a();
        this.f20939r = p3Var.f21224b.b();
        this.f20940s = z7;
    }

    abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f20941t.i()) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e8) {
            this.f20941t.g(e8, false, this.f20940s);
            b();
        }
    }

    protected void b() {
    }
}
