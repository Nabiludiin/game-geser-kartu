package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* compiled from: MyApplication */
abstract class v {

    /* renamed from: a, reason: collision with root package name */
    private final m3.z f4523a;

    protected v(m3.z zVar) {
        this.f4523a = zVar;
    }

    protected abstract void a();

    public final void b(x xVar) {
        Lock lock;
        Lock lock2;
        m3.z zVar;
        lock = xVar.f4525q;
        lock.lock();
        try {
            zVar = xVar.A;
            if (zVar == this.f4523a) {
                a();
            }
        } finally {
            lock2 = xVar.f4525q;
            lock2.unlock();
        }
    }
}
