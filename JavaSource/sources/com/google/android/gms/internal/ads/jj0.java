package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class jj0 extends qi0 {

    /* renamed from: q, reason: collision with root package name */
    private final g3.b f10568q;

    /* renamed from: r, reason: collision with root package name */
    private final kj0 f10569r;

    public jj0(g3.b bVar, kj0 kj0Var) {
        this.f10568q = bVar;
        this.f10569r = kj0Var;
    }

    @Override // com.google.android.gms.internal.ads.ri0
    public final void A(s2.x2 x2Var) {
        g3.b bVar = this.f10568q;
        if (bVar != null) {
            bVar.a(x2Var.N0());
        }
    }

    @Override // com.google.android.gms.internal.ads.ri0
    public final void c() {
        kj0 kj0Var;
        g3.b bVar = this.f10568q;
        if (bVar == null || (kj0Var = this.f10569r) == null) {
            return;
        }
        bVar.b(kj0Var);
    }

    @Override // com.google.android.gms.internal.ads.ri0
    public final void B(int i7) {
    }
}
