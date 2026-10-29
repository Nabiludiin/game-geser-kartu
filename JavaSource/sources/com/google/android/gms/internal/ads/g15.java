package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: MyApplication */
final class g15 extends cy4 implements RandomAccess {

    /* renamed from: t, reason: collision with root package name */
    private static final Object[] f8613t;

    /* renamed from: u, reason: collision with root package name */
    private static final g15 f8614u;

    /* renamed from: r, reason: collision with root package name */
    private Object[] f8615r;

    /* renamed from: s, reason: collision with root package name */
    private int f8616s;

    static {
        Object[] objArr = new Object[0];
        f8613t = objArr;
        f8614u = new g15(objArr, 0, false);
    }

    private g15(Object[] objArr, int i7, boolean z7) {
        super(z7);
        this.f8615r = objArr;
        this.f8616s = i7;
    }

    public static g15 e() {
        return f8614u;
    }

    private static int h(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final void i(int i7) {
        if (i7 < 0 || i7 >= this.f8616s) {
            throw new IndexOutOfBoundsException(j(i7));
        }
    }

    private final String j(int i7) {
        int i8 = this.f8616s;
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 13 + String.valueOf(i8).length());
        sb.append("Index:");
        sb.append(i7);
        sb.append(", Size:");
        sb.append(i8);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.b05
    public final /* bridge */ /* synthetic */ b05 F(int i7) {
        if (i7 >= this.f8616s) {
            return new g15(i7 == 0 ? f8613t : Arrays.copyOf(this.f8615r, i7), this.f8616s, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        c();
        if (i7 < 0 || i7 > (i8 = this.f8616s)) {
            throw new IndexOutOfBoundsException(j(i7));
        }
        int i9 = i7 + 1;
        Object[] objArr = this.f8615r;
        int length = objArr.length;
        if (i8 < length) {
            System.arraycopy(objArr, i7, objArr, i9, i8 - i7);
        } else {
            Object[] objArr2 = new Object[h(length)];
            System.arraycopy(this.f8615r, 0, objArr2, 0, i7);
            System.arraycopy(this.f8615r, i7, objArr2, i9, this.f8616s - i7);
            this.f8615r = objArr2;
        }
        this.f8615r[i7] = obj;
        this.f8616s++;
        ((AbstractList) this).modCount++;
    }

    final void g(int i7) {
        int length = this.f8615r.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.f8615r = new Object[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = h(length);
        }
        this.f8615r = Arrays.copyOf(this.f8615r, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        i(i7);
        return this.f8615r[i7];
    }

    @Override // com.google.android.gms.internal.ads.cy4, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        c();
        i(i7);
        Object[] objArr = this.f8615r;
        Object obj = objArr[i7];
        if (i7 < this.f8616s - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.f8616s--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        c();
        i(i7);
        Object[] objArr = this.f8615r;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8616s;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i7 = this.f8616s;
        int length = this.f8615r.length;
        if (i7 == length) {
            this.f8615r = Arrays.copyOf(this.f8615r, h(length));
        }
        Object[] objArr = this.f8615r;
        int i8 = this.f8616s;
        this.f8616s = i8 + 1;
        objArr[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
