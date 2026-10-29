package com.google.android.gms.internal.play_billing;

import java.util.List;

/* compiled from: MyApplication */
abstract class l5 {

    /* renamed from: a, reason: collision with root package name */
    private static final p5 f21606a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f21607b = 0;

    static {
        int i7 = g5.f21536d;
        f21606a = new r5();
    }

    public static void A(int i7, List list, a6 a6Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a6Var.D(i7, list, z7);
    }

    public static void B(int i7, List list, a6 a6Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a6Var.v(i7, list, z7);
    }

    public static void C(int i7, List list, a6 a6Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a6Var.B(i7, list, z7);
    }

    public static void D(int i7, List list, a6 a6Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a6Var.a(i7, list, z7);
    }

    public static void E(int i7, List list, a6 a6Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a6Var.g(i7, list, z7);
    }

    public static void a(int i7, List list, a6 a6Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a6Var.h(i7, list, z7);
    }

    public static void b(int i7, List list, a6 a6Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a6Var.k(i7, list, z7);
    }

    public static void c(int i7, List list, a6 a6Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a6Var.f(i7, list, z7);
    }

    public static void d(int i7, List list, a6 a6Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a6Var.j(i7, list, z7);
    }

    static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int f(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof e4)) {
            int i8 = 0;
            while (i7 < size) {
                i8 += p3.d(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return i8;
        }
        e4 e4Var = (e4) list;
        int i9 = 0;
        while (i7 < size) {
            i9 += p3.d(e4Var.e(i7));
            i7++;
        }
        return i9;
    }

    static int g(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (p3.c(i7 << 3) + 4);
    }

    static int h(List list) {
        return list.size() * 4;
    }

    static int i(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (p3.c(i7 << 3) + 8);
    }

    static int j(List list) {
        return list.size() * 8;
    }

    static int k(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof e4)) {
            int i8 = 0;
            while (i7 < size) {
                i8 += p3.d(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return i8;
        }
        e4 e4Var = (e4) list;
        int i9 = 0;
        while (i7 < size) {
            i9 += p3.d(e4Var.e(i7));
            i7++;
        }
        return i9;
    }

    static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += p3.d(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    static int m(int i7, Object obj, j5 j5Var) {
        return p3.c(i7 << 3) + p3.a((z4) obj, j5Var);
    }

    static int n(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof e4)) {
            int i8 = 0;
            while (i7 < size) {
                int intValue = ((Integer) list.get(i7)).intValue();
                i8 += p3.c((intValue >> 31) ^ (intValue + intValue));
                i7++;
            }
            return i8;
        }
        e4 e4Var = (e4) list;
        int i9 = 0;
        while (i7 < size) {
            int e8 = e4Var.e(i7);
            i9 += p3.c((e8 >> 31) ^ (e8 + e8));
            i7++;
        }
        return i9;
    }

    static int o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            long longValue = ((Long) list.get(i8)).longValue();
            i7 += p3.d((longValue >> 63) ^ (longValue + longValue));
        }
        return i7;
    }

    static int p(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof e4)) {
            int i8 = 0;
            while (i7 < size) {
                i8 += p3.c(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return i8;
        }
        e4 e4Var = (e4) list;
        int i9 = 0;
        while (i7 < size) {
            i9 += p3.c(e4Var.e(i7));
            i7++;
        }
        return i9;
    }

    static int q(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += p3.d(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    public static p5 r() {
        return f21606a;
    }

    static Object s(Object obj, int i7, int i8, Object obj2, p5 p5Var) {
        if (obj2 == null) {
            obj2 = p5Var.a(obj);
        }
        ((q5) obj2).j(i7 << 3, Long.valueOf(i8));
        return obj2;
    }

    static void t(u3 u3Var, Object obj, Object obj2) {
        android.support.v4.media.session.b.a(obj2);
        throw null;
    }

    static void u(p5 p5Var, Object obj, Object obj2) {
        d4 d4Var = (d4) obj;
        q5 q5Var = d4Var.zzc;
        q5 q5Var2 = ((d4) obj2).zzc;
        if (!q5.c().equals(q5Var2)) {
            if (q5.c().equals(q5Var)) {
                q5Var = q5.e(q5Var, q5Var2);
            } else {
                q5Var.d(q5Var2);
            }
        }
        d4Var.zzc = q5Var;
    }

    public static void v(int i7, List list, a6 a6Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a6Var.m(i7, list, z7);
    }

    public static void w(int i7, List list, a6 a6Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a6Var.q(i7, list, z7);
    }

    public static void x(int i7, List list, a6 a6Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a6Var.o(i7, list, z7);
    }

    public static void y(int i7, List list, a6 a6Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a6Var.n(i7, list, z7);
    }

    public static void z(int i7, List list, a6 a6Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a6Var.p(i7, list, z7);
    }
}
