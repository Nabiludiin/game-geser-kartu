package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class uy1 extends yy1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f17262a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17263b;

    /* synthetic */ uy1(long j7, int i7, byte[] bArr) {
        this.f17262a = j7;
        this.f17263b = i7;
    }

    @Override // com.google.android.gms.internal.ads.yy1
    public final long a() {
        return this.f17262a;
    }

    @Override // com.google.android.gms.internal.ads.yy1
    public final int b() {
        return this.f17263b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yy1) {
            yy1 yy1Var = (yy1) obj;
            if (this.f17262a == yy1Var.a() && this.f17263b == yy1Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f17262a;
        return ((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.f17263b;
    }

    public final String toString() {
        long j7 = this.f17262a;
        int length = String.valueOf(j7).length();
        int i7 = this.f17263b;
        StringBuilder sb = new StringBuilder(length + 34 + String.valueOf(i7).length() + 1);
        sb.append("OnDeviceStorageKey{id=");
        sb.append(j7);
        sb.append(", eventType=");
        sb.append(i7);
        sb.append("}");
        return sb.toString();
    }
}
