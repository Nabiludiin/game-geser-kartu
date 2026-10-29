package x6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: MyApplication */
final class k1 extends o1 {

    /* renamed from: v, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f27402v = AtomicIntegerFieldUpdater.newUpdater(k1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: u, reason: collision with root package name */
    private final p6.l f27403u;

    public k1(p6.l lVar) {
        this.f27403u = lVar;
    }

    @Override // x6.z
    public void A(Throwable th) {
        if (f27402v.compareAndSet(this, 0, 1)) {
            this.f27403u.g(th);
        }
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ Object g(Object obj) {
        A((Throwable) obj);
        return e6.s.f23253a;
    }
}
