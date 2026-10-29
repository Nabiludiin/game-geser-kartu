package x6;

import c7.q;
import g6.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x6.m1;

/* compiled from: MyApplication */
public class t1 implements m1, r, b2 {

    /* renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27426q = AtomicReferenceFieldUpdater.newUpdater(t1.class, Object.class, "_state$volatile");

    /* renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27427r = AtomicReferenceFieldUpdater.newUpdater(t1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* compiled from: MyApplication */
    private static final class a extends k {

        /* renamed from: y, reason: collision with root package name */
        private final t1 f27428y;

        public a(g6.e eVar, t1 t1Var) {
            super(eVar, 1);
            this.f27428y = t1Var;
        }

        @Override // x6.k
        protected String L() {
            return "AwaitContinuation";
        }

        @Override // x6.k
        public Throwable t(m1 m1Var) {
            Throwable e8;
            Object b02 = this.f27428y.b0();
            return (!(b02 instanceof c) || (e8 = ((c) b02).e()) == null) ? b02 instanceof x ? ((x) b02).f27456a : m1Var.k() : e8;
        }
    }

    /* compiled from: MyApplication */
    private static final class b extends s1 {

        /* renamed from: u, reason: collision with root package name */
        private final t1 f27429u;

        /* renamed from: v, reason: collision with root package name */
        private final c f27430v;

        /* renamed from: w, reason: collision with root package name */
        private final q f27431w;

        /* renamed from: x, reason: collision with root package name */
        private final Object f27432x;

        public b(t1 t1Var, c cVar, q qVar, Object obj) {
            this.f27429u = t1Var;
            this.f27430v = cVar;
            this.f27431w = qVar;
            this.f27432x = obj;
        }

        @Override // x6.z
        public void A(Throwable th) {
            this.f27429u.Q(this.f27430v, this.f27431w, this.f27432x);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ Object g(Object obj) {
            A((Throwable) obj);
            return e6.s.f23253a;
        }
    }

    /* compiled from: MyApplication */
    private static final class c implements h1 {

        /* renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f27433r = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* renamed from: s, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f27434s = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* renamed from: t, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f27435t = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* renamed from: q, reason: collision with root package name */
        private final y1 f27436q;

        public c(y1 y1Var, boolean z7, Throwable th) {
            this.f27436q = y1Var;
            this._isCompleting$volatile = z7 ? 1 : 0;
            this._rootCause$volatile = th;
        }

        private final ArrayList b() {
            return new ArrayList(4);
        }

        private final Object d() {
            return f27435t.get(this);
        }

        private final void o(Object obj) {
            f27435t.set(this, obj);
        }

        public final void a(Throwable th) {
            Throwable e8 = e();
            if (e8 == null) {
                p(th);
                return;
            }
            if (th == e8) {
                return;
            }
            Object d8 = d();
            if (d8 == null) {
                o(th);
                return;
            }
            if (d8 instanceof Throwable) {
                if (th == d8) {
                    return;
                }
                ArrayList b8 = b();
                b8.add(d8);
                b8.add(th);
                o(b8);
                return;
            }
            if (d8 instanceof ArrayList) {
                ((ArrayList) d8).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + d8).toString());
        }

        @Override // x6.h1
        public boolean c() {
            return e() == null;
        }

        public final Throwable e() {
            return (Throwable) f27434s.get(this);
        }

        @Override // x6.h1
        public y1 f() {
            return this.f27436q;
        }

        public final boolean j() {
            return e() != null;
        }

        public final boolean k() {
            return f27433r.get(this) != 0;
        }

        public final boolean l() {
            c7.f0 f0Var;
            Object d8 = d();
            f0Var = u1.f27443e;
            return d8 == f0Var;
        }

        public final List m(Throwable th) {
            ArrayList arrayList;
            c7.f0 f0Var;
            Object d8 = d();
            if (d8 == null) {
                arrayList = b();
            } else if (d8 instanceof Throwable) {
                ArrayList b8 = b();
                b8.add(d8);
                arrayList = b8;
            } else {
                if (!(d8 instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + d8).toString());
                }
                arrayList = (ArrayList) d8;
            }
            Throwable e8 = e();
            if (e8 != null) {
                arrayList.add(0, e8);
            }
            if (th != null && !q6.i.a(th, e8)) {
                arrayList.add(th);
            }
            f0Var = u1.f27443e;
            o(f0Var);
            return arrayList;
        }

