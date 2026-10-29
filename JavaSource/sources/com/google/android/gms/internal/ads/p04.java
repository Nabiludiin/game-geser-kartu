package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class p04 {
    p04() {
    }

    static int b(int i7, int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i8 <= i7) {
            return i7;
        }
        int i9 = i7 + (i7 >> 1) + 1;
        if (i9 < i8) {
            int highestOneBit = Integer.highestOneBit(i8 - 1);
            i9 = highestOneBit + highestOneBit;
        }
        if (i9 < 0) {
            return Integer.MAX_VALUE;
        }
        return i9;
    }

    public abstract p04 a(Object obj);
}
