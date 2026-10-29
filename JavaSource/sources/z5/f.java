package z5;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import w5.n;
import w5.p;
import w5.q;

/* compiled from: MyApplication */
public final class f implements q {

    /* renamed from: q, reason: collision with root package name */
    private final y5.c f27919q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f27920r;

    /* compiled from: MyApplication */
    private final class a extends p {

        /* renamed from: a, reason: collision with root package name */
        private final p f27921a;

        /* renamed from: b, reason: collision with root package name */
        private final p f27922b;

        /* renamed from: c, reason: collision with root package name */
        private final y5.h f27923c;

        public a(w5.d dVar, Type type, p pVar, Type type2, p pVar2, y5.h hVar) {
            this.f27921a = new k(dVar, pVar, type);
            this.f27922b = new k(dVar, pVar2, type2);
            this.f27923c = hVar;
        }

        private String d(w5.g gVar) {
            if (!gVar.k()) {
                if (gVar.i()) {
                    return "null";
                }
                throw new AssertionError();
            }
            w5.l g8 = gVar.g();
            if (g8.r()) {
                return String.valueOf(g8.n());
            }
            if (g8.p()) {
                return Boolean.toString(g8.l());
            }
            if (g8.t()) {
                return g8.o();
            }
            throw new AssertionError();
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map a(b6.a aVar) {
            b6.b R = aVar.R();
            if (R == b6.b.NULL) {
                aVar.L();
                return null;
            }
            Map map = (Map) this.f27923c.a();
            if (R != b6.b.BEGIN_ARRAY) {
                aVar.k();
                while (aVar.t()) {
                    y5.e.f27771a.a(aVar);
                    Object a8 = this.f27921a.a(aVar);
                    if (map.put(a8, this.f27922b.a(aVar)) != null) {
                        throw new n("duplicate key: " + a8);
                    }
                }
                aVar.p();
                return map;
            }
            aVar.j();
            while (aVar.t()) {
                aVar.j();
                Object a9 = this.f27921a.a(aVar);
                if (map.put(a9, this.f27922b.a(aVar)) != null) {
                    throw new n("duplicate key: " + a9);
                }
                aVar.o();
            }
            aVar.o();
            return map;
        }

        @Override // w5.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, Map map) {
            if (map == null) {
                cVar.q();
                return;
            }
            if (!f.this.f27920r) {
                cVar.g();
                for (Map.Entry entry : map.entrySet()) {
                    cVar.o(String.valueOf(entry.getKey()));
                    this.f27922b.c(cVar, entry.getValue());
                }
                cVar.k();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i7 = 0;
            boolean z7 = false;
            for (Map.Entry entry2 : map.entrySet()) {
                w5.g b8 = this.f27921a.b(entry2.getKey());
                arrayList.add(b8);
                arrayList2.add(entry2.getValue());
                z7 |= b8.h() || b8.j();
            }
            if (!z7) {
                cVar.g();
                while (i7 < arrayList.size()) {
                    cVar.o(d((w5.g) arrayList.get(i7)));
                    this.f27922b.c(cVar, arrayList2.get(i7));
                    i7++;
                }
                cVar.k();
                return;
            }
            cVar.e();
            while (i7 < arrayList.size()) {
                cVar.e();
                y5.j.a((w5.g) arrayList.get(i7), cVar);
                this.f27922b.c(cVar, arrayList2.get(i7));
                cVar.j();
                i7++;
            }
            cVar.j();
        }
    }

    public f(y5.c cVar, boolean z7) {
        this.f27919q = cVar;
        this.f27920r = z7;
    }

    private p c(w5.d dVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? l.f27954f : dVar.j(a6.a.b(type));
    }

    @Override // w5.q
    public p a(w5.d dVar, a6.a aVar) {
        Type d8 = aVar.d();
        if (!Map.class.isAssignableFrom(aVar.c())) {
            return null;
        }
        Type[] l7 = y5.b.l(d8, y5.b.m(d8));
        return new a(dVar, l7[0], c(dVar, l7[0]), l7[1], dVar.j(a6.a.b(l7[1])), this.f27919q.a(aVar));
    }
}
