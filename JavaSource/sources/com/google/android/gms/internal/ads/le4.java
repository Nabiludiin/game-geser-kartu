package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/* compiled from: MyApplication */
abstract class le4 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f11593a = d(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    static void a(int[] iArr, int[] iArr2) {
        int[] iArr3 = f11593a;
        int length = iArr3.length;
        System.arraycopy(iArr3, 0, iArr, 0, length);
        System.arraycopy(iArr2, 0, iArr, length, 8);
    }

    static void b(int[] iArr) {
        for (int i7 = 0; i7 < 10; i7++) {
            c(iArr, 0, 4, 8, 12);
            c(iArr, 1, 5, 9, 13);
            c(iArr, 2, 6, 10, 14);
            c(iArr, 3, 7, 11, 15);
            c(iArr, 0, 5, 10, 15);
            c(iArr, 1, 6, 11, 12);
            c(iArr, 2, 7, 8, 13);
            c(iArr, 3, 4, 9, 14);
        }
    }

    static void c(int[] iArr, int i7, int i8, int i9, int i10) {
        int i11 = iArr[i7] + iArr[i8];
        iArr[i7] = i11;
        int i12 = i11 ^ iArr[i10];
        int i13 = (i12 >>> (-16)) | (i12 << 16);
        iArr[i10] = i13;
        int i14 = iArr[i9] + i13;
        iArr[i9] = i14;
        int i15 = iArr[i8] ^ i14;
        int i16 = (i15 >>> (-12)) | (i15 << 12);
        iArr[i8] = i16;
        int i17 = iArr[i7] + i16;
        iArr[i7] = i17;
        int i18 = iArr[i10] ^ i17;
        int i19 = (i18 >>> (-8)) | (i18 << 8);
        iArr[i10] = i19;
        int i20 = iArr[i9] + i19;
        iArr[i9] = i20;
        int i21 = iArr[i8] ^ i20;
        iArr[i8] = (i21 >>> (-7)) | (i21 << 7);
    }

    static int[] d(byte[] bArr) {
        if ((bArr.length & 3) != 0) {
            throw new IllegalArgumentException("invalid input length");
        }
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    static int[] e(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        a(iArr3, iArr);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        b(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }
}
