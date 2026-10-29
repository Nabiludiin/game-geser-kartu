package com.google.android.gms.internal.drive;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f20655a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f20656b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f20657c;

    /* renamed from: d, reason: collision with root package name */
    private static final ByteBuffer f20658d;

    /* renamed from: e, reason: collision with root package name */
    private static final t f20659e;

    static {
        byte[] bArr = new byte[0];
        f20657c = bArr;
        f20658d = ByteBuffer.wrap(bArr);
        f20659e = t.a(bArr, 0, bArr.length, false);
    }

    static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    static int b(int i7, byte[] bArr, int i8, int i9) {
        for (int i10 = i8; i10 < i8 + i9; i10++) {
            i7 = (i7 * 31) + bArr[i10];
        }
        return i7;
    }

    static Object c(Object obj, Object obj2) {
        return ((i1) obj).g().u((i1) obj2).t();
    }

    static Object d(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static boolean e(byte[] bArr) {
        return t2.g(bArr);
    }

    public static int f(boolean z7) {
        return z7 ? 1231 : 1237;
    }

    public static String g(byte[] bArr) {
        return new String(bArr, f20655a);
    }

    static boolean h(i1 i1Var) {
        return false;
    }

    public static int i(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }
}
