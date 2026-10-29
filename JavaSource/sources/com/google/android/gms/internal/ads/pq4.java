package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: MyApplication */
public final class pq4 extends vs4 {

    /* renamed from: a, reason: collision with root package name */
    private final vq4 f14021a;

    /* renamed from: b, reason: collision with root package name */
    private final kw4 f14022b;

    private pq4(vq4 vq4Var, kw4 kw4Var) {
        this.f14021a = vq4Var;
        this.f14022b = kw4Var;
    }

    public static pq4 c(vq4 vq4Var, kw4 kw4Var) {
        if (kw4Var.d() == 32) {
            if (Arrays.equals(vq4Var.e().c(), cg4.a(cg4.b(kw4Var.c(z74.a()))))) {
                return new pq4(vq4Var, kw4Var);
            }
            throw new GeneralSecurityException("Ed25519 keys mismatch");
        }
        int d8 = kw4Var.d();
        StringBuilder sb = new StringBuilder(String.valueOf(d8).length() + 65);
        sb.append("Ed25519 key must be constructed with key of length 32 bytes, not ");
        sb.append(d8);
        throw new GeneralSecurityException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.b84
    public final /* synthetic */ s84 a() {
        return this.f14021a.f();
    }

    public final oq4 d() {
        return this.f14021a.f();
    }

    public final vq4 e() {
        return this.f14021a;
    }

    public final kw4 f() {
        return this.f14022b;
    }
}
