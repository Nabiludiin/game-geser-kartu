package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class f83 extends dt {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ j74 f8063q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ s2.m4 f8064r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ g83 f8065s;

    f83(g83 g83Var, j74 j74Var, s2.m4 m4Var) {
        this.f8063q = j74Var;
        this.f8064r = m4Var;
        Objects.requireNonNull(g83Var);
        this.f8065s = g83Var;
    }

    @Override // com.google.android.gms.internal.ads.et
    public final void B6(bt btVar) {
        Objects.requireNonNull(this.f8065s);
        a83.a(btVar, this.f8063q);
    }

    @Override // com.google.android.gms.internal.ads.et
    public final void u0(s2.x2 x2Var) {
        String bVar = x2Var.N0().toString();
        String str = this.f8064r.f26189q;
        StringBuilder sb = new StringBuilder(String.valueOf(bVar).length() + 60 + String.valueOf(str).length());
        sb.append("Failed to load app open ad with error parcel: ");
        sb.append(bVar);
        sb.append(" for ad unit: ");
        sb.append(str);
        w2.p.f(sb.toString());
        g83 g83Var = this.f8065s;
        Objects.requireNonNull(g83Var);
        g83Var.M(x2Var);
    }

    @Override // com.google.android.gms.internal.ads.et
    public final void R(int i7) {
    }
}
