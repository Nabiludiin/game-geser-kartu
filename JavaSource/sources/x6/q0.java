package x6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: MyApplication */
public final class q0 extends c7.b0 {

    /* renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f27419u = AtomicIntegerFieldUpdater.newUpdater(q0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public q0(g6.i iVar, g6.e eVar) {
        super(iVar, eVar);
    }

    private final boolean O0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f27419u;
        do {
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f27419u.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean P0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f27419u;
        do {
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f27419u.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // c7.b0, x6.t1
    protected void D(Object obj) {
        I0(obj);
    }

    @Override // c7.b0, x6.a
    protected void I0(Object obj) {
        if (O0()) {
            return;
        }
        c7.k.c(h6.b.c(this.f3769t), b0.a(obj, this.f3769t), null, 2, null);
    }

    public final Object M0() {
        if (P0()) {
            return h6.b.e();
        }
        Object h8 = u1.h(b0());
        if (h8 instanceof x) {
            throw ((x) h8).f27456a;
        }
        return h8;
    }
}
