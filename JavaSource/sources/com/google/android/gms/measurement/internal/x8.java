package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
final class x8 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ AtomicReference f22851q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f22852r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f22853s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ w9 f22854t;

    x8(w9 w9Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f22851q = atomicReference;
        this.f22852r = str2;
        this.f22853s = str3;
        Objects.requireNonNull(w9Var);
        this.f22854t = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22854t.f22928a.J().e0(this.f22851q, null, this.f22852r, this.f22853s);
    }
}
