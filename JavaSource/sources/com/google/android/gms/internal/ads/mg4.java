package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: MyApplication */
abstract class mg4 extends ww4 {
    public static final pw4 c(vx4 vx4Var) {
        String str;
        int q7 = vx4Var.q();
        pw4 e8 = e(vx4Var, q7);
        if (e8 == null) {
            return d(vx4Var, q7);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (vx4Var.j()) {
                if (e8 instanceof rw4) {
                    str = vx4Var.l();
                    if (!og4.a(str)) {
                        throw new IOException("illegal characters in string");
                    }
                } else {
                    str = null;
                }
                int q8 = vx4Var.q();
                pw4 e9 = e(vx4Var, q8);
                pw4 d8 = e9 == null ? d(vx4Var, q8) : e9;
                if (e8 instanceof ow4) {
                    ((ow4) e8).i(d8);
                } else {
                    rw4 rw4Var = (rw4) e8;
                    if (rw4Var.k(str)) {
                        throw new IOException("duplicate key: ".concat(String.valueOf(str)));
                    }
                    rw4Var.i(str, d8);
                }
                if (e9 != null) {
                    arrayDeque.addLast(e8);
                    if (arrayDeque.size() > 100) {
                        throw new IOException("too many recursions");
                    }
                    e8 = d8;
                } else {
                    continue;
                }
            } else {
                if (e8 instanceof ow4) {
                    vx4Var.e();
                } else {
                    vx4Var.h();
                }
                if (arrayDeque.isEmpty()) {
                    return e8;
                }
                e8 = (pw4) arrayDeque.removeLast();
            }
        }
    }

    private static final pw4 d(vx4 vx4Var, int i7) {
        int i8 = i7 - 1;
        if (i8 == 5) {
            String m7 = vx4Var.m();
            if (og4.a(m7)) {
                return new tw4(m7);
            }
            throw new IOException("illegal characters in string");
        }
        if (i8 == 6) {
            return new tw4(new ng4(vx4Var.m()));
        }
        if (i8 == 7) {
            return new tw4(Boolean.valueOf(vx4Var.n()));
        }
        if (i8 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(wx4.a(i7)));
        }
        vx4Var.o();
        return qw4.f14661q;
    }

    private static final pw4 e(vx4 vx4Var, int i7) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            vx4Var.c();
            return new ow4();
        }
        if (i8 != 2) {
            return null;
        }
        vx4Var.g();
        return new rw4();
    }
}
