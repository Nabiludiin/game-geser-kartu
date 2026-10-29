package com.google.android.gms.internal.drive;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

final class m1 implements u1 {

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f20660r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    private static final Unsafe f20661s = r2.t();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f20662a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f20663b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20664c;

    /* renamed from: d, reason: collision with root package name */
    private final int f20665d;

    /* renamed from: e, reason: collision with root package name */
    private final i1 f20666e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f20667f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f20668g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f20669h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f20670i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f20671j;

    /* renamed from: k, reason: collision with root package name */
    private final int f20672k;

    /* renamed from: l, reason: collision with root package name */
    private final int f20673l;

    /* renamed from: m, reason: collision with root package name */
    private final o1 f20674m;

    /* renamed from: n, reason: collision with root package name */
    private final u0 f20675n;

    /* renamed from: o, reason: collision with root package name */
    private final l2 f20676o;

    /* renamed from: p, reason: collision with root package name */
    private final b0 f20677p;

    /* renamed from: q, reason: collision with root package name */
    private final d1 f20678q;

    private m1(int[] iArr, Object[] objArr, int i7, int i8, i1 i1Var, boolean z7, boolean z8, int[] iArr2, int i9, int i10, o1 o1Var, u0 u0Var, l2 l2Var, b0 b0Var, d1 d1Var) {
        this.f20662a = iArr;
        this.f20663b = objArr;
        this.f20664c = i7;
        this.f20665d = i8;
        this.f20668g = i1Var instanceof l0;
        this.f20669h = z7;
        this.f20667f = b0Var != null && b0Var.f(i1Var);
        this.f20670i = false;
        this.f20671j = iArr2;
        this.f20672k = i9;
        this.f20673l = i10;
        this.f20674m = o1Var;
        this.f20675n = u0Var;
        this.f20676o = l2Var;
        this.f20677p = b0Var;
        this.f20666e = i1Var;
        this.f20678q = d1Var;
    }

    private final boolean A(Object obj, Object obj2, int i7) {
        return o(obj, i7) == o(obj2, i7);
    }

    private static List B(Object obj, long j7) {
        return (List) r2.G(obj, j7);
    }

    private static double C(Object obj, long j7) {
        return ((Double) r2.G(obj, j7)).doubleValue();
    }

    private static float D(Object obj, long j7) {
        return ((Float) r2.G(obj, j7)).floatValue();
    }

    private static int E(Object obj, long j7) {
        return ((Integer) r2.G(obj, j7)).intValue();
    }

    private static long F(Object obj, long j7) {
        return ((Long) r2.G(obj, j7)).longValue();
    }

    private static boolean G(Object obj, long j7) {
        return ((Boolean) r2.G(obj, j7)).booleanValue();
    }

