package r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: MyApplication */
abstract class g {

    /* renamed from: a, reason: collision with root package name */
    b f25746a;

    /* renamed from: b, reason: collision with root package name */
    c f25747b;

    /* renamed from: c, reason: collision with root package name */
    e f25748c;

    /* compiled from: MyApplication */
    final class a implements Iterator {

        /* renamed from: q, reason: collision with root package name */
        final int f25749q;

        /* renamed from: r, reason: collision with root package name */
        int f25750r;

        /* renamed from: s, reason: collision with root package name */
        int f25751s;

        /* renamed from: t, reason: collision with root package name */
        boolean f25752t = false;

        a(int i7) {
            this.f25749q = i7;
            this.f25750r = g.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25751s < this.f25750r;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object b8 = g.this.b(this.f25751s, this.f25749q);
            this.f25751s++;
            this.f25752t = true;
            return b8;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f25752t) {
                throw new IllegalStateException();
            }
            int i7 = this.f25751s - 1;
            this.f25751s = i7;
            this.f25750r--;
            this.f25752t = false;
            g.this.h(i7);
        }
    }

    /* compiled from: MyApplication */
    final class b implements Set {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            int d8 = g.this.d();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                g.this.g(entry.getKey(), entry.getValue());
            }
            return d8 != g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            g.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e8 = g.this.e(entry.getKey());
            if (e8 < 0) {
                return false;
            }
            return r.d.c(g.this.b(e8, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return g.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i7 = 0;
            for (int d8 = g.this.d() - 1; d8 >= 0; d8--) {
                Object b8 = g.this.b(d8, 0);
                Object b9 = g.this.b(d8, 1);
                i7 += (b8 == null ? 0 : b8.hashCode()) ^ (b9 == null ? 0 : b9.hashCode());
            }
            return i7;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return g.this.new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: MyApplication */
    final class c implements Set {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            g.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return g.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return g.j(g.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return g.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i7 = 0;
            for (int d8 = g.this.d() - 1; d8 >= 0; d8--) {
                Object b8 = g.this.b(d8, 0);
                i7 += b8 == null ? 0 : b8.hashCode();
            }
            return i7;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return g.this.new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int e8 = g.this.e(obj);
            if (e8 < 0) {
                return false;
            }
            g.this.h(e8);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return g.o(g.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return g.p(g.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return g.this.q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return g.this.r(objArr, 0);
        }
    }

    /* compiled from: MyApplication */
    final class d implements Iterator, Map.Entry {

        /* renamed from: q, reason: collision with root package name */
        int f25756q;

        /* renamed from: s, reason: collision with root package name */
        boolean f25758s = false;

        /* renamed from: r, reason: collision with root package name */
        int f25757r = -1;

        d() {
            this.f25756q = g.this.d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f25757r++;
            this.f25758s = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f25758s) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return r.d.c(entry.getKey(), g.this.b(this.f25757r, 0)) && r.d.c(entry.getValue(), g.this.b(this.f25757r, 1));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f25758s) {
                return g.this.b(this.f25757r, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f25758s) {
                return g.this.b(this.f25757r, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25757r < this.f25756q;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f25758s) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object b8 = g.this.b(this.f25757r, 0);
            Object b9 = g.this.b(this.f25757r, 1);
            return (b8 == null ? 0 : b8.hashCode()) ^ (b9 != null ? b9.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f25758s) {
                throw new IllegalStateException();
            }
            g.this.h(this.f25757r);
            this.f25757r--;
            this.f25756q--;
            this.f25758s = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f25758s) {
                return g.this.i(this.f25757r, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: MyApplication */
    final class e implements Collection {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            g.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return g.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return g.this.new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int f8 = g.this.f(obj);
            if (f8 < 0) {
                return false;
            }
            g.this.h(f8);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int d8 = g.this.d();
            int i7 = 0;
            boolean z7 = false;
            while (i7 < d8) {
                if (collection.contains(g.this.b(i7, 1))) {
                    g.this.h(i7);
                    i7--;
                    d8--;
                    z7 = true;
                }
                i7++;
            }
            return z7;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int d8 = g.this.d();
            int i7 = 0;
            boolean z7 = false;
            while (i7 < d8) {
                if (!collection.contains(g.this.b(i7, 1))) {
                    g.this.h(i7);
                    i7--;
                    d8--;
                    z7 = true;
                }
                i7++;
            }
            return z7;
        }

        @Override // java.util.Collection
        public int size() {
            return g.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return g.this.q(1);
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return g.this.r(objArr, 1);
        }
    }

    g() {
    }

    public static boolean j(Map map, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean o(Map map, Collection collection) {
        int size = map.size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static boolean p(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    protected abstract void a();

    protected abstract Object b(int i7, int i8);

    protected abstract Map c();

    protected abstract int d();

    protected abstract int e(Object obj);

    protected abstract int f(Object obj);

    protected abstract void g(Object obj, Object obj2);

    protected abstract void h(int i7);

    protected abstract Object i(int i7, Object obj);

    public Set l() {
        if (this.f25746a == null) {
            this.f25746a = new b();
        }
        return this.f25746a;
    }

    public Set m() {
        if (this.f25747b == null) {
            this.f25747b = new c();
        }
        return this.f25747b;
    }

    public Collection n() {
        if (this.f25748c == null) {
            this.f25748c = new e();
        }
        return this.f25748c;
    }

    public Object[] q(int i7) {
        int d8 = d();
        Object[] objArr = new Object[d8];
        for (int i8 = 0; i8 < d8; i8++) {
            objArr[i8] = b(i8, i7);
        }
        return objArr;
    }

    public Object[] r(Object[] objArr, int i7) {
        int d8 = d();
        if (objArr.length < d8) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d8);
        }
        for (int i8 = 0; i8 < d8; i8++) {
            objArr[i8] = b(i8, i7);
        }
        if (objArr.length > d8) {
            objArr[d8] = null;
        }
        return objArr;
    }
}
