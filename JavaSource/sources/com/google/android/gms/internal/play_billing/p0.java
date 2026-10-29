package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
public abstract class p0 {
    static Object[] a(Object[] objArr, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (objArr[i8] == null) {
                throw new NullPointerException("at index " + i8);
            }
        }
        return objArr;
    }
}
