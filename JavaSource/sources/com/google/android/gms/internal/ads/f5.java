package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
public final class f5 implements m2 {

    /* renamed from: a, reason: collision with root package name */
    private final y82 f8037a = new y82(4);

    /* renamed from: b, reason: collision with root package name */
    private final s3 f8038b = new s3(-1, -1, "image/heif");

    private final boolean a(n2 n2Var, int i7) {
        y82 y82Var = this.f8037a;
        y82Var.z(4);
        ((b2) n2Var).x(y82Var.H(), 0, 4, false);
        return y82Var.Y() == ((long) i7);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public /* synthetic */ List b() {
        return l2.a(this);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public /* synthetic */ m2 e() {
        return l2.b(this);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void i(long j7, long j8) {
        this.f8038b.i(j7, j8);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean j(n2 n2Var) {
        ((b2) n2Var).c(4, false);
        return a(n2Var, 1718909296) && a(n2Var, 1751476579);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void k(p2 p2Var) {
        this.f8038b.k(p2Var);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final int l(n2 n2Var, n3 n3Var) {
        return this.f8038b.l(n2Var, n3Var);
    }
}
