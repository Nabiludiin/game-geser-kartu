package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
final class m8 implements a2 {

    /* renamed from: q, reason: collision with root package name */
    final WeakReference f21691q;

    /* renamed from: r, reason: collision with root package name */
    private final h8 f21692r = new l8(this);

    m8(i8 i8Var) {
        this.f21691q = new WeakReference(i8Var);
    }

    final boolean a(Object obj) {
        return this.f21692r.d(obj);
    }

    final boolean b(Throwable th) {
        p4 p4Var = new p4(th);
        b2 b2Var = h8.f21556v;
        h8 h8Var = this.f21692r;
        if (!b2Var.d(h8Var, null, p4Var)) {
            return false;
        }
        h8.b(h8Var);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        i8 i8Var = (i8) this.f21691q.get();
        boolean cancel = this.f21692r.cancel(z7);
        if (!cancel || i8Var == null) {
            return cancel;
        }
        i8Var.a();
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f21692r.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f21692r.f21558q instanceof a3;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f21692r.isDone();
    }

    @Override // com.google.android.gms.internal.play_billing.a2
    public final void j(Runnable runnable, Executor executor) {
        this.f21692r.j(runnable, executor);
    }

    public final String toString() {
        return this.f21692r.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) {
        return this.f21692r.get(j7, timeUnit);
    }
}
