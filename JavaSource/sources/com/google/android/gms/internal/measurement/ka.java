package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
final class ka {

    /* renamed from: a, reason: collision with root package name */
    private final Object f21077a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21078b;

    ka(Object obj, int i7) {
        this.f21077a = obj;
        this.f21078b = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ka)) {
            return false;
        }
        ka kaVar = (ka) obj;
        return this.f21077a == kaVar.f21077a && this.f21078b == kaVar.f21078b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f21077a) * 65535) + this.f21078b;
    }
}
