package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
public abstract class j2 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f10306a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f10307b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f10308c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f10309d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f10310e = {5, 8, 10, 12};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f10311f = {6, 9, 12, 15};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f10312g = {2, 4, 6, 8};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f10313h = {9, 11, 13, 16};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f10314i = {5, 8, 10, 12};

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f10315j = 0;

    public static int a(int i7) {
        if (i7 == 2147385345 || i7 == -25230976 || i7 == 536864768 || i7 == -14745368) {
            return 1;
        }
        if (i7 == 1683496997 || i7 == 622876772) {
            return 2;
        }
        if (i7 == 1078008818 || i7 == -233094848) {
            return 3;
        }
        return (i7 == 1908687592 || i7 == -398277519) ? 4 : 0;
    }

    public static eq5 b(byte[] bArr, String str, String str2, int i7, String str3, uj5 uj5Var) {
        w72 i8 = i(bArr);
        i8.h(60);
        int i9 = f10306a[i8.j(6)];
        int i10 = f10307b[i8.j(4)];
        int j7 = i8.j(5);
        int i11 = j7 >= 29 ? -1 : (f10308c[j7] * 1000) / 2;
        i8.h(10);
        int i12 = i9 + (i8.j(2) > 0 ? 1 : 0);
        xn5 xn5Var = new xn5();
        xn5Var.A(str);
        xn5Var.k0("video/mp2t");
        xn5Var.l0("audio/vnd.dts");
        xn5Var.g0(i11);
        xn5Var.e(i12);
        xn5Var.f(i10);
        xn5Var.p0(null);
        xn5Var.d0(str2);
        xn5Var.f0(i7);
        return xn5Var.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4e
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r7 = r7[r3]
        L1f:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r1 = r1 | r2
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5c
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r2 = 8
            r7 = r7[r2]
        L35:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r0 = r0 | r1
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5c
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r2 = 9
            r7 = r7[r2]
            goto L35
        L4e:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r7 = r7[r4]
            goto L1f
        L5c:
            if (r0 == 0) goto L62
            int r7 = r7 * 16
            int r7 = r7 / 14
        L62:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j2.c(byte[]):int");
    }

    public static i2 d(byte[] bArr) {
        int i7;
        int i8;
        long j7;
        int i9;
        w72 i10 = i(bArr);
        i10.h(40);
        int j8 = i10.j(2);
        boolean i11 = i10.i();
        int i12 = true != i11 ? 16 : 20;
        i10.h(true != i11 ? 8 : 12);
        int j9 = i10.j(i12) + 1;
        boolean i13 = i10.i();
        int i14 = -1;
        int i15 = 0;
        if (i13) {
            i7 = i10.j(2);
            int j10 = i10.j(3) + 1;
            if (i10.i()) {
                i10.h(36);
            }
            int j11 = i10.j(3) + 1;
            int j12 = i10.j(3) + 1;
            if (j11 != 1 || j12 != 1) {
                throw wi.c("Multiple audio presentations or assets not supported");
            }
            int i16 = j8 + 1;
            int j13 = i10.j(i16);
            for (int i17 = 0; i17 < i16; i17++) {
                if (((j13 >> i17) & 1) == 1) {
                    i10.h(8);
                }
            }
            int i18 = j10 * 512;
            if (i10.i()) {
                i10.h(2);
                int j14 = (i10.j(2) + 1) << 2;
                int j15 = i10.j(2) + 1;
                while (i15 < j15) {
                    i10.h(j14);
                    i15++;
                }
            }
            i15 = i18;
        } else {
            i7 = -1;
        }
        i10.h(i12);
        i10.h(12);
        if (i13) {
            if (i10.i()) {
                i10.h(4);
            }
            if (i10.i()) {
                i10.h(24);
            }
            if (i10.i()) {
                i10.o(i10.j(10) + 1);
            }
            i10.h(5);
            i8 = f10309d[i10.j(4)];
            i14 = i10.j(8) + 1;
        } else {
            i8 = -2147483647;
        }
        int i19 = i8;
        if (i13) {
            if (i7 == 0) {
                i9 = 32000;
            } else if (i7 == 1) {
                i9 = 44100;
            } else {
                if (i7 != 2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 51);
                    sb.append("Unsupported reference clock code in DTS HD header: ");
                    sb.append(i7);
                    throw wi.b(sb.toString(), null);
                }
                i9 = 48000;
            }
            j7 = hi2.Q(i15, 1000000L, i9, RoundingMode.DOWN);
        } else {
            j7 = -9223372036854775807L;
        }
        return new i2("audio/vnd.dts.hd;profile=lbr", i14, i19, j9, j7, 0, null);
    }

    public static int e(byte[] bArr) {
        w72 i7 = i(bArr);
        i7.h(42);
        return i7.j(true != i7.i() ? 8 : 12) + 1;
    }

    public static i2 f(byte[] bArr, AtomicInteger atomicInteger) {
        long j7;
        int i7;
        AtomicInteger atomicInteger2;
        int i8;
        int i9;
        w72 i10 = i(bArr);
        int j8 = i10.j(32);
        int h8 = h(i10, f10310e, true);
        int i11 = h8 + 1;
        char c8 = j8 == 1078008818 ? (char) 1 : (char) 0;
        if (c8 == 0) {
            j7 = -9223372036854775807L;
            i7 = -2147483647;
        } else {
            if (!i10.i()) {
                throw wi.c("Only supports full channel mask-based audio presentation");
            }
            int i12 = h8 - 1;
            if (((bArr[h8] & 255) | ((char) (bArr[i12] << 8))) != hi2.i(bArr, 0, i12, 65535)) {
                throw wi.b("CRC check failed", null);
            }
            int j9 = i10.j(2);
            if (j9 == 0) {
                i8 = 512;
            } else if (j9 == 1) {
                i8 = 480;
            } else {
                if (j9 != 2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(j9).length() + 51);
                    sb.append("Unsupported base duration index in DTS UHD header: ");
                    sb.append(j9);
                    throw wi.b(sb.toString(), null);
                }
                i8 = 384;
            }
            int j10 = i10.j(3) + 1;
            int j11 = i10.j(2);
            if (j11 == 0) {
                i9 = 32000;
            } else if (j11 == 1) {
                i9 = 44100;
            } else {
                if (j11 != 2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + 48);
                    sb2.append("Unsupported clock rate index in DTS UHD header: ");
                    sb2.append(j11);
                    throw wi.b(sb2.toString(), null);
                }
                i9 = 48000;
            }
            if (i10.i()) {
                i10.h(36);
            }
            i7 = (1 << i10.j(2)) * i9;
            j7 = hi2.Q(i8 * j10, 1000000L, i9, RoundingMode.DOWN);
        }
        int i13 = i7;
        long j12 = j7;
        int i14 = 0;
        for (char c9 = 0; c9 < c8; c9 = 1) {
            i14 += h(i10, f10311f, true);
        }
        for (int i15 = 0; i15 <= 0; i15++) {
            if (c8 != 0) {
                atomicInteger2 = atomicInteger;
                atomicInteger2.set(h(i10, f10312g, true));
            } else {
                atomicInteger2 = atomicInteger;
            }
            i14 += atomicInteger2.get() != 0 ? h(i10, f10313h, true) : 0;
        }
        return new i2("audio/vnd.dts.uhd;profile=p2", 2, i13, i11 + i14, j12, 0, null);
    }

    public static int g(byte[] bArr) {
        w72 i7 = i(bArr);
        i7.h(32);
        return h(i7, f10314i, true) + 1;
    }

    private static int h(w72 w72Var, int[] iArr, boolean z7) {
        int i7 = 0;
        for (int i8 = 0; i8 < 3 && w72Var.i(); i8++) {
            i7++;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            i9 += 1 << iArr[i10];
        }
        return i9 + w72Var.j(iArr[i7]);
    }

    private static w72 i(byte[] bArr) {
        byte b8 = bArr[0];
        if (b8 == Byte.MAX_VALUE || b8 == 100 || b8 == 64 || b8 == 113) {
            return new w72(bArr, bArr.length);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b9 = copyOf[0];
        if (b9 == -2 || b9 == -1 || b9 == 37 || b9 == -14 || b9 == -24) {
            for (int i7 = 0; i7 < copyOf.length - 1; i7 += 2) {
                byte b10 = copyOf[i7];
                int i8 = i7 + 1;
                copyOf[i7] = copyOf[i8];
                copyOf[i8] = b10;
            }
        }
        int length = copyOf.length;
        w72 w72Var = new w72(copyOf, length);
        if (copyOf[0] == 31) {
            w72 w72Var2 = new w72(copyOf, length);
            while (w72Var2.c() >= 16) {
                w72Var2.h(2);
                w72Var.p(w72Var2.j(14), 14);
            }
        }
        w72Var.b(copyOf, copyOf.length);
        return w72Var;
    }
}
