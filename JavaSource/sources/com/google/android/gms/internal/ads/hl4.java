package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* compiled from: MyApplication */
public final class hl4 extends kl4 {

    /* renamed from: a, reason: collision with root package name */
    private final int f9571a;

    private hl4(int i7) {
        this.f9571a = i7;
    }

    public static hl4 b(int i7) {
        if (i7 == 16 || i7 == 32) {
            return new hl4(i7);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i7 * 8)));
    }

    @Override // com.google.android.gms.internal.ads.s84
    public final boolean a() {
        return false;
    }

    public final int c() {
        return this.f9571a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hl4) && ((hl4) obj).f9571a == this.f9571a;
    }

    public final int hashCode() {
        return Objects.hash(hl4.class, Integer.valueOf(this.f9571a));
    }

    public final String toString() {
        int i7 = this.f9571a;
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 34);
        sb.append("AesCmac PRF Parameters (");
        sb.append(i7);
        sb.append("-byte key)");
        return sb.toString();
    }
}
