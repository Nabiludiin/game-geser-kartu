package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
public final class z15 {

    /* renamed from: f, reason: collision with root package name */
    private static final z15 f19974f = new z15(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f19975a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f19976b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f19977c;

    /* renamed from: d, reason: collision with root package name */
    private int f19978d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19979e;

    private z15(int i7, int[] iArr, Object[] objArr, boolean z7) {
        this.f19978d = -1;
        this.f19975a = i7;
        this.f19976b = iArr;
        this.f19977c = objArr;
        this.f19979e = z7;
    }

    public static z15 a() {
        return f19974f;
    }

    static z15 b() {
        return new z15();
    }

    static z15 c(z15 z15Var, z15 z15Var2) {
        int i7 = z15Var.f19975a + z15Var2.f19975a;
        int[] copyOf = Arrays.copyOf(z15Var.f19976b, i7);
        System.arraycopy(z15Var2.f19976b, 0, copyOf, z15Var.f19975a, z15Var2.f19975a);
        Object[] copyOf2 = Arrays.copyOf(z15Var.f19977c, i7);
        System.arraycopy(z15Var2.f19977c, 0, copyOf2, z15Var.f19975a, z15Var2.f19975a);
        return new z15(i7, copyOf, copyOf2, true);
    }

    private final void l(int i7) {
        int[] iArr = this.f19976b;
        if (i7 > iArr.length) {
            int i8 = this.f19975a;
            int i9 = i8 + (i8 / 2);
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f19976b = Arrays.copyOf(iArr, i7);
            this.f19977c = Arrays.copyOf(this.f19977c, i7);
        }
    }

    public final void d() {
        if (this.f19979e) {
            this.f19979e = false;
        }
    }

    final void e() {
        if (!this.f19979e) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z15)) {
            return false;
        }
        z15 z15Var = (z15) obj;
        int i7 = this.f19975a;
        if (i7 == z15Var.f19975a) {
            int[] iArr = this.f19976b;
            int[] iArr2 = z15Var.f19976b;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    Object[] objArr = this.f19977c;
                    Object[] objArr2 = z15Var.f19977c;
                    int i9 = this.f19975a;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (objArr[i10].equals(objArr2[i10])) {
                        }
                    }
                    return true;
                }
                if (iArr[i8] != iArr2[i8]) {
                    break;
                }
                i8++;
            }
        }
        return false;
    }

    public final void f(n25 n25Var) {
        if (this.f19975a != 0) {
            for (int i7 = 0; i7 < this.f19975a; i7++) {
                int i8 = this.f19976b[i7];
                Object obj = this.f19977c[i7];
                int i9 = i8 & 7;
                int i10 = i8 >>> 3;
                if (i9 == 0) {
                    n25Var.e(i10, ((Long) obj).longValue());
                } else if (i9 == 1) {
                    n25Var.c(i10, ((Long) obj).longValue());
                } else if (i9 == 2) {
                    n25Var.H(i10, (qy4) obj);
                } else if (i9 == 3) {
                    n25Var.q(i10);
                    ((z15) obj).f(n25Var);
                    n25Var.s(i10);
                } else {
                    if (i9 != 5) {
                        throw new RuntimeException(new d05("Protocol message tag had invalid wire type."));
                    }
                    n25Var.b(i10, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int g() {
        int i7 = this.f19978d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f19975a; i9++) {
            int i10 = this.f19976b[i9] >>> 3;
            qy4 qy4Var = (qy4) this.f19977c[i9];
            int b8 = az4.b(8);
            int b9 = az4.b(16) + az4.b(i10);
            int b10 = az4.b(24);
            int h8 = qy4Var.h();
            i8 += b8 + b8 + b9 + b10 + az4.b(h8) + h8;
        }
        this.f19978d = i8;
        return i8;
    }

    public final int h() {
        int b8;
        int c8;
        int i7;
        int i8 = this.f19978d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f19975a; i10++) {
            int i11 = this.f19976b[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.f19977c[i10]).getClass();
                    i7 = az4.b(i12 << 3) + 8;
                } else if (i13 == 2) {
                    int i14 = i12 << 3;
                    qy4 qy4Var = (qy4) this.f19977c[i10];
                    int b9 = az4.b(i14);
                    int h8 = qy4Var.h();
                    i7 = b9 + az4.b(h8) + h8;
                } else if (i13 == 3) {
                    int b10 = az4.b(i12 << 3);
                    b8 = b10 + b10;
                    c8 = ((z15) this.f19977c[i10]).h();
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(new d05("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f19977c[i10]).getClass();
                    i7 = az4.b(i12 << 3) + 4;
                }
                i9 += i7;
            } else {
                int i15 = i12 << 3;
                long longValue = ((Long) this.f19977c[i10]).longValue();
                b8 = az4.b(i15);
                c8 = az4.c(longValue);
            }
            i7 = b8 + c8;
            i9 += i7;
        }
        this.f19978d = i9;
        return i9;
    }

    public final int hashCode() {
        int i7 = this.f19975a;
        int i8 = i7 + 527;
        int[] iArr = this.f19976b;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = ((i8 * 31) + i10) * 31;
        Object[] objArr = this.f19977c;
        int i13 = this.f19975a;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }

    final void i(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.f19975a; i8++) {
            y05.b(sb, i7, String.valueOf(this.f19976b[i8] >>> 3), this.f19977c[i8]);
        }
    }

    final void j(int i7, Object obj) {
        e();
        l(this.f19975a + 1);
        int[] iArr = this.f19976b;
        int i8 = this.f19975a;
        iArr[i8] = i7;
        this.f19977c[i8] = obj;
        this.f19975a = i8 + 1;
    }

    final z15 k(z15 z15Var) {
        if (z15Var.equals(f19974f)) {
            return this;
        }
        e();
        int i7 = this.f19975a + z15Var.f19975a;
        l(i7);
        System.arraycopy(z15Var.f19976b, 0, this.f19976b, this.f19975a, z15Var.f19975a);
        System.arraycopy(z15Var.f19977c, 0, this.f19977c, this.f19975a, z15Var.f19975a);
        this.f19975a = i7;
        return this;
    }

    private z15() {
        this(0, new int[8], new Object[8], true);
    }
}
