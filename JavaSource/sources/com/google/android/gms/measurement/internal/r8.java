package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class r8 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f22567q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f22568r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ Object f22569s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ long f22570t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ w9 f22571u;

    r8(w9 w9Var, String str, String str2, Object obj, long j7) {
        this.f22567q = str;
        this.f22568r = str2;
        this.f22569s = obj;
        this.f22570t = j7;
        Objects.requireNonNull(w9Var);
        this.f22571u = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22571u.B(this.f22567q, this.f22568r, this.f22569s, this.f22570t);
    }
}
