package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: MyApplication */
final class c5 implements j5 {

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f21493l = new int[0];

    /* renamed from: m, reason: collision with root package name */
    private static final Unsafe f21494m = w5.l();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f21495a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f21496b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21497c;

    /* renamed from: d, reason: collision with root package name */
    private final int f21498d;

    /* renamed from: e, reason: collision with root package name */
    private final z4 f21499e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f21500f = false;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f21501g;

    /* renamed from: h, reason: collision with root package name */
    private final int f21502h;

    /* renamed from: i, reason: collision with root package name */
    private final int f21503i;

    /* renamed from: j, reason: collision with root package name */
    private final p5 f21504j;

    /* renamed from: k, reason: collision with root package name */
    private final u3 f21505k;

    private c5(int[] iArr, Object[] objArr, int i7, int i8, z4 z4Var, boolean z7, int[] iArr2, int i9, int i10, e5 e5Var, n4 n4Var, p5 p5Var, u3 u3Var, u4 u4Var) {
        this.f21495a = iArr;
        this.f21496b = objArr;
        this.f21497c = i7;
        this.f21498d = i8;
        this.f21501g = iArr2;
        this.f21502h = i9;
        this.f21503i = i10;
        this.f21504j = p5Var;
        this.f21505k = u3Var;
        this.f21499e = z4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.play_billing.c5 A(java.lang.Class r32, com.google.android.gms.internal.play_billing.w4 r33, com.google.android.gms.internal.play_billing.e5 r34, com.google.android.gms.internal.play_billing.n4 r35, com.google.android.gms.internal.play_billing.p5 r36, com.google.android.gms.internal.play_billing.u3 r37, com.google.android.gms.internal.play_billing.u4 r38) {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.c5.A(java.lang.Class, com.google.android.gms.internal.play_billing.w4, com.google.android.gms.internal.play_billing.e5, com.google.android.gms.internal.play_billing.n4, com.google.android.gms.internal.play_billing.p5, com.google.android.gms.internal.play_billing.u3, com.google.android.gms.internal.play_billing.u4):com.google.android.gms.internal.play_billing.c5");
    }

    private static double B(Object obj, long j7) {
        return ((Double) w5.k(obj, j7)).doubleValue();
    }

    private static float C(Object obj, long j7) {
        return ((Float) w5.k(obj, j7)).floatValue();
    }

    private static int D(Object obj, long j7) {
        return ((Integer) w5.k(obj, j7)).intValue();
    }

    private final int E(int i7) {
        return this.f21495a[i7 + 2];
    }

    private final int F(int i7, int i8) {
        int[] iArr = this.f21495a;
        int length = (iArr.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int i11 = iArr[i10];
            if (i7 == i11) {
                return i10;
            }
            if (i7 < i11) {
                length = i9 - 1;
            } else {
                i8 = i9 + 1;
            }
        }
        return -1;
    }

    private static int G(int i7) {
        return (i7 >>> 20) & 255;
    }

    private final int H(int i7) {
        return this.f21495a[i7 + 1];
    }

    private static long I(Object obj, long j7) {
        return ((Long) w5.k(obj, j7)).longValue();
    }

    private final g4 J(int i7) {
        int i8 = i7 / 3;
        return (g4) this.f21496b[i8 + i8 + 1];
    }

    private final j5 K(int i7) {
        Object[] objArr = this.f21496b;
        int i8 = i7 / 3;
        int i9 = i8 + i8;
        j5 j5Var = (j5) objArr[i9];
        if (j5Var != null) {
            return j5Var;
        }
        j5 b8 = g5.a().b((Class) objArr[i9 + 1]);
        objArr[i9] = b8;
        return b8;
    }

    private final Object L(int i7) {
        int i8 = i7 / 3;
        return this.f21496b[i8 + i8];
    }

    private final Object M(Object obj, int i7) {
        j5 K = K(i7);
        int H = H(i7) & 1048575;
        if (!r(obj, i7)) {
            return K.c();
        }
        Object object = f21494m.getObject(obj, H);
        if (u(object)) {
            return object;
        }
        Object c8 = K.c();
        if (object != null) {
            K.g(c8, object);
        }
        return c8;
    }

    private final Object N(Object obj, int i7, int i8) {
        j5 K = K(i8);
        if (!v(obj, i7, i8)) {
            return K.c();
        }
        Object object = f21494m.getObject(obj, H(i8) & 1048575);
        if (u(object)) {
            return object;
        }
        Object c8 = K.c();
        if (object != null) {
            K.g(c8, object);
        }
        return c8;
    }

    private static Field O(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e8) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e8);
        }
    }

    private static void j(Object obj) {
        if (!u(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void k(Object obj, Object obj2, int i7) {
        if (r(obj2, i7)) {
            int H = H(i7) & 1048575;
            Unsafe unsafe = f21494m;
            long j7 = H;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f21495a[i7] + " is present but null: " + obj2.toString());
            }
            j5 K = K(i7);
            if (!r(obj, i7)) {
                if (u(object)) {
                    Object c8 = K.c();
                    K.g(c8, object);
                    unsafe.putObject(obj, j7, c8);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                m(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!u(object2)) {
                Object c9 = K.c();
                K.g(c9, object2);
                unsafe.putObject(obj, j7, c9);
                object2 = c9;
            }
            K.g(object2, object);
        }
    }

    private final void l(Object obj, Object obj2, int i7) {
        int[] iArr = this.f21495a;
        int i8 = iArr[i7];
        if (v(obj2, i8, i7)) {
            int H = H(i7) & 1048575;
            Unsafe unsafe = f21494m;
            long j7 = H;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i7] + " is present but null: " + obj2.toString());
            }
            j5 K = K(i7);
            if (!v(obj, i8, i7)) {
                if (u(object)) {
                    Object c8 = K.c();
                    K.g(c8, object);
                    unsafe.putObject(obj, j7, c8);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                n(obj, i8, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!u(object2)) {
                Object c9 = K.c();
                K.g(c9, object2);
                unsafe.putObject(obj, j7, c9);
                object2 = c9;
            }
            K.g(object2, object);
        }
    }

    private final void m(Object obj, int i7) {
        int E = E(i7);
        long j7 = 1048575 & E;
        if (j7 == 1048575) {
            return;
        }
        w5.v(obj, j7, (1 << (E >>> 20)) | w5.h(obj, j7));
    }

    private final void n(Object obj, int i7, int i8) {
        w5.v(obj, E(i8) & 1048575, i7);
    }

    private final void o(Object obj, int i7, Object obj2) {
        f21494m.putObject(obj, H(i7) & 1048575, obj2);
        m(obj, i7);
    }

    private final void p(Object obj, int i7, int i8, Object obj2) {
        f21494m.putObject(obj, H(i8) & 1048575, obj2);
        n(obj, i7, i8);
    }

    private final boolean q(Object obj, Object obj2, int i7) {
        return r(obj, i7) == r(obj2, i7);
    }

    private final boolean r(Object obj, int i7) {
        int E = E(i7);
        long j7 = E & 1048575;
        if (j7 != 1048575) {
            return (w5.h(obj, j7) & (1 << (E >>> 20))) != 0;
        }
        int H = H(i7);
        long j8 = H & 1048575;
        switch (G(H)) {
            case 0:
                return Double.doubleToRawLongBits(w5.f(obj, j8)) != 0;
            case 1:
                return Float.floatToRawIntBits(w5.g(obj, j8)) != 0;
            case 2:
                return w5.i(obj, j8) != 0;
            case 3:
                return w5.i(obj, j8) != 0;
            case 4:
                return w5.h(obj, j8) != 0;
            case 5:
                return w5.i(obj, j8) != 0;
            case 6:
                return w5.h(obj, j8) != 0;
            case 7:
                return w5.B(obj, j8);
            case 8:
                Object k7 = w5.k(obj, j8);
                if (k7 instanceof String) {
                    return !((String) k7).isEmpty();
                }
                if (k7 instanceof i3) {
                    return !i3.f21564r.equals(k7);
                }
                throw new IllegalArgumentException();
            case 9:
                return w5.k(obj, j8) != null;
            case 10:
                return !i3.f21564r.equals(w5.k(obj, j8));
            case 11:
                return w5.h(obj, j8) != 0;
            case 12:
                return w5.h(obj, j8) != 0;
            case 13:
                return w5.h(obj, j8) != 0;
            case 14:
                return w5.i(obj, j8) != 0;
            case 15:
                return w5.h(obj, j8) != 0;
            case 16:
                return w5.i(obj, j8) != 0;
            case 17:
                return w5.k(obj, j8) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean s(Object obj, int i7, int i8, int i9, int i10) {
        return i8 == 1048575 ? r(obj, i7) : (i9 & i10) != 0;
    }

    private static boolean t(Object obj, int i7, j5 j5Var) {
        return j5Var.e(w5.k(obj, i7 & 1048575));
    }

    private static boolean u(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof d4) {
            return ((d4) obj).A();
        }
        return true;
    }

    private final boolean v(Object obj, int i7, int i8) {
        return w5.h(obj, (long) (E(i8) & 1048575)) == i7;
    }

    private static boolean w(Object obj, long j7) {
        return ((Boolean) w5.k(obj, j7)).booleanValue();
    }

    private static final void x(int i7, Object obj, a6 a6Var) {
        if (obj instanceof String) {
            a6Var.r(i7, (String) obj);
        } else {
            a6Var.t(i7, (i3) obj);
        }
    }

    static q5 z(Object obj) {
        d4 d4Var = (d4) obj;
        q5 q5Var = d4Var.zzc;
        if (q5Var != q5.c()) {
            return q5Var;
        }
        q5 f8 = q5.f();
        d4Var.zzc = f8;
        return f8;
    }

    @Override // com.google.android.gms.internal.play_billing.j5
    public final void a(Object obj, a6 a6Var) {
        Throwable th;
        int i7;
        c5 c5Var = this;
        if (c5Var.f21500f) {
            android.support.v4.media.session.b.a(obj);
            throw null;
        }
        int[] iArr = c5Var.f21495a;
        Unsafe unsafe = f21494m;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i10 < iArr.length) {
            int H = c5Var.H(i10);
            int G = G(H);
            int i12 = iArr[i10];
            if (G <= 17) {
                int i13 = iArr[i10 + 2];
                th = null;
                int i14 = i13 & i8;
                if (i14 != i9) {
                    i11 = i14 == i8 ? 0 : unsafe.getInt(obj, i14);
                    i9 = i14;
                }
                i7 = 1 << (i13 >>> 20);
            } else {
                th = null;
                i7 = 0;
            }
            long j7 = H & i8;
            switch (G) {
                case 0:
                    if (c5Var.s(obj, i10, i9, i11, i7)) {
                        a6Var.i(i12, w5.f(obj, j7));
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 1:
                    if (c5Var.s(obj, i10, i9, i11, i7)) {
                        a6Var.A(i12, w5.g(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 2:
                    if (c5Var.s(obj, i10, i9, i11, i7)) {
                        a6Var.u(i12, unsafe.getLong(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 3:
                    if (c5Var.s(obj, i10, i9, i11, i7)) {
                        a6Var.I(i12, unsafe.getLong(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 4:
                    if (c5Var.s(obj, i10, i9, i11, i7)) {
                        a6Var.x(i12, unsafe.getInt(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 5:
                    if (c5Var.s(obj, i10, i9, i11, i7)) {
                        a6Var.G(i12, unsafe.getLong(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 6:
                    if (c5Var.s(obj, i10, i9, i11, i7)) {
                        a6Var.b(i12, unsafe.getInt(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 7:
                    if (c5Var.s(obj, i10, i9, i11, i7)) {
                        a6Var.l(i12, w5.B(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 8:
                    if (c5Var.s(obj, i10, i9, i11, i7)) {
                        x(i12, unsafe.getObject(obj, j7), a6Var);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 9:
                    if (c5Var.s(obj, i10, i9, i11, i7)) {
                        a6Var.z(i12, unsafe.getObject(obj, j7), c5Var.K(i10));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 10:
                    if (c5Var.s(obj, i10, i9, i11, i7)) {
                        a6Var.t(i12, (i3) unsafe.getObject(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 11:
                    if (c5Var.s(obj, i10, i9, i11, i7)) {
                        a6Var.s(i12, unsafe.getInt(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 12:
                    if (c5Var.s(obj, i10, i9, i11, i7)) {
                        a6Var.d(i12, unsafe.getInt(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 13:
                    if (c5Var.s(obj, i10, i9, i11, i7)) {
                        a6Var.C(i12, unsafe.getInt(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 14:
                    if (c5Var.s(obj, i10, i9, i11, i7)) {
                        a6Var.w(i12, unsafe.getLong(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 15:
                    if (c5Var.s(obj, i10, i9, i11, i7)) {
                        a6Var.E(i12, unsafe.getInt(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 16:
                    if (c5Var.s(obj, i10, i9, i11, i7)) {
                        a6Var.y(i12, unsafe.getLong(obj, j7));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 17:
                    if (c5Var.s(obj, i10, i9, i11, i7)) {
                        a6Var.c(i12, unsafe.getObject(obj, j7), c5Var.K(i10));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 18:
                    l5.w(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 19:
                    l5.A(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 20:
                    l5.C(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 21:
                    l5.d(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 22:
                    l5.B(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 23:
                    l5.z(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 24:
                    l5.y(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 25:
                    l5.v(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 26:
                    int i15 = iArr[i10];
                    List list = (List) unsafe.getObject(obj, j7);
                    int i16 = l5.f21607b;
                    if (list != null && !list.isEmpty()) {
                        a6Var.H(i15, list);
                        break;
                    }
                    break;
                case 27:
                    int i17 = iArr[i10];
                    List list2 = (List) unsafe.getObject(obj, j7);
                    j5 K = c5Var.K(i10);
                    int i18 = l5.f21607b;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i19 = 0; i19 < list2.size(); i19++) {
                            ((q3) a6Var).z(i17, list2.get(i19), K);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i20 = iArr[i10];
                    List list3 = (List) unsafe.getObject(obj, j7);
                    int i21 = l5.f21607b;
                    if (list3 != null && !list3.isEmpty()) {
                        a6Var.e(i20, list3);
                        break;
                    }
                    break;
                case 29:
                    l5.c(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 30:
                    l5.x(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 31:
                    l5.D(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 32:
                    l5.E(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 33:
                    l5.a(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 34:
                    l5.b(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, false);
                    continue;
                    i10 += 3;
                    i8 = 1048575;
                    c5Var = this;
                case 35:
                    l5.w(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, true);
                    break;
                case androidx.constraintlayout.widget.h.f1530y1 /* 36 */:
                    l5.A(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, true);
                    break;
                case 37:
                    l5.C(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, true);
                    break;
                case androidx.constraintlayout.widget.h.f1478r5 /* 38 */:
                    l5.d(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, true);
                    break;
                case androidx.constraintlayout.widget.h.f1486s5 /* 39 */:
                    l5.B(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, true);
                    break;
                case androidx.constraintlayout.widget.h.f1494t5 /* 40 */:
                    l5.z(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, true);
                    break;
                case androidx.constraintlayout.widget.h.f1502u5 /* 41 */:
                    l5.y(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, true);
                    break;
                case androidx.constraintlayout.widget.h.f1510v5 /* 42 */:
                    l5.v(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, true);
                    break;
                case androidx.constraintlayout.widget.h.f1518w5 /* 43 */:
                    l5.c(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, true);
                    break;
                case androidx.constraintlayout.widget.h.f1526x5 /* 44 */:
                    l5.x(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, true);
                    break;
                case androidx.constraintlayout.widget.h.f1534y5 /* 45 */:
                    l5.D(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, true);
                    break;
                case androidx.constraintlayout.widget.h.f1542z5 /* 46 */:
                    l5.E(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, true);
                    break;
                case androidx.constraintlayout.widget.h.A5 /* 47 */:
                    l5.a(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, true);
                    break;
                case androidx.constraintlayout.widget.h.B5 /* 48 */:
                    l5.b(iArr[i10], (List) unsafe.getObject(obj, j7), a6Var, true);
                    break;
                case androidx.constraintlayout.widget.h.C5 /* 49 */:
                    int i22 = iArr[i10];
                    List list4 = (List) unsafe.getObject(obj, j7);
                    j5 K2 = c5Var.K(i10);
                    int i23 = l5.f21607b;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i24 = 0; i24 < list4.size(); i24++) {
                            ((q3) a6Var).c(i22, list4.get(i24), K2);
                        }
                        break;
                    }
                    break;
                case androidx.constraintlayout.widget.h.D5 /* 50 */:
                    if (unsafe.getObject(obj, j7) != null) {
                        android.support.v4.media.session.b.a(c5Var.L(i10));
                        throw th;
                    }
                    break;
                case androidx.constraintlayout.widget.h.E5 /* 51 */:
                    if (c5Var.v(obj, i12, i10)) {
                        a6Var.i(i12, B(obj, j7));
                        break;
                    }
                    break;
                case androidx.constraintlayout.widget.h.F5 /* 52 */:
                    if (c5Var.v(obj, i12, i10)) {
                        a6Var.A(i12, C(obj, j7));
                        break;
                    }
                    break;
                case androidx.constraintlayout.widget.h.G5 /* 53 */:
                    if (c5Var.v(obj, i12, i10)) {
                        a6Var.u(i12, I(obj, j7));
                        break;
                    }
                    break;
                case 54:
                    if (c5Var.v(obj, i12, i10)) {
                        a6Var.I(i12, I(obj, j7));
                        break;
                    }
                    break;
                case 55:
                    if (c5Var.v(obj, i12, i10)) {
                        a6Var.x(i12, D(obj, j7));
                        break;
                    }
                    break;
                case 56:
                    if (c5Var.v(obj, i12, i10)) {
                        a6Var.G(i12, I(obj, j7));
                        break;
                    }
                    break;
                case 57:
                    if (c5Var.v(obj, i12, i10)) {
                        a6Var.b(i12, D(obj, j7));
                        break;
                    }
                    break;
                case 58:
                    if (c5Var.v(obj, i12, i10)) {
                        a6Var.l(i12, w(obj, j7));
                        break;
                    }
                    break;
                case 59:
                    if (c5Var.v(obj, i12, i10)) {
                        x(i12, unsafe.getObject(obj, j7), a6Var);
                        break;
                    }
                    break;
                case 60:
                    if (c5Var.v(obj, i12, i10)) {
                        a6Var.z(i12, unsafe.getObject(obj, j7), c5Var.K(i10));
                        break;
                    }
                    break;
                case 61:
                    if (c5Var.v(obj, i12, i10)) {
                        a6Var.t(i12, (i3) unsafe.getObject(obj, j7));
                        break;
                    }
                    break;
                case 62:
                    if (c5Var.v(obj, i12, i10)) {
                        a6Var.s(i12, D(obj, j7));
                        break;
                    }
                    break;
                case 63:
                    if (c5Var.v(obj, i12, i10)) {
                        a6Var.d(i12, D(obj, j7));
                        break;
                    }
                    break;
                case 64:
                    if (c5Var.v(obj, i12, i10)) {
                        a6Var.C(i12, D(obj, j7));
                        break;
                    }
                    break;
                case 65:
                    if (c5Var.v(obj, i12, i10)) {
                        a6Var.w(i12, I(obj, j7));
                        break;
                    }
                    break;
                case 66:
                    if (c5Var.v(obj, i12, i10)) {
                        a6Var.E(i12, D(obj, j7));
                        break;
                    }
                    break;
                case 67:
                    if (c5Var.v(obj, i12, i10)) {
                        a6Var.y(i12, I(obj, j7));
                        break;
                    }
                    break;
                case 68:
                    if (c5Var.v(obj, i12, i10)) {
                        a6Var.c(i12, unsafe.getObject(obj, j7), c5Var.K(i10));
                        break;
                    }
                    break;
            }
            i10 += 3;
            i8 = 1048575;
            c5Var = this;
        }
        ((d4) obj).zzc.k(a6Var);
    }

    @Override // com.google.android.gms.internal.play_billing.j5
    public final int b(Object obj) {
        int i7;
        long doubleToLongBits;
        int floatToIntBits;
        int i8;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f21495a;
            if (i9 >= iArr.length) {
                int hashCode = (i10 * 53) + ((d4) obj).zzc.hashCode();
                if (!this.f21500f) {
                    return hashCode;
                }
                android.support.v4.media.session.b.a(obj);
                throw null;
            }
            int H = H(i9);
            int i11 = 1048575 & H;
            int G = G(H);
            int i12 = iArr[i9];
            long j7 = i11;
            int i13 = 37;
            switch (G) {
                case 0:
                    i7 = i10 * 53;
                    doubleToLongBits = Double.doubleToLongBits(w5.f(obj, j7));
                    byte[] bArr = j4.f21586b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + floatToIntBits;
                    break;
                case 1:
                    i7 = i10 * 53;
                    floatToIntBits = Float.floatToIntBits(w5.g(obj, j7));
                    i10 = i7 + floatToIntBits;
                    break;
                case 2:
                    i7 = i10 * 53;
                    doubleToLongBits = w5.i(obj, j7);
                    byte[] bArr2 = j4.f21586b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + floatToIntBits;
                    break;
                case 3:
                    i7 = i10 * 53;
                    doubleToLongBits = w5.i(obj, j7);
                    byte[] bArr3 = j4.f21586b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + floatToIntBits;
                    break;
                case 4:
                    i7 = i10 * 53;
                    floatToIntBits = w5.h(obj, j7);
                    i10 = i7 + floatToIntBits;
                    break;
                case 5:
                    i7 = i10 * 53;
                    doubleToLongBits = w5.i(obj, j7);
                    byte[] bArr4 = j4.f21586b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + floatToIntBits;
                    break;
                case 6:
                    i7 = i10 * 53;
                    floatToIntBits = w5.h(obj, j7);
                    i10 = i7 + floatToIntBits;
                    break;
                case 7:
                    i7 = i10 * 53;
                    floatToIntBits = j4.a(w5.B(obj, j7));
                    i10 = i7 + floatToIntBits;
                    break;
                case 8:
                    i7 = i10 * 53;
                    floatToIntBits = ((String) w5.k(obj, j7)).hashCode();
                    i10 = i7 + floatToIntBits;
                    break;
                case 9:
                    i8 = i10 * 53;
                    Object k7 = w5.k(obj, j7);
                    if (k7 != null) {
                        i13 = k7.hashCode();
                    }
                    i10 = i8 + i13;
                    break;
                case 10:
                    i7 = i10 * 53;
                    floatToIntBits = w5.k(obj, j7).hashCode();
                    i10 = i7 + floatToIntBits;
                    break;
                case 11:
                    i7 = i10 * 53;
                    floatToIntBits = w5.h(obj, j7);
                    i10 = i7 + floatToIntBits;
                    break;
                case 12:
                    i7 = i10 * 53;
                    floatToIntBits = w5.h(obj, j7);
                    i10 = i7 + floatToIntBits;
                    break;
                case 13:
                    i7 = i10 * 53;
                    floatToIntBits = w5.h(obj, j7);
                    i10 = i7 + floatToIntBits;
                    break;
                case 14:
                    i7 = i10 * 53;
                    doubleToLongBits = w5.i(obj, j7);
                    byte[] bArr5 = j4.f21586b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + floatToIntBits;
                    break;
                case 15:
                    i7 = i10 * 53;
                    floatToIntBits = w5.h(obj, j7);
                    i10 = i7 + floatToIntBits;
                    break;
                case 16:
                    i7 = i10 * 53;
                    doubleToLongBits = w5.i(obj, j7);
                    byte[] bArr6 = j4.f21586b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + floatToIntBits;
                    break;
                case 17:
                    i8 = i10 * 53;
                    Object k8 = w5.k(obj, j7);
                    if (k8 != null) {
                        i13 = k8.hashCode();
                    }
                    i10 = i8 + i13;
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
                    i7 = i10 * 53;
                    floatToIntBits = w5.k(obj, j7).hashCode();
                    i10 = i7 + floatToIntBits;
                    break;
                case androidx.constraintlayout.widget.h.D5 /* 50 */:
                    i7 = i10 * 53;
                    floatToIntBits = w5.k(obj, j7).hashCode();
                    i10 = i7 + floatToIntBits;
                    break;
                case androidx.constraintlayout.widget.h.E5 /* 51 */:
                    if (!v(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        doubleToLongBits = Double.doubleToLongBits(B(obj, j7));
                        byte[] bArr7 = j4.f21586b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case androidx.constraintlayout.widget.h.F5 /* 52 */:
                    if (!v(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = Float.floatToIntBits(C(obj, j7));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case androidx.constraintlayout.widget.h.G5 /* 53 */:
                    if (!v(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        doubleToLongBits = I(obj, j7);
                        byte[] bArr8 = j4.f21586b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 54:
                    if (!v(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        doubleToLongBits = I(obj, j7);
                        byte[] bArr9 = j4.f21586b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 55:
                    if (!v(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = D(obj, j7);
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 56:
                    if (!v(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        doubleToLongBits = I(obj, j7);
                        byte[] bArr10 = j4.f21586b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 57:
                    if (!v(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = D(obj, j7);
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 58:
                    if (!v(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = j4.a(w(obj, j7));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 59:
                    if (!v(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = ((String) w5.k(obj, j7)).hashCode();
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!v(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = w5.k(obj, j7).hashCode();
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!v(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = w5.k(obj, j7).hashCode();
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!v(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = D(obj, j7);
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 63:
                    if (!v(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = D(obj, j7);
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!v(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = D(obj, j7);
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 65:
                    if (!v(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        doubleToLongBits = I(obj, j7);
                        byte[] bArr11 = j4.f21586b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 66:
                    if (!v(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = D(obj, j7);
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!v(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        doubleToLongBits = I(obj, j7);
                        byte[] bArr12 = j4.f21586b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 68:
                    if (!v(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = w5.k(obj, j7).hashCode();
                        i10 = i7 + floatToIntBits;
                        break;
                    }
            }
            i9 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.j5
    public final Object c() {
        return ((d4) this.f21499e).q();
    }

    @Override // com.google.android.gms.internal.play_billing.j5
    public final int d(Object obj) {
        int i7;
        int c8;
        int c9;
        int d8;
        int c10;
        int c11;
        int c12;
        int g8;
        int c13;
        int m7;
        int l7;
        int size;
        int q7;
        int c14;
        int c15;
        int c16;
        int i8;
        int j7;
        int c17;
        int c18;
        int i9;
        int c19;
        int c20;
        int c21;
        int g9;
        int c22;
        c5 c5Var = this;
        Object obj2 = obj;
        Unsafe unsafe = f21494m;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (true) {
            int[] iArr = c5Var.f21495a;
            if (i10 >= iArr.length) {
                int a8 = i12 + ((d4) obj).zzc.a();
                if (!c5Var.f21500f) {
                    return a8;
                }
                android.support.v4.media.session.b.a(obj);
                throw null;
            }
            int H = c5Var.H(i10);
            int G = G(H);
            int i14 = iArr[i10];
            int i15 = iArr[i10 + 2];
            int i16 = i15 & 1048575;
            if (G <= 17) {
                if (i16 != i13) {
                    i11 = i16 == 1048575 ? 0 : unsafe.getInt(obj2, i16);
                    i13 = i16;
                }
                i7 = 1 << (i15 >>> 20);
            } else {
                i7 = 0;
            }
            int i17 = H & 1048575;
            if (G >= y3.f21790a0.a()) {
                y3.f21803n0.a();
            }
            long j8 = i17;
            switch (G) {
                case 0:
                    if (c5Var.s(obj2, i10, i13, i11, i7)) {
                        i12 += p3.c(i14 << 3) + 8;
                    }
                    i10 += 3;
                    obj2 = obj;
                case 1:
                    if (c5Var.s(obj2, i10, i13, i11, i7)) {
                        c8 = p3.c(i14 << 3);
                        c11 = c8 + 4;
                        i12 += c11;
                    }
                    c5Var = this;
                    i10 += 3;
                    obj2 = obj;
                case 2:
                    if (c5Var.s(obj2, i10, i13, i11, i7)) {
                        long j9 = unsafe.getLong(obj2, j8);
                        c9 = p3.c(i14 << 3);
                        d8 = p3.d(j9);
                        c11 = c9 + d8;
                        i12 += c11;
                    }
                    c5Var = this;
                    i10 += 3;
                    obj2 = obj;
                case 3:
                    if (c5Var.s(obj2, i10, i13, i11, i7)) {
                        long j10 = unsafe.getLong(obj2, j8);
                        c9 = p3.c(i14 << 3);
                        d8 = p3.d(j10);
                        c11 = c9 + d8;
                        i12 += c11;
                    }
                    c5Var = this;
                    i10 += 3;
                    obj2 = obj;
                case 4:
                    if (c5Var.s(obj2, i10, i13, i11, i7)) {
                        long j11 = unsafe.getInt(obj2, j8);
                        c9 = p3.c(i14 << 3);
                        d8 = p3.d(j11);
                        c11 = c9 + d8;
                        i12 += c11;
                    }
                    c5Var = this;
                    i10 += 3;
                    obj2 = obj;
                case 5:
                    if (c5Var.s(obj2, i10, i13, i11, i7)) {
                        c10 = p3.c(i14 << 3);
                        c11 = c10 + 8;
                        i12 += c11;
                    }
                    c5Var = this;
                    i10 += 3;
                    obj2 = obj;
                case 6:
                    if (c5Var.s(obj2, i10, i13, i11, i7)) {
                        c8 = p3.c(i14 << 3);
                        c11 = c8 + 4;
                        i12 += c11;
                    }
                    c5Var = this;
                    i10 += 3;
                    obj2 = obj;
                case 7:
                    if (c5Var.s(obj2, i10, i13, i11, i7)) {
                        c11 = p3.c(i14 << 3) + 1;
                        i12 += c11;
                    }
                    c5Var = this;
                    i10 += 3;
                    obj2 = obj;
                case 8:
                    if (c5Var.s(obj2, i10, i13, i11, i7)) {
                        int i18 = i14 << 3;
                        Object object = unsafe.getObject(obj2, j8);
                        if (object instanceof i3) {
                            c12 = p3.c(i18);
                            g8 = ((i3) object).g();
                            c13 = p3.c(g8);
                            c11 = c12 + c13 + g8;
                            i12 += c11;
                        } else {
                            c9 = p3.c(i18);
                            d8 = p3.b((String) object);
                            c11 = c9 + d8;
                            i12 += c11;
                        }
                    }
                    c5Var = this;
                    i10 += 3;
                    obj2 = obj;
                case 9:
                    if (c5Var.s(obj2, i10, i13, i11, i7)) {
                        m7 = l5.m(i14, unsafe.getObject(obj2, j8), c5Var.K(i10));
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case 10:
                    if (c5Var.s(obj2, i10, i13, i11, i7)) {
                        i3 i3Var = (i3) unsafe.getObject(obj2, j8);
                        c12 = p3.c(i14 << 3);
                        g8 = i3Var.g();
                        c13 = p3.c(g8);
                        c11 = c12 + c13 + g8;
                        i12 += c11;
                    }
                    c5Var = this;
                    i10 += 3;
                    obj2 = obj;
                case 11:
                    if (c5Var.s(obj2, i10, i13, i11, i7)) {
                        int i19 = unsafe.getInt(obj2, j8);
                        c9 = p3.c(i14 << 3);
                        d8 = p3.c(i19);
                        c11 = c9 + d8;
                        i12 += c11;
                    }
                    c5Var = this;
                    i10 += 3;
                    obj2 = obj;
                case 12:
                    if (c5Var.s(obj2, i10, i13, i11, i7)) {
                        long j12 = unsafe.getInt(obj2, j8);
                        c9 = p3.c(i14 << 3);
                        d8 = p3.d(j12);
                        c11 = c9 + d8;
                        i12 += c11;
                    }
                    c5Var = this;
                    i10 += 3;
                    obj2 = obj;
                case 13:
                    if (c5Var.s(obj2, i10, i13, i11, i7)) {
                        c8 = p3.c(i14 << 3);
                        c11 = c8 + 4;
                        i12 += c11;
                    }
                    c5Var = this;
                    i10 += 3;
                    obj2 = obj;
                case 14:
                    if (c5Var.s(obj2, i10, i13, i11, i7)) {
                        c10 = p3.c(i14 << 3);
                        c11 = c10 + 8;
                        i12 += c11;
                    }
                    c5Var = this;
                    i10 += 3;
                    obj2 = obj;
                case 15:
                    if (c5Var.s(obj2, i10, i13, i11, i7)) {
                        int i20 = unsafe.getInt(obj2, j8);
                        c9 = p3.c(i14 << 3);
                        d8 = p3.c((i20 >> 31) ^ (i20 + i20));
                        c11 = c9 + d8;
                        i12 += c11;
                    }
                    c5Var = this;
                    i10 += 3;
                    obj2 = obj;
                case 16:
                    if (c5Var.s(obj2, i10, i13, i11, i7)) {
                        long j13 = unsafe.getLong(obj2, j8);
                        c9 = p3.c(i14 << 3);
                        d8 = p3.d((j13 >> 63) ^ (j13 + j13));
                        c11 = c9 + d8;
                        i12 += c11;
                    }
                    c5Var = this;
                    i10 += 3;
                    obj2 = obj;
                case 17:
                    if (c5Var.s(obj2, i10, i13, i11, i7)) {
                        m7 = p3.z(i14, (z4) unsafe.getObject(obj2, j8), c5Var.K(i10));
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case 18:
                    m7 = l5.i(i14, (List) unsafe.getObject(obj2, j8), false);
                    i12 += m7;
                    i10 += 3;
                    obj2 = obj;
                case 19:
                    m7 = l5.g(i14, (List) unsafe.getObject(obj2, j8), false);
                    i12 += m7;
                    i10 += 3;
                    obj2 = obj;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j8);
                    int i21 = l5.f21607b;
                    if (list.size() != 0) {
                        l7 = l5.l(list) + (list.size() * p3.c(i14 << 3));
                        i12 += l7;
                        i10 += 3;
                        obj2 = obj;
                    }
                    l7 = 0;
                    i12 += l7;
                    i10 += 3;
                    obj2 = obj;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j8);
                    int i22 = l5.f21607b;
                    size = list2.size();
                    if (size != 0) {
                        q7 = l5.q(list2);
                        c14 = p3.c(i14 << 3);
                        i8 = size * c14;
                        m7 = q7 + i8;
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    }
                    m7 = 0;
                    i12 += m7;
                    i10 += 3;
                    obj2 = obj;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j8);
                    int i23 = l5.f21607b;
                    size = list3.size();
                    if (size != 0) {
                        q7 = l5.k(list3);
                        c14 = p3.c(i14 << 3);
                        i8 = size * c14;
                        m7 = q7 + i8;
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    }
                    m7 = 0;
                    i12 += m7;
                    i10 += 3;
                    obj2 = obj;
                case 23:
                    m7 = l5.i(i14, (List) unsafe.getObject(obj2, j8), false);
                    i12 += m7;
                    i10 += 3;
                    obj2 = obj;
                case 24:
                    m7 = l5.g(i14, (List) unsafe.getObject(obj2, j8), false);
                    i12 += m7;
                    i10 += 3;
                    obj2 = obj;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j8);
                    int i24 = l5.f21607b;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        m7 = size2 * (p3.c(i14 << 3) + 1);
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    }
                    m7 = 0;
                    i12 += m7;
                    i10 += 3;
                    obj2 = obj;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j8);
                    int i25 = l5.f21607b;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        l7 = p3.c(i14 << 3) * size3;
                        for (int i26 = 0; i26 < size3; i26++) {
                            Object obj3 = list5.get(i26);
                            if (obj3 instanceof i3) {
                                int g10 = ((i3) obj3).g();
                                l7 += p3.c(g10) + g10;
                            } else {
                                l7 += p3.b((String) obj3);
                            }
                        }
                        i12 += l7;
                        i10 += 3;
                        obj2 = obj;
                    }
                    l7 = 0;
                    i12 += l7;
                    i10 += 3;
                    obj2 = obj;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j8);
                    j5 K = c5Var.K(i10);
                    int i27 = l5.f21607b;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        c15 = 0;
                    } else {
                        c15 = p3.c(i14 << 3) * size4;
                        for (int i28 = 0; i28 < size4; i28++) {
                            c15 += p3.a((z4) list6.get(i28), K);
                        }
                    }
                    i12 += c15;
                    i10 += 3;
                    obj2 = obj;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j8);
                    int i29 = l5.f21607b;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        c16 = 0;
                    } else {
                        c16 = size5 * p3.c(i14 << 3);
                        for (int i30 = 0; i30 < list7.size(); i30++) {
                            int g11 = ((i3) list7.get(i30)).g();
                            c16 += p3.c(g11) + g11;
                        }
                    }
                    i12 += c16;
                    i10 += 3;
                    obj2 = obj;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j8);
                    int i31 = l5.f21607b;
                    size = list8.size();
                    if (size != 0) {
                        q7 = l5.p(list8);
                        c14 = p3.c(i14 << 3);
                        i8 = size * c14;
                        m7 = q7 + i8;
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    }
                    m7 = 0;
                    i12 += m7;
                    i10 += 3;
                    obj2 = obj;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j8);
                    int i32 = l5.f21607b;
                    size = list9.size();
                    if (size != 0) {
                        q7 = l5.f(list9);
                        c14 = p3.c(i14 << 3);
                        i8 = size * c14;
                        m7 = q7 + i8;
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    }
                    m7 = 0;
                    i12 += m7;
                    i10 += 3;
                    obj2 = obj;
                case 31:
                    m7 = l5.g(i14, (List) unsafe.getObject(obj2, j8), false);
                    i12 += m7;
                    i10 += 3;
                    obj2 = obj;
                case 32:
                    m7 = l5.i(i14, (List) unsafe.getObject(obj2, j8), false);
                    i12 += m7;
                    i10 += 3;
                    obj2 = obj;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j8);
                    int i33 = l5.f21607b;
                    size = list10.size();
                    if (size != 0) {
                        q7 = l5.n(list10);
                        c14 = p3.c(i14 << 3);
                        i8 = size * c14;
                        m7 = q7 + i8;
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    }
                    m7 = 0;
                    i12 += m7;
                    i10 += 3;
                    obj2 = obj;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j8);
                    int i34 = l5.f21607b;
                    size = list11.size();
                    if (size != 0) {
                        q7 = l5.o(list11);
                        c14 = p3.c(i14 << 3);
                        i8 = size * c14;
                        m7 = q7 + i8;
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    }
                    m7 = 0;
                    i12 += m7;
                    i10 += 3;
                    obj2 = obj;
                case 35:
                    j7 = l5.j((List) unsafe.getObject(obj2, j8));
                    if (j7 > 0) {
                        c17 = p3.c(i14 << 3);
                        c18 = p3.c(j7);
                        c16 = c17 + c18 + j7;
                        i12 += c16;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case androidx.constraintlayout.widget.h.f1530y1 /* 36 */:
                    j7 = l5.h((List) unsafe.getObject(obj2, j8));
                    if (j7 > 0) {
                        c17 = p3.c(i14 << 3);
                        c18 = p3.c(j7);
                        c16 = c17 + c18 + j7;
                        i12 += c16;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case 37:
                    j7 = l5.l((List) unsafe.getObject(obj2, j8));
                    if (j7 > 0) {
                        c17 = p3.c(i14 << 3);
                        c18 = p3.c(j7);
                        c16 = c17 + c18 + j7;
                        i12 += c16;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case androidx.constraintlayout.widget.h.f1478r5 /* 38 */:
                    j7 = l5.q((List) unsafe.getObject(obj2, j8));
                    if (j7 > 0) {
                        c17 = p3.c(i14 << 3);
                        c18 = p3.c(j7);
                        c16 = c17 + c18 + j7;
                        i12 += c16;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case androidx.constraintlayout.widget.h.f1486s5 /* 39 */:
                    j7 = l5.k((List) unsafe.getObject(obj2, j8));
                    if (j7 > 0) {
                        c17 = p3.c(i14 << 3);
                        c18 = p3.c(j7);
                        c16 = c17 + c18 + j7;
                        i12 += c16;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case androidx.constraintlayout.widget.h.f1494t5 /* 40 */:
                    j7 = l5.j((List) unsafe.getObject(obj2, j8));
                    if (j7 > 0) {
                        c17 = p3.c(i14 << 3);
                        c18 = p3.c(j7);
                        c16 = c17 + c18 + j7;
                        i12 += c16;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case androidx.constraintlayout.widget.h.f1502u5 /* 41 */:
                    j7 = l5.h((List) unsafe.getObject(obj2, j8));
                    if (j7 > 0) {
                        c17 = p3.c(i14 << 3);
                        c18 = p3.c(j7);
                        c16 = c17 + c18 + j7;
                        i12 += c16;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case androidx.constraintlayout.widget.h.f1510v5 /* 42 */:
                    List list12 = (List) unsafe.getObject(obj2, j8);
                    int i35 = l5.f21607b;
                    j7 = list12.size();
                    if (j7 > 0) {
                        c17 = p3.c(i14 << 3);
                        c18 = p3.c(j7);
                        c16 = c17 + c18 + j7;
                        i12 += c16;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case androidx.constraintlayout.widget.h.f1518w5 /* 43 */:
                    j7 = l5.p((List) unsafe.getObject(obj2, j8));
                    if (j7 > 0) {
                        c17 = p3.c(i14 << 3);
                        c18 = p3.c(j7);
                        c16 = c17 + c18 + j7;
                        i12 += c16;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case androidx.constraintlayout.widget.h.f1526x5 /* 44 */:
                    j7 = l5.f((List) unsafe.getObject(obj2, j8));
                    if (j7 > 0) {
                        c17 = p3.c(i14 << 3);
                        c18 = p3.c(j7);
                        c16 = c17 + c18 + j7;
                        i12 += c16;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case androidx.constraintlayout.widget.h.f1534y5 /* 45 */:
                    j7 = l5.h((List) unsafe.getObject(obj2, j8));
                    if (j7 > 0) {
                        c17 = p3.c(i14 << 3);
                        c18 = p3.c(j7);
                        c16 = c17 + c18 + j7;
                        i12 += c16;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case androidx.constraintlayout.widget.h.f1542z5 /* 46 */:
                    j7 = l5.j((List) unsafe.getObject(obj2, j8));
                    if (j7 > 0) {
                        c17 = p3.c(i14 << 3);
                        c18 = p3.c(j7);
                        c16 = c17 + c18 + j7;
                        i12 += c16;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case androidx.constraintlayout.widget.h.A5 /* 47 */:
                    j7 = l5.n((List) unsafe.getObject(obj2, j8));
                    if (j7 > 0) {
                        c17 = p3.c(i14 << 3);
                        c18 = p3.c(j7);
                        c16 = c17 + c18 + j7;
                        i12 += c16;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case androidx.constraintlayout.widget.h.B5 /* 48 */:
                    j7 = l5.o((List) unsafe.getObject(obj2, j8));
                    if (j7 > 0) {
                        c17 = p3.c(i14 << 3);
                        c18 = p3.c(j7);
                        c16 = c17 + c18 + j7;
                        i12 += c16;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case androidx.constraintlayout.widget.h.C5 /* 49 */:
                    List list13 = (List) unsafe.getObject(obj2, j8);
                    j5 K2 = c5Var.K(i10);
                    int i36 = l5.f21607b;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i9 = 0;
                    } else {
                        i9 = 0;
                        for (int i37 = 0; i37 < size6; i37++) {
                            i9 += p3.z(i14, (z4) list13.get(i37), K2);
                        }
                    }
                    i12 += i9;
                    i10 += 3;
                    obj2 = obj;
                case androidx.constraintlayout.widget.h.D5 /* 50 */:
                    t4 t4Var = (t4) unsafe.getObject(obj2, j8);
                    android.support.v4.media.session.b.a(c5Var.L(i10));
                    if (t4Var.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = t4Var.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i10 += 3;
                    obj2 = obj;
                case androidx.constraintlayout.widget.h.E5 /* 51 */:
                    if (c5Var.v(obj2, i14, i10)) {
                        c19 = p3.c(i14 << 3);
                        m7 = c19 + 8;
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case androidx.constraintlayout.widget.h.F5 /* 52 */:
                    if (c5Var.v(obj2, i14, i10)) {
                        c20 = p3.c(i14 << 3);
                        m7 = c20 + 4;
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case androidx.constraintlayout.widget.h.G5 /* 53 */:
                    if (c5Var.v(obj2, i14, i10)) {
                        long I = I(obj2, j8);
                        q7 = p3.c(i14 << 3);
                        i8 = p3.d(I);
                        m7 = q7 + i8;
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case 54:
                    if (c5Var.v(obj2, i14, i10)) {
                        long I2 = I(obj2, j8);
                        q7 = p3.c(i14 << 3);
                        i8 = p3.d(I2);
                        m7 = q7 + i8;
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case 55:
                    if (c5Var.v(obj2, i14, i10)) {
                        long D = D(obj2, j8);
                        q7 = p3.c(i14 << 3);
                        i8 = p3.d(D);
                        m7 = q7 + i8;
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case 56:
                    if (c5Var.v(obj2, i14, i10)) {
                        c19 = p3.c(i14 << 3);
                        m7 = c19 + 8;
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case 57:
                    if (c5Var.v(obj2, i14, i10)) {
                        c20 = p3.c(i14 << 3);
                        m7 = c20 + 4;
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case 58:
                    if (c5Var.v(obj2, i14, i10)) {
                        m7 = p3.c(i14 << 3) + 1;
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case 59:
                    if (c5Var.v(obj2, i14, i10)) {
                        int i38 = i14 << 3;
                        Object object2 = unsafe.getObject(obj2, j8);
                        if (object2 instanceof i3) {
                            c21 = p3.c(i38);
                            g9 = ((i3) object2).g();
                            c22 = p3.c(g9);
                            m7 = c21 + c22 + g9;
                            i12 += m7;
                            i10 += 3;
                            obj2 = obj;
                        } else {
                            q7 = p3.c(i38);
                            i8 = p3.b((String) object2);
                            m7 = q7 + i8;
                            i12 += m7;
                            i10 += 3;
                            obj2 = obj;
                        }
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case 60:
                    if (c5Var.v(obj2, i14, i10)) {
                        m7 = l5.m(i14, unsafe.getObject(obj2, j8), c5Var.K(i10));
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case 61:
                    if (c5Var.v(obj2, i14, i10)) {
                        i3 i3Var2 = (i3) unsafe.getObject(obj2, j8);
                        c21 = p3.c(i14 << 3);
                        g9 = i3Var2.g();
                        c22 = p3.c(g9);
                        m7 = c21 + c22 + g9;
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case 62:
                    if (c5Var.v(obj2, i14, i10)) {
                        int D2 = D(obj2, j8);
                        q7 = p3.c(i14 << 3);
                        i8 = p3.c(D2);
                        m7 = q7 + i8;
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case 63:
                    if (c5Var.v(obj2, i14, i10)) {
                        long D3 = D(obj2, j8);
                        q7 = p3.c(i14 << 3);
                        i8 = p3.d(D3);
                        m7 = q7 + i8;
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case 64:
                    if (c5Var.v(obj2, i14, i10)) {
                        c20 = p3.c(i14 << 3);
                        m7 = c20 + 4;
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case 65:
                    if (c5Var.v(obj2, i14, i10)) {
                        c19 = p3.c(i14 << 3);
                        m7 = c19 + 8;
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case 66:
                    if (c5Var.v(obj2, i14, i10)) {
                        int D4 = D(obj2, j8);
                        q7 = p3.c(i14 << 3);
                        i8 = p3.c((D4 >> 31) ^ (D4 + D4));
                        m7 = q7 + i8;
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case 67:
                    if (c5Var.v(obj2, i14, i10)) {
                        long I3 = I(obj2, j8);
                        q7 = p3.c(i14 << 3);
                        i8 = p3.d((I3 >> 63) ^ (I3 + I3));
                        m7 = q7 + i8;
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                case 68:
                    if (c5Var.v(obj2, i14, i10)) {
                        m7 = p3.z(i14, (z4) unsafe.getObject(obj2, j8), c5Var.K(i10));
                        i12 += m7;
                        i10 += 3;
                        obj2 = obj;
                    } else {
                        i10 += 3;
                        obj2 = obj;
                    }
                default:
                    i10 += 3;
                    obj2 = obj;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.j5
    public final boolean e(Object obj) {
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (i11 < this.f21502h) {
            int[] iArr = this.f21501g;
            int[] iArr2 = this.f21495a;
            int i13 = iArr[i11];
            int i14 = iArr2[i13];
            int H = H(i13);
            int i15 = iArr2[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i12) {
                if (i16 != 1048575) {
                    i10 = f21494m.getInt(obj, i16);
                }
                i7 = i10;
                i12 = i16;
            } else {
                i7 = i10;
            }
            if ((268435456 & H) != 0) {
                i8 = i13;
                i9 = i12;
                if (!s(obj, i8, i9, i7, i17)) {
                    return false;
                }
            } else {
                i8 = i13;
                i9 = i12;
            }
            int G = G(H);
            if (G != 9 && G != 17) {
                if (G != 27) {
                    if (G == 60 || G == 68) {
                        if (v(obj, i14, i8) && !t(obj, H, K(i8))) {
                            return false;
                        }
                    } else if (G != 49) {
                        if (G == 50 && !((t4) w5.k(obj, H & 1048575)).isEmpty()) {
                            android.support.v4.media.session.b.a(L(i8));
                            throw null;
                        }
                    }
                }
                List list = (List) w5.k(obj, H & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    j5 K = K(i8);
                    for (int i18 = 0; i18 < list.size(); i18++) {
                        if (!K.e(list.get(i18))) {
                            return false;
                        }
                    }
                }
            } else if (s(obj, i8, i9, i7, i17) && !t(obj, H, K(i8))) {
                return false;
            }
            i11++;
            i12 = i9;
            i10 = i7;
        }
        if (!this.f21500f) {
            return true;
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.j5
    public final void f(Object obj) {
        if (u(obj)) {
            if (obj instanceof d4) {
                d4 d4Var = (d4) obj;
                d4Var.z(Integer.MAX_VALUE);
                d4Var.zza = 0;
                d4Var.x();
            }
            int[] iArr = this.f21495a;
            for (int i7 = 0; i7 < iArr.length; i7 += 3) {
                int H = H(i7);
                int i8 = 1048575 & H;
                int G = G(H);
                long j7 = i8;
                if (G != 9) {
                    if (G != 60 && G != 68) {
                        switch (G) {
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
                                ((i4) w5.k(obj, j7)).b();
                                break;
                            case androidx.constraintlayout.widget.h.D5 /* 50 */:
                                Unsafe unsafe = f21494m;
                                Object object = unsafe.getObject(obj, j7);
                                if (object != null) {
                                    ((t4) object).d();
                                    unsafe.putObject(obj, j7, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (v(obj, iArr[i7], i7)) {
                        K(i7).f(f21494m.getObject(obj, j7));
                    }
                }
                if (r(obj, i7)) {
                    K(i7).f(f21494m.getObject(obj, j7));
                }
            }
            this.f21504j.b(obj);
            if (this.f21500f) {
                this.f21505k.a(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.j5
    public final void g(Object obj, Object obj2) {
        j(obj);
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.f21495a;
            if (i7 >= iArr.length) {
                l5.u(this.f21504j, obj, obj2);
                if (this.f21500f) {
                    l5.t(this.f21505k, obj, obj2);
                    return;
                }
                return;
            }
            int H = H(i7);
            int i8 = 1048575 & H;
            int G = G(H);
            int i9 = iArr[i7];
            long j7 = i8;
            switch (G) {
                case 0:
                    if (!r(obj2, i7)) {
                        break;
                    } else {
                        w5.t(obj, j7, w5.f(obj2, j7));
                        m(obj, i7);
                        break;
                    }
                case 1:
                    if (!r(obj2, i7)) {
                        break;
                    } else {
                        w5.u(obj, j7, w5.g(obj2, j7));
                        m(obj, i7);
                        break;
                    }
                case 2:
                    if (!r(obj2, i7)) {
                        break;
                    } else {
                        w5.w(obj, j7, w5.i(obj2, j7));
                        m(obj, i7);
                        break;
                    }
                case 3:
                    if (!r(obj2, i7)) {
                        break;
                    } else {
                        w5.w(obj, j7, w5.i(obj2, j7));
                        m(obj, i7);
                        break;
                    }
                case 4:
                    if (!r(obj2, i7)) {
                        break;
                    } else {
                        w5.v(obj, j7, w5.h(obj2, j7));
                        m(obj, i7);
                        break;
                    }
                case 5:
                    if (!r(obj2, i7)) {
                        break;
                    } else {
                        w5.w(obj, j7, w5.i(obj2, j7));
                        m(obj, i7);
                        break;
                    }
                case 6:
                    if (!r(obj2, i7)) {
                        break;
                    } else {
                        w5.v(obj, j7, w5.h(obj2, j7));
                        m(obj, i7);
                        break;
                    }
                case 7:
                    if (!r(obj2, i7)) {
                        break;
                    } else {
                        w5.r(obj, j7, w5.B(obj2, j7));
                        m(obj, i7);
                        break;
                    }
                case 8:
                    if (!r(obj2, i7)) {
                        break;
                    } else {
                        w5.x(obj, j7, w5.k(obj2, j7));
                        m(obj, i7);
                        break;
                    }
                case 9:
                    k(obj, obj2, i7);
                    break;
                case 10:
                    if (!r(obj2, i7)) {
                        break;
                    } else {
                        w5.x(obj, j7, w5.k(obj2, j7));
                        m(obj, i7);
                        break;
                    }
                case 11:
                    if (!r(obj2, i7)) {
                        break;
                    } else {
                        w5.v(obj, j7, w5.h(obj2, j7));
                        m(obj, i7);
                        break;
                    }
                case 12:
                    if (!r(obj2, i7)) {
                        break;
                    } else {
                        w5.v(obj, j7, w5.h(obj2, j7));
                        m(obj, i7);
                        break;
                    }
                case 13:
                    if (!r(obj2, i7)) {
                        break;
                    } else {
                        w5.v(obj, j7, w5.h(obj2, j7));
                        m(obj, i7);
                        break;
                    }
                case 14:
                    if (!r(obj2, i7)) {
                        break;
                    } else {
                        w5.w(obj, j7, w5.i(obj2, j7));
                        m(obj, i7);
                        break;
                    }
                case 15:
                    if (!r(obj2, i7)) {
                        break;
                    } else {
                        w5.v(obj, j7, w5.h(obj2, j7));
                        m(obj, i7);
                        break;
                    }
                case 16:
                    if (!r(obj2, i7)) {
                        break;
                    } else {
                        w5.w(obj, j7, w5.i(obj2, j7));
                        m(obj, i7);
                        break;
                    }
                case 17:
                    k(obj, obj2, i7);
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
                    i4 i4Var = (i4) w5.k(obj, j7);
                    i4 i4Var2 = (i4) w5.k(obj2, j7);
                    int size = i4Var.size();
                    int size2 = i4Var2.size();
                    if (size > 0 && size2 > 0) {
                        if (!i4Var.d()) {
                            i4Var = i4Var.V(size2 + size);
                        }
                        i4Var.addAll(i4Var2);
                    }
                    if (size > 0) {
                        i4Var2 = i4Var;
                    }
                    w5.x(obj, j7, i4Var2);
                    break;
                case androidx.constraintlayout.widget.h.D5 /* 50 */:
                    int i10 = l5.f21607b;
                    w5.x(obj, j7, u4.a(w5.k(obj, j7), w5.k(obj2, j7)));
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
                    if (!v(obj2, i9, i7)) {
                        break;
                    } else {
                        w5.x(obj, j7, w5.k(obj2, j7));
                        n(obj, i9, i7);
                        break;
                    }
                case 60:
                    l(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!v(obj2, i9, i7)) {
                        break;
                    } else {
                        w5.x(obj, j7, w5.k(obj2, j7));
                        n(obj, i9, i7);
                        break;
                    }
                case 68:
                    l(obj, obj2, i7);
                    break;
            }
            i7 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.j5
    public final boolean h(Object obj, Object obj2) {
        boolean e8;
        for (int i7 = 0; i7 < this.f21495a.length; i7 += 3) {
            int H = H(i7);
            long j7 = H & 1048575;
            switch (G(H)) {
                case 0:
                    if (q(obj, obj2, i7) && Double.doubleToLongBits(w5.f(obj, j7)) == Double.doubleToLongBits(w5.f(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (q(obj, obj2, i7) && Float.floatToIntBits(w5.g(obj, j7)) == Float.floatToIntBits(w5.g(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (q(obj, obj2, i7) && w5.i(obj, j7) == w5.i(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (q(obj, obj2, i7) && w5.i(obj, j7) == w5.i(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (q(obj, obj2, i7) && w5.h(obj, j7) == w5.h(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (q(obj, obj2, i7) && w5.i(obj, j7) == w5.i(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (q(obj, obj2, i7) && w5.h(obj, j7) == w5.h(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (q(obj, obj2, i7) && w5.B(obj, j7) == w5.B(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (q(obj, obj2, i7) && l5.e(w5.k(obj, j7), w5.k(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (q(obj, obj2, i7) && l5.e(w5.k(obj, j7), w5.k(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (q(obj, obj2, i7) && l5.e(w5.k(obj, j7), w5.k(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (q(obj, obj2, i7) && w5.h(obj, j7) == w5.h(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (q(obj, obj2, i7) && w5.h(obj, j7) == w5.h(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (q(obj, obj2, i7) && w5.h(obj, j7) == w5.h(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (q(obj, obj2, i7) && w5.i(obj, j7) == w5.i(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (q(obj, obj2, i7) && w5.h(obj, j7) == w5.h(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (q(obj, obj2, i7) && w5.i(obj, j7) == w5.i(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (q(obj, obj2, i7) && l5.e(w5.k(obj, j7), w5.k(obj2, j7))) {
                        continue;
                    }
                    return false;
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
                    e8 = l5.e(w5.k(obj, j7), w5.k(obj2, j7));
                    break;
                case androidx.constraintlayout.widget.h.D5 /* 50 */:
                    e8 = l5.e(w5.k(obj, j7), w5.k(obj2, j7));
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
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long E = E(i7) & 1048575;
                    if (w5.h(obj, E) == w5.h(obj2, E) && l5.e(w5.k(obj, j7), w5.k(obj2, j7))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!e8) {
                return false;
            }
        }
        if (!((d4) obj).zzc.equals(((d4) obj2).zzc)) {
            return false;
        }
        if (!this.f21500f) {
            return true;
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.j5
    public final void i(Object obj, byte[] bArr, int i7, int i8, x2 x2Var) {
        y(obj, bArr, i7, i8, 0, x2Var);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int y(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.play_billing.x2 r37) {
        /*
            Method dump skipped, instructions count: 3404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.c5.y(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.x2):int");
    }
}
