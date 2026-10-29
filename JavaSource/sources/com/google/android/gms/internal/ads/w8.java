package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class w8 implements b9 {

    /* renamed from: a, reason: collision with root package name */
    private final z2 f18105a;

    /* renamed from: b, reason: collision with root package name */
    private final y2 f18106b;

    /* renamed from: c, reason: collision with root package name */
    private long f18107c = -1;

    /* renamed from: d, reason: collision with root package name */
    private long f18108d = -1;

    public w8(z2 z2Var, y2 y2Var) {
        this.f18105a = z2Var;
        this.f18106b = y2Var;
    }

    public final void a(long j7) {
        this.f18107c = j7;
    }

    @Override // com.google.android.gms.internal.ads.b9
    public final void b(long j7) {
        long[] jArr = this.f18106b.f19339a;
        this.f18108d = jArr[hi2.J(jArr, j7, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.b9
    public final q3 d() {
        rx3.h(this.f18107c != -1);
        return new x2(this.f18105a, this.f18107c);
    }

    @Override // com.google.android.gms.internal.ads.b9
    public final long j(n2 n2Var) {
        long j7 = this.f18108d;
        if (j7 < 0) {
            return -1L;
        }
        this.f18108d = -1L;
        return -(j7 + 2);
    }
}
