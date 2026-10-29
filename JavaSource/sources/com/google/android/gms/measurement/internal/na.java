package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
final class na extends t4.f {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ AtomicReference f22411q;

    na(vb vbVar, AtomicReference atomicReference) {
        this.f22411q = atomicReference;
        Objects.requireNonNull(vbVar);
    }

    @Override // t4.g
    public final void W0(List list) {
        AtomicReference atomicReference = this.f22411q;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
