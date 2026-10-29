package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class id2 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f9996a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f9997b;

    /* renamed from: c, reason: collision with root package name */
    private final u41 f9998c;

    /* renamed from: d, reason: collision with root package name */
    private final yd2 f9999d;

    /* renamed from: e, reason: collision with root package name */
    private final t73 f10000e;

    /* renamed from: f, reason: collision with root package name */
    private final j74 f10001f = j74.C();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f10002g = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    private jd2 f10003h;

    /* renamed from: i, reason: collision with root package name */
    private o03 f10004i;

    id2(Executor executor, ScheduledExecutorService scheduledExecutorService, u41 u41Var, yd2 yd2Var, t73 t73Var) {
        this.f9996a = executor;
        this.f9997b = scheduledExecutorService;
        this.f9998c = u41Var;
        this.f9999d = yd2Var;
        this.f10000e = t73Var;
    }

    private final synchronized a5.d d(c03 c03Var) {
        Iterator it = c03Var.f6150a.iterator();
        while (it.hasNext()) {
            ka2 m02 = this.f9998c.m0(c03Var.f6152b, (String) it.next());
            if (m02 != null && m02.a(this.f10004i, c03Var)) {
                return p64.i(m02.b(this.f10004i, c03Var), c03Var.R, TimeUnit.MILLISECONDS, this.f9997b);
            }
        }
        return p64.c(new j22(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void b(c03 c03Var) {
        a5.d d8 = d(c03Var);
        this.f9999d.e(this.f10004i, c03Var, d8, this.f10000e);
        p64.r(d8, new hd2(this, c03Var), this.f9996a);
    }

    public final synchronized a5.d a(o03 o03Var) {
        try {
            if (!this.f10002g.getAndSet(true)) {
                List list = o03Var.f13137b.f12529a;
                if (list.isEmpty()) {
                    this.f10001f.m(new ce2(3, ge2.a(o03Var)));
                } else {
                    this.f10004i = o03Var;
                    yd2 yd2Var = this.f9999d;
                    this.f10003h = new jd2(o03Var, yd2Var, this.f10001f);
                    yd2Var.c(list);
                    c03 a8 = this.f10003h.a();
                    while (a8 != null) {
                        b(a8);
                        a8 = this.f10003h.a();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f10001f;
    }

    final /* synthetic */ jd2 c() {
        return this.f10003h;
    }
}
