package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: MyApplication */
public abstract class j0 extends g0 implements List, RandomAccess {

    /* renamed from: r, reason: collision with root package name */
    private static final z0 f21574r = new h0(r0.f21723v, 0);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f21575s = 0;

    j0() {
    }

    static j0 l(Object[] objArr, int i7) {
        return i7 == 0 ? r0.f21723v : new r0(objArr, i7);
    }

    public static j0 m(Collection collection) {
        if (!(collection instanceof g0)) {
            Object[] array = collection.toArray();
            int length = array.length;
            p0.a(array, length);
            return l(array, length);
        }
        j0 h8 = ((g0) collection).h();
        if (!h8.i()) {
            return h8;
        }
        Object[] array2 = h8.toArray();
        return l(array2, array2.length);
    }

    public static j0 n() {
        return r0.f21723v;
    }

    public static j0 o(Object obj) {
        Object[] objArr = {"inapp"};
        p0.a(objArr, 1);
        return l(objArr, 1);
    }

    public static j0 p(Object obj, Object obj2) {
        Object[] objArr = {"subs", "inapp"};
        p0.a(objArr, 2);
        return l(objArr, 2);
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.g0
    int c(Object[] objArr, int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i8] = get(i8);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.play_billing.g0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i7 = 0; i7 < size; i7++) {
                if (!v.a(get(i7), list.get(i7))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !v.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i8 = 0; i8 < size; i8++) {
            i7 = (i7 * 31) + get(i8).hashCode();
        }
        return i7;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (obj.equals(get(i7))) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public j0 subList(int i7, int i8) {
        w.d(i7, i8, size());
        int i9 = i8 - i7;
        return i9 == size() ? this : i9 == 0 ? r0.f21723v : new i0(this, i7, i9);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final z0 listIterator(int i7) {
        w.b(i7, size(), "index");
        return isEmpty() ? f21574r : new h0(this, i7);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.g0
    public final j0 h() {
        return this;
    }
}
