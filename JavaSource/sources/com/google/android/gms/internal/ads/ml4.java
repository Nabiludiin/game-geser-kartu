package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: MyApplication */
public final class ml4 implements il4 {

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f12301d = new ll4();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f12302a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f12303b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f12304c;

    private ml4(byte[] bArr) {
        fw4.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f12302a = secretKeySpec;
        Cipher c8 = c();
        c8.init(1, secretKeySpec);
        byte[] a8 = vk4.a(c8.doFinal(new byte[16]));
        this.f12303b = a8;
        this.f12304c = vk4.a(a8);
    }

    public static il4 b(gl4 gl4Var) {
        return new ml4(gl4Var.d().c(z74.a()));
    }

    private static Cipher c() {
        if (nf4.a(1)) {
            return (Cipher) f12301d.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void d(byte[] bArr, byte[] bArr2, int i7, byte[] bArr3) {
        for (int i8 = 0; i8 < 16; i8++) {
            bArr3[i8] = (byte) (bArr[i8] ^ bArr2[i8 + i7]);
        }
    }

    @Override // com.google.android.gms.internal.ads.il4
    public final byte[] a(byte[] bArr, int i7) {
        byte[] b8;
        if (i7 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKey secretKey = this.f12302a;
        Cipher c8 = c();
        c8.init(1, secretKey);
        int length = bArr.length;
        int i8 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i9 = i8 - 1;
        int i10 = i9 * 16;
        if (i8 * 16 == length) {
            b8 = tu4.b(bArr, i10, this.f12303b, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, length);
            int length2 = copyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[length2] = Byte.MIN_VALUE;
            byte[] bArr2 = this.f12304c;
            if (copyOf.length != 16) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            b8 = tu4.b(copyOf, 0, bArr2, 0, 16);
        }
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[16];
        for (int i11 = 0; i11 < i9; i11++) {
            d(bArr3, bArr, i11 * 16, bArr4);
            if (c8.doFinal(bArr4, 0, 16, bArr3) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        d(bArr3, b8, 0, bArr4);
        if (c8.doFinal(bArr4, 0, 16, bArr3) == 16) {
            return i7 == 16 ? bArr3 : Arrays.copyOf(bArr3, i7);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
