package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class x3 implements p2 {

    /* renamed from: q, reason: collision with root package name */
    private final long f18525q;

    /* renamed from: r, reason: collision with root package name */
    private final p2 f18526r;

    public x3(long j7, p2 p2Var) {
        this.f18525q = j7;
        this.f18526r = p2Var;
    }

    @Override // com.google.android.gms.internal.ads.p2
    public final a4 A(int i7, int i8) {
        return this.f18526r.A(i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.p2
    public final void B(q3 q3Var) {
        this.f18526r.B(new w3(this, q3Var, q3Var));
    }

    final /* synthetic */ long a() {
        return this.f18525q;
    }

    @Override // com.google.android.gms.internal.ads.p2
    public final void z() {
        this.f18526r.z();
    }
}
