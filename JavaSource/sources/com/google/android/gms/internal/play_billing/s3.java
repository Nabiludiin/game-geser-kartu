package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
final class s3 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f21733a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21734b;

    s3(Object obj, int i7) {
        this.f21733a = obj;
        this.f21734b = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj;
        return this.f21733a == s3Var.f21733a && this.f21734b == s3Var.f21734b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f21733a) * 65535) + this.f21734b;
    }
}
