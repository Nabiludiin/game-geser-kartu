package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: MyApplication */
final class z05 implements n15 {

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f19939m = new int[0];

    /* renamed from: n, reason: collision with root package name */
    private static final Unsafe f19940n = f25.B();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f19941a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f19942b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19943c;

    /* renamed from: d, reason: collision with root package name */
    private final int f19944d;

    /* renamed from: e, reason: collision with root package name */
    private final v05 f19945e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f19946f = false;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f19947g;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f19948h;

    /* renamed from: i, reason: collision with root package name */
    private final int f19949i;

    /* renamed from: j, reason: collision with root package name */
    private final int f19950j;

    /* renamed from: k, reason: collision with root package name */
    private final y15 f19951k;

    /* renamed from: l, reason: collision with root package name */
    private final fz4 f19952l;

    private z05(int[] iArr, Object[] objArr, int i7, int i8, v05 v05Var, boolean z7, int[] iArr2, int i9, int i10, b15 b15Var, h05 h05Var, y15 y15Var, fz4 fz4Var, q05 q05Var) {
        this.f19941a = iArr;
        this.f19942b = objArr;
        this.f19943c = i7;
        this.f19944d = i8;
        this.f19947g = v05Var instanceof sz4;
        this.f19948h = iArr2;
        this.f19949i = i9;
        this.f19950j = i10;
        this.f19951k = y15Var;
        this.f19952l = fz4Var;
        this.f19945e = v05Var;
    }

    private final void A(Object obj, int i7, int i8) {
        f25.m(obj, c(i8) & 1048575, i7);
    }

    private final int B(int i7) {
        if (i7 < this.f19943c || i7 > this.f19944d) {
            return -1;
        }
        return C(i7, 0);
    }

