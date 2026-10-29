package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: MyApplication */
public final class fa4 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f8113a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f8114b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f8115c = null;

    /* renamed from: d, reason: collision with root package name */
    private ga4 f8116d = ga4.f8750d;

    /* synthetic */ fa4(byte[] bArr) {
    }

    public final fa4 a(int i7) {
        if (i7 != 16 && i7 != 24 && i7 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i7)));
        }
        this.f8113a = Integer.valueOf(i7);
        return this;
    }

    public final fa4 b(int i7) {
        if (i7 != 12 && i7 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i7)));
        }
        this.f8114b = Integer.valueOf(i7);
        return this;
    }

    public final fa4 c(int i7) {
        this.f8115c = 16;
        return this;
    }

    public final fa4 d(ga4 ga4Var) {
        this.f8116d = ga4Var;
        return this;
    }

    public final ha4 e() {
        Integer num = this.f8113a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f8114b == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.f8116d == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.f8115c == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int intValue = num.intValue();
        int intValue2 = this.f8114b.intValue();
        this.f8115c.getClass();
        return new ha4(intValue, intValue2, 16, this.f8116d, null);
    }
}
