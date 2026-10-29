package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class b44 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5569a = 0;

    static {
        Math.log(2.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (java.lang.Math.abs(r8 - r2) == 0.5d) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long a(double r8, java.math.RoundingMode r10) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b44.a(double, java.math.RoundingMode):long");
    }

    public static boolean b(double d8) {
        if (d8 > 0.0d && c44.b(d8)) {
            long a8 = c44.a(d8);
            if ((a8 & ((-1) + a8)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(double r5, java.math.RoundingMode r7) {
        /*
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L10
            boolean r0 = com.google.android.gms.internal.ads.c44.b(r5)
            if (r0 == 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            java.lang.String r3 = "x must be positive and finite"
            com.google.android.gms.internal.ads.rx3.b(r0, r3)
            int r0 = java.lang.Math.getExponent(r5)
            int r3 = java.lang.Math.getExponent(r5)
            r4 = -1022(0xfffffffffffffc02, float:NaN)
            if (r3 < r4) goto L71
            int[] r3 = com.google.android.gms.internal.ads.a44.f4720a
            int r7 = r7.ordinal()
            r7 = r3[r7]
            switch(r7) {
                case 1: goto L69;
                case 2: goto L68;
                case 3: goto L5f;
                case 4: goto L57;
                case 5: goto L4d;
                case 6: goto L33;
                case 7: goto L33;
                case 8: goto L33;
                default: goto L2d;
            }
        L2d:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L33:
            long r5 = java.lang.Double.doubleToRawLongBits(r5)
            r3 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r5 = r5 & r3
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r5 = r5 | r3
            double r5 = java.lang.Double.longBitsToDouble(r5)
            double r5 = r5 * r5
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 <= 0) goto L65
            r1 = r2
            goto L65
        L4d:
            if (r0 < 0) goto L50
            r1 = r2
        L50:
            boolean r5 = b(r5)
        L54:
            r5 = r5 ^ r2
            r1 = r1 & r5
            goto L65
        L57:
            if (r0 >= 0) goto L5a
            r1 = r2
        L5a:
            boolean r5 = b(r5)
            goto L54
        L5f:
            boolean r5 = b(r5)
            r1 = r5 ^ 1
        L65:
            if (r1 == 0) goto L68
            int r0 = r0 + r2
        L68:
            return r0
        L69:
            boolean r5 = b(r5)
            com.google.android.gms.internal.ads.h44.b(r5)
            return r0
        L71:
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r5 = r5 * r0
            int r5 = c(r5, r7)
            int r5 = r5 + (-52)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b44.c(double, java.math.RoundingMode):int");
    }

    public static boolean d(double d8) {
        if (c44.b(d8)) {
            return d8 == 0.0d || 52 - Long.numberOfTrailingZeros(c44.a(d8)) <= Math.getExponent(d8);
        }
        return false;
    }
}
