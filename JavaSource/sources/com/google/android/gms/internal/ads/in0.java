package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class in0 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ pn0 f10093q;

    in0(pn0 pn0Var) {
        Objects.requireNonNull(pn0Var);
        this.f10093q = pn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10093q.t("surfaceCreated", new String[0]);
    }
}
