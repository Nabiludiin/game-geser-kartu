package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: MyApplication */
public final class ya4 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f19448a = null;

    /* renamed from: b, reason: collision with root package name */
    private za4 f19449b = za4.f20107d;

    /* synthetic */ ya4(byte[] bArr) {
    }

    public final ya4 a(int i7) {
        if (i7 != 16 && i7 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i7)));
        }
        this.f19448a = Integer.valueOf(i7);
        return this;
    }

    public final ya4 b(za4 za4Var) {
        this.f19449b = za4Var;
        return this;
    }

    public final ab4 c() {
        Integer num = this.f19448a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f19449b != null) {
            return new ab4(num.intValue(), this.f19449b, null);
        }
        throw new GeneralSecurityException("Variant is not set");
    }
}
