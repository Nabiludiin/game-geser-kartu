package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
final class ob implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ k3.b f22444q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ pb f22445r;

    ob(pb pbVar, k3.b bVar) {
        this.f22444q = bVar;
        Objects.requireNonNull(pbVar);
        this.f22445r = pbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vb vbVar = this.f22445r.f22485c;
        vbVar.O(null);
        if (this.f22444q.M0() != 7777) {
            vbVar.L();
            return;
        }
        if (vbVar.P() == null) {
            vbVar.Q(Executors.newScheduledThreadPool(1));
        }
        vbVar.P().schedule(new Runnable() { // from class: com.google.android.gms.measurement.internal.mb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                final vb vbVar2 = ob.this.f22445r.f22485c;
                vbVar2.f22928a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.nb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        vb.this.w();
                    }
                });
            }
        }, ((Long) c5.f21934a0.b(null)).longValue(), TimeUnit.MILLISECONDS);
    }
}
