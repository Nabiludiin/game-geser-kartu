package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: MyApplication */
public final class pa4 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f13769a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f13770b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f13771c = null;

    /* renamed from: d, reason: collision with root package name */
    private qa4 f13772d = qa4.f14348d;

    /* synthetic */ pa4(byte[] bArr) {
    }

    public final pa4 a(int i7) {
        if (i7 != 16 && i7 != 24 && i7 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i7)));
        }
        this.f13769a = Integer.valueOf(i7);
        return this;
    }

    public final pa4 b(int i7) {
        this.f13770b = 12;
        return this;
    }

    public final pa4 c(int i7) {
        this.f13771c = 16;
        return this;
    }

    public final pa4 d(qa4 qa4Var) {
        this.f13772d = qa4Var;
        return this;
    }

    public final ra4 e() {
        Integer num = this.f13769a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f13772d == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.f13770b == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.f13771c == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int intValue = num.intValue();
        this.f13770b.getClass();
        this.f13771c.getClass();
        return new ra4(intValue, 12, 16, this.f13772d, null);
    }
}
