package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class hb implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ t4.d f22206q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ pb f22207r;

    hb(pb pbVar, t4.d dVar) {
        this.f22206q = dVar;
        Objects.requireNonNull(pbVar);
        this.f22207r = pbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pb pbVar = this.f22207r;
        synchronized (pbVar) {
            try {
                pbVar.e(false);
                vb vbVar = pbVar.f22485c;
                if (!vbVar.W()) {
                    vbVar.f22928a.a().w().a("Connected to service");
                    vbVar.z(this.f22206q);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
