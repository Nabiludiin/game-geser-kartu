package z5;

import w5.p;
import w5.q;

/* compiled from: MyApplication */
public final class d implements q {

    /* renamed from: q, reason: collision with root package name */
    private final y5.c f27918q;

    public d(y5.c cVar) {
        this.f27918q = cVar;
    }

    static p b(y5.c cVar, w5.d dVar, a6.a aVar, x5.b bVar) {
        Class value = bVar.value();
        if (p.class.isAssignableFrom(value)) {
            return (p) cVar.a(a6.a.a(value)).a();
        }
        if (q.class.isAssignableFrom(value)) {
            return ((q) cVar.a(a6.a.a(value)).a()).a(dVar, aVar);
        }
        throw new IllegalArgumentException("@JsonAdapter value must be TypeAdapter or TypeAdapterFactory reference.");
    }

    @Override // w5.q
    public p a(w5.d dVar, a6.a aVar) {
        x5.b bVar = (x5.b) aVar.c().getAnnotation(x5.b.class);
        if (bVar == null) {
            return null;
        }
        return b(this.f27918q, dVar, aVar, bVar);
    }
}
