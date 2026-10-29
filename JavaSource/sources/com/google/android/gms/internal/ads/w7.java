package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* compiled from: MyApplication */
public abstract class w7 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f18094a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f18095b = 0;

    static {
        String str = hi2.f9535a;
        f18094a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int a(int i7) {
        return (i7 >> 24) & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e4, code lost:
    
        if (r26 == 0) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0ed3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0efe  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0cd6  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0cd8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0e66  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0e6a  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x029f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List b(com.google.android.gms.internal.ads.qn2 r88, com.google.android.gms.internal.ads.e3 r89, long r90, com.google.android.gms.internal.ads.uj5 r92, boolean r93, boolean r94, com.google.android.gms.internal.ads.hx3 r95, boolean r96) {
        /*
            Method dump skipped, instructions count: 3853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w7.b(com.google.android.gms.internal.ads.qn2, com.google.android.gms.internal.ads.e3, long, com.google.android.gms.internal.ads.uj5, boolean, boolean, com.google.android.gms.internal.ads.hx3, boolean):java.util.List");
    }

    public static le c(ro2 ro2Var) {
        int f8;
        y82 y82Var = ro2Var.f15139b;
        y82Var.G(8);
        le leVar = new le(-9223372036854775807L, new ld[0]);
        while (y82Var.C() >= 8) {
            int F = y82Var.F();
            int b8 = y82Var.b() + F;
            int b9 = y82Var.b();
            le leVar2 = null;
            if (b9 == 1835365473) {
                y82Var.G(F);
                y82Var.J(8);
                f(y82Var);
                while (true) {
                    if (y82Var.F() >= b8) {
                        break;
                    }
                    int F2 = y82Var.F();
                    int b10 = y82Var.b() + F2;
                    if (y82Var.b() == 1768715124) {
                        y82Var.G(F2);
                        y82Var.J(8);
                        ArrayList arrayList = new ArrayList();
                        while (y82Var.F() < b10) {
                            ld c8 = e8.c(y82Var);
                            if (c8 != null) {
                                arrayList.add(c8);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            leVar2 = new le(arrayList);
                        }
                    } else {
                        y82Var.G(b10);
                    }
                }
                leVar = leVar.f(leVar2);
            } else if (b9 == 1936553057) {
                y82Var.G(F);
                y82Var.J(12);
                while (true) {
                    if (y82Var.F() >= b8) {
                        break;
                    }
                    int F3 = y82Var.F();
                    int b11 = y82Var.b();
                    if (y82Var.b() != 1935766900) {
                        y82Var.G(F3 + b11);
                    } else if (b11 >= 16) {
                        y82Var.J(4);
                        int i7 = -1;
                        int i8 = 0;
                        for (int i9 = 0; i9 < 2; i9++) {
                            int R = y82Var.R();
                            int R2 = y82Var.R();
                            if (R == 0) {
                                i7 = R2;
                            } else if (R == 1) {
                                i8 = R2;
                            }
                        }
                        if (i7 == 12) {
                            f8 = 240;
                        } else if (i7 == 13) {
                            f8 = 120;
                        } else {
                            if (i7 == 21 && y82Var.C() >= 8 && y82Var.F() + 8 <= b8) {
                                int b12 = y82Var.b();
                                int b13 = y82Var.b();
                                if (b12 >= 12 && b13 == 1936877170) {
                                    f8 = y82Var.f();
                                }
                            }
                            f8 = -2147483647;
                        }
                        if (f8 != -2147483647) {
                            leVar2 = new le(-9223372036854775807L, new o6(f8, i8));
                        }
                    }
                }
                leVar = leVar.f(leVar2);
            } else if (b9 == -1451722374) {
                leVar = leVar.f(h(y82Var));
            }
            y82Var.G(b8);
        }
        return leVar;
    }

    public static xr2 d(y82 y82Var) {
        long d8;
        long d9;
        y82Var.G(8);
        if (a(y82Var.b()) == 0) {
            d8 = y82Var.Y();
            d9 = y82Var.Y();
        } else {
            d8 = y82Var.d();
            d9 = y82Var.d();
        }
        return new xr2(d8, d9, y82Var.Y());
    }

    public static le e(qn2 qn2Var) {
        ol2 ol2Var;
        ro2 d8 = qn2Var.d(1751411826);
        ro2 d9 = qn2Var.d(1801812339);
        ro2 d10 = qn2Var.d(1768715124);
        if (d8 != null && d9 != null && d10 != null && i(d8.f15139b) == 1835299937) {
            y82 y82Var = d9.f15139b;
            y82Var.G(12);
            int b8 = y82Var.b();
            String[] strArr = new String[b8];
            for (int i7 = 0; i7 < b8; i7++) {
                int b9 = y82Var.b();
                y82Var.J(4);
                strArr[i7] = y82Var.k(b9 - 8, StandardCharsets.UTF_8);
            }
            y82 y82Var2 = d10.f15139b;
            y82Var2.G(8);
            ArrayList arrayList = new ArrayList();
            while (y82Var2.C() > 8) {
                int F = y82Var2.F() + y82Var2.b();
                int b10 = y82Var2.b() - 1;
                if (b10 < 0 || b10 >= b8) {
                    StringBuilder sb = new StringBuilder(String.valueOf(b10).length() + 41);
                    sb.append("Skipped metadata with unknown key index: ");
                    sb.append(b10);
                    gv1.c("BoxParsers", sb.toString());
                } else {
                    String str = strArr[b10];
                    while (true) {
                        int F2 = y82Var2.F();
                        if (F2 >= F) {
                            ol2Var = null;
                            break;
                        }
                        int b11 = y82Var2.b();
                        if (y82Var2.b() == 1684108385) {
                            int b12 = y82Var2.b();
                            int b13 = y82Var2.b();
                            int i8 = b11 - 16;
                            byte[] bArr = new byte[i8];
                            y82Var2.L(bArr, 0, i8);
                            ol2Var = new ol2(str, bArr, b13, b12);
                            break;
                        }
                        y82Var2.G(F2 + b11);
                    }
                    if (ol2Var != null) {
                        arrayList.add(ol2Var);
                    }
                }
                y82Var2.G(F);
            }
            if (!arrayList.isEmpty()) {
                return new le(arrayList);
            }
        }
        return null;
    }

    public static void f(y82 y82Var) {
        int F = y82Var.F();
        y82Var.J(4);
        if (y82Var.b() != 1751411826) {
            F += 4;
        }
        y82Var.G(F);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.s8 g(com.google.android.gms.internal.ads.p8 r42, com.google.android.gms.internal.ads.qn2 r43, com.google.android.gms.internal.ads.e3 r44, boolean r45) {
        /*
            Method dump skipped, instructions count: 1770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w7.g(com.google.android.gms.internal.ads.p8, com.google.android.gms.internal.ads.qn2, com.google.android.gms.internal.ads.e3, boolean):com.google.android.gms.internal.ads.s8");
    }

    private static le h(y82 y82Var) {
        short U = y82Var.U();
        y82Var.J(2);
        String k7 = y82Var.k(U, StandardCharsets.UTF_8);
        int max = Math.max(k7.lastIndexOf(43), k7.lastIndexOf(45));
        try {
            return new le(-9223372036854775807L, new wq2(Float.parseFloat(k7.substring(0, max)), Float.parseFloat(k7.substring(max, k7.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int i(y82 y82Var) {
        y82Var.G(16);
        return y82Var.b();
    }

    private static String j(byte[] bArr, int i7, int i8) {
        rx3.h(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i9 = 0; i9 < bArr.length - 3; i9 += 4) {
            int e8 = m44.e(bArr[i9], bArr[i9 + 1], bArr[i9 + 2], bArr[i9 + 3]);
            String str = hi2.f9535a;
            int i10 = ((e8 >> 8) & 255) - 128;
            int i11 = (e8 >> 16) & 255;
            int i12 = (e8 & 255) - 128;
            arrayList.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(i11 + ((i12 * 17790) / 10000), 255)) | (Math.max(0, Math.min(((i10 * 14075) / 10000) + i11, 255)) << 16) | (Math.max(0, Math.min((i11 - ((i12 * 3455) / 10000)) - ((i10 * 7169) / 10000), 255)) << 8))));
        }
        String d8 = kx3.d(arrayList, ", ");
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 7 + String.valueOf(i8).length() + 10 + d8.length() + 1);
        sb.append("size: ");
        sb.append(i7);
        sb.append("x");
        sb.append(i8);
        sb.append("\npalette: ");
        sb.append(d8);
        sb.append("\n");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x014e, code lost:
    
        if (r6 == 1) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.w25 k(com.google.android.gms.internal.ads.y82 r15) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w7.k(com.google.android.gms.internal.ads.y82):com.google.android.gms.internal.ads.w25");
    }

    private static w25 l(y82 y82Var) {
        lc4 lc4Var = new lc4();
        byte[] H = y82Var.H();
        w72 w72Var = new w72(H, H.length);
        w72Var.f(y82Var.F() * 8);
        w72Var.o(1);
        int j7 = w72Var.j(8);
        for (int i7 = 0; i7 < j7; i7++) {
            w72Var.o(1);
            int j8 = w72Var.j(8);
            for (int i8 = 0; i8 < j8; i8++) {
                w72Var.h(6);
                boolean i9 = w72Var.i();
                w72Var.g();
                w72Var.o(11);
                w72Var.h(4);
                int j9 = w72Var.j(4) + 8;
                lc4Var.e(j9);
                lc4Var.f(j9);
                w72Var.o(1);
                if (i9) {
                    int j10 = w72Var.j(8);
                    int j11 = w72Var.j(8);
                    w72Var.o(1);
                    boolean i10 = w72Var.i();
                    lc4Var.a(w25.b(j10));
                    lc4Var.b(true != i10 ? 2 : 1);
                    lc4Var.c(w25.c(j11));
                }
            }
        }
        return lc4Var.g();
    }

    private static ByteBuffer m() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static Pair n(qn2 qn2Var) {
        ro2 d8 = qn2Var.d(1701606260);
        if (d8 == null) {
            return null;
        }
        y82 y82Var = d8.f15139b;
        y82Var.G(8);
        int a8 = a(y82Var.b());
        int h8 = y82Var.h();
        long[] jArr = new long[h8];
        long[] jArr2 = new long[h8];
        for (int i7 = 0; i7 < h8; i7++) {
            jArr[i7] = a8 == 1 ? y82Var.j() : y82Var.Y();
            jArr2[i7] = a8 == 1 ? y82Var.d() : y82Var.b();
            if (y82Var.U() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            y82Var.J(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x04cd, code lost:
    
        r2.J(com.google.android.gms.internal.ads.m44.a(r2.p()));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:236:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void o(com.google.android.gms.internal.ads.y82 r38, int r39, int r40, int r41, int r42, java.lang.String r43, boolean r44, com.google.android.gms.internal.ads.uj5 r45, com.google.android.gms.internal.ads.s7 r46, int r47) {
        /*
            Method dump skipped, instructions count: 1867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w7.o(com.google.android.gms.internal.ads.y82, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.uj5, com.google.android.gms.internal.ads.s7, int):void");
    }

    private static n7 p(y82 y82Var, int i7) {
        y82Var.G(i7 + 12);
        y82Var.J(1);
        s(y82Var);
        y82Var.J(2);
        int R = y82Var.R();
        if ((R & 128) != 0) {
            y82Var.J(2);
        }
        if ((R & 64) != 0) {
            y82Var.J(y82Var.R());
        }
        if ((R & 32) != 0) {
            y82Var.J(2);
        }
        y82Var.J(1);
        s(y82Var);
        String f8 = th.f(y82Var.R());
        if ("audio/mpeg".equals(f8) || "audio/vnd.dts".equals(f8) || "audio/vnd.dts.hd".equals(f8)) {
            return new n7(f8, null, -1L, -1L);
        }
        y82Var.J(4);
        long Y = y82Var.Y();
        long Y2 = y82Var.Y();
        y82Var.J(1);
        int s7 = s(y82Var);
        long j7 = Y2;
        byte[] bArr = new byte[s7];
        y82Var.L(bArr, 0, s7);
        if (j7 <= 0) {
            j7 = -1;
        }
        return new n7(f8, bArr, j7, Y > 0 ? Y : -1L);
    }

    private static k7 q(y82 y82Var, int i7) {
        y82Var.G(i7 + 8);
        y82Var.J(4);
        return new k7(y82Var.Y(), y82Var.Y());
    }

    private static Pair r(y82 y82Var, int i7, int i8) {
        Integer num;
        q8 q8Var;
        Pair create;
        int i9;
        int i10;
        Integer num2;
        boolean z7;
        int F = y82Var.F();
        while (F - i7 < i8) {
            y82Var.G(F);
            int b8 = y82Var.b();
            q2.a(b8 > 0, "childAtomSize must be positive");
            if (y82Var.b() == 1936289382) {
                int i11 = F + 8;
                int i12 = 0;
                int i13 = -1;
                Integer num3 = null;
                String str = null;
                while (i11 - F < b8) {
                    y82Var.G(i11);
                    int b9 = y82Var.b();
                    int b10 = y82Var.b();
                    if (b10 == 1718775137) {
                        num3 = Integer.valueOf(y82Var.b());
                    } else if (b10 == 1935894637) {
                        y82Var.J(4);
                        str = y82Var.k(4, StandardCharsets.UTF_8);
                    } else if (b10 == 1935894633) {
                        i13 = i11;
                        i12 = b9;
                    }
                    i11 += b9;
                }
                byte[] bArr = null;
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    q2.a(num3 != null, "frma atom is mandatory");
                    q2.a(i13 != -1, "schi atom is mandatory");
                    int i14 = i13 + 8;
                    while (true) {
                        if (i14 - i13 >= i12) {
                            num = num3;
                            q8Var = null;
                            break;
                        }
                        y82Var.G(i14);
                        int b11 = y82Var.b();
                        if (y82Var.b() == 1952804451) {
                            int a8 = a(y82Var.b());
                            y82Var.J(1);
                            if (a8 == 0) {
                                y82Var.J(1);
                                i10 = 0;
                                i9 = 0;
                            } else {
                                int R = y82Var.R();
                                i9 = R & 15;
                                i10 = (R & 240) >> 4;
                            }
                            if (y82Var.R() == 1) {
                                num2 = num3;
                                z7 = true;
                            } else {
                                num2 = num3;
                                z7 = false;
                            }
                            int R2 = y82Var.R();
                            byte[] bArr2 = new byte[16];
                            y82Var.L(bArr2, 0, 16);
                            if (z7 && R2 == 0) {
                                int R3 = y82Var.R();
                                byte[] bArr3 = new byte[R3];
                                y82Var.L(bArr3, 0, R3);
                                bArr = bArr3;
                            }
                            num = num2;
                            q8Var = new q8(z7, str, R2, bArr2, i10, i9, bArr);
                        } else {
                            i14 += b11;
                        }
                    }
                    q2.a(q8Var != null, "tenc atom is mandatory");
                    String str2 = hi2.f9535a;
                    create = Pair.create(num, q8Var);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            F += b8;
        }
        return null;
    }

    private static int s(y82 y82Var) {
        int R = y82Var.R();
        int i7 = R & 127;
        while ((R & 128) == 128) {
            R = y82Var.R();
            i7 = (i7 << 7) | (R & 127);
        }
        return i7;
    }
}
