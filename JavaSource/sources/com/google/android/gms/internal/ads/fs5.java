package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class fs5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f8466a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8467b;

    public fs5(long j7, long j8) {
        this.f8466a = j7;
        this.f8467b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs5)) {
            return false;
        }
        fs5 fs5Var = (fs5) obj;
        return this.f8466a == fs5Var.f8466a && this.f8467b == fs5Var.f8467b;
    }

    public final int hashCode() {
        return (((int) this.f8466a) * 31) + ((int) this.f8467b);
    }
}
