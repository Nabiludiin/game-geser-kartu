package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public final class b0 extends y {
    protected b0() {
        this.f21443a.add(o0.APPLY);
        this.f21443a.add(o0.BLOCK);
        this.f21443a.add(o0.BREAK);
        this.f21443a.add(o0.CASE);
        this.f21443a.add(o0.DEFAULT);
        this.f21443a.add(o0.CONTINUE);
        this.f21443a.add(o0.DEFINE_FUNCTION);
        this.f21443a.add(o0.FN);
        this.f21443a.add(o0.IF);
        this.f21443a.add(o0.QUOTE);
        this.f21443a.add(o0.RETURN);
        this.f21443a.add(o0.SWITCH);
        this.f21443a.add(o0.TERNARY);
    }

    private static r c(o4 o4Var, List list) {
        p5.b(o0.FN.name(), 2, list);
        r a8 = o4Var.a((r) list.get(0));
        r a9 = o4Var.a((r) list.get(1));
        if (!(a9 instanceof f)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", a9.getClass().getCanonicalName()));
        }
        List i7 = ((f) a9).i();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new q(a8.d(), i7, arrayList, o4Var);
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final r a(String str, o4 o4Var, List list) {
        o0 o0Var = o0.ADD;
        int ordinal = p5.e(str).ordinal();
        if (ordinal == 2) {
            p5.a(o0.APPLY.name(), 3, list);
            r a8 = o4Var.a((r) list.get(0));
            String d8 = o4Var.a((r) list.get(1)).d();
            r a9 = o4Var.a((r) list.get(2));
            if (!(a9 instanceof f)) {
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", a9.getClass().getCanonicalName()));
            }
            if (d8.isEmpty()) {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
            return a8.g(d8, o4Var, ((f) a9).i());
        }
        if (ordinal == 15) {
            p5.a(o0.BREAK.name(), 0, list);
            return r.f21316h;
        }
        if (ordinal == 25) {
            return c(o4Var, list);
        }
        if (ordinal == 41) {
            p5.b(o0.IF.name(), 2, list);
            r a10 = o4Var.a((r) list.get(0));
            r a11 = o4Var.a((r) list.get(1));
            r a12 = list.size() > 2 ? o4Var.a((r) list.get(2)) : null;
            r rVar = r.f21314f;
            r b8 = a10.c().booleanValue() ? o4Var.b((f) a11) : a12 != null ? o4Var.b((f) a12) : rVar;
            return true != (b8 instanceof h) ? rVar : b8;
        }
        if (ordinal == 54) {
            return new f(list);
        }
        if (ordinal == 57) {
            if (list.isEmpty()) {
                return r.f21318j;
            }
            p5.a(o0.RETURN.name(), 1, list);
            return new h("return", o4Var.a((r) list.get(0)));
        }
        if (ordinal != 19) {
            if (ordinal == 20) {
                p5.b(o0.DEFINE_FUNCTION.name(), 2, list);
                q qVar = (q) c(o4Var, list);
                if (qVar.b() == null) {
                    o4Var.e("", qVar);
                    return qVar;
                }
                o4Var.e(qVar.b(), qVar);
                return qVar;
            }
            if (ordinal == 60) {
                p5.a(o0.SWITCH.name(), 3, list);
                r a13 = o4Var.a((r) list.get(0));
                r a14 = o4Var.a((r) list.get(1));
                r a15 = o4Var.a((r) list.get(2));
                if (!(a14 instanceof f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(a15 instanceof f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                f fVar = (f) a14;
                f fVar2 = (f) a15;
                boolean z7 = false;
                for (int i7 = 0; i7 < fVar.k(); i7++) {
                    if (z7 || a13.equals(o4Var.a(fVar.m(i7)))) {
                        r a16 = o4Var.a(fVar2.m(i7));
                        if (a16 instanceof h) {
                            return ((h) a16).b().equals("break") ? r.f21314f : a16;
                        }
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                }
                if (fVar.k() + 1 == fVar2.k()) {
                    r a17 = o4Var.a(fVar2.m(fVar.k()));
                    if (a17 instanceof h) {
                        String b9 = ((h) a17).b();
                        if (b9.equals("return") || b9.equals("continue")) {
                            return a17;
                        }
                    }
                }
                return r.f21314f;
            }
            if (ordinal == 61) {
                p5.a(o0.TERNARY.name(), 3, list);
                return o4Var.a((r) list.get(0)).c().booleanValue() ? o4Var.a((r) list.get(1)) : o4Var.a((r) list.get(2));
            }
            switch (ordinal) {
                case 11:
                    return o4Var.c().b(new f(list));
                case 12:
                    p5.a(o0.BREAK.name(), 0, list);
                    return r.f21317i;
                case 13:
                    break;
                default:
                    return super.b(str);
            }
        }
        if (list.isEmpty()) {
            return r.f21314f;
        }
        r a18 = o4Var.a((r) list.get(0));
        return a18 instanceof f ? o4Var.b((f) a18) : r.f21314f;
    }
}
