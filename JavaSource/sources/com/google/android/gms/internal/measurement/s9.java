package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
abstract class s9 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f21377a = 100;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f21378b = 0;

    static int a(byte[] bArr, int i7, r9 r9Var) {
        int i8 = i7 + 1;
        byte b8 = bArr[i7];
        if (b8 < 0) {
            return b(b8, bArr, i8, r9Var);
        }
        r9Var.f21330a = b8;
        return i8;
    }

    static int b(int i7, byte[] bArr, int i8, r9 r9Var) {
        byte b8 = bArr[i8];
        int i9 = i8 + 1;
        int i10 = i7 & 127;
        if (b8 >= 0) {
            r9Var.f21330a = i10 | (b8 << 7);
            return i9;
        }
        int i11 = i10 | ((b8 & Byte.MAX_VALUE) << 7);
        int i12 = i8 + 2;
        byte b9 = bArr[i9];
        if (b9 >= 0) {
            r9Var.f21330a = i11 | (b9 << 14);
            return i12;
        }
        int i13 = i11 | ((b9 & Byte.MAX_VALUE) << 14);
        int i14 = i8 + 3;
        byte b10 = bArr[i12];
        if (b10 >= 0) {
            r9Var.f21330a = i13 | (b10 << 21);
            return i14;
        }
        int i15 = i13 | ((b10 & Byte.MAX_VALUE) << 21);
        int i16 = i8 + 4;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            r9Var.f21330a = i15 | (b11 << 28);
            return i16;
        }
        int i17 = i15 | ((b11 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                r9Var.f21330a = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    static int c(byte[] bArr, int i7, r9 r9Var) {
        long j7 = bArr[i7];
        int i8 = i7 + 1;
        if (j7 >= 0) {
            r9Var.f21331b = j7;
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
        r9Var.f21331b = j8;
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

    static int f(byte[] bArr, int i7, r9 r9Var) {
        int i8;
        int a8 = a(bArr, i7, r9Var);
        int i9 = r9Var.f21330a;
        if (i9 < 0) {
            throw new gb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i9 == 0) {
            r9Var.f21332c = "";
            return a8;
        }
        int i10 = dd.f20886a;
        int length = bArr.length;
        if ((((length - a8) - i9) | a8 | i9) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(a8), Integer.valueOf(i9)));
        }
        int i11 = a8 + i9;
        char[] cArr = new char[i9];
        int i12 = 0;
        while (a8 < i11) {
            byte b8 = bArr[a8];
            if (!bd.a(b8)) {
                break;
            }
            a8++;
            cArr[i12] = (char) b8;
            i12++;
        }
        int i13 = i12;
        while (a8 < i11) {
            int i14 = a8 + 1;
            byte b9 = bArr[a8];
            if (bd.a(b9)) {
                cArr[i13] = (char) b9;
                i13++;
                a8 = i14;
                while (a8 < i11) {
                    byte b10 = bArr[a8];
                    if (bd.a(b10)) {
                        a8++;
                        cArr[i13] = (char) b10;
                        i13++;
                    }
                }
            } else {
                if (b9 < -32) {
                    if (i14 >= i11) {
                        throw new gb("Protocol message had invalid UTF-8.");
                    }
                    i8 = i13 + 1;
                    a8 += 2;
                    bd.b(b9, bArr[i14], cArr, i13);
                } else if (b9 < -16) {
                    if (i14 >= i11 - 1) {
                        throw new gb("Protocol message had invalid UTF-8.");
                    }
                    i8 = i13 + 1;
                    int i15 = a8 + 2;
                    a8 += 3;
                    bd.c(b9, bArr[i14], bArr[i15], cArr, i13);
                } else {
                    if (i14 >= i11 - 2) {
                        throw new gb("Protocol message had invalid UTF-8.");
                    }
                    byte b11 = bArr[i14];
                    int i16 = a8 + 3;
                    byte b12 = bArr[a8 + 2];
                    a8 += 4;
                    bd.d(b9, b11, b12, bArr[i16], cArr, i13);
                    i13 += 2;
                }
                i13 = i8;
            }
        }
        r9Var.f21332c = new String(cArr, 0, i13);
        return i11;
    }

    static int g(byte[] bArr, int i7, r9 r9Var) {
        int a8 = a(bArr, i7, r9Var);
        int i8 = r9Var.f21330a;
        if (i8 < 0) {
            throw new gb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i8 > bArr.length - a8) {
            throw new gb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i8 == 0) {
            r9Var.f21332c = ca.f20858r;
            return a8;
        }
        r9Var.f21332c = ca.k(bArr, a8, i8);
        return a8 + i8;
    }

    static int h(ic icVar, byte[] bArr, int i7, int i8, r9 r9Var) {
        Object a8 = icVar.a();
        int j7 = j(a8, icVar, bArr, i7, i8, r9Var);
        icVar.b(a8);
        r9Var.f21332c = a8;
        return j7;
    }

    static int i(ic icVar, byte[] bArr, int i7, int i8, int i9, r9 r9Var) {
        Object a8 = icVar.a();
        int k7 = k(a8, icVar, bArr, i7, i8, i9, r9Var);
        icVar.b(a8);
        r9Var.f21332c = a8;
        return k7;
    }

    static int j(Object obj, ic icVar, byte[] bArr, int i7, int i8, r9 r9Var) {
        int i9 = i7 + 1;
        int i10 = bArr[i7];
        if (i10 < 0) {
            i9 = b(i10, bArr, i9, r9Var);
            i10 = r9Var.f21330a;
        }
        int i11 = i9;
        if (i10 < 0 || i10 > i8 - i11) {
            throw new gb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i12 = r9Var.f21334e + 1;
        r9Var.f21334e = i12;
        q(i12);
        int i13 = i11 + i10;
        icVar.c(obj, bArr, i11, i13, r9Var);
        r9Var.f21334e--;
        r9Var.f21332c = obj;
        return i13;
    }

    static int k(Object obj, ic icVar, byte[] bArr, int i7, int i8, int i9, r9 r9Var) {
        int i10 = r9Var.f21334e + 1;
        r9Var.f21334e = i10;
        q(i10);
        int A = ((ac) icVar).A(obj, bArr, i7, i8, i9, r9Var);
        r9Var.f21334e--;
        r9Var.f21332c = obj;
        return A;
    }

    static int l(int i7, byte[] bArr, int i8, int i9, db dbVar, r9 r9Var) {
        ya yaVar = (ya) dbVar;
        int a8 = a(bArr, i8, r9Var);
        yaVar.h(r9Var.f21330a);
        while (a8 < i9) {
            int a9 = a(bArr, a8, r9Var);
            if (i7 != r9Var.f21330a) {
                break;
            }
            a8 = a(bArr, a9, r9Var);
            yaVar.h(r9Var.f21330a);
        }
        return a8;
    }

    static int m(byte[] bArr, int i7, db dbVar, r9 r9Var) {
        ya yaVar = (ya) dbVar;
        int a8 = a(bArr, i7, r9Var);
        int i8 = r9Var.f21330a + a8;
        while (a8 < i8) {
            a8 = a(bArr, a8, r9Var);
            yaVar.h(r9Var.f21330a);
        }
        if (a8 == i8) {
            return a8;
        }
        throw new gb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int n(ic icVar, int i7, byte[] bArr, int i8, int i9, db dbVar, r9 r9Var) {
        int h8 = h(icVar, bArr, i8, i9, r9Var);
        dbVar.add(r9Var.f21332c);
        while (h8 < i9) {
            int a8 = a(bArr, h8, r9Var);
            if (i7 != r9Var.f21330a) {
                break;
            }
            h8 = h(icVar, bArr, a8, i9, r9Var);
            dbVar.add(r9Var.f21332c);
        }
        return h8;
    }

    static int o(int i7, byte[] bArr, int i8, int i9, uc ucVar, r9 r9Var) {
        if ((i7 >>> 3) == 0) {
            throw new gb("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int c8 = c(bArr, i8, r9Var);
            ucVar.j(i7, Long.valueOf(r9Var.f21331b));
            return c8;
        }
        if (i10 == 1) {
            ucVar.j(i7, Long.valueOf(e(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int a8 = a(bArr, i8, r9Var);
            int i11 = r9Var.f21330a;
            if (i11 < 0) {
                throw new gb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i11 > bArr.length - a8) {
                throw new gb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i11 == 0) {
                ucVar.j(i7, ca.f20858r);
            } else {
                ucVar.j(i7, ca.k(bArr, a8, i11));
            }
            return a8 + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw new gb("Protocol message contained an invalid tag (zero).");
            }
            ucVar.j(i7, Integer.valueOf(d(bArr, i8)));
            return i8 + 4;
        }
        int i12 = (i7 & (-8)) | 4;
        uc b8 = uc.b();
        int i13 = r9Var.f21334e + 1;
        r9Var.f21334e = i13;
        q(i13);
        int i14 = 0;
        while (true) {
            if (i8 >= i9) {
                break;
            }
            int a9 = a(bArr, i8, r9Var);
            int i15 = r9Var.f21330a;
            if (i15 == i12) {
                i14 = i15;
                i8 = a9;
                break;
            }
            i8 = o(i15, bArr, a9, i9, b8, r9Var);
            i14 = i15;
        }
        r9Var.f21334e--;
        if (i8 > i9 || i14 != i12) {
            throw new gb("Failed to parse the message.");
        }
        ucVar.j(i7, b8);
        return i8;
    }

    static int p(int i7, byte[] bArr, int i8, int i9, r9 r9Var) {
        if ((i7 >>> 3) == 0) {
            throw new gb("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            return c(bArr, i8, r9Var);
        }
        if (i10 == 1) {
            return i8 + 8;
        }
        if (i10 == 2) {
            return a(bArr, i8, r9Var) + r9Var.f21330a;
        }
        if (i10 != 3) {
            if (i10 == 5) {
                return i8 + 4;
            }
            throw new gb("Protocol message contained an invalid tag (zero).");
        }
        int i11 = (i7 & (-8)) | 4;
        int i12 = 0;
        while (i8 < i9) {
            i8 = a(bArr, i8, r9Var);
            i12 = r9Var.f21330a;
            if (i12 == i11) {
                break;
            }
            i8 = p(i12, bArr, i8, i9, r9Var);
        }
        if (i8 > i9 || i12 != i11) {
            throw new gb("Failed to parse the message.");
        }
        return i8;
    }

    private static void q(int i7) {
        if (i7 >= f21377a) {
            throw new gb("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
