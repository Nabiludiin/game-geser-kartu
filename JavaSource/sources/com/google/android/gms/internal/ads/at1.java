package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class at1 extends ls1 implements pi1 {

    /* renamed from: v, reason: collision with root package name */
    private pi1 f5281v;

    @Override // com.google.android.gms.internal.ads.pi1
    public final synchronized void M() {
        pi1 pi1Var = this.f5281v;
        if (pi1Var != null) {
            pi1Var.M();
        }
    }

    protected final synchronized void b(s2.a aVar, n40 n40Var, u2.c0 c0Var, p40 p40Var, u2.e eVar, pi1 pi1Var) {
        try {
            try {
                super.a(aVar, n40Var, c0Var, p40Var, eVar);
                this.f5281v = pi1Var;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final synchronized void z() {
        pi1 pi1Var = this.f5281v;
        if (pi1Var != null) {
            pi1Var.z();
        }
    }
}
