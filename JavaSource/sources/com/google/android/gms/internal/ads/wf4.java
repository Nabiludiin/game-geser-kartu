package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class wf4 {
    static void a(long[] jArr, long[] jArr2, int i7) {
        for (int i8 = 0; i8 < 10; i8++) {
            int i9 = (int) jArr[i8];
            jArr[i8] = ((-i7) & (((int) jArr2[i8]) ^ i9)) ^ i9;
        }
    }
}
