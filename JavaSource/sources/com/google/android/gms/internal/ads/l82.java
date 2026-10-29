package com.google.android.gms.internal.ads;

import android.app.Activity;

/* compiled from: MyApplication */
final class l82 extends j92 {

    /* renamed from: a, reason: collision with root package name */
    private Activity f11444a;

    /* renamed from: b, reason: collision with root package name */
    private u2.a0 f11445b;

    /* renamed from: c, reason: collision with root package name */
    private String f11446c;

    /* renamed from: d, reason: collision with root package name */
    private String f11447d;

    l82() {
    }

    @Override // com.google.android.gms.internal.ads.j92
    public final j92 a(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Null activity");
        }
        this.f11444a = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.j92
    public final j92 b(u2.a0 a0Var) {
        this.f11445b = a0Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.j92
    public final j92 c(String str) {
        this.f11446c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.j92
    public final j92 d(String str) {
        this.f11447d = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.j92
    public final k92 e() {
        Activity activity = this.f11444a;
        if (activity != null) {
            return new m82(activity, this.f11445b, this.f11446c, this.f11447d, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
