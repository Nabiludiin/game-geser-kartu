package x6;

import g6.i;

/* compiled from: MyApplication */
public abstract class c0 {

    /* compiled from: MyApplication */
    static final class a extends q6.j implements p6.p {

        /* renamed from: r, reason: collision with root package name */
        public static final a f27369r = new a();

        a() {
            super(2);
        }

        @Override // p6.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final g6.i i(g6.i iVar, i.b bVar) {
            return iVar.n(bVar);
        }
    }

    /* compiled from: MyApplication */
    static final class b extends q6.j implements p6.p {

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ q6.p f27370r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f27371s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q6.p pVar, boolean z7) {
            super(2);
            this.f27370r = pVar;
            this.f27371s = z7;
        }

        @Override // p6.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final g6.i i(g6.i iVar, i.b bVar) {
            return iVar.n(bVar);
        }
    }

    /* compiled from: MyApplication */
    static final class c extends q6.j implements p6.p {

        /* renamed from: r, reason: collision with root package name */
        public static final c f27372r = new c();

        c() {
            super(2);
        }

        public final Boolean c(boolean z7, i.b bVar) {
            return Boolean.valueOf(z7);
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ Object i(Object obj, Object obj2) {
            return c(((Boolean) obj).booleanValue(), (i.b) obj2);
        }
    }

    private static final g6.i a(g6.i iVar, g6.i iVar2, boolean z7) {
        boolean c8 = c(iVar);
        boolean c9 = c(iVar2);
        if (!c8 && !c9) {
            return iVar.n(iVar2);
        }
        q6.p pVar = new q6.p();
        pVar.f25710q = iVar2;
        g6.j jVar = g6.j.f24049q;
        g6.i iVar3 = (g6.i) iVar.s(jVar, new b(pVar, z7));
        if (c9) {
            pVar.f25710q = ((g6.i) pVar.f25710q).s(jVar, a.f27369r);
        }
        return iVar3.n((g6.i) pVar.f25710q);
    }

    public static final String b(g6.i iVar) {
        return null;
    }

    private static final boolean c(g6.i iVar) {
        return ((Boolean) iVar.s(Boolean.FALSE, c.f27372r)).booleanValue();
    }

    public static final g6.i d(g6.i iVar, g6.i iVar2) {
        return !c(iVar2) ? iVar.n(iVar2) : a(iVar, iVar2, false);
    }

    public static final g6.i e(g0 g0Var, g6.i iVar) {
        g6.i a8 = a(g0Var.a(), iVar, true);
        return (a8 == t0.a() || a8.e(g6.f.f24047n) != null) ? a8 : a8.n(t0.a());
    }

    public static final j2 f(i6.e eVar) {
        while (!(eVar instanceof q0) && (eVar = eVar.d()) != null) {
            if (eVar instanceof j2) {
                return (j2) eVar;
            }
        }
        return null;
    }

    public static final j2 g(g6.e eVar, g6.i iVar, Object obj) {
        if (!(eVar instanceof i6.e) || iVar.e(k2.f27404q) == null) {
            return null;
        }
        j2 f8 = f((i6.e) eVar);
        if (f8 != null) {
            f8.N0(iVar, obj);
        }
        return f8;
    }
}
