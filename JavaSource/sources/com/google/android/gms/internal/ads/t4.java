package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
public final class t4 implements m2 {

    /* renamed from: a, reason: collision with root package name */
    private final y82 f15966a = new y82(4);

    /* renamed from: b, reason: collision with root package name */
    private final s3 f15967b = new s3(-1, -1, "image/avif");

    private final boolean a(n2 n2Var, int i7) {
        y82 y82Var = this.f15966a;
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
        this.f15967b.i(j7, j8);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean j(n2 n2Var) {
        ((b2) n2Var).c(4, false);
        return a(n2Var, 1718909296) && a(n2Var, 1635150182);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void k(p2 p2Var) {
        this.f15967b.k(p2Var);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final int l(n2 n2Var, n3 n3Var) {
        return this.f15967b.l(n2Var, n3Var);
    }
}
