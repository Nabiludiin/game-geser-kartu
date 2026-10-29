package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class x5 extends d6 {

    /* renamed from: b, reason: collision with root package name */
    public final String f18539b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18540c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18541d;

    public x5(String str, String str2, String str3) {
        super("COMM");
        this.f18539b = str;
        this.f18540c = str2;
        this.f18541d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x5.class == obj.getClass()) {
            x5 x5Var = (x5) obj;
            if (Objects.equals(this.f18540c, x5Var.f18540c) && Objects.equals(this.f18539b, x5Var.f18539b) && Objects.equals(this.f18541d, x5Var.f18541d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.f18539b.hashCode() + 527) * 31) + this.f18540c.hashCode();
        String str = this.f18541d;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.d6
    public final String toString() {
        String str = this.f6930a;
        int length = String.valueOf(str).length();
        String str2 = this.f18541d;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f18539b;
        int length3 = length + 11 + str3.length();
        String str4 = this.f18540c;
        StringBuilder sb = new StringBuilder(length3 + 14 + str4.length() + 7 + length2);
        sb.append(str);
        sb.append(": language=");
        sb.append(str3);
        sb.append(", description=");
        sb.append(str4);
        sb.append(", text=");
        sb.append(str2);
        return sb.toString();
    }
}
