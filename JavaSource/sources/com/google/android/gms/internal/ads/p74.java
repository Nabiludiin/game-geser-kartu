package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: MyApplication */
final class p74 extends f64 implements RunnableFuture {

    /* renamed from: x, reason: collision with root package name */
    private volatile w64 f13691x;

    p74(v54 v54Var) {
        this.f13691x = new n74(this, v54Var);
    }

    static p74 D(Runnable runnable, Object obj) {
        return new p74(Executors.callable(runnable, obj));
    }

    @Override // com.google.android.gms.internal.ads.b54
    protected final void n() {
        w64 w64Var;
        if (u() && (w64Var = this.f13691x) != null) {
            w64Var.g();
        }
        this.f13691x = null;
    }

    @Override // com.google.android.gms.internal.ads.b54
    protected final String o() {
        w64 w64Var = this.f13691x;
        if (w64Var == null) {
            return super.o();
        }
        String obj = w64Var.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 7);
        sb.append("task=[");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        w64 w64Var = this.f13691x;
        if (w64Var != null) {
            w64Var.run();
        }
        this.f13691x = null;
    }

    p74(Callable callable) {
        this.f13691x = new o74(this, callable);
    }
}
