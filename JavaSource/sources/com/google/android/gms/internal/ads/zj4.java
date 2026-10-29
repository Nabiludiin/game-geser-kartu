package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: MyApplication */
public final class zj4 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f20210a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f20211b = null;

    /* renamed from: c, reason: collision with root package name */
    private ak4 f20212c = null;

    /* renamed from: d, reason: collision with root package name */
    private bk4 f20213d = bk4.f5843e;

    /* synthetic */ zj4(byte[] bArr) {
    }

    public final zj4 a(int i7) {
        this.f20210a = Integer.valueOf(i7);
        return this;
    }

    public final zj4 b(int i7) {
        this.f20211b = Integer.valueOf(i7);
        return this;
    }

    public final zj4 c(bk4 bk4Var) {
        this.f20213d = bk4Var;
        return this;
    }

    public final zj4 d(ak4 ak4Var) {
        this.f20212c = ak4Var;
        return this;
    }

    public final ck4 e() {
        Integer num = this.f20210a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f20211b == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f20212c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f20213d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f20210a));
        }
        Integer num2 = this.f20211b;
        int intValue = num2.intValue();
        ak4 ak4Var = this.f20212c;
        if (intValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (ak4Var == ak4.f5019b) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (ak4Var == ak4.f5020c) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (ak4Var == ak4.f5021d) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (ak4Var == ak4.f5022e) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (ak4Var != ak4.f5023f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new ck4(this.f20210a.intValue(), this.f20211b.intValue(), this.f20213d, this.f20212c, null);
    }
}
