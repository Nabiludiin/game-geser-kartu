package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* compiled from: MyApplication */
public final class au4 implements v84 {

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f5292f = new byte[0];

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f5293g = {0};

    /* renamed from: a, reason: collision with root package name */
    private final RSAPublicKey f5294a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5295b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f5296c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f5297d;

    /* renamed from: e, reason: collision with root package name */
    private final Provider f5298e;

    private au4(RSAPublicKey rSAPublicKey, vr4 vr4Var, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!nf4.a(2)) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        fw4.c(rSAPublicKey.getModulus().bitLength());
        fw4.d(rSAPublicKey.getPublicExponent());
        this.f5294a = rSAPublicKey;
        this.f5295b = c(vr4Var);
        this.f5296c = bArr;
        this.f5297d = bArr2;
        this.f5298e = provider;
    }

    static Provider b() {
        if (ej4.c()) {
            ej4.d().getClass();
        }
        return vf4.a();
    }

    public static String c(vr4 vr4Var) {
        if (vr4Var == vr4.f17734b) {
            return "SHA256withRSA";
        }
        if (vr4Var == vr4.f17735c) {
            return "SHA384withRSA";
        }
        if (vr4Var == vr4.f17736d) {
            return "SHA512withRSA";
        }
        throw new GeneralSecurityException("unknown hash type");
    }

    public static v84 d(bs4 bs4Var) {
        Provider b8 = b();
        if (b8 != null) {
            return e(bs4Var, b8);
        }
        throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
    }

    public static v84 e(bs4 bs4Var, Provider provider) {
        return new au4((RSAPublicKey) KeyFactory.getInstance("RSA", provider).generatePublic(new RSAPublicKeySpec(bs4Var.e(), bs4Var.f().d())), bs4Var.f().f(), bs4Var.c().c(), bs4Var.f().e().equals(wr4.f18394d) ? f5293g : f5292f, provider);
    }

    @Override // com.google.android.gms.internal.ads.v84
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f5296c;
        if (!ej4.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        String str = this.f5295b;
        Provider provider = this.f5298e;
        RSAPublicKey rSAPublicKey = this.f5294a;
        Signature signature = Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.update(bArr2);
        byte[] bArr4 = this.f5297d;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            if (signature.verify(Arrays.copyOfRange(bArr, bArr3.length, bArr.length))) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Invalid signature");
    }
}
