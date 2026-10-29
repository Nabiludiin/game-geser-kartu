package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: MyApplication */
final class l34 {

    /* renamed from: a, reason: collision with root package name */
    private final String f11385a;

    /* renamed from: b, reason: collision with root package name */
    private final char[] f11386b;

    /* renamed from: c, reason: collision with root package name */
    final int f11387c;

    /* renamed from: d, reason: collision with root package name */
    final int f11388d;

    /* renamed from: e, reason: collision with root package name */
    final int f11389e;

    /* renamed from: f, reason: collision with root package name */
    final int f11390f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f11391g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f11392h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f11393i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    l34(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r0 = 128(0x80, float:1.8E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = r3
        La:
            int r5 = r11.length
            if (r4 >= r5) goto L2b
            char r5 = r11[r4]
            r6 = 1
            if (r5 >= r0) goto L14
            r7 = r6
            goto L15
        L14:
            r7 = r3
        L15:
            java.lang.String r8 = "Non-ASCII character: %s"
            com.google.android.gms.internal.ads.rx3.c(r7, r8, r5)
            r7 = r1[r5]
            if (r7 != r2) goto L1f
            goto L20
        L1f:
            r6 = r3
        L20:
            java.lang.String r7 = "Duplicate character: %s"
            com.google.android.gms.internal.ads.rx3.c(r6, r7, r5)
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto La
        L2b:
            r9.<init>(r10, r11, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l34.<init>(java.lang.String, char[]):void");
    }

    final char a(int i7) {
        return this.f11386b[i7];
    }

    final boolean b(int i7) {
        return this.f11392h[i7 % this.f11389e];
    }

    final int c(char c8) {
        if (c8 > 127) {
            throw new o34("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c8))));
        }
        byte b8 = this.f11391g[c8];
        if (b8 != -1) {
            return b8;
        }
        if (c8 <= ' ' || c8 == 127) {
            throw new o34("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c8))));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(c8).length() + 24);
        sb.append("Unrecognized character: ");
        sb.append(c8);
        throw new o34(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    final l34 d() {
        boolean z7;
        int i7 = 0;
        while (true) {
            char[] cArr = this.f11386b;
            int length = cArr.length;
            if (i7 >= length) {
                return this;
            }
            if (zw3.d(cArr[i7])) {
                int i8 = 0;
                while (true) {
                    if (i8 >= length) {
                        z7 = false;
                        break;
                    }
                    if (zw3.c(cArr[i8])) {
                        z7 = true;
                        break;
                    }
                    i8++;
                }
                rx3.i(!z7, "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr2 = new char[cArr.length];
                for (int i9 = 0; i9 < cArr.length; i9++) {
                    char c8 = cArr[i9];
                    if (zw3.d(c8)) {
                        c8 ^= 32;
                    }
                    cArr2[i9] = (char) c8;
                }
                l34 l34Var = new l34(this.f11385a.concat(".lowerCase()"), cArr2);
                if (!this.f11393i || l34Var.f11393i) {
                    return l34Var;
                }
                byte[] bArr = l34Var.f11391g;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                for (int i10 = 65; i10 <= 90; i10++) {
                    int i11 = i10 | 32;
                    byte b8 = bArr[i10];
                    byte b9 = bArr[i11];
                    if (b8 == -1) {
                        copyOf[i10] = b9;
                    } else {
                        char c9 = (char) i10;
                        char c10 = (char) i11;
                        if (b9 != -1) {
                            throw new IllegalStateException(iy3.d("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c9), Character.valueOf(c10)));
                        }
                        copyOf[i11] = b8;
                    }
                }
                return new l34(l34Var.f11385a.concat(".ignoreCase()"), l34Var.f11386b, copyOf, true);
            }
            i7++;
        }
    }

    public final boolean e(char c8) {
        byte[] bArr = this.f11391g;
        return bArr.length > 61 && bArr[61] != -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l34) {
            l34 l34Var = (l34) obj;
            if (this.f11393i == l34Var.f11393i && Arrays.equals(this.f11386b, l34Var.f11386b)) {
                return true;
            }
        }
        return false;
    }

    final /* synthetic */ char[] f() {
        return this.f11386b;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11386b) + (true != this.f11393i ? 1237 : 1231);
    }

    public final String toString() {
        return this.f11385a;
    }

    private l34(String str, char[] cArr, byte[] bArr, boolean z7) {
        this.f11385a = str;
        cArr.getClass();
        this.f11386b = cArr;
        try {
            int length = cArr.length;
            int a8 = e44.a(length, RoundingMode.UNNECESSARY);
            this.f11388d = a8;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(a8);
            int i7 = 1 << (3 - numberOfTrailingZeros);
            this.f11389e = i7;
            this.f11390f = a8 >> numberOfTrailingZeros;
            this.f11387c = length - 1;
            this.f11391g = bArr;
            boolean[] zArr = new boolean[i7];
            for (int i8 = 0; i8 < this.f11390f; i8++) {
                zArr[e44.b(i8 * 8, this.f11388d, RoundingMode.CEILING)] = true;
            }
            this.f11392h = zArr;
            this.f11393i = z7;
        } catch (ArithmeticException e8) {
            int length2 = cArr.length;
            StringBuilder sb = new StringBuilder(String.valueOf(length2).length() + 24);
            sb.append("Illegal alphabet length ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString(), e8);
        }
    }
}
