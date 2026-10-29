package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: MyApplication */
final class bn1 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f5866a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kn1 f5867b;

    bn1(kn1 kn1Var, View view) {
        this.f5866a = view;
        Objects.requireNonNull(kn1Var);
        this.f5867b = kn1Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        if (((Boolean) s2.b0.c().d(uy.X5)).booleanValue()) {
            r2.t.l().j(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f5867b.J(this.f5866a, (fa2) obj);
    }
}
