package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
abstract class o44 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f13190a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i7 = 0; i7 < 10; i7++) {
            bArr[i7 + 48] = (byte) i7;
        }
        for (int i8 = 0; i8 < 26; i8++) {
            byte b8 = (byte) (i8 + 10);
            bArr[i8 + 65] = b8;
            bArr[i8 + 97] = b8;
        }
        f13190a = bArr;
    }

    static int a(char c8) {
        if (c8 < 128) {
            return f13190a[c8];
        }
        return -1;
    }
}
