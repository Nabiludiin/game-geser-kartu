package x6;

import e6.m;

/* compiled from: MyApplication */
public abstract class b0 {
    public static final Object a(Object obj, g6.e eVar) {
        if (!(obj instanceof x)) {
            return e6.m.a(obj);
        }
        m.a aVar = e6.m.f23247q;
        return e6.m.a(e6.n.a(((x) obj).f27456a));
    }

    public static final Object b(Object obj, p6.l lVar) {
        Throwable b8 = e6.m.b(obj);
        return b8 == null ? lVar != null ? new y(obj, lVar) : obj : new x(b8, false, 2, null);
    }

    public static final Object c(Object obj, j jVar) {
        Throwable b8 = e6.m.b(obj);
        return b8 == null ? obj : new x(b8, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, p6.l lVar, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            lVar = null;
        }
        return b(obj, lVar);
    }
}
