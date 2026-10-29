package com.google.android.gms.internal.drive;

import java.util.List;

abstract class w1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f20768a = A();

    /* renamed from: b, reason: collision with root package name */
    private static final l2 f20769b = D(false);

    /* renamed from: c, reason: collision with root package name */
    private static final l2 f20770c = D(true);

    /* renamed from: d, reason: collision with root package name */
    private static final l2 f20771d = new n2();

    private static Class A() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class B() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static int C(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += w.q(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    private static l2 D(boolean z7) {
        try {
            Class B = B();
            if (B == null) {
                return null;
            }
            return (l2) B.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z7));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void E(int i7, List list, f3 f3Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f3Var.G(i7, list, z7);
    }

    static int F(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += w.r(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static void G(int i7, List list, f3 f3Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f3Var.n(i7, list, z7);
    }

    public static void H(Class cls) {
        Class cls2;
        if (!l0.class.isAssignableFrom(cls) && (cls2 = f20768a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static int I(List list) {
        return list.size() << 2;
    }

    public static void J(int i7, List list, f3 f3Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f3Var.s(i7, list, z7);
    }

    static int K(List list) {
        return list.size() << 3;
    }

    public static void L(int i7, List list, f3 f3Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f3Var.o(i7, list, z7);
    }

    static int M(List list) {
        return list.size();
    }

    public static void N(int i7, List list, f3 f3Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f3Var.L(i7, list, z7);
    }

    public static void O(int i7, List list, f3 f3Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f3Var.y(i7, list, z7);
    }

    public static void P(int i7, List list, f3 f3Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f3Var.B(i7, list, z7);
    }

    public static void Q(int i7, List list, f3 f3Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f3Var.u(i7, list, z7);
    }

    public static void R(int i7, List list, f3 f3Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f3Var.r(i7, list, z7);
    }

    static int S(int i7, List list, boolean z7) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * w.o(i7));
    }

    static int T(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return h(list) + (size * w.o(i7));
    }

    static int U(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return o(list) + (size * w.o(i7));
    }

    static int V(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return s(list) + (size * w.o(i7));
    }

    static int W(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return v(list) + (size * w.o(i7));
    }

    static int X(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C(list) + (size * w.o(i7));
    }

    static int Y(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return F(list) + (size * w.o(i7));
    }

    static int Z(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * w.k0(i7, 0);
    }

    static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += w.s0(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    static int a0(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * w.g0(i7, 0L);
    }

    public static void b(int i7, List list, f3 f3Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f3Var.U(i7, list);
    }

    static int b0(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * w.M(i7, true);
    }

    public static void c(int i7, List list, f3 f3Var, u1 u1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f3Var.M(i7, list, u1Var);
    }

    public static void d(int i7, List list, f3 f3Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f3Var.q(i7, list, z7);
    }

    static void e(b0 b0Var, Object obj, Object obj2) {
        e0 c8 = b0Var.c(obj2);
        if (c8.f20558a.isEmpty()) {
            return;
        }
        b0Var.d(obj).e(c8);
    }

    static void f(d1 d1Var, Object obj, Object obj2, long j7) {
        r2.g(obj, j7, d1Var.f(r2.G(obj, j7), r2.G(obj2, j7)));
    }

    static void g(l2 l2Var, Object obj, Object obj2) {
        l2Var.d(obj, l2Var.e(l2Var.g(obj), l2Var.g(obj2)));
    }

    static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += w.t0(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    public static void i(int i7, List list, f3 f3Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f3Var.O(i7, list);
    }

    public static void j(int i7, List list, f3 f3Var, u1 u1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f3Var.Q(i7, list, u1Var);
    }

    public static void k(int i7, List list, f3 f3Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f3Var.S(i7, list, z7);
    }

    static int l(int i7, Object obj, u1 u1Var) {
        return w.B(i7, (i1) obj, u1Var);
    }

    static int m(int i7, List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int o7 = w.o(i7) * size;
        if (!(list instanceof t0)) {
            while (i8 < size) {
                Object obj = list.get(i8);
                o7 += obj instanceof i ? w.D((i) obj) : w.p0((String) obj);
                i8++;
            }
            return o7;
        }
        t0 t0Var = (t0) list;
        while (i8 < size) {
            Object z02 = t0Var.z0(i8);
            o7 += z02 instanceof i ? w.D((i) z02) : w.p0((String) z02);
            i8++;
        }
        return o7;
    }

    static int n(int i7, List list, u1 u1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int o7 = w.o(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            o7 += w.b((i1) list.get(i8), u1Var);
        }
        return o7;
    }

    static int o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += w.u0(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    public static void p(int i7, List list, f3 f3Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f3Var.m(i7, list, z7);
    }

    static int q(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int o7 = size * w.o(i7);
        for (int i8 = 0; i8 < list.size(); i8++) {
            o7 += w.D((i) list.get(i8));
        }
        return o7;
    }

    static int r(int i7, List list, u1 u1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += w.L(i7, (i1) list.get(i9), u1Var);
        }
        return i8;
    }

    static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += w.u(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static void t(int i7, List list, f3 f3Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f3Var.J(i7, list, z7);
    }

    static boolean u(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int v(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += w.p(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static void w(int i7, List list, f3 f3Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f3Var.p(i7, list, z7);
    }

    public static l2 x() {
        return f20769b;
    }

    public static l2 y() {
        return f20770c;
    }

    public static l2 z() {
        return f20771d;
    }
}
