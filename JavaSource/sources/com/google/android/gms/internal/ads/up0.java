package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class up0 extends qp0 {
    public up0(bo0 bo0Var) {
        super(bo0Var);
    }

    @Override // com.google.android.gms.internal.ads.qp0
    public final boolean g(String str) {
        String o7 = w2.g.o(str);
        bo0 bo0Var = (bo0) this.f14549s.get();
        if (bo0Var != null && o7 != null) {
            bo0Var.z0(o7, this);
        }
        int i7 = v2.n1.f26802b;
        w2.p.f("VideoStreamNoopCache is doing nothing.");
        v(str, o7, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.qp0
    public final void q() {
    }
}
