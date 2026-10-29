package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class xr2 implements ld {

    /* renamed from: a, reason: collision with root package name */
    public final long f18980a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18981b;

    /* renamed from: c, reason: collision with root package name */
    public final long f18982c;

    public xr2(long j7, long j8, long j9) {
        this.f18980a = j7;
        this.f18981b = j8;
        this.f18982c = j9;
    }

    @Override // com.google.android.gms.internal.ads.ld
    public /* synthetic */ void a(lb lbVar) {
        kd.a(this, lbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr2)) {
            return false;
        }
        xr2 xr2Var = (xr2) obj;
        return this.f18980a == xr2Var.f18980a && this.f18981b == xr2Var.f18981b && this.f18982c == xr2Var.f18982c;
    }

    public final int hashCode() {
        return ((((androidx.privacysandbox.ads.adservices.topics.u.a(this.f18980a) + 527) * 31) + androidx.privacysandbox.ads.adservices.topics.u.a(this.f18981b)) * 31) + androidx.privacysandbox.ads.adservices.topics.u.a(this.f18982c);
    }

    public final String toString() {
        long j7 = this.f18980a;
        int length = String.valueOf(j7).length();
        long j8 = this.f18981b;
        int length2 = String.valueOf(j8).length();
        long j9 = this.f18982c;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j9).length());
        sb.append("Mp4Timestamp: creation time=");
        sb.append(j7);
        sb.append(", modification time=");
        sb.append(j8);
        sb.append(", timescale=");
        sb.append(j9);
        return sb.toString();
    }
}
