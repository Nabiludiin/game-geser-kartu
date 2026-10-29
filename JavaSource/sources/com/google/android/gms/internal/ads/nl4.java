package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: MyApplication */
public final class nl4 implements il4 {

    /* renamed from: a, reason: collision with root package name */
    private final Key f12800a;

    /* renamed from: b, reason: collision with root package name */
    private final Provider f12801b;

    private nl4(byte[] bArr, Provider provider) {
        if (!nf4.a(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
        }
        this.f12800a = new SecretKeySpec(bArr, "AES");
        this.f12801b = provider;
    }

    public static il4 b(gl4 gl4Var) {
        Provider a8 = vf4.a();
        if (a8 == null) {
            throw new GeneralSecurityException("Conscrypt not available");
        }
        Mac.getInstance("AESCMAC", a8);
        return new nl4(gl4Var.d().c(z74.a()), a8);
    }

    @Override // com.google.android.gms.internal.ads.il4
    public final byte[] a(byte[] bArr, int i7) {
        if (i7 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        Provider provider = this.f12801b;
        Key key = this.f12800a;
        Mac mac = Mac.getInstance("AESCMAC", provider);
        mac.init(key);
        byte[] doFinal = mac.doFinal(bArr);
        return i7 == doFinal.length ? doFinal : Arrays.copyOf(doFinal, i7);
    }
}
