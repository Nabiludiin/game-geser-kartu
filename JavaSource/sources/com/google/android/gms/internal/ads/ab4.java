package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class ab4 extends l94 {

    /* renamed from: a, reason: collision with root package name */
    private final int f4859a;

    /* renamed from: b, reason: collision with root package name */
    private final za4 f4860b;

    /* synthetic */ ab4(int i7, za4 za4Var, byte[] bArr) {
        this.f4859a = i7;
        this.f4860b = za4Var;
    }

    public static ya4 b() {
        return new ya4(null);
    }

    @Override // com.google.android.gms.internal.ads.s84
    public final boolean a() {
        return this.f4860b != za4.f20107d;
    }

    public final int c() {
        return this.f4859a;
    }

    public final za4 d() {
        return this.f4860b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ab4)) {
            return false;
        }
        ab4 ab4Var = (ab4) obj;
        return ab4Var.f4859a == this.f4859a && ab4Var.f4860b == this.f4860b;
    }

    public final int hashCode() {
        return Objects.hash(ab4.class, Integer.valueOf(this.f4859a), this.f4860b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4860b);
        int length = valueOf.length();
        int i7 = this.f4859a;
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(i7).length() + 10);
        sb.append("AesGcmSiv Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i7);
        sb.append("-byte key)");
        return sb.toString();
    }
}
