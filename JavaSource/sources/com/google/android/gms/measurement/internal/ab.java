package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class ab implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ ae f21856q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ vb f21857r;

    ab(vb vbVar, ae aeVar) {
        this.f21856q = aeVar;
        Objects.requireNonNull(vbVar);
        this.f21857r = vbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vb vbVar = this.f21857r;
        t4.d N = vbVar.N();
        if (N == null) {
            vbVar.f22928a.a().o().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            ae aeVar = this.f21856q;
            p3.o.m(aeVar);
            N.s4(aeVar);
            vbVar.J();
        } catch (RemoteException e8) {
            this.f21857r.f22928a.a().o().b("Failed to send measurementEnabled to the service", e8);
        }
    }
}
