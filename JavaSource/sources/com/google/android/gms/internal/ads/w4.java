package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class w4 implements v1 {

    /* renamed from: a, reason: collision with root package name */
    private final z2 f18020a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18021b;

    /* renamed from: c, reason: collision with root package name */
    private final t2 f18022c = new t2();

    /* synthetic */ w4(z2 z2Var, int i7, byte[] bArr) {
        this.f18020a = z2Var;
        this.f18021b = i7;
    }

    private final long c(n2 n2Var) {
        while (n2Var.n() < n2Var.q() - 6) {
            z2 z2Var = this.f18020a;
            int i7 = this.f18021b;
            t2 t2Var = this.f18022c;
            long n7 = n2Var.n();
            y82 y82Var = new y82(17);
            n2Var.u(y82Var.H(), 0, 2);
            if (y82Var.N() != i7) {
                n2Var.k();
                n2Var.P((int) (n7 - n2Var.o()));
            } else {
                y82Var.E(q2.b(n2Var, y82Var.H(), 2, 15) + 2);
                n2Var.k();
                n2Var.P((int) (n7 - n2Var.o()));
                if (u2.a(y82Var, z2Var, i7, t2Var)) {
                    break;
                }
            }
            n2Var.P(1);
        }
        if (n2Var.n() < n2Var.q() - 6) {
            return this.f18022c.f15947a;
        }
        n2Var.P((int) (n2Var.q() - n2Var.n()));
        return this.f18020a.f19989j;
    }

    @Override // com.google.android.gms.internal.ads.v1
    public final t1 a(n2 n2Var, long j7) {
        long o7 = n2Var.o();
        long c8 = c(n2Var);
        long n7 = n2Var.n();
        n2Var.P(Math.max(6, this.f18020a.f19982c));
        long c9 = c(n2Var);
        return (c8 > j7 || c9 <= j7) ? c9 <= j7 ? t1.b(c9, n2Var.n()) : t1.a(c8, o7) : t1.c(n7);
    }

    @Override // com.google.android.gms.internal.ads.v1
    public /* synthetic */ void b() {
        u1.a(this);
    }
}
