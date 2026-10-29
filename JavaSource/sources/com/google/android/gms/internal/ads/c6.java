package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: MyApplication */
public abstract class c6 {

    /* renamed from: a, reason: collision with root package name */
    public static final z5 f6269a = a6.f4766a;

    /* JADX WARN: Removed duplicated region for block: B:6:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.google.android.gms.internal.ads.le a(byte[] r11, int r12, com.google.android.gms.internal.ads.z5 r13, com.google.android.gms.internal.ads.n5 r14) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c6.a(byte[], int, com.google.android.gms.internal.ads.z5, com.google.android.gms.internal.ads.n5):com.google.android.gms.internal.ads.le");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean b(com.google.android.gms.internal.ads.y82 r21, int r22, int r23, boolean r24) {
        /*
            r1 = r21
            r0 = r22
            int r2 = r1.F()
        L8:
            int r3 = r1.C()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = r23
            if (r3 < r5) goto La7
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L25
            int r7 = r1.b()     // Catch: java.lang.Throwable -> L22
            long r8 = r1.Y()     // Catch: java.lang.Throwable -> L22
            int r10 = r1.S()     // Catch: java.lang.Throwable -> L22
            goto L2f
        L22:
            r0 = move-exception
            goto Lab
        L25:
            int r7 = r1.W()     // Catch: java.lang.Throwable -> L22
            int r8 = r1.W()     // Catch: java.lang.Throwable -> L22
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L22
            r10 = r6
        L2f:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            goto La7
        L3b:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r24 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
        L48:
            r4 = r6
            goto La7
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            r17 = 16
            long r17 = r8 >> r17
            r19 = 24
            long r8 = r8 >> r19
            long r15 = r15 & r11
            long r11 = r17 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L6b:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L72
            goto L73
        L72:
            r4 = r6
        L73:
            r3 = r10 & 1
            r20 = r4
            r4 = r3
            r3 = r20
            goto L8d
        L7b:
            if (r0 != r3) goto L8b
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = r4
            goto L84
        L83:
            r3 = r6
        L84:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L89
            goto L8d
        L89:
            r4 = r6
            goto L8d
        L8b:
            r3 = r6
            r4 = r3
        L8d:
            if (r4 == 0) goto L91
            int r3 = r3 + 4
        L91:
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L22
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L97
            goto L48
        L97:
            int r3 = r1.C()     // Catch: java.lang.Throwable -> L22
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L22
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La1
            goto L48
        La1:
            int r3 = (int) r8     // Catch: java.lang.Throwable -> L22
            r1.J(r3)     // Catch: java.lang.Throwable -> L22
            goto L8
        La7:
            r1.G(r2)
            return r4
        Lab:
            r1.G(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c6.b(com.google.android.gms.internal.ads.y82, int, int, boolean):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:80|(2:82|(1:88)(1:87))|89|90|(2:92|(4:110|111|112|(8:114|(8:119|120|(5:122|123|124|(1:126)|127)(2:130|(1:132)(1:133))|128|129|54|(0)|57)|134|135|(2:(1:(1:(2:214|129)(4:209|(1:211)|212|213))(11:178|(1:180)(1:201)|181|(1:183)|184|185|(4:188|(3:190|191|192)(1:194)|193|186)|195|196|(1:198)(1:200)|199))(8:153|(1:155)|156|(1:158)|159|(4:162|(3:164|165|166)(1:168)|167|160)|169|170)|171)(2:143|(2:145|75)(1:146))|54|(0)|57)(13:215|(1:(1:(0)))|134|135|(1:137)|(1:148)|(1:173)|(1:203)|214|129|54|(0)|57))(2:95|(7:99|100|101|102|54|(0)|57)(1:98)))|224|111|112|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0291, code lost:
    
        if (r9 == 67) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x02c9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x02cc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017e, code lost:
    
        r20 = r4;
        r22 = "Id3Decoder";
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0506  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.d6 c(int r33, com.google.android.gms.internal.ads.y82 r34, boolean r35, int r36, com.google.android.gms.internal.ads.z5 r37) {
        /*
            Method dump skipped, instructions count: 1357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c6.c(int, com.google.android.gms.internal.ads.y82, boolean, int, com.google.android.gms.internal.ads.z5):com.google.android.gms.internal.ads.d6");
    }

    private static w04 d(byte[] bArr, int i7, int i8) {
        if (i8 >= bArr.length) {
            return w04.n("");
        }
        int i9 = w04.f17978s;
        t04 t04Var = new t04();
        int h8 = h(bArr, i8, i7);
        while (i8 < h8) {
            t04Var.g(new String(bArr, i8, h8 - i8, f(i7)));
            i8 = j(i7) + h8;
            h8 = h(bArr, i8, i7);
        }
        w04 j7 = t04Var.j();
        return j7.isEmpty() ? w04.n("") : j7;
    }

    private static int e(y82 y82Var, int i7) {
        byte[] H = y82Var.H();
        int F = y82Var.F();
        int i8 = F;
        while (true) {
            int i9 = i8 + 1;
            if (i9 >= F + i7) {
                return i7;
            }
            if ((H[i8] & 255) == 255 && H[i9] == 0) {
                System.arraycopy(H, i8 + 2, H, i9, (i7 - (i8 - F)) - 2);
                i7--;
            }
            i8 = i9;
        }
    }

    private static Charset f(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    private static String g(int i7, int i8, int i9, int i10, int i11) {
        return i7 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    private static int h(byte[] bArr, int i7, int i8) {
        int i9 = i(bArr, i7);
        if (i8 == 0 || i8 == 3) {
            return i9;
        }
        while (true) {
            int length = bArr.length;
            if (i9 >= length - 1) {
                return length;
            }
            int i10 = i9 + 1;
            if ((i9 - i7) % 2 == 0 && bArr[i10] == 0) {
                return i9;
            }
            i9 = i(bArr, i10);
        }
    }

    private static int i(byte[] bArr, int i7) {
        while (true) {
            int length = bArr.length;
            if (i7 >= length) {
                return length;
            }
            if (bArr[i7] == 0) {
                return i7;
            }
            i7++;
        }
    }

    private static int j(int i7) {
        return (i7 == 0 || i7 == 3) ? 1 : 2;
    }

    private static byte[] k(byte[] bArr, int i7, int i8) {
        return i8 <= i7 ? hi2.f9536b : Arrays.copyOfRange(bArr, i7, i8);
    }

    private static String l(byte[] bArr, int i7, int i8, Charset charset) {
        return (i8 <= i7 || i8 > bArr.length) ? "" : new String(bArr, i7, i8 - i7, charset);
    }
}
