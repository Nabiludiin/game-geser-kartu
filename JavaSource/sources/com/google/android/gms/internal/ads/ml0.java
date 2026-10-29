package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class ml0 extends v2.b0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ql0 f12297c;

    ml0(ql0 ql0Var) {
        Objects.requireNonNull(ql0Var);
        this.f12297c = ql0Var;
    }

    @Override // v2.b0
    public final void a() {
        ql0 ql0Var = this.f12297c;
        xy xyVar = new xy(ql0Var.A(), ql0Var.B().f27051q);
        synchronized (ql0Var.z()) {
            try {
                r2.t.q();
                bz.a(ql0Var.a(), xyVar);
            } catch (IllegalArgumentException e8) {
                int i7 = v2.n1.f26802b;
                w2.p.g("Cannot config CSI reporter.", e8);
            }
        }
    }
}
