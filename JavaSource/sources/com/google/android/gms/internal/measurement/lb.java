package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: MyApplication */
final class lb extends p9 implements RandomAccess, cb, ec {

    /* renamed from: t, reason: collision with root package name */
    private static final long[] f21116t;

    /* renamed from: u, reason: collision with root package name */
    private static final lb f21117u;

    /* renamed from: r, reason: collision with root package name */
    private long[] f21118r;

    /* renamed from: s, reason: collision with root package name */
    private int f21119s;

    static {
        long[] jArr = new long[0];
        f21116t = jArr;
        f21117u = new lb(jArr, 0, false);
    }

    private lb(long[] jArr, int i7, boolean z7) {
        super(z7);
        this.f21118r = jArr;
        this.f21119s = i7;
    }

    public static lb e() {
        return f21117u;
    }

    private static int i(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final void j(int i7) {
        if (i7 < 0 || i7 >= this.f21119s) {
            throw new IndexOutOfBoundsException(k(i7));
        }
    }

    private final String k(int i7) {
        return r9.a(this.f21119s, i7, (byte) 13, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.cb
    public final long R(int i7) {
        j(i7);
        return this.f21118r[i7];
    }

    @Override // com.google.android.gms.internal.measurement.db
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final cb b0(int i7) {
        if (i7 >= this.f21119s) {
            return new lb(i7 == 0 ? f21116t : Arrays.copyOf(this.f21118r, i7), this.f21119s, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        long longValue = ((Long) obj).longValue();
        c();
        if (i7 < 0 || i7 > (i8 = this.f21119s)) {
            throw new IndexOutOfBoundsException(k(i7));
        }
        int i9 = i7 + 1;
        long[] jArr = this.f21118r;
        int length = jArr.length;
        if (i8 < length) {
            System.arraycopy(jArr, i7, jArr, i9, i8 - i7);
        } else {
            long[] jArr2 = new long[i(length)];
            System.arraycopy(this.f21118r, 0, jArr2, 0, i7);
            System.arraycopy(this.f21118r, i7, jArr2, i9, this.f21119s - i7);
            this.f21118r = jArr2;
        }
        this.f21118r[i7] = longValue;
        this.f21119s++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.p9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = eb.f20914b;
        collection.getClass();
        if (!(collection instanceof lb)) {
            return super.addAll(collection);
        }
        lb lbVar = (lb) collection;
        int i7 = lbVar.f21119s;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f21119s;
        if (Integer.MAX_VALUE - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        long[] jArr = this.f21118r;
        if (i9 > jArr.length) {
            this.f21118r = Arrays.copyOf(jArr, i9);
        }
        System.arraycopy(lbVar.f21118r, 0, this.f21118r, this.f21119s, lbVar.f21119s);
        this.f21119s = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.p9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb)) {
            return super.equals(obj);
        }
        lb lbVar = (lb) obj;
        if (this.f21119s != lbVar.f21119s) {
            return false;
        }
        long[] jArr = lbVar.f21118r;
        for (int i7 = 0; i7 < this.f21119s; i7++) {
            if (this.f21118r[i7] != jArr[i7]) {
                return false;
            }
        }
        return true;
    }

    public final void g(long j7) {
        c();
        int i7 = this.f21119s;
        int length = this.f21118r.length;
        if (i7 == length) {
            long[] jArr = new long[i(length)];
            System.arraycopy(this.f21118r, 0, jArr, 0, this.f21119s);
            this.f21118r = jArr;
        }
        long[] jArr2 = this.f21118r;
        int i8 = this.f21119s;
        this.f21119s = i8 + 1;
        jArr2[i8] = j7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        j(i7);
        return Long.valueOf(this.f21118r[i7]);
    }

    final void h(int i7) {
        int length = this.f21118r.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.f21118r = new long[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = i(length);
        }
        this.f21118r = Arrays.copyOf(this.f21118r, length);
    }

    @Override // com.google.android.gms.internal.measurement.p9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f21119s; i8++) {
            long j7 = this.f21118r[i8];
            byte[] bArr = eb.f20914b;
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
        int i7 = this.f21119s;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f21118r[i8] == longValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.p9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        c();
        j(i7);
        long[] jArr = this.f21118r;
        long j7 = jArr[i7];
        if (i7 < this.f21119s - 1) {
            System.arraycopy(jArr, i7 + 1, jArr, i7, (r3 - i7) - 1);
        }
        this.f21119s--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j7);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i7, int i8) {
        c();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f21118r;
        System.arraycopy(jArr, i8, jArr, i7, this.f21119s - i8);
        this.f21119s -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        long longValue = ((Long) obj).longValue();
        c();
        j(i7);
        long[] jArr = this.f21118r;
        long j7 = jArr[i7];
        jArr[i7] = longValue;
        return Long.valueOf(j7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21119s;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Long) obj).longValue());
        return true;
    }
}
