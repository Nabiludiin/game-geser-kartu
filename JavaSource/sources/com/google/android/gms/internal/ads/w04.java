package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: MyApplication */
public abstract class w04 extends s04 implements List, RandomAccess {

    /* renamed from: r, reason: collision with root package name */
    private static final k34 f17977r = new u04(q24.f14222v, 0);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f17978s = 0;

    w04() {
    }

    public static w04 m() {
        return q24.f14222v;
    }

    public static w04 n(Object obj) {
        Object[] objArr = {obj};
        o24.a(objArr, 1);
        return x(objArr, 1);
    }

    public static w04 o(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        o24.a(objArr, 2);
        return x(objArr, 2);
    }

    public static w04 p(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        o24.a(objArr, 3);
        return x(objArr, 3);
    }

    public static w04 q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        o24.a(objArr, 5);
        return x(objArr, 5);
    }

    public static w04 r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        o24.a(objArr, 6);
        return x(objArr, 6);
    }

    public static w04 s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i7 = length + 12;
        Object[] objArr2 = new Object[i7];
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
        System.arraycopy(objArr, 0, objArr2, 12, length);
        o24.a(objArr2, i7);
        return x(objArr2, i7);
    }

    public static w04 t(Iterable iterable) {
        iterable.getClass();
        return u((Collection) iterable);
    }

    public static w04 u(Collection collection) {
        if (!(collection instanceof s04)) {
            Object[] array = collection.toArray();
            int length = array.length;
            o24.a(array, length);
            return x(array, length);
        }
        w04 i7 = ((s04) collection).i();
        if (!i7.j()) {
            return i7;
        }
        Object[] array2 = i7.toArray();
        return x(array2, array2.length);
    }

    public static w04 v(Object[] objArr) {
        if (objArr.length == 0) {
            return q24.f14222v;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        o24.a(objArr2, length);
        return x(objArr2, length);
    }

    public static w04 w(Comparator comparator, Iterable iterable) {
        Object[] array = (iterable instanceof Collection ? (Collection) iterable : x14.a(((w04) iterable).listIterator(0))).toArray();
        int length = array.length;
        o24.a(array, length);
        Arrays.sort(array, comparator);
        return x(array, length);
    }

    static w04 x(Object[] objArr, int i7) {
        return i7 == 0 ? q24.f14222v : new q24(objArr, i7);
    }

    public static t04 z(int i7) {
        sz3.b(i7, "expectedSize");
        return new t04(i7);
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.s04
    public final j34 c() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.s04, java.util.AbstractCollection, java.util.Collection
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
                if (!Objects.equals(get(i7), list.get(i7))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
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

    @Override // com.google.android.gms.internal.ads.s04
    int k(Object[] objArr, int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i7 + i8] = get(i8);
        }
        return i7 + size;
    }

    @Override // java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public w04 subList(int i7, int i8) {
        rx3.o(i7, i8, size());
        int i9 = i8 - i7;
        return i9 == size() ? this : i9 == 0 ? q24.f14222v : new v04(this, i7, i9);
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
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final k34 listIterator(int i7) {
        rx3.n(i7, size(), "index");
        return isEmpty() ? f17977r : new u04(this, i7);
    }

    @Override // com.google.android.gms.internal.ads.s04
    public final w04 i() {
        return this;
    }
}
