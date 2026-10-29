package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;

/* compiled from: MyApplication */
final /* synthetic */ class qs4 implements kh4 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ qs4 f14612a = new qs4();

    private /* synthetic */ qs4() {
    }

    @Override // com.google.android.gms.internal.ads.kh4
    public final /* synthetic */ b84 a(s84 s84Var, Integer num) {
        ks4 ks4Var = (ks4) s84Var;
        int i7 = ss4.f15797g;
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) gv4.f9173f.b("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(ks4Var.c(), new BigInteger(1, ks4Var.d().toByteArray())));
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
        ns4 ns4Var = new ns4(null);
        ns4Var.a(ks4Var);
        ns4Var.b(rSAPublicKey.getModulus());
        ns4Var.c(num);
        os4 d8 = ns4Var.d();
        ls4 ls4Var = new ls4(null);
        ls4Var.a(d8);
        ls4Var.b(jw4.a(rSAPrivateCrtKey.getPrimeP(), z74.a()), jw4.a(rSAPrivateCrtKey.getPrimeQ(), z74.a()));
        ls4Var.c(jw4.a(rSAPrivateCrtKey.getPrivateExponent(), z74.a()));
        ls4Var.d(jw4.a(rSAPrivateCrtKey.getPrimeExponentP(), z74.a()), jw4.a(rSAPrivateCrtKey.getPrimeExponentQ(), z74.a()));
        ls4Var.e(jw4.a(rSAPrivateCrtKey.getCrtCoefficient(), z74.a()));
        return ls4Var.f();
    }
}
