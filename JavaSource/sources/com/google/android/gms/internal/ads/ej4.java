package com.google.android.gms.internal.ads;

import android.os.Build;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: MyApplication */
public abstract class ej4 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7657a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static final hw4 a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (charAt < '!' || charAt > '~') {
                StringBuilder sb = new StringBuilder(String.valueOf(charAt).length() + 33);
                sb.append("Not a printable ASCII character: ");
                sb.append(charAt);
                throw new dj4(sb.toString());
            }
            bArr[i7] = (byte) charAt;
        }
        return hw4.a(bArr);
    }

    public static final hw4 b(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (charAt < '!' || charAt > '~') {
                StringBuilder sb = new StringBuilder(String.valueOf(charAt).length() + 33);
                sb.append("Not a printable ASCII character: ");
                sb.append(charAt);
                throw new GeneralSecurityException(sb.toString());
            }
            bArr[i7] = (byte) charAt;
        }
        return hw4.a(bArr);
    }

    public static boolean c() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    public static Integer d() {
        if (c()) {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
        return null;
    }

    public static boolean e(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i7 = 0; i7 < bArr.length; i7++) {
            if (bArr2[i7] != bArr[i7]) {
                return false;
            }
        }
        return true;
    }
}
