package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: MyApplication */
public final class f0 extends y {
    protected f0() {
        this.f21443a.add(o0.AND);
        this.f21443a.add(o0.NOT);
        this.f21443a.add(o0.OR);
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final r a(String str, o4 o4Var, List list) {
        o0 o0Var = o0.ADD;
        int ordinal = p5.e(str).ordinal();
        if (ordinal == 1) {
            p5.a(o0.AND.name(), 2, list);
            r a8 = o4Var.a((r) list.get(0));
            return a8.c().booleanValue() ? o4Var.a((r) list.get(1)) : a8;
        }
        if (ordinal == 47) {
            p5.a(o0.NOT.name(), 1, list);
            return new g(Boolean.valueOf(!o4Var.a((r) list.get(0)).c().booleanValue()));
        }
        if (ordinal != 50) {
            return super.b(str);
        }
        p5.a(o0.OR.name(), 2, list);
        r a9 = o4Var.a((r) list.get(0));
        return !a9.c().booleanValue() ? o4Var.a((r) list.get(1)) : a9;
    }
}
