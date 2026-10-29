package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
public abstract class jg4 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f10543a = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f10544b = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f10545c = {67108863, 33554431};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f10546d = {26, 25};

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f10547e = 0;

    static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i7 = 0; i7 < 10; i7++) {
            jArr[i7] = jArr2[i7] + jArr3[i7];
        }
    }

    static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i7 = 0; i7 < 10; i7++) {
            jArr[i7] = jArr2[i7] - jArr3[i7];
        }
    }

    static void c(long[] jArr, long[] jArr2) {
        int length = jArr.length;
        if (length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, length);
            jArr = jArr3;
        }
        long j7 = jArr[8];
        long j8 = jArr[18];
        long j9 = j7 + (j8 << 4);
        jArr[8] = j9;
        long j10 = j9 + j8 + j8;
        jArr[8] = j10;
        jArr[8] = j10 + j8;
        long j11 = jArr[7];
        long j12 = jArr[17];
        long j13 = j11 + (j12 << 4);
        jArr[7] = j13;
        long j14 = j13 + j12 + j12;
        jArr[7] = j14;
        jArr[7] = j14 + j12;
        long j15 = jArr[6];
        long j16 = jArr[16];
        long j17 = j15 + (j16 << 4);
        jArr[6] = j17;
        long j18 = j17 + j16 + j16;
        jArr[6] = j18;
        jArr[6] = j18 + j16;
        long j19 = jArr[5];
        long j20 = jArr[15];
        long j21 = j19 + (j20 << 4);
        jArr[5] = j21;
        long j22 = j21 + j20 + j20;
        jArr[5] = j22;
        jArr[5] = j22 + j20;
        long j23 = jArr[4];
        long j24 = jArr[14];
        long j25 = j23 + (j24 << 4);
        jArr[4] = j25;
        long j26 = j25 + j24 + j24;
        jArr[4] = j26;
        jArr[4] = j26 + j24;
        long j27 = jArr[3];
        long j28 = jArr[13];
        long j29 = j27 + (j28 << 4);
        jArr[3] = j29;
        long j30 = j29 + j28 + j28;
        jArr[3] = j30;
        jArr[3] = j30 + j28;
        long j31 = jArr[2];
        long j32 = jArr[12];
        long j33 = j31 + (j32 << 4);
        jArr[2] = j33;
        long j34 = j33 + j32 + j32;
        jArr[2] = j34;
        jArr[2] = j34 + j32;
        long j35 = jArr[1];
        long j36 = jArr[11];
        long j37 = j35 + (j36 << 4);
        jArr[1] = j37;
        long j38 = j37 + j36 + j36;
        jArr[1] = j38;
        jArr[1] = j38 + j36;
        long j39 = jArr[0];
        long j40 = jArr[10];
        long j41 = j39 + (j40 << 4);
        jArr[0] = j41;
        long j42 = j41 + j40 + j40;
        jArr[0] = j42;
        jArr[0] = j42 + j40;
        d(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    static void d(long[] jArr) {
        jArr[10] = 0;
        int i7 = 0;
        while (i7 < 10) {
            long j7 = jArr[i7];
            long j8 = j7 / 67108864;
            jArr[i7] = j7 - (j8 << 26);
            int i8 = i7 + 1;
            long j9 = jArr[i8] + j8;
            jArr[i8] = j9;
            long j10 = j9 / 33554432;
            jArr[i8] = j9 - (j10 << 25);
            i7 += 2;
            jArr[i7] = jArr[i7] + j10;
        }
        long j11 = jArr[0];
        long j12 = jArr[10];
        long j13 = j11 + (j12 << 4);
        jArr[0] = j13;
        long j14 = j13 + j12 + j12;
        jArr[0] = j14;
        long j15 = j14 + j12;
        jArr[0] = j15;
        jArr[10] = 0;
        long j16 = j15 / 67108864;
        jArr[0] = j15 - (j16 << 26);
        jArr[1] = jArr[1] + j16;
    }

    static void e(long[] jArr, long[] jArr2, long[] jArr3) {
        long j7 = jArr2[0];
        long j8 = jArr3[0];
        long j9 = j7 * j8;
        long j10 = jArr3[1];
        long j11 = jArr2[1];
        long j12 = (j7 * j10) + (j11 * j8);
        long j13 = jArr3[2];
        long j14 = jArr2[2];
        long j15 = ((j11 + j11) * j10) + (j7 * j13) + (j14 * j8);
        long j16 = jArr3[3];
        long j17 = jArr2[3];
        long j18 = (j11 * j13) + (j14 * j10) + (j7 * j16) + (j17 * j8);
        long j19 = jArr3[4];
        long j20 = jArr2[4];
        long j21 = (j11 * j16) + (j17 * j10);
        long j22 = (j14 * j13) + j21 + j21 + (j7 * j19) + (j20 * j8);
        long j23 = jArr3[5];
        long j24 = jArr2[5];
        long j25 = (j14 * j16) + (j17 * j13) + (j11 * j19) + (j20 * j10) + (j7 * j23) + (j24 * j8);
        long j26 = jArr3[6];
        long j27 = jArr2[6];
        long j28 = (j17 * j16) + (j11 * j23) + (j24 * j10);
        long j29 = j28 + j28 + (j14 * j19) + (j20 * j13) + (j7 * j26) + (j27 * j8);
        long j30 = jArr3[7];
        long j31 = jArr2[7];
        long j32 = (j17 * j19) + (j20 * j16) + (j14 * j23) + (j24 * j13) + (j11 * j26) + (j27 * j10) + (j7 * j30) + (j31 * j8);
        long j33 = jArr3[8];
        long j34 = jArr2[8];
        long j35 = (j17 * j23) + (j24 * j16) + (j11 * j30) + (j31 * j10);
        long j36 = (j20 * j19) + j35 + j35 + (j14 * j26) + (j27 * j13) + (j7 * j33) + (j34 * j8);
        long j37 = jArr3[9];
        long j38 = jArr2[9];
        long j39 = (j20 * j23) + (j24 * j19) + (j17 * j26) + (j27 * j16) + (j14 * j30) + (j31 * j13) + (j11 * j33) + (j34 * j10) + (j7 * j37) + (j8 * j38);
        long j40 = (j24 * j23) + (j17 * j30) + (j31 * j16) + (j11 * j37) + (j10 * j38);
        long j41 = (j24 * j30) + (j31 * j23) + (j17 * j37) + (j16 * j38);
        long j42 = (j31 * j30) + (j24 * j37) + (j23 * j38);
        long j43 = (j31 * j33) + (j34 * j30) + (j27 * j37) + (j26 * j38);
        long j44 = (j31 * j37) + (j30 * j38);
        c(new long[]{j9, j12, j15, j18, j22, j25, j29, j32, j36, j39, j40 + j40 + (j20 * j26) + (j27 * j19) + (j14 * j33) + (j34 * j13), (j24 * j26) + (j27 * j23) + (j20 * j30) + (j31 * j19) + (j17 * j33) + (j34 * j16) + (j14 * j37) + (j13 * j38), (j27 * j26) + j41 + j41 + (j20 * j33) + (j34 * j19), (j27 * j30) + (j31 * j26) + (j24 * j33) + (j34 * j23) + (j20 * j37) + (j19 * j38), j42 + j42 + (j27 * j33) + (j34 * j26), j43, (j34 * j33) + j44 + j44, (j34 * j37) + (j33 * j38), (j38 + j38) * j37}, jArr);
    }

    static void f(long[] jArr, long[] jArr2) {
        long j7 = jArr2[0];
        long j8 = j7 * j7;
        long j9 = jArr2[1];
        long j10 = (j7 + j7) * j9;
        long j11 = jArr2[2];
        long j12 = (j9 * j9) + (j7 * j11);
        long j13 = jArr2[3];
        long j14 = (j9 * j11) + (j7 * j13);
        long j15 = jArr2[4];
        long j16 = (j11 * j11) + (j9 * 4 * j13) + ((j7 + j7) * j15);
        long j17 = jArr2[5];
        long j18 = (j11 * j13) + (j9 * j15) + (j7 * j17);
        long j19 = jArr2[6];
        long j20 = (j13 * j13) + (j11 * j15) + (j7 * j19) + ((j9 + j9) * j17);
        long j21 = jArr2[7];
        long j22 = (j13 * j15) + (j11 * j17) + (j9 * j19) + (j7 * j21);
        long j23 = jArr2[8];
        long j24 = (j9 * j21) + (j13 * j17);
        long j25 = (j11 * j19) + (j7 * j23) + j24 + j24;
        long j26 = (j15 * j15) + j25 + j25;
        long j27 = jArr2[9];
        long j28 = (j15 * j17) + (j13 * j19) + (j11 * j21) + (j9 * j23) + (j7 * j27);
        long j29 = (j13 * j21) + (j9 * j27);
        long j30 = (j17 * j17) + (j15 * j19) + (j11 * j23) + j29 + j29;
        long j31 = (j17 * j19) + (j15 * j21) + (j13 * j23) + (j11 * j27);
        long j32 = (j17 * j21) + (j13 * j27);
        long j33 = (j15 * j23) + j32 + j32;
        long j34 = (j19 * j21) + (j17 * j23) + (j15 * j27);
        long j35 = (j21 * j21) + (j19 * j23) + ((j17 + j17) * j27);
        long j36 = (j21 * j23) + (j19 * j27);
        c(new long[]{j8, j10, j12 + j12, j14 + j14, j16, j18 + j18, j20 + j20, j22 + j22, j26, j28 + j28, j30 + j30, j31 + j31, (j19 * j19) + j33 + j33, j34 + j34, j35 + j35, j36 + j36, (j23 * j23) + (j21 * 4 * j27), (j23 + j23) * j27, (j27 + j27) * j27}, jArr);
    }

    static long[] g(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i7 = 0; i7 < 10; i7++) {
            int i8 = f10543a[i7];
            jArr[i7] = (((((bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8)) | ((bArr[i8 + 2] & 255) << 16)) | ((bArr[i8 + 3] & 255) << 24)) >> f10544b[i7]) & f10545c[i7 & 1];
        }
        return jArr;
    }

    public static byte[] h(long[] jArr) {
        int i7;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= 2) {
                break;
            }
            int i10 = 0;
            while (i10 < 9) {
                long j7 = copyOf[i10];
                int i11 = -((int) (((j7 >> 31) & j7) >> f10546d[i10 & 1]));
                copyOf[i10] = j7 + (i11 << r14);
                i10++;
                copyOf[i10] = copyOf[i10] - i11;
            }
            long j8 = copyOf[9];
            copyOf[9] = j8 + (r6 << 25);
            copyOf[0] = copyOf[0] - ((-((int) (((j8 >> 31) & j8) >> 25))) * 19);
            i9++;
        }
        long j9 = copyOf[0];
        copyOf[0] = j9 + (r3 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j9 >> 31) & j9) >> 26)));
        int i12 = 0;
        while (i12 < 2) {
            int i13 = i8;
            while (i13 < 9) {
                long j10 = copyOf[i13];
                int i14 = i8;
                long j11 = j10 >> f10546d[i13 & 1];
                copyOf[i13] = j10 & f10545c[r14];
                i13++;
                copyOf[i13] = copyOf[i13] + ((int) j11);
                i8 = i14;
                i12 = i12;
            }
            i12++;
        }
        int i15 = i8;
        copyOf[9] = copyOf[9] & 33554431;
        copyOf[i15] = copyOf[i15] + (((int) (r2 >> 25)) * 19);
        int i16 = ~((((int) r2) - 67108845) >> 31);
        for (int i17 = 1; i17 < 10; i17++) {
            int i18 = ~(((int) copyOf[i17]) ^ f10545c[i17 & 1]);
            int i19 = i18 & (i18 << 16);
            int i20 = i19 & (i19 << 8);
            int i21 = i20 & (i20 << 4);
            int i22 = i21 & (i21 << 2);
            i16 &= (i22 & (i22 + i22)) >> 31;
        }
        copyOf[i15] = copyOf[i15] - (67108845 & i16);
        long j12 = 33554431 & i16;
        copyOf[1] = copyOf[1] - j12;
        for (i7 = 2; i7 < 10; i7 += 2) {
            copyOf[i7] = copyOf[i7] - (67108863 & i16);
            int i23 = i7 + 1;
            copyOf[i23] = copyOf[i23] - j12;
        }
        for (int i24 = i15; i24 < 10; i24++) {
            copyOf[i24] = copyOf[i24] << f10544b[i24];
        }
        byte[] bArr = new byte[32];
        for (int i25 = i15; i25 < 10; i25++) {
            int i26 = f10543a[i25];
            long j13 = bArr[i26];
            long j14 = copyOf[i25];
            bArr[i26] = (byte) (j13 | (j14 & 255));
            bArr[i26 + 1] = (byte) (bArr[r5] | ((j14 >> 8) & 255));
            bArr[i26 + 2] = (byte) (bArr[r5] | ((j14 >> 16) & 255));
            bArr[i26 + 3] = (byte) (bArr[r4] | ((j14 >> 24) & 255));
        }
        return bArr;
    }
}
