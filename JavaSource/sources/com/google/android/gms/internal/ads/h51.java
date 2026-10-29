package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class h51 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f9338a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f9339b;

    /* renamed from: c, reason: collision with root package name */
    private final a5.d f9340c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f9341d = true;

    public h51(Executor executor, ScheduledExecutorService scheduledExecutorService, a5.d dVar) {
        this.f9338a = executor;
        this.f9339b = scheduledExecutorService;
        this.f9340c = dVar;
    }

    public final void a(m64 m64Var) {
        p64.r(this.f9340c, new a51(this, m64Var), this.f9338a);
    }

    public final boolean b() {
        return this.f9341d;
    }

    final /* synthetic */ a5.d c(m64 m64Var, a5.d dVar, r41 r41Var) {
        if (r41Var != null) {
            m64Var.b(r41Var);
        }
        return p64.i(dVar, ((Long) k10.f10848a.e()).longValue(), TimeUnit.MILLISECONDS, this.f9339b);
    }

    final /* synthetic */ void d() {
        this.f9341d = false;
    }

    final /* synthetic */ void e(List list, final m64 m64Var) {
        if (list == null || list.isEmpty()) {
            this.f9338a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.g51
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    m64.this.a(new j22(3));
                }
            });
            return;
        }
        a5.d a8 = p64.a(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final a5.d dVar = (a5.d) it.next();
            w54 w54Var = new w54() { // from class: com.google.android.gms.internal.ads.c51
                @Override // com.google.android.gms.internal.ads.w54
                public final /* synthetic */ a5.d d(Object obj) {
                    m64.this.a((Throwable) obj);
                    return p64.a(null);
                }
            };
            Executor executor = this.f9338a;
            a8 = p64.j(p64.h(a8, Throwable.class, w54Var, executor), new w54() { // from class: com.google.android.gms.internal.ads.e51
                @Override // com.google.android.gms.internal.ads.w54
                public final /* synthetic */ a5.d d(Object obj) {
                    return h51.this.c(m64Var, dVar, (r41) obj);
                }
            }, executor);
        }
        p64.r(a8, new b51(this, m64Var), this.f9338a);
    }

    final /* synthetic */ void f() {
        cm0.f6505f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.f51
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                h51.this.d();
            }
        });
    }
}
