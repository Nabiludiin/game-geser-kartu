package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
abstract class fy4 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f8544a = 100;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8545b = 0;

    static int a(byte[] bArr, int i7, ey4 ey4Var) {
        int i8 = i7 + 1;
        byte b8 = bArr[i7];
        if (b8 < 0) {
            return b(b8, bArr, i8, ey4Var);
        }
        ey4Var.f7879a = b8;
        return i8;
    }

    static int b(int i7, byte[] bArr, int i8, ey4 ey4Var) {
        byte b8 = bArr[i8];
        int i9 = i8 + 1;
        int i10 = i7 & 127;
        if (b8 >= 0) {
            ey4Var.f7879a = i10 | (b8 << 7);
            return i9;
        }
        int i11 = i10 | ((b8 & Byte.MAX_VALUE) << 7);
        int i12 = i8 + 2;
        byte b9 = bArr[i9];
        if (b9 >= 0) {
            ey4Var.f7879a = i11 | (b9 << 14);
            return i12;
        }
        int i13 = i11 | ((b9 & Byte.MAX_VALUE) << 14);
        int i14 = i8 + 3;
        byte b10 = bArr[i12];
        if (b10 >= 0) {
            ey4Var.f7879a = i13 | (b10 << 21);
            return i14;
        }
        int i15 = i13 | ((b10 & Byte.MAX_VALUE) << 21);
        int i16 = i8 + 4;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            ey4Var.f7879a = i15 | (b11 << 28);
            return i16;
        }
        int i17 = i15 | ((b11 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                ey4Var.f7879a = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    static int c(byte[] bArr, int i7, ey4 ey4Var) {
        long j7 = bArr[i7];
        int i8 = i7 + 1;
        if (j7 >= 0) {
            ey4Var.f7880b = j7;
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
        ey4Var.f7880b = j8;
        return i9;
    }

    static int d(byte[] bArr, int i7) {
        int i8 = bArr[i7] & 255;
        int i9 = bArr[i7 + 1] & 255;
        int i10 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    static long e(byte[] bArr, int i7) {
        return (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48) | ((bArr[i7 + 7] & 255) << 56);
    }

    static int f(byte[] bArr, int i7, ey4 ey4Var) {
        int a8 = a(bArr, i7, ey4Var);
        int i8 = ey4Var.f7879a;
        if (i8 < 0) {
            throw new e05("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i8 == 0) {
            ey4Var.f7881c = "";
            return a8;
        }
        ey4Var.f7881c = k25.e(bArr, a8, i8);
        return a8 + i8;
    }

    static int g(byte[] bArr, int i7, ey4 ey4Var) {
        int a8 = a(bArr, i7, ey4Var);
        int i8 = ey4Var.f7879a;
        if (i8 < 0) {
            throw new e05("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i8 > bArr.length - a8) {
            throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i8 == 0) {
            ey4Var.f7881c = qy4.f14669r;
            return a8;
        }
        ey4Var.f7881c = qy4.s(bArr, a8, i8);
        return a8 + i8;
    }

    static int h(n15 n15Var, byte[] bArr, int i7, int i8, ey4 ey4Var) {
        Object a8 = n15Var.a();
        int j7 = j(a8, n15Var, bArr, i7, i8, ey4Var);
        n15Var.e(a8);
        ey4Var.f7881c = a8;
        return j7;
    }

    static int i(n15 n15Var, byte[] bArr, int i7, int i8, int i9, ey4 ey4Var) {
        Object a8 = n15Var.a();
        int k7 = k(a8, n15Var, bArr, i7, i8, i9, ey4Var);
        n15Var.e(a8);
        ey4Var.f7881c = a8;
        return k7;
    }

    static int j(Object obj, n15 n15Var, byte[] bArr, int i7, int i8, ey4 ey4Var) {
        int i9 = i7 + 1;
        int i10 = bArr[i7];
        if (i10 < 0) {
            i9 = b(i10, bArr, i9, ey4Var);
            i10 = ey4Var.f7879a;
        }
        int i11 = i9;
        if (i10 < 0 || i10 > i8 - i11) {
            throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i12 = ey4Var.f7883e + 1;
        ey4Var.f7883e = i12;
        q(i12);
        int i13 = i11 + i10;
        n15Var.m(obj, bArr, i11, i13, ey4Var);
        ey4Var.f7883e--;
        ey4Var.f7881c = obj;
        return i13;
    }

    static int k(Object obj, n15 n15Var, byte[] bArr, int i7, int i8, int i9, ey4 ey4Var) {
        int i10 = ey4Var.f7883e + 1;
        ey4Var.f7883e = i10;
        q(i10);
        int G = ((z05) n15Var).G(obj, bArr, i7, i8, i9, ey4Var);
        ey4Var.f7883e--;
        ey4Var.f7881c = obj;
        return G;
    }

    static int l(int i7, byte[] bArr, int i8, int i9, b05 b05Var, ey4 ey4Var) {
        tz4 tz4Var = (tz4) b05Var;
        int a8 = a(bArr, i8, ey4Var);
        tz4Var.I(ey4Var.f7879a);
        while (a8 < i9) {
            int a9 = a(bArr, a8, ey4Var);
            if (i7 != ey4Var.f7879a) {
                break;
            }
            a8 = a(bArr, a9, ey4Var);
            tz4Var.I(ey4Var.f7879a);
        }
        return a8;
    }

    static int m(byte[] bArr, int i7, b05 b05Var, ey4 ey4Var) {
        tz4 tz4Var = (tz4) b05Var;
        int a8 = a(bArr, i7, ey4Var);
        int i8 = ey4Var.f7879a + a8;
        while (a8 < i8) {
            a8 = a(bArr, a8, ey4Var);
            tz4Var.I(ey4Var.f7879a);
        }
        if (a8 == i8) {
            return a8;
        }
        throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int n(n15 n15Var, int i7, byte[] bArr, int i8, int i9, b05 b05Var, ey4 ey4Var) {
        int h8 = h(n15Var, bArr, i8, i9, ey4Var);
        b05Var.add(ey4Var.f7881c);
        while (h8 < i9) {
            int a8 = a(bArr, h8, ey4Var);
            if (i7 != ey4Var.f7879a) {
                break;
            }
            h8 = h(n15Var, bArr, a8, i9, ey4Var);
            b05Var.add(ey4Var.f7881c);
        }
        return h8;
    }

    static int o(int i7, byte[] bArr, int i8, int i9, z15 z15Var, ey4 ey4Var) {
        if ((i7 >>> 3) == 0) {
            throw new e05("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int c8 = c(bArr, i8, ey4Var);
            z15Var.j(i7, Long.valueOf(ey4Var.f7880b));
            return c8;
        }
        if (i10 == 1) {
            z15Var.j(i7, Long.valueOf(e(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int a8 = a(bArr, i8, ey4Var);
            int i11 = ey4Var.f7879a;
            if (i11 < 0) {
                throw new e05("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i11 > bArr.length - a8) {
                throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i11 == 0) {
                z15Var.j(i7, qy4.f14669r);
            } else {
                z15Var.j(i7, qy4.s(bArr, a8, i11));
            }
            return a8 + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw new e05("Protocol message contained an invalid tag (zero).");
            }
            z15Var.j(i7, Integer.valueOf(d(bArr, i8)));
            return i8 + 4;
        }
        int i12 = (i7 & (-8)) | 4;
        z15 b8 = z15.b();
        int i13 = ey4Var.f7883e + 1;
        ey4Var.f7883e = i13;
        q(i13);
        int i14 = 0;
        while (true) {
            if (i8 >= i9) {
                break;
            }
            int a9 = a(bArr, i8, ey4Var);
            int i15 = ey4Var.f7879a;
            if (i15 == i12) {
                i14 = i15;
                i8 = a9;
                break;
            }
            i8 = o(i15, bArr, a9, i9, b8, ey4Var);
            i14 = i15;
        }
        ey4Var.f7883e--;
        if (i8 > i9 || i14 != i12) {
            throw new e05("Failed to parse the message.");
        }
        z15Var.j(i7, b8);
        return i8;
    }

    static int p(int i7, byte[] bArr, int i8, int i9, ey4 ey4Var) {
        if ((i7 >>> 3) == 0) {
            throw new e05("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            return c(bArr, i8, ey4Var);
        }
        if (i10 == 1) {
            return i8 + 8;
        }
        if (i10 == 2) {
            return a(bArr, i8, ey4Var) + ey4Var.f7879a;
        }
        if (i10 != 3) {
            if (i10 == 5) {
                return i8 + 4;
            }
            throw new e05("Protocol message contained an invalid tag (zero).");
        }
        int i11 = (i7 & (-8)) | 4;
        int i12 = 0;
        while (i8 < i9) {
            i8 = a(bArr, i8, ey4Var);
            i12 = ey4Var.f7879a;
            if (i12 == i11) {
                break;
            }
            i8 = p(i12, bArr, i8, i9, ey4Var);
        }
        if (i8 > i9 || i12 != i11) {
            throw new e05("Failed to parse the message.");
        }
        return i8;
    }

    private static void q(int i7) {
        if (i7 >= f8544a) {
            throw new e05("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
