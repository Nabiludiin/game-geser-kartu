package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public final class k0 extends y {
    protected k0() {
        this.f21443a.add(o0.FOR_IN);
        this.f21443a.add(o0.FOR_IN_CONST);
        this.f21443a.add(o0.FOR_IN_LET);
        this.f21443a.add(o0.FOR_LET);
        this.f21443a.add(o0.FOR_OF);
        this.f21443a.add(o0.FOR_OF_CONST);
        this.f21443a.add(o0.FOR_OF_LET);
        this.f21443a.add(o0.WHILE);
    }

    private static r c(i0 i0Var, r rVar, r rVar2) {
        return e(i0Var, rVar.e(), rVar2);
    }

    private static r d(i0 i0Var, r rVar, r rVar2) {
        if (rVar instanceof Iterable) {
            return e(i0Var, ((Iterable) rVar).iterator(), rVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    private static r e(i0 i0Var, Iterator it, r rVar) {
        if (it != null) {
            while (it.hasNext()) {
                r b8 = i0Var.a((r) it.next()).b((f) rVar);
                if (b8 instanceof h) {
                    h hVar = (h) b8;
                    if ("break".equals(hVar.b())) {
                        return r.f21314f;
                    }
                    if ("return".equals(hVar.b())) {
                        return hVar;
                    }
                }
            }
        }
        return r.f21314f;
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final r a(String str, o4 o4Var, List list) {
        o0 o0Var = o0.ADD;
        int ordinal = p5.e(str).ordinal();
        if (ordinal == 65) {
            p5.a(o0.WHILE.name(), 4, list);
            r rVar = (r) list.get(0);
            r rVar2 = (r) list.get(1);
            r rVar3 = (r) list.get(2);
            r a8 = o4Var.a((r) list.get(3));
            if (o4Var.a(rVar3).c().booleanValue()) {
                r b8 = o4Var.b((f) a8);
                if (b8 instanceof h) {
                    h hVar = (h) b8;
                    if ("break".equals(hVar.b())) {
                        return r.f21314f;
                    }
                    if ("return".equals(hVar.b())) {
                        return hVar;
                    }
                }
            }
            while (o4Var.a(rVar).c().booleanValue()) {
                r b9 = o4Var.b((f) a8);
                if (b9 instanceof h) {
                    h hVar2 = (h) b9;
                    if ("break".equals(hVar2.b())) {
                        return r.f21314f;
                    }
                    if ("return".equals(hVar2.b())) {
                        return hVar2;
                    }
                }
                o4Var.a(rVar2);
            }
            return r.f21314f;
        }
        switch (ordinal) {
            case 26:
                p5.a(o0.FOR_IN.name(), 3, list);
                if (!(list.get(0) instanceof v)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return c(new j0(o4Var, ((r) list.get(0)).d()), o4Var.a((r) list.get(1)), o4Var.a((r) list.get(2)));
            case 27:
                p5.a(o0.FOR_IN_CONST.name(), 3, list);
                if (!(list.get(0) instanceof v)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return c(new g0(o4Var, ((r) list.get(0)).d()), o4Var.a((r) list.get(1)), o4Var.a((r) list.get(2)));
            case 28:
                p5.a(o0.FOR_IN_LET.name(), 3, list);
                if (!(list.get(0) instanceof v)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return c(new h0(o4Var, ((r) list.get(0)).d()), o4Var.a((r) list.get(1)), o4Var.a((r) list.get(2)));
            case 29:
                p5.a(o0.FOR_LET.name(), 4, list);
                r a9 = o4Var.a((r) list.get(0));
                if (!(a9 instanceof f)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                f fVar = (f) a9;
                r rVar4 = (r) list.get(1);
                r rVar5 = (r) list.get(2);
                r a10 = o4Var.a((r) list.get(3));
                o4 c8 = o4Var.c();
                for (int i7 = 0; i7 < fVar.k(); i7++) {
                    String d8 = fVar.m(i7).d();
                    c8.e(d8, o4Var.h(d8));
                }
                while (o4Var.a(rVar4).c().booleanValue()) {
                    r b10 = o4Var.b((f) a10);
                    if (b10 instanceof h) {
                        h hVar3 = (h) b10;
                        if ("break".equals(hVar3.b())) {
                            return r.f21314f;
                        }
                        if ("return".equals(hVar3.b())) {
                            return hVar3;
                        }
                    }
                    o4 c9 = o4Var.c();
                    for (int i8 = 0; i8 < fVar.k(); i8++) {
                        String d9 = fVar.m(i8).d();
                        c9.e(d9, c8.h(d9));
                    }
                    c9.a(rVar5);
                    c8 = c9;
                }
                return r.f21314f;
            case 30:
                p5.a(o0.FOR_OF.name(), 3, list);
                if (!(list.get(0) instanceof v)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return d(new j0(o4Var, ((r) list.get(0)).d()), o4Var.a((r) list.get(1)), o4Var.a((r) list.get(2)));
            case 31:
                p5.a(o0.FOR_OF_CONST.name(), 3, list);
                if (!(list.get(0) instanceof v)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return d(new g0(o4Var, ((r) list.get(0)).d()), o4Var.a((r) list.get(1)), o4Var.a((r) list.get(2)));
            case 32:
                p5.a(o0.FOR_OF_LET.name(), 3, list);
                if (!(list.get(0) instanceof v)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return d(new h0(o4Var, ((r) list.get(0)).d()), o4Var.a((r) list.get(1)), o4Var.a((r) list.get(2)));
            default:
                return super.b(str);
        }
    }
}
