package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;
import l3.f;

/* compiled from: MyApplication */
final class n implements f.b, f.c {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ p f4472q;

    /* synthetic */ n(p pVar, m3.x xVar) {
        this.f4472q = pVar;
    }

    @Override // m3.n
    public final void a(k3.b bVar) {
        Lock lock;
        Lock lock2;
        boolean p7;
        Lock lock3;
        lock = this.f4472q.f4475b;
        lock.lock();
        try {
            p7 = this.f4472q.p(bVar);
            if (p7) {
                this.f4472q.h();
                this.f4472q.m();
            } else {
                this.f4472q.k(bVar);
            }
            lock3 = this.f4472q.f4475b;
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.f4472q.f4475b;
            lock2.unlock();
            throw th;
        }
    }

    @Override // m3.e
    public final void r0(Bundle bundle) {
        p3.d dVar;
        u4.e eVar;
        dVar = this.f4472q.f4491r;
        eVar = this.f4472q.f4484k;
        ((u4.e) p3.o.m(eVar)).n(new m(this.f4472q));
    }

    @Override // m3.e
    public final void O(int i7) {
    }
}
