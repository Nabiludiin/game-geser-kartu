package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: MyApplication */
public final class ku4 implements v84 {

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f11257g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f11258h = {0};

    /* renamed from: a, reason: collision with root package name */
    private final RSAPublicKey f11259a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11260b;

    /* renamed from: c, reason: collision with root package name */
    private final PSSParameterSpec f11261c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f11262d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f11263e;

    /* renamed from: f, reason: collision with root package name */
    private final Provider f11264f;

    private ku4(RSAPublicKey rSAPublicKey, is4 is4Var, is4 is4Var2, int i7, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!nf4.a(2)) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!is4Var.equals(is4Var2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        fw4.c(rSAPublicKey.getModulus().bitLength());
        fw4.d(rSAPublicKey.getPublicExponent());
        this.f11259a = rSAPublicKey;
        this.f11260b = c(is4Var);
        this.f11261c = d(is4Var, is4Var2, i7);
        this.f11262d = bArr;
        this.f11263e = bArr2;
        this.f11264f = provider;
    }

    static Provider b() {
        if (!ej4.c() || ej4.d().intValue() > 23) {
            return vf4.a();
        }
        return null;
    }

    static String c(is4 is4Var) {
        if (is4Var == is4.f10178b) {
            return "SHA256withRSA/PSS";
        }
        if (is4Var == is4.f10179c) {
            return "SHA384withRSA/PSS";
        }
        if (is4Var == is4.f10180d) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: ".concat(String.valueOf(is4Var)));
    }

    static PSSParameterSpec d(is4 is4Var, is4 is4Var2, int i7) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        is4 is4Var3 = is4.f10178b;
        if (is4Var == is4Var3) {
            str = "SHA-256";
        } else if (is4Var == is4.f10179c) {
            str = "SHA-384";
        } else {
            if (is4Var != is4.f10180d) {
                throw new IllegalArgumentException("Unsupported MD hash: ".concat(String.valueOf(is4Var)));
            }
            str = "SHA-512";
        }
        if (is4Var2 == is4Var3) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (is4Var2 == is4.f10179c) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (is4Var2 != is4.f10180d) {
                throw new IllegalArgumentException("Unsupported MGF1 hash: ".concat(String.valueOf(is4Var2)));
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i7, 1);
    }

    public static v84 e(os4 os4Var) {
        Provider b8 = b();
        if (b8 == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA", b8).generatePublic(new RSAPublicKeySpec(os4Var.e(), os4Var.f().d()));
        ks4 f8 = os4Var.f();
        return new ku4(rSAPublicKey, f8.f(), f8.g(), f8.h(), os4Var.c().c(), os4Var.f().e().equals(js4.f10742d) ? f11258h : f11257g, b8);
    }

    @Override // com.google.android.gms.internal.ads.v84
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f11262d;
        if (!ej4.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        String str = this.f11260b;
        Provider provider = this.f11264f;
        RSAPublicKey rSAPublicKey = this.f11259a;
        Signature signature = Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.setParameter(this.f11261c);
        signature.update(bArr2);
        byte[] bArr4 = this.f11263e;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        int length = bArr.length;
        int length2 = bArr3.length;
        if (!signature.verify(bArr, length2, length - length2)) {
            throw new GeneralSecurityException("signature verification failed");
        }
    }
}
