package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class h3 implements q3 {

    /* renamed from: a, reason: collision with root package name */
    private final hw1 f9296a;

    /* renamed from: b, reason: collision with root package name */
    private final hw1 f9297b;

    /* renamed from: c, reason: collision with root package name */
    private long f9298c;

    public h3(long[] jArr, long[] jArr2, long j7) {
        int length = jArr.length;
        int length2 = jArr2.length;
        rx3.a(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.f9296a = new hw1(length2);
            this.f9297b = new hw1(length2);
        } else {
            int i7 = length2 + 1;
            hw1 hw1Var = new hw1(i7);
            this.f9296a = hw1Var;
            hw1 hw1Var2 = new hw1(i7);
            this.f9297b = hw1Var2;
            hw1Var.a(0L);
            hw1Var2.a(0L);
        }
        this.f9296a.b(jArr);
        this.f9297b.b(jArr2);
        this.f9298c = j7;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final long a() {
        return this.f9298c;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final boolean b() {
        return this.f9297b.d() > 0;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final o3 c(long j7) {
        hw1 hw1Var = this.f9297b;
        if (hw1Var.d() == 0) {
            r3 r3Var = r3.f14717c;
            return new o3(r3Var, r3Var);
        }
        int K = hi2.K(hw1Var, j7, true, true);
        long c8 = hw1Var.c(K);
        hw1 hw1Var2 = this.f9296a;
        r3 r3Var2 = new r3(c8, hw1Var2.c(K));
        if (r3Var2.f14718a == j7 || K == hw1Var.d() - 1) {
            return new o3(r3Var2, r3Var2);
        }
        int i7 = K + 1;
        return new o3(r3Var2, new r3(hw1Var.c(i7), hw1Var2.c(i7)));
    }
}
