package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* compiled from: MyApplication */
public final class et4 implements u84 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f7816a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f7817b = {0};

    private et4(ECPrivateKey eCPrivateKey, qv4 qv4Var, zu4 zu4Var, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!nf4.a(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        ew4.a(qv4Var);
    }

    public static u84 b(gq4 gq4Var) {
        Provider a8 = vf4.a();
        return new et4((ECPrivateKey) (a8 != null ? KeyFactory.getInstance("EC", a8) : (KeyFactory) gv4.f9174g.b("EC")).generatePrivate(new ECPrivateKeySpec(gq4Var.f().b(z74.a()), av4.b((yu4) gt4.f9137k.b(gq4Var.d().d())))), (qv4) gt4.f9135i.b(gq4Var.d().e()), (zu4) gt4.f9136j.b(gq4Var.d().c()), gq4Var.e().c().c(), gq4Var.d().f().equals(dq4.f7237d) ? f7817b : f7816a, a8);
    }

    @Override // com.google.android.gms.internal.ads.u84
    public final byte[] a(byte[] bArr) {
        throw null;
    }
}
