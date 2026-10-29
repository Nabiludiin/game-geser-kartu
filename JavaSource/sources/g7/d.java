package g7;

import c7.c0;
import c7.d0;
import c7.f0;
import e6.s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p6.l;
import p6.p;
import q6.h;
import q6.i;
import q6.j;
import x6.l2;
import z6.g;

/* compiled from: MyApplication */
public class d {

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f24064c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f24065d = AtomicLongFieldUpdater.newUpdater(d.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f24066e = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "tail$volatile");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f24067f = AtomicLongFieldUpdater.newUpdater(d.class, "enqIdx$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f24068g = AtomicIntegerFieldUpdater.newUpdater(d.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    private final int f24069a;

    /* renamed from: b, reason: collision with root package name */
    private final l f24070b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* compiled from: MyApplication */
    /* synthetic */ class a extends h implements p {

        /* renamed from: z, reason: collision with root package name */
        public static final a f24071z = new a();

        a() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ Object i(Object obj, Object obj2) {
            return l(((Number) obj).longValue(), (f) obj2);
        }

        public final f l(long j7, f fVar) {
            f h8;
            h8 = e.h(j7, fVar);
            return h8;
        }
    }

    /* compiled from: MyApplication */
    static final class b extends j implements l {
        b() {
            super(1);
        }

        public final void c(Throwable th) {
            d.this.m();
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ Object g(Object obj) {
            c((Throwable) obj);
            return s.f23253a;
        }
    }

    /* compiled from: MyApplication */
    /* synthetic */ class c extends h implements p {

        /* renamed from: z, reason: collision with root package name */
        public static final c f24073z = new c();

        c() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ Object i(Object obj, Object obj2) {
            return l(((Number) obj).longValue(), (f) obj2);
        }

        public final f l(long j7, f fVar) {
            f h8;
            h8 = e.h(j7, fVar);
            return h8;
        }
    }

    public d(int i7, int i8) {
        this.f24069a = i7;
        if (i7 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i7).toString());
        }
        if (i8 < 0 || i8 > i7) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i7).toString());
        }
        f fVar = new f(0L, null, 2);
        this.head$volatile = fVar;
        this.tail$volatile = fVar;
        this._availablePermits$volatile = i7 - i8;
        this.f24070b = new b();
    }

    private final boolean d(l2 l2Var) {
        int i7;
        Object c8;
        int i8;
        f0 f0Var;
        f0 f0Var2;
        f fVar = (f) f24066e.get(this);
        long andIncrement = f24067f.getAndIncrement(this);
        a aVar = a.f24071z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24066e;
        i7 = e.f24079f;
        long j7 = andIncrement / i7;
        loop0: while (true) {
            c8 = c7.d.c(fVar, j7, aVar);
            if (!d0.c(c8)) {
                c0 b8 = d0.b(c8);
                while (true) {
                    c0 c0Var = (c0) atomicReferenceFieldUpdater.get(this);
                    if (c0Var.f3772s >= b8.f3772s) {
                        break loop0;
                    }
                    if (!b8.t()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, c0Var, b8)) {
                        if (c0Var.o()) {
                            c0Var.m();
                        }
                    } else if (b8.o()) {
                        b8.m();
                    }
                }
            } else {
                break;
            }
        }
        f fVar2 = (f) d0.b(c8);
        i8 = e.f24079f;
        int i9 = (int) (andIncrement % i8);
        if (g.a(fVar2.u(), i9, null, l2Var)) {
            l2Var.a(fVar2, i9);
            return true;
        }
        f0Var = e.f24075b;
        f0Var2 = e.f24076c;
        if (!g.a(fVar2.u(), i9, f0Var, f0Var2)) {
            return false;
        }
        if (l2Var instanceof x6.j) {
            i.c(l2Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((x6.j) l2Var).v(s.f23253a, this.f24070b);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + l2Var).toString());
    }

    private final void e() {
        int i7;
        do {
            i7 = f24068g.get(this);
            if (i7 <= this.f24069a) {
                return;
            }
        } while (!f24068g.compareAndSet(this, i7, this.f24069a));
    }

    private final int f() {
        int andDecrement;
        do {
            andDecrement = f24068g.getAndDecrement(this);
        } while (andDecrement > this.f24069a);
        return andDecrement;
    }

    private final boolean o(Object obj) {
        if (!(obj instanceof x6.j)) {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        x6.j jVar = (x6.j) obj;
        Object f8 = jVar.f(s.f23253a, null, this.f24070b);
        if (f8 == null) {
            return false;
        }
        jVar.y(f8);
        return true;
    }

    private final boolean p() {
        int i7;
        Object c8;
        int i8;
        f0 f0Var;
        f0 f0Var2;
        int i9;
        f0 f0Var3;
        f0 f0Var4;
        f0 f0Var5;
        f fVar = (f) f24064c.get(this);
        long andIncrement = f24065d.getAndIncrement(this);
        i7 = e.f24079f;
        long j7 = andIncrement / i7;
        c cVar = c.f24073z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24064c;
        loop0: while (true) {
            c8 = c7.d.c(fVar, j7, cVar);
            if (d0.c(c8)) {
                break;
            }
            c0 b8 = d0.b(c8);
            while (true) {
                c0 c0Var = (c0) atomicReferenceFieldUpdater.get(this);
                if (c0Var.f3772s >= b8.f3772s) {
                    break loop0;
                }
                if (!b8.t()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, c0Var, b8)) {
                    if (c0Var.o()) {
                        c0Var.m();
                    }
                } else if (b8.o()) {
                    b8.m();
                }
            }
        }
        f fVar2 = (f) d0.b(c8);
        fVar2.b();
        if (fVar2.f3772s > j7) {
            return false;
        }
        i8 = e.f24079f;
        int i10 = (int) (andIncrement % i8);
        f0Var = e.f24075b;
        Object andSet = fVar2.u().getAndSet(i10, f0Var);
        if (andSet != null) {
            f0Var2 = e.f24078e;
            if (andSet == f0Var2) {
                return false;
            }
            return o(andSet);
        }
        i9 = e.f24074a;
        for (int i11 = 0; i11 < i9; i11++) {
            Object obj = fVar2.u().get(i10);
            f0Var5 = e.f24076c;
            if (obj == f0Var5) {
                return true;
            }
        }
        f0Var3 = e.f24075b;
        f0Var4 = e.f24077d;
        return !g.a(fVar2.u(), i10, f0Var3, f0Var4);
    }

    protected final void c(x6.j jVar) {
        while (f() <= 0) {
            i.c(jVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (d((l2) jVar)) {
                return;
            }
        }
        jVar.v(s.f23253a, this.f24070b);
    }

    public int g() {
        return Math.max(f24068g.get(this), 0);
    }

    public void m() {
        do {
            int andIncrement = f24068g.getAndIncrement(this);
            if (andIncrement >= this.f24069a) {
                e();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f24069a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!p());
    }

    public boolean n() {
        while (true) {
            int i7 = f24068g.get(this);
            if (i7 > this.f24069a) {
                e();
            } else {
                if (i7 <= 0) {
                    return false;
                }
                if (f24068g.compareAndSet(this, i7, i7 - 1)) {
                    return true;
                }
            }
        }
    }
}
