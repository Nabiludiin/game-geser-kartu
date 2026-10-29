package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
final class uw0 implements vz2 {

    /* renamed from: a, reason: collision with root package name */
    private final tv0 f17012a;

    /* renamed from: b, reason: collision with root package name */
    private Context f17013b;

    /* renamed from: c, reason: collision with root package name */
    private String f17014c;

    /* synthetic */ uw0(tv0 tv0Var, byte[] bArr) {
        this.f17012a = tv0Var;
    }

    @Override // com.google.android.gms.internal.ads.vz2
    public final wz2 a() {
        v85.c(this.f17013b, Context.class);
        return new ww0(this.f17012a, this.f17013b, this.f17014c);
    }

    @Override // com.google.android.gms.internal.ads.vz2
    public final /* bridge */ /* synthetic */ vz2 d(Context context) {
        context.getClass();
        this.f17013b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.vz2
    public final /* synthetic */ vz2 v(String str) {
        this.f17014c = str;
        return this;
    }
}
