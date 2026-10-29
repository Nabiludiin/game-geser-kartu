package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: MyApplication */
final class tz4 extends cy4 implements RandomAccess, xz4, e15 {

    /* renamed from: t, reason: collision with root package name */
    private static final int[] f16517t;

    /* renamed from: u, reason: collision with root package name */
    private static final tz4 f16518u;

    /* renamed from: r, reason: collision with root package name */
    private int[] f16519r;

    /* renamed from: s, reason: collision with root package name */
    private int f16520s;

    static {
        int[] iArr = new int[0];
        f16517t = iArr;
        f16518u = new tz4(iArr, 0, false);
    }

    private tz4(int[] iArr, int i7, boolean z7) {
        super(z7);
        this.f16519r = iArr;
        this.f16520s = i7;
    }

    public static tz4 e() {
        return f16518u;
    }

    private static int j(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final void k(int i7) {
        if (i7 < 0 || i7 >= this.f16520s) {
            throw new IndexOutOfBoundsException(l(i7));
        }
    }

    private final String l(int i7) {
        int i8 = this.f16520s;
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 13 + String.valueOf(i8).length());
        sb.append("Index:");
        sb.append(i7);
        sb.append(", Size:");
        sb.append(i8);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.xz4
    public final void I(int i7) {
        c();
        int i8 = this.f16520s;
        int length = this.f16519r.length;
        if (i8 == length) {
            int[] iArr = new int[j(length)];
            System.arraycopy(this.f16519r, 0, iArr, 0, this.f16520s);
            this.f16519r = iArr;
        }
        int[] iArr2 = this.f16519r;
        int i9 = this.f16520s;
        this.f16520s = i9 + 1;
        iArr2[i9] = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        int intValue = ((Integer) obj).intValue();
        c();
        if (i7 < 0 || i7 > (i8 = this.f16520s)) {
            throw new IndexOutOfBoundsException(l(i7));
        }
        int i9 = i7 + 1;
        int[] iArr = this.f16519r;
        int length = iArr.length;
        if (i8 < length) {
            System.arraycopy(iArr, i7, iArr, i9, i8 - i7);
        } else {
            int[] iArr2 = new int[j(length)];
            System.arraycopy(this.f16519r, 0, iArr2, 0, i7);
            System.arraycopy(this.f16519r, i7, iArr2, i9, this.f16520s - i7);
            this.f16519r = iArr2;
        }
        this.f16519r[i7] = intValue;
        this.f16520s++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.cy4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = c05.f6204b;
        collection.getClass();
        if (!(collection instanceof tz4)) {
            return super.addAll(collection);
        }
        tz4 tz4Var = (tz4) collection;
        int i7 = tz4Var.f16520s;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f16520s;
        if (Integer.MAX_VALUE - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        int[] iArr = this.f16519r;
        if (i9 > iArr.length) {
            this.f16519r = Arrays.copyOf(iArr, i9);
        }
        System.arraycopy(tz4Var.f16519r, 0, this.f16519r, this.f16520s, tz4Var.f16520s);
        this.f16520s = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.b05
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final xz4 F(int i7) {
        if (i7 >= this.f16520s) {
            return new tz4(i7 == 0 ? f16517t : Arrays.copyOf(this.f16519r, i7), this.f16520s, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.cy4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz4)) {
            return super.equals(obj);
        }
        tz4 tz4Var = (tz4) obj;
        if (this.f16520s != tz4Var.f16520s) {
            return false;
        }
        int[] iArr = tz4Var.f16519r;
        for (int i7 = 0; i7 < this.f16520s; i7++) {
            if (this.f16519r[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    public final int g(int i7) {
        k(i7);
        return this.f16519r[i7];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        k(i7);
        return Integer.valueOf(this.f16519r[i7]);
    }

    public final int h(int i7, int i8) {
        c();
        k(i7);
        int[] iArr = this.f16519r;
        int i9 = iArr[i7];
        iArr[i7] = i8;
        return i9;
    }

    @Override // com.google.android.gms.internal.ads.cy4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f16520s; i8++) {
            i7 = (i7 * 31) + this.f16519r[i8];
        }
        return i7;
    }

    final void i(int i7) {
        int length = this.f16519r.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.f16519r = new int[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = j(length);
        }
        this.f16519r = Arrays.copyOf(this.f16519r, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i7 = this.f16520s;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f16519r[i8] == intValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.cy4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        c();
        k(i7);
        int[] iArr = this.f16519r;
        int i8 = iArr[i7];
        if (i7 < this.f16520s - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (r2 - i7) - 1);
        }
        this.f16520s--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i7, int i8) {
        c();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f16519r;
        System.arraycopy(iArr, i8, iArr, i7, this.f16520s - i8);
        this.f16520s -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        return Integer.valueOf(h(i7, ((Integer) obj).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16520s;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        I(((Integer) obj).intValue());
        return true;
    }
}
