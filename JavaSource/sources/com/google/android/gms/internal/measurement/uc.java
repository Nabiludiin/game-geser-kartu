package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* compiled from: MyApplication */
public final class uc {

    /* renamed from: f, reason: collision with root package name */
    private static final uc f21400f = new uc(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f21401a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f21402b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f21403c;

    /* renamed from: d, reason: collision with root package name */
    private int f21404d = -1;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21405e;

    private uc(int i7, int[] iArr, Object[] objArr, boolean z7) {
        this.f21401a = i7;
        this.f21402b = iArr;
        this.f21403c = objArr;
        this.f21405e = z7;
    }

    public static uc a() {
        return f21400f;
    }

    static uc b() {
        return new uc(0, new int[8], new Object[8], true);
    }

    static uc c(uc ucVar, uc ucVar2) {
        int i7 = ucVar.f21401a + ucVar2.f21401a;
        int[] copyOf = Arrays.copyOf(ucVar.f21402b, i7);
        System.arraycopy(ucVar2.f21402b, 0, copyOf, ucVar.f21401a, ucVar2.f21401a);
        Object[] copyOf2 = Arrays.copyOf(ucVar.f21403c, i7);
        System.arraycopy(ucVar2.f21403c, 0, copyOf2, ucVar.f21401a, ucVar2.f21401a);
        return new uc(i7, copyOf, copyOf2, true);
    }

    private final void l(int i7) {
        int[] iArr = this.f21402b;
        if (i7 > iArr.length) {
            int i8 = this.f21401a;
            int i9 = i8 + (i8 / 2);
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f21402b = Arrays.copyOf(iArr, i7);
            this.f21403c = Arrays.copyOf(this.f21403c, i7);
        }
    }

    public final void d() {
        if (this.f21405e) {
            this.f21405e = false;
        }
    }

    final void e() {
        if (!this.f21405e) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof uc)) {
            return false;
        }
        uc ucVar = (uc) obj;
        int i7 = this.f21401a;
        if (i7 == ucVar.f21401a) {
            int[] iArr = this.f21402b;
            int[] iArr2 = ucVar.f21402b;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    Object[] objArr = this.f21403c;
                    Object[] objArr2 = ucVar.f21403c;
                    int i9 = this.f21401a;
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

    public final void f(gd gdVar) {
        if (this.f21401a != 0) {
            for (int i7 = 0; i7 < this.f21401a; i7++) {
                int i8 = this.f21402b[i7];
                Object obj = this.f21403c[i7];
                int i9 = i8 & 7;
                int i10 = i8 >>> 3;
                if (i9 == 0) {
                    gdVar.e(i10, ((Long) obj).longValue());
                } else if (i9 == 1) {
                    gdVar.c(i10, ((Long) obj).longValue());
                } else if (i9 == 2) {
                    gdVar.G(i10, (ca) obj);
                } else if (i9 == 3) {
                    gdVar.q(i10);
                    ((uc) obj).f(gdVar);
                    gdVar.s(i10);
                } else {
                    if (i9 != 5) {
                        throw new RuntimeException(new fb("Protocol message tag had invalid wire type."));
                    }
                    gdVar.b(i10, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int g() {
        int i7 = this.f21404d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f21401a; i9++) {
            int i10 = this.f21402b[i9] >>> 3;
            ca caVar = (ca) this.f21403c[i9];
            int E = ha.E(8);
            int E2 = ha.E(16) + ha.E(i10);
            int E3 = ha.E(24);
            int g8 = caVar.g();
            i8 += E + E + E2 + E3 + ha.E(g8) + g8;
        }
        this.f21404d = i8;
        return i8;
    }

    public final int h() {
        int E;
        int a8;
        int i7;
        int i8 = this.f21404d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f21401a; i10++) {
            int i11 = this.f21402b[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.f21403c[i10]).getClass();
                    i7 = ha.E(i12 << 3) + 8;
                } else if (i13 == 2) {
                    int i14 = i12 << 3;
                    ca caVar = (ca) this.f21403c[i10];
                    int E2 = ha.E(i14);
                    int g8 = caVar.g();
                    i7 = E2 + ha.E(g8) + g8;
                } else if (i13 == 3) {
                    int E3 = ha.E(i12 << 3);
                    E = E3 + E3;
                    a8 = ((uc) this.f21403c[i10]).h();
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(new fb("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f21403c[i10]).getClass();
                    i7 = ha.E(i12 << 3) + 4;
                }
                i9 += i7;
            } else {
                int i15 = i12 << 3;
                long longValue = ((Long) this.f21403c[i10]).longValue();
                E = ha.E(i15);
                a8 = ha.a(longValue);
            }
            i7 = E + a8;
            i9 += i7;
        }
        this.f21404d = i9;
        return i9;
    }

    public final int hashCode() {
        int i7 = this.f21401a;
        int i8 = i7 + 527;
        int[] iArr = this.f21402b;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = ((i8 * 31) + i10) * 31;
        Object[] objArr = this.f21403c;
        int i13 = this.f21401a;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }

    final void i(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.f21401a; i8++) {
            zb.b(sb, i7, String.valueOf(this.f21402b[i8] >>> 3), this.f21403c[i8]);
        }
    }

    final void j(int i7, Object obj) {
        e();
        l(this.f21401a + 1);
        int[] iArr = this.f21402b;
        int i8 = this.f21401a;
        iArr[i8] = i7;
        this.f21403c[i8] = obj;
        this.f21401a = i8 + 1;
    }

    final uc k(uc ucVar) {
        if (ucVar.equals(f21400f)) {
            return this;
        }
        e();
        int i7 = this.f21401a + ucVar.f21401a;
        l(i7);
        System.arraycopy(ucVar.f21402b, 0, this.f21402b, this.f21401a, ucVar.f21401a);
        System.arraycopy(ucVar.f21403c, 0, this.f21403c, this.f21401a, ucVar.f21401a);
        this.f21401a = i7;
        return this;
    }
}
