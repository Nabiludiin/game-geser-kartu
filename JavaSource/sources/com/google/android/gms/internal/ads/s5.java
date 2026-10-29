package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class s5 implements ld {

    /* renamed from: a, reason: collision with root package name */
    public final int f15457a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15458b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15459c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15460d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15461e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15462f;

    public s5(int i7, String str, String str2, String str3, boolean z7, int i8) {
        boolean z8 = true;
        if (i8 != -1 && i8 <= 0) {
            z8 = false;
        }
        rx3.a(z8);
        this.f15457a = i7;
        this.f15458b = str;
        this.f15459c = str2;
        this.f15460d = str3;
        this.f15461e = z7;
        this.f15462f = i8;
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void a(lb lbVar) {
        String str = this.f15459c;
        if (str != null) {
            lbVar.R(str);
        }
        String str2 = this.f15458b;
        if (str2 != null) {
            lbVar.Q(str2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s5.class == obj.getClass()) {
            s5 s5Var = (s5) obj;
            if (this.f15457a == s5Var.f15457a && Objects.equals(this.f15458b, s5Var.f15458b) && Objects.equals(this.f15459c, s5Var.f15459c) && Objects.equals(this.f15460d, s5Var.f15460d) && this.f15461e == s5Var.f15461e && this.f15462f == s5Var.f15462f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f15458b;
        int hashCode = str != null ? str.hashCode() : 0;
        int i7 = this.f15457a;
        String str2 = this.f15459c;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i8 = ((i7 + 527) * 31) + hashCode;
        String str3 = this.f15460d;
        return (((((((i8 * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f15461e ? 1 : 0)) * 31) + this.f15462f;
    }

    public final String toString() {
        String str = this.f15459c;
        int length = String.valueOf(str).length();
        String str2 = this.f15458b;
        int length2 = String.valueOf(str2).length();
        int i7 = this.f15457a;
        int length3 = String.valueOf(i7).length();
        int i8 = this.f15462f;
        StringBuilder sb = new StringBuilder(length + 28 + length2 + 11 + length3 + 19 + String.valueOf(i8).length());
        sb.append("IcyHeaders: name=\"");
        sb.append(str);
        sb.append("\", genre=\"");
        sb.append(str2);
        sb.append("\", bitrate=");
        sb.append(i7);
        sb.append(", metadataInterval=");
        sb.append(i8);
        return sb.toString();
    }
}
