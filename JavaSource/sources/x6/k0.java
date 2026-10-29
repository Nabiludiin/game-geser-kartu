package x6;

import e6.m;

/* compiled from: MyApplication */
public abstract class k0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(g6.e eVar) {
        Object a8;
        if (eVar instanceof c7.j) {
            return eVar.toString();
        }
        try {
            m.a aVar = e6.m.f23247q;
            a8 = e6.m.a(eVar + '@' + b(eVar));
        } catch (Throwable th) {
            m.a aVar2 = e6.m.f23247q;
            a8 = e6.m.a(e6.n.a(th));
        }
        if (e6.m.b(a8) != null) {
            a8 = eVar.getClass().getName() + '@' + b(eVar);
        }
        return (String) a8;
    }
}
