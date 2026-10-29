package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: MyApplication */
public final class cu5 {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f6641a;

    /* renamed from: b, reason: collision with root package name */
    private final as5[] f6642b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f6643c;

    /* renamed from: d, reason: collision with root package name */
    private final int[][][] f6644d;

    /* renamed from: e, reason: collision with root package name */
    private final as5 f6645e;

    cu5(String[] strArr, int[] iArr, as5[] as5VarArr, int[] iArr2, int[][][] iArr3, as5 as5Var) {
        this.f6641a = iArr;
        this.f6642b = as5VarArr;
        this.f6644d = iArr3;
        this.f6643c = iArr2;
        this.f6645e = as5Var;
    }

    public final int a(int i7) {
        return this.f6641a[i7];
    }

    public final as5 b(int i7) {
        return this.f6642b[i7];
    }

    public final int c(int i7, int i8, int i9) {
        return this.f6644d[i7][i8][i9];
    }

    public final int d(int i7, int i8, boolean z7) {
        as5[] as5VarArr = this.f6642b;
        int i9 = as5VarArr[i7].a(i8).f5434a;
        int[] iArr = new int[i9];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i9; i12++) {
            if ((this.f6644d[i7][i8][i12] & 7) == 4) {
                iArr[i11] = i12;
                i11++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i11);
        String str = null;
        int i13 = 0;
        int i14 = 16;
        boolean z8 = false;
        while (i10 < copyOf.length) {
            String str2 = as5VarArr[i7].a(i8).a(copyOf[i10]).f7775o;
            int i15 = i13 + 1;
            if (i13 == 0) {
                str = str2;
            } else {
                z8 |= !Objects.equals(str, str2);
            }
            i14 = Math.min(i14, this.f6644d[i7][i8][i10] & 24);
            i10++;
            i13 = i15;
        }
        return z8 ? Math.min(i14, this.f6643c[i7]) : i14;
    }

    public final as5 e() {
        return this.f6645e;
    }
}
