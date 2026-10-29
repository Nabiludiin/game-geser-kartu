package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class qa implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ ae f22546q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ vb f22547r;

    qa(vb vbVar, ae aeVar) {
        this.f22546q = aeVar;
        Objects.requireNonNull(vbVar);
        this.f22547r = vbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vb vbVar = this.f22547r;
        t4.d N = vbVar.N();
        if (N == null) {
            vbVar.f22928a.a().o().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            ae aeVar = this.f22546q;
            p3.o.m(aeVar);
            N.C2(aeVar);
        } catch (RemoteException e8) {
            this.f22547r.f22928a.a().o().b("Failed to reset data on the service: remote exception", e8);
        }
        this.f22547r.J();
    }
}
