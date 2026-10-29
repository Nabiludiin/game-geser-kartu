package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class ga implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ la f22177q;

    ga(la laVar) {
        Objects.requireNonNull(laVar);
        this.f22177q = laVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        la laVar = this.f22177q;
        laVar.f22329e = laVar.D();
    }
}
