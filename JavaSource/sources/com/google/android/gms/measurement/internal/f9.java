package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class f9 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Boolean f22140q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ w9 f22141r;

    f9(w9 w9Var, Boolean bool) {
        this.f22140q = bool;
        Objects.requireNonNull(w9Var);
        this.f22141r = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22141r.W(this.f22140q, true);
    }
}
