package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class k6 implements ld {

    /* renamed from: a, reason: collision with root package name */
    public final long f10896a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10897b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10898c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10899d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10900e;

    public k6(long j7, long j8, long j9, long j10, long j11) {
        this.f10896a = j7;
        this.f10897b = j8;
        this.f10898c = j9;
        this.f10899d = j10;
        this.f10900e = j11;
    }

    @Override // com.google.android.gms.internal.ads.ld
    public /* synthetic */ void a(lb lbVar) {
        kd.a(this, lbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            k6 k6Var = (k6) obj;
            if (this.f10896a == k6Var.f10896a && this.f10897b == k6Var.f10897b && this.f10898c == k6Var.f10898c && this.f10899d == k6Var.f10899d && this.f10900e == k6Var.f10900e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((androidx.privacysandbox.ads.adservices.topics.u.a(this.f10896a) + 527) * 31) + androidx.privacysandbox.ads.adservices.topics.u.a(this.f10897b)) * 31) + androidx.privacysandbox.ads.adservices.topics.u.a(this.f10898c)) * 31) + androidx.privacysandbox.ads.adservices.topics.u.a(this.f10899d)) * 31) + androidx.privacysandbox.ads.adservices.topics.u.a(this.f10900e);
    }

    public final String toString() {
        long j7 = this.f10896a;
        int length = String.valueOf(j7).length();
        long j8 = this.f10897b;
        int length2 = String.valueOf(j8).length();
        long j9 = this.f10898c;
        int length3 = String.valueOf(j9).length();
        long j10 = this.f10899d;
        int length4 = String.valueOf(j10).length();
        long j11 = this.f10900e;
        StringBuilder sb = new StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + String.valueOf(j11).length());
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(j7);
        sb.append(", photoSize=");
        sb.append(j8);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(j9);
        sb.append(", videoStartPosition=");
        sb.append(j10);
        sb.append(", videoSize=");
        sb.append(j11);
        return sb.toString();
    }
}
