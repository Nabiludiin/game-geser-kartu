package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
abstract class c44 {
    static long a(double d8) {
        rx3.b(b(d8), "not a normal value");
        int exponent = Math.getExponent(d8);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d8) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits + doubleToRawLongBits : doubleToRawLongBits | 4503599627370496L;
    }

    static boolean b(double d8) {
        return Math.getExponent(d8) <= 1023;
    }
}
