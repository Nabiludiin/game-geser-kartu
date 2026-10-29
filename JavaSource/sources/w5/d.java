package w5;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal f27159a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f27160b;

    /* renamed from: c, reason: collision with root package name */
    private final List f27161c;

    /* renamed from: d, reason: collision with root package name */
    private final y5.c f27162d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f27163e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f27164f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f27165g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f27166h;

    /* renamed from: i, reason: collision with root package name */
    final w5.f f27167i;

    /* renamed from: j, reason: collision with root package name */
    final m f27168j;

    /* compiled from: MyApplication */
    class a implements w5.f {
        a() {
        }
    }

    /* compiled from: MyApplication */
    class b implements m {
        b() {
        }
    }

    /* compiled from: MyApplication */
    class c extends p {
        c() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Double a(b6.a aVar) {
            if (aVar.R() != b6.b.NULL) {
                return Double.valueOf(aVar.B());
            }
            aVar.L();
            return null;
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, Number number) {
            if (number == null) {
                cVar.q();
                return;
            }
            d.this.c(number.doubleValue());
            cVar.I(number);
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: w5.d$d, reason: collision with other inner class name */
    class C0142d extends p {
        C0142d() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Float a(b6.a aVar) {
            if (aVar.R() != b6.b.NULL) {
                return Float.valueOf((float) aVar.B());
            }
            aVar.L();
            return null;
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, Number number) {
            if (number == null) {
                cVar.q();
                return;
            }
            d.this.c(number.floatValue());
            cVar.I(number);
        }
    }

    /* compiled from: MyApplication */
    class e extends p {
        e() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Number a(b6.a aVar) {
            if (aVar.R() != b6.b.NULL) {
                return Long.valueOf(aVar.G());
            }
            aVar.L();
            return null;
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, Number number) {
            if (number == null) {
                cVar.q();
            } else {
                cVar.L(number.toString());
            }
        }
    }

    /* compiled from: MyApplication */
    static class f extends p {

        /* renamed from: a, reason: collision with root package name */
        private p f27174a;

        f() {
        }

        @Override // w5.p
        public Object a(b6.a aVar) {
            p pVar = this.f27174a;
            if (pVar != null) {
                return pVar.a(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // w5.p
        public void c(b6.c cVar, Object obj) {
            p pVar = this.f27174a;
            if (pVar == null) {
                throw new IllegalStateException();
            }
            pVar.c(cVar, obj);
        }

        public void d(p pVar) {
            if (this.f27174a != null) {
                throw new AssertionError();
            }
            this.f27174a = pVar;
        }
    }

    public d() {
        this(y5.d.f27758w, w5.b.f27153q, Collections.EMPTY_MAP, false, false, false, true, false, false, o.f27180q, Collections.EMPTY_LIST);
    }

    private static void b(Object obj, b6.a aVar) {
        if (obj != null) {
            try {
                if (aVar.R() == b6.b.END_DOCUMENT) {
                } else {
                    throw new h("JSON document was not fully consumed.");
                }
            } catch (b6.d e8) {
                throw new n(e8);
            } catch (IOException e9) {
                throw new h(e9);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(double d8) {
        if (Double.isNaN(d8) || Double.isInfinite(d8)) {
            throw new IllegalArgumentException(d8 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private p d(boolean z7) {
        return z7 ? z5.l.f27964p : new c();
    }

    private p e(boolean z7) {
        return z7 ? z5.l.f27963o : new C0142d();
    }

    private p m(o oVar) {
        return oVar == o.f27180q ? z5.l.f27962n : new e();
    }

    public Object f(b6.a aVar, Type type) {
        boolean u7 = aVar.u();
        boolean z7 = true;
        aVar.a0(true);
        try {
            try {
                try {
                    aVar.R();
                    z7 = false;
                    return j(a6.a.b(type)).a(aVar);
                } catch (IOException e8) {
                    throw new n(e8);
                }
            } catch (EOFException e9) {
                if (!z7) {
                    throw new n(e9);
                }
                aVar.a0(u7);
                return null;
            } catch (IllegalStateException e10) {
                throw new n(e10);
            }
        } finally {
            aVar.a0(u7);
        }
    }

    public Object g(Reader reader, Type type) {
        b6.a aVar = new b6.a(reader);
        Object f8 = f(aVar, type);
        b(f8, aVar);
        return f8;
    }

    public Object h(String str, Class cls) {
        return y5.i.c(cls).cast(i(str, cls));
    }

    public Object i(String str, Type type) {
        if (str == null) {
            return null;
        }
        return g(new StringReader(str), type);
    }

    public p j(a6.a aVar) {
        boolean z7;
        p pVar = (p) this.f27160b.get(aVar);
        if (pVar != null) {
            return pVar;
        }
        Map map = (Map) this.f27159a.get();
        if (map == null) {
            map = new HashMap();
            this.f27159a.set(map);
            z7 = true;
        } else {
            z7 = false;
        }
        f fVar = (f) map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            f fVar2 = new f();
            map.put(aVar, fVar2);
            Iterator it = this.f27161c.iterator();
            while (it.hasNext()) {
                p a8 = ((q) it.next()).a(this, aVar);
                if (a8 != null) {
                    fVar2.d(a8);
                    this.f27160b.put(aVar, a8);
                    return a8;
                }
            }
            throw new IllegalArgumentException("GSON cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z7) {
                this.f27159a.remove();
            }
        }
    }

    public p k(Class cls) {
        return j(a6.a.a(cls));
    }

    public p l(q qVar, a6.a aVar) {
        boolean z7 = !this.f27161c.contains(qVar);
        for (q qVar2 : this.f27161c) {
            if (z7) {
                p a8 = qVar2.a(this, aVar);
                if (a8 != null) {
                    return a8;
                }
            } else if (qVar2 == qVar) {
                z7 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public b6.c n(Writer writer) {
        if (this.f27165g) {
            writer.write(")]}'\n");
        }
        b6.c cVar = new b6.c(writer);
        if (this.f27166h) {
            cVar.z("  ");
        }
        cVar.F(this.f27163e);
        return cVar;
    }

    public String o(Object obj) {
        return obj == null ? q(i.f27176q) : p(obj, obj.getClass());
    }

    public String p(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        s(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public String q(g gVar) {
        StringWriter stringWriter = new StringWriter();
        u(gVar, stringWriter);
        return stringWriter.toString();
    }

    public void r(Object obj, Type type, b6.c cVar) {
        p j7 = j(a6.a.b(type));
        boolean n7 = cVar.n();
        cVar.B(true);
        boolean m7 = cVar.m();
        cVar.w(this.f27164f);
        boolean l7 = cVar.l();
        cVar.F(this.f27163e);
        try {
            try {
                j7.c(cVar, obj);
            } catch (IOException e8) {
                throw new h(e8);
            }
        } finally {
            cVar.B(n7);
            cVar.w(m7);
            cVar.F(l7);
        }
    }

    public void s(Object obj, Type type, Appendable appendable) {
        try {
            r(obj, type, n(y5.j.b(appendable)));
        } catch (IOException e8) {
            throw new h(e8);
        }
    }

    public void t(g gVar, b6.c cVar) {
        boolean n7 = cVar.n();
        cVar.B(true);
        boolean m7 = cVar.m();
        cVar.w(this.f27164f);
        boolean l7 = cVar.l();
        cVar.F(this.f27163e);
        try {
            try {
                y5.j.a(gVar, cVar);
            } catch (IOException e8) {
                throw new h(e8);
            }
        } finally {
            cVar.B(n7);
            cVar.w(m7);
            cVar.F(l7);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f27163e + "factories:" + this.f27161c + ",instanceCreators:" + this.f27162d + "}";
    }

    public void u(g gVar, Appendable appendable) {
        try {
            t(gVar, n(y5.j.b(appendable)));
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    d(y5.d dVar, w5.c cVar, Map map, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, o oVar, List list) {
        this.f27159a = new ThreadLocal();
        this.f27160b = Collections.synchronizedMap(new HashMap());
        this.f27167i = new a();
        this.f27168j = new b();
        y5.c cVar2 = new y5.c(map);
        this.f27162d = cVar2;
        this.f27163e = z7;
        this.f27165g = z9;
        this.f27164f = z10;
        this.f27166h = z11;
        ArrayList arrayList = new ArrayList();
        arrayList.add(z5.l.Q);
        arrayList.add(z5.g.f27925b);
        arrayList.add(dVar);
        arrayList.addAll(list);
        arrayList.add(z5.l.f27972x);
        arrayList.add(z5.l.f27961m);
        arrayList.add(z5.l.f27955g);
        arrayList.add(z5.l.f27957i);
        arrayList.add(z5.l.f27959k);
        arrayList.add(z5.l.a(Long.TYPE, Long.class, m(oVar)));
        arrayList.add(z5.l.a(Double.TYPE, Double.class, d(z12)));
        arrayList.add(z5.l.a(Float.TYPE, Float.class, e(z12)));
        arrayList.add(z5.l.f27966r);
        arrayList.add(z5.l.f27968t);
        arrayList.add(z5.l.f27974z);
        arrayList.add(z5.l.B);
        arrayList.add(z5.l.b(BigDecimal.class, z5.l.f27970v));
        arrayList.add(z5.l.b(BigInteger.class, z5.l.f27971w));
        arrayList.add(z5.l.D);
        arrayList.add(z5.l.F);
        arrayList.add(z5.l.J);
        arrayList.add(z5.l.O);
        arrayList.add(z5.l.H);
        arrayList.add(z5.l.f27952d);
        arrayList.add(z5.c.f27914d);
        arrayList.add(z5.l.M);
        arrayList.add(z5.j.f27944b);
        arrayList.add(z5.i.f27942b);
        arrayList.add(z5.l.K);
        arrayList.add(z5.a.f27908c);
        arrayList.add(z5.l.f27950b);
        arrayList.add(new z5.b(cVar2));
        arrayList.add(new z5.f(cVar2, z8));
        arrayList.add(new z5.d(cVar2));
        arrayList.add(z5.l.R);
        arrayList.add(new z5.h(cVar2, cVar, dVar));
        this.f27161c = Collections.unmodifiableList(arrayList);
    }
}
