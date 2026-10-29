package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
final class dw0 implements pw2 {

    /* renamed from: a, reason: collision with root package name */
    private final tv0 f7335a;

    /* renamed from: b, reason: collision with root package name */
    private Context f7336b;

    /* renamed from: c, reason: collision with root package name */
    private String f7337c;

    /* renamed from: d, reason: collision with root package name */
    private s2.g5 f7338d;

    /* synthetic */ dw0(tv0 tv0Var, byte[] bArr) {
        this.f7335a = tv0Var;
    }

    @Override // com.google.android.gms.internal.ads.pw2
    public final /* bridge */ /* synthetic */ pw2 W(String str) {
        str.getClass();
        this.f7337c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.pw2
    public final qw2 a() {
        v85.c(this.f7336b, Context.class);
        v85.c(this.f7337c, String.class);
        v85.c(this.f7338d, s2.g5.class);
        return new ew0(this.f7335a, this.f7336b, this.f7337c, this.f7338d);
    }

    @Override // com.google.android.gms.internal.ads.pw2
    public final /* bridge */ /* synthetic */ pw2 b(s2.g5 g5Var) {
        g5Var.getClass();
        this.f7338d = g5Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.pw2
    public final /* bridge */ /* synthetic */ pw2 c(Context context) {
        context.getClass();
        this.f7336b = context;
        return this;
    }
}
