package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: MyApplication */
public final class xu4 implements v84 {

    /* renamed from: a, reason: collision with root package name */
    private final hw4 f19048a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f19049b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f19050c;

    private xu4(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!nf4.a(1)) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
        this.f19048a = hw4.a(bArr);
        this.f19049b = bArr2;
        this.f19050c = bArr3;
        cg4.d();
    }

    public static v84 b(vq4 vq4Var) {
        if (!nf4.a(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            return pt4.b(vq4Var);
        } catch (GeneralSecurityException unused) {
            return new xu4(vq4Var.e().c(), vq4Var.c().c(), vq4Var.f().c().equals(nq4.f12848d) ? new byte[]{0} : new byte[0]);
        }
    }

    private final void c(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 64) {
            throw new GeneralSecurityException(String.format("The length of the signature is not %s.", 64));
        }
        if (!cg4.c(bArr2, bArr, this.f19048a.c())) {
            throw new GeneralSecurityException("Signature check failed.");
        }
    }

    @Override // com.google.android.gms.internal.ads.v84
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f19049b;
        int length = bArr3.length;
        if (length == 0 && this.f19050c.length == 0) {
            c(bArr, bArr2);
        } else {
            if (!ej4.e(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            byte[] bArr4 = this.f19050c;
            if (bArr4.length != 0) {
                bArr2 = tu4.a(bArr2, bArr4);
            }
            c(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
