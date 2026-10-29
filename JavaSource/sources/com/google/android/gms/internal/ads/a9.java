package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class a9 {

    /* renamed from: a, reason: collision with root package name */
    public int f4807a;

    /* renamed from: b, reason: collision with root package name */
    public long f4808b;

    /* renamed from: c, reason: collision with root package name */
    public int f4809c;

    /* renamed from: d, reason: collision with root package name */
    public int f4810d;

    /* renamed from: e, reason: collision with root package name */
    public int f4811e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f4812f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    private final y82 f4813g = new y82(255);

    a9() {
    }

    public final void a() {
        this.f4807a = 0;
        this.f4808b = 0L;
        this.f4809c = 0;
        this.f4810d = 0;
        this.f4811e = 0;
    }

    public final boolean b(n2 n2Var, long j7) {
        rx3.a(n2Var.o() == n2Var.n());
        y82 y82Var = this.f4813g;
        y82Var.z(4);
        while (true) {
            if ((j7 == -1 || n2Var.o() + 4 < j7) && q2.e(n2Var, y82Var.H(), 0, 4, true)) {
                y82Var.G(0);
                if (y82Var.Y() == 1332176723) {
                    n2Var.k();
                    return true;
                }
                n2Var.B(1);
            }
        }
        do {
            if (j7 != -1 && n2Var.o() >= j7) {
                break;
            }
        } while (n2Var.V(1) != -1);
        return false;
    }

    public final boolean c(n2 n2Var, boolean z7) {
        a();
        y82 y82Var = this.f4813g;
        y82Var.z(27);
        if (q2.e(n2Var, y82Var.H(), 0, 27, z7) && y82Var.Y() == 1332176723) {
            if (y82Var.R() != 0) {
                if (z7) {
                    return false;
                }
                throw wi.c("unsupported bit stream revision");
            }
            this.f4807a = y82Var.R();
            this.f4808b = y82Var.e();
            y82Var.a();
            y82Var.a();
            y82Var.a();
            int R = y82Var.R();
            this.f4809c = R;
            this.f4810d = R + 27;
            y82Var.z(R);
            if (q2.e(n2Var, y82Var.H(), 0, this.f4809c, z7)) {
                for (int i7 = 0; i7 < this.f4809c; i7++) {
                    int[] iArr = this.f4812f;
                    int R2 = y82Var.R();
                    iArr[i7] = R2;
                    this.f4811e += R2;
                }
                return true;
            }
        }
        return false;
    }
}
