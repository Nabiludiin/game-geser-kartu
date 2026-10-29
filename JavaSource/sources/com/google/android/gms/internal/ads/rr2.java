package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
final class rr2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f15165a;

    public rr2(Bundle bundle) {
        this.f15165a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = this.f15165a;
        x81 x81Var = (x81) obj;
        if (bundle.isEmpty()) {
            return;
        }
        x81Var.f18665b.putBundle("shared_pref", bundle);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Bundle bundle = this.f15165a;
        x81 x81Var = (x81) obj;
        if (bundle.isEmpty()) {
            return;
        }
        x81Var.f18664a.putBundle("shared_pref", bundle);
    }
}
