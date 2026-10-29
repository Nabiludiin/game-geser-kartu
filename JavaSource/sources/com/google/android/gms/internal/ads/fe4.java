package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: MyApplication */
public final class fe4 implements u74 {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f8219c = rv4.a("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f8220d = rv4.a("070000004041424344454647");

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f8221e = rv4.a("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal f8222f = new ee4();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f8223a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f8224b;

    private fe4(byte[] bArr, byte[] bArr2) {
        if (!nf4.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!d()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f8223a = new SecretKeySpec(bArr, "ChaCha20");
        this.f8224b = bArr2;
    }

    public static u74 b(bb4 bb4Var) {
        return new fe4(bb4Var.e().c(z74.a()), bb4Var.c().c());
    }

    static Cipher c() {
        return (Cipher) f8222f.get();
    }

    public static boolean d() {
        return f8222f.get() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f(Cipher cipher) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f8220d);
            byte[] bArr = f8219c;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f8221e;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.u74
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f8224b;
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ej4.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, length2, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = (Cipher) f8222f.get();
        cipher.init(2, this.f8223a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
