package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: MyApplication */
public final class pu4 implements u74 {

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f14113a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f14114b;

    private pu4(byte[] bArr, hw4 hw4Var) {
        if (!nf4.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f14113a = rd4.b(bArr);
        this.f14114b = hw4Var.c();
    }

    public static u74 b(ja4 ja4Var) {
        ja4Var.f();
        ja4Var.f();
        return new pu4(ja4Var.e().c(z74.a()), ja4Var.c());
    }

    @Override // com.google.android.gms.internal.ads.u74
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f14114b;
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ej4.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec c8 = rd4.c(bArr, length2, 12);
        SecretKey secretKey = this.f14113a;
        Cipher a8 = rd4.a();
        a8.init(2, secretKey, c8);
        if (bArr2 != null && bArr2.length != 0) {
            a8.updateAAD(bArr2);
        }
        return a8.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