    private final int C(int i7, int i8) {
        int[] iArr = this.f19941a;
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

    private static final int D(byte[] bArr, int i7, int i8, l25 l25Var, Class cls, ey4 ey4Var) {
        l25 l25Var2 = l25.f11367s;
        switch (l25Var.ordinal()) {
            case 0:
                int i9 = i7 + 8;
                ey4Var.f7881c = Double.valueOf(Double.longBitsToDouble(fy4.e(bArr, i7)));
                return i9;
            case 1:
                int i10 = i7 + 4;
                ey4Var.f7881c = Float.valueOf(Float.intBitsToFloat(fy4.d(bArr, i7)));
                return i10;
            case 2:
            case 3:
                int c8 = fy4.c(bArr, i7, ey4Var);
                ey4Var.f7881c = Long.valueOf(ey4Var.f7880b);
                return c8;
            case 4:
            case 12:
            case 13:
                int a8 = fy4.a(bArr, i7, ey4Var);
                ey4Var.f7881c = Integer.valueOf(ey4Var.f7879a);
                return a8;
            case 5:
            case 15:
                int i11 = i7 + 8;
                ey4Var.f7881c = Long.valueOf(fy4.e(bArr, i7));
                return i11;
            case 6:
            case 14:
                int i12 = i7 + 4;
                ey4Var.f7881c = Integer.valueOf(fy4.d(bArr, i7));
                return i12;
            case 7:
                int c9 = fy4.c(bArr, i7, ey4Var);
                ey4Var.f7881c = Boolean.valueOf(ey4Var.f7880b != 0);
                return c9;
            case 8:
                return fy4.f(bArr, i7, ey4Var);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return fy4.h(f15.a().b(cls), bArr, i7, i8, ey4Var);
            case 11:
                return fy4.g(bArr, i7, ey4Var);
            case 16:
                int a9 = fy4.a(bArr, i7, ey4Var);
                ey4Var.f7881c = Integer.valueOf(uy4.i(ey4Var.f7879a));
                return a9;
            case 17:
                int c10 = fy4.c(bArr, i7, ey4Var);
                ey4Var.f7881c = Long.valueOf(uy4.j(ey4Var.f7880b));
                return c10;
        }
    }

    private static final void E(int i7, Object obj, n25 n25Var) {
        if (obj instanceof String) {
            n25Var.u(i7, (String) obj);
        } else {
            n25Var.H(i7, (qy4) obj);
        }
    }

    static z15 F(Object obj) {
        sz4 sz4Var = (sz4) obj;
        z15 z15Var = sz4Var.zzt;
        if (z15Var != z15.a()) {
            return z15Var;
        }
        z15 b8 = z15.b();
        sz4Var.zzt = b8;
        return b8;
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
    static com.google.android.gms.internal.ads.z05 H(java.lang.Class r32, com.google.android.gms.internal.ads.s05 r33, com.google.android.gms.internal.ads.b15 r34, com.google.android.gms.internal.ads.h05 r35, com.google.android.gms.internal.ads.y15 r36, com.google.android.gms.internal.ads.fz4 r37, com.google.android.gms.internal.ads.q05 r38) {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z05.H(java.lang.Class, com.google.android.gms.internal.ads.s05, com.google.android.gms.internal.ads.b15, com.google.android.gms.internal.ads.h05, com.google.android.gms.internal.ads.y15, com.google.android.gms.internal.ads.fz4, com.google.android.gms.internal.ads.q05):com.google.android.gms.internal.ads.z05");
    }

    private static Field I(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e8) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString(), e8);
        }
    }

    private final void J(Object obj, Object obj2, int i7) {
        if (x(obj2, i7)) {
            int b8 = b(i7) & 1048575;
            Unsafe unsafe = f19940n;
            long j7 = b8;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                int i8 = this.f19941a[i7];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i8);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            n15 L = L(i7);
            if (!x(obj, i7)) {
                if (o(object)) {
                    Object a8 = L.a();
                    L.h(a8, object);
                    unsafe.putObject(obj, j7, a8);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                y(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!o(object2)) {
                Object a9 = L.a();
                L.h(a9, object2);
                unsafe.putObject(obj, j7, a9);
                object2 = a9;
            }
            L.h(object2, object);
        }
    }

    private final void K(Object obj, Object obj2, int i7) {
        int[] iArr = this.f19941a;
        int i8 = iArr[i7];
        if (z(obj2, i8, i7)) {
            int b8 = b(i7) & 1048575;
            Unsafe unsafe = f19940n;
            long j7 = b8;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                int i9 = iArr[i7];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i9);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            n15 L = L(i7);
            if (!z(obj, i8, i7)) {
                if (o(object)) {
                    Object a8 = L.a();
                    L.h(a8, object);
                    unsafe.putObject(obj, j7, a8);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                A(obj, i8, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!o(object2)) {
                Object a9 = L.a();
                L.h(a9, object2);
                unsafe.putObject(obj, j7, a9);
                object2 = a9;
            }
            L.h(object2, object);
        }
    }

    private final n15 L(int i7) {
        Object[] objArr = this.f19942b;
        int i8 = i7 / 3;
        int i9 = i8 + i8;
        n15 n15Var = (n15) objArr[i9];
        if (n15Var != null) {
            return n15Var;
        }
        n15 b8 = f15.a().b((Class) objArr[i9 + 1]);
        objArr[i9] = b8;
        return b8;
    }

    private final Object M(int i7) {
        int i8 = i7 / 3;
        return this.f19942b[i8 + i8];
    }

    private final wz4 N(int i7) {
        int i8 = i7 / 3;
        return (wz4) this.f19942b[i8 + i8 + 1];
    }

    private final Object O(Object obj, int i7) {
        n15 L = L(i7);
        int b8 = b(i7) & 1048575;
        if (!x(obj, i7)) {
            return L.a();
        }
        Object object = f19940n.getObject(obj, b8);
        if (o(object)) {
            return object;
        }
        Object a8 = L.a();
        if (object != null) {
            L.h(a8, object);
        }
        return a8;
    }

    private final void P(Object obj, int i7, Object obj2) {
        f19940n.putObject(obj, b(i7) & 1048575, obj2);
        y(obj, i7);
    }

    private final Object Q(Object obj, int i7, int i8) {
        n15 L = L(i8);
        if (!z(obj, i7, i8)) {
            return L.a();
        }
        Object object = f19940n.getObject(obj, b(i8) & 1048575);
        if (o(object)) {
            return object;
        }
        Object a8 = L.a();
        if (object != null) {
            L.h(a8, object);
        }
        return a8;
    }

    private final void R(Object obj, int i7, int i8, Object obj2) {
        f19940n.putObject(obj, b(i8) & 1048575, obj2);
        A(obj, i7, i8);
    }

    private final Object S(Object obj, int i7, Object obj2, y15 y15Var, Object obj3) {
        wz4 N;
        int i8 = this.f19941a[i7];
        Object v7 = f25.v(obj, b(i7) & 1048575);
        if (v7 == null || (N = N(i7)) == null) {
            return obj2;
        }
        n05 e8 = ((o05) M(i7)).e();
        Iterator it = ((p05) v7).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!N.L(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = y15Var.h(obj3);
                }
                int c8 = o05.c(e8, entry.getKey(), entry.getValue());
                qy4 qy4Var = qy4.f14669r;
                byte[] bArr = new byte[c8];
                int i9 = az4.f5414d;
                xy4 xy4Var = new xy4(bArr, 0, c8);
                try {
                    o05.b(xy4Var, e8, entry.getKey(), entry.getValue());
                    y15Var.d(obj2, i8, my4.a(xy4Var, bArr));
                    it.remove();
                } catch (IOException e9) {
                    throw new RuntimeException(e9);
                }
            }
        }
        return obj2;
    }

    private static boolean T(Object obj, int i7, n15 n15Var) {
        return n15Var.i(f25.v(obj, i7 & 1048575));
    }

    private final void U(Object obj, int i7, i15 i15Var) {
        long j7 = i7 & 1048575;
        if (n(i7)) {
            f25.w(obj, j7, i15Var.o());
        } else if (this.f19947g) {
            f25.w(obj, j7, i15Var.n());
        } else {
            f25.w(obj, j7, i15Var.m());
        }
    }

    private final int b(int i7) {
        return this.f19941a[i7 + 1];
    }

    private final int c(int i7) {
        return this.f19941a[i7 + 2];
    }

    private static int d(int i7) {
        return (i7 >>> 20) & 255;
    }

    private static boolean n(int i7) {
        return (i7 & 536870912) != 0;
    }

    private static boolean o(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof sz4) {
            return ((sz4) obj).q();
        }
        return true;
    }

    private static void p(Object obj) {
        if (!o(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static double q(Object obj, long j7) {
        return ((Double) f25.v(obj, j7)).doubleValue();
    }

    private static float r(Object obj, long j7) {
        return ((Float) f25.v(obj, j7)).floatValue();
    }

    private static int s(Object obj, long j7) {
        return ((Integer) f25.v(obj, j7)).intValue();
    }

    private static long t(Object obj, long j7) {
        return ((Long) f25.v(obj, j7)).longValue();
    }

    private static boolean u(Object obj, long j7) {
        return ((Boolean) f25.v(obj, j7)).booleanValue();
    }

    private final boolean v(Object obj, Object obj2, int i7) {
        return x(obj, i7) == x(obj2, i7);
    }

    private final boolean w(Object obj, int i7, int i8, int i9, int i10) {
        return i8 == 1048575 ? x(obj, i7) : (i9 & i10) != 0;
    }

    private final boolean x(Object obj, int i7) {
        int c8 = c(i7);
        long j7 = c8 & 1048575;
        if (j7 != 1048575) {
            return (f25.l(obj, j7) & (1 << (c8 >>> 20))) != 0;
        }
        int b8 = b(i7);
        long j8 = b8 & 1048575;
        switch (d(b8)) {
            case 0:
                return Double.doubleToRawLongBits(f25.t(obj, j8)) != 0;
            case 1:
                return Float.floatToRawIntBits(f25.r(obj, j8)) != 0;
            case 2:
                return f25.n(obj, j8) != 0;
            case 3:
                return f25.n(obj, j8) != 0;
            case 4:
                return f25.l(obj, j8) != 0;
            case 5:
                return f25.n(obj, j8) != 0;
            case 6:
                return f25.l(obj, j8) != 0;
            case 7:
                return f25.p(obj, j8);
            case 8:
                Object v7 = f25.v(obj, j8);
                if (v7 instanceof String) {
                    return !((String) v7).isEmpty();
                }
                if (v7 instanceof qy4) {
                    return !qy4.f14669r.equals(v7);
                }
                throw new IllegalArgumentException();
            case 9:
                return f25.v(obj, j8) != null;
            case 10:
                return !qy4.f14669r.equals(f25.v(obj, j8));
            case 11:
                return f25.l(obj, j8) != 0;
            case 12:
                return f25.l(obj, j8) != 0;
            case 13:
                return f25.l(obj, j8) != 0;
            case 14:
                return f25.n(obj, j8) != 0;
            case 15:
                return f25.l(obj, j8) != 0;
            case 16:
                return f25.n(obj, j8) != 0;
            case 17:
                return f25.v(obj, j8) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void y(Object obj, int i7) {
        int c8 = c(i7);
        long j7 = 1048575 & c8;
        if (j7 == 1048575) {
            return;
        }
        f25.m(obj, j7, (1 << (c8 >>> 20)) | f25.l(obj, j7));
    }

    private final boolean z(Object obj, int i7, int i8) {
        return f25.l(obj, (long) (c(i8) & 1048575)) == i7;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int G(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.ads.ey4 r37) {
        /*
            Method dump skipped, instructions count: 3598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z05.G(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.ey4):int");
    }

    @Override // com.google.android.gms.internal.ads.n15
    public final Object a() {
        return ((sz4) this.f19945e).M();
    }

    @Override // com.google.android.gms.internal.ads.n15
    public final void e(Object obj) {
        if (o(obj)) {
            if (obj instanceof sz4) {
                sz4 sz4Var = (sz4) obj;
                sz4Var.R();
                sz4Var.I();
                sz4Var.r();
            }
            int[] iArr = this.f19941a;
            for (int i7 = 0; i7 < iArr.length; i7 += 3) {
                int b8 = b(i7);
                int i8 = 1048575 & b8;
                int d8 = d(b8);
                long j7 = i8;
                if (d8 != 9) {
                    if (d8 != 60 && d8 != 68) {
                        switch (d8) {
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
                                ((b05) f25.v(obj, j7)).b();
                                break;
                            case androidx.constraintlayout.widget.h.D5 /* 50 */:
                                Unsafe unsafe = f19940n;
                                Object object = unsafe.getObject(obj, j7);
                                if (object != null) {
                                    ((p05) object).g();
                                    unsafe.putObject(obj, j7, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (z(obj, iArr[i7], i7)) {
                        L(i7).e(f19940n.getObject(obj, j7));
                    }
                }
                if (x(obj, i7)) {
                    L(i7).e(f19940n.getObject(obj, j7));
                }
            }
            this.f19951k.j(obj);
            if (this.f19946f) {
                this.f19952l.a(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.n15
    public final boolean f(Object obj, Object obj2) {
        boolean g8;
        for (int i7 = 0; i7 < this.f19941a.length; i7 += 3) {
            int b8 = b(i7);
            long j7 = b8 & 1048575;
            switch (d(b8)) {
                case 0:
                    if (v(obj, obj2, i7) && Double.doubleToLongBits(f25.t(obj, j7)) == Double.doubleToLongBits(f25.t(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (v(obj, obj2, i7) && Float.floatToIntBits(f25.r(obj, j7)) == Float.floatToIntBits(f25.r(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (v(obj, obj2, i7) && f25.n(obj, j7) == f25.n(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (v(obj, obj2, i7) && f25.n(obj, j7) == f25.n(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (v(obj, obj2, i7) && f25.l(obj, j7) == f25.l(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (v(obj, obj2, i7) && f25.n(obj, j7) == f25.n(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (v(obj, obj2, i7) && f25.l(obj, j7) == f25.l(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (v(obj, obj2, i7) && f25.p(obj, j7) == f25.p(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (v(obj, obj2, i7) && p15.g(f25.v(obj, j7), f25.v(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (v(obj, obj2, i7) && p15.g(f25.v(obj, j7), f25.v(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (v(obj, obj2, i7) && p15.g(f25.v(obj, j7), f25.v(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (v(obj, obj2, i7) && f25.l(obj, j7) == f25.l(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (v(obj, obj2, i7) && f25.l(obj, j7) == f25.l(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (v(obj, obj2, i7) && f25.l(obj, j7) == f25.l(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (v(obj, obj2, i7) && f25.n(obj, j7) == f25.n(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (v(obj, obj2, i7) && f25.l(obj, j7) == f25.l(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (v(obj, obj2, i7) && f25.n(obj, j7) == f25.n(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (v(obj, obj2, i7) && p15.g(f25.v(obj, j7), f25.v(obj2, j7))) {
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
                    g8 = p15.g(f25.v(obj, j7), f25.v(obj2, j7));
                    break;
                case androidx.constraintlayout.widget.h.D5 /* 50 */:
                    g8 = p15.g(f25.v(obj, j7), f25.v(obj2, j7));
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
                    long c8 = c(i7) & 1048575;
                    if (f25.l(obj, c8) == f25.l(obj2, c8) && p15.g(f25.v(obj, j7), f25.v(obj2, j7))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!g8) {
                return false;
            }
        }
        if (!((sz4) obj).zzt.equals(((sz4) obj2).zzt)) {
            return false;
        }
        if (!this.f19946f) {
            return true;
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.n15
    public final int g(Object obj) {
        int i7;
        int b8;
        int b9;
        int c8;
        int b10;
        int b11;
        int b12;
        int h8;
        int b13;
        int d8;
        int D;
        int size;
        int E;
        int b14;
        int b15;
        int b16;
        int i8;
        int b17;
        int b18;
        int b19;
        int i9;
        int b20;
        int b21;
        int b22;
        int h9;
        int b23;
        z05 z05Var = this;
        Object obj2 = obj;
        Unsafe unsafe = f19940n;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (true) {
            int[] iArr = z05Var.f19941a;
            if (i10 >= iArr.length) {
                int h10 = i12 + ((sz4) obj).zzt.h();
                if (!z05Var.f19946f) {
                    return h10;
                }
                android.support.v4.media.session.b.a(obj);
                throw null;
            }
            int b24 = z05Var.b(i10);
            int d9 = d(b24);
            int i14 = iArr[i10];
            int i15 = iArr[i10 + 2];
            int i16 = i15 & 1048575;
            if (d9 <= 17) {
                if (i16 != i13) {
                    i11 = i16 == 1048575 ? 0 : unsafe.getInt(obj2, i16);
                    i13 = i16;
                }
                i7 = 1 << (i15 >>> 20);
            } else {
                i7 = 0;
            }
            int i17 = b24 & 1048575;
            if (d9 >= lz4.f11956a0.a()) {
                lz4.f11969n0.a();
            }
            long j7 = i17;
            switch (d9) {
                case 0:
                    if (z05Var.w(obj2, i10, i13, i11, i7)) {
                        i12 += az4.b(i14 << 3) + 8;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (z05Var.w(obj2, i10, i13, i11, i7)) {
                        b8 = az4.b(i14 << 3);
                        b11 = b8 + 4;
                        i12 += b11;
                    }
                    z05Var = this;
                    break;
                case 2:
                    if (z05Var.w(obj2, i10, i13, i11, i7)) {
                        long j8 = unsafe.getLong(obj2, j7);
                        b9 = az4.b(i14 << 3);
                        c8 = az4.c(j8);
                        b11 = b9 + c8;
                        i12 += b11;
                    }
                    z05Var = this;
                    break;
                case 3:
                    if (z05Var.w(obj2, i10, i13, i11, i7)) {
                        long j9 = unsafe.getLong(obj2, j7);
                        b9 = az4.b(i14 << 3);
                        c8 = az4.c(j9);
                        b11 = b9 + c8;
                        i12 += b11;
                    }
                    z05Var = this;
                    break;
                case 4:
                    if (z05Var.w(obj2, i10, i13, i11, i7)) {
                        long j10 = unsafe.getInt(obj2, j7);
                        b9 = az4.b(i14 << 3);
                        c8 = az4.c(j10);
                        b11 = b9 + c8;
                        i12 += b11;
                    }
                    z05Var = this;
                    break;
                case 5:
                    if (z05Var.w(obj2, i10, i13, i11, i7)) {
                        b10 = az4.b(i14 << 3);
                        b11 = b10 + 8;
                        i12 += b11;
                    }
                    z05Var = this;
                    break;
                case 6:
                    if (z05Var.w(obj2, i10, i13, i11, i7)) {
                        b8 = az4.b(i14 << 3);
                        b11 = b8 + 4;
                        i12 += b11;
                    }
                    z05Var = this;
                    break;
                case 7:
                    if (z05Var.w(obj2, i10, i13, i11, i7)) {
                        b11 = az4.b(i14 << 3) + 1;
                        i12 += b11;
                    }
                    z05Var = this;
                    break;
                case 8:
                    if (z05Var.w(obj2, i10, i13, i11, i7)) {
                        int i18 = i14 << 3;
                        Object object = unsafe.getObject(obj2, j7);
                        if (object instanceof qy4) {
                            b12 = az4.b(i18);
                            h8 = ((qy4) object).h();
                            b13 = az4.b(h8);
                            b11 = b12 + b13 + h8;
                            i12 += b11;
                        } else {
                            b9 = az4.b(i18);
                            c8 = az4.d((String) object);
                            b11 = b9 + c8;
                            i12 += b11;
                        }
                    }
                    z05Var = this;
                    break;
                case 9:
                    if (z05Var.w(obj2, i10, i13, i11, i7)) {
                        d8 = p15.d(i14, unsafe.getObject(obj2, j7), z05Var.L(i10));
                        i12 += d8;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (z05Var.w(obj2, i10, i13, i11, i7)) {
                        qy4 qy4Var = (qy4) unsafe.getObject(obj2, j7);
                        b12 = az4.b(i14 << 3);
                        h8 = qy4Var.h();
                        b13 = az4.b(h8);
                        b11 = b12 + b13 + h8;
                        i12 += b11;
                    }
                    z05Var = this;
                    break;
                case 11:
                    if (z05Var.w(obj2, i10, i13, i11, i7)) {
                        int i19 = unsafe.getInt(obj2, j7);
                        b9 = az4.b(i14 << 3);
                        c8 = az4.b(i19);
                        b11 = b9 + c8;
                        i12 += b11;
                    }
                    z05Var = this;
                    break;
                case 12:
                    if (z05Var.w(obj2, i10, i13, i11, i7)) {
                        long j11 = unsafe.getInt(obj2, j7);
                        b9 = az4.b(i14 << 3);
                        c8 = az4.c(j11);
                        b11 = b9 + c8;
                        i12 += b11;
                    }
                    z05Var = this;
                    break;
                case 13:
                    if (z05Var.w(obj2, i10, i13, i11, i7)) {
                        b8 = az4.b(i14 << 3);
                        b11 = b8 + 4;
                        i12 += b11;
                    }
                    z05Var = this;
                    break;
                case 14:
                    if (z05Var.w(obj2, i10, i13, i11, i7)) {
                        b10 = az4.b(i14 << 3);
                        b11 = b10 + 8;
                        i12 += b11;
                    }
                    z05Var = this;
                    break;
                case 15:
                    if (z05Var.w(obj2, i10, i13, i11, i7)) {
                        int i20 = unsafe.getInt(obj2, j7);
                        b9 = az4.b(i14 << 3);
                        c8 = az4.b((i20 >> 31) ^ (i20 + i20));
                        b11 = b9 + c8;
                        i12 += b11;
                    }
                    z05Var = this;
                    break;
                case 16:
                    if (z05Var.w(obj2, i10, i13, i11, i7)) {
                        long j12 = unsafe.getLong(obj2, j7);
                        b9 = az4.b(i14 << 3);
                        c8 = az4.c((j12 >> 63) ^ (j12 + j12));
                        b11 = b9 + c8;
                        i12 += b11;
                    }
                    z05Var = this;
                    break;
                case 17:
                    if (z05Var.w(obj2, i10, i13, i11, i7)) {
                        d8 = p15.e(i14, (v05) unsafe.getObject(obj2, j7), z05Var.L(i10));
                        i12 += d8;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    d8 = p15.c(i14, (List) unsafe.getObject(obj2, j7), false);
                    i12 += d8;
                    break;
                case 19:
                    d8 = p15.a(i14, (List) unsafe.getObject(obj2, j7), false);
                    i12 += d8;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j7);
                    int i21 = p15.f13634b;
                    if (list.size() != 0) {
                        D = p15.D(list) + (list.size() * az4.b(i14 << 3));
                        i12 += D;
                        break;
                    }
                    D = 0;
                    i12 += D;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j7);
                    int i22 = p15.f13634b;
                    size = list2.size();
                    if (size != 0) {
                        E = p15.E(list2);
                        b14 = az4.b(i14 << 3);
                        i8 = size * b14;
                        d8 = E + i8;
                        i12 += d8;
                        break;
                    }
                    d8 = 0;
                    i12 += d8;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j7);
                    int i23 = p15.f13634b;
                    size = list3.size();
                    if (size != 0) {
                        E = p15.H(list3);
                        b14 = az4.b(i14 << 3);
                        i8 = size * b14;
                        d8 = E + i8;
                        i12 += d8;
                        break;
                    }
                    d8 = 0;
                    i12 += d8;
                case 23:
                    d8 = p15.c(i14, (List) unsafe.getObject(obj2, j7), false);
                    i12 += d8;
                    break;
                case 24:
                    d8 = p15.a(i14, (List) unsafe.getObject(obj2, j7), false);
                    i12 += d8;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j7);
                    int i24 = p15.f13634b;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        d8 = size2 * (az4.b(i14 << 3) + 1);
                        i12 += d8;
                        break;
                    }
                    d8 = 0;
                    i12 += d8;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j7);
                    int i25 = p15.f13634b;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        D = az4.b(i14 << 3) * size3;
                        for (int i26 = 0; i26 < size3; i26++) {
                            Object obj3 = list5.get(i26);
                            if (obj3 instanceof qy4) {
                                int h11 = ((qy4) obj3).h();
                                D += az4.b(h11) + h11;
                            } else {
                                D += az4.d((String) obj3);
                            }
                        }
                        i12 += D;
                        break;
                    }
                    D = 0;
                    i12 += D;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j7);
                    n15 L = z05Var.L(i10);
                    int i27 = p15.f13634b;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        b15 = 0;
                    } else {
                        b15 = az4.b(i14 << 3) * size4;
                        for (int i28 = 0; i28 < size4; i28++) {
                            int h12 = ((ay4) list6.get(i28)).h(L);
                            b15 += az4.b(h12) + h12;
                        }
                    }
                    i12 += b15;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j7);
                    int i29 = p15.f13634b;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        b16 = 0;
                    } else {
                        b16 = size5 * az4.b(i14 << 3);
                        for (int i30 = 0; i30 < list7.size(); i30++) {
                            int h13 = ((qy4) list7.get(i30)).h();
                            b16 += az4.b(h13) + h13;
                        }
                    }
                    i12 += b16;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j7);
                    int i31 = p15.f13634b;
                    size = list8.size();
                    if (size != 0) {
                        E = p15.I(list8);
                        b14 = az4.b(i14 << 3);
                        i8 = size * b14;
                        d8 = E + i8;
                        i12 += d8;
                        break;
                    }
                    d8 = 0;
                    i12 += d8;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j7);
                    int i32 = p15.f13634b;
                    size = list9.size();
                    if (size != 0) {
                        E = p15.G(list9);
                        b14 = az4.b(i14 << 3);
                        i8 = size * b14;
                        d8 = E + i8;
                        i12 += d8;
                        break;
                    }
                    d8 = 0;
                    i12 += d8;
                case 31:
                    d8 = p15.a(i14, (List) unsafe.getObject(obj2, j7), false);
                    i12 += d8;
                    break;
                case 32:
                    d8 = p15.c(i14, (List) unsafe.getObject(obj2, j7), false);
                    i12 += d8;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j7);
                    int i33 = p15.f13634b;
                    size = list10.size();
                    if (size != 0) {
                        E = p15.J(list10);
                        b14 = az4.b(i14 << 3);
                        i8 = size * b14;
                        d8 = E + i8;
                        i12 += d8;
                        break;
                    }
                    d8 = 0;
                    i12 += d8;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j7);
                    int i34 = p15.f13634b;
                    size = list11.size();
                    if (size != 0) {
                        E = p15.F(list11);
                        b14 = az4.b(i14 << 3);
                        i8 = size * b14;
                        d8 = E + i8;
                        i12 += d8;
                        break;
                    }
                    d8 = 0;
                    i12 += d8;
                case 35:
                    b17 = p15.b((List) unsafe.getObject(obj2, j7));
                    if (b17 > 0) {
                        b18 = az4.b(i14 << 3);
                        b19 = az4.b(b17);
                        b16 = b18 + b19 + b17;
                        i12 += b16;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.f1530y1 /* 36 */:
                    b17 = p15.K((List) unsafe.getObject(obj2, j7));
                    if (b17 > 0) {
                        b18 = az4.b(i14 << 3);
                        b19 = az4.b(b17);
                        b16 = b18 + b19 + b17;
                        i12 += b16;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    b17 = p15.D((List) unsafe.getObject(obj2, j7));
                    if (b17 > 0) {
                        b18 = az4.b(i14 << 3);
                        b19 = az4.b(b17);
                        b16 = b18 + b19 + b17;
                        i12 += b16;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.f1478r5 /* 38 */:
                    b17 = p15.E((List) unsafe.getObject(obj2, j7));
                    if (b17 > 0) {
                        b18 = az4.b(i14 << 3);
                        b19 = az4.b(b17);
                        b16 = b18 + b19 + b17;
                        i12 += b16;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.f1486s5 /* 39 */:
                    b17 = p15.H((List) unsafe.getObject(obj2, j7));
                    if (b17 > 0) {
                        b18 = az4.b(i14 << 3);
                        b19 = az4.b(b17);
                        b16 = b18 + b19 + b17;
                        i12 += b16;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.f1494t5 /* 40 */:
                    b17 = p15.b((List) unsafe.getObject(obj2, j7));
                    if (b17 > 0) {
                        b18 = az4.b(i14 << 3);
                        b19 = az4.b(b17);
                        b16 = b18 + b19 + b17;
                        i12 += b16;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.f1502u5 /* 41 */:
                    b17 = p15.K((List) unsafe.getObject(obj2, j7));
                    if (b17 > 0) {
                        b18 = az4.b(i14 << 3);
                        b19 = az4.b(b17);
                        b16 = b18 + b19 + b17;
                        i12 += b16;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.f1510v5 /* 42 */:
                    List list12 = (List) unsafe.getObject(obj2, j7);
                    int i35 = p15.f13634b;
                    b17 = list12.size();
                    if (b17 > 0) {
                        b18 = az4.b(i14 << 3);
                        b19 = az4.b(b17);
                        b16 = b18 + b19 + b17;
                        i12 += b16;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.f1518w5 /* 43 */:
                    b17 = p15.I((List) unsafe.getObject(obj2, j7));
                    if (b17 > 0) {
                        b18 = az4.b(i14 << 3);
                        b19 = az4.b(b17);
                        b16 = b18 + b19 + b17;
                        i12 += b16;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.f1526x5 /* 44 */:
                    b17 = p15.G((List) unsafe.getObject(obj2, j7));
                    if (b17 > 0) {
                        b18 = az4.b(i14 << 3);
                        b19 = az4.b(b17);
                        b16 = b18 + b19 + b17;
                        i12 += b16;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.f1534y5 /* 45 */:
                    b17 = p15.K((List) unsafe.getObject(obj2, j7));
                    if (b17 > 0) {
                        b18 = az4.b(i14 << 3);
                        b19 = az4.b(b17);
                        b16 = b18 + b19 + b17;
                        i12 += b16;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.f1542z5 /* 46 */:
                    b17 = p15.b((List) unsafe.getObject(obj2, j7));
                    if (b17 > 0) {
                        b18 = az4.b(i14 << 3);
                        b19 = az4.b(b17);
                        b16 = b18 + b19 + b17;
                        i12 += b16;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.A5 /* 47 */:
                    b17 = p15.J((List) unsafe.getObject(obj2, j7));
                    if (b17 > 0) {
                        b18 = az4.b(i14 << 3);
                        b19 = az4.b(b17);
                        b16 = b18 + b19 + b17;
                        i12 += b16;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.B5 /* 48 */:
                    b17 = p15.F((List) unsafe.getObject(obj2, j7));
                    if (b17 > 0) {
                        b18 = az4.b(i14 << 3);
                        b19 = az4.b(b17);
                        b16 = b18 + b19 + b17;
                        i12 += b16;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.C5 /* 49 */:
                    List list13 = (List) unsafe.getObject(obj2, j7);
                    n15 L2 = z05Var.L(i10);
                    int i36 = p15.f13634b;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i9 = 0;
                    } else {
                        i9 = 0;
                        for (int i37 = 0; i37 < size6; i37++) {
                            i9 += p15.e(i14, (v05) list13.get(i37), L2);
                        }
                    }
                    i12 += i9;
                    break;
                case androidx.constraintlayout.widget.h.D5 /* 50 */:
                    p05 p05Var = (p05) unsafe.getObject(obj2, j7);
                    o05 o05Var = (o05) z05Var.M(i10);
                    if (!p05Var.isEmpty()) {
                        D = 0;
                        for (Map.Entry entry : p05Var.entrySet()) {
                            D += o05Var.d(i14, entry.getKey(), entry.getValue());
                        }
                        i12 += D;
                        break;
                    }
                    D = 0;
                    i12 += D;
                case androidx.constraintlayout.widget.h.E5 /* 51 */:
                    if (z05Var.z(obj2, i14, i10)) {
                        b20 = az4.b(i14 << 3);
                        d8 = b20 + 8;
                        i12 += d8;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.F5 /* 52 */:
                    if (z05Var.z(obj2, i14, i10)) {
                        b21 = az4.b(i14 << 3);
                        d8 = b21 + 4;
                        i12 += d8;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.G5 /* 53 */:
                    if (z05Var.z(obj2, i14, i10)) {
                        long t7 = t(obj2, j7);
                        E = az4.b(i14 << 3);
                        i8 = az4.c(t7);
                        d8 = E + i8;
                        i12 += d8;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (z05Var.z(obj2, i14, i10)) {
                        long t8 = t(obj2, j7);
                        E = az4.b(i14 << 3);
                        i8 = az4.c(t8);
                        d8 = E + i8;
                        i12 += d8;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (z05Var.z(obj2, i14, i10)) {
                        long s7 = s(obj2, j7);
                        E = az4.b(i14 << 3);
                        i8 = az4.c(s7);
                        d8 = E + i8;
                        i12 += d8;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (z05Var.z(obj2, i14, i10)) {
                        b20 = az4.b(i14 << 3);
                        d8 = b20 + 8;
                        i12 += d8;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (z05Var.z(obj2, i14, i10)) {
                        b21 = az4.b(i14 << 3);
                        d8 = b21 + 4;
                        i12 += d8;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (z05Var.z(obj2, i14, i10)) {
                        d8 = az4.b(i14 << 3) + 1;
                        i12 += d8;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!z05Var.z(obj2, i14, i10)) {
                        break;
                    } else {
                        int i38 = i14 << 3;
                        Object object2 = unsafe.getObject(obj2, j7);
                        if (object2 instanceof qy4) {
                            b22 = az4.b(i38);
                            h9 = ((qy4) object2).h();
                            b23 = az4.b(h9);
                            d8 = b22 + b23 + h9;
                            i12 += d8;
                            break;
                        } else {
                            E = az4.b(i38);
                            i8 = az4.d((String) object2);
                            d8 = E + i8;
                            i12 += d8;
                        }
                    }
                case 60:
                    if (z05Var.z(obj2, i14, i10)) {
                        d8 = p15.d(i14, unsafe.getObject(obj2, j7), z05Var.L(i10));
                        i12 += d8;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (z05Var.z(obj2, i14, i10)) {
                        qy4 qy4Var2 = (qy4) unsafe.getObject(obj2, j7);
                        b22 = az4.b(i14 << 3);
                        h9 = qy4Var2.h();
                        b23 = az4.b(h9);
                        d8 = b22 + b23 + h9;
                        i12 += d8;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (z05Var.z(obj2, i14, i10)) {
                        int s8 = s(obj2, j7);
                        E = az4.b(i14 << 3);
                        i8 = az4.b(s8);
                        d8 = E + i8;
                        i12 += d8;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (z05Var.z(obj2, i14, i10)) {
                        long s9 = s(obj2, j7);
                        E = az4.b(i14 << 3);
                        i8 = az4.c(s9);
                        d8 = E + i8;
                        i12 += d8;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (z05Var.z(obj2, i14, i10)) {
                        b21 = az4.b(i14 << 3);
                        d8 = b21 + 4;
                        i12 += d8;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (z05Var.z(obj2, i14, i10)) {
                        b20 = az4.b(i14 << 3);
                        d8 = b20 + 8;
                        i12 += d8;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (z05Var.z(obj2, i14, i10)) {
                        int s10 = s(obj2, j7);
                        E = az4.b(i14 << 3);
                        i8 = az4.b((s10 >> 31) ^ (s10 + s10));
                        d8 = E + i8;
                        i12 += d8;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (z05Var.z(obj2, i14, i10)) {
                        long t9 = t(obj2, j7);
                        E = az4.b(i14 << 3);
                        i8 = az4.c((t9 >> 63) ^ (t9 + t9));
                        d8 = E + i8;
                        i12 += d8;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (z05Var.z(obj2, i14, i10)) {
                        d8 = p15.e(i14, (v05) unsafe.getObject(obj2, j7), z05Var.L(i10));
                        i12 += d8;
                        break;
                    } else {
                        break;
                    }
            }
            i10 += 3;
            obj2 = obj;
        }
    }

    @Override // com.google.android.gms.internal.ads.n15
    public final void h(Object obj, Object obj2) {
        p(obj);
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.f19941a;
            if (i7 >= iArr.length) {
                p15.i(this.f19951k, obj, obj2);
                if (this.f19946f) {
                    p15.h(this.f19952l, obj, obj2);
                    return;
                }
                return;
            }
            int b8 = b(i7);
            int i8 = 1048575 & b8;
            int d8 = d(b8);
            int i9 = iArr[i7];
            long j7 = i8;
            switch (d8) {
                case 0:
                    if (!x(obj2, i7)) {
                        break;
                    } else {
                        f25.u(obj, j7, f25.t(obj2, j7));
                        y(obj, i7);
                        break;
                    }
                case 1:
                    if (!x(obj2, i7)) {
                        break;
                    } else {
                        f25.s(obj, j7, f25.r(obj2, j7));
                        y(obj, i7);
                        break;
                    }
                case 2:
                    if (!x(obj2, i7)) {
                        break;
                    } else {
                        f25.o(obj, j7, f25.n(obj2, j7));
                        y(obj, i7);
                        break;
                    }
                case 3:
                    if (!x(obj2, i7)) {
                        break;
                    } else {
                        f25.o(obj, j7, f25.n(obj2, j7));
                        y(obj, i7);
                        break;
                    }
                case 4:
                    if (!x(obj2, i7)) {
                        break;
                    } else {
                        f25.m(obj, j7, f25.l(obj2, j7));
                        y(obj, i7);
                        break;
                    }
                case 5:
                    if (!x(obj2, i7)) {
                        break;
                    } else {
                        f25.o(obj, j7, f25.n(obj2, j7));
                        y(obj, i7);
                        break;
                    }
                case 6:
                    if (!x(obj2, i7)) {
                        break;
                    } else {
                        f25.m(obj, j7, f25.l(obj2, j7));
                        y(obj, i7);
                        break;
                    }
                case 7:
                    if (!x(obj2, i7)) {
                        break;
                    } else {
                        f25.q(obj, j7, f25.p(obj2, j7));
                        y(obj, i7);
                        break;
                    }
                case 8:
                    if (!x(obj2, i7)) {
                        break;
                    } else {
                        f25.w(obj, j7, f25.v(obj2, j7));
                        y(obj, i7);
                        break;
                    }
                case 9:
                    J(obj, obj2, i7);
                    break;
                case 10:
                    if (!x(obj2, i7)) {
                        break;
                    } else {
                        f25.w(obj, j7, f25.v(obj2, j7));
                        y(obj, i7);
                        break;
                    }
                case 11:
                    if (!x(obj2, i7)) {
                        break;
                    } else {
                        f25.m(obj, j7, f25.l(obj2, j7));
                        y(obj, i7);
                        break;
                    }
                case 12:
                    if (!x(obj2, i7)) {
                        break;
                    } else {
                        f25.m(obj, j7, f25.l(obj2, j7));
                        y(obj, i7);
                        break;
                    }
                case 13:
                    if (!x(obj2, i7)) {
                        break;
                    } else {
                        f25.m(obj, j7, f25.l(obj2, j7));
                        y(obj, i7);
                        break;
                    }
                case 14:
                    if (!x(obj2, i7)) {
                        break;
                    } else {
                        f25.o(obj, j7, f25.n(obj2, j7));
                        y(obj, i7);
                        break;
                    }
                case 15:
                    if (!x(obj2, i7)) {
                        break;
                    } else {
                        f25.m(obj, j7, f25.l(obj2, j7));
                        y(obj, i7);
                        break;
                    }
                case 16:
                    if (!x(obj2, i7)) {
                        break;
                    } else {
                        f25.o(obj, j7, f25.n(obj2, j7));
                        y(obj, i7);
                        break;
                    }
                case 17:
                    J(obj, obj2, i7);
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
                    b05 b05Var = (b05) f25.v(obj, j7);
                    b05 b05Var2 = (b05) f25.v(obj2, j7);
                    int size = b05Var.size();
                    int size2 = b05Var2.size();
                    if (size > 0 && size2 > 0) {
                        if (!b05Var.a()) {
                            b05Var = b05Var.F(size2 + size);
                        }
                        b05Var.addAll(b05Var2);
                    }
                    if (size > 0) {
                        b05Var2 = b05Var;
                    }
                    f25.w(obj, j7, b05Var2);
                    break;
                case androidx.constraintlayout.widget.h.D5 /* 50 */:
                    int i10 = p15.f13634b;
                    f25.w(obj, j7, q05.b(f25.v(obj, j7), f25.v(obj2, j7)));
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
                    if (!z(obj2, i9, i7)) {
                        break;
                    } else {
                        f25.w(obj, j7, f25.v(obj2, j7));
                        A(obj, i9, i7);
                        break;
                    }
                case 60:
                    K(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!z(obj2, i9, i7)) {
                        break;
                    } else {
                        f25.w(obj, j7, f25.v(obj2, j7));
                        A(obj, i9, i7);
                        break;
                    }
                case 68:
                    K(obj, obj2, i7);
                    break;
            }
            i7 += 3;
        }
    }

    @Override // com.google.android.gms.internal.ads.n15
    public final boolean i(Object obj) {
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (true) {
            n15 n15Var = null;
            if (i11 >= this.f19949i) {
                if (!this.f19946f) {
                    return true;
                }
                android.support.v4.media.session.b.a(obj);
                throw null;
            }
            int[] iArr = this.f19948h;
            int[] iArr2 = this.f19941a;
            int i13 = iArr[i11];
            int i14 = iArr2[i13];
            int b8 = b(i13);
            int i15 = iArr2[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i12) {
                if (i16 != 1048575) {
                    i10 = f19940n.getInt(obj, i16);
                }
                i7 = i10;
                i12 = i16;
            } else {
                i7 = i10;
            }
            if ((268435456 & b8) != 0) {
                i8 = i13;
                i9 = i12;
                if (!w(obj, i8, i9, i7, i17)) {
                    return false;
                }
            } else {
                i8 = i13;
                i9 = i12;
            }
            int d8 = d(b8);
            if (d8 != 9 && d8 != 17) {
                if (d8 != 27) {
                    if (d8 == 60 || d8 == 68) {
                        if (z(obj, i14, i8) && !T(obj, b8, L(i8))) {
                            return false;
                        }
                    } else if (d8 != 49) {
                        if (d8 != 50) {
                            continue;
                        } else {
                            p05 p05Var = (p05) f25.v(obj, b8 & 1048575);
                            if (!p05Var.isEmpty() && ((o05) M(i8)).e().f12535c.c() == m25.MESSAGE) {
                                for (Object obj2 : p05Var.values()) {
                                    if (n15Var == null) {
                                        n15Var = f15.a().b(obj2.getClass());
                                    }
                                    if (!n15Var.i(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) f25.v(obj, b8 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    n15 L = L(i8);
                    for (int i18 = 0; i18 < list.size(); i18++) {
                        if (!L.i(list.get(i18))) {
                            return false;
                        }
                    }
                }
            } else if (w(obj, i8, i9, i7, i17) && !T(obj, b8, L(i8))) {
                return false;
            }
            i11++;
            i12 = i9;
            i10 = i7;
        }
    }

    @Override // com.google.android.gms.internal.ads.n15
    public final int j(Object obj) {
        int i7;
        long doubleToLongBits;
        int floatToIntBits;
        int i8;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f19941a;
            if (i9 >= iArr.length) {
                int hashCode = (i10 * 53) + ((sz4) obj).zzt.hashCode();
                if (!this.f19946f) {
                    return hashCode;
                }
                android.support.v4.media.session.b.a(obj);
                throw null;
            }
            int b8 = b(i9);
            int i11 = 1048575 & b8;
            int d8 = d(b8);
            int i12 = iArr[i9];
            long j7 = i11;
            int i13 = 37;
            switch (d8) {
                case 0:
                    i7 = i10 * 53;
                    doubleToLongBits = Double.doubleToLongBits(f25.t(obj, j7));
                    byte[] bArr = c05.f6204b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + floatToIntBits;
                    break;
                case 1:
                    i7 = i10 * 53;
                    floatToIntBits = Float.floatToIntBits(f25.r(obj, j7));
                    i10 = i7 + floatToIntBits;
                    break;
                case 2:
                    i7 = i10 * 53;
                    doubleToLongBits = f25.n(obj, j7);
                    byte[] bArr2 = c05.f6204b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + floatToIntBits;
                    break;
                case 3:
                    i7 = i10 * 53;
                    doubleToLongBits = f25.n(obj, j7);
                    byte[] bArr3 = c05.f6204b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + floatToIntBits;
                    break;
                case 4:
                    i7 = i10 * 53;
                    floatToIntBits = f25.l(obj, j7);
                    i10 = i7 + floatToIntBits;
                    break;
                case 5:
                    i7 = i10 * 53;
                    doubleToLongBits = f25.n(obj, j7);
                    byte[] bArr4 = c05.f6204b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + floatToIntBits;
                    break;
                case 6:
                    i7 = i10 * 53;
                    floatToIntBits = f25.l(obj, j7);
                    i10 = i7 + floatToIntBits;
                    break;
                case 7:
                    i7 = i10 * 53;
                    floatToIntBits = c05.b(f25.p(obj, j7));
                    i10 = i7 + floatToIntBits;
                    break;
                case 8:
                    i7 = i10 * 53;
                    floatToIntBits = ((String) f25.v(obj, j7)).hashCode();
                    i10 = i7 + floatToIntBits;
                    break;
                case 9:
                    i8 = i10 * 53;
                    Object v7 = f25.v(obj, j7);
                    if (v7 != null) {
                        i13 = v7.hashCode();
                    }
                    i10 = i8 + i13;
                    break;
                case 10:
                    i7 = i10 * 53;
                    floatToIntBits = f25.v(obj, j7).hashCode();
                    i10 = i7 + floatToIntBits;
                    break;
                case 11:
                    i7 = i10 * 53;
                    floatToIntBits = f25.l(obj, j7);
                    i10 = i7 + floatToIntBits;
                    break;
                case 12:
                    i7 = i10 * 53;
                    floatToIntBits = f25.l(obj, j7);
                    i10 = i7 + floatToIntBits;
                    break;
                case 13:
                    i7 = i10 * 53;
                    floatToIntBits = f25.l(obj, j7);
                    i10 = i7 + floatToIntBits;
                    break;
                case 14:
                    i7 = i10 * 53;
                    doubleToLongBits = f25.n(obj, j7);
                    byte[] bArr5 = c05.f6204b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + floatToIntBits;
                    break;
                case 15:
                    i7 = i10 * 53;
                    floatToIntBits = f25.l(obj, j7);
                    i10 = i7 + floatToIntBits;
                    break;
                case 16:
                    i7 = i10 * 53;
                    doubleToLongBits = f25.n(obj, j7);
                    byte[] bArr6 = c05.f6204b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + floatToIntBits;
                    break;
                case 17:
                    i8 = i10 * 53;
                    Object v8 = f25.v(obj, j7);
                    if (v8 != null) {
                        i13 = v8.hashCode();
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
                    floatToIntBits = f25.v(obj, j7).hashCode();
                    i10 = i7 + floatToIntBits;
                    break;
                case androidx.constraintlayout.widget.h.D5 /* 50 */:
                    i7 = i10 * 53;
                    floatToIntBits = f25.v(obj, j7).hashCode();
                    i10 = i7 + floatToIntBits;
                    break;
                case androidx.constraintlayout.widget.h.E5 /* 51 */:
                    if (!z(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        doubleToLongBits = Double.doubleToLongBits(q(obj, j7));
                        byte[] bArr7 = c05.f6204b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case androidx.constraintlayout.widget.h.F5 /* 52 */:
                    if (!z(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = Float.floatToIntBits(r(obj, j7));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case androidx.constraintlayout.widget.h.G5 /* 53 */:
                    if (!z(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        doubleToLongBits = t(obj, j7);
                        byte[] bArr8 = c05.f6204b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 54:
                    if (!z(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        doubleToLongBits = t(obj, j7);
                        byte[] bArr9 = c05.f6204b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 55:
                    if (!z(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = s(obj, j7);
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 56:
                    if (!z(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        doubleToLongBits = t(obj, j7);
                        byte[] bArr10 = c05.f6204b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 57:
                    if (!z(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = s(obj, j7);
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 58:
                    if (!z(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = c05.b(u(obj, j7));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 59:
                    if (!z(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = ((String) f25.v(obj, j7)).hashCode();
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!z(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = f25.v(obj, j7).hashCode();
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!z(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = f25.v(obj, j7).hashCode();
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!z(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = s(obj, j7);
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 63:
                    if (!z(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = s(obj, j7);
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!z(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = s(obj, j7);
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 65:
                    if (!z(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        doubleToLongBits = t(obj, j7);
                        byte[] bArr11 = c05.f6204b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 66:
                    if (!z(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = s(obj, j7);
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!z(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        doubleToLongBits = t(obj, j7);
                        byte[] bArr12 = c05.f6204b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 68:
                    if (!z(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = f25.v(obj, j7).hashCode();
                        i10 = i7 + floatToIntBits;
                        break;
                    }
            }
            i9 += 3;
        }
    }

    @Override // com.google.android.gms.internal.ads.n15
    public final void k(Object obj, n25 n25Var) {
        int i7;
        z05 z05Var = this;
        if (z05Var.f19946f) {
            android.support.v4.media.session.b.a(obj);
            throw null;
        }
        int[] iArr = z05Var.f19941a;
        Unsafe unsafe = f19940n;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i10 < iArr.length) {
            int b8 = z05Var.b(i10);
            int d8 = d(b8);
            int i12 = iArr[i10];
            if (d8 <= 17) {
                int i13 = iArr[i10 + 2];
                int i14 = i13 & i8;
                if (i14 != i9) {
                    i11 = i14 == i8 ? 0 : unsafe.getInt(obj, i14);
                    i9 = i14;
                }
                i7 = 1 << (i13 >>> 20);
            } else {
                i7 = 0;
            }
            long j7 = b8 & i8;
            switch (d8) {
                case 0:
                    if (!z05Var.w(obj, i10, i9, i11, i7)) {
                        break;
                    } else {
                        n25Var.i(i12, f25.t(obj, j7));
                        continue;
                    }
                case 1:
                    if (z05Var.w(obj, i10, i9, i11, i7)) {
                        n25Var.F(i12, f25.r(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (z05Var.w(obj, i10, i9, i11, i7)) {
                        n25Var.e(i12, unsafe.getLong(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (z05Var.w(obj, i10, i9, i11, i7)) {
                        n25Var.o(i12, unsafe.getLong(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (z05Var.w(obj, i10, i9, i11, i7)) {
                        n25Var.d(i12, unsafe.getInt(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (z05Var.w(obj, i10, i9, i11, i7)) {
                        n25Var.c(i12, unsafe.getLong(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (z05Var.w(obj, i10, i9, i11, i7)) {
                        n25Var.b(i12, unsafe.getInt(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (z05Var.w(obj, i10, i9, i11, i7)) {
                        n25Var.C(i12, f25.p(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (z05Var.w(obj, i10, i9, i11, i7)) {
                        E(i12, unsafe.getObject(obj, j7), n25Var);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    if (z05Var.w(obj, i10, i9, i11, i7)) {
                        n25Var.G(i12, unsafe.getObject(obj, j7), z05Var.L(i10));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (z05Var.w(obj, i10, i9, i11, i7)) {
                        n25Var.H(i12, (qy4) unsafe.getObject(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if (z05Var.w(obj, i10, i9, i11, i7)) {
                        n25Var.w(i12, unsafe.getInt(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (z05Var.w(obj, i10, i9, i11, i7)) {
                        n25Var.z(i12, unsafe.getInt(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (z05Var.w(obj, i10, i9, i11, i7)) {
                        n25Var.m(i12, unsafe.getInt(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (z05Var.w(obj, i10, i9, i11, i7)) {
                        n25Var.b0(i12, unsafe.getLong(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (z05Var.w(obj, i10, i9, i11, i7)) {
                        n25Var.A(i12, unsafe.getInt(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (z05Var.w(obj, i10, i9, i11, i7)) {
                        n25Var.p(i12, unsafe.getLong(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (z05Var.w(obj, i10, i9, i11, i7)) {
                        n25Var.J(i12, unsafe.getObject(obj, j7), z05Var.L(i10));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    p15.l(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, false);
                    continue;
                case 19:
                    p15.m(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, false);
                    continue;
                case 20:
                    p15.n(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, false);
                    continue;
                case 21:
                    p15.o(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, false);
                    continue;
                case 22:
                    p15.s(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, false);
                    continue;
                case 23:
                    p15.q(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, false);
                    continue;
                case 24:
                    p15.v(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, false);
                    continue;
                case 25:
                    p15.y(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, false);
                    continue;
                case 26:
                    p15.z(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var);
                    break;
                case 27:
                    p15.B(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, z05Var.L(i10));
                    break;
                case 28:
                    p15.A(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var);
                    break;
                case 29:
                    p15.t(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, false);
                    continue;
                case 30:
                    p15.x(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, false);
                    continue;
                case 31:
                    p15.w(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, false);
                    continue;
                case 32:
                    p15.r(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, false);
                    continue;
                case 33:
                    p15.u(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, false);
                    continue;
                case 34:
                    p15.p(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, false);
                    continue;
                case 35:
                    p15.l(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, true);
                    break;
                case androidx.constraintlayout.widget.h.f1530y1 /* 36 */:
                    p15.m(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, true);
                    break;
                case 37:
                    p15.n(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, true);
                    break;
                case androidx.constraintlayout.widget.h.f1478r5 /* 38 */:
                    p15.o(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, true);
                    break;
                case androidx.constraintlayout.widget.h.f1486s5 /* 39 */:
                    p15.s(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, true);
                    break;
                case androidx.constraintlayout.widget.h.f1494t5 /* 40 */:
                    p15.q(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, true);
                    break;
                case androidx.constraintlayout.widget.h.f1502u5 /* 41 */:
                    p15.v(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, true);
                    break;
                case androidx.constraintlayout.widget.h.f1510v5 /* 42 */:
                    p15.y(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, true);
                    break;
                case androidx.constraintlayout.widget.h.f1518w5 /* 43 */:
                    p15.t(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, true);
                    break;
                case androidx.constraintlayout.widget.h.f1526x5 /* 44 */:
                    p15.x(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, true);
                    break;
                case androidx.constraintlayout.widget.h.f1534y5 /* 45 */:
                    p15.w(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, true);
                    break;
                case androidx.constraintlayout.widget.h.f1542z5 /* 46 */:
                    p15.r(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, true);
                    break;
                case androidx.constraintlayout.widget.h.A5 /* 47 */:
                    p15.u(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, true);
                    break;
                case androidx.constraintlayout.widget.h.B5 /* 48 */:
                    p15.p(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, true);
                    break;
                case androidx.constraintlayout.widget.h.C5 /* 49 */:
                    p15.C(iArr[i10], (List) unsafe.getObject(obj, j7), n25Var, z05Var.L(i10));
                    break;
                case androidx.constraintlayout.widget.h.D5 /* 50 */:
                    Object object = unsafe.getObject(obj, j7);
                    if (object != null) {
                        n25Var.I(i12, ((o05) z05Var.M(i10)).e(), (p05) object);
                        break;
                    }
                    break;
                case androidx.constraintlayout.widget.h.E5 /* 51 */:
                    if (z05Var.z(obj, i12, i10)) {
                        n25Var.i(i12, q(obj, j7));
                        break;
                    }
                    break;
                case androidx.constraintlayout.widget.h.F5 /* 52 */:
                    if (z05Var.z(obj, i12, i10)) {
                        n25Var.F(i12, r(obj, j7));
                        break;
                    }
                    break;
                case androidx.constraintlayout.widget.h.G5 /* 53 */:
                    if (z05Var.z(obj, i12, i10)) {
                        n25Var.e(i12, t(obj, j7));
                        break;
                    }
                    break;
                case 54:
                    if (z05Var.z(obj, i12, i10)) {
                        n25Var.o(i12, t(obj, j7));
                        break;
                    }
                    break;
                case 55:
                    if (z05Var.z(obj, i12, i10)) {
                        n25Var.d(i12, s(obj, j7));
                        break;
                    }
                    break;
                case 56:
                    if (z05Var.z(obj, i12, i10)) {
                        n25Var.c(i12, t(obj, j7));
                        break;
                    }
                    break;
                case 57:
                    if (z05Var.z(obj, i12, i10)) {
                        n25Var.b(i12, s(obj, j7));
                        break;
                    }
                    break;
                case 58:
                    if (z05Var.z(obj, i12, i10)) {
                        n25Var.C(i12, u(obj, j7));
                        break;
                    }
                    break;
                case 59:
                    if (z05Var.z(obj, i12, i10)) {
                        E(i12, unsafe.getObject(obj, j7), n25Var);
                        break;
                    }
                    break;
                case 60:
                    if (z05Var.z(obj, i12, i10)) {
                        n25Var.G(i12, unsafe.getObject(obj, j7), z05Var.L(i10));
                        break;
                    }
                    break;
                case 61:
                    if (z05Var.z(obj, i12, i10)) {
                        n25Var.H(i12, (qy4) unsafe.getObject(obj, j7));
                        break;
                    }
                    break;
                case 62:
                    if (z05Var.z(obj, i12, i10)) {
                        n25Var.w(i12, s(obj, j7));
                        break;
                    }
                    break;
                case 63:
                    if (z05Var.z(obj, i12, i10)) {
                        n25Var.z(i12, s(obj, j7));
                        break;
                    }
                    break;
                case 64:
                    if (z05Var.z(obj, i12, i10)) {
                        n25Var.m(i12, s(obj, j7));
                        break;
                    }
                    break;
                case 65:
                    if (z05Var.z(obj, i12, i10)) {
                        n25Var.b0(i12, t(obj, j7));
                        break;
                    }
                    break;
                case 66:
                    if (z05Var.z(obj, i12, i10)) {
                        n25Var.A(i12, s(obj, j7));
                        break;
                    }
                    break;
                case 67:
                    if (z05Var.z(obj, i12, i10)) {
                        n25Var.p(i12, t(obj, j7));
                        break;
                    }
                    break;
                case 68:
                    if (z05Var.z(obj, i12, i10)) {
                        n25Var.J(i12, unsafe.getObject(obj, j7), z05Var.L(i10));
                        break;
                    }
                    break;
            }
            i10 += 3;
            i8 = 1048575;
            z05Var = this;
        }
        ((sz4) obj).zzt.f(n25Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x0034, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x056d A[LOOP:2: B:109:0x0569->B:111:0x056d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0539 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0548 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.n15
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.lang.Object r12, com.google.android.gms.internal.ads.i15 r13, com.google.android.gms.internal.ads.ez4 r14) {
        /*
            Method dump skipped, instructions count: 1552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z05.l(java.lang.Object, com.google.android.gms.internal.ads.i15, com.google.android.gms.internal.ads.ez4):void");
    }

    @Override // com.google.android.gms.internal.ads.n15
    public final void m(Object obj, byte[] bArr, int i7, int i8, ey4 ey4Var) {
        G(obj, bArr, i7, i8, 0, ey4Var);
    }
}
