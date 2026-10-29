package x6;

import g6.f;
import g6.i;

/* compiled from: MyApplication */
public abstract class d0 extends g6.a implements g6.f {

    /* renamed from: r, reason: collision with root package name */
    public static final a f27375r = new a(null);

    /* compiled from: MyApplication */
    public static final class a extends g6.b {

        /* compiled from: MyApplication */
        /* renamed from: x6.d0$a$a, reason: collision with other inner class name */
        static final class C0148a extends q6.j implements p6.l {

            /* renamed from: r, reason: collision with root package name */
            public static final C0148a f27376r = new C0148a();

            C0148a() {
                super(1);
            }

            @Override // p6.l
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final d0 g(i.b bVar) {
                if (bVar instanceof d0) {
                    return (d0) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(q6.e eVar) {
            this();
        }

        private a() {
            super(g6.f.f24047n, C0148a.f27376r);
        }
    }

    public d0() {
        super(g6.f.f24047n);
    }

    @Override // g6.a, g6.i
    public g6.i H(i.c cVar) {
        return f.a.b(this, cVar);
    }

    public boolean I(g6.i iVar) {
        return true;
    }

    public d0 L(int i7) {
        c7.n.a(i7);
        return new c7.m(this, i7);
    }

    @Override // g6.a, g6.i.b, g6.i
    public i.b e(i.c cVar) {
        return f.a.a(this, cVar);
    }

    public abstract void h(g6.i iVar, Runnable runnable);

    @Override // g6.f
    public final g6.e o(g6.e eVar) {
        return new c7.j(this, eVar);
    }

    @Override // g6.f
    public final void r(g6.e eVar) {
        q6.i.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((c7.j) eVar).q();
    }

    public String toString() {
        return k0.a(this) + '@' + k0.b(this);
    }
}
