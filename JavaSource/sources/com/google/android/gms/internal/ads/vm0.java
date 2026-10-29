package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class vm0 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ en0 f17671q;

    vm0(en0 en0Var) {
        Objects.requireNonNull(en0Var);
        this.f17671q = en0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        en0 en0Var = this.f17671q;
        if (en0Var.I() != null) {
            en0Var.I().c();
        }
    }
}
