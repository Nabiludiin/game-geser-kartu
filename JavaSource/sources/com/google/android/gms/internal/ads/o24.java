package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class o24 {
    static Object[] a(Object[] objArr, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            b(objArr[i8], i8);
        }
        return objArr;
    }

    static Object b(Object obj, int i7) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 9);
        sb.append("at index ");
        sb.append(i7);
        throw new NullPointerException(sb.toString());
    }
}
