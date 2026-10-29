package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
public final class hw1 {

    /* renamed from: a, reason: collision with root package name */
    private int f9735a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f9736b;

    public hw1(int i7) {
        this.f9736b = new long[i7];
    }

    public final void a(long j7) {
        int i7 = this.f9735a;
        long[] jArr = this.f9736b;
        if (i7 == jArr.length) {
            this.f9736b = Arrays.copyOf(jArr, i7 + i7);
        }
        long[] jArr2 = this.f9736b;
        int i8 = this.f9735a;
        this.f9735a = i8 + 1;
        jArr2[i8] = 0;
    }

    public final void b(long[] jArr) {
        int i7 = this.f9735a;
        int length = jArr.length;
        int i8 = i7 + length;
        long[] jArr2 = this.f9736b;
        int length2 = jArr2.length;
        if (i8 > length2) {
            this.f9736b = Arrays.copyOf(jArr2, Math.max(length2 + length2, i8));
        }
        System.arraycopy(jArr, 0, this.f9736b, this.f9735a, length);
        this.f9735a = i8;
    }

    public final long c(int i7) {
        if (i7 >= 0 && i7 < this.f9735a) {
            return this.f9736b[i7];
        }
        int i8 = this.f9735a;
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 24 + String.valueOf(i8).length());
        sb.append("Invalid index ");
        sb.append(i7);
        sb.append(", size is ");
        sb.append(i8);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int d() {
        return this.f9735a;
    }
}
