package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* compiled from: MyApplication */
public final class q5 {

    /* renamed from: f, reason: collision with root package name */
    private static final q5 f21715f = new q5(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f21716a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f21717b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f21718c;

    /* renamed from: d, reason: collision with root package name */
    private int f21719d = -1;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21720e;

    private q5(int i7, int[] iArr, Object[] objArr, boolean z7) {
        this.f21716a = i7;
        this.f21717b = iArr;
        this.f21718c = objArr;
        this.f21720e = z7;
    }

    public static q5 c() {
        return f21715f;
    }

    static q5 e(q5 q5Var, q5 q5Var2) {
        int i7 = q5Var.f21716a + q5Var2.f21716a;
        int[] copyOf = Arrays.copyOf(q5Var.f21717b, i7);
        System.arraycopy(q5Var2.f21717b, 0, copyOf, q5Var.f21716a, q5Var2.f21716a);
        Object[] copyOf2 = Arrays.copyOf(q5Var.f21718c, i7);
        System.arraycopy(q5Var2.f21718c, 0, copyOf2, q5Var.f21716a, q5Var2.f21716a);
        return new q5(i7, copyOf, copyOf2, true);
    }

    static q5 f() {
        return new q5(0, new int[8], new Object[8], true);
    }

    private final void l(int i7) {
        int[] iArr = this.f21717b;
        if (i7 > iArr.length) {
            int i8 = this.f21716a;
            int i9 = i8 + (i8 / 2);
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f21717b = Arrays.copyOf(iArr, i7);
            this.f21718c = Arrays.copyOf(this.f21718c, i7);
        }
    }

    public final int a() {
        int c8;
        int d8;
        int i7;
        int i8 = this.f21719d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f21716a; i10++) {
            int i11 = this.f21717b[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.f21718c[i10]).getClass();
                    i7 = p3.c(i12 << 3) + 8;
                } else if (i13 == 2) {
                    int i14 = i12 << 3;
                    i3 i3Var = (i3) this.f21718c[i10];
                    int c9 = p3.c(i14);
                    int g8 = i3Var.g();
                    i7 = c9 + p3.c(g8) + g8;
                } else if (i13 == 3) {
                    int c10 = p3.c(i12 << 3);
                    c8 = c10 + c10;
                    d8 = ((q5) this.f21718c[i10]).a();
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(new k4("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f21718c[i10]).getClass();
                    i7 = p3.c(i12 << 3) + 4;
                }
                i9 += i7;
            } else {
                int i15 = i12 << 3;
                long longValue = ((Long) this.f21718c[i10]).longValue();
                c8 = p3.c(i15);
                d8 = p3.d(longValue);
            }
            i7 = c8 + d8;
            i9 += i7;
        }
        this.f21719d = i9;
        return i9;
    }

    public final int b() {
        int i7 = this.f21719d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f21716a; i9++) {
            int i10 = this.f21717b[i9] >>> 3;
            i3 i3Var = (i3) this.f21718c[i9];
            int c8 = p3.c(8);
            int c9 = p3.c(16) + p3.c(i10);
            int c10 = p3.c(24);
            int g8 = i3Var.g();
            i8 += c8 + c8 + c9 + c10 + p3.c(g8) + g8;
        }
        this.f21719d = i8;
        return i8;
    }

    final q5 d(q5 q5Var) {
        if (q5Var.equals(f21715f)) {
            return this;
        }
        g();
        int i7 = this.f21716a + q5Var.f21716a;
        l(i7);
        System.arraycopy(q5Var.f21717b, 0, this.f21717b, this.f21716a, q5Var.f21716a);
        System.arraycopy(q5Var.f21718c, 0, this.f21718c, this.f21716a, q5Var.f21716a);
        this.f21716a = i7;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof q5)) {
            return false;
        }
        q5 q5Var = (q5) obj;
        int i7 = this.f21716a;
        if (i7 == q5Var.f21716a) {
            int[] iArr = this.f21717b;
            int[] iArr2 = q5Var.f21717b;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    Object[] objArr = this.f21718c;
                    Object[] objArr2 = q5Var.f21718c;
                    int i9 = this.f21716a;
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

    final void g() {
        if (!this.f21720e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f21720e) {
            this.f21720e = false;
        }
    }

    public final int hashCode() {
        int i7 = this.f21716a;
        int i8 = i7 + 527;
        int[] iArr = this.f21717b;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = ((i8 * 31) + i10) * 31;
        Object[] objArr = this.f21718c;
        int i13 = this.f21716a;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }

    final void i(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.f21716a; i8++) {
            b5.b(sb, i7, String.valueOf(this.f21717b[i8] >>> 3), this.f21718c[i8]);
        }
    }

    final void j(int i7, Object obj) {
        g();
        l(this.f21716a + 1);
        int[] iArr = this.f21717b;
        int i8 = this.f21716a;
        iArr[i8] = i7;
        this.f21718c[i8] = obj;
        this.f21716a = i8 + 1;
    }

    public final void k(a6 a6Var) {
        if (this.f21716a != 0) {
            for (int i7 = 0; i7 < this.f21716a; i7++) {
                int i8 = this.f21717b[i7];
                Object obj = this.f21718c[i7];
                int i9 = i8 & 7;
                int i10 = i8 >>> 3;
                if (i9 == 0) {
                    a6Var.u(i10, ((Long) obj).longValue());
                } else if (i9 == 1) {
                    a6Var.G(i10, ((Long) obj).longValue());
                } else if (i9 == 2) {
                    a6Var.t(i10, (i3) obj);
                } else if (i9 == 3) {
                    a6Var.J(i10);
                    ((q5) obj).k(a6Var);
                    a6Var.F(i10);
                } else {
                    if (i9 != 5) {
                        throw new RuntimeException(new k4("Protocol message tag had invalid wire type."));
                    }
                    a6Var.b(i10, ((Integer) obj).intValue());
                }
            }
        }
    }
}
