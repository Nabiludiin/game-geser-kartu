package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import l3.g;
import l3.j;
import m3.n1;

/* compiled from: MyApplication */
public abstract class BasePendingResult<R extends l3.j> extends l3.g {

    /* renamed from: n, reason: collision with root package name */
    static final ThreadLocal f4425n = new a0();

    /* renamed from: b, reason: collision with root package name */
    protected final a f4427b;

    /* renamed from: c, reason: collision with root package name */
    protected final WeakReference f4428c;

    /* renamed from: f, reason: collision with root package name */
    private l3.k f4431f;

    /* renamed from: h, reason: collision with root package name */
    private l3.j f4433h;

    /* renamed from: i, reason: collision with root package name */
    private Status f4434i;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f4435j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f4436k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f4437l;
    private b0 resultGuardian;

    /* renamed from: a, reason: collision with root package name */
    private final Object f4426a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final CountDownLatch f4429d = new CountDownLatch(1);

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f4430e = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f4432g = new AtomicReference();

    /* renamed from: m, reason: collision with root package name */
    private boolean f4438m = false;

    /* compiled from: MyApplication */
    public static class a extends n4.l {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(l3.k kVar, l3.j jVar) {
            ThreadLocal threadLocal = BasePendingResult.f4425n;
            sendMessage(obtainMessage(1, new Pair((l3.k) p3.o.m(kVar), jVar)));
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i7 = message.what;
            if (i7 != 1) {
                if (i7 == 2) {
                    ((BasePendingResult) message.obj).g(Status.f4419y);
                    return;
                }
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i7, new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            l3.k kVar = (l3.k) pair.first;
            l3.j jVar = (l3.j) pair.second;
            try {
                kVar.a(jVar);
            } catch (RuntimeException e8) {
                BasePendingResult.o(jVar);
                throw e8;
            }
        }
    }

    protected BasePendingResult(l3.f fVar) {
        this.f4427b = new a(fVar != null ? fVar.i() : Looper.getMainLooper());
        this.f4428c = new WeakReference(fVar);
    }

    private final l3.j k() {
        l3.j jVar;
        synchronized (this.f4426a) {
            p3.o.q(!this.f4435j, "Result has already been consumed.");
            p3.o.q(i(), "Result is not ready.");
            jVar = this.f4433h;
            this.f4433h = null;
            this.f4431f = null;
            this.f4435j = true;
        }
        y yVar = (y) this.f4432g.getAndSet(null);
        if (yVar != null) {
            yVar.f4535a.f4537a.remove(this);
        }
        return (l3.j) p3.o.m(jVar);
    }

    private final void l(l3.j jVar) {
        this.f4433h = jVar;
        this.f4434i = jVar.x0();
        this.f4429d.countDown();
        n1 n1Var = null;
        if (this.f4436k) {
            this.f4431f = null;
        } else {
            l3.k kVar = this.f4431f;
            if (kVar != null) {
                this.f4427b.removeMessages(2);
                this.f4427b.a(kVar, k());
            } else if (this.f4433h instanceof l3.h) {
                this.resultGuardian = new b0(this, n1Var);
            }
        }
        ArrayList arrayList = this.f4430e;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((g.a) arrayList.get(i7)).a(this.f4434i);
        }
        this.f4430e.clear();
    }

    public static void o(l3.j jVar) {
        if (jVar instanceof l3.h) {
            try {
                ((l3.h) jVar).a();
            } catch (RuntimeException e8) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(jVar)), e8);
            }
        }
    }

    @Override // l3.g
    public final void c(g.a aVar) {
        p3.o.b(aVar != null, "Callback cannot be null.");
        synchronized (this.f4426a) {
            try {
                if (i()) {
                    aVar.a(this.f4434i);
                } else {
                    this.f4430e.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // l3.g
    public final void d(l3.k kVar) {
        synchronized (this.f4426a) {
            try {
                if (kVar == null) {
                    this.f4431f = null;
                    return;
                }
                p3.o.q(!this.f4435j, "Result has already been consumed.");
                p3.o.q(true, "Cannot set callbacks if then() has been called.");
                if (h()) {
                    return;
                }
                if (i()) {
                    this.f4427b.a(kVar, k());
                } else {
                    this.f4431f = kVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.f4426a) {
            try {
                if (!this.f4436k && !this.f4435j) {
                    o(this.f4433h);
                    this.f4436k = true;
                    l(f(Status.f4420z));
                }
            } finally {
            }
        }
    }

    protected abstract l3.j f(Status status);

    public final void g(Status status) {
        synchronized (this.f4426a) {
            try {
                if (!i()) {
                    j(f(status));
                    this.f4437l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h() {
        boolean z7;
        synchronized (this.f4426a) {
            z7 = this.f4436k;
        }
        return z7;
    }

    public final boolean i() {
        return this.f4429d.getCount() == 0;
    }

    public final void j(l3.j jVar) {
        synchronized (this.f4426a) {
            try {
                if (this.f4437l || this.f4436k) {
                    o(jVar);
                    return;
                }
                i();
                p3.o.q(!i(), "Results have already been set");
                p3.o.q(!this.f4435j, "Result has already been consumed");
                l(jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        boolean z7 = true;
        if (!this.f4438m && !((Boolean) f4425n.get()).booleanValue()) {
            z7 = false;
        }
        this.f4438m = z7;
    }

    public final boolean p() {
        boolean h8;
        synchronized (this.f4426a) {
            try {
                if (((l3.f) this.f4428c.get()) != null) {
                    if (!this.f4438m) {
                    }
                    h8 = h();
                }
                e();
                h8 = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        return h8;
    }

    public final void q(y yVar) {
        this.f4432g.set(yVar);
    }
}
