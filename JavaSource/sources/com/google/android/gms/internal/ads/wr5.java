package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class wr5 implements qr5 {

    /* renamed from: a, reason: collision with root package name */
    private final qr5 f18397a;

    /* renamed from: b, reason: collision with root package name */
    private final long f18398b;

    public wr5(qr5 qr5Var, long j7) {
        this.f18397a = qr5Var;
        this.f18398b = j7;
    }

    @Override // com.google.android.gms.internal.ads.qr5
    public final int a(hb5 hb5Var, wj4 wj4Var, int i7) {
        int a8 = this.f18397a.a(hb5Var, wj4Var, i7);
        if (a8 != -4) {
            return a8;
        }
        wj4Var.f18273f += this.f18398b;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.qr5
    public final boolean b() {
        return this.f18397a.b();
    }

    public final qr5 c() {
        return this.f18397a;
    }

    @Override // com.google.android.gms.internal.ads.qr5
    public final void d() {
        this.f18397a.d();
    }

    @Override // com.google.android.gms.internal.ads.qr5
    public final int g(long j7) {
        return this.f18397a.g(j7 - this.f18398b);
    }
}
