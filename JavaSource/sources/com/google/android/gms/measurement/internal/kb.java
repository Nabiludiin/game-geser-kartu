package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class kb implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ t4.d f22302q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ pb f22303r;

    kb(pb pbVar, t4.d dVar) {
        this.f22302q = dVar;
        Objects.requireNonNull(pbVar);
        this.f22303r = pbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pb pbVar = this.f22303r;
        synchronized (pbVar) {
            try {
                pbVar.e(false);
                vb vbVar = pbVar.f22485c;
                if (!vbVar.W()) {
                    vbVar.f22928a.a().v().a("Connected to remote service");
                    vbVar.z(this.f22302q);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        vb vbVar2 = this.f22303r.f22485c;
        if (vbVar2.P() != null) {
            vbVar2.P().shutdownNow();
            vbVar2.Q(null);
        }
    }
}
