package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: MyApplication */
final class n64 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final Future f12598q;

    /* renamed from: r, reason: collision with root package name */
    final m64 f12599r;

    n64(Future future, m64 m64Var) {
        this.f12598q = future;
        this.f12599r = m64Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable a8;
        Future future = this.f12598q;
        if ((future instanceof s74) && (a8 = t74.a((s74) future)) != null) {
            this.f12599r.a(a8);
            return;
        }
        try {
            this.f12599r.b(p64.s(future));
        } catch (ExecutionException e8) {
            this.f12599r.a(e8.getCause());
        } catch (Throwable th) {
            this.f12599r.a(th);
        }
    }

    public final String toString() {
        mx3 b8 = ox3.b(this);
        b8.a(this.f12599r);
        return b8.toString();
    }
}
