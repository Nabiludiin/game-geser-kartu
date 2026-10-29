package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class ii2 implements qi2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ji2 f10054a;

    ii2(ji2 ji2Var) {
        Objects.requireNonNull(ji2Var);
        this.f10054a = ji2Var;
    }

    @Override // com.google.android.gms.internal.ads.qi2
    public final void a() {
        ji2 ji2Var = this.f10054a;
        synchronized (ji2Var) {
            ji2Var.k8(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.qi2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ji2 ji2Var = this.f10054a;
        rj1 rj1Var = (rj1) obj;
        synchronized (ji2Var) {
            ji2Var.k8(rj1Var);
            ji2Var.j8().b();
        }
    }
}
