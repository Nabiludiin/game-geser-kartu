package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class zm1 implements gr {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f20222q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ kn1 f20223r;

    zm1(kn1 kn1Var, String str) {
        this.f20222q = str;
        Objects.requireNonNull(kn1Var);
        this.f20223r = kn1Var;
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final void t(fr frVar) {
        if (((Boolean) s2.b0.c().d(uy.f17048a2)).booleanValue()) {
            synchronized (this) {
                try {
                    if (frVar.f8430j) {
                        kn1 kn1Var = this.f20223r;
                        if (kn1Var.M() != null) {
                            kn1Var.N().put(this.f20222q, Boolean.TRUE);
                            if (kn1Var.M() == null) {
                                return;
                            } else {
                                kn1Var.e0(kn1Var.M().q5(), kn1Var.M().i(), kn1Var.M().l(), true);
                            }
                        }
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (frVar.f8430j) {
            kn1 kn1Var2 = this.f20223r;
            if (kn1Var2.M() != null) {
                kn1Var2.N().put(this.f20222q, Boolean.TRUE);
                if (kn1Var2.M() == null) {
                    return;
                }
                kn1Var2.e0(kn1Var2.M().q5(), kn1Var2.M().i(), kn1Var2.M().l(), true);
            }
        }
    }
}
