package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
abstract class h44 {
    static long a(String str, long j7) {
        if (j7 >= 0) {
            return j7;
        }
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(j7).length() + 14);
        sb.append(str);
        sb.append(" (");
        sb.append(j7);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    static void b(boolean z7) {
        if (!z7) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
