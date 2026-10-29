package c7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x6.h2;
import x6.r0;
import x6.x0;

/* compiled from: MyApplication */
public final class j extends r0 implements i6.e, g6.e {

    /* renamed from: x, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3784x = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: t, reason: collision with root package name */
    public final x6.d0 f3785t;

    /* renamed from: u, reason: collision with root package name */
    public final g6.e f3786u;

    /* renamed from: v, reason: collision with root package name */
    public Object f3787v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f3788w;

    public j(x6.d0 d0Var, g6.e eVar) {
        super(-1);
        f0 f0Var;
        this.f3785t = d0Var;
        this.f3786u = eVar;
        f0Var = k.f3796a;
        this.f3787v = f0Var;
        this.f3788w = j0.b(getContext());
    }

    private final x6.k m() {
        Object obj = f3784x.get(this);
        if (obj instanceof x6.k) {
            return (x6.k) obj;
        }
        return null;
    }

    @Override // x6.r0
    public void b(Object obj, Throwable th) {
        if (obj instanceof x6.y) {
            ((x6.y) obj).f27461b.g(th);
        }
    }

    @Override // i6.e
    public i6.e d() {
        g6.e eVar = this.f3786u;
        if (eVar instanceof i6.e) {
            return (i6.e) eVar;
        }
        return null;
    }

    @Override // g6.e
    public g6.i getContext() {
        return this.f3786u.getContext();
    }

    @Override // g6.e
    public void h(Object obj) {
        g6.i context = this.f3786u.getContext();
        Object d8 = x6.b0.d(obj, null, 1, null);
        if (this.f3785t.I(context)) {
            this.f3787v = d8;
            this.f27420s = 0;
            this.f3785t.h(context, this);
            return;
        }
        x0 a8 = h2.f27384a.a();
        if (a8.U()) {
            this.f3787v = d8;
            this.f27420s = 0;
            a8.P(this);
            return;
        }
        a8.S(true);
        try {
            g6.i context2 = getContext();
            Object c8 = j0.c(context2, this.f3788w);
            try {
                this.f3786u.h(obj);
                e6.s sVar = e6.s.f23253a;
                while (a8.a0()) {
                }
            } finally {
                j0.a(context2, c8);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // x6.r0
    public Object j() {
        f0 f0Var;
        Object obj = this.f3787v;
        f0Var = k.f3796a;
        this.f3787v = f0Var;
        return obj;
    }

    public final void k() {
        while (f3784x.get(this) == k.f3797b) {
        }
    }

    public final x6.k l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3784x;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f3784x.set(this, k.f3797b);
                return null;
            }
            if (obj instanceof x6.k) {
                if (androidx.concurrent.futures.b.a(f3784x, this, obj, k.f3797b)) {
                    return (x6.k) obj;
                }
            } else if (obj != k.f3797b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final boolean o() {
        return f3784x.get(this) != null;
    }

    public final boolean p(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3784x;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            f0 f0Var = k.f3797b;
            if (q6.i.a(obj, f0Var)) {
                if (androidx.concurrent.futures.b.a(f3784x, this, f0Var, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.b.a(f3784x, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void q() {
        k();
        x6.k m7 = m();
        if (m7 != null) {
            m7.q();
        }
    }

    public final Throwable r(x6.j jVar) {
        f0 f0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3784x;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            f0Var = k.f3797b;
            if (obj != f0Var) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.b.a(f3784x, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f3784x, this, f0Var, jVar));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f3785t + ", " + x6.k0.c(this.f3786u) + ']';
    }

    @Override // x6.r0
    public g6.e c() {
        return this;
    }
}
