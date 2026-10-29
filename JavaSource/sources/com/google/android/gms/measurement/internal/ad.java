package com.google.android.gms.measurement.internal;

/* compiled from: MyApplication */
abstract class ad extends vc {

    /* renamed from: c, reason: collision with root package name */
    private boolean f21860c;

    ad(pd pdVar) {
        super(pdVar);
        this.f22755b.e0();
    }

    final boolean i() {
        return this.f21860c;
    }

    protected final void j() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void k() {
        if (this.f21860c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        l();
        this.f22755b.f0();
        this.f21860c = true;
    }

    protected abstract boolean l();
}
