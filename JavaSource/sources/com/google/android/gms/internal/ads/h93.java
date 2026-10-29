package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class h93 extends qi0 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ j74 f9388q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ ki0 f9389r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ i93 f9390s;

    h93(i93 i93Var, j74 j74Var, ki0 ki0Var) {
        this.f9388q = j74Var;
        this.f9389r = ki0Var;
        Objects.requireNonNull(i93Var);
        this.f9390s = i93Var;
    }

    @Override // com.google.android.gms.internal.ads.ri0
    public final void A(s2.x2 x2Var) {
        String bVar = x2Var.N0().toString();
        i93 i93Var = this.f9390s;
        String str = i93Var.f7479e.f26189q;
        StringBuilder sb = new StringBuilder(String.valueOf(bVar).length() + 51 + String.valueOf(str).length());
        sb.append("Failed to load rewarded ad with error: ");
        sb.append(bVar);
        sb.append(", adUnitId: ");
        sb.append(str);
        w2.p.f(sb.toString());
        i93Var.M(x2Var);
    }

    @Override // com.google.android.gms.internal.ads.ri0
    public final void c() {
        Objects.requireNonNull(this.f9390s);
        a83.a(this.f9389r, this.f9388q);
    }

    @Override // com.google.android.gms.internal.ads.ri0
    public final void B(int i7) {
    }
}
