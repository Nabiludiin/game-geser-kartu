package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class po implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ ro f13977q;

    po(ro roVar) {
        Objects.requireNonNull(roVar);
        this.f13977q = roVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13977q.d();
    }
}
