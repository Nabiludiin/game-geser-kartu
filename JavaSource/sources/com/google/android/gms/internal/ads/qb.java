package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
public final class qb implements m2 {

    /* renamed from: a, reason: collision with root package name */
    private final rb f14351a = new rb(null, 0, "audio/ac3");

    /* renamed from: b, reason: collision with root package name */
    private final y82 f14352b = new y82(2786);

    /* renamed from: c, reason: collision with root package name */
    private boolean f14353c;

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
        this.f14353c = false;
        this.f14351a.a();
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean j(n2 n2Var) {
        y82 y82Var = new y82(10);
        int i7 = 0;
        while (true) {
            b2 b2Var = (b2) n2Var;
            b2Var.x(y82Var.H(), 0, 10, false);
            y82Var.G(0);
            if (y82Var.W() != 4801587) {
                break;
            }
            y82Var.J(3);
            int g8 = y82Var.g();
            i7 += g8 + 10;
            b2Var.c(g8, false);
        }
        n2Var.k();
        b2 b2Var2 = (b2) n2Var;
        b2Var2.c(i7, false);
        int i8 = 0;
        int i9 = i7;
        while (true) {
            b2Var2.x(y82Var.H(), 0, 6, false);
            y82Var.G(0);
            if (y82Var.S() != 2935) {
                n2Var.k();
                i9++;
                if (i9 - i7 >= 8192) {
                    return false;
                }
                b2Var2.c(i9, false);
                i8 = 0;
            } else {
                i8++;
                if (i8 >= 4) {
                    return true;
                }
                int d8 = k1.d(y82Var.H());
                if (d8 == -1) {
                    return false;
                }
                b2Var2.c(d8 - 6, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void k(p2 p2Var) {
        this.f14351a.C0(p2Var, new qd(Integer.MIN_VALUE, 0, 1));
        p2Var.z();
        p2Var.B(new p3(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final int l(n2 n2Var, n3 n3Var) {
        y82 y82Var = this.f14352b;
        int r7 = n2Var.r(y82Var.H(), 0, 2786);
        if (r7 == -1) {
            return -1;
        }
        y82Var.G(0);
        y82Var.E(r7);
        if (!this.f14353c) {
            this.f14351a.D0(0L, 4);
            this.f14353c = true;
        }
        this.f14351a.B0(y82Var);
        return 0;
    }
}
