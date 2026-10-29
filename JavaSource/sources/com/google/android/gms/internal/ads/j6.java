package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class j6 extends d6 {

    /* renamed from: b, reason: collision with root package name */
    public final String f10349b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10350c;

    public j6(String str, String str2, String str3) {
        super(str);
        this.f10349b = str2;
        this.f10350c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j6.class == obj.getClass()) {
            j6 j6Var = (j6) obj;
            if (this.f6930a.equals(j6Var.f6930a) && Objects.equals(this.f10349b, j6Var.f10349b) && Objects.equals(this.f10350c, j6Var.f10350c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f6930a.hashCode() + 527;
        String str = this.f10349b;
        return (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.f10350c.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.d6
    public final String toString() {
        String str = this.f6930a;
        int length = String.valueOf(str).length();
        String str2 = this.f10350c;
        StringBuilder sb = new StringBuilder(length + 6 + str2.length());
        sb.append(str);
        sb.append(": url=");
        sb.append(str2);
        return sb.toString();
    }
}
