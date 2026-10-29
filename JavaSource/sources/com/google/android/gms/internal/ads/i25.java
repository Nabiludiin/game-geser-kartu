package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class i25 extends h25 {
    i25() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0080, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.h25
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int a(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i25.a(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.h25
    final String b(byte[] bArr, int i7, int i8) {
        int i9;
        int length = bArr.length;
        if ((((length - i7) - i8) | i7 | i8) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i7), Integer.valueOf(i8)));
        }
        int i10 = i7 + i8;
        char[] cArr = new char[i8];
        int i11 = 0;
        while (i7 < i10) {
            byte b8 = bArr[i7];
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
            byte b9 = bArr[i7];
            if (g25.a(b9)) {
                cArr[i12] = (char) b9;
                i12++;
                i7 = i13;
                while (i7 < i10) {
                    byte b10 = bArr[i7];
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
                    g25.d(b9, bArr[i13], cArr, i12);
                } else if (g25.c(b9)) {
                    if (i13 >= i10 - 1) {
                        throw new e05("Protocol message had invalid UTF-8.");
                    }
                    i9 = i12 + 1;
                    int i14 = i7 + 2;
                    i7 += 3;
                    g25.e(b9, bArr[i13], bArr[i14], cArr, i12);
                } else {
                    if (i13 >= i10 - 2) {
                        throw new e05("Protocol message had invalid UTF-8.");
                    }
                    byte b11 = bArr[i13];
                    int i15 = i7 + 3;
                    byte b12 = bArr[i7 + 2];
                    i7 += 4;
                    g25.f(b9, b11, b12, bArr[i15], cArr, i12);
                    i12 += 2;
                }
                i12 = i9;
            }
        }
        return new String(cArr, 0, i12);
    }
}
