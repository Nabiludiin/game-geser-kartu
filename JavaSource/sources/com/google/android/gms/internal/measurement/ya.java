package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: MyApplication */
final class ya extends p9 implements RandomAccess, bb, ec {

    /* renamed from: t, reason: collision with root package name */
    private static final int[] f21453t;

    /* renamed from: u, reason: collision with root package name */
    private static final ya f21454u;

    /* renamed from: r, reason: collision with root package name */
    private int[] f21455r;

    /* renamed from: s, reason: collision with root package name */
    private int f21456s;

    static {
        int[] iArr = new int[0];
        f21453t = iArr;
        f21454u = new ya(iArr, 0, false);
    }

    private ya(int[] iArr, int i7, boolean z7) {
        super(z7);
        this.f21455r = iArr;
        this.f21456s = i7;
    }

    public static ya e() {
        return f21454u;
    }

    private static int i(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final void j(int i7) {
        if (i7 < 0 || i7 >= this.f21456s) {
            throw new IndexOutOfBoundsException(k(i7));
        }
    }

    private final String k(int i7) {
        return r9.a(this.f21456s, i7, (byte) 13, "Index:", ", Size:");
    }

    final void I(int i7) {
        int length = this.f21455r.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.f21455r = new int[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = i(length);
        }
        this.f21455r = Arrays.copyOf(this.f21455r, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        int intValue = ((Integer) obj).intValue();
        c();
        if (i7 < 0 || i7 > (i8 = this.f21456s)) {
            throw new IndexOutOfBoundsException(k(i7));
        }
        int i9 = i7 + 1;
        int[] iArr = this.f21455r;
        int length = iArr.length;
        if (i8 < length) {
            System.arraycopy(iArr, i7, iArr, i9, i8 - i7);
        } else {
            int[] iArr2 = new int[i(length)];
            System.arraycopy(this.f21455r, 0, iArr2, 0, i7);
            System.arraycopy(this.f21455r, i7, iArr2, i9, this.f21456s - i7);
            this.f21455r = iArr2;
        }
        this.f21455r[i7] = intValue;
        this.f21456s++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.p9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = eb.f20914b;
        collection.getClass();
        if (!(collection instanceof ya)) {
            return super.addAll(collection);
        }
        ya yaVar = (ya) collection;
        int i7 = yaVar.f21456s;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f21456s;
        if (Integer.MAX_VALUE - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        int[] iArr = this.f21455r;
        if (i9 > iArr.length) {
            this.f21455r = Arrays.copyOf(iArr, i9);
        }
        System.arraycopy(yaVar.f21455r, 0, this.f21455r, this.f21456s, yaVar.f21456s);
        this.f21456s = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.db
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final bb b0(int i7) {
        if (i7 >= this.f21456s) {
            return new ya(i7 == 0 ? f21453t : Arrays.copyOf(this.f21455r, i7), this.f21456s, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.p9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya)) {
            return super.equals(obj);
        }
        ya yaVar = (ya) obj;
        if (this.f21456s != yaVar.f21456s) {
            return false;
        }
        int[] iArr = yaVar.f21455r;
        for (int i7 = 0; i7 < this.f21456s; i7++) {
            if (this.f21455r[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    public final int g(int i7) {
        j(i7);
        return this.f21455r[i7];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        j(i7);
        return Integer.valueOf(this.f21455r[i7]);
    }

    public final void h(int i7) {
        c();
        int i8 = this.f21456s;
        int length = this.f21455r.length;
        if (i8 == length) {
            int[] iArr = new int[i(length)];
            System.arraycopy(this.f21455r, 0, iArr, 0, this.f21456s);
            this.f21455r = iArr;
        }
        int[] iArr2 = this.f21455r;
        int i9 = this.f21456s;
        this.f21456s = i9 + 1;
        iArr2[i9] = i7;
    }

    @Override // com.google.android.gms.internal.measurement.p9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f21456s; i8++) {
            i7 = (i7 * 31) + this.f21455r[i8];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i7 = this.f21456s;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f21455r[i8] == intValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.p9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        c();
        j(i7);
        int[] iArr = this.f21455r;
        int i8 = iArr[i7];
        if (i7 < this.f21456s - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (r2 - i7) - 1);
        }
        this.f21456s--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i7, int i8) {
        c();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f21455r;
        System.arraycopy(iArr, i8, iArr, i7, this.f21456s - i8);
        this.f21456s -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        j(i7);
        int[] iArr = this.f21455r;
        int i8 = iArr[i7];
        iArr[i7] = intValue;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21456s;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Integer) obj).intValue());
        return true;
    }
}
