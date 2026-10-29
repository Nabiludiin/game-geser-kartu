package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class x2 implements q3 {

    /* renamed from: a, reason: collision with root package name */
    private final z2 f18515a;

    /* renamed from: b, reason: collision with root package name */
    private final long f18516b;

    public x2(z2 z2Var, long j7) {
        this.f18515a = z2Var;
        this.f18516b = j7;
    }

    private final r3 d(long j7, long j8) {
        return new r3((j7 * 1000000) / this.f18515a.f19984e, this.f18516b + j8);
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final long a() {
        return this.f18515a.a();
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final o3 c(long j7) {
        z2 z2Var = this.f18515a;
        y2 y2Var = z2Var.f19990k;
        y2Var.getClass();
        long b8 = z2Var.b(j7);
        long[] jArr = y2Var.f19339a;
        int J = hi2.J(jArr, b8, true, false);
        long j8 = J == -1 ? 0L : jArr[J];
        long[] jArr2 = y2Var.f19340b;
        r3 d8 = d(j8, J != -1 ? jArr2[J] : 0L);
        if (d8.f14718a == j7 || J == jArr.length - 1) {
            return new o3(d8, d8);
        }
        int i7 = J + 1;
        return new o3(d8, d(jArr[i7], jArr2[i7]));
    }
}
