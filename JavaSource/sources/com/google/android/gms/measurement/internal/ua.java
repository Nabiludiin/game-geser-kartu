package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class ua implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ ae f22694q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ vb f22695r;

    ua(vb vbVar, ae aeVar) {
        this.f22694q = aeVar;
        Objects.requireNonNull(vbVar);
        this.f22695r = vbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vb vbVar = this.f22695r;
        t4.d N = vbVar.N();
        if (N == null) {
            vbVar.f22928a.a().r().a("Failed to send app backgrounded");
            return;
        }
        try {
            ae aeVar = this.f22694q;
            p3.o.m(aeVar);
            N.J6(aeVar);
            vbVar.J();
        } catch (RemoteException e8) {
            this.f22695r.f22928a.a().o().b("Failed to send app backgrounded to the service", e8);
        }
    }
}
