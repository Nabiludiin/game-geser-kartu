package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: MyApplication */
abstract class h25 {
    h25() {
    }

    static final String c(ByteBuffer byteBuffer, int i7, int i8) {
        int i9;
        if ((((byteBuffer.limit() - i7) - i8) | i7 | i8) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i7), Integer.valueOf(i8)));
        }
        int i10 = i7 + i8;
        char[] cArr = new char[i8];
        int i11 = 0;
        while (i7 < i10) {
            byte b8 = byteBuffer.get(i7);
            if (!g25.a(b8)) {
                break;
            }
            i7++;
            cArr[i11] = (char) b8;
            i11++;
        }
        int i12 = i11;
        while (i7 < i10) {
            int i13 = i7 + 1;
            byte b9 = byteBuffer.get(i7);
            if (g25.a(b9)) {
                cArr[i12] = (char) b9;
                i12++;
                i7 = i13;
                while (i7 < i10) {
                    byte b10 = byteBuffer.get(i7);
                    if (g25.a(b10)) {
                        i7++;
                        cArr[i12] = (char) b10;
                        i12++;
                    }
                }
            } else {
                if (g25.b(b9)) {
                    if (i13 >= i10) {
                        throw new e05("Protocol message had invalid UTF-8.");
                    }
                    i9 = i12 + 1;
                    i7 += 2;
                    g25.d(b9, byteBuffer.get(i13), cArr, i12);
                } else if (g25.c(b9)) {
                    if (i13 >= i10 - 1) {
                        throw new e05("Protocol message had invalid UTF-8.");
                    }
                    i9 = i12 + 1;
                    int i14 = i7 + 2;
                    i7 += 3;
                    g25.e(b9, byteBuffer.get(i13), byteBuffer.get(i14), cArr, i12);
                } else {
                    if (i13 >= i10 - 2) {
                        throw new e05("Protocol message had invalid UTF-8.");
                    }
                    byte b11 = byteBuffer.get(i13);
                    int i15 = i7 + 3;
                    byte b12 = byteBuffer.get(i7 + 2);
                    i7 += 4;
                    g25.f(b9, b11, b12, byteBuffer.get(i15), cArr, i12);
                    i12 += 2;
                }
                i12 = i9;
            }
        }
        return new String(cArr, 0, i12);
    }

    abstract int a(int i7, byte[] bArr, int i8, int i9);

    abstract String b(byte[] bArr, int i7, int i8);
}
