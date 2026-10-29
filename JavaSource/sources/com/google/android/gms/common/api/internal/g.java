package com.google.android.gms.common.api.internal;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
import p3.c;

/* compiled from: MyApplication */
final class g implements c.InterfaceC0119c {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f4459a;

    /* renamed from: b, reason: collision with root package name */
    private final l3.a f4460b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4461c;

    public g(p pVar, l3.a aVar, boolean z7) {
        this.f4459a = new WeakReference(pVar);
        this.f4460b = aVar;
        this.f4461c = z7;
    }

    @Override // p3.c.InterfaceC0119c
    public final void b(k3.b bVar) {
        x xVar;
        Lock lock;
        Lock lock2;
        boolean n7;
        boolean o7;
        p pVar = (p) this.f4459a.get();
        if (pVar == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        xVar = pVar.f4474a;
        p3.o.q(myLooper == xVar.D.i(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        lock = pVar.f4475b;
        lock.lock();
        try {
            n7 = pVar.n(0);
            if (n7) {
                if (!bVar.Q0()) {
                    pVar.l(bVar, this.f4460b, this.f4461c);
                }
                o7 = pVar.o();
                if (o7) {
                    pVar.m();
                }
            }
        } finally {
            lock2 = pVar.f4475b;
            lock2.unlock();
        }
    }
}
