package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class r3 {

    /* renamed from: c, reason: collision with root package name */
    public static final r3 f14717c = new r3(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f14718a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14719b;

    public r3(long j7, long j8) {
        this.f14718a = j7;
        this.f14719b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r3.class == obj.getClass()) {
            r3 r3Var = (r3) obj;
            if (this.f14718a == r3Var.f14718a && this.f14719b == r3Var.f14719b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f14718a) * 31) + ((int) this.f14719b);
    }

    public final String toString() {
        long j7 = this.f14718a;
        int length = String.valueOf(j7).length();
        long j8 = this.f14719b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(j8).length() + 1);
        sb.append("[timeUs=");
        sb.append(j7);
        sb.append(", position=");
        sb.append(j8);
        sb.append("]");
        return sb.toString();
    }
}
