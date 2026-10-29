package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class f6 extends d6 {

    /* renamed from: b, reason: collision with root package name */
    public final String f8042b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8043c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8044d;

    public f6(String str, String str2, String str3) {
        super("----");
        this.f8042b = str;
        this.f8043c = str2;
        this.f8044d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f6.class == obj.getClass()) {
            f6 f6Var = (f6) obj;
            if (Objects.equals(this.f8043c, f6Var.f8043c) && Objects.equals(this.f8042b, f6Var.f8042b) && Objects.equals(this.f8044d, f6Var.f8044d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8042b.hashCode() + 527) * 31) + this.f8043c.hashCode()) * 31) + this.f8044d.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.d6
    public final String toString() {
        String str = this.f6930a;
        int length = String.valueOf(str).length();
        String str2 = this.f8042b;
        int length2 = length + 9 + str2.length();
        String str3 = this.f8043c;
        StringBuilder sb = new StringBuilder(length2 + 14 + str3.length());
        sb.append(str);
        sb.append(": domain=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }
}
