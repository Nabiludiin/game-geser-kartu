package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class z implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f22914q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ long f22915r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ b2 f22916s;

    z(b2 b2Var, String str, long j7) {
        this.f22914q = str;
        this.f22915r = j7;
        Objects.requireNonNull(b2Var);
        this.f22916s = b2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22916s.m(this.f22914q, this.f22915r);
    }
}
