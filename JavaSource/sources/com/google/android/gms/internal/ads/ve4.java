package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: MyApplication */
public final class ve4 implements u74 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f17588a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17589b;

    /* renamed from: c, reason: collision with root package name */
    private final il4 f17590c;

    private ve4(byte[] bArr, hw4 hw4Var, int i7) {
        this.f17590c = uv4.b(gl4.c(hl4.b(bArr.length), kw4.a(bArr, z74.a())));
        this.f17588a = hw4Var.c();
        this.f17589b = i7;
    }

    public static u74 b(sc4 sc4Var) {
        sc4Var.f();
        sc4Var.f();
        return new ve4(sc4Var.e().c(z74.a()), sc4Var.c(), sc4Var.f().d());
    }

    @Override // com.google.android.gms.internal.ads.u74
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f17588a;
        int i7 = this.f17589b;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i8 = i7 + length2;
        if (length < i8 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ej4.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, length2, i8);
        byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = copyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(copyOfRange, 0, bArr4, 4, length3);
        System.arraycopy(copyOfRange, 0, bArr5, 4, length3);
        il4 il4Var = this.f17590c;
        byte[] bArr6 = new byte[32];
        System.arraycopy(il4Var.a(bArr4, 16), 0, bArr6, 0, 16);
        System.arraycopy(il4Var.a(bArr5, 16), 0, bArr6, 16, 16);
        if (!nf4.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        SecretKey b8 = rd4.b(bArr6);
        int i9 = i8 + 12;
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i8, i9);
        if (copyOfRange2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (length < i8 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec c8 = rd4.c(copyOfRange2, 0, 12);
        Cipher a8 = rd4.a();
        a8.init(2, b8, c8);
        if (bArr2 != null && bArr2.length != 0) {
            a8.updateAAD(bArr2);
        }
        return a8.doFinal(bArr, i9, length - i9);
    }
}
