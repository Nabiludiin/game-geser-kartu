package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class v3 extends a3 {

    /* renamed from: b, reason: collision with root package name */
    private final long f17369b;

    public v3(n2 n2Var, long j7) {
        super(n2Var);
        rx3.a(n2Var.o() >= j7);
        this.f17369b = j7;
    }

    @Override // com.google.android.gms.internal.ads.a3, com.google.android.gms.internal.ads.n2
    public final long n() {
        return super.n() - this.f17369b;
    }

    @Override // com.google.android.gms.internal.ads.a3, com.google.android.gms.internal.ads.n2
    public final long o() {
        return super.o() - this.f17369b;
    }

    @Override // com.google.android.gms.internal.ads.a3, com.google.android.gms.internal.ads.n2
    public final long q() {
        return super.q() - this.f17369b;
    }
}
