package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class pa implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ ae f22479q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ boolean f22480r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ ud f22481s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ vb f22482t;

    pa(vb vbVar, ae aeVar, boolean z7, ud udVar) {
        this.f22479q = aeVar;
        this.f22480r = z7;
        this.f22481s = udVar;
        Objects.requireNonNull(vbVar);
        this.f22482t = vbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vb vbVar = this.f22482t;
        t4.d N = vbVar.N();
        if (N == null) {
            vbVar.f22928a.a().o().a("Discarding data. Failed to set user property");
            return;
        }
        ae aeVar = this.f22479q;
        p3.o.m(aeVar);
        vbVar.b0(N, this.f22480r ? null : this.f22481s, aeVar);
        vbVar.J();
    }
}
