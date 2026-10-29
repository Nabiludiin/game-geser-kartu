package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* compiled from: MyApplication */
final class u8 implements q3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v8 f16628a;

    /* synthetic */ u8(v8 v8Var, byte[] bArr) {
        Objects.requireNonNull(v8Var);
        this.f16628a = v8Var;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final long a() {
        v8 v8Var = this.f16628a;
        return v8Var.e().g(v8Var.f());
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final o3 c(long j7) {
        v8 v8Var = this.f16628a;
        long a8 = v8Var.a() + BigInteger.valueOf(v8Var.e().h(j7)).multiply(BigInteger.valueOf(v8Var.c() - v8Var.a())).divide(BigInteger.valueOf(v8Var.f())).longValue();
        String str = hi2.f9535a;
        r3 r3Var = new r3(j7, Math.max(v8Var.a(), Math.min(a8 - 30000, v8Var.c() - 1)));
        return new o3(r3Var, r3Var);
    }
}
