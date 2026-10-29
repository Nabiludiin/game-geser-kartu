package com.google.android.gms.common.util;

/* compiled from: MyApplication */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f4563a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f4564b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i7 = 0;
        for (byte b8 : bArr) {
            char[] cArr2 = f4564b;
            cArr[i7] = cArr2[(b8 & 255) >>> 4];
            cArr[i7 + 1] = cArr2[b8 & 15];
            i7 += 2;
        }
        return new String(cArr);
    }

    public static String b(byte[] bArr, boolean z7) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i7 = 0; i7 < length && (!z7 || i7 != length - 1 || (bArr[i7] & 255) != 0); i7++) {
            char[] cArr = f4563a;
            sb.append(cArr[(bArr[i7] & 240) >>> 4]);
            sb.append(cArr[bArr[i7] & 15]);
        }
        return sb.toString();
    }

    public static byte[] c(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i7 = 0;
        while (i7 < length) {
            int i8 = i7 + 2;
            bArr[i7 / 2] = (byte) Integer.parseInt(str.substring(i7, i8), 16);
            i7 = i8;
        }
        return bArr;
    }
}
