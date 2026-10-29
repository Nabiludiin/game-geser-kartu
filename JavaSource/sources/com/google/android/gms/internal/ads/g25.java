package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
abstract class g25 {
    static /* synthetic */ boolean a(byte b8) {
        return b8 >= 0;
    }

    static /* synthetic */ boolean b(byte b8) {
        return b8 < -32;
    }

    static /* synthetic */ boolean c(byte b8) {
        return b8 < -16;
    }

    static /* synthetic */ void d(byte b8, byte b9, char[] cArr, int i7) {
        if (b8 < -62 || g(b9)) {
            throw new e05("Protocol message had invalid UTF-8.");
        }
        cArr[i7] = (char) (((b8 & 31) << 6) | (b9 & 63));
    }

    static /* synthetic */ void e(byte b8, byte b9, byte b10, char[] cArr, int i7) {
        if (!g(b9)) {
            if (b8 == -32) {
                if (b9 >= -96) {
                    b8 = -32;
                }
            }
            if (b8 == -19) {
                if (b9 < -96) {
                    b8 = -19;
                }
            }
            if (!g(b10)) {
                cArr[i7] = (char) (((b8 & 15) << 12) | ((b9 & 63) << 6) | (b10 & 63));
                return;
            }
        }
        throw new e05("Protocol message had invalid UTF-8.");
    }

    static /* synthetic */ void f(byte b8, byte b9, byte b10, byte b11, char[] cArr, int i7) {
        if (g(b9) || (((b8 << 28) + (b9 + 112)) >> 30) != 0 || g(b10) || g(b11)) {
            throw new e05("Protocol message had invalid UTF-8.");
        }
        int i8 = ((b8 & 7) << 18) | ((b9 & 63) << 12) | ((b10 & 63) << 6) | (b11 & 63);
        cArr[i7] = (char) ((i8 >>> 10) + 55232);
        cArr[i7 + 1] = (char) ((i8 & 1023) + 56320);
    }

    private static boolean g(byte b8) {
        return b8 > -65;
    }
}