    private static int h(l2 l2Var, Object obj) {
        return l2Var.f(l2Var.g(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.drive.m1 i(java.lang.Class r34, com.google.android.gms.internal.drive.g1 r35, com.google.android.gms.internal.drive.o1 r36, com.google.android.gms.internal.drive.u0 r37, com.google.android.gms.internal.drive.l2 r38, com.google.android.gms.internal.drive.b0 r39, com.google.android.gms.internal.drive.d1 r40) {
        /*
            Method dump skipped, instructions count: 1091
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.m1.i(java.lang.Class, com.google.android.gms.internal.drive.g1, com.google.android.gms.internal.drive.o1, com.google.android.gms.internal.drive.u0, com.google.android.gms.internal.drive.l2, com.google.android.gms.internal.drive.b0, com.google.android.gms.internal.drive.d1):com.google.android.gms.internal.drive.m1");
    }

    private static Field j(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private static void k(int i7, Object obj, f3 f3Var) {
        if (obj instanceof String) {
            f3Var.m0(i7, (String) obj);
        } else {
            f3Var.K(i7, (i) obj);
        }
    }

    private static void l(l2 l2Var, Object obj, f3 f3Var) {
        l2Var.a(l2Var.g(obj), f3Var);
    }

    private final void m(f3 f3Var, int i7, Object obj, int i8) {
        if (obj != null) {
            this.f20678q.a(t(i8));
            f3Var.x(i7, null, this.f20678q.c(obj));
        }
    }

    private final void n(Object obj, Object obj2, int i7) {
        long u7 = u(i7) & 1048575;
        if (o(obj2, i7)) {
            Object G = r2.G(obj, u7);
            Object G2 = r2.G(obj2, u7);
            if (G != null && G2 != null) {
                r2.g(obj, u7, m0.c(G, G2));
                w(obj, i7);
            } else if (G2 != null) {
                r2.g(obj, u7, G2);
                w(obj, i7);
            }
        }
    }

    private final boolean o(Object obj, int i7) {
        if (!this.f20669h) {
            int v7 = v(i7);
            return (r2.A(obj, (long) (v7 & 1048575)) & (1 << (v7 >>> 20))) != 0;
        }
        int u7 = u(i7);
        long j7 = u7 & 1048575;
        switch ((u7 & 267386880) >>> 20) {
            case 0:
                return r2.F(obj, j7) != 0.0d;
            case 1:
                return r2.E(obj, j7) != 0.0f;
            case 2:
                return r2.B(obj, j7) != 0;
            case 3:
                return r2.B(obj, j7) != 0;
            case 4:
                return r2.A(obj, j7) != 0;
            case 5:
                return r2.B(obj, j7) != 0;
            case 6:
                return r2.A(obj, j7) != 0;
            case 7:
                return r2.D(obj, j7);
            case 8:
                Object G = r2.G(obj, j7);
                if (G instanceof String) {
                    return !((String) G).isEmpty();
                }
                if (G instanceof i) {
                    return !i.f20619r.equals(G);
                }
                throw new IllegalArgumentException();
            case 9:
                return r2.G(obj, j7) != null;
            case 10:
                return !i.f20619r.equals(r2.G(obj, j7));
            case 11:
                return r2.A(obj, j7) != 0;
            case 12:
                return r2.A(obj, j7) != 0;
            case 13:
                return r2.A(obj, j7) != 0;
            case 14:
                return r2.B(obj, j7) != 0;
            case 15:
                return r2.A(obj, j7) != 0;
            case 16:
                return r2.B(obj, j7) != 0;
            case 17:
                return r2.G(obj, j7) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean p(Object obj, int i7, int i8) {
        return r2.A(obj, (long) (v(i8) & 1048575)) == i7;
    }

    private final boolean q(Object obj, int i7, int i8, int i9) {
        return this.f20669h ? o(obj, i7) : (i8 & i9) != 0;
    }

    private static boolean r(Object obj, int i7, u1 u1Var) {
        return u1Var.e(r2.G(obj, i7 & 1048575));
    }

    private final u1 s(int i7) {
        int i8 = (i7 / 3) << 1;
        u1 u1Var = (u1) this.f20663b[i8];
        if (u1Var != null) {
            return u1Var;
        }
        u1 b8 = s1.a().b((Class) this.f20663b[i8 + 1]);
        this.f20663b[i8] = b8;
        return b8;
    }

    private final Object t(int i7) {
        return this.f20663b[(i7 / 3) << 1];
    }

    private final int u(int i7) {
        return this.f20662a[i7 + 1];
    }

    private final int v(int i7) {
        return this.f20662a[i7 + 2];
    }

    private final void w(Object obj, int i7) {
        if (this.f20669h) {
            return;
        }
        int v7 = v(i7);
        long j7 = v7 & 1048575;
        r2.e(obj, j7, r2.A(obj, j7) | (1 << (v7 >>> 20)));
    }

    private final void x(Object obj, int i7, int i8) {
        r2.e(obj, v(i8) & 1048575, i7);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:226:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void y(java.lang.Object r19, com.google.android.gms.internal.drive.f3 r20) {
        /*
            Method dump skipped, instructions count: 1350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.m1.y(java.lang.Object, com.google.android.gms.internal.drive.f3):void");
    }

    private final void z(Object obj, Object obj2, int i7) {
        int u7 = u(i7);
        int i8 = this.f20662a[i7];
        long j7 = u7 & 1048575;
        if (p(obj2, i8, i7)) {
            Object G = r2.G(obj, j7);
            Object G2 = r2.G(obj2, j7);
            if (G != null && G2 != null) {
                r2.g(obj, j7, m0.c(G, G2));
                x(obj, i8, i7);
            } else if (G2 != null) {
                r2.g(obj, j7, G2);
                x(obj, i8, i7);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.drive.u1
    public final int a(Object obj) {
        int i7;
        int i8;
        int i9;
        boolean z7;
        int W;
        int M;
        int l02;
        int i10;
        int Z;
        int K;
        int o7;
        int q7;
        int z8;
        int K2;
        int o8;
        int q8;
        int i11 = 267386880;
        int i12 = 1048575;
        int i13 = 0;
        if (this.f20669h) {
            Unsafe unsafe = f20661s;
            int i14 = 0;
            int i15 = 0;
            while (i14 < this.f20662a.length) {
                int u7 = u(i14);
                int i16 = (u7 & i11) >>> 20;
                int i17 = i11;
                int i18 = this.f20662a[i14];
                long j7 = u7 & 1048575;
                int i19 = (i16 < h0.f20590e0.c() || i16 > h0.f20603r0.c()) ? 0 : this.f20662a[i14 + 2] & 1048575;
                switch (i16) {
                    case 0:
                        if (o(obj, i14)) {
                            z8 = w.z(i18, 0.0d);
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (o(obj, i14)) {
                            z8 = w.A(i18, 0.0f);
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (o(obj, i14)) {
                            z8 = w.W(i18, r2.B(obj, j7));
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (o(obj, i14)) {
                            z8 = w.b0(i18, r2.B(obj, j7));
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (o(obj, i14)) {
                            z8 = w.f0(i18, r2.A(obj, j7));
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (o(obj, i14)) {
                            z8 = w.g0(i18, 0L);
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (o(obj, i14)) {
                            z8 = w.k0(i18, 0);
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (o(obj, i14)) {
                            z8 = w.M(i18, true);
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (o(obj, i14)) {
                            Object G = r2.G(obj, j7);
                            z8 = G instanceof i ? w.K(i18, (i) G) : w.C(i18, (String) G);
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (o(obj, i14)) {
                            z8 = w1.l(i18, r2.G(obj, j7), s(i14));
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (o(obj, i14)) {
                            z8 = w.K(i18, (i) r2.G(obj, j7));
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (o(obj, i14)) {
                            z8 = w.h0(i18, r2.A(obj, j7));
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (o(obj, i14)) {
                            z8 = w.m0(i18, r2.A(obj, j7));
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (o(obj, i14)) {
                            z8 = w.l0(i18, 0);
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (o(obj, i14)) {
                            z8 = w.i0(i18, 0L);
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (o(obj, i14)) {
                            z8 = w.j0(i18, r2.A(obj, j7));
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (o(obj, i14)) {
                            z8 = w.d0(i18, r2.B(obj, j7));
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (o(obj, i14)) {
                            z8 = w.L(i18, (i1) r2.G(obj, j7), s(i14));
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        z8 = w1.a0(i18, B(obj, j7), false);
                        i15 += z8;
                        break;
                    case 19:
                        z8 = w1.Z(i18, B(obj, j7), false);
                        i15 += z8;
                        break;
                    case 20:
                        z8 = w1.S(i18, B(obj, j7), false);
                        i15 += z8;
                        break;
                    case 21:
                        z8 = w1.T(i18, B(obj, j7), false);
                        i15 += z8;
                        break;
                    case 22:
                        z8 = w1.W(i18, B(obj, j7), false);
                        i15 += z8;
                        break;
                    case 23:
                        z8 = w1.a0(i18, B(obj, j7), false);
                        i15 += z8;
                        break;
                    case 24:
                        z8 = w1.Z(i18, B(obj, j7), false);
                        i15 += z8;
                        break;
                    case 25:
                        z8 = w1.b0(i18, B(obj, j7), false);
                        i15 += z8;
                        break;
                    case 26:
                        z8 = w1.m(i18, B(obj, j7));
                        i15 += z8;
                        break;
                    case 27:
                        z8 = w1.n(i18, B(obj, j7), s(i14));
                        i15 += z8;
                        break;
                    case 28:
                        z8 = w1.q(i18, B(obj, j7));
                        i15 += z8;
                        break;
                    case 29:
                        z8 = w1.X(i18, B(obj, j7), false);
                        i15 += z8;
                        break;
                    case 30:
                        z8 = w1.V(i18, B(obj, j7), false);
                        i15 += z8;
                        break;
                    case 31:
                        z8 = w1.Z(i18, B(obj, j7), false);
                        i15 += z8;
                        break;
                    case 32:
                        z8 = w1.a0(i18, B(obj, j7), false);
                        i15 += z8;
                        break;
                    case 33:
                        z8 = w1.Y(i18, B(obj, j7), false);
                        i15 += z8;
                        break;
                    case 34:
                        z8 = w1.U(i18, B(obj, j7), false);
                        i15 += z8;
                        break;
                    case 35:
                        K2 = w1.K((List) unsafe.getObject(obj, j7));
                        if (K2 <= 0) {
                            break;
                        } else {
                            if (this.f20670i) {
                                unsafe.putInt(obj, i19, K2);
                            }
                            o8 = w.o(i18);
                            q8 = w.q(K2);
                            z8 = o8 + q8 + K2;
                            i15 += z8;
                            break;
                        }
                    case androidx.constraintlayout.widget.h.f1530y1 /* 36 */:
                        K2 = w1.I((List) unsafe.getObject(obj, j7));
                        if (K2 <= 0) {
                            break;
                        } else {
                            if (this.f20670i) {
                                unsafe.putInt(obj, i19, K2);
                            }
                            o8 = w.o(i18);
                            q8 = w.q(K2);
                            z8 = o8 + q8 + K2;
                            i15 += z8;
                            break;
                        }
                    case 37:
                        K2 = w1.a((List) unsafe.getObject(obj, j7));
                        if (K2 <= 0) {
                            break;
                        } else {
                            if (this.f20670i) {
                                unsafe.putInt(obj, i19, K2);
                            }
                            o8 = w.o(i18);
                            q8 = w.q(K2);
                            z8 = o8 + q8 + K2;
                            i15 += z8;
                            break;
                        }
                    case androidx.constraintlayout.widget.h.f1478r5 /* 38 */:
                        K2 = w1.h((List) unsafe.getObject(obj, j7));
                        if (K2 <= 0) {
                            break;
                        } else {
                            if (this.f20670i) {
                                unsafe.putInt(obj, i19, K2);
                            }
                            o8 = w.o(i18);
                            q8 = w.q(K2);
                            z8 = o8 + q8 + K2;
                            i15 += z8;
                            break;
                        }
                    case androidx.constraintlayout.widget.h.f1486s5 /* 39 */:
                        K2 = w1.v((List) unsafe.getObject(obj, j7));
                        if (K2 <= 0) {
                            break;
                        } else {
                            if (this.f20670i) {
                                unsafe.putInt(obj, i19, K2);
                            }
                            o8 = w.o(i18);
                            q8 = w.q(K2);
                            z8 = o8 + q8 + K2;
                            i15 += z8;
                            break;
                        }
                    case androidx.constraintlayout.widget.h.f1494t5 /* 40 */:
                        K2 = w1.K((List) unsafe.getObject(obj, j7));
                        if (K2 <= 0) {
                            break;
                        } else {
                            if (this.f20670i) {
                                unsafe.putInt(obj, i19, K2);
                            }
                            o8 = w.o(i18);
                            q8 = w.q(K2);
                            z8 = o8 + q8 + K2;
                            i15 += z8;
                            break;
                        }
                    case androidx.constraintlayout.widget.h.f1502u5 /* 41 */:
                        K2 = w1.I((List) unsafe.getObject(obj, j7));
                        if (K2 <= 0) {
                            break;
                        } else {
                            if (this.f20670i) {
                                unsafe.putInt(obj, i19, K2);
                            }
                            o8 = w.o(i18);
                            q8 = w.q(K2);
                            z8 = o8 + q8 + K2;
                            i15 += z8;
                            break;
                        }
                    case androidx.constraintlayout.widget.h.f1510v5 /* 42 */:
                        K2 = w1.M((List) unsafe.getObject(obj, j7));
                        if (K2 <= 0) {
                            break;
                        } else {
                            if (this.f20670i) {
                                unsafe.putInt(obj, i19, K2);
                            }
                            o8 = w.o(i18);
                            q8 = w.q(K2);
                            z8 = o8 + q8 + K2;
                            i15 += z8;
                            break;
                        }
                    case androidx.constraintlayout.widget.h.f1518w5 /* 43 */:
                        K2 = w1.C((List) unsafe.getObject(obj, j7));
                        if (K2 <= 0) {
                            break;
                        } else {
                            if (this.f20670i) {
                                unsafe.putInt(obj, i19, K2);
                            }
                            o8 = w.o(i18);
                            q8 = w.q(K2);
                            z8 = o8 + q8 + K2;
                            i15 += z8;
                            break;
                        }
                    case androidx.constraintlayout.widget.h.f1526x5 /* 44 */:
                        K2 = w1.s((List) unsafe.getObject(obj, j7));
                        if (K2 <= 0) {
                            break;
                        } else {
                            if (this.f20670i) {
                                unsafe.putInt(obj, i19, K2);
                            }
                            o8 = w.o(i18);
                            q8 = w.q(K2);
                            z8 = o8 + q8 + K2;
                            i15 += z8;
                            break;
                        }
                    case androidx.constraintlayout.widget.h.f1534y5 /* 45 */:
                        K2 = w1.I((List) unsafe.getObject(obj, j7));
                        if (K2 <= 0) {
                            break;
                        } else {
                            if (this.f20670i) {
                                unsafe.putInt(obj, i19, K2);
                            }
                            o8 = w.o(i18);
                            q8 = w.q(K2);
                            z8 = o8 + q8 + K2;
                            i15 += z8;
                            break;
                        }
                    case androidx.constraintlayout.widget.h.f1542z5 /* 46 */:
                        K2 = w1.K((List) unsafe.getObject(obj, j7));
                        if (K2 <= 0) {
                            break;
                        } else {
                            if (this.f20670i) {
                                unsafe.putInt(obj, i19, K2);
                            }
                            o8 = w.o(i18);
                            q8 = w.q(K2);
                            z8 = o8 + q8 + K2;
                            i15 += z8;
                            break;
                        }
                    case androidx.constraintlayout.widget.h.A5 /* 47 */:
                        K2 = w1.F((List) unsafe.getObject(obj, j7));
                        if (K2 <= 0) {
                            break;
                        } else {
                            if (this.f20670i) {
                                unsafe.putInt(obj, i19, K2);
                            }
                            o8 = w.o(i18);
                            q8 = w.q(K2);
                            z8 = o8 + q8 + K2;
                            i15 += z8;
                            break;
                        }
                    case androidx.constraintlayout.widget.h.B5 /* 48 */:
                        K2 = w1.o((List) unsafe.getObject(obj, j7));
                        if (K2 <= 0) {
                            break;
                        } else {
                            if (this.f20670i) {
                                unsafe.putInt(obj, i19, K2);
                            }
                            o8 = w.o(i18);
                            q8 = w.q(K2);
                            z8 = o8 + q8 + K2;
                            i15 += z8;
                            break;
                        }
                    case androidx.constraintlayout.widget.h.C5 /* 49 */:
                        z8 = w1.r(i18, B(obj, j7), s(i14));
                        i15 += z8;
                        break;
                    case androidx.constraintlayout.widget.h.D5 /* 50 */:
                        z8 = this.f20678q.b(i18, r2.G(obj, j7), t(i14));
                        i15 += z8;
                        break;
                    case androidx.constraintlayout.widget.h.E5 /* 51 */:
                        if (p(obj, i18, i14)) {
                            z8 = w.z(i18, 0.0d);
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case androidx.constraintlayout.widget.h.F5 /* 52 */:
                        if (p(obj, i18, i14)) {
                            z8 = w.A(i18, 0.0f);
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case androidx.constraintlayout.widget.h.G5 /* 53 */:
                        if (p(obj, i18, i14)) {
                            z8 = w.W(i18, F(obj, j7));
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (p(obj, i18, i14)) {
                            z8 = w.b0(i18, F(obj, j7));
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (p(obj, i18, i14)) {
                            z8 = w.f0(i18, E(obj, j7));
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (p(obj, i18, i14)) {
                            z8 = w.g0(i18, 0L);
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (p(obj, i18, i14)) {
                            z8 = w.k0(i18, 0);
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (p(obj, i18, i14)) {
                            z8 = w.M(i18, true);
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (p(obj, i18, i14)) {
                            Object G2 = r2.G(obj, j7);
                            z8 = G2 instanceof i ? w.K(i18, (i) G2) : w.C(i18, (String) G2);
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (p(obj, i18, i14)) {
                            z8 = w1.l(i18, r2.G(obj, j7), s(i14));
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (p(obj, i18, i14)) {
                            z8 = w.K(i18, (i) r2.G(obj, j7));
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (p(obj, i18, i14)) {
                            z8 = w.h0(i18, E(obj, j7));
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (p(obj, i18, i14)) {
                            z8 = w.m0(i18, E(obj, j7));
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (p(obj, i18, i14)) {
                            z8 = w.l0(i18, 0);
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (p(obj, i18, i14)) {
                            z8 = w.i0(i18, 0L);
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (p(obj, i18, i14)) {
                            z8 = w.j0(i18, E(obj, j7));
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (p(obj, i18, i14)) {
                            z8 = w.d0(i18, F(obj, j7));
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (p(obj, i18, i14)) {
                            z8 = w.L(i18, (i1) r2.G(obj, j7), s(i14));
                            i15 += z8;
                            break;
                        } else {
                            break;
                        }
                }
                i14 += 3;
                i11 = i17;
            }
            return i15 + h(this.f20676o, obj);
        }
        Unsafe unsafe2 = f20661s;
        int i20 = -1;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (i21 < this.f20662a.length) {
            int u8 = u(i21);
            int[] iArr = this.f20662a;
            int i24 = iArr[i21];
            int i25 = i12;
            int i26 = (u8 & 267386880) >>> 20;
            if (i26 <= 17) {
                i7 = iArr[i21 + 2];
                int i27 = i7 & i25;
                i8 = 1 << (i7 >>> 20);
                if (i27 != i20) {
                    i23 = unsafe2.getInt(obj, i27);
                    i20 = i27;
                }
            } else {
                i7 = (!this.f20670i || i26 < h0.f20590e0.c() || i26 > h0.f20603r0.c()) ? 0 : this.f20662a[i21 + 2] & i25;
                i8 = 0;
            }
            long j8 = u8 & i25;
            switch (i26) {
                case 0:
                    i9 = 0;
                    z7 = false;
                    if ((i23 & i8) != 0) {
                        i22 += w.z(i24, 0.0d);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i9 = 0;
                    if ((i23 & i8) != 0) {
                        z7 = false;
                        i22 += w.A(i24, 0.0f);
                        break;
                    }
                    z7 = false;
                case 2:
                    i9 = 0;
                    if ((i23 & i8) != 0) {
                        W = w.W(i24, unsafe2.getLong(obj, j8));
                        i22 += W;
                    }
                    z7 = false;
                    break;
                case 3:
                    i9 = 0;
                    if ((i23 & i8) != 0) {
                        W = w.b0(i24, unsafe2.getLong(obj, j8));
                        i22 += W;
                    }
                    z7 = false;
                    break;
                case 4:
                    i9 = 0;
                    if ((i23 & i8) != 0) {
                        W = w.f0(i24, unsafe2.getInt(obj, j8));
                        i22 += W;
                    }
                    z7 = false;
                    break;
                case 5:
                    i9 = 0;
                    if ((i23 & i8) != 0) {
                        W = w.g0(i24, 0L);
                        i22 += W;
                    }
                    z7 = false;
                    break;
                case 6:
                    if ((i23 & i8) != 0) {
                        i9 = 0;
                        W = w.k0(i24, 0);
                        i22 += W;
                        z7 = false;
                        break;
                    }
                    i9 = 0;
                    z7 = false;
                case 7:
                    if ((i23 & i8) != 0) {
                        M = w.M(i24, true);
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 8:
                    if ((i23 & i8) != 0) {
                        Object object = unsafe2.getObject(obj, j8);
                        M = object instanceof i ? w.K(i24, (i) object) : w.C(i24, (String) object);
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 9:
                    if ((i23 & i8) != 0) {
                        M = w1.l(i24, unsafe2.getObject(obj, j8), s(i21));
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 10:
                    if ((i23 & i8) != 0) {
                        M = w.K(i24, (i) unsafe2.getObject(obj, j8));
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 11:
                    if ((i23 & i8) != 0) {
                        M = w.h0(i24, unsafe2.getInt(obj, j8));
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 12:
                    if ((i23 & i8) != 0) {
                        M = w.m0(i24, unsafe2.getInt(obj, j8));
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 13:
                    if ((i23 & i8) != 0) {
                        l02 = w.l0(i24, 0);
                        i22 += l02;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 14:
                    if ((i23 & i8) != 0) {
                        M = w.i0(i24, 0L);
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 15:
                    if ((i23 & i8) != 0) {
                        M = w.j0(i24, unsafe2.getInt(obj, j8));
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 16:
                    if ((i23 & i8) != 0) {
                        M = w.d0(i24, unsafe2.getLong(obj, j8));
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 17:
                    if ((i23 & i8) != 0) {
                        M = w.L(i24, (i1) unsafe2.getObject(obj, j8), s(i21));
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 18:
                    M = w1.a0(i24, (List) unsafe2.getObject(obj, j8), false);
                    i22 += M;
                    i9 = 0;
                    z7 = false;
                    break;
                case 19:
                    i10 = 0;
                    Z = w1.Z(i24, (List) unsafe2.getObject(obj, j8), false);
                    i22 += Z;
                    i9 = i10;
                    z7 = false;
                    break;
                case 20:
                    i10 = 0;
                    Z = w1.S(i24, (List) unsafe2.getObject(obj, j8), false);
                    i22 += Z;
                    i9 = i10;
                    z7 = false;
                    break;
                case 21:
                    i10 = 0;
                    Z = w1.T(i24, (List) unsafe2.getObject(obj, j8), false);
                    i22 += Z;
                    i9 = i10;
                    z7 = false;
                    break;
                case 22:
                    i10 = 0;
                    Z = w1.W(i24, (List) unsafe2.getObject(obj, j8), false);
                    i22 += Z;
                    i9 = i10;
                    z7 = false;
                    break;
                case 23:
                    i10 = 0;
                    Z = w1.a0(i24, (List) unsafe2.getObject(obj, j8), false);
                    i22 += Z;
                    i9 = i10;
                    z7 = false;
                    break;
                case 24:
                    i10 = 0;
                    Z = w1.Z(i24, (List) unsafe2.getObject(obj, j8), false);
                    i22 += Z;
                    i9 = i10;
                    z7 = false;
                    break;
                case 25:
                    i10 = 0;
                    Z = w1.b0(i24, (List) unsafe2.getObject(obj, j8), false);
                    i22 += Z;
                    i9 = i10;
                    z7 = false;
                    break;
                case 26:
                    M = w1.m(i24, (List) unsafe2.getObject(obj, j8));
                    i22 += M;
                    i9 = 0;
                    z7 = false;
                    break;
                case 27:
                    M = w1.n(i24, (List) unsafe2.getObject(obj, j8), s(i21));
                    i22 += M;
                    i9 = 0;
                    z7 = false;
                    break;
                case 28:
                    M = w1.q(i24, (List) unsafe2.getObject(obj, j8));
                    i22 += M;
                    i9 = 0;
                    z7 = false;
                    break;
                case 29:
                    M = w1.X(i24, (List) unsafe2.getObject(obj, j8), false);
                    i22 += M;
                    i9 = 0;
                    z7 = false;
                    break;
                case 30:
                    i10 = 0;
                    Z = w1.V(i24, (List) unsafe2.getObject(obj, j8), false);
                    i22 += Z;
                    i9 = i10;
                    z7 = false;
                    break;
                case 31:
                    i10 = 0;
                    Z = w1.Z(i24, (List) unsafe2.getObject(obj, j8), false);
                    i22 += Z;
                    i9 = i10;
                    z7 = false;
                    break;
                case 32:
                    i10 = 0;
                    Z = w1.a0(i24, (List) unsafe2.getObject(obj, j8), false);
                    i22 += Z;
                    i9 = i10;
                    z7 = false;
                    break;
                case 33:
                    i10 = 0;
                    Z = w1.Y(i24, (List) unsafe2.getObject(obj, j8), false);
                    i22 += Z;
                    i9 = i10;
                    z7 = false;
                    break;
                case 34:
                    i10 = 0;
                    Z = w1.U(i24, (List) unsafe2.getObject(obj, j8), false);
                    i22 += Z;
                    i9 = i10;
                    z7 = false;
                    break;
                case 35:
                    K = w1.K((List) unsafe2.getObject(obj, j8));
                    if (K > 0) {
                        if (this.f20670i) {
                            unsafe2.putInt(obj, i7, K);
                        }
                        o7 = w.o(i24);
                        q7 = w.q(K);
                        M = o7 + q7 + K;
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case androidx.constraintlayout.widget.h.f1530y1 /* 36 */:
                    K = w1.I((List) unsafe2.getObject(obj, j8));
                    if (K > 0) {
                        if (this.f20670i) {
                            unsafe2.putInt(obj, i7, K);
                        }
                        o7 = w.o(i24);
                        q7 = w.q(K);
                        M = o7 + q7 + K;
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 37:
                    K = w1.a((List) unsafe2.getObject(obj, j8));
                    if (K > 0) {
                        if (this.f20670i) {
                            unsafe2.putInt(obj, i7, K);
                        }
                        o7 = w.o(i24);
                        q7 = w.q(K);
                        M = o7 + q7 + K;
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case androidx.constraintlayout.widget.h.f1478r5 /* 38 */:
                    K = w1.h((List) unsafe2.getObject(obj, j8));
                    if (K > 0) {
                        if (this.f20670i) {
                            unsafe2.putInt(obj, i7, K);
                        }
                        o7 = w.o(i24);
                        q7 = w.q(K);
                        M = o7 + q7 + K;
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case androidx.constraintlayout.widget.h.f1486s5 /* 39 */:
                    K = w1.v((List) unsafe2.getObject(obj, j8));
                    if (K > 0) {
                        if (this.f20670i) {
                            unsafe2.putInt(obj, i7, K);
                        }
                        o7 = w.o(i24);
                        q7 = w.q(K);
                        M = o7 + q7 + K;
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case androidx.constraintlayout.widget.h.f1494t5 /* 40 */:
                    K = w1.K((List) unsafe2.getObject(obj, j8));
                    if (K > 0) {
                        if (this.f20670i) {
                            unsafe2.putInt(obj, i7, K);
                        }
                        o7 = w.o(i24);
                        q7 = w.q(K);
                        M = o7 + q7 + K;
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case androidx.constraintlayout.widget.h.f1502u5 /* 41 */:
                    K = w1.I((List) unsafe2.getObject(obj, j8));
                    if (K > 0) {
                        if (this.f20670i) {
                            unsafe2.putInt(obj, i7, K);
                        }
                        o7 = w.o(i24);
                        q7 = w.q(K);
                        M = o7 + q7 + K;
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case androidx.constraintlayout.widget.h.f1510v5 /* 42 */:
                    K = w1.M((List) unsafe2.getObject(obj, j8));
                    if (K > 0) {
                        if (this.f20670i) {
                            unsafe2.putInt(obj, i7, K);
                        }
                        o7 = w.o(i24);
                        q7 = w.q(K);
                        M = o7 + q7 + K;
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case androidx.constraintlayout.widget.h.f1518w5 /* 43 */:
                    K = w1.C((List) unsafe2.getObject(obj, j8));
                    if (K > 0) {
                        if (this.f20670i) {
                            unsafe2.putInt(obj, i7, K);
                        }
                        o7 = w.o(i24);
                        q7 = w.q(K);
                        M = o7 + q7 + K;
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case androidx.constraintlayout.widget.h.f1526x5 /* 44 */:
                    K = w1.s((List) unsafe2.getObject(obj, j8));
                    if (K > 0) {
                        if (this.f20670i) {
                            unsafe2.putInt(obj, i7, K);
                        }
                        o7 = w.o(i24);
                        q7 = w.q(K);
                        M = o7 + q7 + K;
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case androidx.constraintlayout.widget.h.f1534y5 /* 45 */:
                    K = w1.I((List) unsafe2.getObject(obj, j8));
                    if (K > 0) {
                        if (this.f20670i) {
                            unsafe2.putInt(obj, i7, K);
                        }
                        o7 = w.o(i24);
                        q7 = w.q(K);
                        M = o7 + q7 + K;
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case androidx.constraintlayout.widget.h.f1542z5 /* 46 */:
                    K = w1.K((List) unsafe2.getObject(obj, j8));
                    if (K > 0) {
                        if (this.f20670i) {
                            unsafe2.putInt(obj, i7, K);
                        }
                        o7 = w.o(i24);
                        q7 = w.q(K);
                        M = o7 + q7 + K;
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case androidx.constraintlayout.widget.h.A5 /* 47 */:
                    K = w1.F((List) unsafe2.getObject(obj, j8));
                    if (K > 0) {
                        if (this.f20670i) {
                            unsafe2.putInt(obj, i7, K);
                        }
                        o7 = w.o(i24);
                        q7 = w.q(K);
                        M = o7 + q7 + K;
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case androidx.constraintlayout.widget.h.B5 /* 48 */:
                    K = w1.o((List) unsafe2.getObject(obj, j8));
                    if (K > 0) {
                        if (this.f20670i) {
                            unsafe2.putInt(obj, i7, K);
                        }
                        o7 = w.o(i24);
                        q7 = w.q(K);
                        M = o7 + q7 + K;
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case androidx.constraintlayout.widget.h.C5 /* 49 */:
                    M = w1.r(i24, (List) unsafe2.getObject(obj, j8), s(i21));
                    i22 += M;
                    i9 = 0;
                    z7 = false;
                    break;
                case androidx.constraintlayout.widget.h.D5 /* 50 */:
                    M = this.f20678q.b(i24, unsafe2.getObject(obj, j8), t(i21));
                    i22 += M;
                    i9 = 0;
                    z7 = false;
                    break;
                case androidx.constraintlayout.widget.h.E5 /* 51 */:
                    if (p(obj, i24, i21)) {
                        i22 += w.z(i24, 0.0d);
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case androidx.constraintlayout.widget.h.F5 /* 52 */:
                    if (p(obj, i24, i21)) {
                        l02 = w.A(i24, 0.0f);
                        i22 += l02;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case androidx.constraintlayout.widget.h.G5 /* 53 */:
                    if (p(obj, i24, i21)) {
                        M = w.W(i24, F(obj, j8));
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 54:
                    if (p(obj, i24, i21)) {
                        M = w.b0(i24, F(obj, j8));
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 55:
                    if (p(obj, i24, i21)) {
                        M = w.f0(i24, E(obj, j8));
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 56:
                    if (p(obj, i24, i21)) {
                        M = w.g0(i24, 0L);
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 57:
                    if (p(obj, i24, i21)) {
                        l02 = w.k0(i24, 0);
                        i22 += l02;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 58:
                    if (p(obj, i24, i21)) {
                        M = w.M(i24, true);
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 59:
                    if (p(obj, i24, i21)) {
                        Object object2 = unsafe2.getObject(obj, j8);
                        M = object2 instanceof i ? w.K(i24, (i) object2) : w.C(i24, (String) object2);
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 60:
                    if (p(obj, i24, i21)) {
                        M = w1.l(i24, unsafe2.getObject(obj, j8), s(i21));
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 61:
                    if (p(obj, i24, i21)) {
                        M = w.K(i24, (i) unsafe2.getObject(obj, j8));
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 62:
                    if (p(obj, i24, i21)) {
                        M = w.h0(i24, E(obj, j8));
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 63:
                    if (p(obj, i24, i21)) {
                        M = w.m0(i24, E(obj, j8));
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 64:
                    if (p(obj, i24, i21)) {
                        l02 = w.l0(i24, 0);
                        i22 += l02;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 65:
                    if (p(obj, i24, i21)) {
                        M = w.i0(i24, 0L);
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 66:
                    if (p(obj, i24, i21)) {
                        M = w.j0(i24, E(obj, j8));
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 67:
                    if (p(obj, i24, i21)) {
                        M = w.d0(i24, F(obj, j8));
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                case 68:
                    if (p(obj, i24, i21)) {
                        M = w.L(i24, (i1) unsafe2.getObject(obj, j8), s(i21));
                        i22 += M;
                    }
                    i9 = 0;
                    z7 = false;
                    break;
                default:
                    i9 = 0;
                    z7 = false;
                    break;
            }
            i21 += 3;
            i13 = i9;
            i12 = i25;
        }
        int i28 = i13;
        int h8 = i22 + h(this.f20676o, obj);
        if (!this.f20667f) {
            return h8;
        }
        e0 c8 = this.f20677p.c(obj);
        for (int i29 = i28; i29 < c8.f20558a.m(); i29++) {
            Map.Entry g8 = c8.f20558a.g(i29);
            android.support.v4.media.session.b.a(g8.getKey());
            i28 += e0.h(null, g8.getValue());
        }
        for (Map.Entry entry : c8.f20558a.n()) {
            android.support.v4.media.session.b.a(entry.getKey());
            i28 += e0.h(null, entry.getValue());
        }
        return h8 + i28;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0a2a  */
    @Override // com.google.android.gms.internal.drive.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r14, com.google.android.gms.internal.drive.f3 r15) {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.m1.b(java.lang.Object, com.google.android.gms.internal.drive.f3):void");
    }

    @Override // com.google.android.gms.internal.drive.u1
    public final void c(Object obj, Object obj2) {
        obj2.getClass();
        for (int i7 = 0; i7 < this.f20662a.length; i7 += 3) {
            int u7 = u(i7);
            long j7 = 1048575 & u7;
            int i8 = this.f20662a[i7];
            switch ((u7 & 267386880) >>> 20) {
                case 0:
                    if (o(obj2, i7)) {
                        r2.c(obj, j7, r2.F(obj2, j7));
                        w(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (o(obj2, i7)) {
                        r2.d(obj, j7, r2.E(obj2, j7));
                        w(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (o(obj2, i7)) {
                        r2.f(obj, j7, r2.B(obj2, j7));
                        w(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (o(obj2, i7)) {
                        r2.f(obj, j7, r2.B(obj2, j7));
                        w(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (o(obj2, i7)) {
                        r2.e(obj, j7, r2.A(obj2, j7));
                        w(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (o(obj2, i7)) {
                        r2.f(obj, j7, r2.B(obj2, j7));
                        w(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (o(obj2, i7)) {
                        r2.e(obj, j7, r2.A(obj2, j7));
                        w(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (o(obj2, i7)) {
                        r2.h(obj, j7, r2.D(obj2, j7));
                        w(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (o(obj2, i7)) {
                        r2.g(obj, j7, r2.G(obj2, j7));
                        w(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    n(obj, obj2, i7);
                    break;
                case 10:
                    if (o(obj2, i7)) {
                        r2.g(obj, j7, r2.G(obj2, j7));
                        w(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (o(obj2, i7)) {
                        r2.e(obj, j7, r2.A(obj2, j7));
                        w(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (o(obj2, i7)) {
                        r2.e(obj, j7, r2.A(obj2, j7));
                        w(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (o(obj2, i7)) {
                        r2.e(obj, j7, r2.A(obj2, j7));
                        w(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (o(obj2, i7)) {
                        r2.f(obj, j7, r2.B(obj2, j7));
                        w(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (o(obj2, i7)) {
                        r2.e(obj, j7, r2.A(obj2, j7));
                        w(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (o(obj2, i7)) {
                        r2.f(obj, j7, r2.B(obj2, j7));
                        w(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    n(obj, obj2, i7);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case androidx.constraintlayout.widget.h.f1530y1 /* 36 */:
                case 37:
                case androidx.constraintlayout.widget.h.f1478r5 /* 38 */:
                case androidx.constraintlayout.widget.h.f1486s5 /* 39 */:
                case androidx.constraintlayout.widget.h.f1494t5 /* 40 */:
                case androidx.constraintlayout.widget.h.f1502u5 /* 41 */:
                case androidx.constraintlayout.widget.h.f1510v5 /* 42 */:
                case androidx.constraintlayout.widget.h.f1518w5 /* 43 */:
                case androidx.constraintlayout.widget.h.f1526x5 /* 44 */:
                case androidx.constraintlayout.widget.h.f1534y5 /* 45 */:
                case androidx.constraintlayout.widget.h.f1542z5 /* 46 */:
                case androidx.constraintlayout.widget.h.A5 /* 47 */:
                case androidx.constraintlayout.widget.h.B5 /* 48 */:
                case androidx.constraintlayout.widget.h.C5 /* 49 */:
                    this.f20675n.b(obj, obj2, j7);
                    break;
                case androidx.constraintlayout.widget.h.D5 /* 50 */:
                    w1.f(this.f20678q, obj, obj2, j7);
                    break;
                case androidx.constraintlayout.widget.h.E5 /* 51 */:
                case androidx.constraintlayout.widget.h.F5 /* 52 */:
                case androidx.constraintlayout.widget.h.G5 /* 53 */:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (p(obj2, i8, i7)) {
                        r2.g(obj, j7, r2.G(obj2, j7));
                        x(obj, i8, i7);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    z(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (p(obj2, i8, i7)) {
                        r2.g(obj, j7, r2.G(obj2, j7));
                        x(obj, i8, i7);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    z(obj, obj2, i7);
                    break;
            }
        }
        if (this.f20669h) {
            return;
        }
        w1.g(this.f20676o, obj, obj2);
        if (this.f20667f) {
            w1.e(this.f20677p, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.drive.u1
    public final void d(Object obj) {
        int i7;
        int i8 = this.f20672k;
        while (true) {
            i7 = this.f20673l;
            if (i8 >= i7) {
                break;
            }
            long u7 = u(this.f20671j[i8]) & 1048575;
            Object G = r2.G(obj, u7);
            if (G != null) {
                r2.g(obj, u7, this.f20678q.e(G));
            }
            i8++;
        }
        int length = this.f20671j.length;
        while (i7 < length) {
            this.f20675n.a(obj, this.f20671j[i7]);
            i7++;
        }
        this.f20676o.c(obj);
        if (this.f20667f) {
            this.f20677p.e(obj);
        }
    }

    @Override // com.google.android.gms.internal.drive.u1
    public final boolean e(Object obj) {
        int i7;
        int i8 = -1;
        int i9 = 0;
        for (int i10 = 0; i10 < this.f20672k; i10++) {
            int i11 = this.f20671j[i10];
            int i12 = this.f20662a[i11];
            int u7 = u(i11);
            if (this.f20669h) {
                i7 = 0;
            } else {
                int i13 = this.f20662a[i11 + 2];
                int i14 = i13 & 1048575;
                i7 = 1 << (i13 >>> 20);
                if (i14 != i8) {
                    i9 = f20661s.getInt(obj, i14);
                    i8 = i14;
                }
            }
            if ((268435456 & u7) != 0 && !q(obj, i11, i9, i7)) {
                return false;
            }
            int i15 = (267386880 & u7) >>> 20;
            if (i15 != 9 && i15 != 17) {
                if (i15 != 27) {
                    if (i15 == 60 || i15 == 68) {
                        if (p(obj, i12, i11) && !r(obj, u7, s(i11))) {
                            return false;
                        }
                    } else if (i15 != 49) {
                        if (i15 == 50 && !this.f20678q.c(r2.G(obj, u7 & 1048575)).isEmpty()) {
                            this.f20678q.a(t(i11));
                            throw null;
                        }
                    }
                }
                List list = (List) r2.G(obj, u7 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    u1 s7 = s(i11);
                    for (int i16 = 0; i16 < list.size(); i16++) {
                        if (!s7.e(list.get(i16))) {
                            return false;
                        }
                    }
                }
            } else if (q(obj, i11, i9, i7) && !r(obj, u7, s(i11))) {
                return false;
            }
        }
        return !this.f20667f || this.f20677p.c(obj).b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (com.google.android.gms.internal.drive.w1.u(com.google.android.gms.internal.drive.r2.G(r10, r6), com.google.android.gms.internal.drive.r2.G(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (com.google.android.gms.internal.drive.r2.B(r10, r6) == com.google.android.gms.internal.drive.r2.B(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (com.google.android.gms.internal.drive.r2.A(r10, r6) == com.google.android.gms.internal.drive.r2.A(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        if (com.google.android.gms.internal.drive.r2.B(r10, r6) == com.google.android.gms.internal.drive.r2.B(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (com.google.android.gms.internal.drive.r2.A(r10, r6) == com.google.android.gms.internal.drive.r2.A(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
    
        if (com.google.android.gms.internal.drive.r2.A(r10, r6) == com.google.android.gms.internal.drive.r2.A(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
    
        if (com.google.android.gms.internal.drive.r2.A(r10, r6) == com.google.android.gms.internal.drive.r2.A(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
    
        if (com.google.android.gms.internal.drive.w1.u(com.google.android.gms.internal.drive.r2.G(r10, r6), com.google.android.gms.internal.drive.r2.G(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0102, code lost:
    
        if (com.google.android.gms.internal.drive.w1.u(com.google.android.gms.internal.drive.r2.G(r10, r6), com.google.android.gms.internal.drive.r2.G(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0118, code lost:
    
        if (com.google.android.gms.internal.drive.w1.u(com.google.android.gms.internal.drive.r2.G(r10, r6), com.google.android.gms.internal.drive.r2.G(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012a, code lost:
    
        if (com.google.android.gms.internal.drive.r2.D(r10, r6) == com.google.android.gms.internal.drive.r2.D(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013c, code lost:
    
        if (com.google.android.gms.internal.drive.r2.A(r10, r6) == com.google.android.gms.internal.drive.r2.A(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0150, code lost:
    
        if (com.google.android.gms.internal.drive.r2.B(r10, r6) == com.google.android.gms.internal.drive.r2.B(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0162, code lost:
    
        if (com.google.android.gms.internal.drive.r2.A(r10, r6) == com.google.android.gms.internal.drive.r2.A(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0176, code lost:
    
        if (com.google.android.gms.internal.drive.r2.B(r10, r6) == com.google.android.gms.internal.drive.r2.B(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018a, code lost:
    
        if (com.google.android.gms.internal.drive.r2.B(r10, r6) == com.google.android.gms.internal.drive.r2.B(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.drive.r2.E(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.drive.r2.E(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c0, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.drive.r2.F(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.drive.r2.F(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.drive.w1.u(com.google.android.gms.internal.drive.r2.G(r10, r6), com.google.android.gms.internal.drive.r2.G(r11, r6)) != false) goto L105;
     */
    @Override // com.google.android.gms.internal.drive.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.m1.f(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.drive.u1
    public final int g(Object obj) {
        int i7;
        int i8;
        int length = this.f20662a.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int u7 = u(i10);
            int i11 = this.f20662a[i10];
            long j7 = 1048575 & u7;
            int i12 = 37;
            switch ((u7 & 267386880) >>> 20) {
                case 0:
                    i7 = i9 * 53;
                    i8 = m0.i(Double.doubleToLongBits(r2.F(obj, j7)));
                    i9 = i7 + i8;
                    break;
                case 1:
                    i7 = i9 * 53;
                    i8 = Float.floatToIntBits(r2.E(obj, j7));
                    i9 = i7 + i8;
                    break;
                case 2:
                    i7 = i9 * 53;
                    i8 = m0.i(r2.B(obj, j7));
                    i9 = i7 + i8;
                    break;
                case 3:
                    i7 = i9 * 53;
                    i8 = m0.i(r2.B(obj, j7));
                    i9 = i7 + i8;
                    break;
                case 4:
                    i7 = i9 * 53;
                    i8 = r2.A(obj, j7);
                    i9 = i7 + i8;
                    break;
                case 5:
                    i7 = i9 * 53;
                    i8 = m0.i(r2.B(obj, j7));
                    i9 = i7 + i8;
                    break;
                case 6:
                    i7 = i9 * 53;
                    i8 = r2.A(obj, j7);
                    i9 = i7 + i8;
                    break;
                case 7:
                    i7 = i9 * 53;
                    i8 = m0.f(r2.D(obj, j7));
                    i9 = i7 + i8;
                    break;
                case 8:
                    i7 = i9 * 53;
                    i8 = ((String) r2.G(obj, j7)).hashCode();
                    i9 = i7 + i8;
                    break;
                case 9:
                    Object G = r2.G(obj, j7);
                    if (G != null) {
                        i12 = G.hashCode();
                    }
                    i9 = (i9 * 53) + i12;
                    break;
                case 10:
                    i7 = i9 * 53;
                    i8 = r2.G(obj, j7).hashCode();
                    i9 = i7 + i8;
                    break;
                case 11:
                    i7 = i9 * 53;
                    i8 = r2.A(obj, j7);
                    i9 = i7 + i8;
                    break;
                case 12:
                    i7 = i9 * 53;
                    i8 = r2.A(obj, j7);
                    i9 = i7 + i8;
                    break;
                case 13:
                    i7 = i9 * 53;
                    i8 = r2.A(obj, j7);
                    i9 = i7 + i8;
                    break;
                case 14:
                    i7 = i9 * 53;
                    i8 = m0.i(r2.B(obj, j7));
                    i9 = i7 + i8;
                    break;
                case 15:
                    i7 = i9 * 53;
                    i8 = r2.A(obj, j7);
                    i9 = i7 + i8;
                    break;
                case 16:
                    i7 = i9 * 53;
                    i8 = m0.i(r2.B(obj, j7));
                    i9 = i7 + i8;
                    break;
                case 17:
                    Object G2 = r2.G(obj, j7);
                    if (G2 != null) {
                        i12 = G2.hashCode();
                    }
                    i9 = (i9 * 53) + i12;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case androidx.constraintlayout.widget.h.f1530y1 /* 36 */:
                case 37:
                case androidx.constraintlayout.widget.h.f1478r5 /* 38 */:
                case androidx.constraintlayout.widget.h.f1486s5 /* 39 */:
                case androidx.constraintlayout.widget.h.f1494t5 /* 40 */:
                case androidx.constraintlayout.widget.h.f1502u5 /* 41 */:
                case androidx.constraintlayout.widget.h.f1510v5 /* 42 */:
                case androidx.constraintlayout.widget.h.f1518w5 /* 43 */:
                case androidx.constraintlayout.widget.h.f1526x5 /* 44 */:
                case androidx.constraintlayout.widget.h.f1534y5 /* 45 */:
                case androidx.constraintlayout.widget.h.f1542z5 /* 46 */:
                case androidx.constraintlayout.widget.h.A5 /* 47 */:
                case androidx.constraintlayout.widget.h.B5 /* 48 */:
                case androidx.constraintlayout.widget.h.C5 /* 49 */:
                    i7 = i9 * 53;
                    i8 = r2.G(obj, j7).hashCode();
                    i9 = i7 + i8;
                    break;
                case androidx.constraintlayout.widget.h.D5 /* 50 */:
                    i7 = i9 * 53;
                    i8 = r2.G(obj, j7).hashCode();
                    i9 = i7 + i8;
                    break;
                case androidx.constraintlayout.widget.h.E5 /* 51 */:
                    if (p(obj, i11, i10)) {
                        i7 = i9 * 53;
                        i8 = m0.i(Double.doubleToLongBits(C(obj, j7)));
                        i9 = i7 + i8;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.F5 /* 52 */:
                    if (p(obj, i11, i10)) {
                        i7 = i9 * 53;
                        i8 = Float.floatToIntBits(D(obj, j7));
                        i9 = i7 + i8;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.G5 /* 53 */:
                    if (p(obj, i11, i10)) {
                        i7 = i9 * 53;
                        i8 = m0.i(F(obj, j7));
                        i9 = i7 + i8;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (p(obj, i11, i10)) {
                        i7 = i9 * 53;
                        i8 = m0.i(F(obj, j7));
                        i9 = i7 + i8;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (p(obj, i11, i10)) {
                        i7 = i9 * 53;
                        i8 = E(obj, j7);
                        i9 = i7 + i8;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (p(obj, i11, i10)) {
                        i7 = i9 * 53;
                        i8 = m0.i(F(obj, j7));
                        i9 = i7 + i8;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (p(obj, i11, i10)) {
                        i7 = i9 * 53;
                        i8 = E(obj, j7);
                        i9 = i7 + i8;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (p(obj, i11, i10)) {
                        i7 = i9 * 53;
                        i8 = m0.f(G(obj, j7));
                        i9 = i7 + i8;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (p(obj, i11, i10)) {
                        i7 = i9 * 53;
                        i8 = ((String) r2.G(obj, j7)).hashCode();
                        i9 = i7 + i8;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (p(obj, i11, i10)) {
                        i7 = i9 * 53;
                        i8 = r2.G(obj, j7).hashCode();
                        i9 = i7 + i8;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (p(obj, i11, i10)) {
                        i7 = i9 * 53;
                        i8 = r2.G(obj, j7).hashCode();
                        i9 = i7 + i8;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (p(obj, i11, i10)) {
                        i7 = i9 * 53;
                        i8 = E(obj, j7);
                        i9 = i7 + i8;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (p(obj, i11, i10)) {
                        i7 = i9 * 53;
                        i8 = E(obj, j7);
                        i9 = i7 + i8;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (p(obj, i11, i10)) {
                        i7 = i9 * 53;
                        i8 = E(obj, j7);
                        i9 = i7 + i8;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (p(obj, i11, i10)) {
                        i7 = i9 * 53;
                        i8 = m0.i(F(obj, j7));
                        i9 = i7 + i8;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (p(obj, i11, i10)) {
                        i7 = i9 * 53;
                        i8 = E(obj, j7);
                        i9 = i7 + i8;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (p(obj, i11, i10)) {
                        i7 = i9 * 53;
                        i8 = m0.i(F(obj, j7));
                        i9 = i7 + i8;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (p(obj, i11, i10)) {
                        i7 = i9 * 53;
                        i8 = r2.G(obj, j7).hashCode();
                        i9 = i7 + i8;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i9 * 53) + this.f20676o.g(obj).hashCode();
        return this.f20667f ? (hashCode * 53) + this.f20677p.c(obj).hashCode() : hashCode;
    }
}
