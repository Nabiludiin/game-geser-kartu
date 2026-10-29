package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import java.util.Objects;

/* compiled from: MyApplication */
final class ib implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ ComponentName f22250q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ pb f22251r;

    ib(pb pbVar, ComponentName componentName) {
        this.f22250q = componentName;
        Objects.requireNonNull(pbVar);
        this.f22251r = pbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22251r.f22485c.K(this.f22250q);
    }
}
