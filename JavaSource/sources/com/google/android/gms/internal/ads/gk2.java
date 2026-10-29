package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class gk2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f8968a;

    gk2(Bundle bundle) {
        this.f8968a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Bundle bundle = this.f8968a;
        x81 x81Var = (x81) obj;
        if (bundle.isEmpty()) {
            return;
        }
        x81Var.f18664a.putBundle("installed_adapter_data", bundle);
    }
}
