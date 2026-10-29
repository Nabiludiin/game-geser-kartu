package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class kn0 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ pn0 f11128q;

    kn0(pn0 pn0Var) {
        Objects.requireNonNull(pn0Var);
        this.f11128q = pn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11128q.t("surfaceDestroyed", new String[0]);
    }
}
