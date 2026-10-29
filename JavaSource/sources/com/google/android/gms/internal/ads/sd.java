package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class sd {
    public static int a(byte[] bArr, int i7, int i8) {
        while (i7 < i8 && bArr[i7] != 71) {
            i7++;
        }
        return i7;
    }

    public static long b(y82 y82Var, int i7, int i8) {
        y82Var.G(i7);
        if (y82Var.C() < 5) {
            return -9223372036854775807L;
        }
        int b8 = y82Var.b();
        if ((8388608 & b8) != 0 || ((b8 >> 8) & 8191) != i8 || (b8 & 32) == 0 || y82Var.R() < 7 || y82Var.C() < 7 || (y82Var.R() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        y82Var.L(bArr, 0, 6);
        long j7 = bArr[0];
        long j8 = bArr[1];
        long j9 = bArr[2];
        long j10 = bArr[3] & 255;
        return ((j7 & 255) << 25) | ((j8 & 255) << 17) | ((j9 & 255) << 9) | (j10 + j10) | ((bArr[4] & 255) >> 7);
    }
}
