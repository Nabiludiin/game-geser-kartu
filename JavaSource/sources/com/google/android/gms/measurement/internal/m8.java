package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class m8 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ w9 f22364q;

    m8(w9 w9Var) {
        Objects.requireNonNull(w9Var);
        this.f22364q = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22364q.f22812r.a();
    }
}
