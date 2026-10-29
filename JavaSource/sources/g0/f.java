package g0;

import java.util.List;
import x6.f2;
import x6.g0;
import x6.h0;
import x6.t0;

/* compiled from: MyApplication */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f23829a = new f();

    private f() {
    }

    public static /* synthetic */ e b(f fVar, j jVar, h0.b bVar, List list, g0 g0Var, p6.a aVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            bVar = null;
        }
        if ((i7 & 4) != 0) {
            list = f6.l.c();
        }
        if ((i7 & 8) != 0) {
            g0Var = h0.a(t0.b().n(f2.b(null, 1, null)));
        }
        return fVar.a(jVar, bVar, list, g0Var, aVar);
    }

    public final e a(j jVar, h0.b bVar, List list, g0 g0Var, p6.a aVar) {
        q6.i.e(jVar, "serializer");
        q6.i.e(list, "migrations");
        q6.i.e(g0Var, "scope");
        q6.i.e(aVar, "produceFile");
        return new l(aVar, jVar, f6.l.a(d.f23813a.b(list)), new h0.a(), g0Var);
    }
}
