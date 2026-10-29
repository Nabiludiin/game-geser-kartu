package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class qc3 extends nc3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f14374a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f14375b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14376c;

    /* renamed from: d, reason: collision with root package name */
    private final long f14377d;

    /* renamed from: e, reason: collision with root package name */
    private final long f14378e;

    /* synthetic */ qc3(String str, boolean z7, boolean z8, boolean z9, long j7, boolean z10, long j8, byte[] bArr) {
        this.f14374a = str;
        this.f14375b = z7;
        this.f14376c = z8;
        this.f14377d = j7;
        this.f14378e = j8;
    }

    @Override // com.google.android.gms.internal.ads.nc3
    public final String a() {
        return this.f14374a;
    }

    @Override // com.google.android.gms.internal.ads.nc3
    public final boolean b() {
        return this.f14375b;
    }

    @Override // com.google.android.gms.internal.ads.nc3
    public final boolean c() {
        return this.f14376c;
    }

    @Override // com.google.android.gms.internal.ads.nc3
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nc3
    public final long e() {
        return this.f14377d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nc3) {
            nc3 nc3Var = (nc3) obj;
            if (this.f14374a.equals(nc3Var.a()) && this.f14375b == nc3Var.b() && this.f14376c == nc3Var.c()) {
                nc3Var.d();
                if (this.f14377d == nc3Var.e()) {
                    nc3Var.f();
                    if (this.f14378e == nc3Var.g()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nc3
    public final boolean f() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nc3
    public final long g() {
        return this.f14378e;
    }

    public final int hashCode() {
        return ((((((((((((this.f14374a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f14375b ? 1237 : 1231)) * 1000003) ^ (true != this.f14376c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f14377d)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f14378e);
    }

    public final String toString() {
        boolean z7 = this.f14375b;
        int length = String.valueOf(z7).length();
        boolean z8 = this.f14376c;
        int length2 = String.valueOf(z8).length();
        long j7 = this.f14377d;
        int length3 = String.valueOf(j7).length();
        long j8 = this.f14378e;
        int length4 = String.valueOf(j8).length();
        String str = this.f14374a;
        StringBuilder sb = new StringBuilder(str.length() + 56 + length + 32 + length2 + 57 + length3 + 61 + length4 + 1);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z7);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z8);
        sb.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb.append(j7);
        sb.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        sb.append(j8);
        sb.append("}");
        return sb.toString();
    }
}
