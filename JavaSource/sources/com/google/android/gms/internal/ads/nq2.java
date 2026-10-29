package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class nq2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f12843a;

    public nq2(Bundle bundle) {
        this.f12843a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = this.f12843a;
        x81 x81Var = (x81) obj;
        if (bundle != null) {
            x81Var.f18665b.putAll(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Bundle bundle = this.f12843a;
        x81 x81Var = (x81) obj;
        if (bundle != null) {
            x81Var.f18664a.putAll(bundle);
        }
    }
}
