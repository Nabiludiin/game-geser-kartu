package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: MyApplication */
public final class xc4 extends l94 {

    /* renamed from: a, reason: collision with root package name */
    private final wc4 f18747a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18748b;

    private xc4(wc4 wc4Var, int i7) {
        this.f18747a = wc4Var;
        this.f18748b = i7;
    }

    public static xc4 b(wc4 wc4Var, int i7) {
        if (i7 < 8 || i7 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new xc4(wc4Var, i7);
    }

    @Override // com.google.android.gms.internal.ads.s84
    public final boolean a() {
        return this.f18747a != wc4.f18199c;
    }

    public final wc4 c() {
        return this.f18747a;
    }

    public final int d() {
        return this.f18748b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xc4)) {
            return false;
        }
        xc4 xc4Var = (xc4) obj;
        return xc4Var.f18747a == this.f18747a && xc4Var.f18748b == this.f18748b;
    }

    public final int hashCode() {
        return Objects.hash(xc4.class, this.f18747a, Integer.valueOf(this.f18748b));
    }

    public final String toString() {
        String obj = this.f18747a.toString();
        int length = obj.length();
        int i7 = this.f18748b;
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(i7).length() + 1);
        sb.append("X-AES-GCM Parameters (variant: ");
        sb.append(obj);
        sb.append("salt_size_bytes: ");
        sb.append(i7);
        sb.append(")");
        return sb.toString();
    }
}
