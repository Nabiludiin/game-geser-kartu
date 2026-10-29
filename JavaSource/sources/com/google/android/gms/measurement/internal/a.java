package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class a implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f21833q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ long f21834r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ b2 f21835s;

    a(b2 b2Var, String str, long j7) {
        this.f21833q = str;
        this.f21834r = j7;
        Objects.requireNonNull(b2Var);
        this.f21835s = b2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21835s.l(this.f21833q, this.f21834r);
    }
}
