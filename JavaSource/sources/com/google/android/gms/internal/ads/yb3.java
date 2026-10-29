package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class yb3 {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue f19464a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f19465b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f19466c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private xb3 f19467d = null;

    public yb3() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f19464a = linkedBlockingQueue;
        this.f19465b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void c() {
        xb3 xb3Var = (xb3) this.f19466c.poll();
        this.f19467d = xb3Var;
        if (xb3Var != null) {
            xb3Var.executeOnExecutor(this.f19465b, new Object[0]);
        }
    }

    public final void a(xb3 xb3Var) {
        xb3Var.b(this);
        this.f19466c.add(xb3Var);
        if (this.f19467d == null) {
            c();
        }
    }

    public final void b(xb3 xb3Var) {
        this.f19467d = null;
        c();
    }
}
