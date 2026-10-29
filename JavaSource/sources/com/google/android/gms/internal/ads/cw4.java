package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* compiled from: MyApplication */
final class cw4 implements v84 {

    /* renamed from: a, reason: collision with root package name */
    private final RSAPublicKey f6787a;

    /* renamed from: b, reason: collision with root package name */
    private final qv4 f6788b;

    /* renamed from: c, reason: collision with root package name */
    private final qv4 f6789c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6790d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f6791e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f6792f;

    /* synthetic */ cw4(RSAPublicKey rSAPublicKey, qv4 qv4Var, qv4 qv4Var2, int i7, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (of4.a()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        fw4.b(qv4Var);
        if (!qv4Var.equals(qv4Var2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        fw4.c(rSAPublicKey.getModulus().bitLength());
        fw4.d(rSAPublicKey.getPublicExponent());
        this.f6787a = rSAPublicKey;
        this.f6788b = qv4Var;
        this.f6789c = qv4Var2;
        this.f6790d = i7;
        this.f6791e = bArr;
        this.f6792f = bArr2;
    }

    private final void b(byte[] bArr, byte[] bArr2) {
        RSAPublicKey rSAPublicKey = this.f6787a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int bitLength = modulus.bitLength() + 7;
        int bitLength2 = modulus.bitLength() + 6;
        if (bitLength / 8 != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] b8 = uf4.b(bigInteger.modPow(publicExponent, modulus), bitLength2 / 8);
        int bitLength3 = modulus.bitLength() - 1;
        qv4 qv4Var = this.f6788b;
        fw4.b(qv4Var);
        gv4 gv4Var = gv4.f9172e;
        MessageDigest messageDigest = (MessageDigest) gv4Var.b(ew4.b(qv4Var));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f6792f;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] digest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = b8.length;
        int i7 = this.f6790d;
        if (length < digestLength + i7 + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (b8[length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i8 = length - digestLength;
        int i9 = i8 - 1;
        byte[] copyOf = Arrays.copyOf(b8, i9);
        int length2 = copyOf.length;
        byte[] copyOfRange = Arrays.copyOfRange(b8, length2, length2 + digestLength);
        int i10 = 0;
        while (true) {
            long j7 = (length * 8) - bitLength3;
            if (i10 < j7) {
                if (((copyOf[i10 / 8] >> (7 - (i10 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i10++;
            } else {
                MessageDigest messageDigest2 = (MessageDigest) gv4Var.b(ew4.b(this.f6789c));
                int digestLength2 = messageDigest2.getDigestLength();
                byte[] bArr4 = new byte[i9];
                int i11 = 0;
                int i12 = 0;
                while (i11 <= (i8 - 2) / digestLength2) {
                    messageDigest2.reset();
                    messageDigest2.update(copyOfRange);
                    int i13 = i7;
                    messageDigest2.update(uf4.b(BigInteger.valueOf(i11), 4));
                    byte[] digest2 = messageDigest2.digest();
                    int length3 = digest2.length;
                    System.arraycopy(digest2, 0, bArr4, i12, Math.min(length3, i9 - i12));
                    i12 += length3;
                    i11++;
                    i7 = i13;
                    messageDigest2 = messageDigest2;
                }
                int i14 = i7;
                byte[] bArr5 = new byte[i9];
                for (int i15 = 0; i15 < i9; i15++) {
                    bArr5[i15] = (byte) (bArr4[i15] ^ copyOf[i15]);
                }
                for (int i16 = 0; i16 <= j7; i16++) {
                    int i17 = i16 / 8;
                    bArr5[i17] = (byte) ((~(1 << (7 - (i16 % 8)))) & bArr5[i17]);
                }
                int i18 = 0;
                while (true) {
                    int i19 = (i8 - i14) - 2;
                    if (i18 >= i19) {
                        if (bArr5[i19] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr5, i9 - i14, i9);
                        int i20 = digestLength + 8;
                        byte[] bArr6 = new byte[i20 + i14];
                        System.arraycopy(digest, 0, bArr6, 8, digest.length);
                        System.arraycopy(copyOfRange2, 0, bArr6, i20, copyOfRange2.length);
                        if (!MessageDigest.isEqual(messageDigest.digest(bArr6), copyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr5[i18] != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i18++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.v84
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f6791e;
        int length = bArr3.length;
        if (length == 0) {
            b(bArr, bArr2);
        } else {
            if (!ej4.e(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
