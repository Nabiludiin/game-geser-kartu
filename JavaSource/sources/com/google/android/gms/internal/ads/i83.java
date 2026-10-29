package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class i83 extends s2.k0 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ j74 f9883q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ s2.v0 f9884r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ j83 f9885s;

    i83(j83 j83Var, j74 j74Var, s2.v0 v0Var) {
        this.f9883q = j74Var;
        this.f9884r = v0Var;
        Objects.requireNonNull(j83Var);
        this.f9885s = j83Var;
    }

    @Override // s2.l0
    public final void b() {
        Objects.requireNonNull(this.f9885s);
        a83.a(this.f9884r, this.f9883q);
    }

    @Override // s2.l0
    public final void b1(s2.x2 x2Var) {
        String bVar = x2Var.N0().toString();
        j83 j83Var = this.f9885s;
        String str = j83Var.f7479e.f26189q;
        StringBuilder sb = new StringBuilder(String.valueOf(bVar).length() + 57 + String.valueOf(str).length());
        sb.append("Failed to load interstitial ad with error: ");
        sb.append(bVar);
        sb.append(" for ad unit: ");
        sb.append(str);
        w2.p.f(sb.toString());
        j83Var.M(x2Var);
    }
}
