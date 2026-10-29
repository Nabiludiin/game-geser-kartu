package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.DisplayMetrics;

/* compiled from: MyApplication */
public abstract class no {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f12820a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f12821b = 0;

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        for (int i7 = 0; i7 < bArr.length; i7++) {
            byte b8 = bArr[i7];
            char[] cArr2 = f12820a;
            int i8 = i7 + i7;
            cArr[i8] = cArr2[(b8 & 255) >>> 4];
            cArr[i8 + 1] = cArr2[b8 & 15];
        }
        return new String(cArr);
    }

    public static byte[] b(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("String must be of even-length");
        }
        byte[] bArr = new byte[length / 2];
        for (int i7 = 0; i7 < length; i7 += 2) {
            bArr[i7 / 2] = (byte) ((Character.digit(str.charAt(i7), 16) << 4) + Character.digit(str.charAt(i7 + 1), 16));
        }
        return bArr;
    }

    public static boolean c(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean d() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean e(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static long f(double d8, int i7, DisplayMetrics displayMetrics) {
        return Math.round(d8 / displayMetrics.density);
    }
}
