package x6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x6.m1;

/* compiled from: MyApplication */
public class k extends r0 implements j, i6.e, l2 {

    /* renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f27397v = AtomicIntegerFieldUpdater.newUpdater(k.class, "_decisionAndIndex$volatile");

    /* renamed from: w, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27398w = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_state$volatile");

    /* renamed from: x, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27399x = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: t, reason: collision with root package name */
    private final g6.e f27400t;

    /* renamed from: u, reason: collision with root package name */
    private final g6.i f27401u;

    public k(g6.e eVar, int i7) {
        super(i7);
        this.f27400t = eVar;
        this.f27401u = eVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = d.f27374q;
    }

    private final String A() {
        Object z7 = z();
        return z7 instanceof a2 ? "Active" : z7 instanceof n ? "Cancelled" : "Completed";
    }

    private final u0 F() {
        m1 m1Var = (m1) getContext().e(m1.f27411p);
        if (m1Var == null) {
            return null;
        }
        u0 c8 = m1.a.c(m1Var, true, false, new o(this), 2, null);
        androidx.concurrent.futures.b.a(f27399x, this, null, c8);
        return c8;
    }

    private final void G(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27398w;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof d)) {
                if (obj2 instanceof h ? true : obj2 instanceof c7.c0) {
                    K(obj, obj2);
                } else {
                    if (obj2 instanceof x) {
                        x xVar = (x) obj2;
                        if (!xVar.c()) {
                            K(obj, obj2);
                        }
                        if (obj2 instanceof n) {
                            Throwable th = xVar.f27456a;
                            if (obj instanceof h) {
                                l((h) obj, th);
                                return;
                            } else {
                                q6.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                n((c7.c0) obj, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof w) {
                        w wVar = (w) obj2;
                        if (wVar.f27449b != null) {
                            K(obj, obj2);
                        }
                        if (obj instanceof c7.c0) {
                            return;
                        }
                        q6.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        h hVar = (h) obj;
                        if (wVar.c()) {
                            l(hVar, wVar.f27452e);
                            return;
                        } else {
                            if (androidx.concurrent.futures.b.a(f27398w, this, obj2, w.b(wVar, null, hVar, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof c7.c0) {
                            return;
                        }
                        q6.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (androidx.concurrent.futures.b.a(f27398w, this, obj2, new w(obj2, (h) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            } else if (androidx.concurrent.futures.b.a(f27398w, this, obj2, obj)) {
                return;
            }
        }
    }

    private final boolean I() {
        if (!s0.c(this.f27420s)) {
            return false;
        }
        g6.e eVar = this.f27400t;
        q6.i.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((c7.j) eVar).o();
    }

    private final h J(p6.l lVar) {
        return lVar instanceof h ? (h) lVar : new j1(lVar);
    }

    private final void K(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final void P(Object obj, int i7, p6.l lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27398w;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof a2)) {
                Object obj3 = obj;
                p6.l lVar2 = lVar;
                if (obj2 instanceof n) {
                    n nVar = (n) obj2;
                    if (nVar.e()) {
                        if (lVar2 != null) {
                            m(lVar2, nVar.f27456a);
                            return;
                        }
                        return;
                    }
                }
                k(obj3);
                throw new e6.d();
            }
            Object obj4 = obj;
            int i8 = i7;
            p6.l lVar3 = lVar;
            if (androidx.concurrent.futures.b.a(f27398w, this, obj2, R((a2) obj2, obj4, i8, lVar3, null))) {
                r();
                s(i8);
                return;
            } else {
                obj = obj4;
                i7 = i8;
                lVar = lVar3;
            }
        }
    }

    static /* synthetic */ void Q(k kVar, Object obj, int i7, p6.l lVar, int i8, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i8 & 4) != 0) {
            lVar = null;
        }
        kVar.P(obj, i7, lVar);
    }

    private final Object R(a2 a2Var, Object obj, int i7, p6.l lVar, Object obj2) {
        if (obj instanceof x) {
            return obj;
        }
        if ((s0.b(i7) || obj2 != null) && !(lVar == null && !(a2Var instanceof h) && obj2 == null)) {
            return new w(obj, a2Var instanceof h ? (h) a2Var : null, lVar, obj2, null, 16, null);
        }
        return obj;
    }

    private final boolean S() {
        int i7;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f27397v;
        do {
            i7 = atomicIntegerFieldUpdater.get(this);
            int i8 = i7 >> 29;
            if (i8 != 0) {
                if (i8 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f27397v.compareAndSet(this, i7, 1073741824 + (536870911 & i7)));
        return true;
    }

    private final c7.f0 T(Object obj, Object obj2, p6.l lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27398w;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof a2)) {
                Object obj4 = obj2;
                if ((obj3 instanceof w) && obj4 != null && ((w) obj3).f27451d == obj4) {
                    return l.f27405a;
                }
                return null;
            }
            Object obj5 = obj;
            Object obj6 = obj2;
            p6.l lVar2 = lVar;
            if (androidx.concurrent.futures.b.a(f27398w, this, obj3, R((a2) obj3, obj5, this.f27420s, lVar2, obj6))) {
                r();
                return l.f27405a;
            }
            obj = obj5;
            lVar = lVar2;
            obj2 = obj6;
        }
    }

    private final boolean U() {
        int i7;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f27397v;
        do {
            i7 = atomicIntegerFieldUpdater.get(this);
            int i8 = i7 >> 29;
            if (i8 != 0) {
                if (i8 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f27397v.compareAndSet(this, i7, 536870912 + (536870911 & i7)));
        return true;
    }

    private final Void k(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void n(c7.c0 c0Var, Throwable th) {
        int i7 = f27397v.get(this) & 536870911;
        if (i7 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            c0Var.r(i7, th, getContext());
        } catch (Throwable th2) {
            f0.a(getContext(), new a0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean p(Throwable th) {
        if (!I()) {
            return false;
        }
        g6.e eVar = this.f27400t;
        q6.i.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((c7.j) eVar).p(th);
    }

    private final void r() {
        if (I()) {
            return;
        }
        q();
    }

    private final void s(int i7) {
        if (S()) {
            return;
        }
        s0.a(this, i7);
    }

    private final u0 u() {
        return (u0) f27399x.get(this);
    }

    public void E() {
        u0 F = F();
        if (F != null && H()) {
            F.h();
            f27399x.set(this, z1.f27465q);
        }
    }

    public boolean H() {
        return !(z() instanceof a2);
    }

    protected String L() {
        return "CancellableContinuation";
    }

    public final void M(Throwable th) {
        if (p(th)) {
            return;
        }
        o(th);
        r();
    }

    public final void N() {
        Throwable r7;
        g6.e eVar = this.f27400t;
        c7.j jVar = eVar instanceof c7.j ? (c7.j) eVar : null;
        if (jVar == null || (r7 = jVar.r(this)) == null) {
            return;
        }
        q();
        o(r7);
    }

    public final boolean O() {
        Object obj = f27398w.get(this);
        if ((obj instanceof w) && ((w) obj).f27451d != null) {
            q();
            return false;
        }
        f27397v.set(this, 536870911);
        f27398w.set(this, d.f27374q);
        return true;
    }

    @Override // x6.l2
    public void a(c7.c0 c0Var, int i7) {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f27397v;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            if ((i8 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, ((i8 >> 29) << 29) + i7));
        G(c0Var);
    }

    @Override // x6.r0
    public void b(Object obj, Throwable th) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27398w;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof a2) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof x) {
                return;
            }
            if (obj2 instanceof w) {
                w wVar = (w) obj2;
                if (wVar.c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th3 = th;
                th2 = th3;
                if (androidx.concurrent.futures.b.a(f27398w, this, obj2, w.b(wVar, null, null, null, null, th3, 15, null))) {
                    wVar.d(this, th2);
                    return;
                }
            } else {
                th2 = th;
                if (androidx.concurrent.futures.b.a(f27398w, this, obj2, new w(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            }
            th = th2;
        }
    }

    @Override // x6.r0
    public final g6.e c() {
        return this.f27400t;
    }

    @Override // i6.e
    public i6.e d() {
        g6.e eVar = this.f27400t;
        if (eVar instanceof i6.e) {
            return (i6.e) eVar;
        }
        return null;
    }

    @Override // x6.r0
    public Throwable e(Object obj) {
        Throwable e8 = super.e(obj);
        if (e8 != null) {
            return e8;
        }
        return null;
    }

    @Override // x6.j
    public Object f(Object obj, Object obj2, p6.l lVar) {
        return T(obj, obj2, lVar);
    }

    @Override // x6.r0
    public Object g(Object obj) {
        return obj instanceof w ? ((w) obj).f27448a : obj;
    }

    @Override // g6.e
    public g6.i getContext() {
        return this.f27401u;
    }

    @Override // g6.e
    public void h(Object obj) {
        Q(this, b0.c(obj, this), this.f27420s, null, 4, null);
    }

    @Override // x6.r0
    public Object j() {
        return z();
    }

    public final void l(h hVar, Throwable th) {
        try {
            hVar.c(th);
        } catch (Throwable th2) {
            f0.a(getContext(), new a0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m(p6.l lVar, Throwable th) {
        try {
            lVar.g(th);
        } catch (Throwable th2) {
            f0.a(getContext(), new a0("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public boolean o(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27398w;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof a2)) {
                return false;
            }
        } while (!androidx.concurrent.futures.b.a(f27398w, this, obj, new n(this, th, (obj instanceof h) || (obj instanceof c7.c0))));
        a2 a2Var = (a2) obj;
        if (a2Var instanceof h) {
            l((h) obj, th);
        } else if (a2Var instanceof c7.c0) {
            n((c7.c0) obj, th);
        }
        r();
        s(this.f27420s);
        return true;
    }

    public final void q() {
        u0 u7 = u();
        if (u7 == null) {
            return;
        }
        u7.h();
        f27399x.set(this, z1.f27465q);
    }

    public Throwable t(m1 m1Var) {
        return m1Var.k();
    }

    public String toString() {
        return L() + '(' + k0.c(this.f27400t) + "){" + A() + "}@" + k0.b(this);
    }

    @Override // x6.j
    public void v(Object obj, p6.l lVar) {
        P(obj, this.f27420s, lVar);
    }

    public final Object w() {
        m1 m1Var;
        boolean I = I();
        if (U()) {
            if (u() == null) {
                F();
            }
            if (I) {
                N();
            }
            return h6.b.e();
        }
        if (I) {
            N();
        }
        Object z7 = z();
        if (z7 instanceof x) {
            throw ((x) z7).f27456a;
        }
        if (!s0.b(this.f27420s) || (m1Var = (m1) getContext().e(m1.f27411p)) == null || m1Var.c()) {
            return g(z7);
        }
        CancellationException k7 = m1Var.k();
        b(z7, k7);
        throw k7;
    }

    @Override // x6.j
    public void x(p6.l lVar) {
        G(J(lVar));
    }

    @Override // x6.j
    public void y(Object obj) {
        s(this.f27420s);
    }

    public final Object z() {
        return f27398w.get(this);
    }
}
