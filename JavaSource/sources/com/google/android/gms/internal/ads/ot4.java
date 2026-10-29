package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.spec.PKCS8EncodedKeySpec;

/* compiled from: MyApplication */
public final class ot4 implements u84 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f13487a = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};

    private ot4(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) {
        if (!nf4.a(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
        }
        KeyFactory.getInstance("Ed25519", provider).generatePrivate(new PKCS8EncodedKeySpec(tu4.a(f13487a, bArr)));
    }

    public static u84 b(pq4 pq4Var) {
        Provider a8 = vf4.a();
        if (a8 != null) {
            return new ot4(pq4Var.f().c(z74.a()), pq4Var.e().c().c(), pq4Var.d().c().equals(nq4.f12848d) ? new byte[]{0} : new byte[0], a8);
        }
        throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
    }

    @Override // com.google.android.gms.internal.ads.u84
    public final byte[] a(byte[] bArr) {
        throw null;
    }
}
