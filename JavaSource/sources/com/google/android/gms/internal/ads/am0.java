package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class am0 implements Executor {

    /* renamed from: q, reason: collision with root package name */
    private final Handler f5037q = new v2.o1(Looper.getMainLooper());

    am0() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.f5037q.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            r2.t.g();
            v2.f2.q(r2.t.l().r(), th);
            throw th;
        }
    }
}
