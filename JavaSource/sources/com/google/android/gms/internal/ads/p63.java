package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
public abstract class p63 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f13680a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f13681b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    private static final Object f13682c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static int[] f13683d = new int[10];

    public static int a(byte[] bArr, int i7) {
        int i8;
        synchronized (f13682c) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < i7) {
                while (true) {
                    try {
                        if (i9 >= i7 - 2) {
                            i9 = i7;
                            break;
                        }
                        int i11 = i9 + 1;
                        if (bArr[i9] == 0 && bArr[i11] == 0 && bArr[i9 + 2] == 3) {
                            break;
                        }
                        i9 = i11;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i9 < i7) {
                    int[] iArr = f13683d;
                    int length = iArr.length;
                    if (length <= i10) {
                        f13683d = Arrays.copyOf(iArr, length + length);
                    }
                    f13683d[i10] = i9;
                    i9 += 3;
                    i10++;
                }
            }
            i8 = i7 - i10;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = f13683d[i14] - i12;
                System.arraycopy(bArr, i12, bArr, i13, i15);
                int i16 = i13 + i15;
                int i17 = i16 + 1;
                bArr[i16] = 0;
                i13 = i16 + 2;
                bArr[i17] = 0;
                i12 += i15 + 3;
            }
            System.arraycopy(bArr, i12, bArr, i13, i8 - i13);
        }
        return i8;
    }

    public static int b(eq5 eq5Var) {
        String str = eq5Var.f7775o;
        if (Objects.equals(str, "video/avc")) {
            return 1;
        }
        return (Objects.equals(str, "video/hevc") || th.e(eq5Var.f7771k, "video/hevc")) ? 2 : 0;
    }

    public static boolean c(byte[] bArr, int i7, int i8, eq5 eq5Var) {
        String str = eq5Var.f7775o;
        if (Objects.equals(str, "video/avc")) {
            byte b8 = bArr[4];
            if (((b8 & 96) >> 5) != 0) {
                return true;
            }
            int i9 = b8 & 31;
            return (i9 == 1 || i9 == 9 || i9 == 14) ? false : true;
        }
        if (Objects.equals(str, "video/hevc")) {
            cu2 k7 = k(new q73(bArr, 4, i8 + 4));
            int i10 = k7.f6636a;
            if (i10 == 35) {
                return false;
            }
            return (i10 <= 14 && i10 % 2 == 0 && k7.f6638c == eq5Var.F + (-1)) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.n53 d(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p63.d(byte[], int, int):com.google.android.gms.internal.ads.n53");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.l33 e(byte[] r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 2155
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p63.e(byte[], int, int):com.google.android.gms.internal.ads.l33");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.i03 f(byte[] r36, int r37, int r38, com.google.android.gms.internal.ads.l33 r39) {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p63.f(byte[], int, int, com.google.android.gms.internal.ads.l33):com.google.android.gms.internal.ads.i03");
    }

    public static m43 g(byte[] bArr, int i7, int i8) {
        q73 q73Var = new q73(bArr, 4, i8);
        int g8 = q73Var.g();
        int g9 = q73Var.g();
        q73Var.a();
        return new m43(g8, g9, q73Var.e());
    }

    public static int h(byte[] bArr, int i7, int i8, boolean[] zArr) {
        int i9 = i8 - i7;
        rx3.h(i9 >= 0);
        if (i9 == 0) {
            return i8;
        }
        if (zArr[0]) {
            i(zArr);
            return i7 - 3;
        }
        if (i9 > 1 && zArr[1] && bArr[i7] == 1) {
            i(zArr);
            return i7 - 2;
        }
        if (i9 > 2 && zArr[2] && bArr[i7] == 0 && bArr[i7 + 1] == 1) {
            i(zArr);
            return i7 - 1;
        }
        int i10 = i8 - 1;
        int i11 = i7 + 2;
        while (i11 < i10) {
            byte b8 = bArr[i11];
            if ((b8 & 254) == 0) {
                int i12 = i11 - 2;
                if (bArr[i12] == 0 && bArr[i11 - 1] == 0 && b8 == 1) {
                    i(zArr);
                    return i12;
                }
                i11 = i12;
            }
            i11 += 3;
        }
        zArr[0] = i9 <= 2 ? !(i9 != 2 ? !(zArr[1] && bArr[i10] == 1) : !(zArr[2] && bArr[i8 + (-2)] == 0 && bArr[i10] == 1)) : bArr[i8 + (-3)] == 0 && bArr[i8 + (-2)] == 0 && bArr[i10] == 1;
        zArr[1] = i9 <= 1 ? zArr[2] && bArr[i10] == 0 : bArr[i8 + (-2)] == 0 && bArr[i10] == 0;
        zArr[2] = bArr[i10] == 0;
        return i8;
    }

    public static void i(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static String j(List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            byte[] bArr = (byte[]) list.get(i7);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i8 = w04.f17978s;
                t04 t04Var = new t04();
                int i9 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i9 >= length2) {
                        break;
                    }
                    int h8 = h(bArr, i9, length2, zArr);
                    if (h8 != length2) {
                        t04Var.g(Integer.valueOf(h8));
                    }
                    i9 = h8 + 3;
                }
                w04 j7 = t04Var.j();
                for (int i10 = 0; i10 < j7.size(); i10++) {
                    if (((Integer) j7.get(i10)).intValue() + 3 < length) {
                        q73 q73Var = new q73(bArr, ((Integer) j7.get(i10)).intValue() + 3, length);
                        cu2 k7 = k(q73Var);
                        if (k7.f6636a == 33 && k7.f6637b == 0) {
                            q73Var.b(4);
                            int f8 = q73Var.f(3);
                            q73Var.a();
                            dv2 l7 = l(q73Var, true, f8, null);
                            return qe1.b(l7.f7323a, l7.f7324b, l7.f7325c, l7.f7326d, l7.f7327e, l7.f7328f);
                        }
                    }
                }
            }
        }
        return null;
    }

    private static cu2 k(q73 q73Var) {
        q73Var.a();
        return new cu2(q73Var.f(6), q73Var.f(6), q73Var.f(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.dv2 l(com.google.android.gms.internal.ads.q73 r18, boolean r19, int r20, com.google.android.gms.internal.ads.dv2 r21) {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 8
            r6 = 0
            if (r19 == 0) goto L41
            r2 = 2
            int r2 = r0.f(r2)
            boolean r7 = r0.e()
            r8 = 5
            int r8 = r0.f(r8)
            r9 = r6
            r10 = r9
        L1e:
            r11 = 32
            if (r9 >= r11) goto L2e
            boolean r11 = r0.e()
            if (r11 == 0) goto L2b
            r11 = 1
            int r11 = r11 << r9
            r10 = r10 | r11
        L2b:
            int r9 = r9 + 1
            goto L1e
        L2e:
            r9 = r6
        L2f:
            if (r9 >= r3) goto L3a
            int r11 = r0.f(r5)
            r4[r9] = r11
            int r9 = r9 + 1
            goto L2f
        L3a:
            r12 = r2
        L3b:
            r16 = r4
            r13 = r7
            r14 = r8
            r15 = r10
            goto L55
        L41:
            if (r2 == 0) goto L4f
            int r3 = r2.f7323a
            boolean r7 = r2.f7324b
            int r8 = r2.f7325c
            int r10 = r2.f7326d
            int[] r4 = r2.f7327e
            r12 = r3
            goto L3b
        L4f:
            r16 = r4
            r12 = r6
            r13 = r12
            r14 = r13
            r15 = r14
        L55:
            int r17 = r0.f(r5)
            r2 = r6
        L5a:
            if (r6 >= r1) goto L6f
            boolean r3 = r0.e()
            if (r3 == 0) goto L64
            int r2 = r2 + 88
        L64:
            boolean r3 = r0.e()
            if (r3 == 0) goto L6c
            int r2 = r2 + 8
        L6c:
            int r6 = r6 + 1
            goto L5a
        L6f:
            r0.b(r2)
            if (r1 <= 0) goto L79
            int r5 = r5 - r1
            int r5 = r5 + r5
            r0.b(r5)
        L79:
            com.google.android.gms.internal.ads.dv2 r11 = new com.google.android.gms.internal.ads.dv2
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p63.l(com.google.android.gms.internal.ads.q73, boolean, int, com.google.android.gms.internal.ads.dv2):com.google.android.gms.internal.ads.dv2");
    }

    private static int m(int i7, int i8, int i9, int i10) {
        int i11 = 2;
        if (i8 != 1 && i8 != 2) {
            i11 = 1;
        }
        return i7 - (i11 * (i9 + i10));
    }

    private static int n(int i7, int i8, int i9, int i10) {
        return i7 - ((i8 == 1 ? 2 : 1) * (i9 + i10));
    }

    private static void o(q73 q73Var) {
        int g8 = q73Var.g() + 1;
        q73Var.b(8);
        for (int i7 = 0; i7 < g8; i7++) {
            q73Var.g();
            q73Var.g();
            q73Var.a();
        }
        q73Var.b(20);
    }
}
