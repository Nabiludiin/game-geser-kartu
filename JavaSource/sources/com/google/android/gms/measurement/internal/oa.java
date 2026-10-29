package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
final class oa extends t4.i {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ AtomicReference f22442q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ vb f22443r;

    oa(vb vbVar, AtomicReference atomicReference) {
        this.f22442q = atomicReference;
        Objects.requireNonNull(vbVar);
        this.f22443r = vbVar;
    }

    @Override // t4.j
    public final void s6(yc ycVar) {
        AtomicReference atomicReference = this.f22442q;
        synchronized (atomicReference) {
            this.f22443r.f22928a.a().w().b("[sgtm] Got upload batches from service. count", Integer.valueOf(ycVar.f22904q.size()));
            atomicReference.set(ycVar);
            atomicReference.notifyAll();
        }
    }
}
