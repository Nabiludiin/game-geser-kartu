package z4;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: MyApplication */
public abstract class w {

    /* compiled from: MyApplication */
    class a extends b {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Set f27902q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Set f27903r;

        /* compiled from: MyApplication */
        /* renamed from: z4.w$a$a, reason: collision with other inner class name */
        class C0164a extends z4.b {

            /* renamed from: s, reason: collision with root package name */
            final Iterator f27904s;

            /* renamed from: t, reason: collision with root package name */
            final Iterator f27905t;

            C0164a() {
                this.f27904s = a.this.f27902q.iterator();
                this.f27905t = a.this.f27903r.iterator();
            }

            @Override // z4.b
            protected Object b() {
                if (this.f27904s.hasNext()) {
                    return this.f27904s.next();
                }
                while (this.f27905t.hasNext()) {
                    Object next = this.f27905t.next();
                    if (!a.this.f27902q.contains(next)) {
                        return next;
                    }
                }
                return d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f27902q = set;
            this.f27903r = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public z iterator() {
            return new C0164a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f27902q.contains(obj) || this.f27903r.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f27902q.isEmpty() && this.f27903r.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f27902q.size();
            Iterator it = this.f27903r.iterator();
            while (it.hasNext()) {
                if (!this.f27902q.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    /* compiled from: MyApplication */
    public static abstract class b extends AbstractSet {
        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public abstract z iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        private b() {
        }
    }

    static boolean a(Set set, Object obj) {
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

    static int b(Set set) {
        Iterator it = set.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i7 = ~(~(i7 + (next != null ? next.hashCode() : 0)));
        }
        return i7;
    }

    public static b c(Set set, Set set2) {
        y4.h.i(set, "set1");
        y4.h.i(set2, "set2");
        return new a(set, set2);
    }
}
