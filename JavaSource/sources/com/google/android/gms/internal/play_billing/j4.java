package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: MyApplication */
public abstract class j4 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f21585a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f21586b;

    static {
        Charset.forName("US-ASCII");
        f21585a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f21586b = bArr;
        ByteBuffer.wrap(bArr);
        int i7 = l3.f21605a;
        try {
            new j3(bArr, 0, 0, false, null).c(0);
        } catch (l4 e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public static int a(boolean z7) {
        return z7 ? 1231 : 1237;
    }

    static int b(int i7, byte[] bArr, int i8, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            i7 = (i7 * 31) + bArr[i10];
        }
        return i7;
    }

    static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }
}
