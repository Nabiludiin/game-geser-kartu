package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: MyApplication */
public final class gw4 implements u74 {

    /* renamed from: a, reason: collision with root package name */
    private final se4 f9241a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f9242b;

    private gw4(byte[] bArr, byte[] bArr2) {
        this.f9241a = new se4(bArr);
        this.f9242b = bArr2;
    }

    public static u74 b(yc4 yc4Var) {
        return new gw4(yc4Var.e().c(z74.a()), yc4Var.c().c());
    }

    private final byte[] c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.f9241a.b(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    @Override // com.google.android.gms.internal.ads.u74
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f9242b;
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
