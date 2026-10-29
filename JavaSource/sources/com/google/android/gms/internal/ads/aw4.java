package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateCrtKey;

/* compiled from: MyApplication */
final class aw4 implements u84 {
    /* synthetic */ aw4(RSAPrivateCrtKey rSAPrivateCrtKey, qv4 qv4Var, qv4 qv4Var2, int i7, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (of4.a()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        fw4.b(qv4Var);
        if (!qv4Var.equals(qv4Var2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        fw4.c(rSAPrivateCrtKey.getModulus().bitLength());
        fw4.d(rSAPrivateCrtKey.getPublicExponent());
    }

    @Override // com.google.android.gms.internal.ads.u84
    public final byte[] a(byte[] bArr) {
        throw null;
    }
}
