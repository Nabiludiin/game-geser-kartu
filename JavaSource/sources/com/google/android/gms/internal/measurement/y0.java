package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
final class y0 extends f1 {

    /* renamed from: c, reason: collision with root package name */
    private final String f21444c;

    /* renamed from: d, reason: collision with root package name */
    private final int f21445d;

    /* renamed from: e, reason: collision with root package name */
    private final int f21446e;

    /* synthetic */ y0(String str, boolean z7, int i7, v0 v0Var, w0 w0Var, int i8, byte[] bArr) {
        this.f21444c = str;
        this.f21445d = i7;
        this.f21446e = i8;
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final String a() {
        return this.f21444c;
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final v0 c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final w0 d() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.f1
    public final int e() {
        return this.f21445d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            if (this.f21444c.equals(f1Var.a())) {
                f1Var.b();
                int i7 = this.f21445d;
                int e8 = f1Var.e();
                if (i7 == 0) {
                    throw null;
                }
                if (i7 == e8) {
                    f1Var.c();
                    f1Var.d();
                    int i8 = this.f21446e;
                    int f8 = f1Var.f();
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

    @Override // com.google.android.gms.internal.measurement.f1
    public final int f() {
        return this.f21446e;
    }

    public final int hashCode() {
        int hashCode = this.f21444c.hashCode() ^ 1000003;
        int i7 = this.f21445d;
        if (i7 == 0) {
            throw null;
        }
        int i8 = (((hashCode * 1000003) ^ 1237) * 1000003) ^ i7;
        if (this.f21446e != 0) {
            return (i8 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i7 = this.f21445d;
        String str = i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        String str2 = this.f21446e == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.f21444c;
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
