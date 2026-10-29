package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: MyApplication */
final class h5 extends v2 implements RandomAccess {

    /* renamed from: t, reason: collision with root package name */
    private static final Object[] f21545t;

    /* renamed from: u, reason: collision with root package name */
    private static final h5 f21546u;

    /* renamed from: r, reason: collision with root package name */
    private Object[] f21547r;

    /* renamed from: s, reason: collision with root package name */
    private int f21548s;

    static {
        Object[] objArr = new Object[0];
        f21545t = objArr;
        f21546u = new h5(objArr, 0, false);
    }

    private h5(Object[] objArr, int i7, boolean z7) {
        super(z7);
        this.f21547r = objArr;
        this.f21548s = i7;
    }

    private final void I(int i7) {
        if (i7 < 0 || i7 >= this.f21548s) {
            throw new IndexOutOfBoundsException(i(i7));
        }
    }

    public static h5 e() {
        return f21546u;
    }

    private static int h(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String i(int i7) {
        return "Index:" + i7 + ", Size:" + this.f21548s;
    }

    @Override // com.google.android.gms.internal.play_billing.i4
    public final /* bridge */ /* synthetic */ i4 V(int i7) {
        if (i7 >= this.f21548s) {
            return new h5(i7 == 0 ? f21545t : Arrays.copyOf(this.f21547r, i7), this.f21548s, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        c();
        if (i7 < 0 || i7 > (i8 = this.f21548s)) {
            throw new IndexOutOfBoundsException(i(i7));
        }
        int i9 = i7 + 1;
        Object[] objArr = this.f21547r;
        int length = objArr.length;
        if (i8 < length) {
            System.arraycopy(objArr, i7, objArr, i9, i8 - i7);
        } else {
            Object[] objArr2 = new Object[h(length)];
            System.arraycopy(this.f21547r, 0, objArr2, 0, i7);
            System.arraycopy(this.f21547r, i7, objArr2, i9, this.f21548s - i7);
            this.f21547r = objArr2;
        }
        this.f21547r[i7] = obj;
        this.f21548s++;
        ((AbstractList) this).modCount++;
    }

    final void g(int i7) {
        int length = this.f21547r.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.f21547r = new Object[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = h(length);
        }
        this.f21547r = Arrays.copyOf(this.f21547r, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        I(i7);
        return this.f21547r[i7];
    }

    @Override // com.google.android.gms.internal.play_billing.v2, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        c();
        I(i7);
        Object[] objArr = this.f21547r;
        Object obj = objArr[i7];
        if (i7 < this.f21548s - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.f21548s--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        c();
        I(i7);
        Object[] objArr = this.f21547r;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21548s;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i7 = this.f21548s;
        int length = this.f21547r.length;
        if (i7 == length) {
            this.f21547r = Arrays.copyOf(this.f21547r, h(length));
        }
        Object[] objArr = this.f21547r;
        int i8 = this.f21548s;
        this.f21548s = i8 + 1;
        objArr[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
