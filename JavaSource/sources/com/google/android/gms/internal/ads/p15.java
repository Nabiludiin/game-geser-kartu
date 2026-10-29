package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: MyApplication */
abstract class p15 {

    /* renamed from: a, reason: collision with root package name */
    private static final y15 f13633a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f13634b = 0;

    static {
        int i7 = dy4.f7358a;
        f13633a = new a25();
    }

    public static void A(int i7, List list, n25 n25Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n25Var.t(i7, list);
    }

    public static void B(int i7, List list, n25 n25Var, n15 n15Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((bz4) n25Var).G(i7, list.get(i8), n15Var);
        }
    }

    public static void C(int i7, List list, n25 n25Var, n15 n15Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((bz4) n25Var).J(i7, list.get(i8), n15Var);
        }
    }

    static int D(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j05)) {
            int i8 = 0;
            while (i7 < size) {
                i8 += az4.c(((Long) list.get(i7)).longValue());
                i7++;
            }
            return i8;
        }
        j05 j05Var = (j05) list;
        int i9 = 0;
        while (i7 < size) {
            i9 += az4.c(j05Var.R(i7));
            i7++;
        }
        return i9;
    }

    static int E(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j05)) {
            int i8 = 0;
            while (i7 < size) {
                i8 += az4.c(((Long) list.get(i7)).longValue());
                i7++;
            }
            return i8;
        }
        j05 j05Var = (j05) list;
        int i9 = 0;
        while (i7 < size) {
            i9 += az4.c(j05Var.R(i7));
            i7++;
        }
        return i9;
    }

    static int F(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j05)) {
            int i8 = 0;
            while (i7 < size) {
                long longValue = ((Long) list.get(i7)).longValue();
                i8 += az4.c((longValue >> 63) ^ (longValue + longValue));
                i7++;
            }
            return i8;
        }
        j05 j05Var = (j05) list;
        int i9 = 0;
        while (i7 < size) {
            long R = j05Var.R(i7);
            i9 += az4.c((R >> 63) ^ (R + R));
            i7++;
        }
        return i9;
    }

    static int G(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof tz4)) {
            int i8 = 0;
            while (i7 < size) {
                i8 += az4.c(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return i8;
        }
        tz4 tz4Var = (tz4) list;
        int i9 = 0;
        while (i7 < size) {
            i9 += az4.c(tz4Var.g(i7));
            i7++;
        }
        return i9;
    }

    static int H(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof tz4)) {
            int i8 = 0;
            while (i7 < size) {
                i8 += az4.c(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return i8;
        }
        tz4 tz4Var = (tz4) list;
        int i9 = 0;
        while (i7 < size) {
            i9 += az4.c(tz4Var.g(i7));
            i7++;
        }
        return i9;
    }

    static int I(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof tz4)) {
            int i8 = 0;
            while (i7 < size) {
                i8 += az4.b(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return i8;
        }
        tz4 tz4Var = (tz4) list;
        int i9 = 0;
        while (i7 < size) {
            i9 += az4.b(tz4Var.g(i7));
            i7++;
        }
        return i9;
    }

    static int J(List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof tz4)) {
            int i8 = 0;
            while (i7 < size) {
                int intValue = ((Integer) list.get(i7)).intValue();
                i8 += az4.b((intValue >> 31) ^ (intValue + intValue));
                i7++;
            }
            return i8;
        }
        tz4 tz4Var = (tz4) list;
        int i9 = 0;
        while (i7 < size) {
            int g8 = tz4Var.g(i7);
            i9 += az4.b((g8 >> 31) ^ (g8 + g8));
            i7++;
        }
        return i9;
    }

    static int K(List list) {
        return list.size() * 4;
    }

    static int a(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (az4.b(i7 << 3) + 4);
    }

    static int b(List list) {
        return list.size() * 8;
    }

    static int c(int i7, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (az4.b(i7 << 3) + 8);
    }

    static int d(int i7, Object obj, n15 n15Var) {
        int b8 = az4.b(i7 << 3);
        int h8 = ((ay4) obj).h(n15Var);
        return b8 + az4.b(h8) + h8;
    }

    static int e(int i7, v05 v05Var, n15 n15Var) {
        int b8 = az4.b(i7 << 3);
        return b8 + b8 + ((ay4) v05Var).h(n15Var);
    }

    public static y15 f() {
        return f13633a;
    }

    static boolean g(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void h(fz4 fz4Var, Object obj, Object obj2) {
        android.support.v4.media.session.b.a(obj2);
        throw null;
    }

    static void i(y15 y15Var, Object obj, Object obj2) {
        sz4 sz4Var = (sz4) obj;
        z15 z15Var = sz4Var.zzt;
        z15 z15Var2 = ((sz4) obj2).zzt;
        if (!z15.a().equals(z15Var2)) {
            if (z15.a().equals(z15Var)) {
                z15Var = z15.c(z15Var, z15Var2);
            } else {
                z15Var.k(z15Var2);
            }
        }
        sz4Var.zzt = z15Var;
    }

    static Object j(Object obj, int i7, List list, wz4 wz4Var, Object obj2, y15 y15Var) {
        if (wz4Var == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!wz4Var.L(intValue)) {
                    obj2 = k(obj, i7, intValue, obj2, y15Var);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            Integer num = (Integer) list.get(i9);
            int intValue2 = num.intValue();
            if (wz4Var.L(intValue2)) {
                if (i9 != i8) {
                    list.set(i8, num);
                }
                i8++;
            } else {
                obj2 = k(obj, i7, intValue2, obj2, y15Var);
            }
        }
        if (i8 != size) {
            list.subList(i8, size).clear();
        }
        return obj2;
    }

    static Object k(Object obj, int i7, int i8, Object obj2, y15 y15Var) {
        if (obj2 == null) {
            obj2 = y15Var.h(obj);
        }
        y15Var.a(obj2, i7, i8);
        return obj2;
    }

    public static void l(int i7, List list, n25 n25Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n25Var.h(i7, list, z7);
    }

    public static void m(int i7, List list, n25 n25Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n25Var.v(i7, list, z7);
    }

    public static void n(int i7, List list, n25 n25Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n25Var.a(i7, list, z7);
    }

    public static void o(int i7, List list, n25 n25Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n25Var.l(i7, list, z7);
    }

    public static void p(int i7, List list, n25 n25Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n25Var.j(i7, list, z7);
    }

    public static void q(int i7, List list, n25 n25Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n25Var.g(i7, list, z7);
    }

    public static void r(int i7, List list, n25 n25Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n25Var.f(i7, list, z7);
    }

    public static void s(int i7, List list, n25 n25Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n25Var.E(i7, list, z7);
    }

    public static void t(int i7, List list, n25 n25Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n25Var.r(i7, list, z7);
    }

    public static void u(int i7, List list, n25 n25Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n25Var.y(i7, list, z7);
    }

    public static void v(int i7, List list, n25 n25Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n25Var.B(i7, list, z7);
    }

    public static void w(int i7, List list, n25 n25Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n25Var.n(i7, list, z7);
    }

    public static void x(int i7, List list, n25 n25Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n25Var.D(i7, list, z7);
    }

    public static void y(int i7, List list, n25 n25Var, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n25Var.k(i7, list, z7);
    }

    public static void z(int i7, List list, n25 n25Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        n25Var.x(i7, list);
    }
}
