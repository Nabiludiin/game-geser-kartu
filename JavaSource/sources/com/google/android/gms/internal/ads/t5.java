package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: MyApplication */
public final class t5 extends d6 {

    /* renamed from: b, reason: collision with root package name */
    public final String f15972b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15973c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15974d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f15975e;

    public t5(String str, String str2, int i7, byte[] bArr) {
        super("APIC");
        this.f15972b = str;
        this.f15973c = str2;
        this.f15974d = i7;
        this.f15975e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.d6, com.google.android.gms.internal.ads.ld
    public final void a(lb lbVar) {
        lbVar.C(this.f15975e, this.f15974d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t5.class == obj.getClass()) {
            t5 t5Var = (t5) obj;
            if (this.f15974d == t5Var.f15974d && Objects.equals(this.f15972b, t5Var.f15972b) && Objects.equals(this.f15973c, t5Var.f15973c) && Arrays.equals(this.f15975e, t5Var.f15975e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f15972b;
        int hashCode = str != null ? str.hashCode() : 0;
        int i7 = this.f15974d;
        String str2 = this.f15973c;
        return ((((((i7 + 527) * 31) + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f15975e);
    }

    @Override // com.google.android.gms.internal.ads.d6
    public final String toString() {
        String str = this.f6930a;
        int length = String.valueOf(str).length();
        String str2 = this.f15972b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f15973c;
        StringBuilder sb = new StringBuilder(length + 11 + length2 + 14 + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }
}
