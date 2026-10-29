package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class bt3 implements at3 {

    /* renamed from: a, reason: collision with root package name */
    private final h85 f5994a;

    /* renamed from: b, reason: collision with root package name */
    private final nu3 f5995b;

    /* renamed from: c, reason: collision with root package name */
    private final long f5996c;

    bt3(h85 h85Var, nu3 nu3Var, sh3 sh3Var, long j7) {
        this.f5994a = h85Var;
        this.f5995b = nu3Var;
        this.f5996c = j7;
    }

    @Override // com.google.android.gms.internal.ads.at3
    public final boolean a(xk3 xk3Var) {
        if (xk3Var == null || xk3Var.equals(xk3.h0())) {
            this.f5995b.b(15104);
            return true;
        }
        if (xk3Var.f0() != this.f5994a.b()) {
            this.f5995b.b(15105);
            return true;
        }
        boolean z7 = (xk3Var.d0().f0() * 1000) - System.currentTimeMillis() <= this.f5996c;
        if (z7) {
            this.f5995b.b(15106);
        }
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.at3
    public final boolean b(xk3 xk3Var) {
        if (xk3Var == null || xk3Var.equals(xk3.h0())) {
            this.f5995b.b(15102);
            return false;
        }
        if (xk3Var.f0() == this.f5994a.b()) {
            return true;
        }
        this.f5995b.b(15103);
        return false;
    }
}
