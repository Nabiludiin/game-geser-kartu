package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class wu4 implements u84 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f18436a;

    private wu4(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!nf4.a(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
        }
        byte[] b8 = cg4.b(bArr);
        this.f18436a = b8;
        cg4.a(b8);
    }

    public static u84 b(pq4 pq4Var) {
        if (!nf4.a(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            return ot4.b(pq4Var);
        } catch (GeneralSecurityException unused) {
            return new wu4(pq4Var.f().c(z74.a()), pq4Var.e().c().c(), pq4Var.d().c().equals(nq4.f12848d) ? new byte[]{0} : new byte[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.u84
    public final byte[] a(byte[] bArr) {
        throw null;
    }
}
