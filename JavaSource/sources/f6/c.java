package f6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: MyApplication */
public abstract class c extends f6.b implements List {

    /* renamed from: q, reason: collision with root package name */
    public static final a f23792q = new a(null);

    /* compiled from: MyApplication */
    public static final class a {
        public /* synthetic */ a(q6.e eVar) {
            this();
        }

        public final void a(int i7, int i8) {
            if (i7 < 0 || i7 >= i8) {
                throw new IndexOutOfBoundsException("index: " + i7 + ", size: " + i8);
            }
        }

        public final void b(int i7, int i8) {
            if (i7 < 0 || i7 > i8) {
                throw new IndexOutOfBoundsException("index: " + i7 + ", size: " + i8);
            }
        }

        public final void c(int i7, int i8, int i9) {
            if (i7 < 0 || i8 > i9) {
                throw new IndexOutOfBoundsException("fromIndex: " + i7 + ", toIndex: " + i8 + ", size: " + i9);
            }
            if (i7 <= i8) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i7 + " > toIndex: " + i8);
        }

        public final int d(int i7, int i8) {
            int i9 = i7 + (i7 >> 1);
            if (i9 - i8 < 0) {
                i9 = i8;
            }
            return i9 - 2147483639 > 0 ? i8 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i9;
        }

        public final boolean e(Collection collection, Collection collection2) {
            q6.i.e(collection, "c");
            q6.i.e(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection2.iterator();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!q6.i.a(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int f(Collection collection) {
            q6.i.e(collection, "c");
            Iterator it = collection.iterator();
            int i7 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i7 = (i7 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i7;
        }

        private a() {
        }
    }

    /* compiled from: MyApplication */
    private class b implements Iterator {

        /* renamed from: q, reason: collision with root package name */
        private int f23793q;

        public b() {
        }

        protected final int b() {
            return this.f23793q;
        }

        protected final void d(int i7) {
            this.f23793q = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23793q < c.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            c cVar = c.this;
            int i7 = this.f23793q;
            this.f23793q = i7 + 1;
            return cVar.get(i7);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: f6.c$c, reason: collision with other inner class name */
    private class C0087c extends b implements ListIterator {
        public C0087c(int i7) {
            super();
            c.f23792q.b(i7, c.this.size());
            d(i7);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return b() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return b();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            c cVar = c.this;
            d(b() - 1);
            return cVar.get(b());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return b() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: MyApplication */
    private static final class d extends c implements RandomAccess {

        /* renamed from: r, reason: collision with root package name */
        private final c f23796r;

        /* renamed from: s, reason: collision with root package name */
        private final int f23797s;

        /* renamed from: t, reason: collision with root package name */
        private int f23798t;

        public d(c cVar, int i7, int i8) {
            q6.i.e(cVar, "list");
            this.f23796r = cVar;
            this.f23797s = i7;
            c.f23792q.c(i7, i8, cVar.size());
            this.f23798t = i8 - i7;
        }

        @Override // f6.b
        public int e() {
            return this.f23798t;
        }

        @Override // f6.c, java.util.List
        public Object get(int i7) {
            c.f23792q.a(i7, this.f23798t);
            return this.f23796r.get(this.f23797s + i7);
        }
    }

    protected c() {
    }

    @Override // java.util.List
    public void add(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f23792q.e(this, (Collection) obj);
        }
        return false;
    }

    @Override // java.util.List
    public abstract Object get(int i7);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f23792q.f(this);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (q6.i.a(it.next(), obj)) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (q6.i.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new C0087c(0);
    }

    @Override // java.util.List
    public Object remove(int i7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i7, int i8) {
        return new d(this, i7, i8);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i7) {
        return new C0087c(i7);
    }
}
