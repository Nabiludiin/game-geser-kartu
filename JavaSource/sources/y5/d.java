package y5;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import w5.p;
import w5.q;

/* compiled from: MyApplication */
public final class d implements q, Cloneable {

    /* renamed from: w, reason: collision with root package name */
    public static final d f27758w = new d();

    /* renamed from: q, reason: collision with root package name */
    private double f27759q = -1.0d;

    /* renamed from: r, reason: collision with root package name */
    private int f27760r = 136;

    /* renamed from: s, reason: collision with root package name */
    private boolean f27761s = true;

    /* renamed from: t, reason: collision with root package name */
    private boolean f27762t;

    /* renamed from: u, reason: collision with root package name */
    private List f27763u;

    /* renamed from: v, reason: collision with root package name */
    private List f27764v;

    /* compiled from: MyApplication */
    class a extends p {

        /* renamed from: a, reason: collision with root package name */
        private p f27765a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f27766b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f27767c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w5.d f27768d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ a6.a f27769e;

        a(boolean z7, boolean z8, w5.d dVar, a6.a aVar) {
            this.f27766b = z7;
            this.f27767c = z8;
            this.f27768d = dVar;
            this.f27769e = aVar;
        }

        private p d() {
            p pVar = this.f27765a;
            if (pVar != null) {
                return pVar;
            }
            p l7 = this.f27768d.l(d.this, this.f27769e);
            this.f27765a = l7;
            return l7;
        }

        @Override // w5.p
        public Object a(b6.a aVar) {
            if (!this.f27766b) {
                return d().a(aVar);
            }
            aVar.j0();
            return null;
        }

        @Override // w5.p
        public void c(b6.c cVar, Object obj) {
            if (this.f27767c) {
                cVar.q();
            } else {
                d().c(cVar, obj);
            }
        }
    }

    public d() {
        List list = Collections.EMPTY_LIST;
        this.f27763u = list;
        this.f27764v = list;
    }

    private boolean i(Class cls) {
        if (Enum.class.isAssignableFrom(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    private boolean k(Class cls) {
        return cls.isMemberClass() && !l(cls);
    }

    private boolean l(Class cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean m(x5.d dVar) {
        return dVar == null || dVar.value() <= this.f27759q;
    }

    private boolean n(x5.e eVar) {
        return eVar == null || eVar.value() > this.f27759q;
    }

    private boolean o(x5.d dVar, x5.e eVar) {
        return m(dVar) && n(eVar);
    }

    @Override // w5.q
    public p a(w5.d dVar, a6.a aVar) {
        Class c8 = aVar.c();
        boolean d8 = d(c8, true);
        boolean d9 = d(c8, false);
        if (d8 || d9) {
            return new a(d9, d8, dVar, aVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public boolean d(Class cls, boolean z7) {
        if (this.f27759q != -1.0d && !o((x5.d) cls.getAnnotation(x5.d.class), (x5.e) cls.getAnnotation(x5.e.class))) {
            return true;
        }
        if ((!this.f27761s && k(cls)) || i(cls)) {
            return true;
        }
        Iterator it = (z7 ? this.f27763u : this.f27764v).iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    public boolean g(Field field, boolean z7) {
        x5.a aVar;
        if ((this.f27760r & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f27759q != -1.0d && !o((x5.d) field.getAnnotation(x5.d.class), (x5.e) field.getAnnotation(x5.e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f27762t && ((aVar = (x5.a) field.getAnnotation(x5.a.class)) == null || (!z7 ? aVar.deserialize() : aVar.serialize()))) {
            return true;
        }
        if ((!this.f27761s && k(field.getType())) || i(field.getType())) {
            return true;
        }
        List list = z7 ? this.f27763u : this.f27764v;
        if (list.isEmpty()) {
            return false;
        }
        new w5.a(field);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }
}
