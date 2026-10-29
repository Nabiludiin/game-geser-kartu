package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class fd implements v1 {

    /* renamed from: a, reason: collision with root package name */
    private final ef2 f8195a;

    /* renamed from: b, reason: collision with root package name */
    private final y82 f8196b = new y82();

    /* renamed from: c, reason: collision with root package name */
    private final int f8197c;

    public fd(int i7, ef2 ef2Var, int i8) {
        this.f8197c = i7;
        this.f8195a = ef2Var;
    }

    @Override // com.google.android.gms.internal.ads.v1
    public final t1 a(n2 n2Var, long j7) {
        int a8;
        int a9;
        long o7 = n2Var.o();
        int min = (int) Math.min(112800L, n2Var.q() - o7);
        y82 y82Var = this.f8196b;
        y82Var.z(min);
        n2Var.u(y82Var.H(), 0, min);
        int D = y82Var.D();
        long j8 = -1;
        long j9 = -9223372036854775807L;
        long j10 = -1;
        while (y82Var.C() >= 188 && (a9 = (a8 = sd.a(y82Var.H(), y82Var.F(), D)) + 188) <= D) {
            long b8 = sd.b(y82Var, a8, this.f8197c);
            if (b8 != -9223372036854775807L) {
                long e8 = this.f8195a.e(b8);
                if (e8 > j7) {
                    return j9 == -9223372036854775807L ? t1.a(e8, o7) : t1.c(o7 + j10);
                }
                j10 = a8;
                if (100000 + e8 > j7) {
                    return t1.c(o7 + j10);
                }
                j9 = e8;
            }
            y82Var.G(a9);
            j8 = a9;
        }
        return j9 != -9223372036854775807L ? t1.b(j9, o7 + j8) : t1.f15934d;
    }

    @Override // com.google.android.gms.internal.ads.v1
    public final void b() {
        byte[] bArr = hi2.f9536b;
        int length = bArr.length;
        this.f8196b.A(bArr, 0);
    }
}
