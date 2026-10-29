package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: MyApplication */
public final class ix1 {

    /* renamed from: a, reason: collision with root package name */
    private int f10251a;

    /* renamed from: b, reason: collision with root package name */
    private int f10252b;

    /* renamed from: c, reason: collision with root package name */
    private int f10253c;

    /* renamed from: d, reason: collision with root package name */
    private long[] f10254d;

    /* renamed from: e, reason: collision with root package name */
    private int f10255e;

    public ix1(int i7) {
        int i8 = 16;
        if (Integer.bitCount(16) != 1) {
            int highestOneBit = Integer.highestOneBit(15);
            i8 = highestOneBit + highestOneBit;
        }
        this.f10251a = 0;
        this.f10252b = -1;
        this.f10253c = 0;
        this.f10254d = new long[i8];
        this.f10255e = r3.length - 1;
    }

    public final void a(long j7) {
        int i7 = this.f10253c;
        long[] jArr = this.f10254d;
        int length = jArr.length;
        if (i7 == length) {
            int i8 = length + length;
            if (i8 < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[i8];
            int i9 = this.f10251a;
            int i10 = length - i9;
            System.arraycopy(jArr, i9, jArr2, 0, i10);
            System.arraycopy(this.f10254d, 0, jArr2, i10, i9);
            this.f10251a = 0;
            this.f10252b = this.f10253c - 1;
            this.f10254d = jArr2;
            this.f10255e = jArr2.length - 1;
            jArr = jArr2;
        }
        int i11 = (this.f10252b + 1) & this.f10255e;
        this.f10252b = i11;
        jArr[i11] = j7;
        this.f10253c++;
    }

    public final long b() {
        int i7 = this.f10253c;
        if (i7 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f10254d;
        int i8 = this.f10251a;
        long j7 = jArr[i8];
        this.f10251a = this.f10255e & (i8 + 1);
        this.f10253c = i7 - 1;
        return j7;
    }

    public final long c() {
        if (this.f10253c != 0) {
            return this.f10254d[this.f10251a];
        }
        throw new NoSuchElementException();
    }

    public final boolean d() {
        return this.f10253c == 0;
    }

    public final void e() {
        this.f10251a = 0;
        this.f10252b = -1;
        this.f10253c = 0;
    }
}
