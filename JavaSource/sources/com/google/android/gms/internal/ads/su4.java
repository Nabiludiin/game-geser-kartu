package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* compiled from: MyApplication */
public abstract class su4 {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f15824a = Charset.forName("UTF-8");

    public static byte[] a(String str, int i7) {
        byte[] bytes = str.getBytes(f15824a);
        int length = bytes.length;
        ru4 ru4Var = new ru4(2, new byte[(length * 3) / 4]);
        if (!ru4Var.a(bytes, 0, length, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i8 = ru4Var.f14629b;
        byte[] bArr = ru4Var.f14628a;
        if (i8 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, 0, bArr2, 0, i8);
        return bArr2;
    }
}
