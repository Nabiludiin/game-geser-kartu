package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
final class qw0 implements t52 {

    /* renamed from: a, reason: collision with root package name */
    private final tv0 f14648a;

    /* renamed from: b, reason: collision with root package name */
    private Context f14649b;

    /* synthetic */ qw0(tv0 tv0Var, byte[] bArr) {
        this.f14648a = tv0Var;
    }

    @Override // com.google.android.gms.internal.ads.t52
    public final u52 a() {
        v85.c(this.f14649b, Context.class);
        return new rw0(this.f14648a, this.f14649b);
    }

    @Override // com.google.android.gms.internal.ads.t52
    public final /* bridge */ /* synthetic */ t52 j(Context context) {
        this.f14649b = context;
        return this;
    }
}
