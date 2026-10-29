package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class bb implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ ae f21902q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ vb f21903r;

    bb(vb vbVar, ae aeVar) {
        this.f21902q = aeVar;
        Objects.requireNonNull(vbVar);
        this.f21903r = vbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vb vbVar = this.f21903r;
        t4.d N = vbVar.N();
        if (N == null) {
            vbVar.f22928a.a().o().a("Failed to send consent settings to service");
            return;
        }
        try {
            ae aeVar = this.f21902q;
            p3.o.m(aeVar);
            N.V7(aeVar);
            vbVar.J();
        } catch (RemoteException e8) {
            this.f21903r.f22928a.a().o().b("Failed to send consent settings to the service", e8);
        }
    }
}
