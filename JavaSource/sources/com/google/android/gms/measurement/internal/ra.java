package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
final class ra implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ AtomicReference f22573q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ ae f22574r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ vb f22575s;

    ra(vb vbVar, AtomicReference atomicReference, ae aeVar) {
        this.f22573q = atomicReference;
        this.f22574r = aeVar;
        Objects.requireNonNull(vbVar);
        this.f22575s = vbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        vb vbVar;
        w6 w6Var;
        AtomicReference atomicReference2 = this.f22573q;
        synchronized (atomicReference2) {
            try {
                try {
                    vbVar = this.f22575s;
                    w6Var = vbVar.f22928a;
                } catch (RemoteException e8) {
                    this.f22575s.f22928a.a().o().b("Failed to get app instance id", e8);
                    atomicReference = this.f22573q;
                }
                if (w6Var.x().w().o(t4.v.ANALYTICS_STORAGE)) {
                    t4.d N = vbVar.N();
                    if (N != null) {
                        ae aeVar = this.f22574r;
                        p3.o.m(aeVar);
                        atomicReference2.set(N.o7(aeVar));
                        String str = (String) atomicReference2.get();
                        if (str != null) {
                            vbVar.f22928a.B().E(str);
                            w6Var.x().f22028h.b(str);
                        }
                        vbVar.J();
                        atomicReference = this.f22573q;
                        atomicReference.notify();
                        return;
                    }
                    w6Var.a().o().a("Failed to get app instance id");
                } else {
                    w6Var.a().t().a("Analytics storage consent denied; will not get app instance id");
                    vbVar.f22928a.B().E(null);
                    w6Var.x().f22028h.b(null);
                    atomicReference2.set(null);
                }
                atomicReference2.notify();
            } catch (Throwable th) {
                this.f22573q.notify();
                throw th;
            }
        }
    }
}
