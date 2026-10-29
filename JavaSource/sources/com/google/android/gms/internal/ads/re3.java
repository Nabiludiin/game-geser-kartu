package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class re3 extends ze3 {

    /* renamed from: b, reason: collision with root package name */
    private final String f14881b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14882c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14883d;

    /* synthetic */ re3(String str, boolean z7, int i7, oe3 oe3Var, pe3 pe3Var, int i8, byte[] bArr) {
        this.f14881b = str;
        this.f14882c = i7;
        this.f14883d = i8;
    }

    @Override // com.google.android.gms.internal.ads.ze3
    public final String a() {
        return this.f14881b;
    }

    @Override // com.google.android.gms.internal.ads.ze3
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ze3
    public final oe3 c() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ze3
    public final pe3 d() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ze3
    public final int e() {
        return this.f14882c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ze3) {
            ze3 ze3Var = (ze3) obj;
            if (this.f14881b.equals(ze3Var.a())) {
                ze3Var.b();
                int i7 = this.f14882c;
                int e8 = ze3Var.e();
                if (i7 == 0) {
                    throw null;
                }
                if (i7 == e8) {
                    ze3Var.c();
                    ze3Var.d();
                    int i8 = this.f14883d;
                    int f8 = ze3Var.f();
                    if (i8 == 0) {
                        throw null;
                    }
                    if (f8 == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ze3
    public final int f() {
        return this.f14883d;
    }

    public final int hashCode() {
        int hashCode = this.f14881b.hashCode() ^ 1000003;
        int i7 = this.f14882c;
        if (i7 == 0) {
            throw null;
        }
        int i8 = (((hashCode * 1000003) ^ 1237) * 1000003) ^ i7;
        if (this.f14883d != 0) {
            return (i8 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i7 = this.f14882c;
        String str = i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        String str2 = this.f14883d == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.f14881b;
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 73 + str.length() + 91 + str2.length() + 1);
        sb.append("FileComplianceOptions{fileOwner=");
        sb.append(str3);
        sb.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb.append(str);
        sb.append(", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
