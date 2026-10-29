package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: MyApplication */
public abstract class cg4 {

    /* renamed from: a, reason: collision with root package name */
    private static final xf4 f6425a = new xf4(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: b, reason: collision with root package name */
    private static final zf4 f6426b = new zf4(new ag4(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: c, reason: collision with root package name */
    static final byte[] f6427c = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static byte[] a(byte[] bArr) {
        int i7;
        byte[] bArr2 = new byte[64];
        int i8 = 0;
        while (true) {
            if (i8 >= 32) {
                break;
            }
            int i9 = i8 + i8;
            bArr2[i9] = (byte) (bArr[i8] & 15);
            bArr2[i9 + 1] = (byte) ((bArr[i8] & 255) >> 4);
            i8++;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < 63) {
            byte b8 = (byte) (bArr2[i10] + i11);
            bArr2[i10] = b8;
            int i12 = (b8 + 8) >> 4;
            bArr2[i10] = (byte) (b8 - (i12 << 4));
            i10++;
            i11 = i12;
        }
        bArr2[63] = (byte) (bArr2[63] + i11);
        zf4 zf4Var = new zf4(f6426b);
        bg4 bg4Var = new bg4();
        for (i7 = 1; i7 < 64; i7 += 2) {
            xf4 xf4Var = new xf4(f6425a);
            k(xf4Var, i7 / 2, bArr2[i7]);
            bg4.a(bg4Var, zf4Var);
            g(zf4Var, bg4Var, xf4Var);
        }
        ag4 ag4Var = new ag4();
        ag4.a(ag4Var, zf4Var);
        i(zf4Var, ag4Var);
        ag4.a(ag4Var, zf4Var);
        i(zf4Var, ag4Var);
        ag4.a(ag4Var, zf4Var);
        i(zf4Var, ag4Var);
        ag4.a(ag4Var, zf4Var);
        i(zf4Var, ag4Var);
        for (int i13 = 0; i13 < 64; i13 += 2) {
            xf4 xf4Var2 = new xf4(f6425a);
            k(xf4Var2, i13 / 2, bArr2[i13]);
            bg4.a(bg4Var, zf4Var);
            g(zf4Var, bg4Var, xf4Var2);
        }
        ag4 ag4Var2 = new ag4(zf4Var);
        long[] jArr = new long[10];
        jg4.f(jArr, ag4Var2.f4944a);
        long[] jArr2 = new long[10];
        jg4.f(jArr2, ag4Var2.f4945b);
        long[] jArr3 = new long[10];
        jg4.f(jArr3, ag4Var2.f4946c);
        long[] jArr4 = new long[10];
        jg4.f(jArr4, jArr3);
        long[] jArr5 = new long[10];
        jg4.b(jArr5, jArr2, jArr);
        jg4.e(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        jg4.e(jArr6, jArr, jArr2);
        jg4.e(jArr6, jArr6, eg4.f7612a);
        jg4.a(jArr6, jArr6, jArr4);
        jg4.c(jArr6, jArr6);
        if (MessageDigest.isEqual(jg4.h(jArr5), jg4.h(jArr6))) {
            return ag4Var2.b();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static byte[] b(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) gv4.f9172e.b("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] digest = messageDigest.digest();
        digest[0] = (byte) (digest[0] & 248);
        int i7 = digest[31] & Byte.MAX_VALUE;
        digest[31] = (byte) i7;
        digest[31] = (byte) (i7 | 64);
        return digest;
    }

    public static boolean c(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte b8;
        byte[] bArr4 = bArr2;
        byte[] bArr5 = bArr3;
        if (bArr4.length != 64) {
            return false;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr4, 32, 64);
        int i7 = 31;
        while (true) {
            if (i7 < 0) {
                break;
            }
            int i8 = copyOfRange[i7] & 255;
            int i9 = f6427c[i7] & 255;
            if (i8 == i9) {
                i7--;
                bArr4 = bArr2;
                bArr5 = bArr3;
            } else if (i8 < i9) {
                MessageDigest messageDigest = (MessageDigest) gv4.f9172e.b("SHA-512");
                messageDigest.update(bArr4, 0, 32);
                messageDigest.update(bArr5);
                messageDigest.update(bArr);
                byte[] digest = messageDigest.digest();
                long n7 = n(digest, 0) & 2097151;
                long o7 = o(digest, 2) >> 5;
                long n8 = n(digest, 5) >> 2;
                long o8 = o(digest, 7) >> 7;
                long o9 = o(digest, 10) >> 4;
                long n9 = n(digest, 13) >> 1;
                long o10 = o(digest, 15) >> 6;
                long n10 = n(digest, 18) >> 3;
                long n11 = n(digest, 21) & 2097151;
                long o11 = o(digest, 23) >> 5;
                long n12 = n(digest, 26) >> 2;
                long o12 = o(digest, 28) >> 7;
                long o13 = o(digest, 31) >> 4;
                long n13 = n(digest, 34) >> 1;
                long o14 = o(digest, 36) >> 6;
                long n14 = n(digest, 39) >> 3;
                long n15 = n(digest, 42) & 2097151;
                long o15 = o(digest, 44) >> 5;
                long n16 = (n(digest, 47) >> 2) & 2097151;
                long o16 = (o(digest, 49) >> 7) & 2097151;
                long o17 = (o(digest, 52) >> 4) & 2097151;
                long n17 = (n(digest, 55) >> 1) & 2097151;
                long o18 = (o(digest, 57) >> 6) & 2097151;
                long o19 = o(digest, 60) >> 3;
                long j7 = (o10 & 2097151) + (n16 * 666643);
                long j8 = (j7 + 1048576) >> 21;
                long j9 = j8 << 21;
                long j10 = n11 + (o17 * 666643) + (o16 * 470296) + (n16 * 654183);
                long j11 = (j10 + 1048576) >> 21;
                long j12 = j11 << 21;
                long j13 = (((((n12 & 2097151) + (o18 * 666643)) + (n17 * 470296)) + (o17 * 654183)) - (o16 * 997805)) + (n16 * 136657);
                long j14 = (j13 + 1048576) >> 21;
                long j15 = j14 << 21;
                long j16 = (((((o13 & 2097151) + (o19 * 470296)) + (o18 * 654183)) - (n17 * 997805)) + (o17 * 136657)) - (o16 * 683901);
                long j17 = (j16 + 1048576) >> 21;
                long j18 = (((o14 & 2097151) - (o19 * 997805)) + (o18 * 136657)) - (n17 * 683901);
                long j19 = (j18 + 1048576) >> 21;
                long j20 = n15 - (o19 * 683901);
                long j21 = (j20 + 1048576) >> 21;
                long j22 = n10 + (o16 * 666643) + (n16 * 470296) + j8;
                long j23 = (j22 + 1048576) >> 21;
                long j24 = j23 << 21;
                long j25 = (((((o11 & 2097151) + (n17 * 666643)) + (o17 * 470296)) + (o16 * 654183)) - (n16 * 997805)) + j11;
                long j26 = (j25 + 1048576) >> 21;
                long j27 = j26 << 21;
                long j28 = (((((((o12 & 2097151) + (o19 * 666643)) + (o18 * 470296)) + (n17 * 654183)) - (o17 * 997805)) + (o16 * 136657)) - (n16 * 683901)) + j14;
                long j29 = (j28 + 1048576) >> 21;
                long j30 = j29 << 21;
                long j31 = (((((n13 & 2097151) + (o19 * 654183)) - (o18 * 997805)) + (n17 * 136657)) - (o17 * 683901)) + j17;
                long j32 = (j31 + 1048576) >> 21;
                long j33 = ((n14 + (o19 * 136657)) - (o18 * 683901)) + j19;
                long j34 = (j33 + 1048576) >> 21;
                long j35 = (j16 - (j17 << 21)) + j29;
                long j36 = n7 + (j35 * 666643);
                long j37 = (j36 + 1048576) >> 21;
                long j38 = j37 << 21;
                long j39 = (j18 - (j19 << 21)) + j32;
                long j40 = j31 - (j32 << 21);
                long j41 = (n8 & 2097151) + (j39 * 666643) + (j40 * 470296) + (j35 * 654183);
                long j42 = (j41 + 1048576) >> 21;
                long j43 = j42 << 21;
                long j44 = (j20 - (j21 << 21)) + j34;
                long j45 = j33 - (j34 << 21);
                long j46 = (((((o9 & 2097151) + (j44 * 666643)) + (j45 * 470296)) + (j39 * 654183)) - (j40 * 997805)) + (j35 * 136657);
                long j47 = (j46 + 1048576) >> 21;
                long j48 = j47 << 21;
                long j49 = (o15 & 2097151) + j21;
                long j50 = (((((j7 - j9) + (j49 * 470296)) + (j44 * 654183)) - (j45 * 997805)) + (j39 * 136657)) - (j40 * 683901);
                long j51 = (j50 + 1048576) >> 21;
                long j52 = j51 << 21;
                long j53 = ((((j10 - j12) + j23) - (j49 * 997805)) + (j44 * 136657)) - (j45 * 683901);
                long j54 = (j53 + 1048576) >> 21;
                long j55 = j54 << 21;
                long j56 = ((j13 - j15) + j26) - (j49 * 683901);
                long j57 = (j56 + 1048576) >> 21;
                long j58 = (o7 & 2097151) + (j40 * 666643) + (j35 * 470296) + j37;
                long j59 = (j58 + 1048576) >> 21;
                long j60 = (((((o8 & 2097151) + (j45 * 666643)) + (j39 * 470296)) + (j40 * 654183)) - (j35 * 997805)) + j42;
                long j61 = (j60 + 1048576) >> 21;
                long j62 = (((((((n9 & 2097151) + (j49 * 666643)) + (j44 * 470296)) + (j45 * 654183)) - (j39 * 997805)) + (j40 * 136657)) - (j35 * 683901)) + j47;
                long j63 = (j62 + 1048576) >> 21;
                long j64 = (((((j22 - j24) + (j49 * 654183)) - (j44 * 997805)) + (j45 * 136657)) - (j39 * 683901)) + j51;
                long j65 = (j64 + 1048576) >> 21;
                long j66 = (((j25 - j27) + (j49 * 136657)) - (j44 * 683901)) + j54;
                long j67 = (j66 + 1048576) >> 21;
                long j68 = (j28 - j30) + j57;
                long j69 = (j68 + 1048576) >> 21;
                long j70 = j69 << 21;
                long j71 = (j36 - j38) + (j69 * 666643);
                long j72 = j71 >> 21;
                long j73 = j72 << 21;
                long j74 = (j58 - (j59 << 21)) + (j69 * 470296) + j72;
                long j75 = j74 >> 21;
                long j76 = j75 << 21;
                long j77 = (j41 - j43) + j59 + (j69 * 654183) + j75;
                long j78 = j77 >> 21;
                long j79 = j78 << 21;
                long j80 = ((j60 - (j61 << 21)) - (j69 * 997805)) + j78;
                long j81 = j80 >> 21;
                long j82 = j81 << 21;
                long j83 = (j46 - j48) + j61 + (j69 * 136657) + j81;
                long j84 = j83 >> 21;
                long j85 = j84 << 21;
                long j86 = ((j62 - (j63 << 21)) - (j69 * 683901)) + j84;
                long j87 = j86 >> 21;
                long j88 = j87 << 21;
                long j89 = (j50 - j52) + j63 + j87;
                long j90 = j89 >> 21;
                long j91 = j90 << 21;
                long j92 = (j64 - (j65 << 21)) + j90;
                long j93 = j92 >> 21;
                long j94 = j93 << 21;
                long j95 = (j53 - j55) + j65 + j93;
                long j96 = j95 >> 21;
                long j97 = j96 << 21;
                long j98 = (j66 - (j67 << 21)) + j96;
                long j99 = j98 >> 21;
                long j100 = j99 << 21;
                long j101 = (j56 - (j57 << 21)) + j67 + j99;
                long j102 = j101 >> 21;
                long j103 = j102 << 21;
                long j104 = (j68 - j70) + j102;
                long j105 = j104 >> 21;
                long j106 = j105 << 21;
                long j107 = (j71 - j73) + (666643 * j105);
                long j108 = j107 >> 21;
                long j109 = j108 << 21;
                long j110 = (j74 - j76) + (470296 * j105) + j108;
                long j111 = j110 >> 21;
                long j112 = j111 << 21;
                long j113 = (j77 - j79) + (654183 * j105) + j111;
                long j114 = j113 >> 21;
                long j115 = j114 << 21;
                long j116 = ((j80 - j82) - (997805 * j105)) + j114;
                long j117 = j116 >> 21;
                long j118 = j117 << 21;
                long j119 = (j83 - j85) + (136657 * j105) + j117;
                long j120 = j119 >> 21;
                long j121 = ((j86 - j88) - (j105 * 683901)) + j120;
                long j122 = j121 >> 21;
                long j123 = j122 << 21;
                long j124 = (j89 - j91) + j122;
                long j125 = j124 >> 21;
                long j126 = j125 << 21;
                long j127 = (j92 - j94) + j125;
                long j128 = j127 >> 21;
                long j129 = j128 << 21;
                long j130 = (j95 - j97) + j128;
                long j131 = j130 >> 21;
                long j132 = j131 << 21;
                long j133 = (j98 - j100) + j131;
                long j134 = j133 >> 21;
                long j135 = j134 << 21;
                long j136 = (j101 - j103) + j134;
                long j137 = j136 >> 21;
                digest[0] = (byte) (j107 - j109);
                long j138 = j127 - j129;
                long j139 = j124 - j126;
                long j140 = j121 - j123;
                long j141 = j119 - (j120 << 21);
                long j142 = j116 - j118;
                long j143 = j113 - j115;
                long j144 = j110 - j112;
                digest[1] = (byte) (r8 >> 8);
                digest[2] = (byte) ((r8 >> 16) | (j144 << 5));
                digest[3] = (byte) (j144 >> 3);
                digest[4] = (byte) (j144 >> 11);
                digest[5] = (byte) ((j144 >> 19) | (j143 << 2));
                digest[6] = (byte) (j143 >> 6);
                digest[7] = (byte) ((j143 >> 14) | (j142 << 7));
                digest[8] = (byte) (j142 >> 1);
                digest[9] = (byte) (j142 >> 9);
                digest[10] = (byte) ((j142 >> 17) | (j141 << 4));
                digest[11] = (byte) (j141 >> 4);
                digest[12] = (byte) (j141 >> 12);
                digest[13] = (byte) ((j141 >> 20) | (j140 + j140));
                digest[14] = (byte) (j140 >> 7);
                digest[15] = (byte) ((j140 >> 15) | (j139 << 6));
                digest[16] = (byte) (j139 >> 2);
                digest[17] = (byte) (j139 >> 10);
                digest[18] = (byte) ((j139 >> 18) | (j138 << 3));
                long j145 = j136 - (j137 << 21);
                long j146 = (j104 - j106) + j137;
                long j147 = j133 - j135;
                digest[19] = (byte) (j138 >> 5);
                digest[20] = (byte) (j138 >> 13);
                digest[21] = (byte) (j130 - j132);
                digest[22] = (byte) (r6 >> 8);
                digest[23] = (byte) ((r6 >> 16) | (j147 << 5));
                digest[24] = (byte) (j147 >> 3);
                digest[25] = (byte) (j147 >> 11);
                digest[26] = (byte) ((j147 >> 19) | (j145 << 2));
                digest[27] = (byte) (j145 >> 6);
                digest[28] = (byte) ((j145 >> 14) | (j146 << 7));
                digest[29] = (byte) (j146 >> 1);
                digest[30] = (byte) (j146 >> 9);
                digest[31] = (byte) (j146 >> 17);
                long[] jArr = new long[10];
                long[] g8 = jg4.g(bArr5);
                long[] jArr2 = new long[10];
                jArr2[0] = 1;
                long[] jArr3 = new long[10];
                long[] jArr4 = new long[10];
                long[] jArr5 = new long[10];
                long[] jArr6 = new long[10];
                long[] jArr7 = new long[10];
                jg4.f(jArr4, g8);
                jg4.e(jArr5, jArr4, eg4.f7612a);
                jg4.b(jArr4, jArr4, jArr2);
                jg4.a(jArr5, jArr5, jArr2);
                long[] jArr8 = new long[10];
                jg4.f(jArr8, jArr5);
                jg4.e(jArr8, jArr8, jArr5);
                jg4.f(jArr, jArr8);
                jg4.e(jArr, jArr, jArr5);
                jg4.e(jArr, jArr, jArr4);
                long[] jArr9 = new long[10];
                long[] jArr10 = new long[10];
                long[] jArr11 = new long[10];
                jg4.f(jArr9, jArr);
                jg4.f(jArr10, jArr9);
                jg4.f(jArr10, jArr10);
                jg4.e(jArr10, jArr, jArr10);
                jg4.e(jArr9, jArr9, jArr10);
                jg4.f(jArr9, jArr9);
                jg4.e(jArr9, jArr10, jArr9);
                jg4.f(jArr10, jArr9);
                for (int i10 = 1; i10 < 5; i10++) {
                    jg4.f(jArr10, jArr10);
                }
                jg4.e(jArr9, jArr10, jArr9);
                jg4.f(jArr10, jArr9);
                for (int i11 = 1; i11 < 10; i11++) {
                    jg4.f(jArr10, jArr10);
                }
                jg4.e(jArr10, jArr10, jArr9);
                jg4.f(jArr11, jArr10);
                for (int i12 = 1; i12 < 20; i12++) {
                    jg4.f(jArr11, jArr11);
                }
                jg4.e(jArr10, jArr11, jArr10);
                jg4.f(jArr10, jArr10);
                for (int i13 = 1; i13 < 10; i13++) {
                    jg4.f(jArr10, jArr10);
                }
                jg4.e(jArr9, jArr10, jArr9);
                jg4.f(jArr10, jArr9);
                for (int i14 = 1; i14 < 50; i14++) {
                    jg4.f(jArr10, jArr10);
                }
                jg4.e(jArr10, jArr10, jArr9);
                jg4.f(jArr11, jArr10);
                for (int i15 = 1; i15 < 100; i15++) {
                    jg4.f(jArr11, jArr11);
                }
                jg4.e(jArr10, jArr11, jArr10);
                jg4.f(jArr10, jArr10);
                for (int i16 = 1; i16 < 50; i16++) {
                    jg4.f(jArr10, jArr10);
                }
                jg4.e(jArr9, jArr10, jArr9);
                jg4.f(jArr9, jArr9);
                jg4.f(jArr9, jArr9);
                jg4.e(jArr, jArr9, jArr);
                jg4.e(jArr, jArr, jArr8);
                jg4.e(jArr, jArr, jArr4);
                jg4.f(jArr6, jArr);
                jg4.e(jArr6, jArr6, jArr5);
                jg4.b(jArr7, jArr6, jArr4);
                if (e(jArr7)) {
                    jg4.a(jArr7, jArr6, jArr4);
                    if (e(jArr7)) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                    }
                    jg4.e(jArr, jArr, eg4.f7614c);
                }
                if (e(jArr)) {
                    b8 = 255;
                } else {
                    b8 = 255;
                    if (((bArr3[31] & 255) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                }
                if (f(jArr) == ((bArr3[31] & b8) >> 7)) {
                    m(jArr, jArr);
                }
                jg4.e(jArr3, jArr, g8);
                bg4 bg4Var = new bg4(new ag4(jArr, g8, jArr2), jArr3);
                yf4[] yf4VarArr = new yf4[8];
                yf4VarArr[0] = new yf4(bg4Var);
                zf4 zf4Var = new zf4(new ag4(), new long[10]);
                i(zf4Var, bg4Var.f5764a);
                bg4 bg4Var2 = new bg4(zf4Var);
                for (int i17 = 1; i17 < 8; i17++) {
                    g(zf4Var, bg4Var2, yf4VarArr[i17 - 1]);
                    yf4VarArr[i17] = new yf4(new bg4(zf4Var));
                }
                byte[] l7 = l(digest);
                byte[] l8 = l(copyOfRange);
                zf4 zf4Var2 = new zf4(f6426b);
                bg4 bg4Var3 = new bg4();
                int i18 = b8;
                while (i18 >= 0 && l7[i18] == 0 && l8[i18] == 0) {
                    i18--;
                }
                while (i18 >= 0) {
                    i(zf4Var2, new ag4(zf4Var2));
                    byte b9 = l7[i18];
                    if (b9 > 0) {
                        bg4.a(bg4Var3, zf4Var2);
                        g(zf4Var2, bg4Var3, yf4VarArr[l7[i18] / 2]);
                    } else if (b9 < 0) {
                        bg4.a(bg4Var3, zf4Var2);
                        h(zf4Var2, bg4Var3, yf4VarArr[(-l7[i18]) / 2]);
                    }
                    byte b10 = l8[i18];
                    if (b10 > 0) {
                        bg4.a(bg4Var3, zf4Var2);
                        g(zf4Var2, bg4Var3, eg4.f7616e[l8[i18] / 2]);
                    } else if (b10 < 0) {
                        bg4.a(bg4Var3, zf4Var2);
                        h(zf4Var2, bg4Var3, eg4.f7616e[(-l8[i18]) / 2]);
                    }
                    i18--;
                }
                byte[] b11 = new ag4(zf4Var2).b();
                for (int i19 = 0; i19 < 32; i19++) {
                    if (b11[i19] != bArr2[i19]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void d() {
        if (eg4.f7612a == null) {
            throw new IllegalStateException("Could not initialize Ed25519.");
        }
    }

    static /* synthetic */ boolean e(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        jg4.d(jArr2);
        byte[] h8 = jg4.h(jArr2);
        for (int i7 = 0; i7 < 32; i7++) {
            if (h8[i7] != 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ int f(long[] jArr) {
        return jg4.h(jArr)[0] & 1;
    }

    private static void g(zf4 zf4Var, bg4 bg4Var, xf4 xf4Var) {
        ag4 ag4Var = bg4Var.f5764a;
        ag4 ag4Var2 = zf4Var.f20162a;
        long[] jArr = new long[10];
        long[] jArr2 = ag4Var2.f4944a;
        long[] jArr3 = ag4Var.f4945b;
        long[] jArr4 = ag4Var.f4944a;
        jg4.a(jArr2, jArr3, jArr4);
        long[] jArr5 = ag4Var2.f4945b;
        jg4.b(jArr5, jArr3, jArr4);
        jg4.e(jArr5, jArr5, xf4Var.f18803b);
        long[] jArr6 = xf4Var.f18802a;
        long[] jArr7 = ag4Var2.f4946c;
        jg4.e(jArr7, jArr2, jArr6);
        long[] jArr8 = zf4Var.f20163b;
        jg4.e(jArr8, bg4Var.f5765b, xf4Var.f18804c);
        xf4Var.a(jArr2, ag4Var.f4946c);
        jg4.a(jArr, jArr2, jArr2);
        jg4.b(jArr2, jArr7, jArr5);
        jg4.a(jArr5, jArr7, jArr5);
        jg4.a(jArr7, jArr, jArr8);
        jg4.b(jArr8, jArr, jArr8);
    }

    private static void h(zf4 zf4Var, bg4 bg4Var, xf4 xf4Var) {
        ag4 ag4Var = bg4Var.f5764a;
        ag4 ag4Var2 = zf4Var.f20162a;
        long[] jArr = new long[10];
        long[] jArr2 = ag4Var2.f4944a;
        long[] jArr3 = ag4Var.f4945b;
        long[] jArr4 = ag4Var.f4944a;
        jg4.a(jArr2, jArr3, jArr4);
        long[] jArr5 = ag4Var2.f4945b;
        jg4.b(jArr5, jArr3, jArr4);
        jg4.e(jArr5, jArr5, xf4Var.f18802a);
        long[] jArr6 = xf4Var.f18803b;
        long[] jArr7 = ag4Var2.f4946c;
        jg4.e(jArr7, jArr2, jArr6);
        long[] jArr8 = zf4Var.f20163b;
        jg4.e(jArr8, bg4Var.f5765b, xf4Var.f18804c);
        xf4Var.a(jArr2, ag4Var.f4946c);
        jg4.a(jArr, jArr2, jArr2);
        jg4.b(jArr2, jArr7, jArr5);
        jg4.a(jArr5, jArr7, jArr5);
        jg4.b(jArr7, jArr, jArr8);
        jg4.a(jArr8, jArr, jArr8);
    }

    private static void i(zf4 zf4Var, ag4 ag4Var) {
        ag4 ag4Var2 = zf4Var.f20162a;
        long[] jArr = ag4Var2.f4944a;
        long[] jArr2 = ag4Var.f4944a;
        long[] jArr3 = new long[10];
        jg4.f(jArr, jArr2);
        long[] jArr4 = ag4Var2.f4946c;
        long[] jArr5 = ag4Var.f4945b;
        jg4.f(jArr4, jArr5);
        long[] jArr6 = zf4Var.f20163b;
        jg4.f(jArr6, ag4Var.f4946c);
        jg4.a(jArr6, jArr6, jArr6);
        long[] jArr7 = ag4Var2.f4945b;
        jg4.a(jArr7, jArr2, jArr5);
        jg4.f(jArr3, jArr7);
        jg4.a(jArr7, jArr4, jArr);
        jg4.b(jArr4, jArr4, jArr);
        jg4.b(jArr, jArr3, jArr7);
        jg4.b(jArr6, jArr6, jArr4);
    }

    private static int j(int i7, int i8) {
        int i9 = (~(i7 ^ i8)) & 255;
        int i10 = i9 & (i9 << 4);
        int i11 = i10 & (i10 << 2);
        return (i11 & (i11 + i11)) >> 7;
    }

    private static void k(xf4 xf4Var, int i7, byte b8) {
        xf4[][] xf4VarArr = eg4.f7615d;
        int i8 = (b8 & 255) >> 7;
        int i9 = (-i8) & b8;
        int i10 = b8 - (i9 + i9);
        xf4Var.b(xf4VarArr[i7][0], j(i10, 1));
        xf4Var.b(xf4VarArr[i7][1], j(i10, 2));
        xf4Var.b(xf4VarArr[i7][2], j(i10, 3));
        xf4Var.b(xf4VarArr[i7][3], j(i10, 4));
        xf4Var.b(xf4VarArr[i7][4], j(i10, 5));
        xf4Var.b(xf4VarArr[i7][5], j(i10, 6));
        xf4Var.b(xf4VarArr[i7][6], j(i10, 7));
        xf4Var.b(xf4VarArr[i7][7], j(i10, 8));
        long[] jArr = xf4Var.f18804c;
        long[] jArr2 = xf4Var.f18802a;
        long[] copyOf = Arrays.copyOf(xf4Var.f18803b, 10);
        long[] copyOf2 = Arrays.copyOf(jArr2, 10);
        long[] copyOf3 = Arrays.copyOf(jArr, 10);
        m(copyOf3, copyOf3);
        xf4Var.b(new xf4(copyOf, copyOf2, copyOf3), i8);
    }

    private static byte[] l(byte[] bArr) {
        int i7;
        byte[] bArr2 = new byte[256];
        for (int i8 = 0; i8 < 256; i8++) {
            bArr2[i8] = (byte) (1 & ((bArr[i8 >> 3] & 255) >> (i8 & 7)));
        }
        for (int i9 = 0; i9 < 256; i9++) {
            if (bArr2[i9] != 0) {
                for (int i10 = 1; i10 <= 6 && (i7 = i9 + i10) < 256; i10++) {
                    byte b8 = bArr2[i7];
                    if (b8 != 0) {
                        byte b9 = bArr2[i9];
                        int i11 = b8 << i10;
                        int i12 = b9 + i11;
                        if (i12 <= 15) {
                            bArr2[i9] = (byte) i12;
                            bArr2[i7] = 0;
                        } else {
                            int i13 = b9 - i11;
                            if (i13 >= -15) {
                                bArr2[i9] = (byte) i13;
                                while (true) {
                                    if (i7 >= 256) {
                                        break;
                                    }
                                    if (bArr2[i7] == 0) {
                                        bArr2[i7] = 1;
                                        break;
                                    }
                                    bArr2[i7] = 0;
                                    i7++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    private static void m(long[] jArr, long[] jArr2) {
        for (int i7 = 0; i7 < jArr2.length; i7++) {
            jArr[i7] = -jArr2[i7];
        }
    }

    private static long n(byte[] bArr, int i7) {
        return ((bArr[i7 + 2] & 255) << 16) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8);
    }

    private static long o(byte[] bArr, int i7) {
        return ((bArr[i7 + 3] & 255) << 24) | n(bArr, i7);
    }
}
