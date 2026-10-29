package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
final class yv0 implements av2 {

    /* renamed from: a, reason: collision with root package name */
    private final tv0 f19814a;

    /* renamed from: b, reason: collision with root package name */
    private Context f19815b;

    /* renamed from: c, reason: collision with root package name */
    private String f19816c;

    /* synthetic */ yv0(tv0 tv0Var, byte[] bArr) {
        this.f19814a = tv0Var;
    }

    @Override // com.google.android.gms.internal.ads.av2
    public final bv2 a() {
        v85.c(this.f19815b, Context.class);
        v85.c(this.f19816c, String.class);
        return new zv0(this.f19814a, this.f19815b, this.f19816c);
    }

    @Override // com.google.android.gms.internal.ads.av2
    public final /* bridge */ /* synthetic */ av2 d(Context context) {
        context.getClass();
        this.f19815b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.av2
    public final /* bridge */ /* synthetic */ av2 v(String str) {
        str.getClass();
        this.f19816c = str;
        return this;
    }
}
