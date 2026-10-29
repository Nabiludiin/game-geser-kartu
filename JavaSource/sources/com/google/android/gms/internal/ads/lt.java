package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class lt implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ qt f11789q;

    lt(qt qtVar) {
        Objects.requireNonNull(qtVar);
        this.f11789q = qtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11789q.g();
    }
}
