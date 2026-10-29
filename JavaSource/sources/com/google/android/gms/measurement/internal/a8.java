package com.google.android.gms.measurement.internal;

/* compiled from: MyApplication */
abstract class a8 extends z7 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f21854b;

    a8(w6 w6Var) {
        super(w6Var);
        this.f22928a.k();
    }

    protected abstract boolean i();

    final boolean k() {
        return this.f21854b;
    }

    protected final void l() {
        if (!k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void m() {
        if (this.f21854b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (i()) {
            return;
        }
        this.f22928a.l();
        this.f21854b = true;
    }

    public final void n() {
        if (this.f21854b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        j();
        this.f22928a.l();
        this.f21854b = true;
    }

    protected void j() {
    }
}
