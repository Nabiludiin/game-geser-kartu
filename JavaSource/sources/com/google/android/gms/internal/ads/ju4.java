package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* compiled from: MyApplication */
public final class ju4 implements u84 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f10787a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f10788b = {0};

    private ju4(RSAPrivateCrtKey rSAPrivateCrtKey, is4 is4Var, is4 is4Var2, int i7, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!nf4.a(2)) {
            throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        fw4.c(rSAPrivateCrtKey.getModulus().bitLength());
        fw4.d(rSAPrivateCrtKey.getPublicExponent());
        ku4.c(is4Var);
        ku4.d(is4Var, is4Var2, i7);
    }

    public static u84 b(ms4 ms4Var) {
        Provider b8 = ku4.b();
        if (b8 == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", b8);
        ks4 d8 = ms4Var.d();
        return new ju4((RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(ms4Var.e().e(), d8.d(), ms4Var.h().b(z74.a()), ms4Var.f().b(z74.a()), ms4Var.g().b(z74.a()), ms4Var.i().b(z74.a()), ms4Var.j().b(z74.a()), ms4Var.k().b(z74.a()))), d8.f(), d8.g(), d8.h(), ms4Var.e().c().c(), d8.e().equals(js4.f10742d) ? f10788b : f10787a, b8);
    }

    @Override // com.google.android.gms.internal.ads.u84
    public final byte[] a(byte[] bArr) {
        throw null;
    }
}
