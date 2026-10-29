package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: MyApplication */
public final class w94 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f18125a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f18126b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f18127c = null;

    /* renamed from: d, reason: collision with root package name */
    private Integer f18128d = null;

    /* renamed from: e, reason: collision with root package name */
    private x94 f18129e = null;

    /* renamed from: f, reason: collision with root package name */
    private y94 f18130f = y94.f19432d;

    /* synthetic */ w94(byte[] bArr) {
    }

    public final w94 a(int i7) {
        if (i7 != 16 && i7 != 24 && i7 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i7)));
        }
        this.f18125a = Integer.valueOf(i7);
        return this;
    }

    public final w94 b(int i7) {
        if (i7 < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i7)));
        }
        this.f18126b = Integer.valueOf(i7);
        return this;
    }

    public final w94 c(int i7) {
        if (i7 < 12 || i7 > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i7)));
        }
        this.f18127c = Integer.valueOf(i7);
        return this;
    }

    public final w94 d(int i7) {
        if (i7 < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i7)));
        }
        this.f18128d = Integer.valueOf(i7);
        return this;
    }

    public final w94 e(y94 y94Var) {
        this.f18130f = y94Var;
        return this;
    }

    public final w94 f(x94 x94Var) {
        this.f18129e = x94Var;
        return this;
    }

    public final z94 g() {
        if (this.f18125a == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (this.f18126b == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (this.f18127c == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = this.f18128d;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f18129e == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f18130f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        int intValue = num.intValue();
        x94 x94Var = this.f18129e;
        if (x94Var == x94.f18677b) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (x94Var == x94.f18678c) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (x94Var == x94.f18679d) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (x94Var == x94.f18680e) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (x94Var != x94.f18681f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new z94(this.f18125a.intValue(), this.f18126b.intValue(), this.f18127c.intValue(), this.f18128d.intValue(), this.f18130f, this.f18129e, null);
    }
}
