package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class an0 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ en0 f5058q;

    an0(en0 en0Var) {
        Objects.requireNonNull(en0Var);
        this.f5058q = en0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        en0 en0Var = this.f5058q;
        if (en0Var.I() != null) {
            if (!en0Var.J()) {
                en0Var.I().l();
                en0Var.K(true);
            }
            en0Var.I().d();
        }
    }
}
