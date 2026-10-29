package y5;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: MyApplication */
public final class g extends AbstractMap implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    private static final Comparator f27773x = new a();

    /* renamed from: q, reason: collision with root package name */
    Comparator f27774q;

    /* renamed from: r, reason: collision with root package name */
    e f27775r;

    /* renamed from: s, reason: collision with root package name */
    int f27776s;

    /* renamed from: t, reason: collision with root package name */
    int f27777t;

    /* renamed from: u, reason: collision with root package name */
    final e f27778u;

    /* renamed from: v, reason: collision with root package name */
    private b f27779v;

    /* renamed from: w, reason: collision with root package name */
    private c f27780w;

    /* compiled from: MyApplication */
    static class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: MyApplication */
    class b extends AbstractSet {

        /* compiled from: MyApplication */
        class a extends d {
            a() {
                super(g.this, null);
            }

            @Override // java.util.Iterator
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return b();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && g.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e c8;
            if (!(obj instanceof Map.Entry) || (c8 = g.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            g.this.f(c8, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.f27776s;
        }
    }

    /* compiled from: MyApplication */
    final class c extends AbstractSet {

        /* compiled from: MyApplication */
        class a extends d {
            a() {
                super(g.this, null);
            }

            @Override // java.util.Iterator
            public Object next() {
                return b().f27794v;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return g.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return g.this.g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.f27776s;
        }
    }

    public g() {
        this(f27773x);
    }

    private boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private void e(e eVar, boolean z7) {
        while (eVar != null) {
            e eVar2 = eVar.f27790r;
            e eVar3 = eVar.f27791s;
            int i7 = eVar2 != null ? eVar2.f27796x : 0;
            int i8 = eVar3 != null ? eVar3.f27796x : 0;
            int i9 = i7 - i8;
            if (i9 == -2) {
                e eVar4 = eVar3.f27790r;
                e eVar5 = eVar3.f27791s;
                int i10 = (eVar4 != null ? eVar4.f27796x : 0) - (eVar5 != null ? eVar5.f27796x : 0);
                if (i10 == -1 || (i10 == 0 && !z7)) {
                    i(eVar);
                } else {
                    j(eVar3);
                    i(eVar);
                }
                if (z7) {
                    return;
                }
            } else if (i9 == 2) {
                e eVar6 = eVar2.f27790r;
                e eVar7 = eVar2.f27791s;
                int i11 = (eVar6 != null ? eVar6.f27796x : 0) - (eVar7 != null ? eVar7.f27796x : 0);
                if (i11 == 1 || (i11 == 0 && !z7)) {
                    j(eVar);
                } else {
                    i(eVar2);
                    j(eVar);
                }
                if (z7) {
                    return;
                }
            } else if (i9 == 0) {
                eVar.f27796x = i7 + 1;
                if (z7) {
                    return;
                }
            } else {
                eVar.f27796x = Math.max(i7, i8) + 1;
                if (!z7) {
                    return;
                }
            }
            eVar = eVar.f27789q;
        }
    }

    private void h(e eVar, e eVar2) {
        e eVar3 = eVar.f27789q;
        eVar.f27789q = null;
        if (eVar2 != null) {
            eVar2.f27789q = eVar3;
        }
        if (eVar3 == null) {
            this.f27775r = eVar2;
        } else if (eVar3.f27790r == eVar) {
            eVar3.f27790r = eVar2;
        } else {
            eVar3.f27791s = eVar2;
        }
    }

    private void i(e eVar) {
        e eVar2 = eVar.f27790r;
        e eVar3 = eVar.f27791s;
        e eVar4 = eVar3.f27790r;
        e eVar5 = eVar3.f27791s;
        eVar.f27791s = eVar4;
        if (eVar4 != null) {
            eVar4.f27789q = eVar;
        }
        h(eVar, eVar3);
        eVar3.f27790r = eVar;
        eVar.f27789q = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.f27796x : 0, eVar4 != null ? eVar4.f27796x : 0) + 1;
        eVar.f27796x = max;
        eVar3.f27796x = Math.max(max, eVar5 != null ? eVar5.f27796x : 0) + 1;
    }

    private void j(e eVar) {
        e eVar2 = eVar.f27790r;
        e eVar3 = eVar.f27791s;
        e eVar4 = eVar2.f27790r;
        e eVar5 = eVar2.f27791s;
        eVar.f27790r = eVar5;
        if (eVar5 != null) {
            eVar5.f27789q = eVar;
        }
        h(eVar, eVar2);
        eVar2.f27791s = eVar;
        eVar.f27789q = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.f27796x : 0, eVar5 != null ? eVar5.f27796x : 0) + 1;
        eVar.f27796x = max;
        eVar2.f27796x = Math.max(max, eVar4 != null ? eVar4.f27796x : 0) + 1;
    }

    e b(Object obj, boolean z7) {
        int i7;
        e eVar;
        Comparator comparator = this.f27774q;
        e eVar2 = this.f27775r;
        if (eVar2 != null) {
            Comparable comparable = comparator == f27773x ? (Comparable) obj : null;
            while (true) {
                Object obj2 = eVar2.f27794v;
                i7 = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i7 == 0) {
                    return eVar2;
                }
                e eVar3 = i7 < 0 ? eVar2.f27790r : eVar2.f27791s;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i7 = 0;
        }
        if (!z7) {
            return null;
        }
        e eVar4 = this.f27778u;
        if (eVar2 != null) {
            eVar = new e(eVar2, obj, eVar4, eVar4.f27793u);
            if (i7 < 0) {
                eVar2.f27790r = eVar;
            } else {
                eVar2.f27791s = eVar;
            }
            e(eVar2, true);
        } else {
            if (comparator == f27773x && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            eVar = new e(eVar2, obj, eVar4, eVar4.f27793u);
            this.f27775r = eVar;
        }
        this.f27776s++;
        this.f27777t++;
        return eVar;
    }

    e c(Map.Entry entry) {
        e d8 = d(entry.getKey());
        if (d8 == null || !a(d8.f27795w, entry.getValue())) {
            return null;
        }
        return d8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f27775r = null;
        this.f27776s = 0;
        this.f27777t++;
        e eVar = this.f27778u;
        eVar.f27793u = eVar;
        eVar.f27792t = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    e d(Object obj) {
        if (obj != null) {
            try {
                return b(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        b bVar = this.f27779v;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f27779v = bVar2;
        return bVar2;
    }

    void f(e eVar, boolean z7) {
        int i7;
        if (z7) {
            e eVar2 = eVar.f27793u;
            eVar2.f27792t = eVar.f27792t;
            eVar.f27792t.f27793u = eVar2;
        }
        e eVar3 = eVar.f27790r;
        e eVar4 = eVar.f27791s;
        e eVar5 = eVar.f27789q;
        int i8 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.f27790r = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.f27791s = null;
            } else {
                h(eVar, null);
            }
            e(eVar5, false);
            this.f27776s--;
            this.f27777t++;
            return;
        }
        e b8 = eVar3.f27796x > eVar4.f27796x ? eVar3.b() : eVar4.a();
        f(b8, false);
        e eVar6 = eVar.f27790r;
        if (eVar6 != null) {
            i7 = eVar6.f27796x;
            b8.f27790r = eVar6;
            eVar6.f27789q = b8;
            eVar.f27790r = null;
        } else {
            i7 = 0;
        }
        e eVar7 = eVar.f27791s;
        if (eVar7 != null) {
            i8 = eVar7.f27796x;
            b8.f27791s = eVar7;
            eVar7.f27789q = b8;
            eVar.f27791s = null;
        }
        b8.f27796x = Math.max(i7, i8) + 1;
        h(eVar, b8);
    }

    e g(Object obj) {
        e d8 = d(obj);
        if (d8 != null) {
            f(d8, true);
        }
        return d8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        e d8 = d(obj);
        if (d8 != null) {
            return d8.f27795w;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        c cVar = this.f27780w;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f27780w = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        e b8 = b(obj, true);
        Object obj3 = b8.f27795w;
        b8.f27795w = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        e g8 = g(obj);
        if (g8 != null) {
            return g8.f27795w;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f27776s;
    }

    public g(Comparator comparator) {
        this.f27776s = 0;
        this.f27777t = 0;
        this.f27778u = new e();
        this.f27774q = comparator == null ? f27773x : comparator;
    }

    /* compiled from: MyApplication */
    static final class e implements Map.Entry {

        /* renamed from: q, reason: collision with root package name */
        e f27789q;

        /* renamed from: r, reason: collision with root package name */
        e f27790r;

        /* renamed from: s, reason: collision with root package name */
        e f27791s;

        /* renamed from: t, reason: collision with root package name */
        e f27792t;

        /* renamed from: u, reason: collision with root package name */
        e f27793u;

        /* renamed from: v, reason: collision with root package name */
        final Object f27794v;

        /* renamed from: w, reason: collision with root package name */
        Object f27795w;

        /* renamed from: x, reason: collision with root package name */
        int f27796x;

        e() {
            this.f27794v = null;
            this.f27793u = this;
            this.f27792t = this;
        }

        public e a() {
            e eVar = this;
            for (e eVar2 = this.f27790r; eVar2 != null; eVar2 = eVar2.f27790r) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e b() {
            e eVar = this;
            for (e eVar2 = this.f27791s; eVar2 != null; eVar2 = eVar2.f27791s) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = this.f27794v;
                if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                    Object obj3 = this.f27795w;
                    Object value = entry.getValue();
                    if (obj3 == null) {
                        if (value == null) {
                            return true;
                        }
                    } else if (obj3.equals(value)) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f27794v;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f27795w;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f27794v;
            int hashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f27795w;
            return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.f27795w;
            this.f27795w = obj;
            return obj2;
        }

        public String toString() {
            return this.f27794v + "=" + this.f27795w;
        }

        e(e eVar, Object obj, e eVar2, e eVar3) {
            this.f27789q = eVar;
            this.f27794v = obj;
            this.f27796x = 1;
            this.f27792t = eVar2;
            this.f27793u = eVar3;
            eVar3.f27792t = this;
            eVar2.f27793u = this;
        }
    }

    /* compiled from: MyApplication */
    private abstract class d implements Iterator {

        /* renamed from: q, reason: collision with root package name */
        e f27785q;

        /* renamed from: r, reason: collision with root package name */
        e f27786r;

        /* renamed from: s, reason: collision with root package name */
        int f27787s;

        private d() {
            this.f27785q = g.this.f27778u.f27792t;
            this.f27786r = null;
            this.f27787s = g.this.f27777t;
        }

        final e b() {
            e eVar = this.f27785q;
            g gVar = g.this;
            if (eVar == gVar.f27778u) {
                throw new NoSuchElementException();
            }
            if (gVar.f27777t != this.f27787s) {
                throw new ConcurrentModificationException();
            }
            this.f27785q = eVar.f27792t;
            this.f27786r = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f27785q != g.this.f27778u;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e eVar = this.f27786r;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            g.this.f(eVar, true);
            this.f27786r = null;
            this.f27787s = g.this.f27777t;
        }

        /* synthetic */ d(g gVar, a aVar) {
            this();
        }
    }
}
