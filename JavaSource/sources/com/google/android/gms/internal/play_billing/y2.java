package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
abstract class y2 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f21788a = 100;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f21789b = 0;

    static int a(byte[] bArr, int i7, x2 x2Var) {
        int i8 = i(bArr, i7, x2Var);
        int i9 = x2Var.f21777a;
        if (i9 < 0) {
            throw new l4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i9 > bArr.length - i8) {
            throw new l4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i9 == 0) {
            x2Var.f21779c = i3.f21564r;
            return i8;
        }
        x2Var.f21779c = i3.m(bArr, i8, i9);
        return i8 + i9;
    }

    static int b(byte[] bArr, int i7) {
        int i8 = bArr[i7] & 255;
        int i9 = bArr[i7 + 1] & 255;
        int i10 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    static int c(j5 j5Var, byte[] bArr, int i7, int i8, int i9, x2 x2Var) {
        Object c8 = j5Var.c();
        int m7 = m(c8, j5Var, bArr, i7, i8, i9, x2Var);
        j5Var.f(c8);
        x2Var.f21779c = c8;
        return m7;
    }

    static int d(j5 j5Var, byte[] bArr, int i7, int i8, x2 x2Var) {
        Object c8 = j5Var.c();
        int n7 = n(c8, j5Var, bArr, i7, i8, x2Var);
        j5Var.f(c8);
        x2Var.f21779c = c8;
        return n7;
    }

    static int e(j5 j5Var, int i7, byte[] bArr, int i8, int i9, i4 i4Var, x2 x2Var) {
        int d8 = d(j5Var, bArr, i8, i9, x2Var);
        i4Var.add(x2Var.f21779c);
        while (d8 < i9) {
            int i10 = i(bArr, d8, x2Var);
            if (i7 != x2Var.f21777a) {
                break;
            }
            d8 = d(j5Var, bArr, i10, i9, x2Var);
            i4Var.add(x2Var.f21779c);
        }
        return d8;
    }

    static int f(byte[] bArr, int i7, i4 i4Var, x2 x2Var) {
        e4 e4Var = (e4) i4Var;
        int i8 = i(bArr, i7, x2Var);
        int i9 = x2Var.f21777a + i8;
        while (i8 < i9) {
            i8 = i(bArr, i8, x2Var);
            e4Var.h(x2Var.f21777a);
        }
        if (i8 == i9) {
            return i8;
        }
        throw new l4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int g(byte[] bArr, int i7, x2 x2Var) {
        int i8;
        int i9 = i(bArr, i7, x2Var);
        int i10 = x2Var.f21777a;
        if (i10 < 0) {
            throw new l4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 == 0) {
            x2Var.f21779c = "";
            return i9;
        }
        int i11 = z5.f21822a;
        int length = bArr.length;
        if ((((length - i9) - i10) | i9 | i10) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i9), Integer.valueOf(i10)));
        }
        int i12 = i9 + i10;
        char[] cArr = new char[i10];
        int i13 = 0;
        while (i9 < i12) {
            byte b8 = bArr[i9];
            if (!x5.d(b8)) {
                break;
            }
            i9++;
            cArr[i13] = (char) b8;
            i13++;
        }
        int i14 = i13;
        while (i9 < i12) {
            int i15 = i9 + 1;
            byte b9 = bArr[i9];
            if (x5.d(b9)) {
                cArr[i14] = (char) b9;
                i14++;
                i9 = i15;
                while (i9 < i12) {
                    byte b10 = bArr[i9];
                    if (x5.d(b10)) {
                        i9++;
                        cArr[i14] = (char) b10;
                        i14++;
                    }
                }
            } else {
                if (b9 < -32) {
                    if (i15 >= i12) {
                        throw new l4("Protocol message had invalid UTF-8.");
                    }
                    i8 = i14 + 1;
                    i9 += 2;
                    x5.c(b9, bArr[i15], cArr, i14);
                } else if (b9 < -16) {
                    if (i15 >= i12 - 1) {
                        throw new l4("Protocol message had invalid UTF-8.");
                    }
                    i8 = i14 + 1;
                    int i16 = i9 + 2;
                    i9 += 3;
                    x5.b(b9, bArr[i15], bArr[i16], cArr, i14);
                } else {
                    if (i15 >= i12 - 2) {
                        throw new l4("Protocol message had invalid UTF-8.");
                    }
                    byte b11 = bArr[i15];
                    int i17 = i9 + 3;
                    byte b12 = bArr[i9 + 2];
                    i9 += 4;
                    x5.a(b9, b11, b12, bArr[i17], cArr, i14);
                    i14 += 2;
                }
                i14 = i8;
            }
        }
        x2Var.f21779c = new String(cArr, 0, i14);
        return i12;
    }

    static int h(int i7, byte[] bArr, int i8, int i9, q5 q5Var, x2 x2Var) {
        if ((i7 >>> 3) == 0) {
            throw new l4("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int l7 = l(bArr, i8, x2Var);
            q5Var.j(i7, Long.valueOf(x2Var.f21778b));
            return l7;
        }
        if (i10 == 1) {
            q5Var.j(i7, Long.valueOf(o(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int i11 = i(bArr, i8, x2Var);
            int i12 = x2Var.f21777a;
            if (i12 < 0) {
                throw new l4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i12 > bArr.length - i11) {
                throw new l4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i12 == 0) {
                q5Var.j(i7, i3.f21564r);
            } else {
                q5Var.j(i7, i3.m(bArr, i11, i12));
            }
            return i11 + i12;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw new l4("Protocol message contained an invalid tag (zero).");
            }
            q5Var.j(i7, Integer.valueOf(b(bArr, i8)));
            return i8 + 4;
        }
        int i13 = (i7 & (-8)) | 4;
        q5 f8 = q5.f();
        int i14 = x2Var.f21781e + 1;
        x2Var.f21781e = i14;
        p(i14);
        int i15 = 0;
        while (true) {
            if (i8 >= i9) {
                break;
            }
            int i16 = i(bArr, i8, x2Var);
            int i17 = x2Var.f21777a;
            if (i17 == i13) {
                i15 = i17;
                i8 = i16;
                break;
            }
            i8 = h(i17, bArr, i16, i9, f8, x2Var);
            i15 = i17;
        }
        x2Var.f21781e--;
        if (i8 > i9 || i15 != i13) {
            throw new l4("Failed to parse the message.");
        }
        q5Var.j(i7, f8);
        return i8;
    }

    static int i(byte[] bArr, int i7, x2 x2Var) {
        int i8 = i7 + 1;
        byte b8 = bArr[i7];
        if (b8 < 0) {
            return j(b8, bArr, i8, x2Var);
        }
        x2Var.f21777a = b8;
        return i8;
    }

    static int j(int i7, byte[] bArr, int i8, x2 x2Var) {
        byte b8 = bArr[i8];
        int i9 = i8 + 1;
        int i10 = i7 & 127;
        if (b8 >= 0) {
            x2Var.f21777a = i10 | (b8 << 7);
            return i9;
        }
        int i11 = i10 | ((b8 & Byte.MAX_VALUE) << 7);
        int i12 = i8 + 2;
        byte b9 = bArr[i9];
        if (b9 >= 0) {
            x2Var.f21777a = i11 | (b9 << 14);
            return i12;
        }
        int i13 = i11 | ((b9 & Byte.MAX_VALUE) << 14);
        int i14 = i8 + 3;
        byte b10 = bArr[i12];
        if (b10 >= 0) {
            x2Var.f21777a = i13 | (b10 << 21);
            return i14;
        }
        int i15 = i13 | ((b10 & Byte.MAX_VALUE) << 21);
        int i16 = i8 + 4;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            x2Var.f21777a = i15 | (b11 << 28);
            return i16;
        }
        int i17 = i15 | ((b11 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                x2Var.f21777a = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    static int k(int i7, byte[] bArr, int i8, int i9, i4 i4Var, x2 x2Var) {
        e4 e4Var = (e4) i4Var;
        int i10 = i(bArr, i8, x2Var);
        e4Var.h(x2Var.f21777a);
        while (i10 < i9) {
            int i11 = i(bArr, i10, x2Var);
            if (i7 != x2Var.f21777a) {
                break;
            }
            i10 = i(bArr, i11, x2Var);
            e4Var.h(x2Var.f21777a);
        }
        return i10;
    }

    static int l(byte[] bArr, int i7, x2 x2Var) {
        long j7 = bArr[i7];
        int i8 = i7 + 1;
        if (j7 >= 0) {
            x2Var.f21778b = j7;
            return i8;
        }
        int i9 = i7 + 2;
        byte b8 = bArr[i8];
        long j8 = (j7 & 127) | ((b8 & Byte.MAX_VALUE) << 7);
        int i10 = 7;
        while (b8 < 0) {
            int i11 = i9 + 1;
            i10 += 7;
            j8 |= (r10 & Byte.MAX_VALUE) << i10;
            b8 = bArr[i9];
            i9 = i11;
        }
        x2Var.f21778b = j8;
        return i9;
    }

    static int m(Object obj, j5 j5Var, byte[] bArr, int i7, int i8, int i9, x2 x2Var) {
        int i10 = x2Var.f21781e + 1;
        x2Var.f21781e = i10;
        p(i10);
        int y7 = ((c5) j5Var).y(obj, bArr, i7, i8, i9, x2Var);
        x2Var.f21781e--;
        x2Var.f21779c = obj;
        return y7;
    }

    static int n(Object obj, j5 j5Var, byte[] bArr, int i7, int i8, x2 x2Var) {
        int i9 = i7 + 1;
        int i10 = bArr[i7];
        if (i10 < 0) {
            i9 = j(i10, bArr, i9, x2Var);
            i10 = x2Var.f21777a;
        }
        int i11 = i9;
        if (i10 < 0 || i10 > i8 - i11) {
            throw new l4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i12 = x2Var.f21781e + 1;
        x2Var.f21781e = i12;
        p(i12);
        int i13 = i11 + i10;
        j5Var.i(obj, bArr, i11, i13, x2Var);
        x2Var.f21781e--;
        x2Var.f21779c = obj;
        return i13;
    }

    static long o(byte[] bArr, int i7) {
        return (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48) | ((bArr[i7 + 7] & 255) << 56);
    }

    private static void p(int i7) {
        if (i7 >= f21788a) {
            throw new l4("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
