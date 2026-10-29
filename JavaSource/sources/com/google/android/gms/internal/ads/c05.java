package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: MyApplication */
public abstract class c05 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f6203a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f6204b;

    /* renamed from: c, reason: collision with root package name */
    public static final ByteBuffer f6205c;

    static {
        Charset.forName("US-ASCII");
        f6203a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f6204b = bArr;
        f6205c = ByteBuffer.wrap(bArr);
        uy4.e(bArr, 0, 0, false);
    }

    static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int b(boolean z7) {
        return z7 ? 1231 : 1237;
    }

    static int c(int i7, byte[] bArr, int i8, int i9) {
        for (int i10 = i8; i10 < i8 + i9; i10++) {
            i7 = (i7 * 31) + bArr[i10];
        }
        return i7;
    }
}