        public final void n(boolean z7) {
            f27433r.set(this, z7 ? 1 : 0);
        }

        public final void p(Throwable th) {
            f27434s.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + j() + ", completing=" + k() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + f() + ']';
        }
    }

    /* compiled from: MyApplication */
    public static final class d extends q.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ t1 f27437d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f27438e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c7.q qVar, t1 t1Var, Object obj) {
            super(qVar);
            this.f27437d = t1Var;
            this.f27438e = obj;
        }

        @Override // c7.b
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Object e(c7.q qVar) {
            if (this.f27437d.b0() == this.f27438e) {
                return null;
            }
            return c7.p.a();
        }
    }

    public t1(boolean z7) {
        this._state$volatile = z7 ? u1.f27445g : u1.f27444f;
    }

    private final boolean A(Object obj, y1 y1Var, s1 s1Var) {
        int z7;
        d dVar = new d(s1Var, this, obj);
        do {
            z7 = y1Var.r().z(s1Var, y1Var, dVar);
            if (z7 == 1) {
                return true;
            }
        } while (z7 != 2);
        return false;
    }

    public static /* synthetic */ CancellationException B0(t1 t1Var, Throwable th, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i7 & 1) != 0) {
            str = null;
        }
        return t1Var.A0(th, str);
    }

    private final void C(Throwable th, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                e6.a.a(th, th2);
            }
        }
    }

    private final boolean D0(h1 h1Var, Object obj) {
        if (!androidx.concurrent.futures.b.a(f27426q, this, h1Var, u1.g(obj))) {
            return false;
        }
        r0(null);
        s0(obj);
        P(h1Var, obj);
        return true;
    }

    private final boolean E0(h1 h1Var, Throwable th) {
        y1 Z = Z(h1Var);
        if (Z == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f27426q, this, h1Var, new c(Z, false, th))) {
            return false;
        }
        p0(Z, th);
        return true;
    }

    private final Object F0(Object obj, Object obj2) {
        c7.f0 f0Var;
        c7.f0 f0Var2;
        if (!(obj instanceof h1)) {
            f0Var2 = u1.f27439a;
            return f0Var2;
        }
        if ((!(obj instanceof w0) && !(obj instanceof s1)) || (obj instanceof q) || (obj2 instanceof x)) {
            return G0((h1) obj, obj2);
        }
        if (D0((h1) obj, obj2)) {
            return obj2;
        }
        f0Var = u1.f27441c;
        return f0Var;
    }

    private final Object G0(h1 h1Var, Object obj) {
        c7.f0 f0Var;
        c7.f0 f0Var2;
        c7.f0 f0Var3;
        y1 Z = Z(h1Var);
        if (Z == null) {
            f0Var3 = u1.f27441c;
            return f0Var3;
        }
        c cVar = h1Var instanceof c ? (c) h1Var : null;
        if (cVar == null) {
            cVar = new c(Z, false, null);
        }
        q6.p pVar = new q6.p();
        synchronized (cVar) {
            if (cVar.k()) {
                f0Var2 = u1.f27439a;
                return f0Var2;
            }
            cVar.n(true);
            if (cVar != h1Var && !androidx.concurrent.futures.b.a(f27426q, this, h1Var, cVar)) {
                f0Var = u1.f27441c;
                return f0Var;
            }
            boolean j7 = cVar.j();
            x xVar = obj instanceof x ? (x) obj : null;
            if (xVar != null) {
                cVar.a(xVar.f27456a);
            }
            Throwable e8 = j7 ? null : cVar.e();
            pVar.f25710q = e8;
            e6.s sVar = e6.s.f23253a;
            if (e8 != null) {
                p0(Z, e8);
            }
            q T = T(h1Var);
            return (T == null || !H0(cVar, T, obj)) ? S(cVar, obj) : u1.f27440b;
        }
    }

    private final boolean H0(c cVar, q qVar, Object obj) {
        while (m1.a.c(qVar.f27418u, false, false, new b(this, cVar, qVar, obj), 1, null) == z1.f27465q) {
            qVar = o0(qVar);
            if (qVar == null) {
                return false;
            }
        }
        return true;
    }

    private final Object I(g6.e eVar) {
        a aVar = new a(h6.b.c(eVar), this);
        aVar.E();
        m.a(aVar, m(new c2(aVar)));
        Object w7 = aVar.w();
        if (w7 == h6.b.e()) {
            i6.h.c(eVar);
        }
        return w7;
    }

    private final Object L(Object obj) {
        c7.f0 f0Var;
        Object F0;
        c7.f0 f0Var2;
        do {
            Object b02 = b0();
            if (!(b02 instanceof h1) || ((b02 instanceof c) && ((c) b02).k())) {
                f0Var = u1.f27439a;
                return f0Var;
            }
            F0 = F0(b02, new x(R(obj), false, 2, null));
            f0Var2 = u1.f27441c;
        } while (F0 == f0Var2);
        return F0;
    }

    private final boolean M(Throwable th) {
        if (i0()) {
            return true;
        }
        boolean z7 = th instanceof CancellationException;
        p a02 = a0();
        return (a02 == null || a02 == z1.f27465q) ? z7 : a02.d(th) || z7;
    }

    private final void P(h1 h1Var, Object obj) {
        p a02 = a0();
        if (a02 != null) {
            a02.h();
            x0(z1.f27465q);
        }
        x xVar = obj instanceof x ? (x) obj : null;
        Throwable th = xVar != null ? xVar.f27456a : null;
        if (!(h1Var instanceof s1)) {
            y1 f8 = h1Var.f();
            if (f8 != null) {
                q0(f8, th);
                return;
            }
            return;
        }
        try {
            ((s1) h1Var).A(th);
        } catch (Throwable th2) {
            f0(new a0("Exception in completion handler " + h1Var + " for " + this, th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(c cVar, q qVar, Object obj) {
        q o02 = o0(qVar);
        if (o02 == null || !H0(cVar, o02, obj)) {
            D(S(cVar, obj));
        }
    }

    private final Throwable R(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new n1(N(), null, this) : th;
        }
        q6.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((b2) obj).z();
    }

    private final Object S(c cVar, Object obj) {
        boolean j7;
        Throwable W;
        x xVar = obj instanceof x ? (x) obj : null;
        Throwable th = xVar != null ? xVar.f27456a : null;
        synchronized (cVar) {
            j7 = cVar.j();
            List m7 = cVar.m(th);
            W = W(cVar, m7);
            if (W != null) {
                C(W, m7);
            }
        }
        if (W != null && W != th) {
            obj = new x(W, false, 2, null);
        }
        if (W != null && (M(W) || e0(W))) {
            q6.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((x) obj).c();
        }
        if (!j7) {
            r0(W);
        }
        s0(obj);
        androidx.concurrent.futures.b.a(f27426q, this, cVar, u1.g(obj));
        P(cVar, obj);
        return obj;
    }

    private final q T(h1 h1Var) {
        q qVar = h1Var instanceof q ? (q) h1Var : null;
        if (qVar != null) {
            return qVar;
        }
        y1 f8 = h1Var.f();
        if (f8 != null) {
            return o0(f8);
        }
        return null;
    }

    private final Throwable V(Object obj) {
        x xVar = obj instanceof x ? (x) obj : null;
        if (xVar != null) {
            return xVar.f27456a;
        }
        return null;
    }

    private final Throwable W(c cVar, List list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.j()) {
                return new n1(N(), null, this);
            }
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                obj = next;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : (Throwable) list.get(0);
    }

    private final y1 Z(h1 h1Var) {
        y1 f8 = h1Var.f();
        if (f8 != null) {
            return f8;
        }
        if (h1Var instanceof w0) {
            return new y1();
        }
        if (h1Var instanceof s1) {
            v0((s1) h1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + h1Var).toString());
    }

    private final Object j0(Object obj) {
        c7.f0 f0Var;
        c7.f0 f0Var2;
        c7.f0 f0Var3;
        c7.f0 f0Var4;
        c7.f0 f0Var5;
        c7.f0 f0Var6;
        Throwable th = null;
        while (true) {
            Object b02 = b0();
            if (b02 instanceof c) {
                synchronized (b02) {
                    if (((c) b02).l()) {
                        f0Var2 = u1.f27442d;
                        return f0Var2;
                    }
                    boolean j7 = ((c) b02).j();
                    if (obj != null || !j7) {
                        if (th == null) {
                            th = R(obj);
                        }
                        ((c) b02).a(th);
                    }
                    Throwable e8 = j7 ? null : ((c) b02).e();
                    if (e8 != null) {
                        p0(((c) b02).f(), e8);
                    }
                    f0Var = u1.f27439a;
                    return f0Var;
                }
            }
            if (!(b02 instanceof h1)) {
                f0Var3 = u1.f27442d;
                return f0Var3;
            }
            if (th == null) {
                th = R(obj);
            }
            h1 h1Var = (h1) b02;
            if (!h1Var.c()) {
                Object F0 = F0(b02, new x(th, false, 2, null));
                f0Var5 = u1.f27439a;
                if (F0 == f0Var5) {
                    throw new IllegalStateException(("Cannot happen in " + b02).toString());
                }
                f0Var6 = u1.f27441c;
                if (F0 != f0Var6) {
                    return F0;
                }
            } else if (E0(h1Var, th)) {
                f0Var4 = u1.f27439a;
                return f0Var4;
            }
        }
    }

    private final s1 m0(p6.l lVar, boolean z7) {
        s1 s1Var;
        if (z7) {
            s1Var = lVar instanceof o1 ? (o1) lVar : null;
            if (s1Var == null) {
                s1Var = new k1(lVar);
            }
        } else {
            s1Var = lVar instanceof s1 ? (s1) lVar : null;
            if (s1Var == null) {
                s1Var = new l1(lVar);
            }
        }
        s1Var.C(this);
        return s1Var;
    }

    private final q o0(c7.q qVar) {
        while (qVar.v()) {
            qVar = qVar.r();
        }
        while (true) {
            qVar = qVar.q();
            if (!qVar.v()) {
                if (qVar instanceof q) {
                    return (q) qVar;
                }
                if (qVar instanceof y1) {
                    return null;
                }
            }
        }
    }

    private final void p0(y1 y1Var, Throwable th) {
        r0(th);
        Object p7 = y1Var.p();
        q6.i.c(p7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        a0 a0Var = null;
        for (c7.q qVar = (c7.q) p7; !q6.i.a(qVar, y1Var); qVar = qVar.q()) {
            if (qVar instanceof o1) {
                s1 s1Var = (s1) qVar;
                try {
                    s1Var.A(th);
                } catch (Throwable th2) {
                    if (a0Var != null) {
                        e6.a.a(a0Var, th2);
                    } else {
                        a0Var = new a0("Exception in completion handler " + s1Var + " for " + this, th2);
                        e6.s sVar = e6.s.f23253a;
                    }
                }
            }
        }
        if (a0Var != null) {
            f0(a0Var);
        }
        M(th);
    }

    private final void q0(y1 y1Var, Throwable th) {
        Object p7 = y1Var.p();
        q6.i.c(p7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        a0 a0Var = null;
        for (c7.q qVar = (c7.q) p7; !q6.i.a(qVar, y1Var); qVar = qVar.q()) {
            if (qVar instanceof s1) {
                s1 s1Var = (s1) qVar;
                try {
                    s1Var.A(th);
                } catch (Throwable th2) {
                    if (a0Var != null) {
                        e6.a.a(a0Var, th2);
                    } else {
                        a0Var = new a0("Exception in completion handler " + s1Var + " for " + this, th2);
                        e6.s sVar = e6.s.f23253a;
                    }
                }
            }
        }
        if (a0Var != null) {
            f0(a0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [x6.g1] */
    private final void u0(w0 w0Var) {
        y1 y1Var = new y1();
        if (!w0Var.c()) {
            y1Var = new g1(y1Var);
        }
        androidx.concurrent.futures.b.a(f27426q, this, w0Var, y1Var);
    }

    private final void v0(s1 s1Var) {
        s1Var.l(new y1());
        androidx.concurrent.futures.b.a(f27426q, this, s1Var, s1Var.q());
    }

    private final int y0(Object obj) {
        w0 w0Var;
        if (!(obj instanceof w0)) {
            if (!(obj instanceof g1)) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f27426q, this, obj, ((g1) obj).f())) {
                return -1;
            }
            t0();
            return 1;
        }
        if (((w0) obj).c()) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27426q;
        w0Var = u1.f27445g;
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, w0Var)) {
            return -1;
        }
        t0();
        return 1;
    }

    private final String z0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof h1 ? ((h1) obj).c() ? "Active" : "New" : obj instanceof x ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.j() ? "Cancelling" : cVar.k() ? "Completing" : "Active";
    }

    protected final CancellationException A0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = N();
            }
            cancellationException = new n1(str, th, this);
        }
        return cancellationException;
    }

    @Override // x6.m1
    public final p B(r rVar) {
        u0 c8 = m1.a.c(this, true, false, new q(rVar), 2, null);
        q6.i.c(c8, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (p) c8;
    }

    public final String C0() {
        return n0() + '{' + z0(b0()) + '}';
    }

    protected final Object E(g6.e eVar) {
        Object b02;
        do {
            b02 = b0();
            if (!(b02 instanceof h1)) {
                if (b02 instanceof x) {
                    throw ((x) b02).f27456a;
                }
                return u1.h(b02);
            }
        } while (y0(b02) < 0);
        return I(eVar);
    }

    @Override // x6.m1
    public void F(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new n1(N(), null, this);
        }
        K(cancellationException);
    }

    @Override // x6.r
    public final void G(b2 b2Var) {
        J(b2Var);
    }

    @Override // g6.i
    public g6.i H(i.c cVar) {
        return m1.a.d(this, cVar);
    }

    public final boolean J(Object obj) {
        Object obj2;
        c7.f0 f0Var;
        c7.f0 f0Var2;
        c7.f0 f0Var3;
        obj2 = u1.f27439a;
        if (Y() && (obj2 = L(obj)) == u1.f27440b) {
            return true;
        }
        f0Var = u1.f27439a;
        if (obj2 == f0Var) {
            obj2 = j0(obj);
        }
        f0Var2 = u1.f27439a;
        if (obj2 == f0Var2 || obj2 == u1.f27440b) {
            return true;
        }
        f0Var3 = u1.f27442d;
        if (obj2 == f0Var3) {
            return false;
        }
        D(obj2);
        return true;
    }

    public void K(Throwable th) {
        J(th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String N() {
        return "Job was cancelled";
    }

    public boolean O(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return J(th) && X();
    }

    public final Object U() {
        Object b02 = b0();
        if (b02 instanceof h1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (b02 instanceof x) {
            throw ((x) b02).f27456a;
        }
        return u1.h(b02);
    }

    public boolean X() {
        return true;
    }

    public boolean Y() {
        return false;
    }

    public final p a0() {
        return (p) f27427r.get(this);
    }

    public final Object b0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27426q;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof c7.y)) {
                return obj;
            }
            ((c7.y) obj).a(this);
        }
    }

    @Override // x6.m1
    public boolean c() {
        Object b02 = b0();
        return (b02 instanceof h1) && ((h1) b02).c();
    }

    @Override // g6.i.b, g6.i
    public i.b e(i.c cVar) {
        return m1.a.b(this, cVar);
    }

    protected boolean e0(Throwable th) {
        return false;
    }

    protected final void g0(m1 m1Var) {
        if (m1Var == null) {
            x0(z1.f27465q);
            return;
        }
        m1Var.start();
        p B = m1Var.B(this);
        x0(B);
        if (h0()) {
            B.h();
            x0(z1.f27465q);
        }
    }

    @Override // g6.i.b
    public final i.c getKey() {
        return m1.f27411p;
    }

    @Override // x6.m1
    public m1 getParent() {
        p a02 = a0();
        if (a02 != null) {
            return a02.getParent();
        }
        return null;
    }

    public final boolean h0() {
        return !(b0() instanceof h1);
    }

    protected boolean i0() {
        return false;
    }

    @Override // x6.m1
    public final u0 j(boolean z7, boolean z8, p6.l lVar) {
        s1 m02 = m0(lVar, z7);
        while (true) {
            Object b02 = b0();
            if (b02 instanceof w0) {
                w0 w0Var = (w0) b02;
                if (!w0Var.c()) {
                    u0(w0Var);
                } else if (androidx.concurrent.futures.b.a(f27426q, this, b02, m02)) {
                    break;
                }
            } else {
                if (!(b02 instanceof h1)) {
                    if (z8) {
                        x xVar = b02 instanceof x ? (x) b02 : null;
                        lVar.g(xVar != null ? xVar.f27456a : null);
                    }
                    return z1.f27465q;
                }
                y1 f8 = ((h1) b02).f();
                if (f8 == null) {
                    q6.i.c(b02, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    v0((s1) b02);
                } else {
                    u0 u0Var = z1.f27465q;
                    if (z7 && (b02 instanceof c)) {
                        synchronized (b02) {
                            try {
                                r3 = ((c) b02).e();
                                if (r3 != null) {
                                    if ((lVar instanceof q) && !((c) b02).k()) {
                                    }
                                    e6.s sVar = e6.s.f23253a;
                                }
                                if (A(b02, f8, m02)) {
                                    if (r3 == null) {
                                        return m02;
                                    }
                                    u0Var = m02;
                                    e6.s sVar2 = e6.s.f23253a;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (r3 != null) {
                        if (z8) {
                            lVar.g(r3);
                        }
                        return u0Var;
                    }
                    if (A(b02, f8, m02)) {
                        break;
                    }
                }
            }
        }
        return m02;
    }

    @Override // x6.m1
    public final CancellationException k() {
        Object b02 = b0();
        if (!(b02 instanceof c)) {
            if (b02 instanceof h1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (b02 instanceof x) {
                return B0(this, ((x) b02).f27456a, null, 1, null);
            }
            return new n1(k0.a(this) + " has completed normally", null, this);
        }
        Throwable e8 = ((c) b02).e();
        if (e8 != null) {
            CancellationException A0 = A0(e8, k0.a(this) + " is cancelling");
            if (A0 != null) {
                return A0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public final boolean k0(Object obj) {
        Object F0;
        c7.f0 f0Var;
        c7.f0 f0Var2;
        do {
            F0 = F0(b0(), obj);
            f0Var = u1.f27439a;
            if (F0 == f0Var) {
                return false;
            }
            if (F0 == u1.f27440b) {
                return true;
            }
            f0Var2 = u1.f27441c;
        } while (F0 == f0Var2);
        D(F0);
        return true;
    }

    public final Object l0(Object obj) {
        Object F0;
        c7.f0 f0Var;
        c7.f0 f0Var2;
        do {
            F0 = F0(b0(), obj);
            f0Var = u1.f27439a;
            if (F0 == f0Var) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, V(obj));
            }
            f0Var2 = u1.f27441c;
        } while (F0 == f0Var2);
        return F0;
    }

    @Override // x6.m1
    public final u0 m(p6.l lVar) {
        return j(false, true, lVar);
    }

    @Override // g6.i
    public g6.i n(g6.i iVar) {
        return m1.a.e(this, iVar);
    }

    public String n0() {
        return k0.a(this);
    }

    @Override // g6.i
    public Object s(Object obj, p6.p pVar) {
        return m1.a.a(this, obj, pVar);
    }

    @Override // x6.m1
    public final boolean start() {
        int y02;
        do {
            y02 = y0(b0());
            if (y02 == 0) {
                return false;
            }
        } while (y02 != 1);
        return true;
    }

    public String toString() {
        return C0() + '@' + k0.b(this);
    }

    public final void w0(s1 s1Var) {
        Object b02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        w0 w0Var;
        do {
            b02 = b0();
            if (!(b02 instanceof s1)) {
                if (!(b02 instanceof h1) || ((h1) b02).f() == null) {
                    return;
                }
                s1Var.w();
                return;
            }
            if (b02 != s1Var) {
                return;
            }
            atomicReferenceFieldUpdater = f27426q;
            w0Var = u1.f27445g;
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, b02, w0Var));
    }

    public final void x0(p pVar) {
        f27427r.set(this, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // x6.b2
    public CancellationException z() {
        CancellationException cancellationException;
        Object b02 = b0();
        if (b02 instanceof c) {
            cancellationException = ((c) b02).e();
        } else if (b02 instanceof x) {
            cancellationException = ((x) b02).f27456a;
        } else {
            if (b02 instanceof h1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + b02).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new n1("Parent job is " + z0(b02), cancellationException, this);
    }

    protected void t0() {
    }

    protected void D(Object obj) {
    }

    public void f0(Throwable th) {
        throw th;
    }

    protected void r0(Throwable th) {
    }

    protected void s0(Object obj) {
    }
}
