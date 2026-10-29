package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* compiled from: MyApplication */
abstract class o implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ p f4473q;

    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        Lock lock2;
        x xVar;
        lock = this.f4473q.f4475b;
        lock.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    a();
                }
            } catch (RuntimeException e8) {
                xVar = this.f4473q.f4474a;
                xVar.l(e8);
            }
        } finally {
            lock2 = this.f4473q.f4475b;
            lock2.unlock();
        }
    }
}
