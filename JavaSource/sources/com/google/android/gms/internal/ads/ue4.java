package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
public abstract class ue4 {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        long c8 = c(bArr, 0, 0);
        long c9 = c(bArr, 3, 2) & 67108611;
        long c10 = c(bArr, 6, 4) & 67092735;
        long c11 = c(bArr, 9, 6) & 66076671;
        long c12 = c(bArr, 12, 8) & 1048575;
        int i7 = 17;
        byte[] bArr3 = new byte[17];
        long j7 = 0;
        int i8 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        while (true) {
            int length = bArr2.length;
            if (i8 >= length) {
                long j12 = j7 + (j8 >> 26);
                long j13 = j12 & 67108863;
                long j14 = j9 + (j12 >> 26);
                long j15 = j14 & 67108863;
                long j16 = j10 + (j14 >> 26);
                long j17 = j16 & 67108863;
                long j18 = j11 + ((j16 >> 26) * 5);
                long j19 = j18 & 67108863;
                long j20 = j19 + 5;
                long j21 = (j8 & 67108863) + (j18 >> 26);
                long j22 = j21 + (j20 >> 26);
                long j23 = (j22 >> 26) + j13;
                long j24 = j15 + (j23 >> 26);
                long j25 = (j17 + (j24 >> 26)) - 67108864;
                long j26 = j25 >> 63;
                long j27 = ~j26;
                long j28 = (j21 & j26) | (j22 & 67108863 & j27);
                long j29 = (j13 & j26) | (j23 & 67108863 & j27);
                long j30 = (j15 & j26) | (j24 & 67108863 & j27);
                long j31 = (j17 & j26) | (j25 & j27);
                long b8 = (((j26 & j19) | (j20 & 67108863 & j27) | (j28 << 26)) & 4294967295L) + b(bArr, 16);
                long b9 = (((j28 >> 6) | (j29 << 20)) & 4294967295L) + b(bArr, 20);
                long b10 = (((j29 >> 12) | (j30 << 14)) & 4294967295L) + b(bArr, 24);
                long b11 = (((j30 >> 18) | (j31 << 8)) & 4294967295L) + b(bArr, 28);
                byte[] bArr4 = new byte[16];
                d(bArr4, b8 & 4294967295L, 0);
                long j32 = b9 + (b8 >> 32);
                d(bArr4, j32 & 4294967295L, 4);
                long j33 = b10 + (j32 >> 32);
                d(bArr4, j33 & 4294967295L, 8);
                d(bArr4, (b11 + (j33 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int min = Math.min(16, length - i8);
            System.arraycopy(bArr2, i8, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, i7, (byte) 0);
            }
            long j34 = c12 * 5;
            long j35 = c11 * 5;
            long j36 = c10 * 5;
            long c13 = j11 + c(bArr3, 0, 0);
            long c14 = j8 + c(bArr3, 3, 2);
            long c15 = j7 + c(bArr3, 6, 4);
            long c16 = j9 + c(bArr3, 9, 6);
            long c17 = j10 + (c(bArr3, 12, 8) | (bArr3[16] << 24));
            long j37 = c14 * c8;
            long j38 = c14 * c9;
            long j39 = c14 * c10;
            long j40 = c16 * c8;
            long j41 = c14 * c11;
            long j42 = c17 * c8;
            long j43 = (c13 * c8) + (c14 * j34) + (c15 * j35) + (c16 * j36) + (c9 * 5 * c17);
            long j44 = (c13 * c9) + j37 + (c15 * j34) + (c16 * j35) + (j36 * c17) + (j43 >> 26);
            long j45 = (c13 * c10) + j38 + (c15 * c8) + (c16 * j34) + (j35 * c17) + (j44 >> 26);
            long j46 = (c13 * c11) + j39 + (c15 * c9) + j40 + (c17 * j34) + (j45 >> 26);
            long j47 = (c13 * c12) + j41 + (c15 * c10) + (c16 * c9) + j42 + (j46 >> 26);
            long j48 = (j43 & 67108863) + ((j47 >> 26) * 5);
            j8 = (j44 & 67108863) + (j48 >> 26);
            i8 += 16;
            j7 = j45 & 67108863;
            j9 = j46 & 67108863;
            j10 = j47 & 67108863;
            i7 = 17;
            j11 = j48 & 67108863;
        }
    }

    private static long b(byte[] bArr, int i7) {
        int i8 = bArr[i7] & 255;
        int i9 = bArr[i7 + 1] & 255;
        int i10 = bArr[i7 + 2] & 255;
        return (((bArr[i7 + 3] & 255) << 24) | (i9 << 8) | i8 | (i10 << 16)) & 4294967295L;
    }

    private static long c(byte[] bArr, int i7, int i8) {
        return (b(bArr, i7) >> i8) & 67108863;
    }

    private static void d(byte[] bArr, long j7, int i7) {
        for (int i8 = 0; i8 < 4; i8++) {
            bArr[i7 + i8] = (byte) (255 & j7);
            j7 >>= 8;
        }
    }
}
