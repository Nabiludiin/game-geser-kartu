package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: MyApplication */
public abstract class q34 {

    /* renamed from: a, reason: collision with root package name */
    private static final q34 f14234a = new n34("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b, reason: collision with root package name */
    private static final q34 f14235b = new n34("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c, reason: collision with root package name */
    private static final q34 f14236c;

    static {
        new p34("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new p34("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        f14236c = new m34("base16()", "0123456789ABCDEF");
    }

    q34() {
    }

    public static q34 j() {
        return f14234a;
    }

    public static q34 k() {
        return f14235b;
    }

    public static q34 l() {
        return f14236c;
    }

    abstract void a(Appendable appendable, byte[] bArr, int i7, int i8);

    abstract int b(byte[] bArr, CharSequence charSequence);

    abstract int c(int i7);

    abstract int d(int i7);

    abstract CharSequence e(CharSequence charSequence);

    public abstract q34 f();

    public abstract q34 g();

    public final String h(byte[] bArr, int i7, int i8) {
        rx3.o(0, i8, bArr.length);
        StringBuilder sb = new StringBuilder(c(i8));
        try {
            a(sb, bArr, 0, i8);
            return sb.toString();
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }

    public final byte[] i(CharSequence charSequence) {
        try {
            CharSequence e8 = e(charSequence);
            int d8 = d(e8.length());
            byte[] bArr = new byte[d8];
            int b8 = b(bArr, e8);
            if (b8 == d8) {
                return bArr;
            }
            byte[] bArr2 = new byte[b8];
            System.arraycopy(bArr, 0, bArr2, 0, b8);
            return bArr2;
        } catch (o34 e9) {
            throw new IllegalArgumentException(e9);
        }
    }
}
