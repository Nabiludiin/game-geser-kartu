package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: MyApplication */
abstract class kc {

    /* renamed from: a, reason: collision with root package name */
    private static final tc f21079a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f21080b = 0;

    static {
        int i7 = fc.f20950d;
        f21079a = new vc();
    }

    static int A(List list) {
        return list.size() * 4;
    }

    static int B(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (ha.E(i7 << 3) + 4);
    }

    static int C(List list) {
        return list.size() * 8;
    }

    static int D(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (ha.E(i7 << 3) + 8);
    }

    static int E(int i7, Object obj, ic icVar) {
        return ha.E(i7 << 3) + ha.d((xb) obj, icVar);
    }

    public static tc a() {
        return f21079a;
    }

    static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void c(ma maVar, Object obj, Object obj2) {
        android.support.v4.media.session.b.a(obj2);
        throw null;
    }

    static void d(tc tcVar, Object obj, Object obj2) {
        xa xaVar = (xa) obj;
        uc ucVar = xaVar.zzc;
        uc ucVar2 = ((xa) obj2).zzc;
        if (!uc.a().equals(ucVar2)) {
            if (uc.a().equals(ucVar)) {
                ucVar = uc.c(ucVar, ucVar2);
            } else {
                ucVar.k(ucVar2);
            }
        }
        xaVar.zzc = ucVar;
    }

    static Object e(Object obj, int i7, int i8, Object obj2, tc tcVar) {
        if (obj2 == null) {
            obj2 = tcVar.a(obj);
        }
        ((uc) obj2).j(i7 << 3, Long.valueOf(i8));
        return obj2;
    }

    public static void f(int i7, List list, gd gdVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gdVar.h(i7, list, z7);
    }

    public static void g(int i7, List list, gd gdVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gdVar.v(i7, list, z7);
    }

    public static void h(int i7, List list, gd gdVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gdVar.a(i7, list, z7);
    }

    public static void i(int i7, List list, gd gdVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gdVar.l(i7, list, z7);
    }

    public static void j(int i7, List list, gd gdVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gdVar.j(i7, list, z7);
    }

    public static void k(int i7, List list, gd gdVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gdVar.g(i7, list, z7);
    }

    public static void l(int i7, List list, gd gdVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gdVar.f(i7, list, z7);
    }

    public static void m(int i7, List list, gd gdVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gdVar.E(i7, list, z7);
    }

    public static void n(int i7, List list, gd gdVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gdVar.r(i7, list, z7);
    }

    public static void o(int i7, List list, gd gdVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gdVar.y(i7, list, z7);
    }

    public static void p(int i7, List list, gd gdVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gdVar.B(i7, list, z7);
    }

    public static void q(int i7, List list, gd gdVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gdVar.n(i7, list, z7);
    }

    public static void r(int i7, List list, gd gdVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gdVar.D(i7, list, z7);
    }

    public static void s(int i7, List list, gd gdVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        gdVar.k(i7, list, z7);
    }

    static int t(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof lb)) {
            int i8 = 0;
            while (i7 < size) {
                i8 += ha.a(((Long) list.get(i7)).longValue());
                i7++;
            }
            return i8;
        }
        lb lbVar = (lb) list;
        int i9 = 0;
        while (i7 < size) {
            i9 += ha.a(lbVar.R(i7));
            i7++;
        }
        return i9;
    }

    static int u(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof lb)) {
            int i8 = 0;
            while (i7 < size) {
                i8 += ha.a(((Long) list.get(i7)).longValue());
                i7++;
            }
            return i8;
        }
        lb lbVar = (lb) list;
        int i9 = 0;
        while (i7 < size) {
            i9 += ha.a(lbVar.R(i7));
            i7++;
        }
        return i9;
    }

    static int v(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof lb)) {
            int i8 = 0;
            while (i7 < size) {
                long longValue = ((Long) list.get(i7)).longValue();
                i8 += ha.a((longValue >> 63) ^ (longValue + longValue));
                i7++;
            }
            return i8;
        }
        lb lbVar = (lb) list;
        int i9 = 0;
        while (i7 < size) {
            long R = lbVar.R(i7);
            i9 += ha.a((R >> 63) ^ (R + R));
            i7++;
        }
        return i9;
    }

    static int w(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ya)) {
            int i8 = 0;
            while (i7 < size) {
                i8 += ha.a(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return i8;
        }
        ya yaVar = (ya) list;
        int i9 = 0;
        while (i7 < size) {
            i9 += ha.a(yaVar.g(i7));
            i7++;
        }
        return i9;
    }

    static int x(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ya)) {
            int i8 = 0;
            while (i7 < size) {
                i8 += ha.a(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return i8;
        }
        ya yaVar = (ya) list;
        int i9 = 0;
        while (i7 < size) {
            i9 += ha.a(yaVar.g(i7));
            i7++;
        }
        return i9;
    }

    static int y(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ya)) {
            int i8 = 0;
            while (i7 < size) {
                i8 += ha.E(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return i8;
        }
        ya yaVar = (ya) list;
        int i9 = 0;
        while (i7 < size) {
            i9 += ha.E(yaVar.g(i7));
            i7++;
        }
        return i9;
    }

    static int z(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ya)) {
            int i8 = 0;
            while (i7 < size) {
                int intValue = ((Integer) list.get(i7)).intValue();
                i8 += ha.E((intValue >> 31) ^ (intValue + intValue));
                i7++;
            }
            return i8;
        }
        ya yaVar = (ya) list;
        int i9 = 0;
        while (i7 < size) {
            int g8 = yaVar.g(i7);
            i9 += ha.E((g8 >> 31) ^ (g8 + g8));
            i7++;
        }
        return i9;
    }
}
