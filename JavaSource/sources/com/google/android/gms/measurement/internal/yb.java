package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class yb implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ pd f22902q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ Runnable f22903r;

    yb(cc ccVar, pd pdVar, Runnable runnable) {
        this.f22902q = pdVar;
        this.f22903r = runnable;
        Objects.requireNonNull(ccVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        pd pdVar = this.f22902q;
        pdVar.E();
        pdVar.D(this.f22903r);
        pdVar.r();
    }
}
