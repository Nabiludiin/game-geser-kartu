package x6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: MyApplication */
public abstract class y0 extends z0 implements p0 {

    /* renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27462v = AtomicReferenceFieldUpdater.newUpdater(y0.class, Object.class, "_queue$volatile");

    /* renamed from: w, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27463w = AtomicReferenceFieldUpdater.newUpdater(y0.class, Object.class, "_delayed$volatile");

    /* renamed from: x, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f27464x = AtomicIntegerFieldUpdater.newUpdater(y0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* compiled from: MyApplication */
    public static final class a extends c7.l0 {
    }

    private final void A0(boolean z7) {
        f27464x.set(this, z7 ? 1 : 0);
    }

    private final void f0() {
        c7.f0 f0Var;
        c7.f0 f0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27462v;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f27462v;
                f0Var = b1.f27368b;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, null, f0Var)) {
                    return;
                }
            } else {
                if (obj instanceof c7.s) {
                    ((c7.s) obj).d();
                    return;
                }
                f0Var2 = b1.f27368b;
                if (obj == f0Var2) {
                    return;
                }
                c7.s sVar = new c7.s(8, true);
                q6.i.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                sVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f27462v, this, obj, sVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable g0() {
        c7.f0 f0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27462v;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof c7.s) {
                q6.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                c7.s sVar = (c7.s) obj;
                Object m7 = sVar.m();
                if (m7 != c7.s.f3820h) {
                    return (Runnable) m7;
                }
                androidx.concurrent.futures.b.a(f27462v, this, obj, sVar.l());
            } else {
                f0Var = b1.f27368b;
                if (obj == f0Var) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f27462v, this, obj, null)) {
                    q6.i.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean m0(Runnable runnable) {
        c7.f0 f0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27462v;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (v0()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f27462v, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof c7.s) {
                q6.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                c7.s sVar = (c7.s) obj;
                int a8 = sVar.a(runnable);
                if (a8 == 0) {
                    return true;
                }
                if (a8 == 1) {
                    androidx.concurrent.futures.b.a(f27462v, this, obj, sVar.l());
                } else if (a8 == 2) {
                    return false;
                }
            } else {
                f0Var = b1.f27368b;
                if (obj == f0Var) {
                    return false;
                }
                c7.s sVar2 = new c7.s(8, true);
                q6.i.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                sVar2.a((Runnable) obj);
                sVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(f27462v, this, obj, sVar2)) {
                    return true;
                }
            }
        }
    }

    private final boolean v0() {
        return f27464x.get(this) != 0;
    }

    private final void y0() {
        c.a();
        System.nanoTime();
    }

    @Override // x6.x0
    protected long R() {
        c7.f0 f0Var;
        if (super.R() == 0) {
            return 0L;
        }
        Object obj = f27462v.get(this);
        if (obj != null) {
            if (!(obj instanceof c7.s)) {
                f0Var = b1.f27368b;
                return obj == f0Var ? Long.MAX_VALUE : 0L;
            }
            if (!((c7.s) obj).j()) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // x6.d0
    public final void h(g6.i iVar, Runnable runnable) {
        j0(runnable);
    }

    public void j0(Runnable runnable) {
        if (m0(runnable)) {
            e0();
        } else {
            l0.f27406y.j0(runnable);
        }
    }

    @Override // x6.x0
    public void shutdown() {
        h2.f27384a.b();
        A0(true);
        f0();
        while (x0() <= 0) {
        }
        y0();
    }

    protected boolean w0() {
        c7.f0 f0Var;
        if (!V()) {
            return false;
        }
        Object obj = f27462v.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof c7.s) {
            return ((c7.s) obj).j();
        }
        f0Var = b1.f27368b;
        return obj == f0Var;
    }

    public long x0() {
        if (a0()) {
            return 0L;
        }
        Runnable g02 = g0();
        if (g02 == null) {
            return R();
        }
        g02.run();
        return 0L;
    }

    protected final void z0() {
        f27462v.set(this, null);
        f27463w.set(this, null);
    }
}
