package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: MyApplication */
public final class lj4 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f11625a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f11626b = null;

    /* renamed from: c, reason: collision with root package name */
    private mj4 f11627c = mj4.f12281e;

    /* synthetic */ lj4(byte[] bArr) {
    }

    public final lj4 a(int i7) {
        if (i7 != 16 && i7 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i7 * 8)));
        }
        this.f11625a = Integer.valueOf(i7);
        return this;
    }

    public final lj4 b(int i7) {
        if (i7 >= 10 && i7 <= 16) {
            this.f11626b = Integer.valueOf(i7);
            return this;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 40);
        sb.append("Invalid tag size for AesCmacParameters: ");
        sb.append(i7);
        throw new GeneralSecurityException(sb.toString());
    }

    public final lj4 c(mj4 mj4Var) {
        this.f11627c = mj4Var;
        return this;
    }

    public final nj4 d() {
        Integer num = this.f11625a;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.f11626b == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.f11627c != null) {
            return new nj4(num.intValue(), this.f11626b.intValue(), this.f11627c, null);
        }
        throw new GeneralSecurityException("variant not set");
    }
}
