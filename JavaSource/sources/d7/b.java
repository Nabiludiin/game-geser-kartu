package d7;

import c7.b0;
import c7.j0;
import e6.m;
import e6.n;
import g6.e;
import g6.i;
import i6.h;
import p6.p;
import q6.s;
import x6.u1;
import x6.x;

/* compiled from: MyApplication */
public abstract class b {
    public static final void a(p pVar, Object obj, e eVar) {
        e a8 = h.a(eVar);
        try {
            i context = eVar.getContext();
            Object c8 = j0.c(context, null);
            try {
                Object d8 = !(pVar instanceof i6.a) ? h6.b.d(pVar, obj, a8) : ((p) s.a(pVar, 2)).i(obj, a8);
                j0.a(context, c8);
                if (d8 != h6.b.e()) {
                    a8.h(m.a(d8));
                }
            } catch (Throwable th) {
                j0.a(context, c8);
                throw th;
            }
        } catch (Throwable th2) {
            m.a aVar = m.f23247q;
            a8.h(m.a(n.a(th2)));
        }
    }

    public static final Object b(b0 b0Var, Object obj, p pVar) {
        Object xVar;
        try {
            xVar = !(pVar instanceof i6.a) ? h6.b.d(pVar, obj, b0Var) : ((p) s.a(pVar, 2)).i(obj, b0Var);
        } catch (Throwable th) {
            xVar = new x(th, false, 2, null);
        }
        if (xVar == h6.b.e()) {
            return h6.b.e();
        }
        Object l02 = b0Var.l0(xVar);
        if (l02 == u1.f27440b) {
            return h6.b.e();
        }
        if (l02 instanceof x) {
            throw ((x) l02).f27456a;
        }
        return u1.h(l02);
    }
}
