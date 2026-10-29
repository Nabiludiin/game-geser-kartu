package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: MyApplication */
final class tb2 extends uc0 {

    /* renamed from: q, reason: collision with root package name */
    private final na2 f16117q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ ub2 f16118r;

    /* synthetic */ tb2(ub2 ub2Var, na2 na2Var, byte[] bArr) {
        Objects.requireNonNull(ub2Var);
        this.f16118r = ub2Var;
        this.f16117q = na2Var;
    }

    @Override // com.google.android.gms.internal.ads.vc0
    public final void A(s2.x2 x2Var) {
        ((ac2) this.f16117q.f12650c).i1(x2Var);
    }

    @Override // com.google.android.gms.internal.ads.vc0
    public final void K1(tb0 tb0Var) {
        this.f16118r.e(tb0Var);
        ((ac2) this.f16117q.f12650c).i();
    }

    @Override // com.google.android.gms.internal.ads.vc0
    public final void Y(w3.a aVar) {
        this.f16118r.d((View) w3.b.r0(aVar));
        ((ac2) this.f16117q.f12650c).i();
    }

    @Override // com.google.android.gms.internal.ads.vc0
    public final void u(String str) {
        ((ac2) this.f16117q.f12650c).a8(0, str);
    }
}
