package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: MyApplication */
final class j05 extends cy4 implements RandomAccess, zz4, e15 {

    /* renamed from: t, reason: collision with root package name */
    private static final long[] f10284t;

    /* renamed from: u, reason: collision with root package name */
    private static final j05 f10285u;

    /* renamed from: r, reason: collision with root package name */
    private long[] f10286r;

    /* renamed from: s, reason: collision with root package name */
    private int f10287s;

    static {
        long[] jArr = new long[0];
        f10284t = jArr;
        f10285u = new j05(jArr, 0, false);
    }

    private j05(long[] jArr, int i7, boolean z7) {
        super(z7);
        this.f10286r = jArr;
        this.f10287s = i7;
    }

    public static j05 g() {
        return f10285u;
    }

    private static int h(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final void i(int i7) {
        if (i7 < 0 || i7 >= this.f10287s) {
            throw new IndexOutOfBoundsException(j(i7));
        }
    }

    private final String j(int i7) {
        int i8 = this.f10287s;
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 13 + String.valueOf(i8).length());
        sb.append("Index:");
        sb.append(i7);
        sb.append(", Size:");
        sb.append(i8);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.b05
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final zz4 F(int i7) {
        if (i7 >= this.f10287s) {
            return new j05(i7 == 0 ? f10284t : Arrays.copyOf(this.f10286r, i7), this.f10287s, true);
        }
        throw new IllegalArgumentException();
    }

    final void I(int i7) {
        int length = this.f10286r.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.f10286r = new long[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = h(length);
        }
        this.f10286r = Arrays.copyOf(this.f10286r, length);
    }

    public final long R(int i7) {
        i(i7);
        return this.f10286r[i7];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        long longValue = ((Long) obj).longValue();
        c();
        if (i7 < 0 || i7 > (i8 = this.f10287s)) {
            throw new IndexOutOfBoundsException(j(i7));
        }
        int i9 = i7 + 1;
        long[] jArr = this.f10286r;
        int length = jArr.length;
        if (i8 < length) {
            System.arraycopy(jArr, i7, jArr, i9, i8 - i7);
        } else {
            long[] jArr2 = new long[h(length)];
            System.arraycopy(this.f10286r, 0, jArr2, 0, i7);
            System.arraycopy(this.f10286r, i7, jArr2, i9, this.f10287s - i7);
            this.f10286r = jArr2;
        }
        this.f10286r[i7] = longValue;
        this.f10287s++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.cy4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = c05.f6204b;
        collection.getClass();
        if (!(collection instanceof j05)) {
            return super.addAll(collection);
        }
        j05 j05Var = (j05) collection;
        int i7 = j05Var.f10287s;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f10287s;
        if (Integer.MAX_VALUE - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        long[] jArr = this.f10286r;
        if (i9 > jArr.length) {
            this.f10286r = Arrays.copyOf(jArr, i9);
        }
        System.arraycopy(j05Var.f10286r, 0, this.f10286r, this.f10287s, j05Var.f10287s);
        this.f10287s = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final long e(int i7, long j7) {
        c();
        i(i7);
        long[] jArr = this.f10286r;
        long j8 = jArr[i7];
        jArr[i7] = j7;
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.cy4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j05)) {
            return super.equals(obj);
        }
        j05 j05Var = (j05) obj;
        if (this.f10287s != j05Var.f10287s) {
            return false;
        }
        long[] jArr = j05Var.f10286r;
        for (int i7 = 0; i7 < this.f10287s; i7++) {
            if (this.f10286r[i7] != jArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zz4
    public final void f(long j7) {
        c();
        int i7 = this.f10287s;
        int length = this.f10286r.length;
        if (i7 == length) {
            long[] jArr = new long[h(length)];
            System.arraycopy(this.f10286r, 0, jArr, 0, this.f10287s);
            this.f10286r = jArr;
        }
        long[] jArr2 = this.f10286r;
        int i8 = this.f10287s;
        this.f10287s = i8 + 1;
        jArr2[i8] = j7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        i(i7);
        return Long.valueOf(this.f10286r[i7]);
    }

    @Override // com.google.android.gms.internal.ads.cy4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f10287s; i8++) {
            long j7 = this.f10286r[i8];
            byte[] bArr = c05.f6204b;
            i7 = (i7 * 31) + ((int) (j7 ^ (j7 >>> 32)));
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i7 = this.f10287s;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f10286r[i8] == longValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.cy4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        c();
        i(i7);
        long[] jArr = this.f10286r;
        long j7 = jArr[i7];
        if (i7 < this.f10287s - 1) {
            System.arraycopy(jArr, i7 + 1, jArr, i7, (r3 - i7) - 1);
        }
        this.f10287s--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j7);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i7, int i8) {
        c();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f10286r;
        System.arraycopy(jArr, i8, jArr, i7, this.f10287s - i8);
        this.f10287s -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        return Long.valueOf(e(i7, ((Long) obj).longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10287s;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Long) obj).longValue());
        return true;
    }
}
