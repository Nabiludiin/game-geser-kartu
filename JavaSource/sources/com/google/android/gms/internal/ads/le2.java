package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: MyApplication */
final class le2 implements il1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ na2 f11591a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c03 f11592b;

    le2(me2 me2Var, na2 na2Var, c03 c03Var) {
        this.f11591a = na2Var;
        this.f11592b = c03Var;
        Objects.requireNonNull(me2Var);
    }

    @Override // com.google.android.gms.internal.ads.il1
    public final void a(boolean z7, Context context, ka1 ka1Var) {
        try {
            v13 v13Var = (v13) this.f11591a.f12649b;
            v13Var.x(z7);
            v13Var.B(context);
        } catch (d13 e8) {
            throw new hl1(e8.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.il1
    public final c03 b() {
        return this.f11592b;
    }
}
