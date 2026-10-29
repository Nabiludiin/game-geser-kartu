package com.google.android.gms.internal.drive;

final class x2 extends u2 {
    x2() {
    }

    private static int d(byte[] bArr, int i7, long j7, int i8) {
        int c8;
        int k7;
        int e8;
        if (i8 == 0) {
            c8 = t2.c(i7);
            return c8;
        }
        if (i8 == 1) {
            k7 = t2.k(i7, r2.a(bArr, j7));
            return k7;
        }
        if (i8 != 2) {
            throw new AssertionError();
        }
        e8 = t2.e(i7, r2.a(bArr, j7), r2.a(bArr, j7 + 1));
        return e8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a5, code lost:
    
        return -1;
     */
    @Override // com.google.android.gms.internal.drive.u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int a(int r20, byte[] r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.x2.a(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.drive.u2
    final int b(CharSequence charSequence, byte[] bArr, int i7, int i8) {
        long j7;
        long j8;
        long j9;
        int i9;
        char charAt;
        long j10 = i7;
        long j11 = i8 + j10;
        int length = charSequence.length();
        if (length > i8 || bArr.length - i8 < i7) {
            char charAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(i7 + i8);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i10 = 0;
        while (true) {
            j7 = 1;
            if (i10 >= length || (charAt = charSequence.charAt(i10)) >= 128) {
                break;
            }
            r2.i(bArr, j10, (byte) charAt);
            i10++;
            j10 = 1 + j10;
        }
        if (i10 == length) {
            return (int) j10;
        }
        while (i10 < length) {
            char charAt3 = charSequence.charAt(i10);
            if (charAt3 < 128 && j10 < j11) {
                r2.i(bArr, j10, (byte) charAt3);
                j9 = j11;
                j8 = j7;
                j10 += j7;
            } else if (charAt3 >= 2048 || j10 > j11 - 2) {
                j8 = j7;
                if ((charAt3 >= 55296 && 57343 >= charAt3) || j10 > j11 - 3) {
                    j9 = j11;
                    if (j10 > j9 - 4) {
                        if (55296 <= charAt3 && charAt3 <= 57343 && ((i9 = i10 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i9)))) {
                            throw new w2(i10, length);
                        }
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Failed writing ");
                        sb2.append(charAt3);
                        sb2.append(" at index ");
                        sb2.append(j10);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    int i11 = i10 + 1;
                    if (i11 != length) {
                        char charAt4 = charSequence.charAt(i11);
                        if (Character.isSurrogatePair(charAt3, charAt4)) {
                            int codePoint = Character.toCodePoint(charAt3, charAt4);
                            r2.i(bArr, j10, (byte) ((codePoint >>> 18) | 240));
                            r2.i(bArr, j10 + j8, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j12 = j10 + 3;
                            r2.i(bArr, j10 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                            j10 += 4;
                            r2.i(bArr, j12, (byte) ((codePoint & 63) | 128));
                            i10 = i11;
                        } else {
                            i10 = i11;
                        }
                    }
                    throw new w2(i10 - 1, length);
                }
                r2.i(bArr, j10, (byte) ((charAt3 >>> '\f') | 480));
                j9 = j11;
                long j13 = j10 + 2;
                r2.i(bArr, j10 + j8, (byte) (((charAt3 >>> 6) & 63) | 128));
                j10 += 3;
                r2.i(bArr, j13, (byte) ((charAt3 & '?') | 128));
            } else {
                j8 = j7;
                long j14 = j10 + j8;
                r2.i(bArr, j10, (byte) ((charAt3 >>> 6) | 960));
                j10 += 2;
                r2.i(bArr, j14, (byte) ((charAt3 & '?') | 128));
                j9 = j11;
            }
            i10++;
            j7 = j8;
            j11 = j9;
        }
        return (int) j10;
    }
}
