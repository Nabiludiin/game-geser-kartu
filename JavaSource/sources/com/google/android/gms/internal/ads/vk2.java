package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class vk2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f17655a;

    /* renamed from: b, reason: collision with root package name */
    private final ql0 f17656b;

    vk2(Executor executor, ql0 ql0Var) {
        this.f17655a = executor;
        this.f17656b = ql0Var;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        if (((Boolean) s2.b0.c().d(uy.f17201s3)).booleanValue()) {
            return p64.a(new wk2(null));
        }
        ql0 ql0Var = this.f17656b;
        return p64.k(ql0Var.s(), uk2.f16799a, this.f17655a);
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 10;
    }
}
