package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
final class jw0 implements jz1 {

    /* renamed from: a, reason: collision with root package name */
    private final tv0 f10794a;

    /* renamed from: b, reason: collision with root package name */
    private Context f10795b;

    /* renamed from: c, reason: collision with root package name */
    private b70 f10796c;

    /* synthetic */ jw0(tv0 tv0Var, byte[] bArr) {
        this.f10794a = tv0Var;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final mz1 a() {
        v85.c(this.f10795b, Context.class);
        v85.c(this.f10796c, b70.class);
        return new kw0(this.f10794a, this.f10795b, this.f10796c);
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final /* bridge */ /* synthetic */ jz1 b(b70 b70Var) {
        b70Var.getClass();
        this.f10796c = b70Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final /* bridge */ /* synthetic */ jz1 d(Context context) {
        context.getClass();
        this.f10795b = context;
        return this;
    }
}
