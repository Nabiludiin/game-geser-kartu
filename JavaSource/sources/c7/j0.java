package c7;

import g6.i;
import x6.g2;

/* compiled from: MyApplication */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f3789a = new f0("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    private static final p6.p f3790b = a.f3793r;

    /* renamed from: c, reason: collision with root package name */
    private static final p6.p f3791c = b.f3794r;

    /* renamed from: d, reason: collision with root package name */
    private static final p6.p f3792d = c.f3795r;

    /* compiled from: MyApplication */
    static final class a extends q6.j implements p6.p {

        /* renamed from: r, reason: collision with root package name */
        public static final a f3793r = new a();

        a() {
            super(2);
        }

        @Override // p6.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object i(Object obj, i.b bVar) {
            if (!(bVar instanceof g2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    /* compiled from: MyApplication */
    static final class b extends q6.j implements p6.p {

        /* renamed from: r, reason: collision with root package name */
        public static final b f3794r = new b();

        b() {
            super(2);
        }

        @Override // p6.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final g2 i(g2 g2Var, i.b bVar) {
            if (g2Var != null) {
                return g2Var;
            }
            if (bVar instanceof g2) {
                return (g2) bVar;
            }
            return null;
        }
    }

    /* compiled from: MyApplication */
    static final class c extends q6.j implements p6.p {

        /* renamed from: r, reason: collision with root package name */
        public static final c f3795r = new c();

        c() {
            super(2);
        }

        @Override // p6.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final n0 i(n0 n0Var, i.b bVar) {
            if (bVar instanceof g2) {
                g2 g2Var = (g2) bVar;
                n0Var.a(g2Var, g2Var.p(n0Var.f3806a));
            }
            return n0Var;
        }
    }

    public static final void a(g6.i iVar, Object obj) {
        if (obj == f3789a) {
            return;
        }
        if (obj instanceof n0) {
            ((n0) obj).b(iVar);
            return;
        }
        Object s7 = iVar.s(null, f3791c);
        q6.i.c(s7, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((g2) s7).l(iVar, obj);
    }

    public static final Object b(g6.i iVar) {
        Object s7 = iVar.s(0, f3790b);
        q6.i.b(s7);
        return s7;
    }

    public static final Object c(g6.i iVar, Object obj) {
        if (obj == null) {
            obj = b(iVar);
        }
        if (obj == 0) {
            return f3789a;
        }
        if (obj instanceof Integer) {
            return iVar.s(new n0(iVar, ((Number) obj).intValue()), f3792d);
        }
        q6.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((g2) obj).p(iVar);
    }
}
