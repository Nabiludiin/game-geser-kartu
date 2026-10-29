package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class k31 implements ra1 {

    /* renamed from: q, reason: collision with root package name */
    private final mr0 f10872q;

    /* renamed from: r, reason: collision with root package name */
    private final rx1 f10873r;

    /* renamed from: s, reason: collision with root package name */
    private final c03 f10874s;

    k31(mr0 mr0Var, rx1 rx1Var, c03 c03Var) {
        this.f10872q = mr0Var;
        this.f10873r = rx1Var;
        this.f10874s = c03Var;
    }

    @Override // com.google.android.gms.internal.ads.ra1
    public final void E() {
        mr0 mr0Var;
        if (!((Boolean) s2.b0.c().d(uy.Wd)).booleanValue() || (mr0Var = this.f10872q) == null) {
            return;
        }
        String str = true != v2.c.a(mr0Var.Z()) ? "0" : "1";
        qx1 a8 = this.f10873r.a();
        a8.c("action", "hcp");
        a8.c("hcp", str);
        a8.b(this.f10874s);
        a8.d();
    }
}
