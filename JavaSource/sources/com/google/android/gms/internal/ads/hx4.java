package com.google.android.gms.internal.ads;

import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: MyApplication */
public abstract class hx4 {
    public static BigDecimal a(String str) {
        c(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(String.valueOf(str)));
    }

    public static BigInteger b(String str) {
        c(str);
        return new BigInteger(str);
    }

    private static void c(String str) {
        if (str.length() <= 10000) {
            return;
        }
        String substring = str.substring(0, 30);
        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 28);
        sb.append("Number string too large: ");
        sb.append(substring);
        sb.append("...");
        throw new NumberFormatException(sb.toString());
    }
}
