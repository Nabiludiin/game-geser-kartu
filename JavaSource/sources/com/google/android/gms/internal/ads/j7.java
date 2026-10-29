package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class j7 implements u3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10359a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10360b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10361c;

    public j7(int i7, long j7, int i8) {
        this.f10359a = i7;
        this.f10360b = j7;
        this.f10361c = i8;
    }

    public final String toString() {
        String U = hi2.U(this.f10359a);
        int length = U.length();
        long j7 = this.f10360b;
        int length2 = String.valueOf(j7).length();
        int i7 = this.f10361c;
        StringBuilder sb = new StringBuilder(length + 29 + length2 + 16 + String.valueOf(i7).length() + 1);
        sb.append("AtomSizeTooSmall{type=");
        sb.append(U);
        sb.append(", size=");
        sb.append(j7);
        sb.append(", minHeaderSize=");
        sb.append(i7);
        sb.append("}");
        return sb.toString();
    }
}
