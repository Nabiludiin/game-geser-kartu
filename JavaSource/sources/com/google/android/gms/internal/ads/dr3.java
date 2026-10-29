package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class dr3 implements wk3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7264a;

    /* renamed from: b, reason: collision with root package name */
    private final wk3 f7265b;

    public dr3(Context context) {
        ht3 ht3Var = new ht3();
        this.f7264a = context.getApplicationContext();
        this.f7265b = ht3Var;
    }

    @Override // com.google.android.gms.internal.ads.wk3
    public final /* bridge */ /* synthetic */ yl3 a() {
        return new gs3(this.f7264a, this.f7265b.a());
    }
}
