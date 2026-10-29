package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: MyApplication */
public final class yd4 implements u74 {

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f19525d = rv4.a("7a806c");

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f19526e = rv4.a("46bb91c3c5");

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f19527f = rv4.a("36864200e0eaf5284d884a0e77d31646");

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f19528g = rv4.a("bae8e37fc83441b16034566b");

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f19529h = rv4.a("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* renamed from: a, reason: collision with root package name */
    private final xd4 f19530a;

    /* renamed from: b, reason: collision with root package name */
    private final SecretKey f19531b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f19532c;

    private yd4(byte[] bArr, byte[] bArr2, xd4 xd4Var) {
        this.f19532c = bArr2;
        fw4.a(bArr.length);
        this.f19531b = new SecretKeySpec(bArr, "AES");
        this.f19530a = xd4Var;
    }

    public static boolean b(Cipher cipher) {
        try {
            byte[] bArr = f19528g;
            cipher.init(2, new SecretKeySpec(f19527f, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(f19526e);
            byte[] bArr2 = f19529h;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f19525d);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public static u74 c(ta4 ta4Var, xd4 xd4Var) {
        if (b((Cipher) xd4Var.a())) {
            return new yd4(ta4Var.e().c(z74.a()), ta4Var.c().c(), xd4Var);
        }
        throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
    }

    @Override // com.google.android.gms.internal.ads.u74
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.f19532c;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ej4.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) this.f19530a.a();
        cipher.init(2, this.f19531b, new GCMParameterSpec(128, bArr, length2, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
