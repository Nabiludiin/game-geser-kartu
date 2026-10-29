package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
public abstract class p5 {
    public static void a(String str, int i7, List list) {
        if (list.size() != i7) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i7), Integer.valueOf(list.size())));
        }
    }

    public static void b(String str, int i7, List list) {
        if (list.size() < i7) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i7), Integer.valueOf(list.size())));
        }
    }

    public static void c(String str, int i7, List list) {
        if (list.size() > i7) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i7), Integer.valueOf(list.size())));
        }
    }

    public static boolean d(r rVar) {
        if (rVar == null) {
            return false;
        }
        Double h8 = rVar.h();
        return !h8.isNaN() && h8.doubleValue() >= 0.0d && h8.equals(Double.valueOf(Math.floor(h8.doubleValue())));
    }

    public static o0 e(String str) {
        o0 o0Var = null;
        if (str != null && !str.isEmpty()) {
            o0Var = o0.c(Integer.parseInt(str));
        }
        if (o0Var != null) {
            return o0Var;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static boolean f(r rVar, r rVar2) {
        if (!rVar.getClass().equals(rVar2.getClass())) {
            return false;
        }
        if ((rVar instanceof w) || (rVar instanceof p)) {
            return true;
        }
        if (!(rVar instanceof j)) {
            return rVar instanceof v ? rVar.d().equals(rVar2.d()) : rVar instanceof g ? rVar.c().equals(rVar2.c()) : rVar == rVar2;
        }
        if (Double.isNaN(rVar.h().doubleValue()) || Double.isNaN(rVar2.h().doubleValue())) {
            return false;
        }
        return rVar.h().equals(rVar2.h());
    }

    public static int g(double d8) {
        if (Double.isNaN(d8) || Double.isInfinite(d8) || d8 == 0.0d) {
            return 0;
        }
        return (int) (((d8 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d8))) % 4.294967296E9d);
    }

    public static long h(double d8) {
        return g(d8) & 4294967295L;
    }

    public static double i(double d8) {
        if (Double.isNaN(d8)) {
            return 0.0d;
        }
        if (Double.isInfinite(d8) || d8 == 0.0d || d8 == 0.0d) {
            return d8;
        }
        return (d8 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d8));
    }

    public static Object j(r rVar) {
        if (r.f21315g.equals(rVar)) {
            return null;
        }
        if (r.f21314f.equals(rVar)) {
            return "";
        }
        if (rVar instanceof o) {
            return k((o) rVar);
        }
        if (!(rVar instanceof f)) {
            return !rVar.h().isNaN() ? rVar.h() : rVar.d();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((f) rVar).iterator();
        while (it.hasNext()) {
            Object j7 = j((r) it.next());
            if (j7 != null) {
                arrayList.add(j7);
            }
        }
        return arrayList;
    }

    public static Map k(o oVar) {
        HashMap hashMap = new HashMap();
        for (String str : oVar.a()) {
            Object j7 = j(oVar.h0(str));
            if (j7 != null) {
                hashMap.put(str, j7);
            }
        }
        return hashMap;
    }

    public static int l(o4 o4Var) {
        int g8 = g(o4Var.h("runtime.counter").h().doubleValue() + 1.0d);
        if (g8 > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        o4Var.e("runtime.counter", new j(Double.valueOf(g8)));
        return g8;
    }
}
