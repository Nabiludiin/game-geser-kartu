package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class su1 implements sa1 {

    /* renamed from: q, reason: collision with root package name */
    private final mr0 f15822q;

    su1(mr0 mr0Var) {
        this.f15822q = mr0Var;
    }

    @Override // com.google.android.gms.internal.ads.sa1
    public final void d(Context context) {
        mr0 mr0Var = this.f15822q;
        if (mr0Var != null) {
            mr0Var.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.sa1
    public final void h(Context context) {
        mr0 mr0Var = this.f15822q;
        if (mr0Var != null) {
            mr0Var.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.sa1
    public final void j(Context context) {
        mr0 mr0Var = this.f15822q;
        if (mr0Var != null) {
            mr0Var.onResume();
        }
    }
}
