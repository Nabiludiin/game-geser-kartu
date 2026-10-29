package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;

/* compiled from: MyApplication */
final /* synthetic */ class ds4 implements kh4 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ ds4 f7289a = new ds4();

    private /* synthetic */ ds4() {
    }

    @Override // com.google.android.gms.internal.ads.kh4
    public final /* synthetic */ b84 a(s84 s84Var, Integer num) {
        xr4 xr4Var = (xr4) s84Var;
        int i7 = gs4.f9126g;
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) gv4.f9173f.b("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(xr4Var.c(), new BigInteger(1, xr4Var.d().toByteArray())));
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
        as4 as4Var = new as4(null);
        as4Var.a(xr4Var);
        as4Var.b(rSAPublicKey.getModulus());
        as4Var.c(num);
        bs4 d8 = as4Var.d();
        yr4 yr4Var = new yr4(null);
        yr4Var.a(d8);
        yr4Var.b(jw4.a(rSAPrivateCrtKey.getPrimeP(), z74.a()), jw4.a(rSAPrivateCrtKey.getPrimeQ(), z74.a()));
        yr4Var.c(jw4.a(rSAPrivateCrtKey.getPrivateExponent(), z74.a()));
        yr4Var.d(jw4.a(rSAPrivateCrtKey.getPrimeExponentP(), z74.a()), jw4.a(rSAPrivateCrtKey.getPrimeExponentQ(), z74.a()));
        yr4Var.e(jw4.a(rSAPrivateCrtKey.getCrtCoefficient(), z74.a()));
        return yr4Var.f();
    }
}
