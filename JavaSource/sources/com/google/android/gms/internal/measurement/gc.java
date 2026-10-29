package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: MyApplication */
final class gc extends p9 implements RandomAccess {

    /* renamed from: t, reason: collision with root package name */
    private static final Object[] f20979t;

    /* renamed from: u, reason: collision with root package name */
    private static final gc f20980u;

    /* renamed from: r, reason: collision with root package name */
    private Object[] f20981r;

    /* renamed from: s, reason: collision with root package name */
    private int f20982s;

    static {
        Object[] objArr = new Object[0];
        f20979t = objArr;
        f20980u = new gc(objArr, 0, false);
    }

    private gc(Object[] objArr, int i7, boolean z7) {
        super(z7);
        this.f20981r = objArr;
        this.f20982s = i7;
    }

    public static gc e() {
        return f20980u;
    }

    private static int h(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final void i(int i7) {
        if (i7 < 0 || i7 >= this.f20982s) {
            throw new IndexOutOfBoundsException(j(i7));
        }
    }

    private final String j(int i7) {
        return r9.a(this.f20982s, i7, (byte) 13, "Index:", ", Size:");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        c();
        if (i7 < 0 || i7 > (i8 = this.f20982s)) {
            throw new IndexOutOfBoundsException(j(i7));
        }
        int i9 = i7 + 1;
        Object[] objArr = this.f20981r;
        int length = objArr.length;
        if (i8 < length) {
            System.arraycopy(objArr, i7, objArr, i9, i8 - i7);
        } else {
            Object[] objArr2 = new Object[h(length)];
            System.arraycopy(this.f20981r, 0, objArr2, 0, i7);
            System.arraycopy(this.f20981r, i7, objArr2, i9, this.f20982s - i7);
            this.f20981r = objArr2;
        }
        this.f20981r[i7] = obj;
        this.f20982s++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.db
    public final /* bridge */ /* synthetic */ db b0(int i7) {
        if (i7 >= this.f20982s) {
            return new gc(i7 == 0 ? f20979t : Arrays.copyOf(this.f20981r, i7), this.f20982s, true);
        }
        throw new IllegalArgumentException();
    }

    final void g(int i7) {
        int length = this.f20981r.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.f20981r = new Object[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = h(length);
        }
        this.f20981r = Arrays.copyOf(this.f20981r, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        i(i7);
        return this.f20981r[i7];
    }

    @Override // com.google.android.gms.internal.measurement.p9, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        c();
        i(i7);
        Object[] objArr = this.f20981r;
        Object obj = objArr[i7];
        if (i7 < this.f20982s - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.f20982s--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        c();
        i(i7);
        Object[] objArr = this.f20981r;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20982s;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i7 = this.f20982s;
        int length = this.f20981r.length;
        if (i7 == length) {
            this.f20981r = Arrays.copyOf(this.f20981r, h(length));
        }
        Object[] objArr = this.f20981r;
        int i8 = this.f20982s;
        this.f20982s = i8 + 1;
        objArr[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
