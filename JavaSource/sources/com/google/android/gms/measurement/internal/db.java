package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class db implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ ae f22062q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ boolean f22063r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ i f22064s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ vb f22065t;

    db(vb vbVar, boolean z7, ae aeVar, boolean z8, i iVar, i iVar2) {
        this.f22062q = aeVar;
        this.f22063r = z8;
        this.f22064s = iVar;
        Objects.requireNonNull(vbVar);
        this.f22065t = vbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vb vbVar = this.f22065t;
        t4.d N = vbVar.N();
        if (N == null) {
            vbVar.f22928a.a().o().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        ae aeVar = this.f22062q;
        p3.o.m(aeVar);
        vbVar.b0(N, this.f22063r ? null : this.f22064s, aeVar);
        vbVar.J();
    }
}
