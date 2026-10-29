package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class ta implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ ae f22661q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ vb f22662r;

    ta(vb vbVar, ae aeVar, boolean z7) {
        this.f22661q = aeVar;
        Objects.requireNonNull(vbVar);
        this.f22662r = vbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vb vbVar = this.f22662r;
        t4.d N = vbVar.N();
        if (N == null) {
            vbVar.f22928a.a().o().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            ae aeVar = this.f22661q;
            p3.o.m(aeVar);
            w6 w6Var = vbVar.f22928a;
            m w7 = w6Var.w();
            b5 b5Var = c5.f21941c1;
            if (w7.H(null, b5Var)) {
                vbVar.b0(N, null, aeVar);
            }
            N.l6(aeVar);
            vbVar.f22928a.E().v();
            w6Var.w().H(null, b5Var);
            vbVar.b0(N, null, aeVar);
            vbVar.J();
        } catch (RemoteException e8) {
            this.f22662r.f22928a.a().o().b("Failed to send app launch to the service", e8);
        }
    }
}
