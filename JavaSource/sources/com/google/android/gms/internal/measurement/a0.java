package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: MyApplication */
public final class a0 extends y {
    public a0() {
        this.f21443a.add(o0.EQUALS);
        this.f21443a.add(o0.GREATER_THAN);
        this.f21443a.add(o0.GREATER_THAN_EQUALS);
        this.f21443a.add(o0.IDENTITY_EQUALS);
        this.f21443a.add(o0.IDENTITY_NOT_EQUALS);
        this.f21443a.add(o0.LESS_THAN);
        this.f21443a.add(o0.LESS_THAN_EQUALS);
        this.f21443a.add(o0.NOT_EQUALS);
    }

    private static boolean c(r rVar, r rVar2) {
        if (rVar instanceof n) {
            rVar = new v(rVar.d());
        }
        if (rVar2 instanceof n) {
            rVar2 = new v(rVar2.d());
        }
        if ((rVar instanceof v) && (rVar2 instanceof v)) {
            return rVar.d().compareTo(rVar2.d()) < 0;
        }
        double doubleValue = rVar.h().doubleValue();
        double doubleValue2 = rVar2.h().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == 0.0d) || ((doubleValue == 0.0d && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    private static boolean d(r rVar, r rVar2) {
        if (rVar.getClass().equals(rVar2.getClass())) {
            if ((rVar instanceof w) || (rVar instanceof p)) {
                return true;
            }
            return rVar instanceof j ? (Double.isNaN(rVar.h().doubleValue()) || Double.isNaN(rVar2.h().doubleValue()) || rVar.h().doubleValue() != rVar2.h().doubleValue()) ? false : true : rVar instanceof v ? rVar.d().equals(rVar2.d()) : rVar instanceof g ? rVar.c().equals(rVar2.c()) : rVar == rVar2;
        }
        if (((rVar instanceof w) || (rVar instanceof p)) && ((rVar2 instanceof w) || (rVar2 instanceof p))) {
            return true;
        }
        boolean z7 = rVar instanceof j;
        if (z7 && (rVar2 instanceof v)) {
            return d(rVar, new j(rVar2.h()));
        }
        boolean z8 = rVar instanceof v;
        if (z8 && (rVar2 instanceof j)) {
            return d(new j(rVar.h()), rVar2);
        }
        if (rVar instanceof g) {
            return d(new j(rVar.h()), rVar2);
        }
        if (rVar2 instanceof g) {
            return d(rVar, new j(rVar2.h()));
        }
        if ((z8 || z7) && (rVar2 instanceof n)) {
            return d(rVar, new v(rVar2.d()));
        }
        if ((rVar instanceof n) && ((rVar2 instanceof v) || (rVar2 instanceof j))) {
            return d(new v(rVar.d()), rVar2);
        }
        return false;
    }

    private static boolean e(r rVar, r rVar2) {
        if (rVar instanceof n) {
            rVar = new v(rVar.d());
        }
        if (rVar2 instanceof n) {
            rVar2 = new v(rVar2.d());
        }
        return (((rVar instanceof v) && (rVar2 instanceof v)) || !(Double.isNaN(rVar.h().doubleValue()) || Double.isNaN(rVar2.h().doubleValue()))) && !c(rVar2, rVar);
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final r a(String str, o4 o4Var, List list) {
        boolean d8;
        boolean d9;
        p5.a(p5.e(str).name(), 2, list);
        r a8 = o4Var.a((r) list.get(0));
        r a9 = o4Var.a((r) list.get(1));
        int ordinal = p5.e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                d9 = d(a8, a9);
            } else if (ordinal == 42) {
                d8 = c(a8, a9);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        d8 = c(a9, a8);
                        break;
                    case androidx.constraintlayout.widget.h.f1478r5 /* 38 */:
                        d8 = e(a9, a8);
                        break;
                    case androidx.constraintlayout.widget.h.f1486s5 /* 39 */:
                        d8 = p5.f(a8, a9);
                        break;
                    case androidx.constraintlayout.widget.h.f1494t5 /* 40 */:
                        d9 = p5.f(a8, a9);
                        break;
                    default:
                        return super.b(str);
                }
            } else {
                d8 = e(a8, a9);
            }
            d8 = !d9;
        } else {
            d8 = d(a8, a9);
        }
        return d8 ? r.f21319k : r.f21320l;
    }
}
