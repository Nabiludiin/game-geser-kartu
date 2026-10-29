package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: MyApplication */
final class u1 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final Future f21753q;

    /* renamed from: r, reason: collision with root package name */
    final t1 f21754r;

    u1(Future future, t1 t1Var) {
        this.f21753q = future;
        this.f21754r = t1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable a8;
        Future future = this.f21753q;
        if ((future instanceof h2) && (a8 = i2.a((h2) future)) != null) {
            this.f21754r.a(a8);
            return;
        }
        try {
            boolean isDone = future.isDone();
            boolean z7 = false;
            Future future2 = future;
            if (!isDone) {
                throw new IllegalStateException(z.a("Future was expected to be done: %s", future));
            }
            while (true) {
                try {
                    obj = future2.get();
                    break;
                } catch (InterruptedException unused) {
                    z7 = true;
                    future2 = future2;
                } catch (Throwable th) {
                    if (z7) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z7) {
                Thread.currentThread().interrupt();
            }
            this.f21754r.b(obj);
        } catch (ExecutionException e8) {
            this.f21754r.a(e8.getCause());
        } catch (Throwable th2) {
            this.f21754r.a(th2);
        }
    }

    public final String toString() {
        s a8 = u.a(this);
        a8.a(this.f21754r);
        return a8.toString();
    }
}
