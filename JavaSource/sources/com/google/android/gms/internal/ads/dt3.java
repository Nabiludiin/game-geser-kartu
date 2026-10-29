package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class dt3 implements at3 {

    /* renamed from: a, reason: collision with root package name */
    private final nu3 f7291a;

    /* renamed from: b, reason: collision with root package name */
    private final long f7292b;

    dt3(sh3 sh3Var, nu3 nu3Var, long j7) {
        this.f7291a = nu3Var;
        this.f7292b = j7;
    }

    @Override // com.google.android.gms.internal.ads.at3
    public final boolean a(xk3 xk3Var) {
        if (xk3Var == null || xk3Var.equals(xk3.h0())) {
            this.f7291a.b(20202);
            return true;
        }
        boolean z7 = xk3Var.e0().e0() - System.currentTimeMillis() <= this.f7292b;
        if (z7) {
            this.f7291a.b(20203);
        }
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.at3
    public final boolean b(xk3 xk3Var) {
        if (xk3Var != null && !xk3Var.equals(xk3.h0())) {
            return true;
        }
        this.f7291a.b(20204);
        return false;
    }
}
