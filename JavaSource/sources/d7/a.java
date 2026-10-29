package d7;

import c7.k;
import e6.m;
import e6.n;
import e6.s;
import g6.e;
import p6.l;
import p6.p;

/* compiled from: MyApplication */
public abstract class a {
    private static final void a(e eVar, Throwable th) {
        m.a aVar = m.f23247q;
        eVar.h(m.a(n.a(th)));
        throw th;
    }

    public static final void b(e eVar, e eVar2) {
        try {
            e c8 = h6.b.c(eVar);
            m.a aVar = m.f23247q;
            k.c(c8, m.a(s.f23253a), null, 2, null);
        } catch (Throwable th) {
            a(eVar2, th);
        }
    }

    public static final void c(p pVar, Object obj, e eVar, l lVar) {
        try {
            e c8 = h6.b.c(h6.b.a(pVar, obj, eVar));
            m.a aVar = m.f23247q;
            k.b(c8, m.a(s.f23253a), lVar);
        } catch (Throwable th) {
            a(eVar, th);
        }
    }

    public static /* synthetic */ void d(p pVar, Object obj, e eVar, l lVar, int i7, Object obj2) {
        if ((i7 & 4) != 0) {
            lVar = null;
        }
        c(pVar, obj, eVar, lVar);
    }
}
