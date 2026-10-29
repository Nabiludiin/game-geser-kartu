package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class uc implements bd {

    /* renamed from: a, reason: collision with root package name */
    private eq5 f16690a;

    /* renamed from: b, reason: collision with root package name */
    private ef2 f16691b;

    /* renamed from: c, reason: collision with root package name */
    private a4 f16692c;

    public uc(String str, String str2) {
        xn5 xn5Var = new xn5();
        xn5Var.k0("video/mp2t");
        xn5Var.l0(str);
        this.f16690a = xn5Var.m();
    }

    @Override // com.google.android.gms.internal.ads.bd
    public final void a(ef2 ef2Var, p2 p2Var, qd qdVar) {
        this.f16691b = ef2Var;
        qdVar.a();
        a4 A = p2Var.A(qdVar.b(), 5);
        this.f16692c = A;
        A.c(this.f16690a);
    }

    @Override // com.google.android.gms.internal.ads.bd
    public final void b(y82 y82Var) {
        this.f16691b.getClass();
        String str = hi2.f9535a;
        long b8 = this.f16691b.b();
        long c8 = this.f16691b.c();
        if (b8 == -9223372036854775807L || c8 == -9223372036854775807L) {
            return;
        }
        eq5 eq5Var = this.f16690a;
        if (c8 != eq5Var.f7780t) {
            xn5 a8 = eq5Var.a();
            a8.q0(c8);
            eq5 m7 = a8.m();
            this.f16690a = m7;
            this.f16692c.c(m7);
        }
        int C = y82Var.C();
        this.f16692c.e(y82Var, C);
        this.f16692c.a(b8, 1, C, 0, null);
    }
}
