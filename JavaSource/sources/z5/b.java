package z5;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import w5.p;
import w5.q;

/* compiled from: MyApplication */
public final class b implements q {

    /* renamed from: q, reason: collision with root package name */
    private final y5.c f27911q;

    /* compiled from: MyApplication */
    private static final class a extends p {

        /* renamed from: a, reason: collision with root package name */
        private final p f27912a;

        /* renamed from: b, reason: collision with root package name */
        private final y5.h f27913b;

        public a(w5.d dVar, Type type, p pVar, y5.h hVar) {
            this.f27912a = new k(dVar, pVar, type);
            this.f27913b = hVar;
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection a(b6.a aVar) {
            if (aVar.R() == b6.b.NULL) {
                aVar.L();
                return null;
            }
            Collection collection = (Collection) this.f27913b.a();
            aVar.j();
            while (aVar.t()) {
                collection.add(this.f27912a.a(aVar));
            }
            aVar.o();
            return collection;
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, Collection collection) {
            if (collection == null) {
                cVar.q();
                return;
            }
            cVar.e();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.f27912a.c(cVar, it.next());
            }
            cVar.j();
        }
    }

    public b(y5.c cVar) {
        this.f27911q = cVar;
    }

    @Override // w5.q
    public p a(w5.d dVar, a6.a aVar) {
        Type d8 = aVar.d();
        Class c8 = aVar.c();
        if (!Collection.class.isAssignableFrom(c8)) {
            return null;
        }
        Type j7 = y5.b.j(d8, c8);
        return new a(dVar, j7, dVar.j(a6.a.b(j7)), this.f27911q.a(aVar));
    }
}
