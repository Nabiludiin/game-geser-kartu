package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class ar5 implements qr5 {

    /* renamed from: a, reason: collision with root package name */
    private final int f5253a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ dr5 f5254b;

    public ar5(dr5 dr5Var, int i7) {
        Objects.requireNonNull(dr5Var);
        this.f5254b = dr5Var;
        this.f5253a = i7;
    }

    @Override // com.google.android.gms.internal.ads.qr5
    public final int a(hb5 hb5Var, wj4 wj4Var, int i7) {
        return this.f5254b.Y(this.f5253a, hb5Var, wj4Var, i7);
    }

    @Override // com.google.android.gms.internal.ads.qr5
    public final boolean b() {
        return this.f5254b.V(this.f5253a);
    }

    final /* synthetic */ int c() {
        return this.f5253a;
    }

    @Override // com.google.android.gms.internal.ads.qr5
    public final void d() {
        this.f5254b.W(this.f5253a);
    }

    @Override // com.google.android.gms.internal.ads.qr5
    public final int g(long j7) {
        return this.f5254b.Z(this.f5253a, j7);
    }
}
