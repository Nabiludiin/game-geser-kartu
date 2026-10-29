package z5;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import w5.p;
import z5.h;

/* compiled from: MyApplication */
final class k extends p {

    /* renamed from: a, reason: collision with root package name */
    private final w5.d f27946a;

    /* renamed from: b, reason: collision with root package name */
    private final p f27947b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f27948c;

    k(w5.d dVar, p pVar, Type type) {
        this.f27946a = dVar;
        this.f27947b = pVar;
        this.f27948c = type;
    }

    private Type d(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // w5.p
    public Object a(b6.a aVar) {
        return this.f27947b.a(aVar);
    }

    @Override // w5.p
    public void c(b6.c cVar, Object obj) {
        p pVar = this.f27947b;
        Type d8 = d(this.f27948c, obj);
        if (d8 != this.f27948c) {
            pVar = this.f27946a.j(a6.a.b(d8));
            if (pVar instanceof h.b) {
                p pVar2 = this.f27947b;
                if (!(pVar2 instanceof h.b)) {
                    pVar = pVar2;
                }
            }
        }
        pVar.c(cVar, obj);
    }
}
