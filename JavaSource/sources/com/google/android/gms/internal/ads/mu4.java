package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: MyApplication */
public final class mu4 implements sv4 {

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f12441d = new lu4();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f12442a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12443b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12444c;

    public mu4(byte[] bArr, int i7) {
        if (!nf4.a(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        fw4.a(bArr.length);
        this.f12442a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f12441d.get()).getBlockSize();
        this.f12444c = blockSize;
        if (i7 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f12443b = i7;
    }

    @Override // com.google.android.gms.internal.ads.sv4
    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i7 = this.f12443b;
        if (length < i7) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i7];
        System.arraycopy(bArr, 0, bArr2, 0, i7);
        int i8 = length - i7;
        byte[] bArr3 = new byte[i8];
        Cipher cipher = (Cipher) f12441d.get();
        byte[] bArr4 = new byte[this.f12444c];
        System.arraycopy(bArr2, 0, bArr4, 0, i7);
        cipher.init(2, this.f12442a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i7, i8, bArr3, 0) == i8) {
            return bArr3;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
