package a7;

import c7.f0;
import e6.m;
import e6.s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: MyApplication */
final class n extends b7.d {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f48a = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    @Override // b7.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(l lVar) {
        f0 f0Var;
        if (f48a.get(this) != null) {
            return false;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f48a;
        f0Var = m.f46a;
        atomicReferenceFieldUpdater.set(this, f0Var);
        return true;
    }

    public final Object e(g6.e eVar) {
        f0 f0Var;
        x6.k kVar = new x6.k(h6.b.c(eVar), 1);
        kVar.E();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f48a;
        f0Var = m.f46a;
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, f0Var, kVar)) {
            m.a aVar = e6.m.f23247q;
            kVar.h(e6.m.a(s.f23253a));
        }
        Object w7 = kVar.w();
        if (w7 == h6.b.e()) {
            i6.h.c(eVar);
        }
        return w7 == h6.b.e() ? w7 : s.f23253a;
    }

    @Override // b7.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public g6.e[] b(l lVar) {
        f48a.set(this, null);
        return b7.c.f3444a;
    }

    public final void h() {
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3;
        f0 f0Var4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f48a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return;
            }
            f0Var = m.f47b;
            if (obj == f0Var) {
                return;
            }
            f0Var2 = m.f46a;
            if (obj == f0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f48a;
                f0Var3 = m.f47b;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, obj, f0Var3)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f48a;
                f0Var4 = m.f46a;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater3, this, obj, f0Var4)) {
                    m.a aVar = e6.m.f23247q;
                    ((x6.k) obj).h(e6.m.a(s.f23253a));
                    return;
                }
            }
        }
    }

    public final boolean i() {
        f0 f0Var;
        f0 f0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f48a;
        f0Var = m.f46a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, f0Var);
        q6.i.b(andSet);
        f0Var2 = m.f47b;
        return andSet == f0Var2;
    }
}
