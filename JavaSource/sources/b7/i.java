package b7;

import e6.m;
import e6.s;
import g6.i;
import p6.p;
import p6.q;
import x6.q1;

/* compiled from: MyApplication */
public final class i extends i6.d implements a7.c, i6.e {

    /* renamed from: t, reason: collision with root package name */
    public final a7.c f3452t;

    /* renamed from: u, reason: collision with root package name */
    public final g6.i f3453u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3454v;

    /* renamed from: w, reason: collision with root package name */
    private g6.i f3455w;

    /* renamed from: x, reason: collision with root package name */
    private g6.e f3456x;

    /* compiled from: MyApplication */
    static final class a extends q6.j implements p {

        /* renamed from: r, reason: collision with root package name */
        public static final a f3457r = new a();

        a() {
            super(2);
        }

        public final Integer c(int i7, i.b bVar) {
            return Integer.valueOf(i7 + 1);
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ Object i(Object obj, Object obj2) {
            return c(((Number) obj).intValue(), (i.b) obj2);
        }
    }

    public i(a7.c cVar, g6.i iVar) {
        super(g.f3447q, g6.j.f24049q);
        this.f3452t = cVar;
        this.f3453u = iVar;
        this.f3454v = ((Number) iVar.s(0, a.f3457r)).intValue();
    }

    private final void p(g6.i iVar, g6.i iVar2, Object obj) {
        if (iVar2 instanceof e) {
            r((e) iVar2, obj);
        }
        k.a(this, iVar);
    }

    private final Object q(g6.e eVar, Object obj) {
        q qVar;
        g6.i context = eVar.getContext();
        q1.d(context);
        g6.i iVar = this.f3455w;
        if (iVar != context) {
            p(context, iVar, obj);
            this.f3455w = context;
        }
        this.f3456x = eVar;
        qVar = j.f3458a;
        a7.c cVar = this.f3452t;
        q6.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        q6.i.c(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object e8 = qVar.e(cVar, obj, this);
        if (!q6.i.a(e8, h6.b.e())) {
            this.f3456x = null;
        }
        return e8;
    }

    private final void r(e eVar, Object obj) {
        throw new IllegalStateException(w6.e.i("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + eVar.f3445q + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // a7.c
    public Object c(Object obj, g6.e eVar) {
        try {
            Object q7 = q(eVar, obj);
            if (q7 == h6.b.e()) {
                i6.h.c(eVar);
            }
            return q7 == h6.b.e() ? q7 : s.f23253a;
        } catch (Throwable th) {
            this.f3455w = new e(th, eVar.getContext());
            throw th;
        }
    }

    @Override // i6.a, i6.e
    public i6.e d() {
        g6.e eVar = this.f3456x;
        if (eVar instanceof i6.e) {
            return (i6.e) eVar;
        }
        return null;
    }

    @Override // i6.d, g6.e
    public g6.i getContext() {
        g6.i iVar = this.f3455w;
        return iVar == null ? g6.j.f24049q : iVar;
    }

    @Override // i6.a
    public StackTraceElement l() {
        return null;
    }

    @Override // i6.a
    public Object m(Object obj) {
        Throwable b8 = m.b(obj);
        if (b8 != null) {
            this.f3455w = new e(b8, getContext());
        }
        g6.e eVar = this.f3456x;
        if (eVar != null) {
            eVar.h(obj);
        }
        return h6.b.e();
    }

    @Override // i6.d, i6.a
    public void n() {
        super.n();
    }
}
