package f6;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: MyApplication */
public final class e extends d {

    /* renamed from: t, reason: collision with root package name */
    public static final a f23799t = new a(null);

    /* renamed from: u, reason: collision with root package name */
    private static final Object[] f23800u = new Object[0];

    /* renamed from: q, reason: collision with root package name */
    private int f23801q;

    /* renamed from: r, reason: collision with root package name */
    private Object[] f23802r = f23800u;

    /* renamed from: s, reason: collision with root package name */
    private int f23803s;

    /* compiled from: MyApplication */
    public static final class a {
        public /* synthetic */ a(q6.e eVar) {
            this();
        }

        private a() {
        }
    }

    private final void g(int i7, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f23802r.length;
        while (i7 < length && it.hasNext()) {
            this.f23802r[i7] = it.next();
            i7++;
        }
        int i8 = this.f23801q;
        for (int i9 = 0; i9 < i8 && it.hasNext(); i9++) {
            this.f23802r[i9] = it.next();
        }
        this.f23803s = size() + collection.size();
    }

    private final void h(int i7) {
        Object[] objArr = new Object[i7];
        Object[] objArr2 = this.f23802r;
        i.c(objArr2, objArr, 0, this.f23801q, objArr2.length);
        Object[] objArr3 = this.f23802r;
        int length = objArr3.length;
        int i8 = this.f23801q;
        i.c(objArr3, objArr, length - i8, 0, i8);
        this.f23801q = 0;
        this.f23802r = objArr;
    }

    private final int i(int i7) {
        return i7 == 0 ? j.f(this.f23802r) : i7 - 1;
    }

    private final void j(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f23802r;
        if (i7 <= objArr.length) {
            return;
        }
        if (objArr == f23800u) {
            this.f23802r = new Object[t6.d.a(i7, 10)];
        } else {
            h(c.f23792q.d(objArr.length, i7));
        }
    }

    private final int k(int i7) {
        if (i7 == j.f(this.f23802r)) {
            return 0;
        }
        return i7 + 1;
    }

    private final int l(int i7) {
        return i7 < 0 ? i7 + this.f23802r.length : i7;
    }

    private final void m(int i7, int i8) {
        if (i7 < i8) {
            i.e(this.f23802r, null, i7, i8);
            return;
        }
        Object[] objArr = this.f23802r;
        i.e(objArr, null, i7, objArr.length);
        i.e(this.f23802r, null, 0, i8);
    }

    private final int n(int i7) {
        Object[] objArr = this.f23802r;
        return i7 >= objArr.length ? i7 - objArr.length : i7;
    }

    private final void o() {
        ((AbstractList) this).modCount++;
    }

    private final void q(int i7, int i8) {
        int n7 = n(this.f23801q + (i7 - 1));
        int n8 = n(this.f23801q + (i8 - 1));
        while (i7 > 0) {
            int i9 = n7 + 1;
            int min = Math.min(i7, Math.min(i9, n8 + 1));
            Object[] objArr = this.f23802r;
            int i10 = n8 - min;
            int i11 = n7 - min;
            i.c(objArr, objArr, i10 + 1, i11 + 1, i9);
            n7 = l(i11);
            n8 = l(i10);
            i7 -= min;
        }
    }

