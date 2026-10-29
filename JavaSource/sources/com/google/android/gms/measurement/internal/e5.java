package com.google.android.gms.measurement.internal;

/* compiled from: MyApplication */
abstract class e5 extends d4 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f22081b;

    e5(w6 w6Var) {
        super(w6Var);
        this.f22928a.k();
    }

    final boolean i() {
        return this.f22081b;
    }

    protected final void j() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void k() {
        if (this.f22081b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (m()) {
            return;
        }
        this.f22928a.l();
        this.f22081b = true;
    }

    public final void l() {
        if (this.f22081b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        n();
        this.f22928a.l();
        this.f22081b = true;
    }

    protected abstract boolean m();

    protected void n() {
    }
}
