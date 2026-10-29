package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class c93 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ e93 f6328q;

    c93(e93 e93Var) {
        Objects.requireNonNull(e93Var);
        this.f6328q = e93Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6328q.P();
    }
}
