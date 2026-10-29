package com.google.android.gms.internal.drive;

abstract class t2 {

    /* renamed from: a, reason: collision with root package name */
    private static final u2 f20750a;

    static {
        f20750a = (r2.r() && r2.s() && !g.a()) ? new x2() : new v2();
    }

    static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        int i8 = 0;
        while (i8 < length && charSequence.charAt(i8) < 128) {
            i8++;
        }
        int i9 = length;
        while (true) {
            if (i8 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i8);
            if (charAt < 2048) {
                i9 += (127 - charAt) >>> 31;
                i8++;
            } else {
                int length2 = charSequence.length();
                while (i8 < length2) {
                    char charAt2 = charSequence.charAt(i8);
                    if (charAt2 < 2048) {
                        i7 += (127 - charAt2) >>> 31;
                    } else {
                        i7 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i8) < 65536) {
                                throw new w2(i8, length2);
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
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(i9 + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    static int b(CharSequence charSequence, byte[] bArr, int i7, int i8) {
        return f20750a.b(charSequence, bArr, i7, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(int i7) {
        if (i7 > -12) {
            return -1;
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(int i7, int i8, int i9) {
        if (i7 > -12 || i8 > -65 || i9 > -65) {
            return -1;
        }
        return (i7 ^ (i8 << 8)) ^ (i9 << 16);
    }

    public static boolean g(byte[] bArr) {
        return f20750a.c(bArr, 0, bArr.length);
    }

    public static boolean h(byte[] bArr, int i7, int i8) {
        return f20750a.c(bArr, i7, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(byte[] bArr, int i7, int i8) {
        byte b8 = bArr[i7 - 1];
        int i9 = i8 - i7;
        if (i9 == 0) {
            return c(b8);
        }
        if (i9 == 1) {
            return k(b8, bArr[i7]);
        }
        if (i9 == 2) {
            return e(b8, bArr[i7], bArr[i7 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i7, int i8) {
        if (i7 > -12 || i8 > -65) {
            return -1;
        }
        return i7 ^ (i8 << 8);
    }
}
