package n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: MyApplication */
public class b implements Iterable {

    /* renamed from: q, reason: collision with root package name */
    c f24914q;

    /* renamed from: r, reason: collision with root package name */
    private c f24915r;

    /* renamed from: s, reason: collision with root package name */
    private WeakHashMap f24916s = new WeakHashMap();

    /* renamed from: t, reason: collision with root package name */
    private int f24917t = 0;

    /* compiled from: MyApplication */
    static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // n.b.e
        c d(c cVar) {
            return cVar.f24921t;
        }

        @Override // n.b.e
        c e(c cVar) {
            return cVar.f24920s;
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: n.b$b, reason: collision with other inner class name */
    private static class C0114b extends e {
        C0114b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // n.b.e
        c d(c cVar) {
            return cVar.f24920s;
        }

        @Override // n.b.e
        c e(c cVar) {
            return cVar.f24921t;
        }
    }

    /* compiled from: MyApplication */
    static class c implements Map.Entry {

        /* renamed from: q, reason: collision with root package name */
        final Object f24918q;

        /* renamed from: r, reason: collision with root package name */
        final Object f24919r;

        /* renamed from: s, reason: collision with root package name */
        c f24920s;

        /* renamed from: t, reason: collision with root package name */
        c f24921t;

        c(Object obj, Object obj2) {
            this.f24918q = obj;
            this.f24919r = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f24918q.equals(cVar.f24918q) && this.f24919r.equals(cVar.f24919r);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f24918q;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f24919r;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f24918q.hashCode() ^ this.f24919r.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f24918q + "=" + this.f24919r;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MyApplication */
    public class d implements Iterator, f {

        /* renamed from: q, reason: collision with root package name */
        private c f24922q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f24923r = true;

        d() {
        }

        @Override // n.b.f
        public void b(c cVar) {
            c cVar2 = this.f24922q;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f24921t;
                this.f24922q = cVar3;
                this.f24923r = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f24923r) {
                this.f24923r = false;
                this.f24922q = b.this.f24914q;
            } else {
                c cVar = this.f24922q;
                this.f24922q = cVar != null ? cVar.f24920s : null;
            }
            return this.f24922q;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f24923r) {
                return b.this.f24914q != null;
            }
            c cVar = this.f24922q;
            return (cVar == null || cVar.f24920s == null) ? false : true;
        }
    }

    /* compiled from: MyApplication */
    private static abstract class e implements Iterator, f {

        /* renamed from: q, reason: collision with root package name */
        c f24925q;

        /* renamed from: r, reason: collision with root package name */
        c f24926r;

        e(c cVar, c cVar2) {
            this.f24925q = cVar2;
            this.f24926r = cVar;
        }

        private c g() {
            c cVar = this.f24926r;
            c cVar2 = this.f24925q;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return e(cVar);
        }

        @Override // n.b.f
        public void b(c cVar) {
            if (this.f24925q == cVar && cVar == this.f24926r) {
                this.f24926r = null;
                this.f24925q = null;
            }
            c cVar2 = this.f24925q;
            if (cVar2 == cVar) {
                this.f24925q = d(cVar2);
            }
            if (this.f24926r == cVar) {
                this.f24926r = g();
            }
        }

        abstract c d(c cVar);

        abstract c e(c cVar);

        @Override // java.util.Iterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f24926r;
            this.f24926r = g();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24926r != null;
        }
    }

    /* compiled from: MyApplication */
    interface f {
        void b(c cVar);
    }

    public Map.Entry c() {
        return this.f24914q;
    }

    public Iterator descendingIterator() {
        C0114b c0114b = new C0114b(this.f24915r, this.f24914q);
        this.f24916s.put(c0114b, Boolean.FALSE);
        return c0114b;
    }

    protected c e(Object obj) {
        c cVar = this.f24914q;
        while (cVar != null && !cVar.f24918q.equals(obj)) {
            cVar = cVar.f24920s;
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public d g() {
        d dVar = new d();
        this.f24916s.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry h() {
        return this.f24915r;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((Map.Entry) it.next()).hashCode();
        }
        return i7;
    }

    protected c i(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f24917t++;
        c cVar2 = this.f24915r;
        if (cVar2 == null) {
            this.f24914q = cVar;
            this.f24915r = cVar;
            return cVar;
        }
        cVar2.f24920s = cVar;
        cVar.f24921t = cVar2;
        this.f24915r = cVar;
        return cVar;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f24914q, this.f24915r);
        this.f24916s.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public Object j(Object obj, Object obj2) {
        c e8 = e(obj);
        if (e8 != null) {
            return e8.f24919r;
        }
        i(obj, obj2);
        return null;
    }

    public Object k(Object obj) {
        c e8 = e(obj);
        if (e8 == null) {
            return null;
        }
        this.f24917t--;
        if (!this.f24916s.isEmpty()) {
            Iterator it = this.f24916s.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).b(e8);
            }
        }
        c cVar = e8.f24921t;
        if (cVar != null) {
            cVar.f24920s = e8.f24920s;
        } else {
            this.f24914q = e8.f24920s;
        }
        c cVar2 = e8.f24920s;
        if (cVar2 != null) {
            cVar2.f24921t = cVar;
        } else {
            this.f24915r = cVar;
        }
        e8.f24920s = null;
        e8.f24921t = null;
        return e8.f24919r;
    }

    public int size() {
        return this.f24917t;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
