package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public final class n0 extends y {
    protected n0() {
        this.f21443a.add(o0.ASSIGN);
        this.f21443a.add(o0.CONST);
        this.f21443a.add(o0.CREATE_ARRAY);
        this.f21443a.add(o0.CREATE_OBJECT);
        this.f21443a.add(o0.EXPRESSION_LIST);
        this.f21443a.add(o0.GET);
        this.f21443a.add(o0.GET_INDEX);
        this.f21443a.add(o0.GET_PROPERTY);
        this.f21443a.add(o0.NULL);
        this.f21443a.add(o0.SET_PROPERTY);
        this.f21443a.add(o0.TYPEOF);
        this.f21443a.add(o0.UNDEFINED);
        this.f21443a.add(o0.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final r a(String str, o4 o4Var, List list) {
        String str2;
        o0 o0Var = o0.ADD;
        int ordinal = p5.e(str).ordinal();
        int i7 = 0;
        if (ordinal == 3) {
            p5.a(o0.ASSIGN.name(), 2, list);
            r a8 = o4Var.a((r) list.get(0));
            if (!(a8 instanceof v)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", a8.getClass().getCanonicalName()));
            }
            if (!o4Var.d(a8.d())) {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", a8.d()));
            }
            r a9 = o4Var.a((r) list.get(1));
            o4Var.e(a8.d(), a9);
            return a9;
        }
        if (ordinal == 14) {
            p5.b(o0.CONST.name(), 2, list);
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            for (int i8 = 0; i8 < list.size() - 1; i8 += 2) {
                r a10 = o4Var.a((r) list.get(i8));
                if (!(a10 instanceof v)) {
                    throw new IllegalArgumentException(String.format("Expected string for const name. got %s", a10.getClass().getCanonicalName()));
                }
                o4Var.g(a10.d(), o4Var.a((r) list.get(i8 + 1)));
            }
            return r.f21314f;
        }
        if (ordinal == 24) {
            p5.b(o0.EXPRESSION_LIST.name(), 1, list);
            r rVar = r.f21314f;
            while (i7 < list.size()) {
                rVar = o4Var.a((r) list.get(i7));
                if (rVar instanceof h) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i7++;
            }
            return rVar;
        }
        if (ordinal == 33) {
            p5.a(o0.GET.name(), 1, list);
            r a11 = o4Var.a((r) list.get(0));
            if (a11 instanceof v) {
                return o4Var.h(a11.d());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", a11.getClass().getCanonicalName()));
        }
        if (ordinal == 49) {
            p5.a(o0.NULL.name(), 0, list);
            return r.f21315g;
        }
        if (ordinal == 58) {
            p5.a(o0.SET_PROPERTY.name(), 3, list);
            r a12 = o4Var.a((r) list.get(0));
            r a13 = o4Var.a((r) list.get(1));
            r a14 = o4Var.a((r) list.get(2));
            if (a12 == r.f21314f || a12 == r.f21315g) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", a13.d(), a12.d()));
            }
            if ((a12 instanceof f) && (a13 instanceof j)) {
                ((f) a12).n(a13.h().intValue(), a14);
                return a14;
            }
            if (!(a12 instanceof n)) {
                return a14;
            }
            ((n) a12).W0(a13.d(), a14);
            return a14;
        }
        if (ordinal == 17) {
            if (list.isEmpty()) {
                return new f();
            }
            f fVar = new f();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r a15 = o4Var.a((r) it.next());
                if (a15 instanceof h) {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
                fVar.n(i7, a15);
                i7++;
            }
            return fVar;
        }
        if (ordinal == 18) {
            if (list.isEmpty()) {
                return new o();
            }
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            o oVar = new o();
            while (i7 < list.size() - 1) {
                r a16 = o4Var.a((r) list.get(i7));
                r a17 = o4Var.a((r) list.get(i7 + 1));
                if ((a16 instanceof h) || (a17 instanceof h)) {
                    throw new IllegalStateException("Failed to evaluate map entry");
                }
                oVar.W0(a16.d(), a17);
                i7 += 2;
            }
            return oVar;
        }
        if (ordinal == 35 || ordinal == 36) {
            p5.a(o0.GET_PROPERTY.name(), 2, list);
            r a18 = o4Var.a((r) list.get(0));
            r a19 = o4Var.a((r) list.get(1));
            if ((a18 instanceof f) && p5.d(a19)) {
                return ((f) a18).m(a19.h().intValue());
            }
            if (a18 instanceof n) {
                return ((n) a18).h0(a19.d());
            }
            if (a18 instanceof v) {
                if ("length".equals(a19.d())) {
                    return new j(Double.valueOf(a18.d().length()));
                }
                if (p5.d(a19) && a19.h().doubleValue() < a18.d().length()) {
                    return new v(String.valueOf(a18.d().charAt(a19.h().intValue())));
                }
            }
            return r.f21314f;
        }
        switch (ordinal) {
            case 62:
                p5.a(o0.TYPEOF.name(), 1, list);
                r a20 = o4Var.a((r) list.get(0));
                if (a20 instanceof w) {
                    str2 = "undefined";
                } else if (a20 instanceof g) {
                    str2 = "boolean";
                } else if (a20 instanceof j) {
                    str2 = "number";
                } else if (a20 instanceof v) {
                    str2 = "string";
                } else if (a20 instanceof q) {
                    str2 = "function";
                } else {
                    if ((a20 instanceof s) || (a20 instanceof h)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", a20));
                    }
                    str2 = "object";
                }
                return new v(str2);
            case 63:
                p5.a(o0.UNDEFINED.name(), 0, list);
                return r.f21314f;
            case 64:
                p5.b(o0.VAR.name(), 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    r a21 = o4Var.a((r) it2.next());
                    if (!(a21 instanceof v)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", a21.getClass().getCanonicalName()));
                    }
                    o4Var.f(a21.d(), r.f21314f);
                }
                return r.f21314f;
            default:
                return super.b(str);
        }
    }
}
