package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class zp implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ aq f20263q;

    zp(aq aqVar) {
        Objects.requireNonNull(aqVar);
        this.f20263q = aqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20263q.b();
    }
}
