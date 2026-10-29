package g7;

import c7.c0;
import c7.f0;
import e6.s;
import g6.i;
import i6.h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p6.l;
import p6.q;
import x6.j;
import x6.k;
import x6.k0;
import x6.l2;
import x6.m;

/* compiled from: MyApplication */
public class b extends d implements g7.a {

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f24050i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner$volatile");

    /* renamed from: h, reason: collision with root package name */
    private final q f24051h;
    private volatile /* synthetic */ Object owner$volatile;

    /* compiled from: MyApplication */
    private final class a implements j, l2 {

        /* renamed from: q, reason: collision with root package name */
        public final k f24052q;

        /* renamed from: r, reason: collision with root package name */
        public final Object f24053r;

        /* compiled from: MyApplication */
        /* renamed from: g7.b$a$a, reason: collision with other inner class name */
        static final class C0095a extends q6.j implements l {

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ b f24055r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ a f24056s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0095a(b bVar, a aVar) {
                super(1);
                this.f24055r = bVar;
                this.f24056s = aVar;
            }

            public final void c(Throwable th) {
                this.f24055r.a(this.f24056s.f24053r);
            }

            @Override // p6.l
            public /* bridge */ /* synthetic */ Object g(Object obj) {
                c((Throwable) obj);
                return s.f23253a;
            }
        }

        /* compiled from: MyApplication */
        /* renamed from: g7.b$a$b, reason: collision with other inner class name */
        static final class C0096b extends q6.j implements l {

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ b f24057r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ a f24058s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0096b(b bVar, a aVar) {
                super(1);
                this.f24057r = bVar;
                this.f24058s = aVar;
            }

            public final void c(Throwable th) {
                b.r().set(this.f24057r, this.f24058s.f24053r);
                this.f24057r.a(this.f24058s.f24053r);
            }

            @Override // p6.l
            public /* bridge */ /* synthetic */ Object g(Object obj) {
                c((Throwable) obj);
                return s.f23253a;
            }
        }

        public a(k kVar, Object obj) {
            this.f24052q = kVar;
            this.f24053r = obj;
        }

        @Override // x6.l2
        public void a(c0 c0Var, int i7) {
            this.f24052q.a(c0Var, i7);
        }

        @Override // x6.j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void v(s sVar, l lVar) {
            b.r().set(b.this, this.f24053r);
            this.f24052q.v(sVar, new C0095a(b.this, this));
        }

        @Override // x6.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Object f(s sVar, Object obj, l lVar) {
            Object f8 = this.f24052q.f(sVar, obj, new C0096b(b.this, this));
            if (f8 != null) {
                b.r().set(b.this, this.f24053r);
            }
            return f8;
        }

        @Override // g6.e
        public i getContext() {
            return this.f24052q.getContext();
        }

        @Override // g6.e
        public void h(Object obj) {
            this.f24052q.h(obj);
        }

        @Override // x6.j
        public void x(l lVar) {
            this.f24052q.x(lVar);
        }

        @Override // x6.j
        public void y(Object obj) {
            this.f24052q.y(obj);
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: g7.b$b, reason: collision with other inner class name */
    static final class C0097b extends q6.j implements q {

        /* compiled from: MyApplication */
        /* renamed from: g7.b$b$a */
        static final class a extends q6.j implements l {

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ b f24060r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ Object f24061s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Object obj) {
                super(1);
                this.f24060r = bVar;
                this.f24061s = obj;
            }

            public final void c(Throwable th) {
                this.f24060r.a(this.f24061s);
            }

            @Override // p6.l
            public /* bridge */ /* synthetic */ Object g(Object obj) {
                c((Throwable) obj);
                return s.f23253a;
            }
        }

        C0097b() {
            super(3);
        }

        public final l c(f7.a aVar, Object obj, Object obj2) {
            return new a(b.this, obj);
        }

        @Override // p6.q
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
            android.support.v4.media.session.b.a(obj);
            return c(null, obj2, obj3);
        }
    }

    public b(boolean z7) {
        super(1, z7 ? 1 : 0);
        this.owner$volatile = z7 ? null : c.f24062a;
        this.f24051h = new C0097b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater r() {
        return f24050i;
    }

    private final int s(Object obj) {
        f0 f0Var;
        while (t()) {
            Object obj2 = f24050i.get(this);
            f0Var = c.f24062a;
            if (obj2 != f0Var) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object u(b bVar, Object obj, g6.e eVar) {
        if (bVar.w(obj)) {
            return s.f23253a;
        }
        Object v7 = bVar.v(obj, eVar);
        return v7 == h6.b.e() ? v7 : s.f23253a;
    }

    private final Object v(Object obj, g6.e eVar) {
        k b8 = m.b(h6.b.c(eVar));
        try {
            c(new a(b8, obj));
            Object w7 = b8.w();
            if (w7 == h6.b.e()) {
                h.c(eVar);
            }
            return w7 == h6.b.e() ? w7 : s.f23253a;
        } catch (Throwable th) {
            b8.N();
            throw th;
        }
    }

    private final int x(Object obj) {
        while (!n()) {
            if (obj == null) {
                return 1;
            }
            int s7 = s(obj);
            if (s7 == 1) {
                return 2;
            }
            if (s7 == 2) {
                return 1;
            }
        }
        f24050i.set(this, obj);
        return 0;
    }

    @Override // g7.a
    public void a(Object obj) {
        f0 f0Var;
        f0 f0Var2;
        while (t()) {
            Object obj2 = f24050i.get(this);
            f0Var = c.f24062a;
            if (obj2 != f0Var) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24050i;
                f0Var2 = c.f24062a;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj2, f0Var2)) {
                    m();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    @Override // g7.a
    public Object b(Object obj, g6.e eVar) {
        return u(this, obj, eVar);
    }

    public boolean t() {
        return g() == 0;
    }

    public String toString() {
        return "Mutex@" + k0.b(this) + "[isLocked=" + t() + ",owner=" + f24050i.get(this) + ']';
    }

    public boolean w(Object obj) {
        int x7 = x(obj);
        if (x7 == 0) {
            return true;
        }
        if (x7 == 1) {
            return false;
        }
        if (x7 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }
}
