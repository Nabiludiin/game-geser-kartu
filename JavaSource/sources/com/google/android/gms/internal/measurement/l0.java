package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: MyApplication */
public final class l0 extends y {
    protected l0() {
        this.f21443a.add(o0.ADD);
        this.f21443a.add(o0.DIVIDE);
        this.f21443a.add(o0.MODULUS);
        this.f21443a.add(o0.MULTIPLY);
        this.f21443a.add(o0.NEGATE);
        this.f21443a.add(o0.POST_DECREMENT);
        this.f21443a.add(o0.POST_INCREMENT);
        this.f21443a.add(o0.PRE_DECREMENT);
        this.f21443a.add(o0.PRE_INCREMENT);
        this.f21443a.add(o0.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final r a(String str, o4 o4Var, List list) {
        o0 o0Var = o0.ADD;
        int ordinal = p5.e(str).ordinal();
        if (ordinal == 0) {
            p5.a(o0.ADD.name(), 2, list);
            r a8 = o4Var.a((r) list.get(0));
            r a9 = o4Var.a((r) list.get(1));
            if (!(a8 instanceof n) && !(a8 instanceof v) && !(a9 instanceof n) && !(a9 instanceof v)) {
                return new j(Double.valueOf(a8.h().doubleValue() + a9.h().doubleValue()));
            }
            return new v(String.valueOf(a8.d()).concat(String.valueOf(a9.d())));
        }
        if (ordinal == 21) {
            p5.a(o0.DIVIDE.name(), 2, list);
            return new j(Double.valueOf(o4Var.a((r) list.get(0)).h().doubleValue() / o4Var.a((r) list.get(1)).h().doubleValue()));
        }
        if (ordinal == 59) {
            p5.a(o0.SUBTRACT.name(), 2, list);
            return new j(Double.valueOf(o4Var.a((r) list.get(0)).h().doubleValue() + new j(Double.valueOf(-o4Var.a((r) list.get(1)).h().doubleValue())).h().doubleValue()));
        }
        if (ordinal == 52 || ordinal == 53) {
            p5.a(str, 2, list);
            r a10 = o4Var.a((r) list.get(0));
            o4Var.a((r) list.get(1));
            return a10;
        }
        if (ordinal == 55 || ordinal == 56) {
            p5.a(str, 1, list);
            return o4Var.a((r) list.get(0));
        }
        switch (ordinal) {
            case androidx.constraintlayout.widget.h.f1526x5 /* 44 */:
                p5.a(o0.MODULUS.name(), 2, list);
                return new j(Double.valueOf(o4Var.a((r) list.get(0)).h().doubleValue() % o4Var.a((r) list.get(1)).h().doubleValue()));
            case androidx.constraintlayout.widget.h.f1534y5 /* 45 */:
                p5.a(o0.MULTIPLY.name(), 2, list);
                return new j(Double.valueOf(o4Var.a((r) list.get(0)).h().doubleValue() * o4Var.a((r) list.get(1)).h().doubleValue()));
            case androidx.constraintlayout.widget.h.f1542z5 /* 46 */:
                p5.a(o0.NEGATE.name(), 1, list);
                return new j(Double.valueOf(-o4Var.a((r) list.get(0)).h().doubleValue()));
            default:
                return super.b(str);
        }
    }
}
