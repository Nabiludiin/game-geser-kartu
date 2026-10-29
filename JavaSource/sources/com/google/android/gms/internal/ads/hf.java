package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
public final class hf {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f9479a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f9480b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue f9481c;

    /* renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue f9482d;

    /* renamed from: e, reason: collision with root package name */
    private final qe f9483e;

    /* renamed from: f, reason: collision with root package name */
    private final ze f9484f;

    /* renamed from: g, reason: collision with root package name */
    private final af[] f9485g;

    /* renamed from: h, reason: collision with root package name */
    private se f9486h;

    /* renamed from: i, reason: collision with root package name */
    private final List f9487i;

    /* renamed from: j, reason: collision with root package name */
    private final List f9488j;

    /* renamed from: k, reason: collision with root package name */
    private final xe f9489k;

    public hf(qe qeVar, ze zeVar, int i7) {
        xe xeVar = new xe(new Handler(Looper.getMainLooper()));
        this.f9479a = new AtomicInteger();
        this.f9480b = new HashSet();
        this.f9481c = new PriorityBlockingQueue();
        this.f9482d = new PriorityBlockingQueue();
        this.f9487i = new ArrayList();
        this.f9488j = new ArrayList();
        this.f9483e = qeVar;
        this.f9484f = zeVar;
        this.f9485g = new af[4];
        this.f9489k = xeVar;
    }

    public final void a() {
        se seVar = this.f9486h;
        if (seVar != null) {
            seVar.a();
        }
        af[] afVarArr = this.f9485g;
        for (int i7 = 0; i7 < 4; i7++) {
            af afVar = afVarArr[i7];
            if (afVar != null) {
                afVar.a();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = this.f9481c;
        PriorityBlockingQueue priorityBlockingQueue2 = this.f9482d;
        qe qeVar = this.f9483e;
        xe xeVar = this.f9489k;
        se seVar2 = new se(priorityBlockingQueue, priorityBlockingQueue2, qeVar, xeVar);
        this.f9486h = seVar2;
        seVar2.start();
        for (int i8 = 0; i8 < 4; i8++) {
            af afVar2 = new af(priorityBlockingQueue2, this.f9484f, qeVar, xeVar);
            afVarArr[i8] = afVar2;
            afVar2.start();
        }
    }

    public final gf b(gf gfVar) {
        gfVar.l(this);
        Set set = this.f9480b;
        synchronized (set) {
            set.add(gfVar);
        }
        gfVar.m(this.f9479a.incrementAndGet());
        gfVar.d("add-to-queue");
        d(gfVar, 0);
        this.f9481c.add(gfVar);
        return gfVar;
    }

    final void c(gf gfVar) {
        Set set = this.f9480b;
        synchronized (set) {
            set.remove(gfVar);
        }
        List list = this.f9487i;
        synchronized (list) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        d(gfVar, 5);
    }

    final void d(gf gfVar, int i7) {
        List list = this.f9488j;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
