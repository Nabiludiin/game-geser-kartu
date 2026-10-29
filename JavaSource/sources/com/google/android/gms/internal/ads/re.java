package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class re implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ gf f14877q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ se f14878r;

    re(se seVar, gf gfVar) {
        this.f14877q = gfVar;
        Objects.requireNonNull(seVar);
        this.f14878r = seVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f14878r.b().put(this.f14877q);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
