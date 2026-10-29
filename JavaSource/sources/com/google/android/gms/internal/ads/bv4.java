package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: MyApplication */
public final class bv4 implements u74 {

    /* renamed from: a, reason: collision with root package name */
    private final sv4 f6023a;

    /* renamed from: b, reason: collision with root package name */
    private final r84 f6024b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6025c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f6026d;

    private bv4(sv4 sv4Var, r84 r84Var, int i7, byte[] bArr) {
        this.f6023a = sv4Var;
        this.f6024b = r84Var;
        this.f6025c = i7;
        this.f6026d = bArr;
    }

    public static u74 b(r94 r94Var) {
        mu4 mu4Var = new mu4(r94Var.e().c(z74.a()), r94Var.g().f());
        String valueOf = String.valueOf(r94Var.g().h());
        return new bv4(mu4Var, new xv4(new wv4("HMAC".concat(valueOf), new SecretKeySpec(r94Var.f().c(z74.a()), "HMAC")), r94Var.g().e()), r94Var.g().e(), r94Var.c().c());
    }

    @Override // com.google.android.gms.internal.ads.u74
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f6026d;
        int length = bArr.length;
        int i7 = this.f6025c;
        int length2 = bArr3.length;
        if (length < i7 + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!ej4.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i8 = length - i7;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, length2, i8);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i8, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (MessageDigest.isEqual(((xv4) this.f6024b).c(tu4.a(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), copyOfRange2)) {
            return this.f6023a.a(copyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
