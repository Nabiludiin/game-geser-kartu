package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class dz4 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f7362a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7363b;

    dz4(Object obj, int i7) {
        this.f7362a = obj;
        this.f7363b = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dz4)) {
            return false;
        }
        dz4 dz4Var = (dz4) obj;
        return this.f7362a == dz4Var.f7362a && this.f7363b == dz4Var.f7363b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f7362a) * 65535) + this.f7363b;
    }
}
