package z4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: MyApplication */
public abstract class i extends h implements List, RandomAccess {

    /* renamed from: r, reason: collision with root package name */
    private static final a0 f27855r = new a(t.f27878u, 0);

    /* compiled from: MyApplication */
    static class a extends z4.a {

        /* renamed from: s, reason: collision with root package name */
        private final i f27856s;

        a(i iVar, int i7) {
            super(iVar.size(), i7);
            this.f27856s = iVar;
        }

        @Override // z4.a
        protected Object b(int i7) {
            return this.f27856s.get(i7);
        }
    }

    /* compiled from: MyApplication */
    class b extends i {

        /* renamed from: s, reason: collision with root package name */
        final transient int f27857s;

        /* renamed from: t, reason: collision with root package name */
        final transient int f27858t;

        b(int i7, int i8) {
            this.f27857s = i7;
            this.f27858t = i8;
        }

        @Override // z4.h
        Object[] e() {
            return i.this.e();
        }

        @Override // z4.h
        int g() {
            return i.this.h() + this.f27857s + this.f27858t;
        }

        @Override // java.util.List
        public Object get(int i7) {
            y4.h.f(i7, this.f27858t);
            return i.this.get(i7 + this.f27857s);
        }

        @Override // z4.h
        int h() {
            return i.this.h() + this.f27857s;
        }

        @Override // z4.i, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // z4.i, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // z4.i, java.util.List
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public i subList(int i7, int i8) {
            y4.h.l(i7, i8, this.f27858t);
            i iVar = i.this;
            int i9 = this.f27857s;
            return iVar.subList(i7 + i9, i8 + i9);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f27858t;
        }

        @Override // z4.i, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i7) {
            return super.listIterator(i7);
        }
    }

    i() {
    }

    static i i(Object[] objArr) {
        return j(objArr, objArr.length);
    }

    static i j(Object[] objArr, int i7) {
        return i7 == 0 ? o() : new t(objArr, i7);
    }

    private static i k(Object... objArr) {
        return i(q.b(objArr));
    }

    public static i o() {
        return t.f27878u;
    }

    public static i p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        y4.h.e(objArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr2 = new Object[objArr.length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        return k(objArr2);
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // z4.h
    int c(Object[] objArr, int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i7 + i8] = get(i8);
        }
        return i7 + size;
    }

    @Override // z4.h, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return m.a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i8 = 0; i8 < size; i8++) {
            i7 = ~(~((i7 * 31) + get(i8).hashCode()));
        }
        return i7;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return m.b(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public z iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return m.d(this, obj);
    }

    @Override // java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public a0 listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public a0 listIterator(int i7) {
        y4.h.j(i7, size());
        return isEmpty() ? f27855r : new a(this, i7);
    }

    @Override // java.util.List
    /* renamed from: q */
    public i subList(int i7, int i8) {
        y4.h.l(i7, i8, size());
        int i9 = i8 - i7;
        return i9 == size() ? this : i9 == 0 ? o() : r(i7, i8);
    }

    i r(int i7, int i8) {
        return new b(i7, i8 - i7);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }
}
