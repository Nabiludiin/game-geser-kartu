package e7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q6.p;

/* compiled from: MyApplication */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f23303b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f23304c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f23305d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f23306e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray f23307a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    private final h b(h hVar) {
        if (e() == 127) {
            return hVar;
        }
        if (hVar.f23291r.b() == 1) {
            f23306e.incrementAndGet(this);
        }
        int i7 = f23304c.get(this) & 127;
        while (this.f23307a.get(i7) != null) {
            Thread.yield();
        }
        this.f23307a.lazySet(i7, hVar);
        f23304c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar == null || hVar.f23291r.b() != 1) {
            return;
        }
        f23306e.decrementAndGet(this);
    }

    private final int e() {
        return f23304c.get(this) - f23305d.get(this);
    }

    private final h m() {
        h hVar;
        while (true) {
            int i7 = f23305d.get(this);
            if (i7 - f23304c.get(this) == 0) {
                return null;
            }
            int i8 = i7 & 127;
            if (f23305d.compareAndSet(this, i7, i7 + 1) && (hVar = (h) this.f23307a.getAndSet(i8, null)) != null) {
                c(hVar);
                return hVar;
            }
        }
    }

    private final boolean n(d dVar) {
        h m7 = m();
        if (m7 == null) {
            return false;
        }
        dVar.a(m7);
        return true;
    }

    private final h o(boolean z7) {
        h hVar;
        do {
            hVar = (h) f23303b.get(this);
            if (hVar != null) {
                if ((hVar.f23291r.b() == 1) == z7) {
                }
            }
            int i7 = f23305d.get(this);
            int i8 = f23304c.get(this);
            while (i7 != i8) {
                if (z7 && f23306e.get(this) == 0) {
                    return null;
                }
                i8--;
                h q7 = q(i8, z7);
                if (q7 != null) {
                    return q7;
                }
            }
            return null;
        } while (!androidx.concurrent.futures.b.a(f23303b, this, hVar, null));
        return hVar;
    }

    private final h p(int i7) {
        int i8 = f23305d.get(this);
        int i9 = f23304c.get(this);
        boolean z7 = i7 == 1;
        while (i8 != i9) {
            if (z7 && f23306e.get(this) == 0) {
                return null;
            }
            int i10 = i8 + 1;
            h q7 = q(i8, z7);
            if (q7 != null) {
                return q7;
            }
            i8 = i10;
        }
        return null;
    }

    private final h q(int i7, boolean z7) {
        int i8 = i7 & 127;
        h hVar = (h) this.f23307a.get(i8);
        if (hVar != null) {
            if ((hVar.f23291r.b() == 1) == z7 && z6.g.a(this.f23307a, i8, hVar, null)) {
                if (z7) {
                    f23306e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }

    private final long s(int i7, p pVar) {
        h hVar;
        do {
            hVar = (h) f23303b.get(this);
            if (hVar == null) {
                return -2L;
            }
            if (((hVar.f23291r.b() != 1 ? 2 : 1) & i7) == 0) {
                return -2L;
            }
            long a8 = l.f23299f.a() - hVar.f23290q;
            long j7 = l.f23295b;
            if (a8 < j7) {
                return j7 - a8;
            }
        } while (!androidx.concurrent.futures.b.a(f23303b, this, hVar, null));
        pVar.f25710q = hVar;
        return -1L;
    }

    public final h a(h hVar, boolean z7) {
        if (z7) {
            return b(hVar);
        }
        h hVar2 = (h) f23303b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int i() {
        return f23303b.get(this) != null ? e() + 1 : e();
    }

    public final void j(d dVar) {
        h hVar = (h) f23303b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (n(dVar)) {
        }
    }

    public final h k() {
        h hVar = (h) f23303b.getAndSet(this, null);
        return hVar == null ? m() : hVar;
    }

    public final h l() {
        return o(true);
    }

    public final long r(int i7, p pVar) {
        h m7 = i7 == 3 ? m() : p(i7);
        if (m7 == null) {
            return s(i7, pVar);
        }
        pVar.f25710q = m7;
        return -1L;
    }
}
