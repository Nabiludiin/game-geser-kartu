package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: MyApplication */
public final class uu4 implements u74 {

    /* renamed from: a, reason: collision with root package name */
    private final pe4 f16991a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f16992b;

    private uu4(byte[] bArr, byte[] bArr2) {
        this.f16991a = new pe4(bArr);
        this.f16992b = bArr2;
    }

    public static u74 b(bb4 bb4Var) {
        return new uu4(bb4Var.e().c(z74.a()), bb4Var.c().c());
    }

    private final byte[] c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.f16991a.b(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    @Override // com.google.android.gms.internal.ads.u74
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f16992b;
        int length = bArr3.length;
        if (length == 0) {
            return c(bArr, bArr2);
        }
        if (ej4.e(bArr3, bArr)) {
            return c(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
