package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: MyApplication */
public final class y5 extends d6 {

    /* renamed from: b, reason: collision with root package name */
    public final String f19375b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19376c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19377d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f19378e;

    public y5(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f19375b = str;
        this.f19376c = str2;
        this.f19377d = str3;
        this.f19378e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y5.class == obj.getClass()) {
            y5 y5Var = (y5) obj;
            if (Objects.equals(this.f19375b, y5Var.f19375b) && Objects.equals(this.f19376c, y5Var.f19376c) && Objects.equals(this.f19377d, y5Var.f19377d) && Arrays.equals(this.f19378e, y5Var.f19378e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f19375b;
        return (((((((str != null ? str.hashCode() : 0) + 527) * 31) + this.f19376c.hashCode()) * 31) + this.f19377d.hashCode()) * 31) + Arrays.hashCode(this.f19378e);
    }

    @Override // com.google.android.gms.internal.ads.d6
    public final String toString() {
        String str = this.f6930a;
        int length = String.valueOf(str).length();
        String str2 = this.f19375b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f19376c;
        int length3 = length + 11 + length2 + 11 + str3.length();
        String str4 = this.f19377d;
        StringBuilder sb = new StringBuilder(length3 + 14 + str4.length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", filename=");
        sb.append(str3);
        sb.append(", description=");
        sb.append(str4);
        return sb.toString();
    }
}
