package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class pp2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    public final b03 f14002a;

    public pp2(b03 b03Var) {
        this.f14002a = b03Var;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        x81 x81Var = (x81) obj;
        b03 b03Var = this.f14002a;
        if (b03Var != null) {
            if (((Boolean) s2.b0.c().d(uy.Wc)).booleanValue()) {
                return;
            }
            Bundle bundle = x81Var.f18664a;
            bundle.putBoolean("render_in_browser", b03Var.b());
            bundle.putBoolean("disable_ml", b03Var.c());
        }
    }
}
