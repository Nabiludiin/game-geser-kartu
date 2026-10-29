package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class nb {
    public static long a(String str) {
        String str2 = hi2.f9535a;
        String[] split = str.split("\\.", 2);
        long j7 = 0;
        for (String str3 : split[0].split(":", -1)) {
            j7 = (j7 * 60) + Long.parseLong(str3);
        }
        long j8 = j7 * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(trim));
            }
            j8 += Long.parseLong(trim);
        }
        return j8 * 1000;
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }
}
