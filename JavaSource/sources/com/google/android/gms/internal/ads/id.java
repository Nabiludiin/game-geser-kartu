package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class id implements bd {

    /* renamed from: a, reason: collision with root package name */
    private final w72 f9993a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ md f9994b;

    public id(md mdVar) {
        Objects.requireNonNull(mdVar);
        this.f9994b = mdVar;
        this.f9993a = new w72(new byte[4], 4);
    }

    @Override // com.google.android.gms.internal.ads.bd
    public final void b(y82 y82Var) {
        if (y82Var.R() == 0 && (y82Var.R() & 128) != 0) {
            y82Var.J(6);
            int C = y82Var.C() / 4;
            for (int i7 = 0; i7 < C; i7++) {
                w72 w72Var = this.f9993a;
                y82Var.K(w72Var, 4);
                int j7 = w72Var.j(16);
                w72Var.h(3);
                if (j7 == 0) {
                    w72Var.h(13);
                } else {
                    int j8 = w72Var.j(13);
                    md mdVar = this.f9994b;
                    if (mdVar.d().get(j8) == null) {
                        mdVar.d().put(j8, new cd(new jd(mdVar, j8)));
                        mdVar.n(mdVar.m() + 1);
                    }
                }
            }
            this.f9994b.d().remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.bd
    public final void a(ef2 ef2Var, p2 p2Var, qd qdVar) {
    }
}
