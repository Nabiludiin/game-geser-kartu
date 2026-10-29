package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class hj3 {
    public static String a(byte[] bArr, boolean z7) {
        return c(true).h(bArr, 0, bArr.length);
    }

    public static byte[] b(String str, boolean z7) {
        byte[] i7 = c(z7).i(str);
        if (i7.length != 0 || str.length() <= 0) {
            return i7;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }

    private static q34 c(boolean z7) {
        return z7 ? q34.k().f() : q34.j();
    }
}
