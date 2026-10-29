package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* compiled from: MyApplication */
final class yv4 implements v84 {

    /* renamed from: a, reason: collision with root package name */
    private final RSAPublicKey f19830a;

    /* renamed from: b, reason: collision with root package name */
    private final qv4 f19831b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f19832c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f19833d;

    /* synthetic */ yv4(RSAPublicKey rSAPublicKey, qv4 qv4Var, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (of4.a()) {
            throw new GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        }
        fw4.b(qv4Var);
        fw4.c(rSAPublicKey.getModulus().bitLength());
        fw4.d(rSAPublicKey.getPublicExponent());
        this.f19830a = rSAPublicKey;
        this.f19831b = qv4Var;
        this.f19832c = bArr;
        this.f19833d = bArr2;
    }

    private final void b(byte[] bArr, byte[] bArr2) {
        byte[] a8;
        int i7;
        RSAPublicKey rSAPublicKey = this.f19830a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        if (bitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] b8 = uf4.b(bigInteger.modPow(publicExponent, modulus), bitLength);
        qv4 qv4Var = this.f19831b;
        fw4.b(qv4Var);
        MessageDigest messageDigest = (MessageDigest) gv4.f9172e.b(ew4.b(qv4Var));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f19833d;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] digest = messageDigest.digest();
        int ordinal = qv4Var.ordinal();
        int i8 = 2;
        if (ordinal == 2) {
            a8 = rv4.a("3031300d060960864801650304020105000420");
        } else if (ordinal == 3) {
            a8 = rv4.a("3041300d060960864801650304020205000430");
        } else {
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(qv4Var.toString()));
            }
            a8 = rv4.a("3051300d060960864801650304020305000440");
        }
        if (bitLength < a8.length + digest.length + 11) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr4 = new byte[bitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i9 = 0;
        while (true) {
            i7 = i8 + 1;
            if (i9 >= (bitLength - r5) - 3) {
                break;
            }
            bArr4[i8] = -1;
            i9++;
            i8 = i7;
        }
        bArr4[i8] = 0;
        int length = a8.length;
        System.arraycopy(a8, 0, bArr4, i7, length);
        System.arraycopy(digest, 0, bArr4, i7 + length, digest.length);
        if (!MessageDigest.isEqual(b8, bArr4)) {
            throw new GeneralSecurityException("invalid signature");
        }
    }

    @Override // com.google.android.gms.internal.ads.v84
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f19832c;
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
