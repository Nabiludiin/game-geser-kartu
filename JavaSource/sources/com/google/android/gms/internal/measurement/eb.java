package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: MyApplication */
public abstract class eb {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f20913a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f20914b;

    static {
        Charset.forName("US-ASCII");
        f20913a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f20914b = bArr;
        ByteBuffer.wrap(bArr);
        int i7 = ea.f20912a;
        try {
            new da(bArr, 0, 0, false, null).c(0);
        } catch (gb e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    public static int b(boolean z7) {
        return z7 ? 1231 : 1237;
    }

    static int c(int i7, byte[] bArr, int i8, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            i7 = (i7 * 31) + bArr[i10];
        }
        return i7;
    }

    static boolean d(xb xbVar) {
        return false;
    }
}
