package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: MyApplication */
public final class ou4 implements u74 {

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadLocal f13502e = new nu4();

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f13503a;

    /* renamed from: b, reason: collision with root package name */
    private final il4 f13504b;

    /* renamed from: c, reason: collision with root package name */
    private final SecretKeySpec f13505c;

    /* renamed from: d, reason: collision with root package name */
    private final int f13506d;

    private ou4(byte[] bArr, int i7, byte[] bArr2) {
        if (!nf4.a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i7 != 12 && i7 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f13506d = i7;
        int length = bArr.length;
        fw4.a(length);
        this.f13505c = new SecretKeySpec(bArr, "AES");
        this.f13504b = uv4.b(gl4.c(hl4.b(length), kw4.a(bArr, z74.a())));
        this.f13503a = bArr2;
    }

    public static u74 b(ba4 ba4Var) {
        if (!nf4.a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        ba4Var.f();
        return new ou4(ba4Var.e().c(z74.a()), ba4Var.f().d(), ba4Var.c().c());
    }

    private final byte[] c(int i7, byte[] bArr, int i8, int i9) {
        byte[] bArr2 = new byte[i9 + 16];
        bArr2[15] = (byte) i7;
        System.arraycopy(bArr, i8, bArr2, 16, i9);
        return this.f13504b.a(bArr2, 16);
    }

    @Override // com.google.android.gms.internal.ads.u74
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f13503a;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i7 = this.f13506d;
        int i8 = ((length - length2) - i7) - 16;
        if (i8 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ej4.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] c8 = c(0, bArr, length2, i7);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] c9 = c(1, bArr2, 0, bArr2.length);
        byte[] c10 = c(2, bArr, length2 + i7, i8);
        int i9 = length - 16;
        byte b8 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            b8 = (byte) (b8 | (((bArr[i9 + i10] ^ c9[i10]) ^ c8[i10]) ^ c10[i10]));
        }
        if (b8 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) f13502e.get();
        cipher.init(1, this.f13505c, new IvParameterSpec(c8));
        return cipher.doFinal(bArr, bArr3.length + i7, i8);
    }
}
