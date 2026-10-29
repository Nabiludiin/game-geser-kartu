package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;

/* compiled from: MyApplication */
public abstract class og4 {
    public static boolean a(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 != length) {
            char charAt = str.charAt(i7);
            int i8 = i7 + 1;
            if (!Character.isSurrogate(charAt)) {
                i7 = i8;
            } else {
                if (Character.isLowSurrogate(charAt) || i8 == length || !Character.isLowSurrogate(str.charAt(i8))) {
                    return false;
                }
                i7 += 2;
            }
        }
        return true;
    }

    public static pw4 b(String str) {
        try {
            vx4 vx4Var = new vx4(new StringReader(str));
            vx4Var.a(uw4.LEGACY_STRICT);
            return mg4.c(vx4Var);
        } catch (NumberFormatException e8) {
            throw new IOException(e8);
        }
    }

    public static long c(Number number) {
        if (number instanceof ng4) {
            return Long.parseLong(number.toString());
        }
        throw new IllegalArgumentException("does not contain a parsed number.");
    }
}
