package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
final class ag4 {

    /* renamed from: a, reason: collision with root package name */
    final long[] f4944a;

    /* renamed from: b, reason: collision with root package name */
    final long[] f4945b;

    /* renamed from: c, reason: collision with root package name */
    final long[] f4946c;

    ag4(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f4944a = jArr;
        this.f4945b = jArr2;
        this.f4946c = jArr3;
    }

    static ag4 a(ag4 ag4Var, zf4 zf4Var) {
        ag4 ag4Var2 = zf4Var.f20162a;
        long[] jArr = ag4Var.f4944a;
        long[] jArr2 = ag4Var2.f4944a;
        long[] jArr3 = zf4Var.f20163b;
        jg4.e(jArr, jArr2, jArr3);
        long[] jArr4 = ag4Var.f4945b;
        long[] jArr5 = ag4Var2.f4945b;
        long[] jArr6 = ag4Var2.f4946c;
        jg4.e(jArr4, jArr5, jArr6);
        jg4.e(ag4Var.f4946c, jArr6, jArr3);
        return ag4Var;
    }

    final byte[] b() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        int i7 = jg4.f10547e;
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = this.f4946c;
        jg4.f(jArr4, jArr14);
        jg4.f(jArr13, jArr4);
        jg4.f(jArr12, jArr13);
        jg4.e(jArr5, jArr12, jArr14);
        jg4.e(jArr6, jArr5, jArr4);
        jg4.f(jArr12, jArr6);
        jg4.e(jArr7, jArr12, jArr5);
        jg4.f(jArr12, jArr7);
        jg4.f(jArr13, jArr12);
        jg4.f(jArr12, jArr13);
        jg4.f(jArr13, jArr12);
        jg4.f(jArr12, jArr13);
        jg4.e(jArr8, jArr12, jArr7);
        jg4.f(jArr12, jArr8);
        jg4.f(jArr13, jArr12);
        for (int i8 = 2; i8 < 10; i8 += 2) {
            jg4.f(jArr12, jArr13);
            jg4.f(jArr13, jArr12);
        }
        jg4.e(jArr9, jArr13, jArr8);
        jg4.f(jArr12, jArr9);
        jg4.f(jArr13, jArr12);
        for (int i9 = 2; i9 < 20; i9 += 2) {
            jg4.f(jArr12, jArr13);
            jg4.f(jArr13, jArr12);
        }
        jg4.e(jArr12, jArr13, jArr9);
        jg4.f(jArr13, jArr12);
        jg4.f(jArr12, jArr13);
        for (int i10 = 2; i10 < 10; i10 += 2) {
            jg4.f(jArr13, jArr12);
            jg4.f(jArr12, jArr13);
        }
        jg4.e(jArr10, jArr12, jArr8);
        jg4.f(jArr12, jArr10);
        jg4.f(jArr13, jArr12);
        for (int i11 = 2; i11 < 50; i11 += 2) {
            jg4.f(jArr12, jArr13);
            jg4.f(jArr13, jArr12);
        }
        jg4.e(jArr11, jArr13, jArr10);
        jg4.f(jArr13, jArr11);
        jg4.f(jArr12, jArr13);
        for (int i12 = 2; i12 < 100; i12 += 2) {
            jg4.f(jArr13, jArr12);
            jg4.f(jArr12, jArr13);
        }
        jg4.e(jArr13, jArr12, jArr11);
        jg4.f(jArr12, jArr13);
        jg4.f(jArr13, jArr12);
        for (int i13 = 2; i13 < 50; i13 += 2) {
            jg4.f(jArr12, jArr13);
            jg4.f(jArr13, jArr12);
        }
        jg4.e(jArr12, jArr13, jArr10);
        jg4.f(jArr13, jArr12);
        jg4.f(jArr12, jArr13);
        jg4.f(jArr13, jArr12);
        jg4.f(jArr12, jArr13);
        jg4.f(jArr13, jArr12);
        jg4.e(jArr, jArr13, jArr6);
        jg4.e(jArr2, this.f4944a, jArr);
        jg4.e(jArr3, this.f4945b, jArr);
        byte[] h8 = jg4.h(jArr3);
        h8[31] = (byte) ((cg4.f(jArr2) << 7) ^ h8[31]);
        return h8;
    }

    ag4() {
        this(new long[10], new long[10], new long[10]);
    }

    ag4(zf4 zf4Var) {
        this();
        a(this, zf4Var);
    }

    ag4(ag4 ag4Var) {
        this.f4944a = Arrays.copyOf(ag4Var.f4944a, 10);
        this.f4945b = Arrays.copyOf(ag4Var.f4945b, 10);
        this.f4946c = Arrays.copyOf(ag4Var.f4946c, 10);
    }
}
