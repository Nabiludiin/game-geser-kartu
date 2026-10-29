package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class sk2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final s2.m5 f15663a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15664b;

    public sk2(s2.m5 m5Var, boolean z7) {
        this.f15663a = m5Var;
        this.f15664b = z7;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Bundle bundle = ((x81) obj).f18664a;
        if (((Boolean) s2.b0.c().d(uy.Z5)).booleanValue()) {
            bundle.putBoolean("app_switched", this.f15664b);
        }
        s2.m5 m5Var = this.f15663a;
        if (m5Var != null) {
            int i7 = m5Var.f26193q;
            if (i7 == 1) {
                bundle.putString("avo", "p");
            } else if (i7 == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
