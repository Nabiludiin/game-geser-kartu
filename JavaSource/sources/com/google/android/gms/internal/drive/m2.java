package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.l0;
import java.util.Arrays;

public final class m2 {

    /* renamed from: f, reason: collision with root package name */
    private static final m2 f20679f = new m2(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f20680a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f20681b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f20682c;

    /* renamed from: d, reason: collision with root package name */
    private int f20683d = -1;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20684e;

    private m2(int i7, int[] iArr, Object[] objArr, boolean z7) {
        this.f20680a = i7;
        this.f20681b = iArr;
        this.f20682c = objArr;
        this.f20684e = z7;
    }

    static m2 a(m2 m2Var, m2 m2Var2) {
        int i7 = m2Var.f20680a + m2Var2.f20680a;
        int[] copyOf = Arrays.copyOf(m2Var.f20681b, i7);
        System.arraycopy(m2Var2.f20681b, 0, copyOf, m2Var.f20680a, m2Var2.f20680a);
        Object[] copyOf2 = Arrays.copyOf(m2Var.f20682c, i7);
        System.arraycopy(m2Var2.f20682c, 0, copyOf2, m2Var.f20680a, m2Var2.f20680a);
        return new m2(i7, copyOf, copyOf2, true);
    }

    private static void d(int i7, Object obj, f3 f3Var) {
        int i8 = i7 >>> 3;
        int i9 = i7 & 7;
        if (i9 == 0) {
            f3Var.z(i8, ((Long) obj).longValue());
            return;
        }
        if (i9 == 1) {
            f3Var.e(i8, ((Long) obj).longValue());
            return;
        }
        if (i9 == 2) {
            f3Var.K(i8, (i) obj);
            return;
        }
        if (i9 != 3) {
            if (i9 != 5) {
                throw new RuntimeException(o0.c());
            }
            f3Var.I(i8, ((Integer) obj).intValue());
        } else if (f3Var.A() == l0.c.f20652l) {
            f3Var.C(i8);
            ((m2) obj).e(f3Var);
            f3Var.t(i8);
        } else {
            f3Var.t(i8);
            ((m2) obj).e(f3Var);
            f3Var.C(i8);
        }
    }

    public static m2 h() {
        return f20679f;
    }

    final void b(f3 f3Var) {
        if (f3Var.A() == l0.c.f20653m) {
            for (int i7 = this.f20680a - 1; i7 >= 0; i7--) {
                f3Var.w(this.f20681b[i7] >>> 3, this.f20682c[i7]);
            }
            return;
        }
        for (int i8 = 0; i8 < this.f20680a; i8++) {
            f3Var.w(this.f20681b[i8] >>> 3, this.f20682c[i8]);
        }
    }

    final void c(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.f20680a; i8++) {
            l1.c(sb, i7, String.valueOf(this.f20681b[i8] >>> 3), this.f20682c[i8]);
        }
    }

    public final void e(f3 f3Var) {
        if (this.f20680a == 0) {
            return;
        }
        if (f3Var.A() == l0.c.f20652l) {
            for (int i7 = 0; i7 < this.f20680a; i7++) {
                d(this.f20681b[i7], this.f20682c[i7], f3Var);
            }
            return;
        }
        for (int i8 = this.f20680a - 1; i8 >= 0; i8--) {
            d(this.f20681b[i8], this.f20682c[i8], f3Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        int i7 = this.f20680a;
        if (i7 == m2Var.f20680a) {
            int[] iArr = this.f20681b;
            int[] iArr2 = m2Var.f20681b;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    Object[] objArr = this.f20682c;
                    Object[] objArr2 = m2Var.f20682c;
                    int i9 = this.f20680a;
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

    public final void f() {
        this.f20684e = false;
    }

    public final int g() {
        int b02;
        int i7 = this.f20683d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f20680a; i9++) {
            int i10 = this.f20681b[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 == 0) {
                b02 = w.b0(i11, ((Long) this.f20682c[i9]).longValue());
            } else if (i12 == 1) {
                b02 = w.g0(i11, ((Long) this.f20682c[i9]).longValue());
            } else if (i12 == 2) {
                b02 = w.K(i11, (i) this.f20682c[i9]);
            } else if (i12 == 3) {
                b02 = (w.o(i11) << 1) + ((m2) this.f20682c[i9]).g();
            } else {
                if (i12 != 5) {
                    throw new IllegalStateException(o0.c());
                }
                b02 = w.k0(i11, ((Integer) this.f20682c[i9]).intValue());
            }
            i8 += b02;
        }
        this.f20683d = i8;
        return i8;
    }

    public final int hashCode() {
        int i7 = this.f20680a;
        int i8 = (i7 + 527) * 31;
        int[] iArr = this.f20681b;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = (i8 + i10) * 31;
        Object[] objArr = this.f20682c;
        int i13 = this.f20680a;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }

    public final int i() {
        int i7 = this.f20683d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f20680a; i9++) {
            i8 += w.X(this.f20681b[i9] >>> 3, (i) this.f20682c[i9]);
        }
        this.f20683d = i8;
        return i8;
    }
}
