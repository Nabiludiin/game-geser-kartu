package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class dd implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ qd f22068q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ pd f22069r;

    dd(pd pdVar, qd qdVar) {
        this.f22068q = qdVar;
        Objects.requireNonNull(pdVar);
        this.f22069r = pdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pd pdVar = this.f22069r;
        pdVar.u0(this.f22068q);
        pdVar.A0();
    }
}
