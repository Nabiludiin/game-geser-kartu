package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: MyApplication */
final class mx4 extends ww4 {

    /* renamed from: a, reason: collision with root package name */
    static final mx4 f12480a = new mx4();

    private mx4() {
    }

    @Override // com.google.android.gms.internal.ads.ww4
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(xx4 xx4Var, pw4 pw4Var) {
        if (pw4Var == null || (pw4Var instanceof qw4)) {
            xx4Var.n();
            return;
        }
        if (pw4Var instanceof tw4) {
            tw4 h8 = pw4Var.h();
            if (h8.d()) {
                xx4Var.m(h8.j());
                return;
            } else if (h8.a()) {
                xx4Var.l(h8.i());
                return;
            } else {
                xx4Var.k(h8.c());
                return;
            }
        }
        if (pw4Var instanceof ow4) {
            xx4Var.c();
            Iterator it = pw4Var.g().iterator();
            while (it.hasNext()) {
                a(xx4Var, (pw4) it.next());
            }
            xx4Var.e();
            return;
        }
        if (!(pw4Var instanceof rw4)) {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(pw4Var.getClass())));
        }
        xx4Var.g();
        for (Map.Entry entry : pw4Var.e().j()) {
            xx4Var.j((String) entry.getKey());
            a(xx4Var, (pw4) entry.getValue());
        }
        xx4Var.h();
    }
}
