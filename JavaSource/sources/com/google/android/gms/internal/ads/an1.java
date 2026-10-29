package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class an1 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5059a = "Google";

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kn1 f5060b;

    an1(kn1 kn1Var, String str, boolean z7) {
        Objects.requireNonNull(kn1Var);
        this.f5060b = kn1Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        if (((Boolean) s2.b0.c().d(uy.X5)).booleanValue()) {
            r2.t.l().j(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        kn1 kn1Var = this.f5060b;
        kn1Var.K().b0((mr0) obj);
        String str = this.f5059a;
        im0 y7 = kn1Var.K().y();
        fa2 w7 = kn1Var.w(str, true);
        if (w7 != null && y7 != null) {
            y7.b(w7);
        } else if (y7 != null) {
            y7.cancel(false);
        }
    }
}
