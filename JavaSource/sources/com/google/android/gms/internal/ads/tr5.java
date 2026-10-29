package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* compiled from: MyApplication */
public final class tr5 {

    /* renamed from: a, reason: collision with root package name */
    private final Random f16342a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f16343b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f16344c;

    public tr5(int i7) {
        this(0, new Random());
    }

    public final int a() {
        return this.f16343b.length;
    }

    public final int b(int i7) {
        int i8 = this.f16344c[i7] + 1;
        int[] iArr = this.f16343b;
        if (i8 < iArr.length) {
            return iArr[i8];
        }
        return -1;
    }

    public final int c(int i7) {
        int i8 = this.f16344c[i7] - 1;
        if (i8 >= 0) {
            return this.f16343b[i8];
        }
        return -1;
    }

    public final int d() {
        int[] iArr = this.f16343b;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public final int e() {
        int[] iArr = this.f16343b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public final tr5 f(int i7, int i8) {
        int[] iArr = new int[i8];
        int[] iArr2 = new int[i8];
        int i9 = 0;
        while (i9 < i8) {
            Random random = this.f16342a;
            iArr[i9] = random.nextInt(this.f16343b.length + 1);
            int i10 = i9 + 1;
            int nextInt = random.nextInt(i10);
            iArr2[i9] = iArr2[nextInt];
            iArr2[nextInt] = i9;
            i9 = i10;
        }
        Arrays.sort(iArr);
        int[] iArr3 = this.f16343b;
        int[] iArr4 = new int[iArr3.length + i8];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < iArr3.length + i8; i13++) {
            if (i11 >= i8 || i12 != iArr[i11]) {
                int i14 = i12 + 1;
                int i15 = iArr3[i12];
                iArr4[i13] = i15;
                if (i15 >= 0) {
                    iArr4[i13] = i15 + i8;
                }
                i12 = i14;
            } else {
                iArr4[i13] = iArr2[i11];
                i11++;
            }
        }
        return new tr5(iArr4, new Random(this.f16342a.nextLong()));
    }

    public final tr5 g(int i7, int i8) {
        int[] iArr = this.f16343b;
        int[] iArr2 = new int[iArr.length - i8];
        int i9 = 0;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 < 0 || i11 >= i8) {
                int i12 = i10 - i9;
                if (i11 >= 0) {
                    i11 -= i8;
                }
                iArr2[i12] = i11;
            } else {
                i9++;
            }
        }
        return new tr5(iArr2, new Random(this.f16342a.nextLong()));
    }

    public final tr5 h() {
        return new tr5(0, new Random(this.f16342a.nextLong()));
    }

    private tr5(int i7, Random random) {
        this(new int[0], random);
    }

    private tr5(int[] iArr, Random random) {
        this.f16343b = iArr;
        this.f16342a = random;
        this.f16344c = new int[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            this.f16344c[iArr[i7]] = i7;
        }
    }
}
