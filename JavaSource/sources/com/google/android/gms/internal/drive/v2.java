package com.google.android.gms.internal.drive;

final class v2 extends u2 {
    v2() {
    }

    @Override // com.google.android.gms.internal.drive.u2
    final int a(int i7, byte[] bArr, int i8, int i9) {
        int i10;
        int i11;
        while (i8 < i9 && bArr[i8] >= 0) {
            i8++;
        }
        if (i8 >= i9) {
            return 0;
        }
        while (i8 < i9) {
            int i12 = i8 + 1;
            byte b8 = bArr[i8];
            if (b8 < 0) {
                if (b8 < -32) {
                    if (i12 >= i9) {
                        return b8;
                    }
                    if (b8 >= -62) {
                        i8 += 2;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                }
                if (b8 >= -16) {
                    if (i12 >= i9 - 2) {
                        i11 = t2.i(bArr, i12, i9);
                        return i11;
                    }
                    int i13 = i8 + 2;
                    byte b9 = bArr[i12];
                    if (b9 <= -65 && (((b8 << 28) + (b9 + 112)) >> 30) == 0) {
                        int i14 = i8 + 3;
                        if (bArr[i13] <= -65) {
                            i8 += 4;
                            if (bArr[i14] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i12 >= i9 - 1) {
                    i10 = t2.i(bArr, i12, i9);
                    return i10;
                }
                int i15 = i8 + 2;
                byte b10 = bArr[i12];
                if (b10 <= -65 && ((b8 != -32 || b10 >= -96) && (b8 != -19 || b10 < -96))) {
                    i8 += 3;
                    if (bArr[i15] > -65) {
                    }
                }
                return -1;
            }
            i8 = i12;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r10 + r0;
     */
    @Override // com.google.android.gms.internal.drive.u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int b(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.v2.b(java.lang.CharSequence, byte[], int, int):int");
    }
}
