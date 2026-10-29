package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: MyApplication */
public final class pt4 implements v84 {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f14099e = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};

    /* renamed from: a, reason: collision with root package name */
    private final PublicKey f14100a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f14101b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f14102c;

    /* renamed from: d, reason: collision with root package name */
    private final Provider f14103d;

    private pt4(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) {
        if (!nf4.a(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
        this.f14100a = KeyFactory.getInstance("Ed25519", provider).generatePublic(new X509EncodedKeySpec(tu4.a(f14099e, bArr)));
        this.f14101b = bArr2;
        this.f14102c = bArr3;
        this.f14103d = provider;
    }

    public static v84 b(vq4 vq4Var) {
        Provider a8 = vf4.a();
        if (a8 == null) {
            throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
        }
        if (nf4.a(1)) {
            return new pt4(vq4Var.e().c(), vq4Var.c().c(), vq4Var.f().c().equals(nq4.f12848d) ? new byte[]{0} : new byte[0], a8);
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.v84
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f14101b;
        int length = bArr3.length;
        if (bArr.length != length + 64) {
            throw new GeneralSecurityException(String.format("Invalid signature length: %s", 64));
        }
        if (!ej4.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Provider provider = this.f14103d;
        PublicKey publicKey = this.f14100a;
        Signature signature = Signature.getInstance("Ed25519", provider);
        signature.initVerify(publicKey);
        signature.update(bArr2);
        signature.update(this.f14102c);
        try {
            if (signature.verify(bArr, length, 64)) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Signature check failed.");
    }
}
