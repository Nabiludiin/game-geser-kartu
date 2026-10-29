package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: MyApplication */
abstract class k25 {

    /* renamed from: a, reason: collision with root package name */
    private static final h25 f10871a;

    static {
        if (f25.i() && f25.j()) {
            int i7 = dy4.f7358a;
        }
        f10871a = new i25();
    }

    static boolean a(byte[] bArr, int i7, int i8) {
        return f10871a.a(0, bArr, i7, i8) == 0;
    }

    static int b(String str) {
        int length = str.length();
        int i7 = 0;
        int i8 = 0;
        while (i8 < length && str.charAt(i8) < 128) {
            i8++;
        }
        int i9 = length;
        while (true) {
            if (i8 >= length) {
                break;
            }
            char charAt = str.charAt(i8);
            if (charAt < 2048) {
                i9 += (127 - charAt) >>> 31;
                i8++;
            } else {
                int length2 = str.length();
                while (i8 < length2) {
                    char charAt2 = str.charAt(i8);
                    if (charAt2 < 2048) {
                        i7 += (127 - charAt2) >>> 31;
                    } else {
                        i7 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i8) < 65536) {
                                throw new j25(i8, length2);
                            }
                            i8++;
                        }
                    }
                    i8++;
                }
                i9 += i7;
            }
        }
        if (i9 >= length) {
            return i9;
        }
        long j7 = i9 + 4294967296L;
        StringBuilder sb = new StringBuilder(String.valueOf(j7).length() + 34);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j7);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int c(java.lang.String r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k25.c(java.lang.String, byte[], int, int):int");
    }

    static String d(ByteBuffer byteBuffer, int i7, int i8) {
        h25 h25Var = f10871a;
        if (byteBuffer.hasArray()) {
            return h25Var.b(byteBuffer.array(), byteBuffer.arrayOffset() + i7, i8);
        }
        return byteBuffer.isDirect() ? h25.c(byteBuffer, i7, i8) : h25.c(byteBuffer, i7, i8);
    }

    static String e(byte[] bArr, int i7, int i8) {
        return f10871a.b(bArr, i7, i8);
    }

    static /* synthetic */ int h(byte[] bArr, int i7, int i8) {
        int i9 = i8 - i7;
        byte b8 = bArr[i7 - 1];
        if (i9 == 0) {
            if (b8 > -12) {
                return -1;
            }
            return b8;
        }
        if (i9 == 1) {
            return i(b8, bArr[i7]);
        }
        if (i9 == 2) {
            return j(b8, bArr[i7], bArr[i7 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i7, int i8) {
        if (i7 > -12 || i8 > -65) {
            return -1;
        }
        return i7 ^ (i8 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(int i7, int i8, int i9) {
        if (i7 > -12 || i8 > -65 || i9 > -65) {
            return -1;
        }
        return (i7 ^ (i8 << 8)) ^ (i9 << 16);
    }
}
