package com.google.android.gms.internal.ads;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;

/* compiled from: MyApplication */
final /* synthetic */ class kq4 implements kh4 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ kq4 f11207a = new kq4();

    private /* synthetic */ kq4() {
    }

    @Override // com.google.android.gms.internal.ads.kh4
    public final /* synthetic */ b84 a(s84 s84Var, Integer num) {
        eq4 eq4Var = (eq4) s84Var;
        int i7 = mq4.f12379g;
        ECParameterSpec a8 = eq4Var.d().a();
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) gv4.f9173f.b("EC");
        keyPairGenerator.initialize(a8);
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) generateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
        hq4 hq4Var = new hq4(null);
        hq4Var.a(eq4Var);
        hq4Var.c(num);
        hq4Var.b(eCPublicKey.getW());
        iq4 d8 = hq4Var.d();
        fq4 fq4Var = new fq4(null);
        fq4Var.a(d8);
        fq4Var.b(jw4.a(eCPrivateKey.getS(), z74.a()));
        return fq4Var.c();
    }
}
