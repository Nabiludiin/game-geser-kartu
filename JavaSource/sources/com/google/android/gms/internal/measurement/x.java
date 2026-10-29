package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: MyApplication */
public final class x extends y {
    public x() {
        this.f21443a.add(o0.BITWISE_AND);
        this.f21443a.add(o0.BITWISE_LEFT_SHIFT);
        this.f21443a.add(o0.BITWISE_NOT);
        this.f21443a.add(o0.BITWISE_OR);
        this.f21443a.add(o0.BITWISE_RIGHT_SHIFT);
        this.f21443a.add(o0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f21443a.add(o0.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final r a(String str, o4 o4Var, List list) {
        o0 o0Var = o0.ADD;
        switch (p5.e(str).ordinal()) {
            case 4:
                p5.a(o0.BITWISE_AND.name(), 2, list);
                return new j(Double.valueOf(p5.g(o4Var.a((r) list.get(0)).h().doubleValue()) & p5.g(o4Var.a((r) list.get(1)).h().doubleValue())));
            case 5:
                p5.a(o0.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new j(Double.valueOf(p5.g(o4Var.a((r) list.get(0)).h().doubleValue()) << ((int) (p5.h(o4Var.a((r) list.get(1)).h().doubleValue()) & 31))));
            case 6:
                p5.a(o0.BITWISE_NOT.name(), 1, list);
                return new j(Double.valueOf(~p5.g(o4Var.a((r) list.get(0)).h().doubleValue())));
            case 7:
                p5.a(o0.BITWISE_OR.name(), 2, list);
                return new j(Double.valueOf(p5.g(o4Var.a((r) list.get(0)).h().doubleValue()) | p5.g(o4Var.a((r) list.get(1)).h().doubleValue())));
            case 8:
                p5.a(o0.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new j(Double.valueOf(p5.g(o4Var.a((r) list.get(0)).h().doubleValue()) >> ((int) (p5.h(o4Var.a((r) list.get(1)).h().doubleValue()) & 31))));
            case 9:
                p5.a(o0.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new j(Double.valueOf(p5.h(o4Var.a((r) list.get(0)).h().doubleValue()) >>> ((int) (p5.h(o4Var.a((r) list.get(1)).h().doubleValue()) & 31))));
            case 10:
                p5.a(o0.BITWISE_XOR.name(), 2, list);
                return new j(Double.valueOf(p5.g(o4Var.a((r) list.get(0)).h().doubleValue()) ^ p5.g(o4Var.a((r) list.get(1)).h().doubleValue())));
            default:
                return super.b(str);
        }
    }
}
