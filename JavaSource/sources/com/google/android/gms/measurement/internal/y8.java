package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
final class y8 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ AtomicReference f22888q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f22889r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f22890s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ boolean f22891t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ w9 f22892u;

    y8(w9 w9Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z7) {
        this.f22888q = atomicReference;
        this.f22889r = str2;
        this.f22890s = str3;
        this.f22891t = z7;
        Objects.requireNonNull(w9Var);
        this.f22892u = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22892u.f22928a.J().g0(this.f22888q, null, this.f22889r, this.f22890s, this.f22891t);
    }
}
