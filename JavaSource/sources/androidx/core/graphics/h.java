package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: MyApplication */
public abstract class h {

    /* compiled from: MyApplication */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        int f1716a;

        /* renamed from: b, reason: collision with root package name */
        boolean f1717b;

        a() {
        }
    }

    private static void a(ArrayList arrayList, char c8, float[] fArr) {
        arrayList.add(new b(c8, fArr));
    }

    public static boolean b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i7 = 0; i7 < bVarArr.length; i7++) {
            b bVar = bVarArr[i7];
            char c8 = bVar.f1718a;
            b bVar2 = bVarArr2[i7];
            if (c8 != bVar2.f1718a || bVar.f1719b.length != bVar2.f1719b.length) {
                return false;
            }
        }
        return true;
    }

    static float[] c(float[] fArr, int i7, int i8) {
        if (i7 > i8) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i7 < 0 || i7 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i9 = i8 - i7;
        int min = Math.min(i9, length - i7);
        float[] fArr2 = new float[i9];
        System.arraycopy(fArr, i7, fArr2, 0, min);
        return fArr2;
    }

    public static b[] d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i7 = 1;
        int i8 = 0;
        while (i7 < str.length()) {
            int i9 = i(str, i7);
            String trim = str.substring(i8, i9).trim();
            if (trim.length() > 0) {
                a(arrayList, trim.charAt(0), h(trim));
            }
            i8 = i9;
            i7 = i9 + 1;
        }
        if (i7 - i8 == 1 && i8 < str.length()) {
            a(arrayList, str.charAt(i8), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    public static Path e(String str) {
        Path path = new Path();
        b[] d8 = d(str);
        if (d8 == null) {
            return null;
        }
        try {
            b.e(d8, path);
            return path;
        } catch (RuntimeException e8) {
            throw new RuntimeException("Error in parsing " + str, e8);
        }
    }

    public static b[] f(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i7 = 0; i7 < bVarArr.length; i7++) {
            bVarArr2[i7] = new b(bVarArr[i7]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039 A[LOOP:0: B:2:0x0007->B:14:0x0039, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(java.lang.String r8, int r9, androidx.core.graphics.h.a r10) {
        /*
            r0 = 0
            r10.f1717b = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3c
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L29
            r6 = 69
            if (r5 == r6) goto L35
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L35
            switch(r5) {
                case 44: goto L29;
                case 45: goto L2c;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L33
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L36
        L27:
            r10.f1717b = r7
        L29:
            r2 = r0
            r4 = r7
            goto L36
        L2c:
            if (r1 == r9) goto L33
            if (r2 != 0) goto L33
            r10.f1717b = r7
            goto L29
        L33:
            r2 = r0
            goto L36
        L35:
            r2 = r7
        L36:
            if (r4 == 0) goto L39
            goto L3c
        L39:
            int r1 = r1 + 1
            goto L7
        L3c:
            r10.f1716a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.h.g(java.lang.String, int, androidx.core.graphics.h$a):void");
    }

    private static float[] h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i7 = 1;
            int i8 = 0;
            while (i7 < length) {
                g(str, i7, aVar);
                int i9 = aVar.f1716a;
                if (i7 < i9) {
                    fArr[i8] = Float.parseFloat(str.substring(i7, i9));
                    i8++;
                }
                i7 = aVar.f1717b ? i9 : i9 + 1;
            }
            return c(fArr, 0, i8);
        } catch (NumberFormatException e8) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e8);
        }
    }

    private static int i(String str, int i7) {
        while (i7 < str.length()) {
            char charAt = str.charAt(i7);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                break;
            }
            i7++;
        }
        return i7;
    }

    public static void j(b[] bVarArr, b[] bVarArr2) {
        for (int i7 = 0; i7 < bVarArr2.length; i7++) {
            bVarArr[i7].f1718a = bVarArr2[i7].f1718a;
            int i8 = 0;
            while (true) {
                float[] fArr = bVarArr2[i7].f1719b;
                if (i8 < fArr.length) {
                    bVarArr[i7].f1719b[i8] = fArr[i8];
                    i8++;
                }
            }
        }
    }

    /* compiled from: MyApplication */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public char f1718a;

        /* renamed from: b, reason: collision with root package name */
        public float[] f1719b;

        b(char c8, float[] fArr) {
            this.f1718a = c8;
            this.f1719b = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private static void a(Path path, float[] fArr, char c8, char c9, float[] fArr2) {
            int i7;
            int i8;
            boolean z7;
            boolean z8;
            char c10;
            char c11;
            int i9;
            float f8;
            boolean z9;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            boolean z10;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            Path path2 = path;
            boolean z11 = false;
            float f24 = fArr[0];
            boolean z12 = true;
            float f25 = fArr[1];
            char c12 = 2;
            float f26 = fArr[2];
            char c13 = 3;
            float f27 = fArr[3];
            float f28 = fArr[4];
            float f29 = fArr[5];
            switch (c9) {
                case 'A':
                case 'a':
                    i7 = 7;
                    i8 = i7;
                    break;
                case 'C':
                case 'c':
                    i7 = 6;
                    i8 = i7;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i8 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i8 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i8 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f28, f29);
                    f24 = f28;
                    f26 = f24;
                    f25 = f29;
                    f27 = f25;
                    i8 = 2;
                    break;
            }
            float f30 = f24;
            float f31 = f25;
            float f32 = f28;
            float f33 = f29;
            int i10 = 0;
            char c14 = c8;
            while (i10 < fArr2.length) {
                if (c9 == 'A') {
                    float f34 = f30;
                    float f35 = f31;
                    z7 = z11;
                    z8 = z12;
                    c10 = c12;
                    c11 = c13;
                    i9 = i10;
                    int i11 = i9 + 5;
                    float f36 = fArr2[i11];
                    int i12 = i9 + 6;
                    float f37 = fArr2[i12];
                    float f38 = fArr2[i9];
                    float f39 = fArr2[i9 + 1];
                    float f40 = fArr2[i9 + 2];
                    if (fArr2[i9 + 3] != 0.0f) {
                        f8 = 0.0f;
                        z9 = z8;
                    } else {
                        f8 = 0.0f;
                        z9 = z7;
                    }
                    c(path, f34, f35, f36, f37, f38, f39, f40, z9, fArr2[i9 + 4] != f8 ? z8 : z7);
                    f26 = fArr2[i11];
                    f30 = f26;
                    f27 = fArr2[i12];
                    f31 = f27;
                } else if (c9 == 'C') {
                    z7 = z11;
                    z8 = z12;
                    c10 = c12;
                    c11 = c13;
                    i9 = i10;
                    int i13 = i9 + 2;
                    int i14 = i9 + 3;
                    int i15 = i9 + 4;
                    int i16 = i9 + 5;
                    path2.cubicTo(fArr2[i9], fArr2[i9 + 1], fArr2[i13], fArr2[i14], fArr2[i15], fArr2[i16]);
                    float f41 = fArr2[i15];
                    float f42 = fArr2[i16];
                    float f43 = fArr2[i13];
                    float f44 = fArr2[i14];
                    f30 = f41;
                    f31 = f42;
                    f27 = f44;
                    f26 = f43;
                } else if (c9 != 'H') {
                    if (c9 != 'Q') {
                        z7 = z11;
                        if (c9 == 'V') {
                            z8 = z12;
                            c10 = c12;
                            c11 = c13;
                            i9 = i10;
                            path2.lineTo(f30, fArr2[i9]);
                            f11 = fArr2[i9];
                        } else if (c9 != 'a') {
                            if (c9 != 'c') {
                                z8 = z12;
                                if (c9 != 'h') {
                                    if (c9 != 'q') {
                                        c10 = c12;
                                        if (c9 != 'v') {
                                            if (c9 != 'L') {
                                                if (c9 != 'M') {
                                                    c11 = c13;
                                                    if (c9 == 'S') {
                                                        if (c14 == 'c' || c14 == 's' || c14 == 'C' || c14 == 'S') {
                                                            f30 = (f30 * 2.0f) - f26;
                                                            f31 = (f31 * 2.0f) - f27;
                                                        }
                                                        float f45 = f30;
                                                        float f46 = f31;
                                                        int i17 = i10 + 1;
                                                        int i18 = i10 + 2;
                                                        int i19 = i10 + 3;
                                                        path2.cubicTo(f45, f46, fArr2[i10], fArr2[i17], fArr2[i18], fArr2[i19]);
                                                        f9 = fArr2[i10];
                                                        f10 = fArr2[i17];
                                                        f30 = fArr2[i18];
                                                        f31 = fArr2[i19];
                                                        i9 = i10;
                                                    } else if (c9 == 'T') {
                                                        if (c14 == 'q' || c14 == 't' || c14 == 'Q' || c14 == 'T') {
                                                            f30 = (f30 * 2.0f) - f26;
                                                            f31 = (f31 * 2.0f) - f27;
                                                        }
                                                        int i20 = i10 + 1;
                                                        path2.quadTo(f30, f31, fArr2[i10], fArr2[i20]);
                                                        float f47 = fArr2[i10];
                                                        f11 = fArr2[i20];
                                                        f26 = f30;
                                                        f27 = f31;
                                                        i9 = i10;
                                                        f30 = f47;
                                                    } else if (c9 == 'l') {
                                                        int i21 = i10 + 1;
                                                        path2.rLineTo(fArr2[i10], fArr2[i21]);
                                                        f30 += fArr2[i10];
                                                        f17 = fArr2[i21];
                                                    } else if (c9 == 'm') {
                                                        float f48 = fArr2[i10];
                                                        f30 += f48;
                                                        float f49 = fArr2[i10 + 1];
                                                        f31 += f49;
                                                        if (i10 > 0) {
                                                            path2.rLineTo(f48, f49);
                                                        } else {
                                                            path2.rMoveTo(f48, f49);
                                                            f32 = f30;
                                                        }
                                                    } else if (c9 == 's') {
                                                        if (c14 == 'c' || c14 == 's' || c14 == 'C' || c14 == 'S') {
                                                            f20 = f31 - f27;
                                                            f21 = f30 - f26;
                                                        } else {
                                                            f21 = 0.0f;
                                                            f20 = 0.0f;
                                                        }
                                                        int i22 = i10 + 1;
                                                        int i23 = i10 + 2;
                                                        int i24 = i10 + 3;
                                                        path2.rCubicTo(f21, f20, fArr2[i10], fArr2[i22], fArr2[i23], fArr2[i24]);
                                                        f14 = fArr2[i10] + f30;
                                                        f15 = fArr2[i22] + f31;
                                                        f30 += fArr2[i23];
                                                        f16 = fArr2[i24];
                                                    } else if (c9 == 't') {
                                                        if (c14 == 'q' || c14 == 't' || c14 == 'Q' || c14 == 'T') {
                                                            f22 = f30 - f26;
                                                            f23 = f31 - f27;
                                                        } else {
                                                            f23 = 0.0f;
                                                            f22 = 0.0f;
                                                        }
                                                        int i25 = i10 + 1;
                                                        path2.rQuadTo(f22, f23, fArr2[i10], fArr2[i25]);
                                                        float f50 = f22 + f30;
                                                        float f51 = f23 + f31;
                                                        f30 += fArr2[i10];
                                                        f31 += fArr2[i25];
                                                        f27 = f51;
                                                        f26 = f50;
                                                    }
                                                } else {
                                                    c11 = c13;
                                                    f18 = fArr2[i10];
                                                    f19 = fArr2[i10 + 1];
                                                    if (i10 > 0) {
                                                        path2.lineTo(f18, f19);
                                                    } else {
                                                        path2.moveTo(f18, f19);
                                                        f30 = f18;
                                                        f32 = f30;
                                                        f31 = f19;
                                                    }
                                                }
                                                f33 = f31;
                                            } else {
                                                c11 = c13;
                                                int i26 = i10 + 1;
                                                path2.lineTo(fArr2[i10], fArr2[i26]);
                                                f18 = fArr2[i10];
                                                f19 = fArr2[i26];
                                            }
                                            f30 = f18;
                                            f31 = f19;
                                        } else {
                                            c11 = c13;
                                            path2.rLineTo(0.0f, fArr2[i10]);
                                            f17 = fArr2[i10];
                                        }
                                        f31 += f17;
                                    } else {
                                        c10 = c12;
                                        c11 = c13;
                                        int i27 = i10 + 1;
                                        int i28 = i10 + 2;
                                        int i29 = i10 + 3;
                                        path2.rQuadTo(fArr2[i10], fArr2[i27], fArr2[i28], fArr2[i29]);
                                        f14 = fArr2[i10] + f30;
                                        f15 = fArr2[i27] + f31;
                                        f30 += fArr2[i28];
                                        f16 = fArr2[i29];
                                    }
                                    f31 += f16;
                                    f26 = f14;
                                    f27 = f15;
                                } else {
                                    c10 = c12;
                                    c11 = c13;
                                    path2.rLineTo(fArr2[i10], 0.0f);
                                    f30 += fArr2[i10];
                                }
                            } else {
                                z8 = z12;
                                c10 = c12;
                                c11 = c13;
                                int i30 = i10 + 2;
                                int i31 = i10 + 3;
                                int i32 = i10 + 4;
                                int i33 = i10 + 5;
                                path2.rCubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i30], fArr2[i31], fArr2[i32], fArr2[i33]);
                                float f52 = fArr2[i30] + f30;
                                float f53 = fArr2[i31] + f31;
                                f30 += fArr2[i32];
                                f31 += fArr2[i33];
                                f26 = f52;
                                f27 = f53;
                            }
                            i9 = i10;
                        } else {
                            z8 = z12;
                            c10 = c12;
                            c11 = c13;
                            int i34 = i10 + 5;
                            float f54 = fArr2[i34] + f30;
                            int i35 = i10 + 6;
                            float f55 = fArr2[i35] + f31;
                            float f56 = fArr2[i10];
                            float f57 = fArr2[i10 + 1];
                            float f58 = fArr2[i10 + 2];
                            if (fArr2[i10 + 3] != 0.0f) {
                                f12 = 0.0f;
                                f13 = f31;
                                z10 = z8;
                            } else {
                                f12 = 0.0f;
                                f13 = f31;
                                z10 = z7;
                            }
                            i9 = i10;
                            boolean z13 = fArr2[i10 + 4] != f12 ? z8 : z7;
                            float f59 = f30;
                            c(path, f59, f13, f54, f55, f56, f57, f58, z10, z13);
                            f30 = f59 + fArr2[i34];
                            f31 = f13 + fArr2[i35];
                            f26 = f30;
                            f27 = f31;
                        }
                        f31 = f11;
                    } else {
                        z7 = z11;
                        z8 = z12;
                        c10 = c12;
                        c11 = c13;
                        i9 = i10;
                        int i36 = i9 + 1;
                        int i37 = i9 + 2;
                        int i38 = i9 + 3;
                        path2.quadTo(fArr2[i9], fArr2[i36], fArr2[i37], fArr2[i38]);
                        f9 = fArr2[i9];
                        f10 = fArr2[i36];
                        f30 = fArr2[i37];
                        f31 = fArr2[i38];
                    }
                    f26 = f9;
                    f27 = f10;
                } else {
                    z7 = z11;
                    z8 = z12;
                    c10 = c12;
                    c11 = c13;
                    i9 = i10;
                    path2.lineTo(fArr2[i9], f31);
                    f30 = fArr2[i9];
                }
                i10 = i9 + i8;
                path2 = path;
                c14 = c9;
                z11 = z7;
                z12 = z8;
                c12 = c10;
                c13 = c11;
            }
            fArr[z11 ? 1 : 0] = f30;
            fArr[z12 ? 1 : 0] = f31;
            fArr[c12] = f26;
            fArr[c13] = f27;
            fArr[4] = f32;
            fArr[5] = f33;
        }

        private static void b(Path path, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
            double d17 = d10;
            int ceil = (int) Math.ceil(Math.abs((d16 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d14);
            double sin = Math.sin(d14);
            double cos2 = Math.cos(d15);
            double sin2 = Math.sin(d15);
            double d18 = -d17;
            double d19 = d18 * cos;
            double d20 = d11 * sin;
            double d21 = (d19 * sin2) - (d20 * cos2);
            double d22 = d18 * sin;
            double d23 = d11 * cos;
            double d24 = (sin2 * d22) + (cos2 * d23);
            double d25 = d16 / ceil;
            double d26 = d24;
            double d27 = d21;
            int i7 = 0;
            double d28 = d12;
            double d29 = d13;
            double d30 = d15;
            while (i7 < ceil) {
                double d31 = d30 + d25;
                double sin3 = Math.sin(d31);
                double cos3 = Math.cos(d31);
                double d32 = (d8 + ((d17 * cos) * cos3)) - (d20 * sin3);
                int i8 = i7;
                double d33 = d9 + (d10 * sin * cos3) + (d23 * sin3);
                double d34 = (d19 * sin3) - (d20 * cos3);
                double d35 = (sin3 * d22) + (cos3 * d23);
                double d36 = d31 - d30;
                double tan = Math.tan(d36 / 2.0d);
                double sin4 = (Math.sin(d36) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                double d37 = d28 + (d27 * sin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d37, (float) (d29 + (d26 * sin4)), (float) (d32 - (sin4 * d34)), (float) (d33 - (sin4 * d35)), (float) d32, (float) d33);
                sin = sin;
                d25 = d25;
                d28 = d32;
                d22 = d22;
                d30 = d31;
                d26 = d35;
                cos = cos;
                d17 = d10;
                d29 = d33;
                i7 = i8 + 1;
                ceil = ceil;
                d27 = d34;
            }
        }

        private static void c(Path path, float f8, float f9, float f10, float f11, float f12, float f13, float f14, boolean z7, boolean z8) {
            double d8;
            double d9;
            double radians = Math.toRadians(f14);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d10 = f8;
            double d11 = f9;
            double d12 = f12;
            double d13 = ((d10 * cos) + (d11 * sin)) / d12;
            double d14 = f13;
            double d15 = (((-f8) * sin) + (d11 * cos)) / d14;
            double d16 = f11;
            double d17 = ((f10 * cos) + (d16 * sin)) / d12;
            double d18 = (((-f10) * sin) + (d16 * cos)) / d14;
            double d19 = d13 - d17;
            double d20 = d15 - d18;
            double d21 = (d13 + d17) / 2.0d;
            double d22 = (d15 + d18) / 2.0d;
            double d23 = (d19 * d19) + (d20 * d20);
            if (d23 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d24 = (1.0d / d23) - 0.25d;
            if (d24 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d23);
                float sqrt = (float) (Math.sqrt(d23) / 1.99999d);
                c(path, f8, f9, f10, f11, f12 * sqrt, sqrt * f13, f14, z7, z8);
                return;
            }
            double sqrt2 = Math.sqrt(d24);
            double d25 = d19 * sqrt2;
            double d26 = sqrt2 * d20;
            if (z7 == z8) {
                d8 = d21 - d26;
                d9 = d22 + d25;
            } else {
                d8 = d21 + d26;
                d9 = d22 - d25;
            }
            double atan2 = Math.atan2(d15 - d9, d13 - d8);
            double atan22 = Math.atan2(d18 - d9, d17 - d8) - atan2;
            if (z8 != (atan22 >= 0.0d)) {
                atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d27 = d8 * d12;
            double d28 = d9 * d14;
            b(path, (d27 * cos) - (d28 * sin), (d27 * sin) + (d28 * cos), d12, d14, d10, d11, radians, atan2, atan22);
        }

        public static void e(b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c8 = 'm';
            for (int i7 = 0; i7 < bVarArr.length; i7++) {
                b bVar = bVarArr[i7];
                a(path, fArr, c8, bVar.f1718a, bVar.f1719b);
                c8 = bVarArr[i7].f1718a;
            }
        }

        public void d(b bVar, b bVar2, float f8) {
            this.f1718a = bVar.f1718a;
            int i7 = 0;
            while (true) {
                float[] fArr = bVar.f1719b;
                if (i7 >= fArr.length) {
                    return;
                }
                this.f1719b[i7] = (fArr[i7] * (1.0f - f8)) + (bVar2.f1719b[i7] * f8);
                i7++;
            }
        }

        b(b bVar) {
            this.f1718a = bVar.f1718a;
            float[] fArr = bVar.f1719b;
            this.f1719b = h.c(fArr, 0, fArr.length);
        }
    }
}
