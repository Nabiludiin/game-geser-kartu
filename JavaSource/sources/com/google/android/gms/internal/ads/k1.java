package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: MyApplication */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f10841a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f10842b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f10843c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f10844d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f10845e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f10846f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f10847g = 0;

    public static eq5 a(y82 y82Var, String str, String str2, uj5 uj5Var) {
        w72 w72Var = new w72();
        w72Var.a(y82Var);
        int i7 = f10842b[w72Var.j(2)];
        w72Var.h(8);
        int i8 = f10844d[w72Var.j(3)];
        if (w72Var.j(1) != 0) {
            i8++;
        }
        int i9 = f10845e[w72Var.j(5)] * 1000;
        w72Var.m();
        y82Var.G(w72Var.e());
        xn5 xn5Var = new xn5();
        xn5Var.A(str);
        xn5Var.l0("audio/ac3");
        xn5Var.e(i8);
        xn5Var.f(i7);
        xn5Var.p0(uj5Var);
        xn5Var.d0(str2);
        xn5Var.g0(i9);
        xn5Var.h0(i9);
        return xn5Var.m();
    }

    public static eq5 b(y82 y82Var, String str, String str2, uj5 uj5Var) {
        String str3;
        w72 w72Var = new w72();
        w72Var.a(y82Var);
        int j7 = w72Var.j(13) * 1000;
        w72Var.h(3);
        int i7 = f10842b[w72Var.j(2)];
        w72Var.h(10);
        int i8 = f10844d[w72Var.j(3)];
        if (w72Var.j(1) != 0) {
            i8++;
        }
        w72Var.h(3);
        int j8 = w72Var.j(4);
        w72Var.h(1);
        if (j8 > 0) {
            w72Var.h(6);
            if (w72Var.j(1) != 0) {
                i8 += 2;
            }
            w72Var.h(1);
        }
        if (w72Var.c() > 7) {
            w72Var.h(7);
            if (w72Var.j(1) != 0) {
                str3 = "audio/eac3-joc";
                w72Var.m();
                y82Var.G(w72Var.e());
                xn5 xn5Var = new xn5();
                xn5Var.A(str);
                xn5Var.l0(str3);
                xn5Var.e(i8);
                xn5Var.f(i7);
                xn5Var.p0(uj5Var);
                xn5Var.d0(str2);
                xn5Var.h0(j7);
                return xn5Var.m();
            }
        }
        str3 = "audio/eac3";
        w72Var.m();
        y82Var.G(w72Var.e());
        xn5 xn5Var2 = new xn5();
        xn5Var2.A(str);
        xn5Var2.l0(str3);
        xn5Var2.e(i8);
        xn5Var2.f(i7);
        xn5Var2.p0(uj5Var);
        xn5Var2.d0(str2);
        xn5Var2.h0(j7);
        return xn5Var2.m();
    }

    public static j1 c(w72 w72Var) {
        int f8;
        int i7;
        int i8;
        int i9;
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int d8 = w72Var.d();
        w72Var.h(40);
        int j7 = w72Var.j(5);
        w72Var.f(d8);
        int i15 = -1;
        if (j7 > 10) {
            w72Var.h(16);
            int j8 = w72Var.j(2);
            if (j8 == 0) {
                i15 = 0;
            } else if (j8 == 1) {
                i15 = 1;
            } else if (j8 == 2) {
                i15 = 2;
            }
            w72Var.h(3);
            int j9 = w72Var.j(11) + 1;
            int j10 = w72Var.j(2);
            if (j10 == 3) {
                i7 = f10843c[w72Var.j(2)];
                i12 = 6;
                i11 = 3;
            } else {
                int j11 = w72Var.j(2);
                int i16 = f10841a[j11];
                i11 = j11;
                i7 = f10842b[j10];
                i12 = i16;
            }
            f8 = j9 + j9;
            int i17 = (f8 * i7) / (i12 * 32);
            int j12 = w72Var.j(3);
            boolean i18 = w72Var.i();
            i8 = f10844d[j12] + (i18 ? 1 : 0);
            w72Var.h(10);
            if (w72Var.i()) {
                w72Var.h(8);
            }
            if (j12 == 0) {
                w72Var.h(5);
                if (w72Var.i()) {
                    w72Var.h(8);
                }
                i13 = 0;
                j12 = 0;
            } else {
                i13 = j12;
            }
            if (i15 == 1) {
                if (w72Var.i()) {
                    w72Var.h(16);
                }
                i14 = 1;
            } else {
                i14 = i15;
            }
            if (w72Var.i()) {
                if (i13 > 2) {
                    w72Var.h(2);
                }
                if ((i13 & 1) != 0 && i13 > 2) {
                    w72Var.h(6);
                }
                if ((i13 & 4) != 0) {
                    w72Var.h(6);
                }
                if (i18 && w72Var.i()) {
                    w72Var.h(5);
                }
                if (i14 == 0) {
                    if (w72Var.i()) {
                        w72Var.h(6);
                    }
                    if (i13 == 0 && w72Var.i()) {
                        w72Var.h(6);
                    }
                    if (w72Var.i()) {
                        w72Var.h(6);
                    }
                    int j13 = w72Var.j(2);
                    if (j13 == 1) {
                        w72Var.h(5);
                    } else if (j13 == 2) {
                        w72Var.h(12);
                    } else if (j13 == 3) {
                        int j14 = w72Var.j(5);
                        if (w72Var.i()) {
                            w72Var.h(5);
                            if (w72Var.i()) {
                                w72Var.h(4);
                            }
                            if (w72Var.i()) {
                                w72Var.h(4);
                            }
                            if (w72Var.i()) {
                                w72Var.h(4);
                            }
                            if (w72Var.i()) {
                                w72Var.h(4);
                            }
                            if (w72Var.i()) {
                                w72Var.h(4);
                            }
                            if (w72Var.i()) {
                                w72Var.h(4);
                            }
                            if (w72Var.i()) {
                                w72Var.h(4);
                            }
                            if (w72Var.i()) {
                                if (w72Var.i()) {
                                    w72Var.h(4);
                                }
                                if (w72Var.i()) {
                                    w72Var.h(4);
                                }
                            }
                        }
                        if (w72Var.i()) {
                            w72Var.h(5);
                            if (w72Var.i()) {
                                w72Var.h(7);
                                if (w72Var.i()) {
                                    w72Var.h(8);
                                }
                            }
                        }
                        w72Var.h((j14 + 2) * 8);
                        w72Var.m();
                    }
                    if (i13 < 2) {
                        if (w72Var.i()) {
                            w72Var.h(14);
                        }
                        if (j12 == 0 && w72Var.i()) {
                            w72Var.h(14);
                        }
                    }
                    if (w72Var.i()) {
                        if (i11 == 0) {
                            w72Var.h(5);
                            i14 = 0;
                            i11 = 0;
                        } else {
                            for (int i19 = 0; i19 < i12; i19++) {
                                if (w72Var.i()) {
                                    w72Var.h(5);
                                }
                            }
                        }
                    }
                    i14 = 0;
                }
            }
            if (w72Var.i()) {
                w72Var.h(5);
                if (i13 == 2) {
                    w72Var.h(4);
                    i13 = 2;
                }
                if (i13 >= 6) {
                    w72Var.h(2);
                }
                if (w72Var.i()) {
                    w72Var.h(8);
                }
                if (i13 == 0 && w72Var.i()) {
                    w72Var.h(8);
                }
                if (j10 < 3) {
                    w72Var.g();
                }
            }
            if (i14 == 0 && i11 != 3) {
                w72Var.g();
            }
            if (i14 == 2 && (i11 == 3 || w72Var.i())) {
                w72Var.h(6);
            }
            i9 = i12 * 256;
            str = (w72Var.i() && w72Var.j(6) == 1 && w72Var.j(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i10 = i17;
        } else {
            w72Var.h(32);
            int j15 = w72Var.j(2);
            String str2 = j15 == 3 ? null : "audio/ac3";
            int j16 = w72Var.j(6);
            int i20 = f10845e[j16 / 2] * 1000;
            f8 = f(j15, j16);
            w72Var.h(8);
            int j17 = w72Var.j(3);
            if ((j17 & 1) != 0 && j17 != 1) {
                w72Var.h(2);
            }
            if ((j17 & 4) != 0) {
                w72Var.h(2);
            }
            if (j17 == 2) {
                w72Var.h(2);
            }
            i7 = j15 < 3 ? f10842b[j15] : -1;
            i8 = f10844d[j17] + (w72Var.i() ? 1 : 0);
            i9 = 1536;
            str = str2;
            i10 = i20;
        }
        return new j1(str, i15, i8, i7, f8, i9, i10, null);
    }

    public static int d(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b8 = bArr[4];
            return f((b8 & 192) >> 6, b8 & 63);
        }
        int i7 = bArr[2] & 7;
        int i8 = ((bArr[3] & 255) | (i7 << 8)) + 1;
        return i8 + i8;
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f10841a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    private static int f(int i7, int i8) {
        int i9;
        if (i7 < 0 || i7 >= 3 || i8 < 0 || (i9 = i8 >> 1) >= 19) {
            return -1;
        }
        int i10 = f10842b[i7];
        if (i10 == 44100) {
            int i11 = f10846f[i9] + (i8 & 1);
            return i11 + i11;
        }
        int i12 = f10845e[i9];
        return i10 == 32000 ? i12 * 6 : i12 * 4;
    }
}
