package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: MyApplication */
public abstract class q2 {
    public static void a(boolean z7, String str) {
        if (!z7) {
            throw wi.b(str, null);
        }
    }

    public static int b(n2 n2Var, byte[] bArr, int i7, int i8) {
        int i9 = 0;
        while (i9 < i8) {
            int w7 = n2Var.w(bArr, i7 + i9, i8 - i9);
            if (w7 == -1) {
                break;
            }
            i9 += w7;
        }
        return i9;
    }

    public static boolean c(n2 n2Var, byte[] bArr, int i7, int i8) {
        try {
            n2Var.s(bArr, i7, i8);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean d(n2 n2Var, int i7) {
        try {
            n2Var.B(i7);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(n2 n2Var, byte[] bArr, int i7, int i8, boolean z7) {
        try {
            return n2Var.x(bArr, 0, i8, z7);
        } catch (EOFException e8) {
            if (z7) {
                return false;
            }
            throw e8;
        }
    }

    public static int f(int i7) {
        if (i7 == 20) {
            return 63750;
        }
        if (i7 == 30) {
            return 2250000;
        }
        switch (i7) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i7) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }
}
