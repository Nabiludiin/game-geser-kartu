package g6;

import g6.f;
import g6.i;
import p6.p;

/* compiled from: MyApplication */
public interface i {

    /* compiled from: MyApplication */
    public static final class a {
        public static i b(i iVar, i iVar2) {
            q6.i.e(iVar2, "context");
            return iVar2 == j.f24049q ? iVar : (i) iVar2.s(iVar, new p() { // from class: g6.h
                @Override // p6.p
                public final Object i(Object obj, Object obj2) {
                    i c8;
                    c8 = i.a.c((i) obj, (i.b) obj2);
                    return c8;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i c(i iVar, b bVar) {
            q6.i.e(iVar, "acc");
            q6.i.e(bVar, "element");
            i H = iVar.H(bVar.getKey());
            j jVar = j.f24049q;
            if (H == jVar) {
                return bVar;
            }
            f.b bVar2 = f.f24047n;
            f fVar = (f) H.e(bVar2);
            if (fVar == null) {
                return new d(H, bVar);
            }
            i H2 = H.H(bVar2);
            return H2 == jVar ? new d(bVar, fVar) : new d(new d(H2, bVar), fVar);
        }
    }

    /* compiled from: MyApplication */
    public interface b extends i {

        /* compiled from: MyApplication */
        public static final class a {
            public static Object a(b bVar, Object obj, p pVar) {
                q6.i.e(pVar, "operation");
                return pVar.i(obj, bVar);
            }

            public static b b(b bVar, c cVar) {
                q6.i.e(cVar, "key");
                if (!q6.i.a(bVar.getKey(), cVar)) {
                    return null;
                }
                q6.i.c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static i c(b bVar, c cVar) {
                q6.i.e(cVar, "key");
                return q6.i.a(bVar.getKey(), cVar) ? j.f24049q : bVar;
            }

            public static i d(b bVar, i iVar) {
                q6.i.e(iVar, "context");
                return a.b(bVar, iVar);
            }
        }

        @Override // g6.i
        b e(c cVar);

        c getKey();
    }

    /* compiled from: MyApplication */
    public interface c {
    }

    i H(c cVar);

    b e(c cVar);

    i n(i iVar);

    Object s(Object obj, p pVar);
}
