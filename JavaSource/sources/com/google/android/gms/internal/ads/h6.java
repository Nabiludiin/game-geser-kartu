package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: MyApplication */
public final class h6 extends d6 {

    /* renamed from: b, reason: collision with root package name */
    public final String f9348b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9349c;

    public h6(String str, byte[] bArr) {
        super("PRIV");
        this.f9348b = str;
        this.f9349c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h6.class == obj.getClass()) {
            h6 h6Var = (h6) obj;
            if (Objects.equals(this.f9348b, h6Var.f9348b) && Arrays.equals(this.f9349c, h6Var.f9349c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f9348b.hashCode() + 527) * 31) + Arrays.hashCode(this.f9349c);
    }

    @Override // com.google.android.gms.internal.ads.d6
    public final String toString() {
        String str = this.f6930a;
        int length = String.valueOf(str).length();
        String str2 = this.f9348b;
        StringBuilder sb = new StringBuilder(length + 8 + str2.length());
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }
}
