package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* compiled from: MyApplication */
public final class zt4 implements u84 {

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f20342g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f20343h = {0};

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f20344i = {1, 2, 3};

    /* renamed from: a, reason: collision with root package name */
    private final RSAPrivateCrtKey f20345a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20346b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f20347c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f20348d;

    /* renamed from: e, reason: collision with root package name */
    private final v84 f20349e;

    /* renamed from: f, reason: collision with root package name */
    Provider f20350f;

    private zt4(RSAPrivateCrtKey rSAPrivateCrtKey, vr4 vr4Var, byte[] bArr, byte[] bArr2, v84 v84Var, Provider provider) {
        if (!nf4.a(2)) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (vr4Var != vr4.f17734b && vr4Var != vr4.f17735c && vr4Var != vr4.f17736d) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(vr4Var)));
        }
        fw4.c(rSAPrivateCrtKey.getModulus().bitLength());
        fw4.d(rSAPrivateCrtKey.getPublicExponent());
        this.f20345a = rSAPrivateCrtKey;
        this.f20346b = au4.c(vr4Var);
        this.f20347c = bArr;
        this.f20348d = bArr2;
        this.f20349e = v84Var;
        this.f20350f = provider;
    }

    public static u84 b(zr4 zr4Var) {
        Provider b8 = au4.b();
        zt4 zt4Var = new zt4((RSAPrivateCrtKey) (b8 != null ? KeyFactory.getInstance("RSA", b8) : (KeyFactory) gv4.f9174g.b("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(zr4Var.e().e(), zr4Var.d().d(), zr4Var.h().b(z74.a()), zr4Var.f().b(z74.a()), zr4Var.g().b(z74.a()), zr4Var.i().b(z74.a()), zr4Var.j().b(z74.a()), zr4Var.k().b(z74.a()))), zr4Var.d().f(), zr4Var.e().c().c(), zr4Var.d().e().equals(wr4.f18394d) ? f20343h : f20342g, b8 != null ? au4.e(zr4Var.e(), b8) : zv4.b(zr4Var.e()), b8);
        zt4Var.a(f20344i);
        return zt4Var;
    }

    @Override // com.google.android.gms.internal.ads.u84
    public final byte[] a(byte[] bArr) {
        Provider provider = this.f20350f;
        Signature signature = provider != null ? Signature.getInstance(this.f20346b, provider) : (Signature) gv4.f9171d.b(this.f20346b);
        signature.initSign(this.f20345a);
        signature.update(bArr);
        byte[] bArr2 = this.f20348d;
        if (bArr2.length > 0) {
            signature.update(bArr2);
        }
        byte[] sign = signature.sign();
        byte[] bArr3 = this.f20347c;
        if (bArr3.length > 0) {
            sign = tu4.a(bArr3, sign);
        }
        try {
            this.f20349e.a(sign, bArr);
            return sign;
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException("RSA signature computation error", e8);
        }
    }
}
