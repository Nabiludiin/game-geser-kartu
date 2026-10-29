package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public abstract class e0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static r a(String str, f fVar, o4 o4Var, List list) {
        double d8;
        Double valueOf = Double.valueOf(-1.0d);
        String str2 = ",";
        double d9 = 0.0d;
        k kVar = null;
        int i7 = 0;
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    p5.a("toString", 0, list);
                    return new v(fVar.t(","));
                }
                throw new IllegalArgumentException("Command not supported");
            case -1354795244:
                if (str.equals("concat")) {
                    f fVar2 = (f) fVar.r();
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            r a8 = o4Var.a((r) it.next());
                            if (a8 instanceof h) {
                                throw new IllegalStateException("Failed evaluation of arguments");
                            }
                            int k7 = fVar2.k();
                            if (a8 instanceof f) {
                                f fVar3 = (f) a8;
                                Iterator j7 = fVar3.j();
                                while (j7.hasNext()) {
                                    Integer num = (Integer) j7.next();
                                    fVar2.n(num.intValue() + k7, fVar3.m(num.intValue()));
                                }
                            } else {
                                fVar2.n(k7, a8);
                            }
                        }
                    }
                    return fVar2;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1274492040:
                if (str.equals("filter")) {
                    p5.a("filter", 1, list);
                    r a9 = o4Var.a((r) list.get(0));
                    if (!(a9 instanceof q)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (fVar.l() == 0) {
                        return new f();
                    }
                    f fVar4 = (f) fVar.r();
                    f c8 = c(fVar, o4Var, (q) a9, null, Boolean.TRUE);
                    f fVar5 = new f();
                    Iterator j8 = c8.j();
                    while (j8.hasNext()) {
                        fVar5.n(fVar5.k(), fVar4.m(((Integer) j8.next()).intValue()));
                    }
                    return fVar5;
                }
                throw new IllegalArgumentException("Command not supported");
            case -934873754:
                if (str.equals("reduce")) {
                    return b(fVar, o4Var, list, true);
                }
                throw new IllegalArgumentException("Command not supported");
            case -895859076:
                if (str.equals("splice")) {
                    if (list.isEmpty()) {
                        return new f();
                    }
                    int i8 = (int) p5.i(o4Var.a((r) list.get(0)).h().doubleValue());
                    if (i8 < 0) {
                        i8 = Math.max(0, i8 + fVar.k());
                    } else if (i8 > fVar.k()) {
                        i8 = fVar.k();
                    }
                    int k8 = fVar.k();
                    f fVar6 = new f();
                    if (list.size() > 1) {
                        int max = Math.max(0, (int) p5.i(o4Var.a((r) list.get(1)).h().doubleValue()));
                        if (max > 0) {
                            for (int i9 = i8; i9 < Math.min(k8, i8 + max); i9++) {
                                fVar6.n(fVar6.k(), fVar.m(i8));
                                fVar.s(i8);
                            }
                        }
                        if (list.size() > 2) {
                            for (int i10 = 2; i10 < list.size(); i10++) {
                                r a10 = o4Var.a((r) list.get(i10));
                                if (a10 instanceof h) {
                                    throw new IllegalArgumentException("Failed to parse elements to add");
                                }
                                fVar.q((i8 + i10) - 2, a10);
                            }
                        }
                    } else {
                        while (i8 < k8) {
                            fVar6.n(fVar6.k(), fVar.m(i8));
                            fVar.n(i8, null);
                            i8++;
                        }
                    }
                    return fVar6;
                }
                throw new IllegalArgumentException("Command not supported");
            case -678635926:
                if (str.equals("forEach")) {
                    p5.a("forEach", 1, list);
                    r a11 = o4Var.a((r) list.get(0));
                    if (!(a11 instanceof q)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (fVar.l() == 0) {
                        return r.f21314f;
                    }
                    c(fVar, o4Var, (q) a11, null, null);
                    return r.f21314f;
                }
                throw new IllegalArgumentException("Command not supported");
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    p5.c("lastIndexOf", 2, list);
                    r rVar = r.f21314f;
                    if (!list.isEmpty()) {
                        rVar = o4Var.a((r) list.get(0));
                    }
                    int k9 = fVar.k() - 1;
                    if (list.size() > 1) {
                        r a12 = o4Var.a((r) list.get(1));
                        d8 = Double.isNaN(a12.h().doubleValue()) ? fVar.k() - 1 : p5.i(a12.h().doubleValue());
                        if (d8 < 0.0d) {
                            d8 += fVar.k();
                        }
                    } else {
                        d8 = k9;
                    }
                    if (d8 < 0.0d) {
                        return new j(valueOf);
                    }
                    for (int min = (int) Math.min(fVar.k(), d8); min >= 0; min--) {
                        if (fVar.o(min) && p5.f(fVar.m(min), rVar)) {
                            return new j(Double.valueOf(min));
                        }
                    }
                    return new j(valueOf);
                }
                throw new IllegalArgumentException("Command not supported");
            case -277637751:
                if (str.equals("unshift")) {
                    if (!list.isEmpty()) {
                        f fVar7 = new f();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            r a13 = o4Var.a((r) it2.next());
                            if (a13 instanceof h) {
                                throw new IllegalStateException("Argument evaluation failed");
                            }
                            fVar7.n(fVar7.k(), a13);
                        }
                        int k10 = fVar7.k();
                        Iterator j9 = fVar.j();
                        while (j9.hasNext()) {
                            Integer num2 = (Integer) j9.next();
                            fVar7.n(num2.intValue() + k10, fVar.m(num2.intValue()));
                        }
                        fVar.p();
                        Iterator j10 = fVar7.j();
                        while (j10.hasNext()) {
                            Integer num3 = (Integer) j10.next();
                            fVar.n(num3.intValue(), fVar7.m(num3.intValue()));
                        }
                    }
                    return new j(Double.valueOf(fVar.k()));
                }
                throw new IllegalArgumentException("Command not supported");
            case 107868:
                if (str.equals("map")) {
                    p5.a("map", 1, list);
                    r a14 = o4Var.a((r) list.get(0));
                    if (a14 instanceof q) {
                        return fVar.k() == 0 ? new f() : c(fVar, o4Var, (q) a14, null, null);
                    }
                    throw new IllegalArgumentException("Callback should be a method");
                }
                throw new IllegalArgumentException("Command not supported");
            case 111185:
                if (str.equals("pop")) {
                    p5.a("pop", 0, list);
                    int k11 = fVar.k();
                    if (k11 == 0) {
                        return r.f21314f;
                    }
                    int i11 = k11 - 1;
                    r m7 = fVar.m(i11);
                    fVar.s(i11);
                    return m7;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3267882:
                if (str.equals("join")) {
                    p5.c("join", 1, list);
                    if (fVar.k() == 0) {
                        return r.f21321m;
                    }
                    if (!list.isEmpty()) {
                        r a15 = o4Var.a((r) list.get(0));
                        str2 = ((a15 instanceof p) || (a15 instanceof w)) ? "" : a15.d();
                    }
                    return new v(fVar.t(str2));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3452698:
                if (str.equals("push")) {
                    if (!list.isEmpty()) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            fVar.n(fVar.k(), o4Var.a((r) it3.next()));
                        }
                    }
                    return new j(Double.valueOf(fVar.k()));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3536116:
                if (str.equals("some")) {
                    p5.a("some", 1, list);
                    r a16 = o4Var.a((r) list.get(0));
                    if (!(a16 instanceof k)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (fVar.k() == 0) {
                        return r.f21320l;
                    }
                    k kVar2 = (k) a16;
                    Iterator j11 = fVar.j();
                    while (j11.hasNext()) {
                        int intValue = ((Integer) j11.next()).intValue();
                        if (fVar.o(intValue) && kVar2.a(o4Var, Arrays.asList(fVar.m(intValue), new j(Double.valueOf(intValue)), fVar)).c().booleanValue()) {
                            return r.f21319k;
                        }
                    }
                    return r.f21320l;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3536286:
                if (str.equals("sort")) {
                    p5.c("sort", 1, list);
                    if (fVar.k() >= 2) {
                        List i12 = fVar.i();
                        if (!list.isEmpty()) {
                            r a17 = o4Var.a((r) list.get(0));
                            if (!(a17 instanceof k)) {
                                throw new IllegalArgumentException("Comparator should be a method");
                            }
                            kVar = (k) a17;
                        }
                        Collections.sort(i12, new c0(kVar, o4Var));
                        fVar.p();
                        Iterator it4 = i12.iterator();
                        while (it4.hasNext()) {
                            fVar.n(i7, (r) it4.next());
                            i7++;
                        }
                    }
                    return fVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case 96891675:
                if (str.equals("every")) {
                    p5.a("every", 1, list);
                    r a18 = o4Var.a((r) list.get(0));
                    if (a18 instanceof q) {
                        return fVar.k() == 0 ? r.f21319k : c(fVar, o4Var, (q) a18, Boolean.FALSE, Boolean.TRUE).k() != fVar.k() ? r.f21320l : r.f21319k;
                    }
                    throw new IllegalArgumentException("Callback should be a method");
                }
                throw new IllegalArgumentException("Command not supported");
            case 109407362:
                if (str.equals("shift")) {
                    p5.a("shift", 0, list);
                    if (fVar.k() == 0) {
                        return r.f21314f;
                    }
                    r m8 = fVar.m(0);
                    fVar.s(0);
                    return m8;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109526418:
                if (str.equals("slice")) {
                    p5.c("slice", 2, list);
                    if (list.isEmpty()) {
                        return fVar.r();
                    }
                    double k12 = fVar.k();
                    double i13 = p5.i(o4Var.a((r) list.get(0)).h().doubleValue());
                    double max2 = i13 < 0.0d ? Math.max(i13 + k12, 0.0d) : Math.min(i13, k12);
                    if (list.size() == 2) {
                        double i14 = p5.i(o4Var.a((r) list.get(1)).h().doubleValue());
                        k12 = i14 < 0.0d ? Math.max(k12 + i14, 0.0d) : Math.min(k12, i14);
                    }
                    f fVar8 = new f();
                    for (int i15 = (int) max2; i15 < k12; i15++) {
                        fVar8.n(fVar8.k(), fVar.m(i15));
                    }
                    return fVar8;
                }
                throw new IllegalArgumentException("Command not supported");
            case 965561430:
                if (str.equals("reduceRight")) {
                    return b(fVar, o4Var, list, false);
                }
                throw new IllegalArgumentException("Command not supported");
            case 1099846370:
                if (str.equals("reverse")) {
                    p5.a("reverse", 0, list);
                    int k13 = fVar.k();
                    if (k13 != 0) {
                        while (i7 < k13 / 2) {
                            if (fVar.o(i7)) {
                                r m9 = fVar.m(i7);
                                fVar.n(i7, null);
                                int i16 = (k13 - 1) - i7;
                                if (fVar.o(i16)) {
                                    fVar.n(i7, fVar.m(i16));
                                }
                                fVar.n(i16, m9);
                            }
                            i7++;
                        }
                    }
                    return fVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case 1943291465:
                if (str.equals("indexOf")) {
                    p5.c("indexOf", 2, list);
                    r rVar2 = r.f21314f;
                    if (!list.isEmpty()) {
                        rVar2 = o4Var.a((r) list.get(0));
                    }
                    if (list.size() > 1) {
                        double i17 = p5.i(o4Var.a((r) list.get(1)).h().doubleValue());
                        if (i17 >= fVar.k()) {
                            return new j(valueOf);
                        }
                        d9 = i17 < 0.0d ? fVar.k() + i17 : i17;
                    }
                    Iterator j12 = fVar.j();
                    while (j12.hasNext()) {
                        int intValue2 = ((Integer) j12.next()).intValue();
                        double d10 = intValue2;
                        if (d10 >= d9 && p5.f(fVar.m(intValue2), rVar2)) {
                            return new j(Double.valueOf(d10));
                        }
                    }
                    return new j(valueOf);
                }
                throw new IllegalArgumentException("Command not supported");
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    private static r b(f fVar, o4 o4Var, List list, boolean z7) {
        r rVar;
        p5.b("reduce", 1, list);
        p5.c("reduce", 2, list);
        r a8 = o4Var.a((r) list.get(0));
        if (!(a8 instanceof k)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            rVar = o4Var.a((r) list.get(1));
            if (rVar instanceof h) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (fVar.k() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            rVar = null;
        }
        k kVar = (k) a8;
        int k7 = fVar.k();
        int i7 = z7 ? 0 : k7 - 1;
        int i8 = z7 ? k7 - 1 : 0;
        int i9 = true == z7 ? 1 : -1;
        if (rVar == null) {
            rVar = fVar.m(i7);
            i7 += i9;
        }
        while ((i8 - i7) * i9 >= 0) {
            if (fVar.o(i7)) {
                rVar = kVar.a(o4Var, Arrays.asList(rVar, fVar.m(i7), new j(Double.valueOf(i7)), fVar));
                if (rVar instanceof h) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i7 += i9;
            } else {
                i7 += i9;
            }
        }
        return rVar;
    }

    private static f c(f fVar, o4 o4Var, k kVar, Boolean bool, Boolean bool2) {
        f fVar2 = new f();
        Iterator j7 = fVar.j();
        while (j7.hasNext()) {
            int intValue = ((Integer) j7.next()).intValue();
            if (fVar.o(intValue)) {
                r a8 = kVar.a(o4Var, Arrays.asList(fVar.m(intValue), new j(Double.valueOf(intValue)), fVar));
                if (a8.c().equals(bool)) {
                    break;
                }
                if (bool2 == null || a8.c().equals(bool2)) {
                    fVar2.n(intValue, a8);
                }
            }
        }
        return fVar2;
    }
}
