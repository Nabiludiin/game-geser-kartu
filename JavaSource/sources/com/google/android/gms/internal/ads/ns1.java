package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class ns1 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f12880a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y50 f12881b;

    ns1(xs1 xs1Var, String str, y50 y50Var) {
        this.f12880a = str;
        this.f12881b = y50Var;
        Objects.requireNonNull(xs1Var);
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((mr0) obj).O0(this.f12880a, this.f12881b);
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
    }
}
