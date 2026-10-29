package c7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import x6.a2;

/* compiled from: MyApplication */
public abstract class c0 extends e implements a2 {

    /* renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f3771t = AtomicIntegerFieldUpdater.newUpdater(c0.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* renamed from: s, reason: collision with root package name */
    public final long f3772s;

    public c0(long j7, c0 c0Var, int i7) {
        super(c0Var);
        this.f3772s = j7;
        this.cleanedAndPointers$volatile = i7 << 16;
    }

    @Override // c7.e
    public boolean j() {
        return f3771t.get(this) == q() && !k();
    }

    public final boolean o() {
        return f3771t.addAndGet(this, -65536) == q() && !k();
    }

    public abstract int q();

    public abstract void r(int i7, Throwable th, g6.i iVar);

    public final void s() {
        if (f3771t.incrementAndGet(this) == q()) {
            m();
        }
    }

    public final boolean t() {
        int i7;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3771t;
        do {
            i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 == q() && !k()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 65536 + i7));
        return true;
    }
}
