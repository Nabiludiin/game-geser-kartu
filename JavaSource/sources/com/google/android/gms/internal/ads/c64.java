package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class c64 extends q54 {
    private b64 F;

    c64(s04 s04Var, boolean z7, Executor executor, Callable callable) {
        super(s04Var, z7, false);
        this.F = new a64(this, callable, executor);
        M();
    }

    @Override // com.google.android.gms.internal.ads.q54
    final void F(int i7) {
        super.F(i7);
        if (i7 == 1) {
            this.F = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.q54
    final void O() {
        b64 b64Var = this.F;
        if (b64Var != null) {
            b64Var.i();
        }
    }

    final /* synthetic */ void R(b64 b64Var) {
        this.F = null;
    }

    @Override // com.google.android.gms.internal.ads.b54
    protected final void t() {
        b64 b64Var = this.F;
        if (b64Var != null) {
            b64Var.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.q54
    final void N(int i7, Object obj) {
    }
}
