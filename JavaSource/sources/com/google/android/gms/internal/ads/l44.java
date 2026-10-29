package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;

/* compiled from: MyApplication */
final class l44 extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: q, reason: collision with root package name */
    final int[] f11421q;

    /* renamed from: r, reason: collision with root package name */
    final int f11422r;

    /* renamed from: s, reason: collision with root package name */
    final int f11423s;

    l44(int[] iArr, int i7, int i8) {
        this.f11421q = iArr;
        this.f11422r = i7;
        this.f11423s = i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && m44.i(this.f11421q, ((Integer) obj).intValue(), this.f11422r, this.f11423s) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l44)) {
            return super.equals(obj);
        }
        l44 l44Var = (l44) obj;
        int i7 = this.f11423s;
        int i8 = this.f11422r;
        int i9 = l44Var.f11423s;
        int i10 = l44Var.f11422r;
        int i11 = i7 - i8;
        if (i9 - i10 != i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f11421q[i8 + i12] != l44Var.f11421q[i10 + i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        int i8 = this.f11423s;
        int i9 = this.f11422r;
        rx3.m(i7, i8 - i9, "index");
        return Integer.valueOf(this.f11421q[i9 + i7]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = this.f11422r; i8 < this.f11423s; i8++) {
            i7 = (i7 * 31) + this.f11421q[i8];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int[] iArr = this.f11421q;
        int intValue = ((Integer) obj).intValue();
        int i7 = this.f11422r;
        int i8 = m44.i(iArr, intValue, i7, this.f11423s);
        if (i8 >= 0) {
            return i8 - i7;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.f11421q;
            int intValue = ((Integer) obj).intValue();
            int i7 = this.f11422r;
            int i8 = this.f11423s - 1;
            while (true) {
                if (i8 < i7) {
                    i8 = -1;
                    break;
                }
                if (iArr[i8] == intValue) {
                    break;
                }
                i8--;
            }
            if (i8 >= 0) {
                return i8 - i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        int i8 = this.f11423s;
        int i9 = this.f11422r;
        Integer num = (Integer) obj;
        rx3.m(i7, i8 - i9, "index");
        int[] iArr = this.f11421q;
        int i10 = i9 + i7;
        int i11 = iArr[i10];
        num.getClass();
        iArr[i10] = num.intValue();
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11423s - this.f11422r;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        Spliterator.OfInt spliterator;
        spliterator = Spliterators.spliterator(this.f11421q, this.f11422r, this.f11423s, 0);
        return spliterator;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i8) {
        int i9 = this.f11423s;
        int i10 = this.f11422r;
        rx3.o(i7, i8, i9 - i10);
        return i7 == i8 ? Collections.EMPTY_LIST : new l44(this.f11421q, i7 + i10, i10 + i8);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i7 = this.f11423s;
        int i8 = this.f11422r;
        StringBuilder sb = new StringBuilder((i7 - i8) * 5);
        sb.append('[');
        int[] iArr = this.f11421q;
        sb.append(iArr[i8]);
        while (true) {
            i8++;
            if (i8 >= i7) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i8]);
        }
    }
}
