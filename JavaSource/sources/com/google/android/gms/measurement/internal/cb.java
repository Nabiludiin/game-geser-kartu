package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class cb implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ ae f22010q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ boolean f22011r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ g0 f22012s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ vb f22013t;

    cb(vb vbVar, boolean z7, ae aeVar, boolean z8, g0 g0Var, String str) {
        this.f22010q = aeVar;
        this.f22011r = z8;
        this.f22012s = g0Var;
        Objects.requireNonNull(vbVar);
        this.f22013t = vbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vb vbVar = this.f22013t;
        t4.d N = vbVar.N();
        if (N == null) {
            vbVar.f22928a.a().o().a("Discarding data. Failed to send event to service");
            return;
        }
        ae aeVar = this.f22010q;
        p3.o.m(aeVar);
        vbVar.b0(N, this.f22011r ? null : this.f22012s, aeVar);
        vbVar.J();
    }
}
