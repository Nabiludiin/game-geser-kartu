package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class p44 {
    public static long[] a(long[]... jArr) {
        long j7 = 0;
        for (long[] jArr2 : jArr) {
            j7 += jArr2.length;
        }
        int i7 = (int) j7;
        rx3.e(j7 == ((long) i7), "the total number of elements (%s) in the arrays must fit in an int", j7);
        long[] jArr3 = new long[i7];
        int i8 = 0;
        for (long[] jArr4 : jArr) {
            int length = jArr4.length;
            System.arraycopy(jArr4, 0, jArr3, i8, length);
            i8 += length;
        }
        return jArr3;
    }
}
