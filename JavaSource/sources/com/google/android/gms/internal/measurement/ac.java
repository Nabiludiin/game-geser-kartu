package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: MyApplication */
final class ac implements ic {

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f20803l = new int[0];

    /* renamed from: m, reason: collision with root package name */
    private static final Unsafe f20804m = ad.v();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f20805a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f20806b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20807c;

    /* renamed from: d, reason: collision with root package name */
    private final int f20808d;

    /* renamed from: e, reason: collision with root package name */
    private final xb f20809e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f20810f = false;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f20811g;

    /* renamed from: h, reason: collision with root package name */
    private final int f20812h;

    /* renamed from: i, reason: collision with root package name */
    private final int f20813i;

    /* renamed from: j, reason: collision with root package name */
    private final tc f20814j;

    /* renamed from: k, reason: collision with root package name */
    private final ma f20815k;

    private ac(int[] iArr, Object[] objArr, int i7, int i8, xb xbVar, boolean z7, int[] iArr2, int i9, int i10, cc ccVar, ib ibVar, tc tcVar, ma maVar, sb sbVar) {
        this.f20805a = iArr;
        this.f20806b = objArr;
        this.f20807c = i7;
        this.f20808d = i8;
        this.f20811g = iArr2;
        this.f20812h = i9;
        this.f20813i = i10;
        this.f20814j = tcVar;
        this.f20815k = maVar;
        this.f20809e = xbVar;
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
    static com.google.android.gms.internal.measurement.ac B(java.lang.Class r32, com.google.android.gms.internal.measurement.ub r33, com.google.android.gms.internal.measurement.cc r34, com.google.android.gms.internal.measurement.ib r35, com.google.android.gms.internal.measurement.tc r36, com.google.android.gms.internal.measurement.ma r37, com.google.android.gms.internal.measurement.sb r38) {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ac.B(java.lang.Class, com.google.android.gms.internal.measurement.ub, com.google.android.gms.internal.measurement.cc, com.google.android.gms.internal.measurement.ib, com.google.android.gms.internal.measurement.tc, com.google.android.gms.internal.measurement.ma, com.google.android.gms.internal.measurement.sb):com.google.android.gms.internal.measurement.ac");
    }

    private static Field C(Class cls, String str) {
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

    private final void D(Object obj, Object obj2, int i7) {
        if (s(obj2, i7)) {
            int N = N(i7) & 1048575;
            Unsafe unsafe = f20804m;
            long j7 = N;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                int i8 = this.f20805a[i7];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i8);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            ic F = F(i7);
            if (!s(obj, i7)) {
                if (i(object)) {
                    Object a8 = F.a();
                    F.h(a8, object);
                    unsafe.putObject(obj, j7, a8);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                t(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!i(object2)) {
                Object a9 = F.a();
                F.h(a9, object2);
                unsafe.putObject(obj, j7, a9);
                object2 = a9;
            }
            F.h(object2, object);
        }
    }

    private final void E(Object obj, Object obj2, int i7) {
        int[] iArr = this.f20805a;
        int i8 = iArr[i7];
        if (u(obj2, i8, i7)) {
            int N = N(i7) & 1048575;
            Unsafe unsafe = f20804m;
            long j7 = N;
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
            ic F = F(i7);
            if (!u(obj, i8, i7)) {
                if (i(object)) {
                    Object a8 = F.a();
                    F.h(a8, object);
                    unsafe.putObject(obj, j7, a8);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                v(obj, i8, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!i(object2)) {
                Object a9 = F.a();
                F.h(a9, object2);
                unsafe.putObject(obj, j7, a9);
                object2 = a9;
            }
            F.h(object2, object);
        }
    }

    private final ic F(int i7) {
        Object[] objArr = this.f20806b;
        int i8 = i7 / 3;
        int i9 = i8 + i8;
        ic icVar = (ic) objArr[i9];
        if (icVar != null) {
            return icVar;
        }
        ic b8 = fc.a().b((Class) objArr[i9 + 1]);
        objArr[i9] = b8;
        return b8;
    }

    private final Object G(int i7) {
        int i8 = i7 / 3;
        return this.f20806b[i8 + i8];
    }

    private final ab H(int i7) {
        int i8 = i7 / 3;
        return (ab) this.f20806b[i8 + i8 + 1];
    }

    private final Object I(Object obj, int i7) {
        ic F = F(i7);
        int N = N(i7) & 1048575;
        if (!s(obj, i7)) {
            return F.a();
        }
        Object object = f20804m.getObject(obj, N);
        if (i(object)) {
            return object;
        }
        Object a8 = F.a();
        if (object != null) {
            F.h(a8, object);
        }
        return a8;
    }

    private final void J(Object obj, int i7, Object obj2) {
        f20804m.putObject(obj, N(i7) & 1048575, obj2);
        t(obj, i7);
    }

    private final Object K(Object obj, int i7, int i8) {
        ic F = F(i8);
        if (!u(obj, i7, i8)) {
            return F.a();
        }
        Object object = f20804m.getObject(obj, N(i8) & 1048575);
        if (i(object)) {
            return object;
        }
        Object a8 = F.a();
        if (object != null) {
            F.h(a8, object);
        }
        return a8;
    }

    private final void L(Object obj, int i7, int i8, Object obj2) {
        f20804m.putObject(obj, N(i8) & 1048575, obj2);
        v(obj, i7, i8);
    }

    private static boolean M(Object obj, int i7, ic icVar) {
        return icVar.e(ad.s(obj, i7 & 1048575));
    }

    private final int N(int i7) {
        return this.f20805a[i7 + 1];
    }

    private final int O(int i7) {
        return this.f20805a[i7 + 2];
    }

    private static int P(int i7) {
        return (i7 >>> 20) & 255;
    }

    private static boolean i(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof xa) {
            return ((xa) obj).m();
        }
        return true;
    }

    private static void k(Object obj) {
        if (!i(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static double l(Object obj, long j7) {
        return ((Double) ad.s(obj, j7)).doubleValue();
    }

    private static float m(Object obj, long j7) {
        return ((Float) ad.s(obj, j7)).floatValue();
    }

    private static int n(Object obj, long j7) {
        return ((Integer) ad.s(obj, j7)).intValue();
    }

    private static long o(Object obj, long j7) {
        return ((Long) ad.s(obj, j7)).longValue();
    }

    private static boolean p(Object obj, long j7) {
        return ((Boolean) ad.s(obj, j7)).booleanValue();
    }

    private final boolean q(Object obj, Object obj2, int i7) {
        return s(obj, i7) == s(obj2, i7);
    }

    private final boolean r(Object obj, int i7, int i8, int i9, int i10) {
        return i8 == 1048575 ? s(obj, i7) : (i9 & i10) != 0;
    }

    private final boolean s(Object obj, int i7) {
        int O = O(i7);
        long j7 = O & 1048575;
        if (j7 != 1048575) {
            return (ad.i(obj, j7) & (1 << (O >>> 20))) != 0;
        }
        int N = N(i7);
        long j8 = N & 1048575;
        switch (P(N)) {
            case 0:
                return Double.doubleToRawLongBits(ad.q(obj, j8)) != 0;
            case 1:
                return Float.floatToRawIntBits(ad.o(obj, j8)) != 0;
            case 2:
                return ad.k(obj, j8) != 0;
            case 3:
                return ad.k(obj, j8) != 0;
            case 4:
                return ad.i(obj, j8) != 0;
            case 5:
                return ad.k(obj, j8) != 0;
            case 6:
                return ad.i(obj, j8) != 0;
            case 7:
                return ad.m(obj, j8);
            case 8:
                Object s7 = ad.s(obj, j8);
                if (s7 instanceof String) {
                    return !((String) s7).isEmpty();
                }
                if (s7 instanceof ca) {
                    return !ca.f20858r.equals(s7);
                }
                throw new IllegalArgumentException();
            case 9:
                return ad.s(obj, j8) != null;
            case 10:
                return !ca.f20858r.equals(ad.s(obj, j8));
            case 11:
                return ad.i(obj, j8) != 0;
            case 12:
                return ad.i(obj, j8) != 0;
            case 13:
                return ad.i(obj, j8) != 0;
            case 14:
                return ad.k(obj, j8) != 0;
            case 15:
                return ad.i(obj, j8) != 0;
            case 16:
                return ad.k(obj, j8) != 0;
            case 17:
                return ad.s(obj, j8) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void t(Object obj, int i7) {
        int O = O(i7);
        long j7 = 1048575 & O;
        if (j7 == 1048575) {
            return;
        }
        ad.j(obj, j7, (1 << (O >>> 20)) | ad.i(obj, j7));
    }

    private final boolean u(Object obj, int i7, int i8) {
        return ad.i(obj, (long) (O(i8) & 1048575)) == i7;
    }

    private final void v(Object obj, int i7, int i8) {
        ad.j(obj, O(i8) & 1048575, i7);
    }

    private final int w(int i7, int i8) {
        int[] iArr = this.f20805a;
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

    private static final int x(byte[] bArr, int i7, int i8, ed edVar, Class cls, r9 r9Var) {
        ed edVar2 = ed.f20915s;
        switch (edVar.ordinal()) {
            case 0:
                int i9 = i7 + 8;
                r9Var.f21332c = Double.valueOf(Double.longBitsToDouble(s9.e(bArr, i7)));
                return i9;
            case 1:
                int i10 = i7 + 4;
                r9Var.f21332c = Float.valueOf(Float.intBitsToFloat(s9.d(bArr, i7)));
                return i10;
            case 2:
            case 3:
                int c8 = s9.c(bArr, i7, r9Var);
                r9Var.f21332c = Long.valueOf(r9Var.f21331b);
                return c8;
            case 4:
            case 12:
            case 13:
                int a8 = s9.a(bArr, i7, r9Var);
                r9Var.f21332c = Integer.valueOf(r9Var.f21330a);
                return a8;
            case 5:
            case 15:
                int i11 = i7 + 8;
                r9Var.f21332c = Long.valueOf(s9.e(bArr, i7));
                return i11;
            case 6:
            case 14:
                int i12 = i7 + 4;
                r9Var.f21332c = Integer.valueOf(s9.d(bArr, i7));
                return i12;
            case 7:
                int c9 = s9.c(bArr, i7, r9Var);
                r9Var.f21332c = Boolean.valueOf(r9Var.f21331b != 0);
                return c9;
            case 8:
                return s9.f(bArr, i7, r9Var);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return s9.h(fc.a().b(cls), bArr, i7, i8, r9Var);
            case 11:
                return s9.g(bArr, i7, r9Var);
            case 16:
                int a9 = s9.a(bArr, i7, r9Var);
                r9Var.f21332c = Integer.valueOf(ea.a(r9Var.f21330a));
                return a9;
            case 17:
                int c10 = s9.c(bArr, i7, r9Var);
                r9Var.f21332c = Long.valueOf(ea.b(r9Var.f21331b));
                return c10;
        }
    }

    private static final void y(int i7, Object obj, gd gdVar) {
        if (obj instanceof String) {
            gdVar.u(i7, (String) obj);
        } else {
            gdVar.G(i7, (ca) obj);
        }
    }

    static uc z(Object obj) {
        xa xaVar = (xa) obj;
        uc ucVar = xaVar.zzc;
        if (ucVar != uc.a()) {
            return ucVar;
        }
        uc b8 = uc.b();
        xaVar.zzc = b8;
        return b8;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int A(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, com.google.android.gms.internal.measurement.r9 r41) {
        /*
            Method dump skipped, instructions count: 3966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ac.A(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.r9):int");
    }

    @Override // com.google.android.gms.internal.measurement.ic
    public final Object a() {
        return ((xa) this.f20809e).o();
    }

    @Override // com.google.android.gms.internal.measurement.ic
    public final void b(Object obj) {
        if (i(obj)) {
            if (obj instanceof xa) {
                xa xaVar = (xa) obj;
                xaVar.t(Integer.MAX_VALUE);
                xaVar.zza = 0;
                xaVar.n();
            }
            int[] iArr = this.f20805a;
            for (int i7 = 0; i7 < iArr.length; i7 += 3) {
                int N = N(i7);
                int i8 = 1048575 & N;
                int P = P(N);
                long j7 = i8;
                if (P != 9) {
                    if (P != 60 && P != 68) {
                        switch (P) {
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
                                ((db) ad.s(obj, j7)).b();
                                break;
                            case androidx.constraintlayout.widget.h.D5 /* 50 */:
                                Unsafe unsafe = f20804m;
                                Object object = unsafe.getObject(obj, j7);
                                if (object != null) {
                                    ((rb) object).g();
                                    unsafe.putObject(obj, j7, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (u(obj, iArr[i7], i7)) {
                        F(i7).b(f20804m.getObject(obj, j7));
                    }
                }
                if (s(obj, i7)) {
                    F(i7).b(f20804m.getObject(obj, j7));
                }
            }
            this.f20814j.b(obj);
            if (this.f20810f) {
                this.f20815k.a(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.ic
    public final void c(Object obj, byte[] bArr, int i7, int i8, r9 r9Var) {
        A(obj, bArr, i7, i8, 0, r9Var);
    }

    @Override // com.google.android.gms.internal.measurement.ic
    public final void d(Object obj, gd gdVar) {
        int i7;
        ac acVar = this;
        if (acVar.f20810f) {
            android.support.v4.media.session.b.a(obj);
            throw null;
        }
        int[] iArr = acVar.f20805a;
        Unsafe unsafe = f20804m;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i10 < iArr.length) {
            int N = acVar.N(i10);
            int P = P(N);
            int i12 = iArr[i10];
            if (P <= 17) {
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
            long j7 = N & i8;
            switch (P) {
                case 0:
                    if (!acVar.r(obj, i10, i9, i11, i7)) {
                        break;
                    } else {
                        gdVar.i(i12, ad.q(obj, j7));
                        continue;
                    }
                case 1:
                    if (acVar.r(obj, i10, i9, i11, i7)) {
                        gdVar.F(i12, ad.o(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (acVar.r(obj, i10, i9, i11, i7)) {
                        gdVar.e(i12, unsafe.getLong(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (acVar.r(obj, i10, i9, i11, i7)) {
                        gdVar.o(i12, unsafe.getLong(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (acVar.r(obj, i10, i9, i11, i7)) {
                        gdVar.d(i12, unsafe.getInt(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (acVar.r(obj, i10, i9, i11, i7)) {
                        gdVar.c(i12, unsafe.getLong(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (acVar.r(obj, i10, i9, i11, i7)) {
                        gdVar.b(i12, unsafe.getInt(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (acVar.r(obj, i10, i9, i11, i7)) {
                        gdVar.C(i12, ad.m(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (acVar.r(obj, i10, i9, i11, i7)) {
                        y(i12, unsafe.getObject(obj, j7), gdVar);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    if (acVar.r(obj, i10, i9, i11, i7)) {
                        gdVar.I(i12, unsafe.getObject(obj, j7), acVar.F(i10));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (acVar.r(obj, i10, i9, i11, i7)) {
                        gdVar.G(i12, (ca) unsafe.getObject(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if (acVar.r(obj, i10, i9, i11, i7)) {
                        gdVar.w(i12, unsafe.getInt(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (acVar.r(obj, i10, i9, i11, i7)) {
                        gdVar.z(i12, unsafe.getInt(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (acVar.r(obj, i10, i9, i11, i7)) {
                        gdVar.m(i12, unsafe.getInt(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (acVar.r(obj, i10, i9, i11, i7)) {
                        gdVar.b0(i12, unsafe.getLong(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (acVar.r(obj, i10, i9, i11, i7)) {
                        gdVar.A(i12, unsafe.getInt(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (acVar.r(obj, i10, i9, i11, i7)) {
                        gdVar.p(i12, unsafe.getLong(obj, j7));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (acVar.r(obj, i10, i9, i11, i7)) {
                        gdVar.J(i12, unsafe.getObject(obj, j7), acVar.F(i10));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    kc.f(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, false);
                    continue;
                case 19:
                    kc.g(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, false);
                    continue;
                case 20:
                    kc.h(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, false);
                    continue;
                case 21:
                    kc.i(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, false);
                    continue;
                case 22:
                    kc.m(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, false);
                    continue;
                case 23:
                    kc.k(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, false);
                    continue;
                case 24:
                    kc.p(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, false);
                    continue;
                case 25:
                    kc.s(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, false);
                    continue;
                case 26:
                    int i15 = iArr[i10];
                    List list = (List) unsafe.getObject(obj, j7);
                    int i16 = kc.f21080b;
                    if (list != null && !list.isEmpty()) {
                        gdVar.x(i15, list);
                        break;
                    }
                    break;
                case 27:
                    int i17 = iArr[i10];
                    List list2 = (List) unsafe.getObject(obj, j7);
                    ic F = acVar.F(i10);
                    int i18 = kc.f21080b;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i19 = 0; i19 < list2.size(); i19++) {
                            ((ia) gdVar).I(i17, list2.get(i19), F);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i20 = iArr[i10];
                    List list3 = (List) unsafe.getObject(obj, j7);
                    int i21 = kc.f21080b;
                    if (list3 != null && !list3.isEmpty()) {
                        gdVar.t(i20, list3);
                        break;
                    }
                    break;
                case 29:
                    kc.n(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, false);
                    continue;
                case 30:
                    kc.r(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, false);
                    continue;
                case 31:
                    kc.q(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, false);
                    continue;
                case 32:
                    kc.l(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, false);
                    continue;
                case 33:
                    kc.o(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, false);
                    continue;
                case 34:
                    kc.j(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, false);
                    continue;
                case 35:
                    kc.f(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, true);
                    break;
                case androidx.constraintlayout.widget.h.f1530y1 /* 36 */:
                    kc.g(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, true);
                    break;
                case 37:
                    kc.h(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, true);
                    break;
                case androidx.constraintlayout.widget.h.f1478r5 /* 38 */:
                    kc.i(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, true);
                    break;
                case androidx.constraintlayout.widget.h.f1486s5 /* 39 */:
                    kc.m(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, true);
                    break;
                case androidx.constraintlayout.widget.h.f1494t5 /* 40 */:
                    kc.k(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, true);
                    break;
                case androidx.constraintlayout.widget.h.f1502u5 /* 41 */:
                    kc.p(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, true);
                    break;
                case androidx.constraintlayout.widget.h.f1510v5 /* 42 */:
                    kc.s(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, true);
                    break;
                case androidx.constraintlayout.widget.h.f1518w5 /* 43 */:
                    kc.n(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, true);
                    break;
                case androidx.constraintlayout.widget.h.f1526x5 /* 44 */:
                    kc.r(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, true);
                    break;
                case androidx.constraintlayout.widget.h.f1534y5 /* 45 */:
                    kc.q(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, true);
                    break;
                case androidx.constraintlayout.widget.h.f1542z5 /* 46 */:
                    kc.l(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, true);
                    break;
                case androidx.constraintlayout.widget.h.A5 /* 47 */:
                    kc.o(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, true);
                    break;
                case androidx.constraintlayout.widget.h.B5 /* 48 */:
                    kc.j(iArr[i10], (List) unsafe.getObject(obj, j7), gdVar, true);
                    break;
                case androidx.constraintlayout.widget.h.C5 /* 49 */:
                    int i22 = iArr[i10];
                    List list4 = (List) unsafe.getObject(obj, j7);
                    ic F2 = acVar.F(i10);
                    int i23 = kc.f21080b;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i24 = 0; i24 < list4.size(); i24++) {
                            ((ia) gdVar).J(i22, list4.get(i24), F2);
                        }
                        break;
                    }
                    break;
                case androidx.constraintlayout.widget.h.D5 /* 50 */:
                    Object object = unsafe.getObject(obj, j7);
                    if (object != null) {
                        gdVar.H(i12, ((qb) acVar.G(i10)).e(), (rb) object);
                        break;
                    }
                    break;
                case androidx.constraintlayout.widget.h.E5 /* 51 */:
                    if (acVar.u(obj, i12, i10)) {
                        gdVar.i(i12, l(obj, j7));
                        break;
                    }
                    break;
                case androidx.constraintlayout.widget.h.F5 /* 52 */:
                    if (acVar.u(obj, i12, i10)) {
                        gdVar.F(i12, m(obj, j7));
                        break;
                    }
                    break;
                case androidx.constraintlayout.widget.h.G5 /* 53 */:
                    if (acVar.u(obj, i12, i10)) {
                        gdVar.e(i12, o(obj, j7));
                        break;
                    }
                    break;
                case 54:
                    if (acVar.u(obj, i12, i10)) {
                        gdVar.o(i12, o(obj, j7));
                        break;
                    }
                    break;
                case 55:
                    if (acVar.u(obj, i12, i10)) {
                        gdVar.d(i12, n(obj, j7));
                        break;
                    }
                    break;
                case 56:
                    if (acVar.u(obj, i12, i10)) {
                        gdVar.c(i12, o(obj, j7));
                        break;
                    }
                    break;
                case 57:
                    if (acVar.u(obj, i12, i10)) {
                        gdVar.b(i12, n(obj, j7));
                        break;
                    }
                    break;
                case 58:
                    if (acVar.u(obj, i12, i10)) {
                        gdVar.C(i12, p(obj, j7));
                        break;
                    }
                    break;
                case 59:
                    if (acVar.u(obj, i12, i10)) {
                        y(i12, unsafe.getObject(obj, j7), gdVar);
                        break;
                    }
                    break;
                case 60:
                    if (acVar.u(obj, i12, i10)) {
                        gdVar.I(i12, unsafe.getObject(obj, j7), acVar.F(i10));
                        break;
                    }
                    break;
                case 61:
                    if (acVar.u(obj, i12, i10)) {
                        gdVar.G(i12, (ca) unsafe.getObject(obj, j7));
                        break;
                    }
                    break;
                case 62:
                    if (acVar.u(obj, i12, i10)) {
                        gdVar.w(i12, n(obj, j7));
                        break;
                    }
                    break;
                case 63:
                    if (acVar.u(obj, i12, i10)) {
                        gdVar.z(i12, n(obj, j7));
                        break;
                    }
                    break;
                case 64:
                    if (acVar.u(obj, i12, i10)) {
                        gdVar.m(i12, n(obj, j7));
                        break;
                    }
                    break;
                case 65:
                    if (acVar.u(obj, i12, i10)) {
                        gdVar.b0(i12, o(obj, j7));
                        break;
                    }
                    break;
                case 66:
                    if (acVar.u(obj, i12, i10)) {
                        gdVar.A(i12, n(obj, j7));
                        break;
                    }
                    break;
                case 67:
                    if (acVar.u(obj, i12, i10)) {
                        gdVar.p(i12, o(obj, j7));
                        break;
                    }
                    break;
                case 68:
                    if (acVar.u(obj, i12, i10)) {
                        gdVar.J(i12, unsafe.getObject(obj, j7), acVar.F(i10));
                        break;
                    }
                    break;
            }
            i10 += 3;
            i8 = 1048575;
            acVar = this;
        }
        ((xa) obj).zzc.f(gdVar);
    }

    @Override // com.google.android.gms.internal.measurement.ic
    public final boolean e(Object obj) {
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (true) {
            ic icVar = null;
            if (i11 >= this.f20812h) {
                if (!this.f20810f) {
                    return true;
                }
                android.support.v4.media.session.b.a(obj);
                throw null;
            }
            int[] iArr = this.f20811g;
            int[] iArr2 = this.f20805a;
            int i13 = iArr[i11];
            int i14 = iArr2[i13];
            int N = N(i13);
            int i15 = iArr2[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i12) {
                if (i16 != 1048575) {
                    i10 = f20804m.getInt(obj, i16);
                }
                i7 = i10;
                i12 = i16;
            } else {
                i7 = i10;
            }
            if ((268435456 & N) != 0) {
                i8 = i13;
                i9 = i12;
                if (!r(obj, i8, i9, i7, i17)) {
                    return false;
                }
            } else {
                i8 = i13;
                i9 = i12;
            }
            int P = P(N);
            if (P != 9 && P != 17) {
                if (P != 27) {
                    if (P == 60 || P == 68) {
                        if (u(obj, i14, i8) && !M(obj, N, F(i8))) {
                            return false;
                        }
                    } else if (P != 49) {
                        if (P != 50) {
                            continue;
                        } else {
                            rb rbVar = (rb) ad.s(obj, N & 1048575);
                            if (!rbVar.isEmpty() && ((qb) G(i8)).e().f21235c.c() == fd.MESSAGE) {
                                for (Object obj2 : rbVar.values()) {
                                    if (icVar == null) {
                                        icVar = fc.a().b(obj2.getClass());
                                    }
                                    if (!icVar.e(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) ad.s(obj, N & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ic F = F(i8);
                    for (int i18 = 0; i18 < list.size(); i18++) {
                        if (!F.e(list.get(i18))) {
                            return false;
                        }
                    }
                }
            } else if (r(obj, i8, i9, i7, i17) && !M(obj, N, F(i8))) {
                return false;
            }
            i11++;
            i12 = i9;
            i10 = i7;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ic
    public final boolean f(Object obj, Object obj2) {
        boolean b8;
        for (int i7 = 0; i7 < this.f20805a.length; i7 += 3) {
            int N = N(i7);
            long j7 = N & 1048575;
            switch (P(N)) {
                case 0:
                    if (q(obj, obj2, i7) && Double.doubleToLongBits(ad.q(obj, j7)) == Double.doubleToLongBits(ad.q(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (q(obj, obj2, i7) && Float.floatToIntBits(ad.o(obj, j7)) == Float.floatToIntBits(ad.o(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (q(obj, obj2, i7) && ad.k(obj, j7) == ad.k(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (q(obj, obj2, i7) && ad.k(obj, j7) == ad.k(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (q(obj, obj2, i7) && ad.i(obj, j7) == ad.i(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (q(obj, obj2, i7) && ad.k(obj, j7) == ad.k(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (q(obj, obj2, i7) && ad.i(obj, j7) == ad.i(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (q(obj, obj2, i7) && ad.m(obj, j7) == ad.m(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (q(obj, obj2, i7) && kc.b(ad.s(obj, j7), ad.s(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (q(obj, obj2, i7) && kc.b(ad.s(obj, j7), ad.s(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (q(obj, obj2, i7) && kc.b(ad.s(obj, j7), ad.s(obj2, j7))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (q(obj, obj2, i7) && ad.i(obj, j7) == ad.i(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (q(obj, obj2, i7) && ad.i(obj, j7) == ad.i(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (q(obj, obj2, i7) && ad.i(obj, j7) == ad.i(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (q(obj, obj2, i7) && ad.k(obj, j7) == ad.k(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (q(obj, obj2, i7) && ad.i(obj, j7) == ad.i(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (q(obj, obj2, i7) && ad.k(obj, j7) == ad.k(obj2, j7)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (q(obj, obj2, i7) && kc.b(ad.s(obj, j7), ad.s(obj2, j7))) {
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
                    b8 = kc.b(ad.s(obj, j7), ad.s(obj2, j7));
                    break;
                case androidx.constraintlayout.widget.h.D5 /* 50 */:
                    b8 = kc.b(ad.s(obj, j7), ad.s(obj2, j7));
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
                    long O = O(i7) & 1048575;
                    if (ad.i(obj, O) == ad.i(obj2, O) && kc.b(ad.s(obj, j7), ad.s(obj2, j7))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!b8) {
                return false;
            }
        }
        if (!((xa) obj).zzc.equals(((xa) obj2).zzc)) {
            return false;
        }
        if (!this.f20810f) {
            return true;
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.ic
    public final int g(Object obj) {
        int i7;
        int E;
        int E2;
        int a8;
        int E3;
        int E4;
        int E5;
        int g8;
        int E6;
        int E7;
        int t7;
        int size;
        int u7;
        int E8;
        int E9;
        int E10;
        int i8;
        int C;
        int E11;
        int E12;
        int i9;
        int E13;
        int E14;
        int E15;
        int g9;
        int E16;
        ac acVar = this;
        Object obj2 = obj;
        Unsafe unsafe = f20804m;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (true) {
            int[] iArr = acVar.f20805a;
            if (i10 >= iArr.length) {
                int h8 = i12 + ((xa) obj).zzc.h();
                if (!acVar.f20810f) {
                    return h8;
                }
                android.support.v4.media.session.b.a(obj);
                throw null;
            }
            int N = acVar.N(i10);
            int P = P(N);
            int i14 = iArr[i10];
            int i15 = iArr[i10 + 2];
            int i16 = i15 & 1048575;
            if (P <= 17) {
                if (i16 != i13) {
                    i11 = i16 == 1048575 ? 0 : unsafe.getInt(obj2, i16);
                    i13 = i16;
                }
                i7 = 1 << (i15 >>> 20);
            } else {
                i7 = 0;
            }
            int i17 = N & 1048575;
            if (P >= ra.f21335a0.a()) {
                ra.f21348n0.a();
            }
            long j7 = i17;
            switch (P) {
                case 0:
                    if (acVar.r(obj2, i10, i13, i11, i7)) {
                        i12 += ha.E(i14 << 3) + 8;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (acVar.r(obj2, i10, i13, i11, i7)) {
                        E = ha.E(i14 << 3);
                        E4 = E + 4;
                        i12 += E4;
                    }
                    acVar = this;
                    break;
                case 2:
                    if (acVar.r(obj2, i10, i13, i11, i7)) {
                        long j8 = unsafe.getLong(obj2, j7);
                        E2 = ha.E(i14 << 3);
                        a8 = ha.a(j8);
                        E4 = E2 + a8;
                        i12 += E4;
                    }
                    acVar = this;
                    break;
                case 3:
                    if (acVar.r(obj2, i10, i13, i11, i7)) {
                        long j9 = unsafe.getLong(obj2, j7);
                        E2 = ha.E(i14 << 3);
                        a8 = ha.a(j9);
                        E4 = E2 + a8;
                        i12 += E4;
                    }
                    acVar = this;
                    break;
                case 4:
                    if (acVar.r(obj2, i10, i13, i11, i7)) {
                        long j10 = unsafe.getInt(obj2, j7);
                        E2 = ha.E(i14 << 3);
                        a8 = ha.a(j10);
                        E4 = E2 + a8;
                        i12 += E4;
                    }
                    acVar = this;
                    break;
                case 5:
                    if (acVar.r(obj2, i10, i13, i11, i7)) {
                        E3 = ha.E(i14 << 3);
                        E4 = E3 + 8;
                        i12 += E4;
                    }
                    acVar = this;
                    break;
                case 6:
                    if (acVar.r(obj2, i10, i13, i11, i7)) {
                        E = ha.E(i14 << 3);
                        E4 = E + 4;
                        i12 += E4;
                    }
                    acVar = this;
                    break;
                case 7:
                    if (acVar.r(obj2, i10, i13, i11, i7)) {
                        E4 = ha.E(i14 << 3) + 1;
                        i12 += E4;
                    }
                    acVar = this;
                    break;
                case 8:
                    if (acVar.r(obj2, i10, i13, i11, i7)) {
                        int i18 = i14 << 3;
                        Object object = unsafe.getObject(obj2, j7);
                        if (object instanceof ca) {
                            E5 = ha.E(i18);
                            g8 = ((ca) object).g();
                            E6 = ha.E(g8);
                            E4 = E5 + E6 + g8;
                            i12 += E4;
                        } else {
                            E2 = ha.E(i18);
                            a8 = ha.b((String) object);
                            E4 = E2 + a8;
                            i12 += E4;
                        }
                    }
                    acVar = this;
                    break;
                case 9:
                    if (acVar.r(obj2, i10, i13, i11, i7)) {
                        E7 = kc.E(i14, unsafe.getObject(obj2, j7), acVar.F(i10));
                        i12 += E7;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (acVar.r(obj2, i10, i13, i11, i7)) {
                        ca caVar = (ca) unsafe.getObject(obj2, j7);
                        E5 = ha.E(i14 << 3);
                        g8 = caVar.g();
                        E6 = ha.E(g8);
                        E4 = E5 + E6 + g8;
                        i12 += E4;
                    }
                    acVar = this;
                    break;
                case 11:
                    if (acVar.r(obj2, i10, i13, i11, i7)) {
                        int i19 = unsafe.getInt(obj2, j7);
                        E2 = ha.E(i14 << 3);
                        a8 = ha.E(i19);
                        E4 = E2 + a8;
                        i12 += E4;
                    }
                    acVar = this;
                    break;
                case 12:
                    if (acVar.r(obj2, i10, i13, i11, i7)) {
                        long j11 = unsafe.getInt(obj2, j7);
                        E2 = ha.E(i14 << 3);
                        a8 = ha.a(j11);
                        E4 = E2 + a8;
                        i12 += E4;
                    }
                    acVar = this;
                    break;
                case 13:
                    if (acVar.r(obj2, i10, i13, i11, i7)) {
                        E = ha.E(i14 << 3);
                        E4 = E + 4;
                        i12 += E4;
                    }
                    acVar = this;
                    break;
                case 14:
                    if (acVar.r(obj2, i10, i13, i11, i7)) {
                        E3 = ha.E(i14 << 3);
                        E4 = E3 + 8;
                        i12 += E4;
                    }
                    acVar = this;
                    break;
                case 15:
                    if (acVar.r(obj2, i10, i13, i11, i7)) {
                        int i20 = unsafe.getInt(obj2, j7);
                        E2 = ha.E(i14 << 3);
                        a8 = ha.E((i20 >> 31) ^ (i20 + i20));
                        E4 = E2 + a8;
                        i12 += E4;
                    }
                    acVar = this;
                    break;
                case 16:
                    if (acVar.r(obj2, i10, i13, i11, i7)) {
                        long j12 = unsafe.getLong(obj2, j7);
                        E2 = ha.E(i14 << 3);
                        a8 = ha.a((j12 >> 63) ^ (j12 + j12));
                        E4 = E2 + a8;
                        i12 += E4;
                    }
                    acVar = this;
                    break;
                case 17:
                    if (acVar.r(obj2, i10, i13, i11, i7)) {
                        E7 = ha.g(i14, (xb) unsafe.getObject(obj2, j7), acVar.F(i10));
                        i12 += E7;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    E7 = kc.D(i14, (List) unsafe.getObject(obj2, j7), false);
                    i12 += E7;
                    break;
                case 19:
                    E7 = kc.B(i14, (List) unsafe.getObject(obj2, j7), false);
                    i12 += E7;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j7);
                    int i21 = kc.f21080b;
                    if (list.size() != 0) {
                        t7 = kc.t(list) + (list.size() * ha.E(i14 << 3));
                        i12 += t7;
                        break;
                    }
                    t7 = 0;
                    i12 += t7;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j7);
                    int i22 = kc.f21080b;
                    size = list2.size();
                    if (size != 0) {
                        u7 = kc.u(list2);
                        E8 = ha.E(i14 << 3);
                        i8 = size * E8;
                        E7 = u7 + i8;
                        i12 += E7;
                        break;
                    }
                    E7 = 0;
                    i12 += E7;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j7);
                    int i23 = kc.f21080b;
                    size = list3.size();
                    if (size != 0) {
                        u7 = kc.x(list3);
                        E8 = ha.E(i14 << 3);
                        i8 = size * E8;
                        E7 = u7 + i8;
                        i12 += E7;
                        break;
                    }
                    E7 = 0;
                    i12 += E7;
                case 23:
                    E7 = kc.D(i14, (List) unsafe.getObject(obj2, j7), false);
                    i12 += E7;
                    break;
                case 24:
                    E7 = kc.B(i14, (List) unsafe.getObject(obj2, j7), false);
                    i12 += E7;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j7);
                    int i24 = kc.f21080b;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        E7 = size2 * (ha.E(i14 << 3) + 1);
                        i12 += E7;
                        break;
                    }
                    E7 = 0;
                    i12 += E7;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j7);
                    int i25 = kc.f21080b;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        t7 = ha.E(i14 << 3) * size3;
                        for (int i26 = 0; i26 < size3; i26++) {
                            Object obj3 = list5.get(i26);
                            if (obj3 instanceof ca) {
                                int g10 = ((ca) obj3).g();
                                t7 += ha.E(g10) + g10;
                            } else {
                                t7 += ha.b((String) obj3);
                            }
                        }
                        i12 += t7;
                        break;
                    }
                    t7 = 0;
                    i12 += t7;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j7);
                    ic F = acVar.F(i10);
                    int i27 = kc.f21080b;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        E9 = 0;
                    } else {
                        E9 = ha.E(i14 << 3) * size4;
                        for (int i28 = 0; i28 < size4; i28++) {
                            E9 += ha.d((xb) list6.get(i28), F);
                        }
                    }
                    i12 += E9;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j7);
                    int i29 = kc.f21080b;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        E10 = 0;
                    } else {
                        E10 = size5 * ha.E(i14 << 3);
                        for (int i30 = 0; i30 < list7.size(); i30++) {
                            int g11 = ((ca) list7.get(i30)).g();
                            E10 += ha.E(g11) + g11;
                        }
                    }
                    i12 += E10;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j7);
                    int i31 = kc.f21080b;
                    size = list8.size();
                    if (size != 0) {
                        u7 = kc.y(list8);
                        E8 = ha.E(i14 << 3);
                        i8 = size * E8;
                        E7 = u7 + i8;
                        i12 += E7;
                        break;
                    }
                    E7 = 0;
                    i12 += E7;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j7);
                    int i32 = kc.f21080b;
                    size = list9.size();
                    if (size != 0) {
                        u7 = kc.w(list9);
                        E8 = ha.E(i14 << 3);
                        i8 = size * E8;
                        E7 = u7 + i8;
                        i12 += E7;
                        break;
                    }
                    E7 = 0;
                    i12 += E7;
                case 31:
                    E7 = kc.B(i14, (List) unsafe.getObject(obj2, j7), false);
                    i12 += E7;
                    break;
                case 32:
                    E7 = kc.D(i14, (List) unsafe.getObject(obj2, j7), false);
                    i12 += E7;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j7);
                    int i33 = kc.f21080b;
                    size = list10.size();
                    if (size != 0) {
                        u7 = kc.z(list10);
                        E8 = ha.E(i14 << 3);
                        i8 = size * E8;
                        E7 = u7 + i8;
                        i12 += E7;
                        break;
                    }
                    E7 = 0;
                    i12 += E7;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j7);
                    int i34 = kc.f21080b;
                    size = list11.size();
                    if (size != 0) {
                        u7 = kc.v(list11);
                        E8 = ha.E(i14 << 3);
                        i8 = size * E8;
                        E7 = u7 + i8;
                        i12 += E7;
                        break;
                    }
                    E7 = 0;
                    i12 += E7;
                case 35:
                    C = kc.C((List) unsafe.getObject(obj2, j7));
                    if (C > 0) {
                        E11 = ha.E(i14 << 3);
                        E12 = ha.E(C);
                        E10 = E11 + E12 + C;
                        i12 += E10;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.f1530y1 /* 36 */:
                    C = kc.A((List) unsafe.getObject(obj2, j7));
                    if (C > 0) {
                        E11 = ha.E(i14 << 3);
                        E12 = ha.E(C);
                        E10 = E11 + E12 + C;
                        i12 += E10;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    C = kc.t((List) unsafe.getObject(obj2, j7));
                    if (C > 0) {
                        E11 = ha.E(i14 << 3);
                        E12 = ha.E(C);
                        E10 = E11 + E12 + C;
                        i12 += E10;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.f1478r5 /* 38 */:
                    C = kc.u((List) unsafe.getObject(obj2, j7));
                    if (C > 0) {
                        E11 = ha.E(i14 << 3);
                        E12 = ha.E(C);
                        E10 = E11 + E12 + C;
                        i12 += E10;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.f1486s5 /* 39 */:
                    C = kc.x((List) unsafe.getObject(obj2, j7));
                    if (C > 0) {
                        E11 = ha.E(i14 << 3);
                        E12 = ha.E(C);
                        E10 = E11 + E12 + C;
                        i12 += E10;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.f1494t5 /* 40 */:
                    C = kc.C((List) unsafe.getObject(obj2, j7));
                    if (C > 0) {
                        E11 = ha.E(i14 << 3);
                        E12 = ha.E(C);
                        E10 = E11 + E12 + C;
                        i12 += E10;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.f1502u5 /* 41 */:
                    C = kc.A((List) unsafe.getObject(obj2, j7));
                    if (C > 0) {
                        E11 = ha.E(i14 << 3);
                        E12 = ha.E(C);
                        E10 = E11 + E12 + C;
                        i12 += E10;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.f1510v5 /* 42 */:
                    List list12 = (List) unsafe.getObject(obj2, j7);
                    int i35 = kc.f21080b;
                    C = list12.size();
                    if (C > 0) {
                        E11 = ha.E(i14 << 3);
                        E12 = ha.E(C);
                        E10 = E11 + E12 + C;
                        i12 += E10;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.f1518w5 /* 43 */:
                    C = kc.y((List) unsafe.getObject(obj2, j7));
                    if (C > 0) {
                        E11 = ha.E(i14 << 3);
                        E12 = ha.E(C);
                        E10 = E11 + E12 + C;
                        i12 += E10;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.f1526x5 /* 44 */:
                    C = kc.w((List) unsafe.getObject(obj2, j7));
                    if (C > 0) {
                        E11 = ha.E(i14 << 3);
                        E12 = ha.E(C);
                        E10 = E11 + E12 + C;
                        i12 += E10;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.f1534y5 /* 45 */:
                    C = kc.A((List) unsafe.getObject(obj2, j7));
                    if (C > 0) {
                        E11 = ha.E(i14 << 3);
                        E12 = ha.E(C);
                        E10 = E11 + E12 + C;
                        i12 += E10;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.f1542z5 /* 46 */:
                    C = kc.C((List) unsafe.getObject(obj2, j7));
                    if (C > 0) {
                        E11 = ha.E(i14 << 3);
                        E12 = ha.E(C);
                        E10 = E11 + E12 + C;
                        i12 += E10;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.A5 /* 47 */:
                    C = kc.z((List) unsafe.getObject(obj2, j7));
                    if (C > 0) {
                        E11 = ha.E(i14 << 3);
                        E12 = ha.E(C);
                        E10 = E11 + E12 + C;
                        i12 += E10;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.B5 /* 48 */:
                    C = kc.v((List) unsafe.getObject(obj2, j7));
                    if (C > 0) {
                        E11 = ha.E(i14 << 3);
                        E12 = ha.E(C);
                        E10 = E11 + E12 + C;
                        i12 += E10;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.C5 /* 49 */:
                    List list13 = (List) unsafe.getObject(obj2, j7);
                    ic F2 = acVar.F(i10);
                    int i36 = kc.f21080b;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i9 = 0;
                    } else {
                        i9 = 0;
                        for (int i37 = 0; i37 < size6; i37++) {
                            i9 += ha.g(i14, (xb) list13.get(i37), F2);
                        }
                    }
                    i12 += i9;
                    break;
                case androidx.constraintlayout.widget.h.D5 /* 50 */:
                    rb rbVar = (rb) unsafe.getObject(obj2, j7);
                    qb qbVar = (qb) acVar.G(i10);
                    if (!rbVar.isEmpty()) {
                        t7 = 0;
                        for (Map.Entry entry : rbVar.entrySet()) {
                            t7 += qbVar.d(i14, entry.getKey(), entry.getValue());
                        }
                        i12 += t7;
                        break;
                    }
                    t7 = 0;
                    i12 += t7;
                case androidx.constraintlayout.widget.h.E5 /* 51 */:
                    if (acVar.u(obj2, i14, i10)) {
                        E13 = ha.E(i14 << 3);
                        E7 = E13 + 8;
                        i12 += E7;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.F5 /* 52 */:
                    if (acVar.u(obj2, i14, i10)) {
                        E14 = ha.E(i14 << 3);
                        E7 = E14 + 4;
                        i12 += E7;
                        break;
                    } else {
                        break;
                    }
                case androidx.constraintlayout.widget.h.G5 /* 53 */:
                    if (acVar.u(obj2, i14, i10)) {
                        long o7 = o(obj2, j7);
                        u7 = ha.E(i14 << 3);
                        i8 = ha.a(o7);
                        E7 = u7 + i8;
                        i12 += E7;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (acVar.u(obj2, i14, i10)) {
                        long o8 = o(obj2, j7);
                        u7 = ha.E(i14 << 3);
                        i8 = ha.a(o8);
                        E7 = u7 + i8;
                        i12 += E7;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (acVar.u(obj2, i14, i10)) {
                        long n7 = n(obj2, j7);
                        u7 = ha.E(i14 << 3);
                        i8 = ha.a(n7);
                        E7 = u7 + i8;
                        i12 += E7;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (acVar.u(obj2, i14, i10)) {
                        E13 = ha.E(i14 << 3);
                        E7 = E13 + 8;
                        i12 += E7;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (acVar.u(obj2, i14, i10)) {
                        E14 = ha.E(i14 << 3);
                        E7 = E14 + 4;
                        i12 += E7;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (acVar.u(obj2, i14, i10)) {
                        E7 = ha.E(i14 << 3) + 1;
                        i12 += E7;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!acVar.u(obj2, i14, i10)) {
                        break;
                    } else {
                        int i38 = i14 << 3;
                        Object object2 = unsafe.getObject(obj2, j7);
                        if (object2 instanceof ca) {
                            E15 = ha.E(i38);
                            g9 = ((ca) object2).g();
                            E16 = ha.E(g9);
                            E7 = E15 + E16 + g9;
                            i12 += E7;
                            break;
                        } else {
                            u7 = ha.E(i38);
                            i8 = ha.b((String) object2);
                            E7 = u7 + i8;
                            i12 += E7;
                        }
                    }
                case 60:
                    if (acVar.u(obj2, i14, i10)) {
                        E7 = kc.E(i14, unsafe.getObject(obj2, j7), acVar.F(i10));
                        i12 += E7;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (acVar.u(obj2, i14, i10)) {
                        ca caVar2 = (ca) unsafe.getObject(obj2, j7);
                        E15 = ha.E(i14 << 3);
                        g9 = caVar2.g();
                        E16 = ha.E(g9);
                        E7 = E15 + E16 + g9;
                        i12 += E7;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (acVar.u(obj2, i14, i10)) {
                        int n8 = n(obj2, j7);
                        u7 = ha.E(i14 << 3);
                        i8 = ha.E(n8);
                        E7 = u7 + i8;
                        i12 += E7;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (acVar.u(obj2, i14, i10)) {
                        long n9 = n(obj2, j7);
                        u7 = ha.E(i14 << 3);
                        i8 = ha.a(n9);
                        E7 = u7 + i8;
                        i12 += E7;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (acVar.u(obj2, i14, i10)) {
                        E14 = ha.E(i14 << 3);
                        E7 = E14 + 4;
                        i12 += E7;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (acVar.u(obj2, i14, i10)) {
                        E13 = ha.E(i14 << 3);
                        E7 = E13 + 8;
                        i12 += E7;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (acVar.u(obj2, i14, i10)) {
                        int n10 = n(obj2, j7);
                        u7 = ha.E(i14 << 3);
                        i8 = ha.E((n10 >> 31) ^ (n10 + n10));
                        E7 = u7 + i8;
                        i12 += E7;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (acVar.u(obj2, i14, i10)) {
                        long o9 = o(obj2, j7);
                        u7 = ha.E(i14 << 3);
                        i8 = ha.a((o9 >> 63) ^ (o9 + o9));
                        E7 = u7 + i8;
                        i12 += E7;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (acVar.u(obj2, i14, i10)) {
                        E7 = ha.g(i14, (xb) unsafe.getObject(obj2, j7), acVar.F(i10));
                        i12 += E7;
                        break;
                    } else {
                        break;
                    }
            }
            i10 += 3;
            obj2 = obj;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ic
    public final void h(Object obj, Object obj2) {
        k(obj);
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.f20805a;
            if (i7 >= iArr.length) {
                kc.d(this.f20814j, obj, obj2);
                if (this.f20810f) {
                    kc.c(this.f20815k, obj, obj2);
                    return;
                }
                return;
            }
            int N = N(i7);
            int i8 = 1048575 & N;
            int P = P(N);
            int i9 = iArr[i7];
            long j7 = i8;
            switch (P) {
                case 0:
                    if (!s(obj2, i7)) {
                        break;
                    } else {
                        ad.r(obj, j7, ad.q(obj2, j7));
                        t(obj, i7);
                        break;
                    }
                case 1:
                    if (!s(obj2, i7)) {
                        break;
                    } else {
                        ad.p(obj, j7, ad.o(obj2, j7));
                        t(obj, i7);
                        break;
                    }
                case 2:
                    if (!s(obj2, i7)) {
                        break;
                    } else {
                        ad.l(obj, j7, ad.k(obj2, j7));
                        t(obj, i7);
                        break;
                    }
                case 3:
                    if (!s(obj2, i7)) {
                        break;
                    } else {
                        ad.l(obj, j7, ad.k(obj2, j7));
                        t(obj, i7);
                        break;
                    }
                case 4:
                    if (!s(obj2, i7)) {
                        break;
                    } else {
                        ad.j(obj, j7, ad.i(obj2, j7));
                        t(obj, i7);
                        break;
                    }
                case 5:
                    if (!s(obj2, i7)) {
                        break;
                    } else {
                        ad.l(obj, j7, ad.k(obj2, j7));
                        t(obj, i7);
                        break;
                    }
                case 6:
                    if (!s(obj2, i7)) {
                        break;
                    } else {
                        ad.j(obj, j7, ad.i(obj2, j7));
                        t(obj, i7);
                        break;
                    }
                case 7:
                    if (!s(obj2, i7)) {
                        break;
                    } else {
                        ad.n(obj, j7, ad.m(obj2, j7));
                        t(obj, i7);
                        break;
                    }
                case 8:
                    if (!s(obj2, i7)) {
                        break;
                    } else {
                        ad.t(obj, j7, ad.s(obj2, j7));
                        t(obj, i7);
                        break;
                    }
                case 9:
                    D(obj, obj2, i7);
                    break;
                case 10:
                    if (!s(obj2, i7)) {
                        break;
                    } else {
                        ad.t(obj, j7, ad.s(obj2, j7));
                        t(obj, i7);
                        break;
                    }
                case 11:
                    if (!s(obj2, i7)) {
                        break;
                    } else {
                        ad.j(obj, j7, ad.i(obj2, j7));
                        t(obj, i7);
                        break;
                    }
                case 12:
                    if (!s(obj2, i7)) {
                        break;
                    } else {
                        ad.j(obj, j7, ad.i(obj2, j7));
                        t(obj, i7);
                        break;
                    }
                case 13:
                    if (!s(obj2, i7)) {
                        break;
                    } else {
                        ad.j(obj, j7, ad.i(obj2, j7));
                        t(obj, i7);
                        break;
                    }
                case 14:
                    if (!s(obj2, i7)) {
                        break;
                    } else {
                        ad.l(obj, j7, ad.k(obj2, j7));
                        t(obj, i7);
                        break;
                    }
                case 15:
                    if (!s(obj2, i7)) {
                        break;
                    } else {
                        ad.j(obj, j7, ad.i(obj2, j7));
                        t(obj, i7);
                        break;
                    }
                case 16:
                    if (!s(obj2, i7)) {
                        break;
                    } else {
                        ad.l(obj, j7, ad.k(obj2, j7));
                        t(obj, i7);
                        break;
                    }
                case 17:
                    D(obj, obj2, i7);
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
                    db dbVar = (db) ad.s(obj, j7);
                    db dbVar2 = (db) ad.s(obj2, j7);
                    int size = dbVar.size();
                    int size2 = dbVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!dbVar.a()) {
                            dbVar = dbVar.b0(size2 + size);
                        }
                        dbVar.addAll(dbVar2);
                    }
                    if (size > 0) {
                        dbVar2 = dbVar;
                    }
                    ad.t(obj, j7, dbVar2);
                    break;
                case androidx.constraintlayout.widget.h.D5 /* 50 */:
                    int i10 = kc.f21080b;
                    ad.t(obj, j7, sb.a(ad.s(obj, j7), ad.s(obj2, j7)));
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
                    if (!u(obj2, i9, i7)) {
                        break;
                    } else {
                        ad.t(obj, j7, ad.s(obj2, j7));
                        v(obj, i9, i7);
                        break;
                    }
                case 60:
                    E(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!u(obj2, i9, i7)) {
                        break;
                    } else {
                        ad.t(obj, j7, ad.s(obj2, j7));
                        v(obj, i9, i7);
                        break;
                    }
                case 68:
                    E(obj, obj2, i7);
                    break;
            }
            i7 += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ic
    public final int j(Object obj) {
        int i7;
        long doubleToLongBits;
        int floatToIntBits;
        int i8;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f20805a;
            if (i9 >= iArr.length) {
                int hashCode = (i10 * 53) + ((xa) obj).zzc.hashCode();
                if (!this.f20810f) {
                    return hashCode;
                }
                android.support.v4.media.session.b.a(obj);
                throw null;
            }
            int N = N(i9);
            int i11 = 1048575 & N;
            int P = P(N);
            int i12 = iArr[i9];
            long j7 = i11;
            int i13 = 37;
            switch (P) {
                case 0:
                    i7 = i10 * 53;
                    doubleToLongBits = Double.doubleToLongBits(ad.q(obj, j7));
                    byte[] bArr = eb.f20914b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + floatToIntBits;
                    break;
                case 1:
                    i7 = i10 * 53;
                    floatToIntBits = Float.floatToIntBits(ad.o(obj, j7));
                    i10 = i7 + floatToIntBits;
                    break;
                case 2:
                    i7 = i10 * 53;
                    doubleToLongBits = ad.k(obj, j7);
                    byte[] bArr2 = eb.f20914b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + floatToIntBits;
                    break;
                case 3:
                    i7 = i10 * 53;
                    doubleToLongBits = ad.k(obj, j7);
                    byte[] bArr3 = eb.f20914b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + floatToIntBits;
                    break;
                case 4:
                    i7 = i10 * 53;
                    floatToIntBits = ad.i(obj, j7);
                    i10 = i7 + floatToIntBits;
                    break;
                case 5:
                    i7 = i10 * 53;
                    doubleToLongBits = ad.k(obj, j7);
                    byte[] bArr4 = eb.f20914b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + floatToIntBits;
                    break;
                case 6:
                    i7 = i10 * 53;
                    floatToIntBits = ad.i(obj, j7);
                    i10 = i7 + floatToIntBits;
                    break;
                case 7:
                    i7 = i10 * 53;
                    floatToIntBits = eb.b(ad.m(obj, j7));
                    i10 = i7 + floatToIntBits;
                    break;
                case 8:
                    i7 = i10 * 53;
                    floatToIntBits = ((String) ad.s(obj, j7)).hashCode();
                    i10 = i7 + floatToIntBits;
                    break;
                case 9:
                    i8 = i10 * 53;
                    Object s7 = ad.s(obj, j7);
                    if (s7 != null) {
                        i13 = s7.hashCode();
                    }
                    i10 = i8 + i13;
                    break;
                case 10:
                    i7 = i10 * 53;
                    floatToIntBits = ad.s(obj, j7).hashCode();
                    i10 = i7 + floatToIntBits;
                    break;
                case 11:
                    i7 = i10 * 53;
                    floatToIntBits = ad.i(obj, j7);
                    i10 = i7 + floatToIntBits;
                    break;
                case 12:
                    i7 = i10 * 53;
                    floatToIntBits = ad.i(obj, j7);
                    i10 = i7 + floatToIntBits;
                    break;
                case 13:
                    i7 = i10 * 53;
                    floatToIntBits = ad.i(obj, j7);
                    i10 = i7 + floatToIntBits;
                    break;
                case 14:
                    i7 = i10 * 53;
                    doubleToLongBits = ad.k(obj, j7);
                    byte[] bArr5 = eb.f20914b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + floatToIntBits;
                    break;
                case 15:
                    i7 = i10 * 53;
                    floatToIntBits = ad.i(obj, j7);
                    i10 = i7 + floatToIntBits;
                    break;
                case 16:
                    i7 = i10 * 53;
                    doubleToLongBits = ad.k(obj, j7);
                    byte[] bArr6 = eb.f20914b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + floatToIntBits;
                    break;
                case 17:
                    i8 = i10 * 53;
                    Object s8 = ad.s(obj, j7);
                    if (s8 != null) {
                        i13 = s8.hashCode();
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
                    floatToIntBits = ad.s(obj, j7).hashCode();
                    i10 = i7 + floatToIntBits;
                    break;
                case androidx.constraintlayout.widget.h.D5 /* 50 */:
                    i7 = i10 * 53;
                    floatToIntBits = ad.s(obj, j7).hashCode();
                    i10 = i7 + floatToIntBits;
                    break;
                case androidx.constraintlayout.widget.h.E5 /* 51 */:
                    if (!u(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        doubleToLongBits = Double.doubleToLongBits(l(obj, j7));
                        byte[] bArr7 = eb.f20914b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case androidx.constraintlayout.widget.h.F5 /* 52 */:
                    if (!u(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = Float.floatToIntBits(m(obj, j7));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case androidx.constraintlayout.widget.h.G5 /* 53 */:
                    if (!u(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        doubleToLongBits = o(obj, j7);
                        byte[] bArr8 = eb.f20914b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 54:
                    if (!u(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        doubleToLongBits = o(obj, j7);
                        byte[] bArr9 = eb.f20914b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 55:
                    if (!u(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = n(obj, j7);
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 56:
                    if (!u(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        doubleToLongBits = o(obj, j7);
                        byte[] bArr10 = eb.f20914b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 57:
                    if (!u(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = n(obj, j7);
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 58:
                    if (!u(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = eb.b(p(obj, j7));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 59:
                    if (!u(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = ((String) ad.s(obj, j7)).hashCode();
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!u(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = ad.s(obj, j7).hashCode();
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!u(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = ad.s(obj, j7).hashCode();
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!u(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = n(obj, j7);
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 63:
                    if (!u(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = n(obj, j7);
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!u(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = n(obj, j7);
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 65:
                    if (!u(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        doubleToLongBits = o(obj, j7);
                        byte[] bArr11 = eb.f20914b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 66:
                    if (!u(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = n(obj, j7);
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!u(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        doubleToLongBits = o(obj, j7);
                        byte[] bArr12 = eb.f20914b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + floatToIntBits;
                        break;
                    }
                case 68:
                    if (!u(obj, i12, i9)) {
                        break;
                    } else {
                        i7 = i10 * 53;
                        floatToIntBits = ad.s(obj, j7).hashCode();
                        i10 = i7 + floatToIntBits;
                        break;
                    }
            }
            i9 += 3;
        }
    }
}
