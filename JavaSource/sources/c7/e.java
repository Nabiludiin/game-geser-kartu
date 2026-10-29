package c7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: MyApplication */
public abstract class e {

    /* renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3774q = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_next$volatile");

    /* renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3775r = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public e(e eVar) {
        this._prev$volatile = eVar;
    }

    private final e c() {
        e g8 = g();
        while (g8 != null && g8.j()) {
            g8 = (e) f3775r.get(g8);
        }
        return g8;
    }

    private final e d() {
        e e8;
        e e9 = e();
        q6.i.b(e9);
        while (e9.j() && (e8 = e9.e()) != null) {
            e9 = e8;
        }
        return e9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f() {
        return f3774q.get(this);
    }

    public final void b() {
        f3775r.set(this, null);
    }

    public final e e() {
        Object f8 = f();
        if (f8 == d.f3773a) {
            return null;
        }
        return (e) f8;
    }

    public final e g() {
        return (e) f3775r.get(this);
    }

    public abstract boolean j();

    public final boolean k() {
        return e() == null;
    }

    public final boolean l() {
        return androidx.concurrent.futures.b.a(f3774q, this, null, d.f3773a);
    }

    public final void m() {
        Object obj;
        if (k()) {
            return;
        }
        while (true) {
            e c8 = c();
            e d8 = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3775r;
            do {
                obj = atomicReferenceFieldUpdater.get(d8);
            } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, d8, obj, ((e) obj) == null ? null : c8));
            if (c8 != null) {
                f3774q.set(c8, d8);
            }
            if (!d8.j() || d8.k()) {
                if (c8 == null || !c8.j()) {
                    return;
                }
            }
        }
    }

    public final boolean n(e eVar) {
        return androidx.concurrent.futures.b.a(f3774q, this, null, eVar);
    }
}
