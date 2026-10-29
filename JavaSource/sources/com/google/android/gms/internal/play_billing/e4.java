package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: MyApplication */
final class e4 extends v2 implements RandomAccess, h4 {

    /* renamed from: t, reason: collision with root package name */
    private static final int[] f21520t;

    /* renamed from: u, reason: collision with root package name */
    private static final e4 f21521u;

    /* renamed from: r, reason: collision with root package name */
    private int[] f21522r;

    /* renamed from: s, reason: collision with root package name */
    private int f21523s;

    static {
        int[] iArr = new int[0];
        f21520t = iArr;
        f21521u = new e4(iArr, 0, false);
    }

    private e4(int[] iArr, int i7, boolean z7) {
        super(z7);
        this.f21522r = iArr;
        this.f21523s = i7;
    }

    public static e4 g() {
        return f21521u;
    }

    private static int j(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String k(int i7) {
        return "Index:" + i7 + ", Size:" + this.f21523s;
    }

    private final void l(int i7) {
        if (i7 < 0 || i7 >= this.f21523s) {
            throw new IndexOutOfBoundsException(k(i7));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.i4
    public final /* bridge */ /* synthetic */ i4 V(int i7) {
        if (i7 >= this.f21523s) {
            return new e4(i7 == 0 ? f21520t : Arrays.copyOf(this.f21522r, i7), this.f21523s, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        int intValue = ((Integer) obj).intValue();
        c();
        if (i7 < 0 || i7 > (i8 = this.f21523s)) {
            throw new IndexOutOfBoundsException(k(i7));
        }
        int i9 = i7 + 1;
        int[] iArr = this.f21522r;
        int length = iArr.length;
        if (i8 < length) {
            System.arraycopy(iArr, i7, iArr, i9, i8 - i7);
        } else {
            int[] iArr2 = new int[j(length)];
            System.arraycopy(this.f21522r, 0, iArr2, 0, i7);
            System.arraycopy(this.f21522r, i7, iArr2, i9, this.f21523s - i7);
            this.f21522r = iArr2;
        }
        this.f21522r[i7] = intValue;
        this.f21523s++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.v2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = j4.f21586b;
        collection.getClass();
        if (!(collection instanceof e4)) {
            return super.addAll(collection);
        }
        e4 e4Var = (e4) collection;
        int i7 = e4Var.f21523s;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f21523s;
        if (Integer.MAX_VALUE - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        int[] iArr = this.f21522r;
        if (i9 > iArr.length) {
            this.f21522r = Arrays.copyOf(iArr, i9);
        }
        System.arraycopy(e4Var.f21522r, 0, this.f21522r, this.f21523s, e4Var.f21523s);
        this.f21523s = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i7) {
        l(i7);
        return this.f21522r[i7];
    }

    @Override // com.google.android.gms.internal.play_billing.v2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4)) {
            return super.equals(obj);
        }
        e4 e4Var = (e4) obj;
        if (this.f21523s != e4Var.f21523s) {
            return false;
        }
        int[] iArr = e4Var.f21522r;
        for (int i7 = 0; i7 < this.f21523s; i7++) {
            if (this.f21522r[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        l(i7);
        return Integer.valueOf(this.f21522r[i7]);
    }

    public final void h(int i7) {
        c();
        int i8 = this.f21523s;
        int length = this.f21522r.length;
        if (i8 == length) {
            int[] iArr = new int[j(length)];
            System.arraycopy(this.f21522r, 0, iArr, 0, this.f21523s);
            this.f21522r = iArr;
        }
        int[] iArr2 = this.f21522r;
        int i9 = this.f21523s;
        this.f21523s = i9 + 1;
        iArr2[i9] = i7;
    }

    @Override // com.google.android.gms.internal.play_billing.v2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f21523s; i8++) {
            i7 = (i7 * 31) + this.f21522r[i8];
        }
        return i7;
    }

    final void i(int i7) {
        int length = this.f21522r.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.f21522r = new int[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = j(length);
        }
        this.f21522r = Arrays.copyOf(this.f21522r, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i7 = this.f21523s;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f21522r[i8] == intValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.v2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        c();
        l(i7);
        int[] iArr = this.f21522r;
        int i8 = iArr[i7];
        if (i7 < this.f21523s - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (r2 - i7) - 1);
        }
        this.f21523s--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i7, int i8) {
        c();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f21522r;
        System.arraycopy(iArr, i8, iArr, i7, this.f21523s - i8);
        this.f21523s -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        l(i7);
        int[] iArr = this.f21522r;
        int i8 = iArr[i7];
        iArr[i7] = intValue;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21523s;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Integer) obj).intValue());
        return true;
    }
}
