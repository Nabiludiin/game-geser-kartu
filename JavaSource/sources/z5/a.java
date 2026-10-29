package z5;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import w5.p;
import w5.q;

/* compiled from: MyApplication */
public final class a extends p {

    /* renamed from: c, reason: collision with root package name */
    public static final q f27908c = new C0165a();

    /* renamed from: a, reason: collision with root package name */
    private final Class f27909a;

    /* renamed from: b, reason: collision with root package name */
    private final p f27910b;

    /* compiled from: MyApplication */
    /* renamed from: z5.a$a, reason: collision with other inner class name */
    static class C0165a implements q {
        C0165a() {
        }

        @Override // w5.q
        public p a(w5.d dVar, a6.a aVar) {
            Type d8 = aVar.d();
            if (!(d8 instanceof GenericArrayType) && (!(d8 instanceof Class) || !((Class) d8).isArray())) {
                return null;
            }
            Type i7 = y5.b.i(d8);
            return new a(dVar, dVar.j(a6.a.b(i7)), y5.b.m(i7));
        }
    }

    public a(w5.d dVar, p pVar, Class cls) {
        this.f27910b = new k(dVar, pVar, cls);
        this.f27909a = cls;
    }

    @Override // w5.p
    public Object a(b6.a aVar) {
        if (aVar.R() == b6.b.NULL) {
            aVar.L();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.j();
        while (aVar.t()) {
            arrayList.add(this.f27910b.a(aVar));
        }
        aVar.o();
        Object newInstance = Array.newInstance((Class<?>) this.f27909a, arrayList.size());
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            Array.set(newInstance, i7, arrayList.get(i7));
        }
        return newInstance;
    }

    @Override // w5.p
    public void c(b6.c cVar, Object obj) {
        if (obj == null) {
            cVar.q();
            return;
        }
        cVar.e();
        int length = Array.getLength(obj);
        for (int i7 = 0; i7 < length; i7++) {
            this.f27910b.c(cVar, Array.get(obj, i7));
        }
        cVar.j();
    }
}
