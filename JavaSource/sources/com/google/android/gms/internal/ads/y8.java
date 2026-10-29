package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
public final class y8 implements m2 {

    /* renamed from: a, reason: collision with root package name */
    private p2 f19409a;

    /* renamed from: b, reason: collision with root package name */
    private f9 f19410b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19411c;

    private final boolean a(n2 n2Var) {
        a9 a9Var = new a9();
        if (a9Var.c(n2Var, true) && (a9Var.f4807a & 2) == 2) {
            int min = Math.min(a9Var.f4811e, 8);
            y82 y82Var = new y82(min);
            n2Var.u(y82Var.H(), 0, min);
            y82Var.G(0);
            if (y82Var.C() >= 5 && y82Var.R() == 127 && y82Var.Y() == 1179402563) {
                this.f19410b = new x8();
            } else {
                y82Var.G(0);
                try {
                    if (g4.d(1, y82Var, true)) {
                        this.f19410b = new h9();
                    }
                } catch (wi unused) {
                }
                y82Var.G(0);
                if (c9.j(y82Var)) {
                    this.f19410b = new c9();
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public /* synthetic */ List b() {
        return l2.a(this);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public /* synthetic */ m2 e() {
        return l2.b(this);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void i(long j7, long j8) {
        f9 f9Var = this.f19410b;
        if (f9Var != null) {
            f9Var.e(j7, j8);
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean j(n2 n2Var) {
        try {
            return a(n2Var);
        } catch (wi unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void k(p2 p2Var) {
        this.f19409a = p2Var;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final int l(n2 n2Var, n3 n3Var) {
        this.f19409a.getClass();
        if (this.f19410b == null) {
            if (!a(n2Var)) {
                throw wi.b("Failed to determine bitstream type", null);
            }
            n2Var.k();
        }
        if (!this.f19411c) {
            a4 A = this.f19409a.A(0, 1);
            this.f19409a.z();
            this.f19410b.d(this.f19409a, A);
            this.f19411c = true;
        }
        return this.f19410b.f(n2Var, n3Var);
    }
}
