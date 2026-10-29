package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: MyApplication */
public final class bf4 implements u74 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f5753a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f5754b;

    private bf4(byte[] bArr, byte[] bArr2) {
        if (!nf4.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!c()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f5753a = bArr;
        this.f5754b = bArr2;
    }

    public static u74 b(yc4 yc4Var) {
        return new bf4(yc4Var.e().c(z74.a()), yc4Var.c().c());
    }

    public static boolean c() {
        return fe4.c() != null;
    }

    @Override // com.google.android.gms.internal.ads.u74
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f5754b;
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length < length2 + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ej4.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, length2, bArr4, 0, 24);
        int[] e8 = le4.e(le4.d(this.f5753a), le4.d(bArr4));
        ByteBuffer order = ByteBuffer.allocate(e8.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(e8);
        SecretKeySpec secretKeySpec = new SecretKeySpec(order.array(), "ChaCha20");
        byte[] bArr5 = new byte[12];
        System.arraycopy(bArr4, 16, bArr5, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
        Cipher c8 = fe4.c();
        c8.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            c8.updateAAD(bArr2);
        }
        return c8.doFinal(bArr, length2 + 24, (length - length2) - 24);
    }
}
