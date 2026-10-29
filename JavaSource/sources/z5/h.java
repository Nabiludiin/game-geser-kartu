package z5;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import w5.n;
import w5.p;
import w5.q;

/* compiled from: MyApplication */
public final class h implements q {

    /* renamed from: q, reason: collision with root package name */
    private final y5.c f27928q;

    /* renamed from: r, reason: collision with root package name */
    private final w5.c f27929r;

    /* renamed from: s, reason: collision with root package name */
    private final y5.d f27930s;

    /* compiled from: MyApplication */
    class a extends c {

        /* renamed from: d, reason: collision with root package name */
        final p f27931d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ w5.d f27932e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Field f27933f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ a6.a f27934g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f27935h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z7, boolean z8, w5.d dVar, Field field, a6.a aVar, boolean z9) {
            super(str, z7, z8);
            this.f27932e = dVar;
            this.f27933f = field;
            this.f27934g = aVar;
            this.f27935h = z9;
            this.f27931d = h.this.g(dVar, field, aVar);
        }

        @Override // z5.h.c
        void a(b6.a aVar, Object obj) {
            Object a8 = this.f27931d.a(aVar);
            if (a8 == null && this.f27935h) {
                return;
            }
            this.f27933f.set(obj, a8);
        }

        @Override // z5.h.c
        void b(b6.c cVar, Object obj) {
            new k(this.f27932e, this.f27931d, this.f27934g.d()).c(cVar, this.f27933f.get(obj));
        }

        @Override // z5.h.c
        public boolean c(Object obj) {
            return this.f27940b && this.f27933f.get(obj) != obj;
        }
    }

    /* compiled from: MyApplication */
    public static final class b extends p {

        /* renamed from: a, reason: collision with root package name */
        private final y5.h f27937a;

        /* renamed from: b, reason: collision with root package name */
        private final Map f27938b;

        /* synthetic */ b(y5.h hVar, Map map, a aVar) {
            this(hVar, map);
        }

        @Override // w5.p
        public Object a(b6.a aVar) {
            if (aVar.R() == b6.b.NULL) {
                aVar.L();
                return null;
            }
            Object a8 = this.f27937a.a();
            try {
                aVar.k();
                while (aVar.t()) {
                    c cVar = (c) this.f27938b.get(aVar.H());
                    if (cVar != null && cVar.f27941c) {
                        cVar.a(aVar, a8);
                    }
                    aVar.j0();
                }
                aVar.p();
                return a8;
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            } catch (IllegalStateException e9) {
                throw new n(e9);
            }
        }

        @Override // w5.p
        public void c(b6.c cVar, Object obj) {
            if (obj == null) {
                cVar.q();
                return;
            }
            cVar.g();
            try {
                for (c cVar2 : this.f27938b.values()) {
                    if (cVar2.c(obj)) {
                        cVar.o(cVar2.f27939a);
                        cVar2.b(cVar, obj);
                    }
                }
                cVar.k();
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        private b(y5.h hVar, Map map) {
            this.f27937a = hVar;
            this.f27938b = map;
        }
    }

    /* compiled from: MyApplication */
    static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final String f27939a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f27940b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f27941c;

        protected c(String str, boolean z7, boolean z8) {
            this.f27939a = str;
            this.f27940b = z7;
            this.f27941c = z8;
        }

        abstract void a(b6.a aVar, Object obj);

        abstract void b(b6.c cVar, Object obj);

        abstract boolean c(Object obj);
    }

    public h(y5.c cVar, w5.c cVar2, y5.d dVar) {
        this.f27928q = cVar;
        this.f27929r = cVar2;
        this.f27930s = dVar;
    }

    private c c(w5.d dVar, Field field, String str, a6.a aVar, boolean z7, boolean z8) {
        return new a(str, z7, z8, dVar, field, aVar, y5.i.b(aVar.c()));
    }

    static boolean e(Field field, boolean z7, y5.d dVar) {
        return (dVar.d(field.getType(), z7) || dVar.g(field, z7)) ? false : true;
    }

    private Map f(w5.d dVar, a6.a aVar, Class cls) {
        a6.a aVar2;
        h hVar = this;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!cls.isInterface()) {
            Type d8 = aVar.d();
            a6.a aVar3 = aVar;
            Class cls2 = cls;
            while (cls2 != Object.class) {
                Field[] declaredFields = cls2.getDeclaredFields();
                int length = declaredFields.length;
                boolean z7 = false;
                int i7 = 0;
                while (i7 < length) {
                    Field field = declaredFields[i7];
                    boolean d9 = hVar.d(field, true);
                    boolean d10 = hVar.d(field, z7);
                    if (d9 || d10) {
                        field.setAccessible(true);
                        Type r7 = y5.b.r(aVar3.d(), cls2, field.getGenericType());
                        List i8 = hVar.i(field);
                        c cVar = null;
                        int i9 = z7;
                        while (i9 < i8.size()) {
                            String str = (String) i8.get(i9);
                            if (i9 != 0) {
                                d9 = false;
                            }
                            c cVar2 = cVar;
                            a6.a aVar4 = aVar3;
                            int i10 = i9;
                            boolean z8 = d9;
                            List list = i8;
                            cVar = cVar2 == null ? (c) linkedHashMap.put(str, hVar.c(dVar, field, str, a6.a.b(r7), z8, d10)) : cVar2;
                            aVar3 = aVar4;
                            d9 = z8;
                            i8 = list;
                            i9 = i10 + 1;
                            hVar = this;
                        }
                        aVar2 = aVar3;
                        c cVar3 = cVar;
                        if (cVar3 != null) {
                            throw new IllegalArgumentException(d8 + " declares multiple JSON fields named " + cVar3.f27939a);
                        }
                    } else {
                        aVar2 = aVar3;
                    }
                    i7++;
                    z7 = false;
                    hVar = this;
                    aVar3 = aVar2;
                }
                aVar3 = a6.a.b(y5.b.r(aVar3.d(), cls2, cls2.getGenericSuperclass()));
                cls2 = aVar3.c();
                hVar = this;
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public p g(w5.d dVar, Field field, a6.a aVar) {
        p b8;
        x5.b bVar = (x5.b) field.getAnnotation(x5.b.class);
        return (bVar == null || (b8 = d.b(this.f27928q, dVar, aVar, bVar)) == null) ? dVar.j(aVar) : b8;
    }

    static List h(w5.c cVar, Field field) {
        x5.c cVar2 = (x5.c) field.getAnnotation(x5.c.class);
        LinkedList linkedList = new LinkedList();
        if (cVar2 == null) {
            linkedList.add(cVar.c(field));
            return linkedList;
        }
        linkedList.add(cVar2.value());
        String[] alternate = cVar2.alternate();
        for (String str : alternate) {
            linkedList.add(str);
        }
        return linkedList;
    }

    private List i(Field field) {
        return h(this.f27929r, field);
    }

    @Override // w5.q
    public p a(w5.d dVar, a6.a aVar) {
        Class c8 = aVar.c();
        a aVar2 = null;
        if (Object.class.isAssignableFrom(c8)) {
            return new b(this.f27928q.a(aVar), f(dVar, aVar, c8), aVar2);
        }
        return null;
    }

    public boolean d(Field field, boolean z7) {
        return e(field, z7, this.f27930s);
    }
}
