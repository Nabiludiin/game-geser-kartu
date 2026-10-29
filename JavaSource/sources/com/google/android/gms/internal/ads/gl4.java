package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class gl4 extends jl4 {

    /* renamed from: a, reason: collision with root package name */
    private final hl4 f9021a;

    /* renamed from: b, reason: collision with root package name */
    private final kw4 f9022b;

    private gl4(hl4 hl4Var, kw4 kw4Var) {
        this.f9021a = hl4Var;
        this.f9022b = kw4Var;
    }

    public static gl4 c(hl4 hl4Var, kw4 kw4Var) {
        if (hl4Var.c() == kw4Var.d()) {
            return new gl4(hl4Var, kw4Var);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // com.google.android.gms.internal.ads.b84
    public final /* synthetic */ s84 a() {
        return this.f9021a;
    }

    public final kw4 d() {
        return this.f9022b;
    }
}
