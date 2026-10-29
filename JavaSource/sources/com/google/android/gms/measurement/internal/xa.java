package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class xa implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ ae f22855q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ boolean f22856r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ e0 f22857s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ Bundle f22858t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ vb f22859u;

    xa(vb vbVar, boolean z7, ae aeVar, boolean z8, e0 e0Var, Bundle bundle) {
        this.f22855q = aeVar;
        this.f22856r = z8;
        this.f22857s = e0Var;
        this.f22858t = bundle;
        Objects.requireNonNull(vbVar);
        this.f22859u = vbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vb vbVar = this.f22859u;
        t4.d N = vbVar.N();
        if (N == null) {
            vbVar.f22928a.a().o().a("Failed to send default event parameters to service");
            return;
        }
        if (vbVar.f22928a.w().H(null, c5.f21941c1)) {
            ae aeVar = this.f22855q;
            p3.o.m(aeVar);
            this.f22859u.b0(N, this.f22856r ? null : this.f22857s, aeVar);
            return;
        }
        try {
            ae aeVar2 = this.f22855q;
            p3.o.m(aeVar2);
            N.u5(this.f22858t, aeVar2);
            vbVar.J();
        } catch (RemoteException e8) {
            this.f22859u.f22928a.a().o().b("Failed to send default event parameters to service", e8);
        }
    }
}
