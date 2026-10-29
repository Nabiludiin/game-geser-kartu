package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class ax0 implements b3.d {

    /* renamed from: a, reason: collision with root package name */
    private final tv0 f5387a;

    /* renamed from: b, reason: collision with root package name */
    private e91 f5388b;

    /* renamed from: c, reason: collision with root package name */
    private b3.a0 f5389c;

    /* synthetic */ ax0(tv0 tv0Var, byte[] bArr) {
        this.f5387a = tv0Var;
    }

    @Override // b3.d
    public final b3.e a() {
        v85.c(this.f5388b, e91.class);
        v85.c(this.f5389c, b3.a0.class);
        return new bx0(this.f5387a, this.f5389c, new y51(), new b81(), new gy1(), this.f5388b, null, null);
    }

    @Override // b3.d
    public final /* bridge */ /* synthetic */ b3.d b(b3.a0 a0Var) {
        this.f5389c = a0Var;
        return this;
    }

    @Override // b3.d
    public final /* bridge */ /* synthetic */ b3.d c(e91 e91Var) {
        this.f5388b = e91Var;
        return this;
    }
}
