package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: MyApplication */
final class ya2 implements il1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ na2 f19444a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c03 f19445b;

    ya2(za2 za2Var, na2 na2Var, c03 c03Var) {
        this.f19444a = na2Var;
        this.f19445b = c03Var;
        Objects.requireNonNull(za2Var);
    }

    @Override // com.google.android.gms.internal.ads.il1
    public final void a(boolean z7, Context context, ka1 ka1Var) {
        try {
            v13 v13Var = (v13) this.f19444a.f12649b;
            v13Var.x(z7);
            v13Var.E(context);
        } catch (d13 e8) {
            throw new hl1(e8.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.il1
    public final c03 b() {
        return this.f19445b;
    }
}
