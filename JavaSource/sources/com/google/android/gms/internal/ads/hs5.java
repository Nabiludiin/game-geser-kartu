package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: MyApplication */
public final class hs5 extends js5 {
    protected hs5(b00 b00Var, int[] iArr, int i7, qu5 qu5Var, long j7, long j8, long j9, int i8, int i9, float f8, float f9, List list, pd1 pd1Var) {
        super(b00Var, iArr, 0);
        w04.u(list);
    }

    static /* synthetic */ w04 e(yt5[] yt5VarArr) {
        int i7;
        int i8;
        long[][] jArr;
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i7 = 1;
            if (i10 >= 2) {
                break;
            }
            yt5 yt5Var = yt5VarArr[i10];
            if (yt5Var == null || yt5Var.f19790b.length <= 1) {
                arrayList.add(null);
            } else {
                int i11 = w04.f17978s;
                t04 t04Var = new t04();
                t04Var.g(new fs5(0L, 0L));
                arrayList.add(t04Var);
            }
            i10++;
        }
        long[][] jArr2 = new long[2][];
        for (int i12 = 0; i12 < 2; i12++) {
            yt5 yt5Var2 = yt5VarArr[i12];
            if (yt5Var2 == null) {
                jArr2[i12] = new long[0];
            } else {
                int[] iArr = yt5Var2.f19790b;
                jArr2[i12] = new long[iArr.length];
                for (int i13 = 0; i13 < iArr.length; i13++) {
                    long j7 = yt5Var2.f19789a.a(iArr[i13]).f7770j;
                    long[] jArr3 = jArr2[i12];
                    if (j7 == -1) {
                        j7 = 0;
                    }
                    jArr3[i13] = j7;
                }
                Arrays.sort(jArr2[i12]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr4 = new long[2];
        for (int i14 = 0; i14 < 2; i14++) {
            long[] jArr5 = jArr2[i14];
            jArr4[i14] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        f(arrayList, jArr4);
        r14 c8 = l24.b(p24.b()).b(2).c();
        int i15 = 0;
        while (i15 < 2) {
            int length = jArr2[i15].length;
            if (length <= i7) {
                i8 = i9;
                jArr = jArr2;
            } else {
                double[] dArr = new double[length];
                int i16 = i9;
                while (true) {
                    long[] jArr6 = jArr2[i15];
                    double d8 = 0.0d;
                    if (i16 >= jArr6.length) {
                        break;
                    }
                    int i17 = i9;
                    long[][] jArr7 = jArr2;
                    long j8 = jArr6[i16];
                    if (j8 != -1) {
                        d8 = Math.log(j8);
                    }
                    dArr[i16] = d8;
                    i16++;
                    i9 = i17;
                    jArr2 = jArr7;
                }
                i8 = i9;
                jArr = jArr2;
                int i18 = length - 1;
                double d9 = dArr[i18] - dArr[i8];
                int i19 = i8;
                while (i19 < i18) {
                    double d10 = dArr[i19];
                    i19++;
                    c8.a(Double.valueOf(d9 == 0.0d ? 1.0d : (((d10 + dArr[i19]) * 0.5d) - dArr[i8]) / d9), Integer.valueOf(i15));
                    i7 = i7;
                }
            }
            i15++;
            i9 = i8;
            jArr2 = jArr;
            i7 = i7;
        }
        int i20 = i9;
        long[][] jArr8 = jArr2;
        w04 u7 = w04.u(c8.r());
        for (int i21 = i20; i21 < u7.size(); i21++) {
            int intValue = ((Integer) u7.get(i21)).intValue();
            int i22 = iArr2[intValue] + 1;
            iArr2[intValue] = i22;
            jArr4[intValue] = jArr8[intValue][i22];
            f(arrayList, jArr4);
        }
        for (int i23 = i20; i23 < 2; i23++) {
            if (arrayList.get(i23) != null) {
                long j9 = jArr4[i23];
                jArr4[i23] = j9 + j9;
            }
        }
        f(arrayList, jArr4);
        t04 t04Var2 = new t04();
        while (i20 < arrayList.size()) {
            t04 t04Var3 = (t04) arrayList.get(i20);
            t04Var2.g(t04Var3 == null ? w04.m() : t04Var3.j());
            i20++;
        }
        return t04Var2.j();
    }

    private static void f(List list, long[] jArr) {
        long j7 = 0;
        for (int i7 = 0; i7 < 2; i7++) {
            j7 += jArr[i7];
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            t04 t04Var = (t04) list.get(i8);
            if (t04Var != null) {
                t04Var.g(new fs5(j7, jArr[i8]));
            }
        }
    }
}
