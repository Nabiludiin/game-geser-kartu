package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class z83 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ s2.y2 f20067q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ e93 f20068r;

    z83(e93 e93Var, s2.y2 y2Var) {
        this.f20067q = y2Var;
        Objects.requireNonNull(e93Var);
        this.f20068r = e93Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20068r.O(this.f20067q);
    }
}
