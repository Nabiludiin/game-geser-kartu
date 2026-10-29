package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: MyApplication */
final class gf2 implements il1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ na2 f8880a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c03 f8881b;

    gf2(if2 if2Var, na2 na2Var, c03 c03Var) {
        this.f8880a = na2Var;
        this.f8881b = c03Var;
        Objects.requireNonNull(if2Var);
    }

    @Override // com.google.android.gms.internal.ads.il1
    public final void a(boolean z7, Context context, ka1 ka1Var) {
        try {
            v13 v13Var = (v13) this.f8880a.f12649b;
            v13Var.x(z7);
            v13Var.r();
        } catch (d13 e8) {
            int i7 = v2.n1.f26802b;
            w2.p.g("Cannot show rewarded video.", e8);
            throw new hl1(e8.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.il1
    public final c03 b() {
        return this.f8881b;
    }
}