    private final void r(int i7, int i8) {
        int n7 = n(this.f23801q + i8);
        int n8 = n(this.f23801q + i7);
        int size = size();
        while (true) {
            size -= i8;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f23802r;
            i8 = Math.min(size, Math.min(objArr.length - n7, objArr.length - n8));
            Object[] objArr2 = this.f23802r;
            int i9 = n7 + i8;
            i.c(objArr2, objArr2, n8, n7, i9);
            n7 = n(i9);
            n8 = n(n8 + i8);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        q6.i.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        o();
        j(size() + collection.size());
        g(n(this.f23801q + size()), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        o();
        j(size() + 1);
        int i7 = i(this.f23801q);
        this.f23801q = i7;
        this.f23802r[i7] = obj;
        this.f23803s = size() + 1;
    }

    public final void addLast(Object obj) {
        o();
        j(size() + 1);
        this.f23802r[n(this.f23801q + size())] = obj;
        this.f23803s = size() + 1;
    }

    @Override // f6.d
    public int c() {
        return this.f23803s;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            o();
            m(this.f23801q, n(this.f23801q + size()));
        }
        this.f23801q = 0;
        this.f23803s = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // f6.d
    public Object e(int i7) {
        c.f23792q.a(i7, size());
        if (i7 == n.d(this)) {
            return removeLast();
        }
        if (i7 == 0) {
            return removeFirst();
        }
        o();
        int n7 = n(this.f23801q + i7);
        Object obj = this.f23802r[n7];
        if (i7 < (size() >> 1)) {
            int i8 = this.f23801q;
            if (n7 >= i8) {
                Object[] objArr = this.f23802r;
                i.c(objArr, objArr, i8 + 1, i8, n7);
            } else {
                Object[] objArr2 = this.f23802r;
                i.c(objArr2, objArr2, 1, 0, n7);
                Object[] objArr3 = this.f23802r;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i9 = this.f23801q;
                i.c(objArr3, objArr3, i9 + 1, i9, objArr3.length - 1);
            }
            Object[] objArr4 = this.f23802r;
            int i10 = this.f23801q;
            objArr4[i10] = null;
            this.f23801q = k(i10);
        } else {
            int n8 = n(this.f23801q + n.d(this));
            if (n7 <= n8) {
                Object[] objArr5 = this.f23802r;
                i.c(objArr5, objArr5, n7, n7 + 1, n8 + 1);
            } else {
                Object[] objArr6 = this.f23802r;
                i.c(objArr6, objArr6, n7, n7 + 1, objArr6.length);
                Object[] objArr7 = this.f23802r;
                objArr7[objArr7.length - 1] = objArr7[0];
                i.c(objArr7, objArr7, 0, 1, n8 + 1);
            }
            this.f23802r[n8] = null;
        }
        this.f23803s = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i7) {
        c.f23792q.a(i7, size());
        return this.f23802r[n(this.f23801q + i7)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i7;
        int n7 = n(this.f23801q + size());
        int i8 = this.f23801q;
        if (i8 < n7) {
            while (i8 < n7) {
                if (q6.i.a(obj, this.f23802r[i8])) {
                    i7 = this.f23801q;
                } else {
                    i8++;
                }
            }
            return -1;
        }
        if (i8 < n7) {
            return -1;
        }
        int length = this.f23802r.length;
        while (true) {
            if (i8 >= length) {
                for (int i9 = 0; i9 < n7; i9++) {
                    if (q6.i.a(obj, this.f23802r[i9])) {
                        i8 = i9 + this.f23802r.length;
                        i7 = this.f23801q;
                    }
                }
                return -1;
            }
            if (q6.i.a(obj, this.f23802r[i8])) {
                i7 = this.f23801q;
                break;
            }
            i8++;
        }
        return i8 - i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int f8;
        int i7;
        int n7 = n(this.f23801q + size());
        int i8 = this.f23801q;
        if (i8 < n7) {
            f8 = n7 - 1;
            if (i8 <= f8) {
                while (!q6.i.a(obj, this.f23802r[f8])) {
                    if (f8 != i8) {
                        f8--;
                    }
                }
                i7 = this.f23801q;
                return f8 - i7;
            }
            return -1;
        }
        if (i8 > n7) {
            int i9 = n7 - 1;
            while (true) {
                if (-1 >= i9) {
                    f8 = j.f(this.f23802r);
                    int i10 = this.f23801q;
                    if (i10 <= f8) {
                        while (!q6.i.a(obj, this.f23802r[f8])) {
                            if (f8 != i10) {
                                f8--;
                            }
                        }
                        i7 = this.f23801q;
                    }
                } else {
                    if (q6.i.a(obj, this.f23802r[i9])) {
                        f8 = i9 + this.f23802r.length;
                        i7 = this.f23801q;
                        break;
                    }
                    i9--;
                }
            }
        }
        return -1;
    }

    public final Object p() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        int n7;
        q6.i.e(collection, "elements");
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty() && this.f23802r.length != 0) {
            int n8 = n(this.f23801q + size());
            int i7 = this.f23801q;
            if (i7 < n8) {
                n7 = i7;
                while (i7 < n8) {
                    Object obj = this.f23802r[i7];
                    if (collection.contains(obj)) {
                        z7 = true;
                    } else {
                        this.f23802r[n7] = obj;
                        n7++;
                    }
                    i7++;
                }
                i.e(this.f23802r, null, n7, n8);
            } else {
                int length = this.f23802r.length;
                boolean z8 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f23802r;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (collection.contains(obj2)) {
                        z8 = true;
                    } else {
                        this.f23802r[i8] = obj2;
                        i8++;
                    }
                    i7++;
                }
                n7 = n(i8);
                for (int i9 = 0; i9 < n8; i9++) {
                    Object[] objArr2 = this.f23802r;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (collection.contains(obj3)) {
                        z8 = true;
                    } else {
                        this.f23802r[n7] = obj3;
                        n7 = k(n7);
                    }
                }
                z7 = z8;
            }
            if (z7) {
                o();
                this.f23803s = l(n7 - this.f23801q);
            }
        }
        return z7;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        Object[] objArr = this.f23802r;
        int i7 = this.f23801q;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f23801q = k(i7);
        this.f23803s = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        int n7 = n(this.f23801q + n.d(this));
        Object[] objArr = this.f23802r;
        Object obj = objArr[n7];
        objArr[n7] = null;
        this.f23803s = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i7, int i8) {
        c.f23792q.c(i7, i8, size());
        int i9 = i8 - i7;
        if (i9 == 0) {
            return;
        }
        if (i9 == size()) {
            clear();
            return;
        }
        if (i9 == 1) {
            remove(i7);
            return;
        }
        o();
        if (i7 < size() - i8) {
            q(i7, i8);
            int n7 = n(this.f23801q + i9);
            m(this.f23801q, n7);
            this.f23801q = n7;
        } else {
            r(i7, i8);
            int n8 = n(this.f23801q + size());
            m(l(n8 - i9), n8);
        }
        this.f23803s = size() - i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        int n7;
        q6.i.e(collection, "elements");
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty() && this.f23802r.length != 0) {
            int n8 = n(this.f23801q + size());
            int i7 = this.f23801q;
            if (i7 < n8) {
                n7 = i7;
                while (i7 < n8) {
                    Object obj = this.f23802r[i7];
                    if (collection.contains(obj)) {
                        this.f23802r[n7] = obj;
                        n7++;
                    } else {
                        z7 = true;
                    }
                    i7++;
                }
                i.e(this.f23802r, null, n7, n8);
            } else {
                int length = this.f23802r.length;
                boolean z8 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f23802r;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (collection.contains(obj2)) {
                        this.f23802r[i8] = obj2;
                        i8++;
                    } else {
                        z8 = true;
                    }
                    i7++;
                }
                n7 = n(i8);
                for (int i9 = 0; i9 < n8; i9++) {
                    Object[] objArr2 = this.f23802r;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (collection.contains(obj3)) {
                        this.f23802r[n7] = obj3;
                        n7 = k(n7);
                    } else {
                        z8 = true;
                    }
                }
                z7 = z8;
            }
            if (z7) {
                o();
                this.f23803s = l(n7 - this.f23801q);
            }
        }
        return z7;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i7, Object obj) {
        c.f23792q.a(i7, size());
        int n7 = n(this.f23801q + i7);
        Object[] objArr = this.f23802r;
        Object obj2 = objArr[n7];
        objArr[n7] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        q6.i.e(objArr, "array");
        if (objArr.length < size()) {
            objArr = g.a(objArr, size());
        }
        Object[] objArr2 = objArr;
        int n7 = n(this.f23801q + size());
        int i7 = this.f23801q;
        if (i7 < n7) {
            i.d(this.f23802r, objArr2, 0, i7, n7, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr3 = this.f23802r;
            i.c(objArr3, objArr2, 0, this.f23801q, objArr3.length);
            Object[] objArr4 = this.f23802r;
            i.c(objArr4, objArr2, objArr4.length - this.f23801q, 0, n7);
        }
        return m.b(size(), objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i7, Object obj) {
        c.f23792q.b(i7, size());
        if (i7 == size()) {
            addLast(obj);
            return;
        }
        if (i7 == 0) {
            addFirst(obj);
            return;
        }
        o();
        j(size() + 1);
        int n7 = n(this.f23801q + i7);
        if (i7 < ((size() + 1) >> 1)) {
            int i8 = i(n7);
            int i9 = i(this.f23801q);
            int i10 = this.f23801q;
            if (i8 >= i10) {
                Object[] objArr = this.f23802r;
                objArr[i9] = objArr[i10];
                i.c(objArr, objArr, i10, i10 + 1, i8 + 1);
            } else {
                Object[] objArr2 = this.f23802r;
                i.c(objArr2, objArr2, i10 - 1, i10, objArr2.length);
                Object[] objArr3 = this.f23802r;
                objArr3[objArr3.length - 1] = objArr3[0];
                i.c(objArr3, objArr3, 0, 1, i8 + 1);
            }
            this.f23802r[i8] = obj;
            this.f23801q = i9;
        } else {
            int n8 = n(this.f23801q + size());
            if (n7 < n8) {
                Object[] objArr4 = this.f23802r;
                i.c(objArr4, objArr4, n7 + 1, n7, n8);
            } else {
                Object[] objArr5 = this.f23802r;
                i.c(objArr5, objArr5, 1, 0, n8);
                Object[] objArr6 = this.f23802r;
                objArr6[0] = objArr6[objArr6.length - 1];
                i.c(objArr6, objArr6, n7 + 1, n7, objArr6.length - 1);
            }
            this.f23802r[n7] = obj;
        }
        this.f23803s = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i7, Collection collection) {
        q6.i.e(collection, "elements");
        c.f23792q.b(i7, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i7 == size()) {
            return addAll(collection);
        }
        o();
        j(size() + collection.size());
        int n7 = n(this.f23801q + size());
        int n8 = n(this.f23801q + i7);
        int size = collection.size();
        if (i7 < ((size() + 1) >> 1)) {
            int i8 = this.f23801q;
            int i9 = i8 - size;
            if (n8 < i8) {
                Object[] objArr = this.f23802r;
                i.c(objArr, objArr, i9, i8, objArr.length);
                if (size >= n8) {
                    Object[] objArr2 = this.f23802r;
                    i.c(objArr2, objArr2, objArr2.length - size, 0, n8);
                } else {
                    Object[] objArr3 = this.f23802r;
                    i.c(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f23802r;
                    i.c(objArr4, objArr4, 0, size, n8);
                }
            } else if (i9 >= 0) {
                Object[] objArr5 = this.f23802r;
                i.c(objArr5, objArr5, i9, i8, n8);
            } else {
                Object[] objArr6 = this.f23802r;
                i9 += objArr6.length;
                int i10 = n8 - i8;
                int length = objArr6.length - i9;
                if (length >= i10) {
                    i.c(objArr6, objArr6, i9, i8, n8);
                } else {
                    i.c(objArr6, objArr6, i9, i8, i8 + length);
                    Object[] objArr7 = this.f23802r;
                    i.c(objArr7, objArr7, 0, this.f23801q + length, n8);
                }
            }
            this.f23801q = i9;
            g(l(n8 - size), collection);
        } else {
            int i11 = n8 + size;
            if (n8 < n7) {
                int i12 = size + n7;
                Object[] objArr8 = this.f23802r;
                if (i12 <= objArr8.length) {
                    i.c(objArr8, objArr8, i11, n8, n7);
                } else if (i11 >= objArr8.length) {
                    i.c(objArr8, objArr8, i11 - objArr8.length, n8, n7);
                } else {
                    int length2 = n7 - (i12 - objArr8.length);
                    i.c(objArr8, objArr8, 0, length2, n7);
                    Object[] objArr9 = this.f23802r;
                    i.c(objArr9, objArr9, i11, n8, length2);
                }
            } else {
                Object[] objArr10 = this.f23802r;
                i.c(objArr10, objArr10, size, 0, n7);
                Object[] objArr11 = this.f23802r;
                if (i11 >= objArr11.length) {
                    i.c(objArr11, objArr11, i11 - objArr11.length, n8, objArr11.length);
                } else {
                    i.c(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f23802r;
                    i.c(objArr12, objArr12, i11, n8, objArr12.length - size);
                }
            }
            g(n8, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
