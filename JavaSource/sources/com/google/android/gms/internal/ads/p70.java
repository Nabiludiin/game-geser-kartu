package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class p70 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ s70 f13684q;

    p70(s70 s70Var) {
        Objects.requireNonNull(s70Var);
        this.f13684q = s70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13684q.b();
    }
}
