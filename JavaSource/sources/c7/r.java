package c7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: MyApplication */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3816a = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public r(boolean z7) {
        this._cur$volatile = new s(8, z7);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3816a;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            int a8 = sVar.a(obj);
            if (a8 == 0) {
                return true;
            }
            if (a8 == 1) {
                androidx.concurrent.futures.b.a(f3816a, this, sVar, sVar.l());
            } else if (a8 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3816a;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            if (sVar.d()) {
                return;
            } else {
                androidx.concurrent.futures.b.a(f3816a, this, sVar, sVar.l());
            }
        }
    }

    public final int c() {
        return ((s) f3816a.get(this)).g();
    }

    public final Object e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3816a;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            Object m7 = sVar.m();
            if (m7 != s.f3820h) {
                return m7;
            }
            androidx.concurrent.futures.b.a(f3816a, this, sVar, sVar.l());
        }
    }
}
